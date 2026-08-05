package com.truecaller.cloudtelephony.callrecording.data.db;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/db/CallRecordingFeedbackResponseDto;", "", "success", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallRecordingFeedbackResponseDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    private final boolean success;

    public CallRecordingFeedbackResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        this.success = z;
        this.message = str;
    }

    public static /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto copy$default(com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto callRecordingFeedbackResponseDto, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = callRecordingFeedbackResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = callRecordingFeedbackResponseDto.message;
        }
        return callRecordingFeedbackResponseDto.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        return new com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto(success, message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto callRecordingFeedbackResponseDto = (com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackResponseDto) other;
        return this.success == callRecordingFeedbackResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.message, callRecordingFeedbackResponseDto.message);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.message.hashCode() + (i * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.s("CallRecordingFeedbackResponseDto(success=", this.success, ", message=", this.message, ")");
    }
}
