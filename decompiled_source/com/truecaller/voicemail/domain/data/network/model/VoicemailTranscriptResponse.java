package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailTranscriptResponse;", "", "success", "", "transcript", "", "language", "duration", "", "createdAt", "Ljava/util/Date;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ILjava/util/Date;)V", "getSuccess", "()Z", "getTranscript", "()Ljava/lang/String;", "getLanguage", "getDuration", "()I", "getCreatedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailTranscriptResponse {

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;
    private final int duration;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String language;
    private final boolean success;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String transcript;

    public VoicemailTranscriptResponse(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, int i, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "transcript");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        this.success = z;
        this.transcript = str;
        this.language = str2;
        this.duration = i;
        this.createdAt = date;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse voicemailTranscriptResponse, boolean z, java.lang.String str, java.lang.String str2, int i, java.util.Date date, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = voicemailTranscriptResponse.success;
        }
        if ((i2 & 2) != 0) {
            str = voicemailTranscriptResponse.transcript;
        }
        if ((i2 & 4) != 0) {
            str2 = voicemailTranscriptResponse.language;
        }
        if ((i2 & 8) != 0) {
            i = voicemailTranscriptResponse.duration;
        }
        if ((i2 & 16) != 0) {
            date = voicemailTranscriptResponse.createdAt;
        }
        java.util.Date date2 = date;
        java.lang.String str3 = str2;
        return voicemailTranscriptResponse.copy(z, str, str3, i, date2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTranscript() {
        return this.transcript;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String transcript, @org.jetbrains.annotations.Nullable java.lang.String language, int duration, @org.jetbrains.annotations.NotNull java.util.Date createdAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transcript, "transcript");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse(success, transcript, language, duration, createdAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse voicemailTranscriptResponse = (com.truecaller.voicemail.domain.data.network.model.VoicemailTranscriptResponse) other;
        return this.success == voicemailTranscriptResponse.success && kotlin.jvm.internal.Intrinsics.b(this.transcript, voicemailTranscriptResponse.transcript) && kotlin.jvm.internal.Intrinsics.b(this.language, voicemailTranscriptResponse.language) && this.duration == voicemailTranscriptResponse.duration && kotlin.jvm.internal.Intrinsics.b(this.createdAt, voicemailTranscriptResponse.createdAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    public final int getDuration() {
        return this.duration;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguage() {
        return this.language;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        int e = ax1.bar.e(i * 31, 31, this.transcript);
        java.lang.String str = this.language;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.createdAt.hashCode() + ((((e + hashCode) * 31) + this.duration) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.transcript;
        java.lang.String str2 = this.language;
        int i = this.duration;
        java.util.Date date = this.createdAt;
        java.lang.StringBuilder u = bx.e1.u("VoicemailTranscriptResponse(success=", ", transcript=", str, ", language=", z);
        t.c.x(i, str2, ", duration=", ", createdAt=", u);
        u.append(date);
        u.append(")");
        return u.toString();
    }

    public /* synthetic */ VoicemailTranscriptResponse(boolean z, java.lang.String str, java.lang.String str2, int i, java.util.Date date, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i2 & 4) != 0 ? null : str2, i, date);
    }
}
