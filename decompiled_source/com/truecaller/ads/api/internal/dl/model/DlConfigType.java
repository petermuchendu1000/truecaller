package com.truecaller.ads.api.internal.dl.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlConfigType;", "", "<init>", "(Ljava/lang/String;I)V", "", "toFlowIdPrefix", "()Ljava/lang/String;", "", "toValue", "()I", "Companion", "w20/qux", "Live", "Default", "Fallback", "Connect", "Mock", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DlConfigType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlConfigType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w20.qux Companion;
    public static final com.truecaller.ads.api.internal.dl.model.DlConfigType Live = new com.truecaller.ads.api.internal.dl.model.DlConfigType("Live", 0);
    public static final com.truecaller.ads.api.internal.dl.model.DlConfigType Default = new com.truecaller.ads.api.internal.dl.model.DlConfigType("Default", 1);
    public static final com.truecaller.ads.api.internal.dl.model.DlConfigType Fallback = new com.truecaller.ads.api.internal.dl.model.DlConfigType("Fallback", 2);
    public static final com.truecaller.ads.api.internal.dl.model.DlConfigType Connect = new com.truecaller.ads.api.internal.dl.model.DlConfigType("Connect", 3);
    public static final com.truecaller.ads.api.internal.dl.model.DlConfigType Mock = new com.truecaller.ads.api.internal.dl.model.DlConfigType("Mock", 4);

    private static final /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlConfigType[] $values() {
        return new com.truecaller.ads.api.internal.dl.model.DlConfigType[]{Live, Default, Fallback, Connect, Mock};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [w20.qux, java.lang.Object] */
    static {
        com.truecaller.ads.api.internal.dl.model.DlConfigType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DlConfigType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.dl.model.DlConfigType valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.dl.model.DlConfigType) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.dl.model.DlConfigType.class, str);
    }

    public static com.truecaller.ads.api.internal.dl.model.DlConfigType[] values() {
        return (com.truecaller.ads.api.internal.dl.model.DlConfigType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toFlowIdPrefix() {
        int i = w20.a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "mc_";
                        }
                        throw new java.lang.RuntimeException();
                    }
                    return "cc_";
                }
                return "fc_";
            }
            return "dc_";
        }
        return "uc_";
    }

    public final int toValue() {
        int i = w20.a.a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new java.lang.RuntimeException();
                    }
                }
            }
        }
        return i2;
    }
}
