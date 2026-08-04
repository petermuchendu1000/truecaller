(function() {
    console.log("MRAID script loading started");

    /*MRAID declaration*/
    var mraid = window.mraid = {};

    /*constants*/
    var VERSION = "3.0"
    var SDK = "CrackleRtbSdk"

    var STATES = mraid.STATES = {
        "LOADING": "loading",
        "DEFAULT": "default",
        "EXPANDED": "expanded",
        "RESIZED": "resized",
        "HIDDEN": "hidden"
    };

    var PLACEMENT_TYPES = mraid.PLACEMENT_TYPES = {
        "INLINE": "inline",
        "INTERSTITIAL": "interstitial"
    };

    var RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION = mraid.RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION = {
        "TOP_LEFT": "top-left",
        "TOP_CENTER": "top-center",
        "TOP_RIGHT": "top-right",
        "CENTER": "center",
        "BOTTOM_LEFT": "bottom-left",
        "BOTTOM_CENTER": "bottom-center",
        "BOTTOM_RIGHT": "bottom-right"
    };

    var ORIENTATION_PROPERTIES_FORCE_ORIENTATION = mraid.ORIENTATION_PROPERTIES_FORCE_ORIENTATION = {
        "PORTRAIT": "portrait",
        "LANDSCAPE": "landscape",
        "NONE": "none"
    };

    var EVENTS = mraid.EVENTS = {
        "ERROR": "error",
        "READY": "ready",
        "SIZECHANGE": "sizeChange",
        "STATECHANGE": "stateChange",
        "EXPOSURECHANGE": "exposureChange",
        "AUDIOVOLUMECHANGE": "audioVolumeChange",
        "VIEWABLECHANGE": "viewableChange"
    };

    var SUPPORTED_FEATURES = mraid.SUPPORTED_FEATURES = {
        "SMS": "sms",
        "TEL": "tel",
        "CALENDAR": "calendar",
        "STOREPICTURE": "storePicture"
    };

    /*state*/
    var state = STATES.LOADING;
    var placementType = PLACEMENT_TYPES.INLINE;
    var supportedFeatures = {};
    var isViewable = false;
    var isExpandPropertiesSet = false;
    var isResizeReady = false;

    var exposure = {
        "exposedPercentage": 0.0,
        "visibleRectangle": {
            "x": 0,
            "y": 0,
            "width": 0,
            "height": 0
        },
        "occlusionRectangles": null
    };

    var volumePercentage = 0.0;

    var expandProperties = {
        "width": 0,
        "height": 0,
        "useCustomClose": false,
        "isModal": true
    };

    var orientationProperties = {
        "allowOrientationChange": true,
        "forceOrientation": ORIENTATION_PROPERTIES_FORCE_ORIENTATION.NONE
    };

    var currentAppOrientation = {
        "orientation": ORIENTATION_PROPERTIES_FORCE_ORIENTATION.PORTRAIT,
        "locked": false
    };

    var resizeProperties = {
        "width": 0,
        "height": 0,
        "customClosePosition": RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION.TOP_RIGHT,
        "offsetX": 0,
        "offsetY": 0,
        "allowOffscreen": true
    };

    var currentPosition = {
        "x": 0,
        "y": 0,
        "width": 0,
        "height": 0
    };

    var defaultPosition = {
        "x": 0,
        "y": 0,
        "width": 0,
        "height": 0
    };

    var maxSize = {
        "width": 0,
        "height": 0
    };

    var screenSize = {
        "width": 0,
        "height": 0
    };

    var listeners = {};
    window.listeners = listeners;

    var mraidEnv = {
        "version": VERSION,
        "sdk": SDK,
        "sdkVersion": null,
        "appId": null,
        "ifa": null,
        "limitAdTracking": false,
        "coppa": false
    };

    window.MRAID_ENV = mraidEnv;

    /*Official MRAID Interface for creatives*/
    mraid.addEventListener = function (event, listener) {
        if (!event || !listener) {
            mraid.fireErrorEvent("Both event and listener are required.", "addEventListener");
            return;
        }
        if (!contains(event, EVENTS)) {
            mraid.fireErrorEvent("Unknown MRAID event: " + event, "addEventListener");
            return;
        }
        var listenersForEvent = listeners[event] = listeners[event] || [];
        //check if listener is already registered
        for (var i = 0; i < listenersForEvent.length; i++) {
            var str1 = String(listener);
            var str2 = String(listenersForEvent[i]);
            if (listener === listenersForEvent[i] || str1 === str2) {
                return;
            }
        }
        listenersForEvent.push(listener);
    };

    mraid.createCalendarEvent = function (parameters) {
        if (supportedFeatures[mraid.SUPPORTED_FEATURES.CALENDAR]) {
            callNative("createCalendarEvent?eventJSON=" + JSON.stringify(parameters));
        }
    };

    mraid.close = function () {
        if (state === STATES.LOADING
            || (state === STATES.DEFAULT && placementType === PLACEMENT_TYPES.INLINE)
            || state === STATES.HIDDEN) {
            // do nothing
            return;
        }
        callNative("close");
    };

    mraid.expand = function (url) {
        // The only time it is valid to call expand is when the ad is
        // a banner currently in either default or resized state.
        if (placementType !== PLACEMENT_TYPES.INLINE
            || (state !== STATES.DEFAULT && state !== STATES.RESIZED)) {
            return;
        }
        if (url === undefined) {
            callNative("expand");
        } else {
            callNative("expand?url=" + encodeURIComponent(url));
        }
    };

    mraid.getCurrentPosition = function () {
        return currentPosition;
    };

    mraid.getDefaultPosition = function () {
        return defaultPosition;
    };

    mraid.getExpandProperties = function () {
        return expandProperties;
    };

    mraid.getMaxSize = function () {
        return maxSize;
    };

    mraid.getOrientationProperties = function () {
        return orientationProperties;
    };

    mraid.getCurrentAppOrientation = function () {
        return currentAppOrientation;
    };

    mraid.getPlacementType = function () {
        return placementType;
    };

    mraid.getResizeProperties = function () {
        return resizeProperties;
    };

    mraid.getScreenSize = function () {
        return screenSize;
    };

    mraid.getState = function () {
        return state;
    };

    mraid.getVersion = function () {
        return VERSION;
    };

    mraid.isViewable = function () {
        return isViewable;
    };

    mraid.open = function (url) {
        callNative("open?url=" + encodeURIComponent(url));
    };

    mraid.playVideo = function (url) {
        callNative("playVideo?url=" + encodeURIComponent(url));
    };

    mraid.removeEventListener = function (event, listener) {
        if (!event) {
            mraid.fireErrorEvent("Event is required.", "removeEventListener");
            return;
        }
        if (!contains(event, EVENTS)) {
            mraid.fireErrorEvent("Unknown MRAID event: " + event, "removeEventListener");
            return;
        }
        if (listeners.hasOwnProperty(event)) {
            if (listener) {
                var listenersForEvent = listeners[event];
                // try to find the given listener
                var len = listenersForEvent.length;
                for (var i = 0; i < len; i++) {
                    var registeredListener = listenersForEvent[i];
                    var str1 = String(listener);
                    var str2 = String(registeredListener);
                    if (listener === registeredListener || str1 === str2) {
                        listenersForEvent.splice(i, 1);
                        break;
                    }
                }
                if (listenersForEvent.length === 0) {
                    delete listeners[event];
                }
            } else {
                // no listener to remove was provided, so remove all listeners
                // for given event
                delete listeners[event];
            }
        }
    };

    mraid.resize = function () {
        //Only valid to call when a banner ad is in default or resized state
        if (placementType === PLACEMENT_TYPES.INTERSTITIAL || state === STATES.LOADING || state === STATES.HIDDEN) {
            // do nothing
            return;
        }
        if (state === STATES.EXPANDED) {
            mraid.fireErrorEvent("mraid.resize called when ad is in expanded state", "mraid.resize");
            return;
        }
        if (!isResizeReady) {
            mraid.fireErrorEvent("mraid.resize is not ready to be called", "mraid.resize");
            return;
        }
        callNative("resize");
    };

    mraid.setExpandProperties = function (properties) {
        if (!validate(properties, "setExpandProperties")) {
            return;
        }
        var oldUseCustomClose = expandProperties.useCustomClose;
        // expandProperties contains 3 read-write properties: width, height, and useCustomClose;
        // the isModal property is read-only
        var rwProps = ["width", "height", "useCustomClose"];
        for (var i = 0; i < rwProps.length; i++) {
            var propname = rwProps[i];
            if (properties.hasOwnProperty(propname)) {
                expandProperties[propname] = properties[propname];
            }
        }
        // In MRAID v2.0, all expanded ads by definition cover the entire screen,
        // so the only property that the native side has to know about is useCustomClose.
        // (That is, the width and height properties are not needed by the native code.)
        if (expandProperties.useCustomClose !== oldUseCustomClose) {
            callNative("useCustomClose?useCustomClose=" + expandProperties.useCustomClose);
        }
        isExpandPropertiesSet = true;
    };

    mraid.setOrientationProperties = function (properties) {

        if (!validate(properties, "setOrientationProperties")) {
            return;
        }

        var newOrientationProperties = {};
        newOrientationProperties.allowOrientationChange = orientationProperties.allowOrientationChange,
            newOrientationProperties.forceOrientation = orientationProperties.forceOrientation;

        // orientationProperties contains 2 read-write properties:
        // allowOrientationChange and forceOrientation
        var rwProps = ["allowOrientationChange", "forceOrientation"];
        for (var i = 0; i < rwProps.length; i++) {
            var propname = rwProps[i];
            if (properties.hasOwnProperty(propname)) {
                newOrientationProperties[propname] = properties[propname];
            }
        }

        // Setting allowOrientationChange to true while setting forceOrientation
        // to either portrait or landscape
        // is considered an error condition.
        if (newOrientationProperties.allowOrientationChange
            && newOrientationProperties.forceOrientation !== mraid.ORIENTATION_PROPERTIES_FORCE_ORIENTATION.NONE) {
            mraid.fireErrorEvent(
                "allowOrientationChange is true but forceOrientation is "
                + newOrientationProperties.forceOrientation,
                "setOrientationProperties");
            return;
        }

        orientationProperties.allowOrientationChange = newOrientationProperties.allowOrientationChange;
        orientationProperties.forceOrientation = newOrientationProperties.forceOrientation;

        var params = "allowOrientationChange="
            + orientationProperties.allowOrientationChange
            + "&forceOrientation=" + orientationProperties.forceOrientation;

        callNative("setOrientationProperties?" + params);
    };

    mraid.setResizeProperties = function (properties) {
        isResizeReady = false;

        // resizeProperties contains 6 read-write properties:
        // width, height, offsetX, offsetY, customClosePosition, allowOffscreen

        // The properties object passed into this function must contain width, height, offsetX, offsetY.
        // The remaining two properties are optional.
        var requiredProps = ["width", "height", "offsetX", "offsetY"];
        for (var i = 0; i < requiredProps.length; i++) {
            var propname = requiredProps[i];
            if (!properties.hasOwnProperty(propname)) {
                mraid.fireErrorEvent(
                    "required property " + propname + " is missing",
                    "mraid.setResizeProperties");
                return;
            }
        }

        if (!validate(properties, "setResizeProperties")) {
            mraid.fireErrorEvent("failed validation", "mraid.setResizeProperties");
            return;
        }

        var adjustments = {"x": 0, "y": 0};

        var allowOffscreen = properties.hasOwnProperty("allowOffscreen") ? properties.allowOffscreen : resizeProperties.allowOffscreen;
        if (!allowOffscreen) {
            if (properties.width > maxSize.width || properties.height > maxSize.height) {
                mraid.fireErrorEvent("resize width or height is greater than the maxSize width or height", "mraid.setResizeProperties");
                return;
            }
            adjustments = fitResizeViewOnScreen(properties);
        } else if (!isCloseRegionOnScreen(properties)) {
            mraid.fireErrorEvent("close event region will not appear entirely onscreen", "mraid.setResizeProperties");
            return;
        }

        var rwProps = ["width", "height", "offsetX", "offsetY", "customClosePosition", "allowOffscreen"];
        for (var i = 0; i < rwProps.length; i++) {
            var propname = rwProps[i];
            if (properties.hasOwnProperty(propname)) {
                resizeProperties[propname] = properties[propname];
            }
        }

        var params =
            "width=" + resizeProperties.width +
            "&height=" + resizeProperties.height +
            "&offsetX=" + (resizeProperties.offsetX + adjustments.x) +
            "&offsetY=" + (resizeProperties.offsetY + adjustments.y) +
            "&customClosePosition=" + resizeProperties.customClosePosition +
            "&allowOffscreen=" + resizeProperties.allowOffscreen;

        callNative("setResizeProperties?" + params);
        isResizeReady = true;
    };

    mraid.storePicture = function (url) {
        if (supportedFeatures[mraid.SUPPORTED_FEATURES.STOREPICTURE]) {
            callNative("storePicture?url=" + encodeURIComponent(url));
        }
    };

    mraid.supports = function (feature) {
        var retval = supportedFeatures[feature];
        if (typeof retval === "undefined") {
            retval = false;
        }
        return retval;
    };

    mraid.useCustomClose = function (isCustomClose) {
        if (expandProperties.useCustomClose !== isCustomClose) {
            expandProperties.useCustomClose = isCustomClose;
            callNative("useCustomClose?useCustomClose="
                + expandProperties.useCustomClose);
        }
    };

    mraid.unload = function () {
    };

    mraid.initVpaid = function (vpaidObject) {
        vpaid = vpaidObject;
    };

    /*Bridge interface for SDK*/
    mraid.setCurrentPosition = function (x, y, width, height) {

        var previousSize = {};
        previousSize.width = currentPosition.width;
        previousSize.height = currentPosition.height;

        currentPosition.x = x;
        currentPosition.y = y;
        currentPosition.width = width;
        currentPosition.height = height;

        if (width !== previousSize.width || height !== previousSize.height) {
            mraid.fireSizeChangeEvent(width, height);
        }
    };

    mraid.setDefaultPosition = function (x, y, width, height) {
        defaultPosition.x = x;
        defaultPosition.y = y;
        defaultPosition.width = width;
        defaultPosition.height = height;
    };

    mraid.setExpandSize = function (width, height) {
        expandProperties.width = width;
        expandProperties.height = height;
    };

    mraid.setMaxSize = function (width, height) {
        maxSize.width = width;
        maxSize.height = height;
    };

    mraid.setPlacementType = function (pt) {
        placementType = pt;
    };

    mraid.setScreenSize = function (width, height) {
        screenSize.width = width;
        screenSize.height = height;
        if (!isExpandPropertiesSet) {
            expandProperties.width = width;
            expandProperties.height = height;
        }
    };

    mraid.setSupports = function (feature, supported) {
        supportedFeatures[feature] = supported;
    };

    mraid.setSdkVersion = function (sdkVersion) {
        if (sdkVersion && sdkVersion !== "") {
            mraidEnv.sdkVersion = sdkVersion;
        }
    };

    mraid.setAppId = function (bundleName) {
        if (bundleName && bundleName !== "") {
            mraidEnv.appId = bundleName;
        }
    };

    mraid.setIfa = function (ifa) {
        if (ifa && ifa !== "") {
            mraidEnv.ifa = ifa;
        }
    };

    mraid.setLimitAdTracking = function (limitAdTracking) {
        mraidEnv.limitAdTracking = limitAdTracking;
    };

    mraid.setCoppa = function (coppa) {
        mraidEnv.coppa = coppa;
    };

    mraid.setCurrentAppOrientation = function (newAppOrientation) {
        if (newAppOrientation) {
            currentAppOrientation = newAppOrientation;
        }
    };

    //methods to fire event
    mraid.fireErrorEvent = function (message, action) {
        fireEvent(mraid.EVENTS.ERROR, message, action);
    };

    mraid.fireReadyEvent = function () {
        fireEvent(mraid.EVENTS.READY);
    };

    mraid.fireSizeChangeEvent = function (width, height) {
        if (state !== mraid.STATES.LOADING) {
            fireEvent(mraid.EVENTS.SIZECHANGE, width, height);
        }
    };

    mraid.fireStateChangeEvent = function (newState) {
        if (state !== newState) {
            state = newState;
            fireEvent(mraid.EVENTS.STATECHANGE, state);
        }
    };

    mraid.fireExposureChangeEvent = function (exposedPercentage, visibleRectangle, occlusionRectangles) {
        if (state !== mraid.STATES.LOADING) {
            exposure.exposedPercentage = exposedPercentage;
            exposure.visibleRectangle = visibleRectangle;
            if (occlusionRectangles) {
                if (exposure.occlusionRectangles) {
                    for (var i = 0; i < occlusionRectangles.length; i++) {
                        exposure.occlusionRectangles.push(occlusionRectangles[i]);
                    }
                } else {
                    exposure.occlusionRectangles = occlusionRectangles
                }
            } else {
                exposure.occlusionRectangles = null
            }

            fireEvent(mraid.EVENTS.EXPOSURECHANGE, exposedPercentage, visibleRectangle, occlusionRectangles);
            if (exposedPercentage > 0.0) {
                isViewable = true;
                fireEvent(mraid.EVENTS.VIEWABLECHANGE, isViewable);
            } else {
                isViewable = false;
                fireEvent(mraid.EVENTS.VIEWABLECHANGE, isViewable);
            }
        }

    };

    mraid.fireAudioVolumeChangeEvent = function (newVolumePercentage) {
        if (volumePercentage !== newVolumePercentage) {
            volumePercentage = newVolumePercentage;
            fireEvent(mraid.EVENTS.AUDIOVOLUMECHANGE, volumePercentage);
        }
    };

    mraid.fireViewableChangeEvent = function (newIsViewable) {
        if (isViewable !== newIsViewable) {
            isViewable = newIsViewable;
            fireEvent(mraid.EVENTS.VIEWABLECHANGE, isViewable);
        }
    };

    /*internal helper methods*/
    function callNative(command) {
        var iframe = document.createElement("IFRAME");
        iframe.setAttribute("src", "mraid://" + command);
        document.documentElement.appendChild(iframe);
        iframe.parentNode.removeChild(iframe);
        iframe = null;
    };

    function fireEvent(event) {
        var args = Array.prototype.slice.call(arguments);
        args.shift();
        var eventListeners = (listeners[event] || []).slice(0);
        if (eventListeners) {
            for (var i = 0; i < eventListeners.length; i++) {
                eventListeners[i].apply(null, args);
            }
        }
    };

    function contains(value, array) {
        for (var i in array) {
            if (array[i] === value) {
                return true;
            }
        }
        return false;
    };

    function validate(properties, action) {
        var retval = true;
        var validators = allValidators[action];
        for (var prop in properties) {
            var validator = validators[prop];
            var value = properties[prop];
            if (validator && !validator(value)) {
                mraid.fireErrorEvent("Value of property " + prop + " (" + value + ") is invalid", "mraid." + action);
                retval = false;
            }
        }
        return retval;
    };

    var allValidators = {
        "setExpandProperties": {
            "width": function (width) {
                return !isNaN(width);
            },
            "height": function (height) {
                return !isNaN(height);
            },
            "useCustomClose": function (useCustomClose) {
                return (typeof useCustomClose === "boolean");
            }
        },
        "setOrientationProperties": {
            "allowOrientationChange": function (allowOrientationChange) {
                return (typeof allowOrientationChange === "boolean");
            },
            "forceOrientation": function (forceOrientation) {
                var validValues = ["portrait", "landscape", "none"];
                return (typeof forceOrientation === "string" && validValues.indexOf(forceOrientation) !== -1);
            }
        },
        "setResizeProperties": {
            "width": function (width) {
                return !isNaN(width) && 50 <= width;
            },
            "height": function (height) {
                return !isNaN(height) && 50 <= height;
            },
            "offsetX": function (offsetX) {
                return !isNaN(offsetX);
            },
            "offsetY": function (offsetY) {
                return !isNaN(offsetY);
            },
            "customClosePosition": function (customClosePosition) {
                var validPositions = ["top-left", "top-center", "top-right",
                    "center",
                    "bottom-left", "bottom-center", "bottom-right"];
                return (typeof customClosePosition === "string" && validPositions.indexOf(customClosePosition) !== -1);
            },
            "allowOffscreen": function (allowOffscreen) {
                return (typeof allowOffscreen === "boolean");
            }
        }
    };

    function isCloseRegionOnScreen(properties) {
        var resizeRect = {};
        resizeRect.x = defaultPosition.x + properties.offsetX;
        resizeRect.y = defaultPosition.y + properties.offsetY;
        resizeRect.width = properties.width;
        resizeRect.height = properties.height;

        var customClosePosition = properties.hasOwnProperty("customClosePosition") ?
            properties.customClosePosition : resizeProperties.customClosePosition;

        var closeRect = {"width": 50, "height": 50};

        if (customClosePosition.search("left") !== -1) {
            closeRect.x = resizeRect.x;
        } else if (customClosePosition.search("center") !== -1) {
            closeRect.x = resizeRect.x + (resizeRect.width / 2) - 25;
        } else if (customClosePosition.search("right") !== -1) {
            closeRect.x = resizeRect.x + resizeRect.width - 50;
        }

        if (customClosePosition.search("top") !== -1) {
            closeRect.y = resizeRect.y;
        } else if (customClosePosition === "center") {
            closeRect.y = resizeRect.y + (resizeRect.height / 2) - 25;
        } else if (customClosePosition.search("bottom") !== -1) {
            closeRect.y = resizeRect.y + resizeRect.height - 50;
        }

        var maxRect = {"x": 0, "y": 0};
        maxRect.width = maxSize.width;
        maxRect.height = maxSize.height;

        return isRectContained(maxRect, closeRect);
    }

    function fitResizeViewOnScreen(properties) {
        var resizeRect = {};
        resizeRect.x = defaultPosition.x + properties.offsetX;
        resizeRect.y = defaultPosition.y + properties.offsetY;
        resizeRect.width = properties.width;
        resizeRect.height = properties.height;

        var maxRect = {"x": 0, "y": 0};
        maxRect.width = maxSize.width;
        maxRect.height = maxSize.height;

        var adjustments = {"x": 0, "y": 0};

        if (isRectContained(maxRect, resizeRect)) {
            return adjustments;
        }

        if (resizeRect.x < maxRect.x) {
            adjustments.x = maxRect.x - resizeRect.x;
        } else if ((resizeRect.x + resizeRect.width) > (maxRect.x + maxRect.width)) {
            adjustments.x = (maxRect.x + maxRect.width) - (resizeRect.x + resizeRect.width);
        }

        if (resizeRect.y < maxRect.y) {
            adjustments.y = maxRect.y - resizeRect.y;
        } else if ((resizeRect.y + resizeRect.height) > (maxRect.y + maxRect.height)) {
            adjustments.y = (maxRect.y + maxRect.height) - (resizeRect.y + resizeRect.height);
        }

        resizeRect.x = defaultPosition.x + properties.offsetX + adjustments.x;
        resizeRect.y = defaultPosition.y + properties.offsetY + adjustments.y;

        return adjustments;
    }

    function isRectContained(containingRect, containedRect) {
        return (containedRect.x >= containingRect.x &&
            (containedRect.x + containedRect.width) <= (containingRect.x + containingRect.width) &&
            containedRect.y >= containingRect.y &&
            (containedRect.y + containedRect.height) <= (containingRect.y + containingRect.height));
    }

    console.log("MRAID script is loaded");

})();