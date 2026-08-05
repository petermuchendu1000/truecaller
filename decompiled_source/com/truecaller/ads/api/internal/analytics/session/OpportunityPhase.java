package com.truecaller.ads.api.internal.analytics.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/api/internal/analytics/session/OpportunityPhase;", "", "<init>", "(Ljava/lang/String;I)V", "", "toValue", "()I", "other", "", "isAtLeast", "(Lcom/truecaller/ads/api/internal/analytics/session/OpportunityPhase;)Z", "Companion", "u20/bar", "Prefetch", "Live", "PostFetch", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class OpportunityPhase {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.session.OpportunityPhase[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final u20.bar Companion;
    public static final com.truecaller.ads.api.internal.analytics.session.OpportunityPhase Prefetch = new com.truecaller.ads.api.internal.analytics.session.OpportunityPhase("Prefetch", 0);
    public static final com.truecaller.ads.api.internal.analytics.session.OpportunityPhase Live = new com.truecaller.ads.api.internal.analytics.session.OpportunityPhase("Live", 1);
    public static final com.truecaller.ads.api.internal.analytics.session.OpportunityPhase PostFetch = new com.truecaller.ads.api.internal.analytics.session.OpportunityPhase("PostFetch", 2);

    private static final /* synthetic */ com.truecaller.ads.api.internal.analytics.session.OpportunityPhase[] $values() {
        return new com.truecaller.ads.api.internal.analytics.session.OpportunityPhase[]{Prefetch, Live, PostFetch};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u20.bar] */
    static {
        com.truecaller.ads.api.internal.analytics.session.OpportunityPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private OpportunityPhase(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.analytics.session.OpportunityPhase valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.analytics.session.OpportunityPhase) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.analytics.session.OpportunityPhase.class, str);
    }

    public static com.truecaller.ads.api.internal.analytics.session.OpportunityPhase[] values() {
        return (com.truecaller.ads.api.internal.analytics.session.OpportunityPhase[]) $VALUES.clone();
    }

    public final boolean isAtLeast(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.internal.analytics.session.OpportunityPhase other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (ordinal() >= other.ordinal()) {
            return true;
        }
        return false;
    }

    public final int toValue() {
        int i = u20.baz.a[ordinal()];
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
