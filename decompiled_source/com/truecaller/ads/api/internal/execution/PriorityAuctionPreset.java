package com.truecaller.ads.api.internal.execution;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/api/internal/execution/PriorityAuctionPreset;", "", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(Ljava/lang/String;II)V", "I", "getId", "()I", "Companion", "x20/n", "GamPriority", "TasPriority", "PartnerPriority", "GamAndTas", "GamAndPartner", "TasAndPartner", "GamThenTas", "GamThenPartner", "TasThenPartner", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PriorityAuctionPreset {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.execution.PriorityAuctionPreset[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final x20.n Companion;

    @org.jetbrains.annotations.NotNull
    private static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset DEFAULT;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset GamAndPartner;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset GamAndTas;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset GamPriority;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset GamThenPartner;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset GamThenTas;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset PartnerPriority;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset TasAndPartner;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset TasPriority;
    public static final com.truecaller.ads.api.internal.execution.PriorityAuctionPreset TasThenPartner;
    private final int id;

    private static final /* synthetic */ com.truecaller.ads.api.internal.execution.PriorityAuctionPreset[] $values() {
        return new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset[]{GamPriority, TasPriority, PartnerPriority, GamAndTas, GamAndPartner, TasAndPartner, GamThenTas, GamThenPartner, TasThenPartner};
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [x20.n, java.lang.Object] */
    static {
        com.truecaller.ads.api.internal.execution.PriorityAuctionPreset priorityAuctionPreset = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("GamPriority", 0, 10);
        GamPriority = priorityAuctionPreset;
        TasPriority = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("TasPriority", 1, 11);
        PartnerPriority = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("PartnerPriority", 2, 12);
        GamAndTas = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("GamAndTas", 3, 13);
        GamAndPartner = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("GamAndPartner", 4, 14);
        TasAndPartner = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("TasAndPartner", 5, 15);
        GamThenTas = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("GamThenTas", 6, 16);
        GamThenPartner = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("GamThenPartner", 7, 17);
        TasThenPartner = new com.truecaller.ads.api.internal.execution.PriorityAuctionPreset("TasThenPartner", 8, 18);
        com.truecaller.ads.api.internal.execution.PriorityAuctionPreset[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        DEFAULT = priorityAuctionPreset;
    }

    private PriorityAuctionPreset(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    public static final /* synthetic */ com.truecaller.ads.api.internal.execution.PriorityAuctionPreset access$getDEFAULT$cp() {
        return DEFAULT;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.execution.PriorityAuctionPreset valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.execution.PriorityAuctionPreset) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.execution.PriorityAuctionPreset.class, str);
    }

    public static com.truecaller.ads.api.internal.execution.PriorityAuctionPreset[] values() {
        return (com.truecaller.ads.api.internal.execution.PriorityAuctionPreset[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
