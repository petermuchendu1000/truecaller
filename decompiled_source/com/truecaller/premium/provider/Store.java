package com.truecaller.premium.provider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/provider/Store;", "", "", "providerName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getProviderName", "()Ljava/lang/String;", "Companion", "dd2/i", "GOOGLE_PLAY", "WEB", "WEB_STRIPE", "NONE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Store {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.provider.Store[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final dd2.i Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String providerName;
    public static final com.truecaller.premium.provider.Store GOOGLE_PLAY = new com.truecaller.premium.provider.Store("GOOGLE_PLAY", 0, "googleplay");
    public static final com.truecaller.premium.provider.Store WEB = new com.truecaller.premium.provider.Store("WEB", 1, "web");
    public static final com.truecaller.premium.provider.Store WEB_STRIPE = new com.truecaller.premium.provider.Store("WEB_STRIPE", 2, "webstripe");
    public static final com.truecaller.premium.provider.Store NONE = new com.truecaller.premium.provider.Store("NONE", 3, "none");

    private static final /* synthetic */ com.truecaller.premium.provider.Store[] $values() {
        return new com.truecaller.premium.provider.Store[]{GOOGLE_PLAY, WEB, WEB_STRIPE, NONE};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [dd2.i, java.lang.Object] */
    static {
        com.truecaller.premium.provider.Store[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private Store(java.lang.String str, int i, java.lang.String str2) {
        this.providerName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.provider.Store valueOf(java.lang.String str) {
        return (com.truecaller.premium.provider.Store) java.lang.Enum.valueOf(com.truecaller.premium.provider.Store.class, str);
    }

    public static com.truecaller.premium.provider.Store[] values() {
        return (com.truecaller.premium.provider.Store[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProviderName() {
        return this.providerName;
    }
}
