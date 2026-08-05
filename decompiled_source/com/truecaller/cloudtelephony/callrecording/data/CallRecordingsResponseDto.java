package com.truecaller.cloudtelephony.callrecording.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingsResponseDto;", "", "isLast", "", "recordings", "", "Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingNetworkDto;", "<init>", "(ZLjava/util/List;)V", "()Z", "getRecordings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallRecordingsResponseDto {
    public static final int $stable = 8;

    @bw.qux("isLast")
    private final boolean isLast;

    @bw.qux("recordings")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto> recordings;

    public CallRecordingsResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "recordings");
        this.isLast = z;
        this.recordings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto copy$default(com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto callRecordingsResponseDto, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = callRecordingsResponseDto.isLast;
        }
        if ((i & 2) != 0) {
            list = callRecordingsResponseDto.recordings;
        }
        return callRecordingsResponseDto.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto> component2() {
        return this.recordings;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto copy(boolean isLast, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto> recordings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordings, "recordings");
        return new com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto(isLast, recordings);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto callRecordingsResponseDto = (com.truecaller.cloudtelephony.callrecording.data.CallRecordingsResponseDto) other;
        return this.isLast == callRecordingsResponseDto.isLast && kotlin.jvm.internal.Intrinsics.b(this.recordings, callRecordingsResponseDto.recordings);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.cloudtelephony.callrecording.data.CallRecordingNetworkDto> getRecordings() {
        return this.recordings;
    }

    public int hashCode() {
        int i;
        if (this.isLast) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.recordings.hashCode() + (i * 31);
    }

    public final boolean isLast() {
        return this.isLast;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CallRecordingsResponseDto(isLast=" + this.isLast + ", recordings=" + this.recordings + ")";
    }
}
