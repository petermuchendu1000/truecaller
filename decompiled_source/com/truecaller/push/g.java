package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.network.notification.NotificationType.values().length];
        a = iArr;
        try {
            iArr[com.truecaller.network.notification.NotificationType.CONTACT_REQUEST.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.CONTACT_REQUEST_ACCEPTED_V2.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.CONTACT_REQUEST_REJECTED_V2.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.CONTACT_REQUEST_RECEIVED_V2.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.PREMIUM_STATUS_CHANGED.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.TRIGGER_INITIALIZE.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.REFERRAL_PREMIUM.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.SUBSCRIPTION_GRACE.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.SUBSCRIPTION_STATUS_CHANGED.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.WEB_SDK.ordinal()] = 10;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.WHO_VIEWED_ME.ordinal()] = 11;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.PUSH_CALLER_ID.ordinal()] = 12;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.ACCOUNT_UNSUSPENDED.ordinal()] = 13;
        } catch (java.lang.NoSuchFieldError unused13) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.SECONDARY_PHONE_NUMBER_LOST.ordinal()] = 14;
        } catch (java.lang.NoSuchFieldError unused14) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.GIFT_PREMIUM.ordinal()] = 15;
        } catch (java.lang.NoSuchFieldError unused15) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.NEW_FAMILY_MEMBER.ordinal()] = 16;
        } catch (java.lang.NoSuchFieldError unused16) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.FAMILY_BENEFIT_REVOKED.ordinal()] = 17;
        } catch (java.lang.NoSuchFieldError unused17) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.FAMILY_SHARING_STOPPED.ordinal()] = 18;
        } catch (java.lang.NoSuchFieldError unused18) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.DYNAMIC_BUSINESS_CALLER_ID.ordinal()] = 19;
        } catch (java.lang.NoSuchFieldError unused19) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.GENERAL_INFO.ordinal()] = 20;
        } catch (java.lang.NoSuchFieldError unused20) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.SCAM_FEED.ordinal()] = 21;
        } catch (java.lang.NoSuchFieldError unused21) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.INVALID_PROFILE.ordinal()] = 22;
        } catch (java.lang.NoSuchFieldError unused22) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.FAMILY_PROTECT_FETCH_CONFIG.ordinal()] = 23;
        } catch (java.lang.NoSuchFieldError unused23) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.IMPACT_NOTIFICATION.ordinal()] = 24;
        } catch (java.lang.NoSuchFieldError unused24) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.REMOTE_REJECT.ordinal()] = 25;
        } catch (java.lang.NoSuchFieldError unused25) {
        }
        try {
            a[com.truecaller.network.notification.NotificationType.FAMILY_PROTECT_NOTIFICATION.ordinal()] = 26;
        } catch (java.lang.NoSuchFieldError unused26) {
        }
    }
}
