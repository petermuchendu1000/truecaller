package com.truecaller.common_call_log.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B)\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/truecaller/common_call_log/data/CallLogItemType;", "", "", "isVideo", "", "nameRes", "Lcom/truecaller/calling_common/ActionType;", "primaryAction", "<init>", "(Ljava/lang/String;IZLjava/lang/Integer;Lcom/truecaller/calling_common/ActionType;)V", "Lu03/b0;", "resourceProvider", "", "getName", "(Lu03/b0;)Ljava/lang/String;", "Z", "()Z", "Ljava/lang/Integer;", "getNameRes", "()Ljava/lang/Integer;", "Lcom/truecaller/calling_common/ActionType;", "getPrimaryAction", "()Lcom/truecaller/calling_common/ActionType;", "Companion", "u41/bar", "WHATSAPP_CALL", "WHATSAPP_VIDEO_CALL", "CELLULAR_CALL", "CELLULAR_VIDEO_CALL", "SCREENED_CALL", "CT_VOICEMAIL", "common-call-log_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CallLogItemType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common_call_log.data.CallLogItemType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final u41.bar Companion;
    private final boolean isVideo;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer nameRes;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.calling_common.ActionType primaryAction;
    public static final com.truecaller.common_call_log.data.CallLogItemType WHATSAPP_CALL = new com.truecaller.common_call_log.data.CallLogItemType("WHATSAPP_CALL", 0, false, 2132020199, com.truecaller.calling_common.ActionType.WHATSAPP_CALL, 1, null);
    public static final com.truecaller.common_call_log.data.CallLogItemType WHATSAPP_VIDEO_CALL = new com.truecaller.common_call_log.data.CallLogItemType("WHATSAPP_VIDEO_CALL", 1, true, 2132020199, com.truecaller.calling_common.ActionType.WHATSAPP_VIDEO_CALL);
    public static final com.truecaller.common_call_log.data.CallLogItemType CELLULAR_CALL = new com.truecaller.common_call_log.data.CallLogItemType("CELLULAR_CALL", 2, false, null, com.truecaller.calling_common.ActionType.CELLULAR_CALL, 3, null);
    public static final com.truecaller.common_call_log.data.CallLogItemType CELLULAR_VIDEO_CALL = new com.truecaller.common_call_log.data.CallLogItemType("CELLULAR_VIDEO_CALL", 3, true, null, com.truecaller.calling_common.ActionType.CELLULAR_VIDEO_CALL, 2, null);
    public static final com.truecaller.common_call_log.data.CallLogItemType SCREENED_CALL = new com.truecaller.common_call_log.data.CallLogItemType("SCREENED_CALL", 4, false, 2132020186, null, 5, null);
    public static final com.truecaller.common_call_log.data.CallLogItemType CT_VOICEMAIL = new com.truecaller.common_call_log.data.CallLogItemType("CT_VOICEMAIL", 5, false, 2132020198, null, 5, null);

    private static final /* synthetic */ com.truecaller.common_call_log.data.CallLogItemType[] $values() {
        return new com.truecaller.common_call_log.data.CallLogItemType[]{WHATSAPP_CALL, WHATSAPP_VIDEO_CALL, CELLULAR_CALL, CELLULAR_VIDEO_CALL, SCREENED_CALL, CT_VOICEMAIL};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u41.bar] */
    static {
        com.truecaller.common_call_log.data.CallLogItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CallLogItemType(java.lang.String str, int i, boolean z, java.lang.Integer num, com.truecaller.calling_common.ActionType actionType) {
        this.isVideo = z;
        this.nameRes = num;
        this.primaryAction = actionType;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.common_call_log.data.CallLogItemType resolve(@org.jetbrains.annotations.NotNull com.truecaller.data.entity.HistoryEvent historyEvent, @org.jetbrains.annotations.Nullable m03.d1 d1Var, boolean z) {
        Companion.getClass();
        return u41.bar.a(historyEvent, d1Var, z);
    }

    public static com.truecaller.common_call_log.data.CallLogItemType valueOf(java.lang.String str) {
        return (com.truecaller.common_call_log.data.CallLogItemType) java.lang.Enum.valueOf(com.truecaller.common_call_log.data.CallLogItemType.class, str);
    }

    public static com.truecaller.common_call_log.data.CallLogItemType[] values() {
        return (com.truecaller.common_call_log.data.CallLogItemType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName(@org.jetbrains.annotations.NotNull u03.b0 resourceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        java.lang.Integer num = this.nameRes;
        if (num != null) {
            return ((u03.g0) resourceProvider).h(num.intValue(), new java.lang.Object[0]);
        }
        return null;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNameRes() {
        return this.nameRes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.calling_common.ActionType getPrimaryAction() {
        return this.primaryAction;
    }

    /* renamed from: isVideo, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    public /* synthetic */ CallLogItemType(java.lang.String str, int i, boolean z, java.lang.Integer num, com.truecaller.calling_common.ActionType actionType, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? com.truecaller.calling_common.ActionType.CELLULAR_CALL : actionType);
    }
}
