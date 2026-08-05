package com.truecaller.cloudtelephony.callrecording.data.db;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/db/CallRecordingFeedbackDto;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "rating", "", "<init>", "(Ljava/lang/String;I)V", "getType", "()Ljava/lang/String;", "getRating", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallRecordingFeedbackDto {
    public static final int $stable = 0;
    private final int rating;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;

    public CallRecordingFeedbackDto(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        this.type = str;
        this.rating = i;
    }

    public static /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto copy$default(com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto callRecordingFeedbackDto, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = callRecordingFeedbackDto.type;
        }
        if ((i2 & 2) != 0) {
            i = callRecordingFeedbackDto.rating;
        }
        return callRecordingFeedbackDto.copy(str, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto copy(@org.jetbrains.annotations.NotNull java.lang.String type, int rating) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        return new com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto(type, rating);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto callRecordingFeedbackDto = (com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingFeedbackDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.type, callRecordingFeedbackDto.type) && this.rating == callRecordingFeedbackDto.rating;
    }

    public final int getRating() {
        return this.rating;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.rating;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.i("CallRecordingFeedbackDto(type=", this.rating, this.type, ", rating=", ")");
    }
}
