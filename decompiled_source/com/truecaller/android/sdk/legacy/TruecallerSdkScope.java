package com.truecaller.android.sdk.legacy;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class TruecallerSdkScope {
    public static final int BUTTON_SHAPE_RECTANGLE = 2048;
    public static final int BUTTON_SHAPE_ROUNDED = 1024;
    public static final int CONSENT_MODE_BOTTOMSHEET = 128;
    public static final int CONSENT_MODE_FULLSCREEN = 8;
    public static final int CONSENT_MODE_POPUP = 4;
    public static final int CTA_TEXT_PREFIX_CONTINUE_WITH = 1;
    public static final int CTA_TEXT_PREFIX_PROCEED_WITH = 2;
    public static final int CTA_TEXT_PREFIX_USE = 0;
    public static final int FOOTER_TYPE_ANOTHER_METHOD = 256;
    public static final int FOOTER_TYPE_CONTINUE = 2;
    public static final int FOOTER_TYPE_LATER = 4096;
    public static final int FOOTER_TYPE_MANUALLY = 512;
    public static final int FOOTER_TYPE_NONE = 64;
    public static final int FOOTER_TYPE_SKIP = 1;
    public static final int LOGIN_TEXT_PREFIX_FOR_NEW_UPDATES = 12;
    public static final int LOGIN_TEXT_PREFIX_TO_CHECKOUT = 4;
    public static final int LOGIN_TEXT_PREFIX_TO_COMPLETE_YOUR_BOOKING = 5;
    public static final int LOGIN_TEXT_PREFIX_TO_COMPLETE_YOUR_PURCHASE = 3;
    public static final int LOGIN_TEXT_PREFIX_TO_CONTINUE = 1;
    public static final int LOGIN_TEXT_PREFIX_TO_CONTINUE_READING = 10;
    public static final int LOGIN_TEXT_PREFIX_TO_CONTINUE_WITH_YOUR_BOOKING = 7;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_BEST_PRICE = 16;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_DETAILS = 8;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_STARTED = 0;
    public static final int LOGIN_TEXT_PREFIX_TO_GET_UPDATES = 13;
    public static final int LOGIN_TEXT_PREFIX_TO_PLACE_ORDER = 2;
    public static final int LOGIN_TEXT_PREFIX_TO_PROCEED = 11;
    public static final int LOGIN_TEXT_PREFIX_TO_PROCEED_WITH_YOUR_BOOKING = 6;
    public static final int LOGIN_TEXT_PREFIX_TO_SUBSCRIBE = 14;
    public static final int LOGIN_TEXT_PREFIX_TO_SUBSCRIBE_AND_GET_UPDATES = 15;
    public static final int LOGIN_TEXT_PREFIX_TO_VIEW_MORE = 9;
    public static final int LOGIN_TEXT_SUFFIX_PLEASE_LOGIN = 1;
    public static final int LOGIN_TEXT_SUFFIX_PLEASE_LOGIN_SIGNUP = 3;
    public static final int LOGIN_TEXT_SUFFIX_PLEASE_REGISTER = 4;
    public static final int LOGIN_TEXT_SUFFIX_PLEASE_SIGNUP = 2;
    public static final int LOGIN_TEXT_SUFFIX_PLEASE_SIGN_IN = 5;
    public static final int LOGIN_TEXT_SUFFIX_PLEASE_VERIFY_MOBILE_NO = 0;
    public static final int SDK_CONSENT_TITLE_GET_STARTED = 5;
    public static final int SDK_CONSENT_TITLE_LOG_IN = 0;
    public static final int SDK_CONSENT_TITLE_REGISTER = 4;
    public static final int SDK_CONSENT_TITLE_SIGN_IN = 2;
    public static final int SDK_CONSENT_TITLE_SIGN_UP = 1;
    public static final int SDK_CONSENT_TITLE_VERIFY = 3;
    public static final int SDK_OPTION_WITHOUT_OTP = 16;
    public static final int SDK_OPTION_WITH_OTP = 32;

    @androidx.annotation.NonNull
    final com.truecaller.android.sdk.legacy.ITrueCallback callback;
    final int consentTitleOption;

    @androidx.annotation.NonNull
    final android.content.Context context;
    final com.truecaller.android.sdk.legacy.clients.CustomDataBundle customDataBundle;

    @androidx.annotation.NonNull
    final java.lang.String partnerKey;
    final int sdkFlag;

    @androidx.annotation.Keep
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static class Builder {
        private int buttonColor;
        private int buttonTextColor;

        @androidx.annotation.NonNull
        private final com.truecaller.android.sdk.legacy.ITrueCallback callback;

        @androidx.annotation.NonNull
        private final android.content.Context context;
        private int ctaTextPrefixOption;
        private int loginTextPrefixOption;
        private int loginTextSuffixOption;

        @androidx.annotation.Nullable
        private final java.lang.String partnerKey;
        private java.lang.String privacyPolicyUrl;
        private int sdkFlag;
        private java.lang.String termsOfServiceUrl;
        private int titleOption;

        public Builder(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull com.truecaller.android.sdk.legacy.ITrueCallback iTrueCallback) {
            android.content.pm.ApplicationInfo applicationInfo;
            android.os.Bundle bundle;
            this.context = context.getApplicationContext();
            this.callback = iTrueCallback;
            java.lang.String str = null;
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                java.lang.Object obj = bundle.get("com.truecaller.android.sdk.PartnerKey");
                if (obj instanceof java.lang.String) {
                    str = (java.lang.String) obj;
                }
            }
            this.partnerKey = str;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope build() throws java.lang.RuntimeException {
            if (!android.text.TextUtils.isEmpty(this.partnerKey)) {
                return new com.truecaller.android.sdk.legacy.TruecallerSdkScope(this);
            }
            throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_PARTNER_KEY);
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder buttonColor(int i) {
            this.buttonColor = i;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder buttonShapeOptions(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-3073));
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder buttonTextColor(int i) {
            this.buttonTextColor = i;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder consentMode(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-141));
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder consentTitleOption(int i) {
            this.titleOption = i;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder ctaTextPrefix(int i) {
            this.ctaTextPrefixOption = i;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder footerType(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-4932));
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder loginTextPrefix(int i) {
            this.loginTextPrefixOption = i;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder loginTextSuffix(int i) {
            this.loginTextSuffixOption = i;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder privacyPolicyUrl(java.lang.String str) {
            this.privacyPolicyUrl = str;
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder sdkOptions(int i) {
            this.sdkFlag = i | (this.sdkFlag & (-49));
            return this;
        }

        public com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder termsOfServiceUrl(java.lang.String str) {
            this.termsOfServiceUrl = str;
            return this;
        }
    }

    public TruecallerSdkScope(@androidx.annotation.NonNull com.truecaller.android.sdk.legacy.TruecallerSdkScope.Builder builder) {
        this.context = builder.context;
        this.partnerKey = builder.partnerKey;
        this.sdkFlag = builder.sdkFlag;
        this.callback = builder.callback;
        this.consentTitleOption = builder.titleOption;
        int i = builder.buttonColor;
        int i2 = builder.buttonTextColor;
        this.customDataBundle = new com.truecaller.android.sdk.legacy.clients.CustomDataBundle(builder.privacyPolicyUrl, i, i2, builder.ctaTextPrefixOption, builder.termsOfServiceUrl, builder.loginTextPrefixOption, builder.loginTextSuffixOption);
    }
}
