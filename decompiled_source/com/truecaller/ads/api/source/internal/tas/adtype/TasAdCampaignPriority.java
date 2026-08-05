package com.truecaller.ads.api.source.internal.tas.adtype;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/api/source/internal/tas/adtype/TasAdCampaignPriority;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Roadblock", "Standard", "PricePriority", "House", "api-source_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TasAdCampaignPriority {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority[] $VALUES;
    private final int value;
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority Roadblock = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority("Roadblock", 0, 0);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority Standard = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority("Standard", 1, 1);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority PricePriority = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority("PricePriority", 2, 2);
    public static final com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority House = new com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority("House", 3, 3);

    private static final /* synthetic */ com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority[] $values() {
        return new com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority[]{Roadblock, Standard, PricePriority, House};
    }

    static {
        com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TasAdCampaignPriority(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority) java.lang.Enum.valueOf(com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority.class, str);
    }

    public static com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority[] values() {
        return (com.truecaller.ads.api.source.internal.tas.adtype.TasAdCampaignPriority[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
