package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/truecaller/call_assistant/core/data/GetRecordingURLResponseDto;", "", "success", "", "url", "", "recordingStatus", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Z", "getUrl", "()Ljava/lang/String;", "getRecordingStatus", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class GetRecordingURLResponseDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String recordingStatus;
    private final boolean success;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String url;

    public GetRecordingURLResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "recordingStatus");
        this.success = z;
        this.url = str;
        this.recordingStatus = str2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto copy$default(com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto getRecordingURLResponseDto, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = getRecordingURLResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = getRecordingURLResponseDto.url;
        }
        if ((i & 4) != 0) {
            str2 = getRecordingURLResponseDto.recordingStatus;
        }
        return getRecordingURLResponseDto.copy(z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRecordingStatus() {
        return this.recordingStatus;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String url, @org.jetbrains.annotations.NotNull java.lang.String recordingStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordingStatus, "recordingStatus");
        return new com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto(success, url, recordingStatus);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto getRecordingURLResponseDto = (com.truecaller.call_assistant.core.data.GetRecordingURLResponseDto) other;
        return this.success == getRecordingURLResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.url, getRecordingURLResponseDto.url) && kotlin.jvm.internal.Intrinsics.b(this.recordingStatus, getRecordingURLResponseDto.recordingStatus);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRecordingStatus() {
        return this.recordingStatus;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.recordingStatus.hashCode() + ax1.bar.e(i * 31, 31, this.url);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        return bar.v(this.recordingStatus, ")", bx.e1.u("GetRecordingURLResponseDto(success=", ", url=", this.url, ", recordingStatus=", z));
    }
}
