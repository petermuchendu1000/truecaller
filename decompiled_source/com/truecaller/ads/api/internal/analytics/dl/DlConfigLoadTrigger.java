package com.truecaller.ads.api.internal.analytics.dl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/ads/api/internal/analytics/dl/DlConfigLoadTrigger;", "", "<init>", "(Ljava/lang/String;I)V", "", "toValue", "()I", "", "isOpportunityScoped", "()Z", "Companion", "t20/c", "AdOpportunity", "LiveSync", "DefaultSync", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DlConfigLoadTrigger {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final t20.c Companion;
    public static final com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger AdOpportunity = new com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger("AdOpportunity", 0);
    public static final com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger LiveSync = new com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger("LiveSync", 1);
    public static final com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger DefaultSync = new com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger("DefaultSync", 2);

    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger[] $values() {
        return new com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger[]{AdOpportunity, LiveSync, DefaultSync};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, t20.c] */
    static {
        com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DlConfigLoadTrigger(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger.class, str);
    }

    public static com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger[] values() {
        return (com.truecaller.ads.api.internal.analytics.dl.DlConfigLoadTrigger[]) $VALUES.clone();
    }

    public final boolean isOpportunityScoped() {
        if (this == AdOpportunity) {
            return true;
        }
        return false;
    }

    public final int toValue() {
        int i = t20.d.a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new java.lang.RuntimeException();
            }
        }
        return i2;
    }
}
