package com.truecaller.insights.ui.notifications.smsid.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/insights/ui/notifications/smsid/data/SmsIdBannerTheme;", "", "Lny1/d;", "value", "<init>", "(Ljava/lang/String;ILny1/d;)V", "Lny1/d;", "getValue", "()Lny1/d;", "PRIMARY", "VERIFIED", "VERIFIED_GOV", "FRAUD", "SPAM", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmsIdBannerTheme {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme[] $VALUES;
    public static final com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme FRAUD;
    public static final com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme PRIMARY = new com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme("PRIMARY", 0, ny1.e.a);
    public static final com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme SPAM;
    public static final com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme VERIFIED;
    public static final com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme VERIFIED_GOV;

    @org.jetbrains.annotations.NotNull
    private final ny1.d value;

    private static final /* synthetic */ com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme[] $values() {
        return new com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme[]{PRIMARY, VERIFIED, VERIFIED_GOV, FRAUD, SPAM};
    }

    static {
        ny1.d dVar = ny1.e.c;
        VERIFIED = new com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme("VERIFIED", 1, dVar);
        VERIFIED_GOV = new com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme("VERIFIED_GOV", 2, dVar);
        ny1.d dVar2 = ny1.e.b;
        FRAUD = new com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme("FRAUD", 3, dVar2);
        SPAM = new com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme("SPAM", 4, dVar2);
        com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SmsIdBannerTheme(java.lang.String str, int i, ny1.d dVar) {
        this.value = dVar;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme valueOf(java.lang.String str) {
        return (com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme) java.lang.Enum.valueOf(com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme.class, str);
    }

    public static com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme[] values() {
        return (com.truecaller.insights.ui.notifications.smsid.data.SmsIdBannerTheme[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final ny1.d getValue() {
        return this.value;
    }
}
