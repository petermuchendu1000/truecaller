package com.truecaller.common.cloudtelephony.assistant.democall;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/common/cloudtelephony/assistant/democall/CallStateInternal;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "RINGING", "OFF_HOOK", com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER, "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CallStateInternal {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal[] $VALUES;
    public static final com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal IDLE = new com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal("IDLE", 0);
    public static final com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal RINGING = new com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal("RINGING", 1);
    public static final com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal OFF_HOOK = new com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal("OFF_HOOK", 2);
    public static final com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal OTHER = new com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER, 3);

    private static final /* synthetic */ com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal[] $values() {
        return new com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal[]{IDLE, RINGING, OFF_HOOK, OTHER};
    }

    static {
        com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallStateInternal(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal valueOf(java.lang.String str) {
        return (com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal) java.lang.Enum.valueOf(com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal.class, str);
    }

    public static com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal[] values() {
        return (com.truecaller.common.cloudtelephony.assistant.democall.CallStateInternal[]) $VALUES.clone();
    }
}
