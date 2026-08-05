package com.truecaller.voicemail.api.internal.data.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/voicemail/api/internal/data/models/VoiceGreetingType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "z23/bar", "PRESET", "RECORD", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoiceGreetingType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final z23.bar Companion;
    public static final com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType PRESET = new com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType("PRESET", 0);
    public static final com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType RECORD = new com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType("RECORD", 1);
    public static final int RECORD_TYPE_CODE = 10;

    private static final /* synthetic */ com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType[] $values() {
        return new com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType[]{PRESET, RECORD};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, z23.bar] */
    static {
        com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private VoiceGreetingType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType valueOf(java.lang.String str) {
        return (com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType) java.lang.Enum.valueOf(com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType.class, str);
    }

    public static com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType[] values() {
        return (com.truecaller.voicemail.api.internal.data.models.VoiceGreetingType[]) $VALUES.clone();
    }
}
