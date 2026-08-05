package com.truecaller.cloudtelephony.callrecording.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingNetworkDto;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCreatedAt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallRecordingNetworkDto {
    public static final int $stable = 0;

    @bw.qux("createdAt")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createdAt;

    @bw.qux("_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    public CallRecordingNetworkDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "createdAt");
        this.id = str;
        this.createdAt = str2;
    }

    public static /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto copy$default(com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto callRecordingNetworkDto, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = callRecordingNetworkDto.id;
        }
        if ((i & 2) != 0) {
            str2 = callRecordingNetworkDto.createdAt;
        }
        return callRecordingNetworkDto.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String createdAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto(id, createdAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto callRecordingNetworkDto = (com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, callRecordingNetworkDto.id) && kotlin.jvm.internal.Intrinsics.b(this.createdAt, callRecordingNetworkDto.createdAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.createdAt.hashCode() + (this.id.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("CallRecordingNetworkDto(id=", this.id, ", createdAt=", this.createdAt, ")");
    }
}
