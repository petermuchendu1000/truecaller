package com.truecaller.call_assistant.campaigns.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/data/CampaignFeatureType;", "", "<init>", "(Ljava/lang/String;I)V", "ASSISTANT", "VOICEMAIL", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CampaignFeatureType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.data.CampaignFeatureType[] $VALUES;
    public static final com.truecaller.call_assistant.campaigns.data.CampaignFeatureType ASSISTANT = new com.truecaller.call_assistant.campaigns.data.CampaignFeatureType("ASSISTANT", 0);
    public static final com.truecaller.call_assistant.campaigns.data.CampaignFeatureType VOICEMAIL = new com.truecaller.call_assistant.campaigns.data.CampaignFeatureType("VOICEMAIL", 1);

    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.data.CampaignFeatureType[] $values() {
        return new com.truecaller.call_assistant.campaigns.data.CampaignFeatureType[]{ASSISTANT, VOICEMAIL};
    }

    static {
        com.truecaller.call_assistant.campaigns.data.CampaignFeatureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CampaignFeatureType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.campaigns.data.CampaignFeatureType valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.campaigns.data.CampaignFeatureType) java.lang.Enum.valueOf(com.truecaller.call_assistant.campaigns.data.CampaignFeatureType.class, str);
    }

    public static com.truecaller.call_assistant.campaigns.data.CampaignFeatureType[] values() {
        return (com.truecaller.call_assistant.campaigns.data.CampaignFeatureType[]) $VALUES.clone();
    }
}
