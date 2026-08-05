package com.truecaller.android.sdk.common.models;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class TrueProfile implements android.os.Parcelable {
    private static final java.lang.String AVATAR_URL = "TRUEPROFILE_AVATAR_URL";
    private static final java.lang.String CITY = "TRUEPROFILE_CITY";
    private static final java.lang.String COMPANY_NAME = "TRUEPROFILE_COMPANY_NAME";
    public static final java.lang.String COUNTRY_CODE = "TRUEPROFILE_COUNTRY_CODE";
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.common.models.TrueProfile> CREATOR = new android.os.Parcelable.Creator<com.truecaller.android.sdk.common.models.TrueProfile>() { // from class: com.truecaller.android.sdk.common.models.TrueProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.truecaller.android.sdk.common.models.TrueProfile createFromParcel(android.os.Parcel parcel) {
            return new com.truecaller.android.sdk.common.models.TrueProfile(0, parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.truecaller.android.sdk.common.models.TrueProfile[] newArray(int i) {
            return new com.truecaller.android.sdk.common.models.TrueProfile[i];
        }
    };
    public static final java.lang.String EMAIL = "TRUEPROFILE_EMAIL";
    private static final java.lang.String FACEBOOK_ID = "TRUEPROFILE_FACEBOOK_ID";
    private static final java.lang.String FIRST_NAME = "TRUEPROFILE_FIRST_NAME";
    private static final java.lang.String GENDER = "TRUEPROFILE_GENDER";
    public static final java.lang.String IS_AMBASSADOR = "TRUEPROFILE_IS_AMBASSADOR";
    private static final java.lang.String IS_SIM_CHANGED = "TRUEPROFILE_IS_SIM_CHANGED";
    private static final java.lang.String IS_TRUENAME = "TRUEPROFILE_IS_TRUENAME";
    private static final java.lang.String JOB_TITLE = "TRUEPROFILE_JOB_TITLE";
    private static final java.lang.String LAST_NAME = "TRUEPROFILE_LAST_NAME";
    private static final java.lang.String PAYLOAD = "TRUEPROFILE_PAYLOAD";
    private static final java.lang.String PHONE_NUMBER = "TRUEPROFILE_PHONE_NUMBER";
    private static final java.lang.String REQ_NONCE = "TRUEPROFILE_REQ_NONCE";
    private static final java.lang.String SIGNATURE = "TRUEPROFILE_SIGNATURE";
    private static final java.lang.String SIGNATURE_ALGORITHM = "TRUEPROFILE_SIGNATURE_ALGORITHM";
    private static final java.lang.String STREET = "TRUEPROFILE_STREET";
    private static final java.lang.String TWITTER_ID = "TRUEPROFILE_TWITTER_ID";
    public static final java.lang.String URL = "TRUEPROFILE_URL";
    private static final java.lang.String USER_LOCALE = "TRUEPROFILE_USER_LOCALE";
    private static final java.lang.String VERIFICATION_MODE = "TRUEPROFILE_VERIFICATION_MODE";
    private static final java.lang.String VERIFICATION_TIMESTAMP = "TRUEPROFILE_VERIFICATION_TIMESTAMP";
    private static final java.lang.String ZIP_CODE = "TRUEPROFILE_ZIP_CODE";
    public java.lang.String accessToken;
    public java.lang.String avatarUrl;
    public java.lang.String city;
    public java.lang.String companyName;
    public java.lang.String countryCode;
    public java.lang.String email;
    public java.lang.String facebookId;
    public java.lang.String firstName;
    public java.lang.String gender;
    public boolean isAmbassador;
    public boolean isSimChanged;
    public boolean isTrueName;
    public java.lang.String jobTitle;
    public java.lang.String lastName;
    public java.lang.String payload;
    public java.lang.String phoneNumber;
    public java.lang.String requestNonce;
    public java.lang.String signature;
    public java.lang.String signatureAlgorithm;
    public java.lang.String street;
    public java.lang.String twitterId;
    public java.lang.String url;
    public java.util.Locale userLocale;
    public java.lang.String verificationMode;
    public long verificationTimestamp;
    public java.lang.String zipcode;

    @androidx.annotation.Keep
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Builder {
        private java.lang.String city;
        private java.lang.String email;
        private final java.lang.String firstName;
        private java.lang.String gender;
        private final java.lang.String lastName;

        public Builder(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2) {
            this.firstName = str;
            this.lastName = str2;
        }

        public com.truecaller.android.sdk.common.models.TrueProfile build() {
            return new com.truecaller.android.sdk.common.models.TrueProfile(this, 0);
        }

        public com.truecaller.android.sdk.common.models.TrueProfile.Builder setCity(@androidx.annotation.Nullable java.lang.String str) {
            this.city = str;
            return this;
        }

        public com.truecaller.android.sdk.common.models.TrueProfile.Builder setEmail(@androidx.annotation.Nullable java.lang.String str) {
            this.email = str;
            return this;
        }

        public com.truecaller.android.sdk.common.models.TrueProfile.Builder setGender(@androidx.annotation.Nullable java.lang.String str) {
            this.gender = str;
            return this;
        }
    }

    public /* synthetic */ TrueProfile(int i, android.os.Parcel parcel) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToBundle(@androidx.annotation.NonNull android.os.Bundle bundle) {
        bundle.putString(FIRST_NAME, this.firstName);
        bundle.putString(LAST_NAME, this.lastName);
        bundle.putString(PHONE_NUMBER, this.phoneNumber);
        bundle.putString(GENDER, this.gender);
        bundle.putString(STREET, this.street);
        bundle.putString(CITY, this.city);
        bundle.putString(ZIP_CODE, this.zipcode);
        bundle.putString(COUNTRY_CODE, this.countryCode);
        bundle.putString(FACEBOOK_ID, this.facebookId);
        bundle.putString(TWITTER_ID, this.twitterId);
        bundle.putString(EMAIL, this.email);
        bundle.putString(URL, this.url);
        bundle.putString(AVATAR_URL, this.avatarUrl);
        bundle.putString(IS_TRUENAME, java.lang.String.valueOf(this.isTrueName));
        bundle.putString(IS_AMBASSADOR, java.lang.String.valueOf(this.isAmbassador));
        bundle.putString(COMPANY_NAME, this.companyName);
        bundle.putString(JOB_TITLE, this.jobTitle);
        bundle.putString(PAYLOAD, this.payload);
        bundle.putString(SIGNATURE, this.signature);
        bundle.putString(SIGNATURE_ALGORITHM, this.signatureAlgorithm);
        bundle.putString(REQ_NONCE, this.requestNonce);
        bundle.putString(IS_SIM_CHANGED, java.lang.String.valueOf(this.isSimChanged));
        bundle.putString(VERIFICATION_MODE, this.verificationMode);
        bundle.putString(VERIFICATION_TIMESTAMP, java.lang.String.valueOf(this.verificationTimestamp));
        bundle.putString(USER_LOCALE, this.userLocale.getLanguage());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.gender);
        parcel.writeString(this.street);
        parcel.writeString(this.city);
        parcel.writeString(this.zipcode);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.facebookId);
        parcel.writeString(this.twitterId);
        parcel.writeString(this.email);
        parcel.writeString(this.url);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(java.lang.String.valueOf(this.isTrueName));
        parcel.writeString(java.lang.String.valueOf(this.isAmbassador));
        parcel.writeString(this.companyName);
        parcel.writeString(this.jobTitle);
        parcel.writeString(this.payload);
        parcel.writeString(this.signature);
    }

    public /* synthetic */ TrueProfile(com.truecaller.android.sdk.common.models.TrueProfile.Builder builder, int i) {
        this(builder);
    }

    public TrueProfile() {
    }

    public TrueProfile(@androidx.annotation.NonNull android.os.Bundle bundle) {
        this.firstName = bundle.getString(FIRST_NAME);
        this.lastName = bundle.getString(LAST_NAME);
        this.phoneNumber = bundle.getString(PHONE_NUMBER);
        this.gender = bundle.getString(GENDER);
        this.street = bundle.getString(STREET);
        this.city = bundle.getString(CITY);
        this.zipcode = bundle.getString(ZIP_CODE);
        this.countryCode = bundle.getString(COUNTRY_CODE);
        this.facebookId = bundle.getString(FACEBOOK_ID);
        this.twitterId = bundle.getString(TWITTER_ID);
        this.email = bundle.getString(EMAIL);
        this.url = bundle.getString(URL);
        this.avatarUrl = bundle.getString(AVATAR_URL);
        this.isTrueName = java.lang.Boolean.valueOf(bundle.getString(IS_TRUENAME)).booleanValue();
        this.isAmbassador = java.lang.Boolean.valueOf(bundle.getString(IS_AMBASSADOR)).booleanValue();
        this.companyName = bundle.getString(COMPANY_NAME);
        this.jobTitle = bundle.getString(JOB_TITLE);
        this.payload = bundle.getString(PAYLOAD);
        this.signature = bundle.getString(SIGNATURE);
        this.signatureAlgorithm = bundle.getString(SIGNATURE_ALGORITHM);
        this.requestNonce = bundle.getString(REQ_NONCE);
        if (bundle.getString(IS_SIM_CHANGED) != null) {
            this.isSimChanged = java.lang.Boolean.valueOf(bundle.getString(IS_SIM_CHANGED)).booleanValue();
        }
        if (bundle.getString(VERIFICATION_MODE) != null) {
            this.verificationMode = bundle.getString(VERIFICATION_MODE);
        }
        if (bundle.getString(VERIFICATION_TIMESTAMP) != null) {
            this.verificationTimestamp = java.lang.Long.parseLong(bundle.getString(VERIFICATION_TIMESTAMP));
        }
        if (bundle.getString(USER_LOCALE) != null) {
            this.userLocale = new java.util.Locale(bundle.getString(USER_LOCALE));
        }
    }

    private TrueProfile(@androidx.annotation.NonNull com.truecaller.android.sdk.common.models.TrueProfile.Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.email = builder.email;
        this.city = builder.city;
    }

    private TrueProfile(android.os.Parcel parcel) {
        this.phoneNumber = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.gender = parcel.readString();
        this.street = parcel.readString();
        this.city = parcel.readString();
        this.zipcode = parcel.readString();
        this.countryCode = parcel.readString();
        this.facebookId = parcel.readString();
        this.twitterId = parcel.readString();
        this.email = parcel.readString();
        this.url = parcel.readString();
        this.avatarUrl = parcel.readString();
        this.isTrueName = java.lang.Boolean.valueOf(parcel.readString()).booleanValue();
        this.isAmbassador = java.lang.Boolean.valueOf(parcel.readString()).booleanValue();
        this.companyName = parcel.readString();
        this.jobTitle = parcel.readString();
        this.payload = parcel.readString();
        this.signature = parcel.readString();
    }
}
