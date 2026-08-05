package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/truecaller/call_assistant/core/data/SendResponseActionResponseDto;", "", "", "success", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "answerCID", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/truecaller/call_assistant/core/data/SendResponseActionResponseDto;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Ljava/lang/String;", "getMessage", "getAnswerCID", "Companion", "vp0/j", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class SendResponseActionResponseDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final vp0.j Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final com.truecaller.call_assistant.core.data.SendResponseActionResponseDto SUCCESS = new com.truecaller.call_assistant.core.data.SendResponseActionResponseDto(true, "", "");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String answerCID;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    private final boolean success;

    public SendResponseActionResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "answerCID");
        this.success = z;
        this.message = str;
        this.answerCID = str2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.SendResponseActionResponseDto copy$default(com.truecaller.call_assistant.core.data.SendResponseActionResponseDto sendResponseActionResponseDto, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = sendResponseActionResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = sendResponseActionResponseDto.message;
        }
        if ((i & 4) != 0) {
            str2 = sendResponseActionResponseDto.answerCID;
        }
        return sendResponseActionResponseDto.copy(z, str, str2);
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
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAnswerCID() {
        return this.answerCID;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.SendResponseActionResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.lang.String answerCID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(answerCID, "answerCID");
        return new com.truecaller.call_assistant.core.data.SendResponseActionResponseDto(success, message, answerCID);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.SendResponseActionResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.SendResponseActionResponseDto sendResponseActionResponseDto = (com.truecaller.call_assistant.core.data.SendResponseActionResponseDto) other;
        return this.success == sendResponseActionResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.message, sendResponseActionResponseDto.message) && kotlin.jvm.internal.Intrinsics.b(this.answerCID, sendResponseActionResponseDto.answerCID);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnswerCID() {
        return this.answerCID;
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
        return this.answerCID.hashCode() + ax1.bar.e(i * 31, 31, this.message);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        return bar.v(this.answerCID, ")", bx.e1.u("SendResponseActionResponseDto(success=", ", message=", this.message, ", answerCID=", z));
    }
}
