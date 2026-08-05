package com.truecaller.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AppEvents$GlobalSearch$NavigationSource {
    TAB_CALLS("calls"),
    TAB_MESSAGES("messages"),
    TAB_BLOCKING("blocking"),
    TAB_FAMILY_PROTECTION_CONFIG("familyProtectionConfig"),
    TAB_PREMIUM("premium"),
    TAB_ASSISTANT("assistant"),
    TAB_VOICEMAIL("voicemail"),
    TAB_INVITE("invite"),
    TAB_SCAM_FEED("scamFeed"),
    NUMBER_SCAN_MANUAL("numberScanManual"),
    NUMBER_SCAN_AUTOMATIC("numberScanAutomatic"),
    SEARCH_COPIED_NUMBER("copiedNumberPopup"),
    DIALER_CLIPBOARD_SEARCH("dialerClipboardSearch"),
    DIALER_SEARCH_MORE("dialerSearchMore"),
    CONTACT_REQUEST_NOTIFICATION("contactRequestNotification"),
    CONTACT_REQUEST("contactRequest"),
    SEARCH_NOTIFICATION("searchNotification"),
    WIDGET("widget"),
    ACTION_PROCESS_TEXT("actionProcessText"),
    UNKNOWN("unknown");


    @androidx.annotation.NonNull
    private final java.lang.String value;

    AppEvents$GlobalSearch$NavigationSource(@androidx.annotation.NonNull java.lang.String str) {
        this.value = str;
    }

    @androidx.annotation.NonNull
    public java.lang.String getValue() {
        return this.value;
    }
}
