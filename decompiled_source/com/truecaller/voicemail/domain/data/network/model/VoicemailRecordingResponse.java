package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006 "}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailRecordingResponse;", "", "success", "", "url", "", "duration", "", "createdAt", "Ljava/util/Date;", "fileSignature", "<init>", "(ZLjava/lang/String;ILjava/util/Date;Ljava/lang/String;)V", "getSuccess", "()Z", "getUrl", "()Ljava/lang/String;", "getDuration", "()I", "getCreatedAt", "()Ljava/util/Date;", "getFileSignature", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailRecordingResponse {

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;
    private final int duration;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fileSignature;
    private final boolean success;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String url;

    public VoicemailRecordingResponse(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, int i, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fileSignature");
        this.success = z;
        this.url = str;
        this.duration = i;
        this.createdAt = date;
        this.fileSignature = str2;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse voicemailRecordingResponse, boolean z, java.lang.String str, int i, java.util.Date date, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = voicemailRecordingResponse.success;
        }
        if ((i2 & 2) != 0) {
            str = voicemailRecordingResponse.url;
        }
        if ((i2 & 4) != 0) {
            i = voicemailRecordingResponse.duration;
        }
        if ((i2 & 8) != 0) {
            date = voicemailRecordingResponse.createdAt;
        }
        if ((i2 & 16) != 0) {
            str2 = voicemailRecordingResponse.fileSignature;
        }
        java.lang.String str3 = str2;
        int i3 = i;
        return voicemailRecordingResponse.copy(z, str, i3, date, str3);
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

    /* renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFileSignature() {
        return this.fileSignature;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String url, int duration, @org.jetbrains.annotations.NotNull java.util.Date createdAt, @org.jetbrains.annotations.NotNull java.lang.String fileSignature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSignature, "fileSignature");
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse(success, url, duration, createdAt, fileSignature);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse voicemailRecordingResponse = (com.truecaller.voicemail.domain.data.network.model.VoicemailRecordingResponse) other;
        return this.success == voicemailRecordingResponse.success && kotlin.jvm.internal.Intrinsics.b(this.url, voicemailRecordingResponse.url) && this.duration == voicemailRecordingResponse.duration && kotlin.jvm.internal.Intrinsics.b(this.createdAt, voicemailRecordingResponse.createdAt) && kotlin.jvm.internal.Intrinsics.b(this.fileSignature, voicemailRecordingResponse.fileSignature);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    public final int getDuration() {
        return this.duration;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFileSignature() {
        return this.fileSignature;
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
        return this.fileSignature.hashCode() + uf.qux.h(this.createdAt, (ax1.bar.e(i * 31, 31, this.url) + this.duration) * 31, 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.url;
        int i = this.duration;
        java.util.Date date = this.createdAt;
        java.lang.String str2 = this.fileSignature;
        java.lang.StringBuilder u = bx.e1.u("VoicemailRecordingResponse(success=", ", url=", str, ", duration=", z);
        u.append(i);
        u.append(", createdAt=");
        u.append(date);
        u.append(", fileSignature=");
        return bar.v(str2, ")", u);
    }
}
