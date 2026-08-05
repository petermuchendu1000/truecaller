package com.truecaller.commentfeedback.presentation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/commentfeedback/presentation/model/NumberAndComments;", "Landroid/os/Parcelable;", "number", "", "comments", "", "Lcom/truecaller/commentfeedback/presentation/model/CommentFeedbackModel;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getNumber", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NumberAndComments implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.commentfeedback.presentation.model.NumberAndComments> CREATOR = new er2.d(28);

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel> comments;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String number;

    public NumberAndComments(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "comments");
        this.number = str;
        this.comments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.commentfeedback.presentation.model.NumberAndComments copy$default(com.truecaller.commentfeedback.presentation.model.NumberAndComments numberAndComments, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = numberAndComments.number;
        }
        if ((i & 2) != 0) {
            list = numberAndComments.comments;
        }
        return numberAndComments.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNumber() {
        return this.number;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel> component2() {
        return this.comments;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.commentfeedback.presentation.model.NumberAndComments copy(@org.jetbrains.annotations.NotNull java.lang.String number, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel> comments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comments, "comments");
        return new com.truecaller.commentfeedback.presentation.model.NumberAndComments(number, comments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.commentfeedback.presentation.model.NumberAndComments)) {
            return false;
        }
        com.truecaller.commentfeedback.presentation.model.NumberAndComments numberAndComments = (com.truecaller.commentfeedback.presentation.model.NumberAndComments) other;
        return kotlin.jvm.internal.Intrinsics.b(this.number, numberAndComments.number) && kotlin.jvm.internal.Intrinsics.b(this.comments, numberAndComments.comments);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel> getComments() {
        return this.comments;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return this.comments.hashCode() + (this.number.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("NumberAndComments(number=", this.number, ", comments=", this.comments, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.number);
        java.util.Iterator f = z0.a0.f(this.comments, dest);
        while (f.hasNext()) {
            ((com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel) f.next()).writeToParcel(dest, flags);
        }
    }
}
