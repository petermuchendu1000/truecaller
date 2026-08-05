package com.truecaller.ads.api.internal.analytics.dl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/ads/api/internal/analytics/dl/DlExecuteConnectScope;", "", "<init>", "(Ljava/lang/String;I)V", "", "toValue", "()I", "Companion", "t20/i", "Screen", "MultiScreen", "Session", "App", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DlExecuteConnectScope {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final t20.i Companion;
    public static final com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope Screen = new com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope("Screen", 0);
    public static final com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope MultiScreen = new com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope("MultiScreen", 1);
    public static final com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope Session = new com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope("Session", 2);
    public static final com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope App = new com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope("App", 3);

    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope[] $values() {
        return new com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope[]{Screen, MultiScreen, Session, App};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [t20.i, java.lang.Object] */
    static {
        com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DlExecuteConnectScope(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope.class, str);
    }

    public static com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope[] values() {
        return (com.truecaller.ads.api.internal.analytics.dl.DlExecuteConnectScope[]) $VALUES.clone();
    }

    public final int toValue() {
        int i = t20.j.a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw new java.lang.RuntimeException();
                }
            }
        }
        return i2;
    }
}
