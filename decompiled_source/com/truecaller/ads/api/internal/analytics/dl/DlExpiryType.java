package com.truecaller.ads.api.internal.analytics.dl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/ads/api/internal/analytics/dl/DlExpiryType;", "", "<init>", "(Ljava/lang/String;I)V", "", "toValue", "()I", "Companion", "t20/l", "Consumption", "TimeBased", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DlExpiryType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.dl.DlExpiryType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final t20.l Companion;
    public static final com.truecaller.ads.api.internal.analytics.dl.DlExpiryType Consumption = new com.truecaller.ads.api.internal.analytics.dl.DlExpiryType("Consumption", 0);
    public static final com.truecaller.ads.api.internal.analytics.dl.DlExpiryType TimeBased = new com.truecaller.ads.api.internal.analytics.dl.DlExpiryType("TimeBased", 1);

    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.dl.DlExpiryType[] $values() {
        return new com.truecaller.ads.api.internal.analytics.dl.DlExpiryType[]{Consumption, TimeBased};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t20.l] */
    static {
        com.truecaller.ads.api.internal.analytics.dl.DlExpiryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DlExpiryType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.analytics.dl.DlExpiryType valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.analytics.dl.DlExpiryType) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.analytics.dl.DlExpiryType.class, str);
    }

    public static com.truecaller.ads.api.internal.analytics.dl.DlExpiryType[] values() {
        return (com.truecaller.ads.api.internal.analytics.dl.DlExpiryType[]) $VALUES.clone();
    }

    public final int toValue() {
        int i = t20.m.a[ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new java.lang.RuntimeException();
    }
}
