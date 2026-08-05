package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/premium/data/WebPurchaseRepository$RazorPayEnvironment", "", "Lcom/truecaller/premium/data/WebPurchaseRepository$RazorPayEnvironment;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "w82/y3", "TEST", "LIVE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class WebPurchaseRepository$RazorPayEnvironment {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.y3 Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment TEST = new com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment("TEST", 0, "test");
    public static final com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment LIVE = new com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment("LIVE", 1, "live");

    private static final /* synthetic */ com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[] $values() {
        return new com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[]{TEST, LIVE};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w82.y3] */
    static {
        com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private WebPurchaseRepository$RazorPayEnvironment(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment from(@org.jetbrains.annotations.Nullable java.lang.String str) {
        com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment webPurchaseRepository$RazorPayEnvironment;
        Companion.getClass();
        com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                webPurchaseRepository$RazorPayEnvironment = values[i];
                if (kotlin.text.y.p(webPurchaseRepository$RazorPayEnvironment.getValue(), str, true)) {
                    break;
                }
                i++;
            } else {
                webPurchaseRepository$RazorPayEnvironment = null;
                break;
            }
        }
        if (webPurchaseRepository$RazorPayEnvironment == null) {
            return TEST;
        }
        return webPurchaseRepository$RazorPayEnvironment;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment) java.lang.Enum.valueOf(com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment.class, str);
    }

    public static com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[] values() {
        return (com.truecaller.premium.data.WebPurchaseRepository$RazorPayEnvironment[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
