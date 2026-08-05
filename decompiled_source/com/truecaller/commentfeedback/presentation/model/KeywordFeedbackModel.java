package com.truecaller.commentfeedback.presentation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/commentfeedback/presentation/model/KeywordFeedbackModel;", "Landroid/os/Parcelable;", "keyword", "", "frequency", "", "<init>", "(Ljava/lang/String;D)V", "getKeyword", "()Ljava/lang/String;", "getFrequency", "()D", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class KeywordFeedbackModel implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel> CREATOR = new er2.d(27);
    private final double frequency;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String keyword;

    public KeywordFeedbackModel(@org.jetbrains.annotations.NotNull java.lang.String str, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "keyword");
        this.keyword = str;
        this.frequency = d;
    }

    public static /* synthetic */ com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel copy$default(com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel keywordFeedbackModel, java.lang.String str, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = keywordFeedbackModel.keyword;
        }
        if ((i & 2) != 0) {
            d = keywordFeedbackModel.frequency;
        }
        return keywordFeedbackModel.copy(str, d);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component2, reason: from getter */
    public final double getFrequency() {
        return this.frequency;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel copy(@org.jetbrains.annotations.NotNull java.lang.String keyword, double frequency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel(keyword, frequency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel)) {
            return false;
        }
        com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel keywordFeedbackModel = (com.truecaller.commentfeedback.presentation.model.KeywordFeedbackModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.keyword, keywordFeedbackModel.keyword) && java.lang.Double.compare(this.frequency, keywordFeedbackModel.frequency) == 0;
    }

    public final double getFrequency() {
        return this.frequency;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyword() {
        return this.keyword;
    }

    public int hashCode() {
        int hashCode = this.keyword.hashCode() * 31;
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.frequency);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "KeywordFeedbackModel(keyword=" + this.keyword + ", frequency=" + this.frequency + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.keyword);
        dest.writeDouble(this.frequency);
    }
}
