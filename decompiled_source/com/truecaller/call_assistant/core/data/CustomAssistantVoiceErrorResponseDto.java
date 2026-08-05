package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/data/CustomAssistantVoiceErrorResponseDto;", "", "status", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(ILjava/lang/String;)V", "getStatus", "()I", "getMessage", "()Ljava/lang/String;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomAssistantVoiceErrorResponseDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String message;
    private final int status;

    public CustomAssistantVoiceErrorResponseDto(int i, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.status = i;
        this.message = str;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }
}
