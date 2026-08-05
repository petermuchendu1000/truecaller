package com.truecaller.name_quality_feedback.internal.upload;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/name_quality_feedback/internal/upload/NameQualityFeedbackDto;", "", "normalizedPhoneNumber", "", "shownName", "feedbackType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Lcom/truecaller/name_quality_feedback/model/FeedbackType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/name_quality_feedback/model/FeedbackType;)V", "getNormalizedPhoneNumber", "()Ljava/lang/String;", "getShownName", "getFeedbackType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "name-quality-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class NameQualityFeedbackDto {

    @bw.qux("feedback")
    private final int feedbackType;

    @bw.qux("phone")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String normalizedPhoneNumber;

    @bw.qux("name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shownName;

    private NameQualityFeedbackDto(java.lang.String str, java.lang.String str2, int i) {
        this.normalizedPhoneNumber = str;
        this.shownName = str2;
        this.feedbackType = i;
    }

    public static /* synthetic */ com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto copy$default(com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto nameQualityFeedbackDto, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = nameQualityFeedbackDto.normalizedPhoneNumber;
        }
        if ((i2 & 2) != 0) {
            str2 = nameQualityFeedbackDto.shownName;
        }
        if ((i2 & 4) != 0) {
            i = nameQualityFeedbackDto.feedbackType;
        }
        return nameQualityFeedbackDto.copy(str, str2, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNormalizedPhoneNumber() {
        return this.normalizedPhoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getShownName() {
        return this.shownName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFeedbackType() {
        return this.feedbackType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto copy(@org.jetbrains.annotations.NotNull java.lang.String normalizedPhoneNumber, @org.jetbrains.annotations.NotNull java.lang.String shownName, int feedbackType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedPhoneNumber, "normalizedPhoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shownName, "shownName");
        return new com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto(normalizedPhoneNumber, shownName, feedbackType);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto)) {
            return false;
        }
        com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto nameQualityFeedbackDto = (com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.normalizedPhoneNumber, nameQualityFeedbackDto.normalizedPhoneNumber) && kotlin.jvm.internal.Intrinsics.b(this.shownName, nameQualityFeedbackDto.shownName) && this.feedbackType == nameQualityFeedbackDto.feedbackType;
    }

    public final int getFeedbackType() {
        return this.feedbackType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNormalizedPhoneNumber() {
        return this.normalizedPhoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShownName() {
        return this.shownName;
    }

    public int hashCode() {
        return ax1.bar.e(this.normalizedPhoneNumber.hashCode() * 31, 31, this.shownName) + this.feedbackType;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.m(this.feedbackType, ")", ro0.f.E("NameQualityFeedbackDto(normalizedPhoneNumber=", this.normalizedPhoneNumber, ", shownName=", this.shownName, ", feedbackType="));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NameQualityFeedbackDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.name_quality_feedback.model.FeedbackType feedbackType) {
        this(str, str2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "normalizedPhoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "shownName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        int i = c52.bar.a[feedbackType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new java.lang.RuntimeException();
            }
        }
    }
}
