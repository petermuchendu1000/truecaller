(function() {
    var mraid = window.mraid = {};
    mraid.util = {};
    var listeners = [];
    listeners['ready'] = [];
    listeners['error'] = [];
    listeners['stateChange'] = [];
    listeners['exposureChange'] = [];
    listeners['audioVolumeChange'] = [];
    var state = 'loading';

    var mraid_enable_called = false;
    var page_finished = false;

    var screen_size = {};
    var max_size = {};
    var default_position = {};
    var current_position = {};

    var expand_properties = {
        width: -1,
        height: -1,
        useCustomClose: false,
        isModal: true
    };
    var orientation_properties = {
        allowOrientationChange: true,
        forceOrientation: "none"
    };

    var currentAppOrientation = {
        orientation: "none",
        locked: false
    };

    var resize_properties = {
        customClosePosition: 'top-right',
        allowOffscreen: true
    };

    mraid.getVersion = function() {
        return '3.0'
    };

    mraid.addEventListener = function(event_name, method) {
        if (listeners[event_name].indexOf(method) > -1) return;
        if(event_name == 'audioVolumeChange'){
            mraid.audioVolumeChange();
        }
        listeners[event_name].push(method);
    };

    mraid.removeEventListener = function(event_name, method) {
       if (method == null) {
            listeners[event_name].length = 0;
            return;
        }

        var method_index = listeners[event_name].indexOf(method);
        if (method_index > -1) { //Don't try to remove unregistered listeners
            listeners[event_name].splice(method_index, 1);
        } else {
            mraid.util.errorEvent("An unregistered listener was requested to be removed.", "mraid.removeEventListener()")
        }
    };

    //returns 'loading', 'default', 'expanded', or 'hidden'
    mraid.getState = function() {
        return state;
    };


    mraid.enable = function() {
        if (mraid_enable_called) {
            return;
        }
        mraid_enable_called = true;
        if (page_finished) {
        mraid.util.nativeCall("mraid://enable/");
        }
    };

    mraid.audioVolumeChange = function() {
        mraid.util.nativeCall("mraid://audioVolumeChange/");
    };

    mraid.util.nativeCall = function(uri) {
        window.location = uri;
    }

     mraid.util.fireEvent = function(event) {
        if (!listeners[event]) {
            return;
        }

        var args = Array.prototype.slice.call(arguments);
        args.shift();
        var length = listeners[event].length;
        for (var i = 0; i < length; i++) {
            if (typeof listeners[event][i] === "function") {
                listeners[event][i].apply(null, args);
            }
        }
    }

    mraid.util.readyEvent = function() {
        mraid.util.fireEvent('ready');
    };

    mraid.util.errorEvent = function(message, what_doing) {
        mraid.util.fireEvent('error', message, what_doing);
    };

    mraid.util.stateChangeEvent = function(new_state) {
        if (state === new_state && state != 'resized') return;
        state = new_state;
        mraid.util.fireEvent('stateChange', new_state);
    };

    mraid.util.exposureChangeEvent = function(exposureObject) {
        if (state === 'loading') return;
        mraid.util.fireEvent('exposureChange', exposureObject.exposedPercentage,exposureObject.visibleRectangle,exposureObject.occlusionRectangles);
    };

    mraid.util.audioVolumeChangeEvent = function(audioVolumeObject) {
         if (state === 'loading') return;
         mraid.util.fireEvent('audioVolumeChange', audioVolumeObject.volumePercentage);
     };

    // Gets the screen size of the device
    mraid.getScreenSize = function() {
        if (mraid.getState() == "loading") {
            mraid.util.errorEvent("Method 'mraid.getScreenSize()' called during loading state.", "mraid.getScreenSize()");
            return;
        } else {
            return screen_size;
        }
    }

    // Gets the max size of the ad if expanded (so it won't obscure the app's title bar)
    mraid.getMaxSize = function() {
        if (mraid.getState() == "loading") {
            mraid.util.errorEvent("Method 'mraid.getMaxSize()' called during loading state.", "mraid.getMaxSize()");
            return;
        } else {
            return max_size;
        }
    }

    // Gets the current position of the ad view, in dips offset from top left.
    mraid.getCurrentPosition = function() {
        if (mraid.getState() == "loading") {
            mraid.util.errorEvent("Method 'mraid.getCurrentPosition()' called during loading state.", "mraid.getCurrentPosition()");
            return;
        } else {
            return current_position;
        }
    }

    // Gets the default position of the ad view, in dips offset from top left.
    mraid.getDefaultPosition = function() {
        if (mraid.getState() == "loading") {
            mraid.util.errorEvent("Method 'mraid.getDefaultPosition()' called during loading state.", "mraid.getDefaultPosition()");
            return;
        } else {
            return default_position;
        }
    }

   mraid.getOrientationProperties = function() {
        return orientation_properties;
    }

    //returns a json object... {width:300, height:250, useCustomClose:false, isModal:false};
    mraid.getExpandProperties = function() {
        return expand_properties;
    };

    mraid.util.setScreenSize = function(width, height) {
            screen_size = {
                "width": width,
                "height": height
            };
        }

    mraid.util.setMaxSize = function(width, height) {
            max_size = {
                "width": width,
                "height": height
            };
        }


     mraid.util.setDefaultPosition = function(x, y, width, height) {
            default_position = {
                "x": x,
                "y": y,
                "width": width,
                "height": height
            };
        }

        mraid.util.setCurrentPosition = function(x, y, width, height) {
            current_position = {
                "x": x,
                "y": y,
                "width": width,
                "height": height
            };
        }

      mraid.setOrientationProperties = function(properties) {
        if (mraid.getState() == "loading") {
            mraid.util.errorEvent("Method 'mraid.setOrientationProperties()' called during loading state.", "mraid.setOrientationProperties()");
            return;
        }

        if (typeof properties === "undefined") {
            mraid.util.errorEvent("Invalid orientationProperties.", "mraid.setOrientationProperties()");
            return;
        }

        if (!mraid.getCurrentAppOrientation().locked) {
            if (properties.forceOrientation === 'portrait' || properties.forceOrientation === 'landscape' || properties.forceOrientation === 'none') {
                orientation_properties.forceOrientation = properties.forceOrientation;
            } else {
                mraid.util.errorEvent("Invalid orientationProperties forceOrientation property", "mraid.setOrientationProperties()");
            }
        }

        if (typeof properties.allowOrientationChange === "boolean") {
            orientation_properties.allowOrientationChange = properties.allowOrientationChange;
        } else {
            mraid.util.errorEvent("Invalid orientationProperties allowOrientationChange property", "mraid.setOrientationProperties()");
        }
        mraid.util.nativeCall("mraid://setOrientationProperties/?allow_orientation_change=" + orientation_properties.allowOrientationChange + "&force_orientation=" + orientation_properties.forceOrientation);
    }

   // Takes an object... {width:300, height:250, useCustomClose:false, isModal:false};
    mraid.setExpandProperties = function(properties) {
        if (typeof properties === "undefined") {
            mraid.util.errorEvent("Invalid expandProperties. Retaining default values.", "mraid.setExpandProperties()");
            return;
        }
        if (!isNaN(properties.width)) {
            expand_properties.width = properties.width;
        }
        if (!isNaN(properties.height)) {
            expand_properties.height = properties.height;
        }
        if (typeof properties.useCustomClose === "boolean") {
            expand_properties.useCustomClose = properties.useCustomClose;
        }
    };

    // Resize
    mraid.resize = function() {
        if (!mraid.util.validateResizeProperties(resize_properties, "mraid.resize()")) {
            mraid.util.errorEvent("mraid.resize() called without properly setting setResizeProperties", "mraid.resize()");
            return;
        }
        switch (mraid.getState()) {
            case 'loading':
                mraid.util.errorEvent("mraid.resize() called while state is 'loading'.", "mraid.resize()");
                break;
            case 'expanded':
                mraid.util.errorEvent("mraid.resize() called while state is 'expanded'.", "mraid.resize()");
                break;
            case 'resized':
            case 'default':
               if (resize_properties) {
                    mraid.util.nativeCall("mraid://resize/?w=" + resize_properties.width + "&h=" + resize_properties.height + "&offset_x=" + resize_properties.offsetX + "&offset_y=" + resize_properties.offsetY + "&custom_close_position=" + resize_properties.customClosePosition + "&allow_offscreen=" + resize_properties.allowOffscreen);
                } else {
                    mraid.util.errorEvent("mraid.resize() called with no resize_properties set", "mraid.resize()");
                }
                break;
            case 'hidden':
                mraid.util.errorEvent("mraid.resize() called while state is 'hidden'.", "mraid.resize()");
                break;

        }

    }

    // Loads a given URL
    mraid.open = function(url) {
        mraid.util.nativeCall("mraid://open/?uri=" + encodeURIComponent(url));
    };

   // Expands a default state ad, or unhides a hidden ad. Optionally takes a URL to load in the expanded view
    mraid.expand = function(url) {
        switch (mraid.getState()) {
            case 'loading':
                mraid.util.errorEvent("mraid.expand() called while state is 'loading'.", "mraid.expand()");
                break;
            case 'default':
            case 'resized':
                mraid.util.nativeCall("mraid://expand/" + "?w="+mraid.getExpandProperties().width + "&h="+mraid.getExpandProperties().height +
                "&useCustomClose=" + mraid.getExpandProperties().useCustomClose + (url != null ? "&url=" + encodeURIComponent(url) : "") + "&allow_orientation_change=" +
                 orientation_properties.allowOrientationChange + "&force_orientation=" + orientation_properties.forceOrientation);
                break;
            case 'expanded':
                mraid.util.errorEvent("mraid.expand() called while state is 'expanded'.", "mraid.expand()");
                break;
            case 'hidden':
                mraid.util.errorEvent("mraid.expand() called while state is 'hidden'.", "mraid.expand()");
                break;
        }
    };

    // Stores a picture on the device
    mraid.storePicture = function(uri) {
        mraid.util.nativeCall("mraid://storePicture/?uri=" + encodeURIComponent(uri));
    }

    mraid.setResizeProperties = function(props) {
        if (mraid.util.validateResizeProperties(props, "mraid.setResizeProperties()")) {
            if (typeof props.customClosePosition === "undefined") {
                props.customClosePosition = 'top-right';
            }
            if (typeof props.allowOffscreen === "undefined") {
                props.allowOffscreen = true;
            }
            resize_properties = props;
        }
    }

    mraid.getResizeProperties = function() {
        return resize_properties;
    }

    //Closes an expanded ad or hides an ad in default state
    mraid.close = function() {
        switch (mraid.getState()) {
            case 'loading':
                mraid.util.errorEvent("mraid.close() called while state is 'loading'.", "mraid.close()");
                break;
            case 'default':
                mraid.util.nativeCall("mraid://close");
                mraid.util.stateChangeEvent('hidden');
                break;
            case 'expanded':
                mraid.util.nativeCall("mraid://close");
                mraid.util.stateChangeEvent('default');
                break;
            case 'hidden':
                mraid.util.errorEvent("mraid.close() called while ad was already hidden", "mraid.close()");
                break;
            case 'resized':
                mraid.util.nativeCall("mraid://close/");
                mraid.util.stateChangeEvent('default');
        }
    };


    mraid.util.validateResizeProperties = function(properties, callingFunctionName) {
        if (typeof properties === "undefined") {
            mraid.util.errorEvent("Invalid resizeProperties", callingFunctionName);
            return false;
        }
        if (isNaN(properties.width) || isNaN(properties.height) || isNaN(properties.offsetX) || isNaN(properties.offsetY)) {
            mraid.util.errorEvent("Incomplete resizeProperties. width, height, offsetX, offsetY required", callingFunctionName);
            return false;
        }
        if (properties.width < 50) {
            mraid.util.errorEvent("Resize properties width below the minimum 50 pixels", callingFunctionName);
            return false;
        }
        if (properties.height < 50) {
            mraid.util.errorEvent("Resize properties height below the minimum 50 pixels", callingFunctionName);
            return false;
        }
        return true;
    }

    mraid.util.pageFinished = function() {
        page_finished = true;
        if (mraid_enable_called) {
            mraid.util.nativeCall("mraid://enable/");
    }
    }

    function fireReady() {
        if (window.MraidAndroidBridge && MraidAndroidBridge.onMraidReady) {
            MraidAndroidBridge.onMraidReady();
        }
    }

    fireReady()
}());