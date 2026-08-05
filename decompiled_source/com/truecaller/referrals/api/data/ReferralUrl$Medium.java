package com.truecaller.referrals.api.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"com/truecaller/referrals/api/data/ReferralUrl$Medium", "", "Lcom/truecaller/referrals/api/data/ReferralUrl$Medium;", "", "encodedChar", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "<init>", "(Ljava/lang/String;ICLjava/lang/String;)V", "C", "getEncodedChar", "()C", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "Companion", "lj2/bar", "WHATS_APP", "MESSENGER", "FACEBOOK", "TWITTER", "SNAP_CHAT", "EMAIL", "BULK_SMS", "CUSTOM_SINGLE_SMS", "OTHERS", "WHATS_APP_SINGLE", "SINGLE_CONTACT_BULK", "INSTAGRAM", "THREADS", "TELEGRAM", "CLIPBOARD", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralUrl$Medium {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referrals.api.data.ReferralUrl$Medium[] $VALUES;
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium CUSTOM_SINGLE_SMS;

    @org.jetbrains.annotations.NotNull
    public static final lj2.bar Companion;
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium WHATS_APP_SINGLE;
    private final char encodedChar;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String packageName;
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium WHATS_APP = new com.truecaller.referrals.api.data.ReferralUrl$Medium("WHATS_APP", 0, 'a', "com.whatsapp");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium MESSENGER = new com.truecaller.referrals.api.data.ReferralUrl$Medium("MESSENGER", 1, 'b', "com.facebook.orca");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium FACEBOOK = new com.truecaller.referrals.api.data.ReferralUrl$Medium("FACEBOOK", 2, 'c', "com.facebook.katana");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium TWITTER = new com.truecaller.referrals.api.data.ReferralUrl$Medium("TWITTER", 3, 'd', "com.twitter.android");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium SNAP_CHAT = new com.truecaller.referrals.api.data.ReferralUrl$Medium("SNAP_CHAT", 4, 'e', "com.snapchat.android");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium EMAIL = new com.truecaller.referrals.api.data.ReferralUrl$Medium("EMAIL", 5, 'f', null, 2, null);
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium BULK_SMS = new com.truecaller.referrals.api.data.ReferralUrl$Medium("BULK_SMS", 6, 'g', null, 2, null);
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium OTHERS = new com.truecaller.referrals.api.data.ReferralUrl$Medium("OTHERS", 8, 'i', "com.imo.android.imoim");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium SINGLE_CONTACT_BULK = new com.truecaller.referrals.api.data.ReferralUrl$Medium("SINGLE_CONTACT_BULK", 10, 'k', null, 2, null);
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium INSTAGRAM = new com.truecaller.referrals.api.data.ReferralUrl$Medium("INSTAGRAM", 11, 'l', "com.instagram.android");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium THREADS = new com.truecaller.referrals.api.data.ReferralUrl$Medium("THREADS", 12, 'm', "com.instagram.barcelona");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium TELEGRAM = new com.truecaller.referrals.api.data.ReferralUrl$Medium("TELEGRAM", 13, 'n', "org.telegram.messenger");
    public static final com.truecaller.referrals.api.data.ReferralUrl$Medium CLIPBOARD = new com.truecaller.referrals.api.data.ReferralUrl$Medium("CLIPBOARD", 14, 'o', null, 2, null);

    private static final /* synthetic */ com.truecaller.referrals.api.data.ReferralUrl$Medium[] $values() {
        return new com.truecaller.referrals.api.data.ReferralUrl$Medium[]{WHATS_APP, MESSENGER, FACEBOOK, TWITTER, SNAP_CHAT, EMAIL, BULK_SMS, CUSTOM_SINGLE_SMS, OTHERS, WHATS_APP_SINGLE, SINGLE_CONTACT_BULK, INSTAGRAM, THREADS, TELEGRAM, CLIPBOARD};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [lj2.bar, java.lang.Object] */
    static {
        java.lang.String str = null;
        CUSTOM_SINGLE_SMS = new com.truecaller.referrals.api.data.ReferralUrl$Medium("CUSTOM_SINGLE_SMS", 7, 'h', str, 2, null);
        WHATS_APP_SINGLE = new com.truecaller.referrals.api.data.ReferralUrl$Medium("WHATS_APP_SINGLE", 9, 'j', null, 2, str);
        com.truecaller.referrals.api.data.ReferralUrl$Medium[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ReferralUrl$Medium(java.lang.String str, int i, char c, java.lang.String str2) {
        this.encodedChar = c;
        this.packageName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referrals.api.data.ReferralUrl$Medium valueOf(java.lang.String str) {
        return (com.truecaller.referrals.api.data.ReferralUrl$Medium) java.lang.Enum.valueOf(com.truecaller.referrals.api.data.ReferralUrl$Medium.class, str);
    }

    public static com.truecaller.referrals.api.data.ReferralUrl$Medium[] values() {
        return (com.truecaller.referrals.api.data.ReferralUrl$Medium[]) $VALUES.clone();
    }

    public final char getEncodedChar() {
        return this.encodedChar;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public /* synthetic */ ReferralUrl$Medium(java.lang.String str, int i, char c, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, c, (i2 & 2) != 0 ? null : str2);
    }
}
