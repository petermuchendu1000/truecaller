package com.truecaller.voicemail.api.internal.data.models.status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/voicemail/api/internal/data/models/status/VoicemailStatus;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "", "isActiveOrPending", "()Z", "I", "getCode", "()I", "Companion", "a33/bar", "INACTIVE", "ACTIVE", "PENDING", "PAUSED", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final a33.bar Companion;
    private final int code;
    public static final com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus INACTIVE = new com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus("INACTIVE", 0, 0);
    public static final com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus ACTIVE = new com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus("ACTIVE", 1, 1);
    public static final com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus PENDING = new com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus("PENDING", 2, 3);
    public static final com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus PAUSED = new com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus("PAUSED", 3, 4);

    private static final /* synthetic */ com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus[] $values() {
        return new com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus[]{INACTIVE, ACTIVE, PENDING, PAUSED};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, a33.bar] */
    static {
        com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private VoicemailStatus(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus valueOf(java.lang.String str) {
        return (com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus) java.lang.Enum.valueOf(com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus.class, str);
    }

    public static com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus[] values() {
        return (com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean isActiveOrPending() {
        if (this != ACTIVE && this != PENDING) {
            return false;
        }
        return true;
    }
}
