package com.truecaller.deeplink.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/deeplink/parser/DeepLinkScheme$Scheme", "", "Lcom/truecaller/deeplink/parser/DeepLinkScheme$Scheme;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ba1/qux", "Truecaller", "TruecallerSdk", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeepLinkScheme$Scheme {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.deeplink.parser.DeepLinkScheme$Scheme[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ba1.qux Companion;
    public static final com.truecaller.deeplink.parser.DeepLinkScheme$Scheme Truecaller = new com.truecaller.deeplink.parser.DeepLinkScheme$Scheme("Truecaller", 0, "truecaller");
    public static final com.truecaller.deeplink.parser.DeepLinkScheme$Scheme TruecallerSdk = new com.truecaller.deeplink.parser.DeepLinkScheme$Scheme("TruecallerSdk", 1, "truecallersdk");

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<com.truecaller.deeplink.parser.DeepLinkScheme$Scheme> valid;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.deeplink.parser.DeepLinkScheme$Scheme[] $values() {
        return new com.truecaller.deeplink.parser.DeepLinkScheme$Scheme[]{Truecaller, TruecallerSdk};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ba1.qux, java.lang.Object] */
    static {
        com.truecaller.deeplink.parser.DeepLinkScheme$Scheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        valid = kotlin.collections.CollectionsKt.K0(getEntries());
    }

    private DeepLinkScheme$Scheme(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.deeplink.parser.DeepLinkScheme$Scheme valueOf(java.lang.String str) {
        return (com.truecaller.deeplink.parser.DeepLinkScheme$Scheme) java.lang.Enum.valueOf(com.truecaller.deeplink.parser.DeepLinkScheme$Scheme.class, str);
    }

    public static com.truecaller.deeplink.parser.DeepLinkScheme$Scheme[] values() {
        return (com.truecaller.deeplink.parser.DeepLinkScheme$Scheme[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
