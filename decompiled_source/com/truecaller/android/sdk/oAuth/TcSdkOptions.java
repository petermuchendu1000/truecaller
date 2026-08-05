package com.truecaller.android.sdk.oAuth;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class TcSdkOptions {
    public static final int BUTTON_SHAPE_RECTANGLE = 256;
    public static final int BUTTON_SHAPE_ROUNDED = 128;
    public static final int CONSENT_MODE_BOTTOMSHEET = 4096;
    public static final int CONSENT_MODE_POPUP = 2048;
    public static final int CTA_TEXT_ACCEPT = 2;
    public static final int CTA_TEXT_CONFIRM = 3;
    public static final int CTA_TEXT_CONTINUE = 1;
    public static final int CTA_TEXT_CONTINUE_WITH = 5;
    public static final int CTA_TEXT_PROCEED = 0;
    public static final int CTA_TEXT_PROCEED_WITH = 6;
    public static final int CTA_TEXT_USE = 4;
    public static final int DISMISS_OPTION_CROSS_BUTTON = 1024;
    public static final int DISMISS_OPTION_SECONDARY_CTA_BORDER = 512;
    public static final int ENHANCED_BOTTOM_SHEET_DISABLED = 8192;
    public static final int FOOTER_TYPE_ANOTHER_METHOD = 4;
    public static final int FOOTER_TYPE_ANOTHER_MOBILE_NO = 2;
    public static final int FOOTER_TYPE_LATER = 16;
    public static final int FOOTER_TYPE_MANUALLY = 8;
    public static final int FOOTER_TYPE_SKIP = 1;
    public static final int LOGIN_TEXT_PREFIX_FOR_NEW_UPDATES = 12;
    public static final int LOGIN_TEXT_PREFIX_TO_CHECKOUT = 4;
    public static final int LOGIN_TEXT_PREFIX_TO_COMPLETE_YOUR_BOOKING = 5;
    public static final int LOGIN_TEXT_PREFIX_TO_COMPLETE_YOUR_PURCHASE = 3;
    public static final int LOGIN_TEXT_PREFIX_TO_CONTINUE = 1;
    public static final int LOGIN_TEXT_PREFIX_TO_CONTINUE_READING = 10;
    public static final int LOGIN_TEXT_PREFIX_TO_CONTINUE_WITH_YOUR_BOOKING = 7;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_DETAILS = 8;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_STARTED = 0;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_UPDATES = 13;
    public static final int LOGIN_TEXT_PREFIX_TO_PLACE_ORDER = 2;
    public static final int LOGIN_TEXT_PREFIX_TO_PROCEED = 11;
    public static final int LOGIN_TEXT_PREFIX_TO_PROCEED_WITH_YOUR_BOOKING = 6;
    public static final int LOGIN_TEXT_PREFIX_TO_SUBSCRIBE = 14;
    public static final int LOGIN_TEXT_PREFIX_TO_SUBSCRIBE_AND_GET_UPDATES = 15;
    public static final int LOGIN_TEXT_PREFIX_TO_VIEW_MORE = 9;
    public static final int OPTION_VERIFY_ALL_USERS = 64;
    public static final int OPTION_VERIFY_ONLY_TC_USERS = 32;
    public static final int SDK_CONSENT_HEADING_CHECKOUT_WITH = 16;
    public static final int SDK_CONSENT_HEADING_COMPLETE_BOOKING_WITH = 15;
    public static final int SDK_CONSENT_HEADING_COMPLETE_ORDER_WITH = 13;
    public static final int SDK_CONSENT_HEADING_CONTINUE_READING_ON = 22;
    public static final int SDK_CONSENT_HEADING_CONTINUE_WITH = 12;
    public static final int SDK_CONSENT_HEADING_GET_NEW_UPDATES_FROM = 23;
    public static final int SDK_CONSENT_HEADING_GET_STARTED_WITH = 5;
    public static final int SDK_CONSENT_HEADING_GET_UPDATES_FROM = 21;
    public static final int SDK_CONSENT_HEADING_LOGIN_SIGNUP_WITH = 24;
    public static final int SDK_CONSENT_HEADING_LOGIN_TO_WITH_ONE_TAP = 19;
    public static final int SDK_CONSENT_HEADING_LOG_IN_TO = 0;
    public static final int SDK_CONSENT_HEADING_MANAGE_DETAILS_WITH = 17;
    public static final int SDK_CONSENT_HEADING_MANAGE_YOUR_DETAILS_WITH = 18;
    public static final int SDK_CONSENT_HEADING_PLACE_ORDER_WITH = 14;
    public static final int SDK_CONSENT_HEADING_PROCEED_WITH = 6;
    public static final int SDK_CONSENT_HEADING_REGISTER_WITH = 4;
    public static final int SDK_CONSENT_HEADING_SIGN_IN_TO = 2;
    public static final int SDK_CONSENT_HEADING_SIGN_UP_WITH = 1;
    public static final int SDK_CONSENT_HEADING_SUBSCRIBE_TO = 20;
    public static final int SDK_CONSENT_HEADING_VERIFY_NUMBER_WITH = 3;
    public static final int SDK_CONSENT_HEADING_VERIFY_PHONE_NO_WITH = 10;
    public static final int SDK_CONSENT_HEADING_VERIFY_PROFILE_WITH = 8;
    public static final int SDK_CONSENT_HEADING_VERIFY_WITH = 7;
    public static final int SDK_CONSENT_HEADING_VERIFY_YOUR_NO_WITH = 11;
    public static final int SDK_CONSENT_HEADING_VERIFY_YOUR_PROFILE_WITH = 9;

    @androidx.annotation.NonNull
    protected final com.truecaller.android.sdk.oAuth.TcOAuthCallback callback;

    @androidx.annotation.NonNull
    protected final java.lang.String clientId;

    @androidx.annotation.NonNull
    protected final android.content.Context context;
    protected final int sdkFlag;
    final com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle sdkOptionsDataBundle;

    @androidx.annotation.Keep
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static class Builder {
        private int buttonColor;
        private int buttonTextColor;

        @androidx.annotation.NonNull
        private final com.truecaller.android.sdk.oAuth.TcOAuthCallback callback;

        @androidx.annotation.Nullable
        private final java.lang.String clientId;

        @androidx.annotation.NonNull
        private final android.content.Context context;
        private int ctaTextOption;
        private int headingOption;
        private int loginTextPrefixOption;
        private int sdkFlag;
        private int titleOption;

        public Builder(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback) {
            android.content.pm.ApplicationInfo applicationInfo;
            android.os.Bundle bundle;
            this.context = context.getApplicationContext();
            this.callback = tcOAuthCallback;
            java.lang.String str = null;
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                java.lang.Object obj = bundle.get("com.truecaller.android.sdk.ClientId");
                if (obj instanceof java.lang.String) {
                    str = (java.lang.String) obj;
                }
            }
            this.clientId = str;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions build() throws java.lang.RuntimeException {
            if (!android.text.TextUtils.isEmpty(this.clientId)) {
                return new com.truecaller.android.sdk.oAuth.TcSdkOptions(this);
            }
            throw new java.lang.RuntimeException("Add client id in your manifest");
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder buttonColor(int i) {
            this.buttonColor = i;
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder buttonShapeOptions(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-385));
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder buttonTextColor(int i) {
            this.buttonTextColor = i;
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder consentHeadingOption(int i) {
            this.headingOption = i;
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder consentMode(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-6145));
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder consentTitleOption(int i) {
            this.titleOption = i;
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder ctaText(int i) {
            this.ctaTextOption = i;
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder dismissOptions(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-1537));
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder footerType(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-32));
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder loginTextPrefix(int i) {
            this.loginTextPrefixOption = i;
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder sdkOptions(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-97));
            return this;
        }

        public com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder setEnhancedBottomSheet(boolean z) {
            if (z) {
                this.sdkFlag &= -8193;
                return this;
            }
            this.sdkFlag |= 8192;
            return this;
        }
    }

    public TcSdkOptions(@androidx.annotation.NonNull com.truecaller.android.sdk.oAuth.TcSdkOptions.Builder builder) {
        this.context = builder.context;
        this.clientId = builder.clientId;
        this.sdkFlag = builder.sdkFlag;
        this.callback = builder.callback;
        this.sdkOptionsDataBundle = new com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle(builder.buttonColor, builder.buttonTextColor, builder.titleOption, builder.headingOption, builder.ctaTextOption, builder.loginTextPrefixOption);
    }
}
