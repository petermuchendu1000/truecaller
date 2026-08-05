package com.truecaller.details_view.ui.comments.single.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/ui/comments/single/model/CommentUiModel;", "Landroid/os/Parcelable;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CommentUiModel implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.details_view.ui.comments.single.model.CommentUiModel> CREATOR = new cb1.bar(0);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final com.truecaller.common.ui.avatar.AvatarXConfig e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final com.truecaller.details_view.ui.comments.single.model.ThumbState h;
    public final com.truecaller.details_view.ui.comments.single.model.ThumbState i;
    public final com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel j;

    public CommentUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig, java.lang.String str4, java.lang.String str5, com.truecaller.details_view.ui.comments.single.model.ThumbState thumbState, com.truecaller.details_view.ui.comments.single.model.ThumbState thumbState2, com.truecaller.commentfeedback.presentation.model.CommentFeedbackModel commentFeedbackModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "originalPoster");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarXConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "postedAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thumbState, "thumbUpState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thumbState2, "thumbDownState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentFeedbackModel, "commentFeedbackModel");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = avatarXConfig;
        this.f = str4;
        this.g = str5;
        this.h = thumbState;
        this.i = thumbState2;
        this.j = commentFeedbackModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.details_view.ui.comments.single.model.CommentUiModel)) {
            return false;
        }
        com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, commentUiModel.a) && kotlin.jvm.internal.Intrinsics.b(this.b, commentUiModel.b) && kotlin.jvm.internal.Intrinsics.b(this.c, commentUiModel.c) && this.d == commentUiModel.d && kotlin.jvm.internal.Intrinsics.b(this.e, commentUiModel.e) && kotlin.jvm.internal.Intrinsics.b(this.f, commentUiModel.f) && kotlin.jvm.internal.Intrinsics.b(this.g, commentUiModel.g) && kotlin.jvm.internal.Intrinsics.b(this.h, commentUiModel.h) && kotlin.jvm.internal.Intrinsics.b(this.i, commentUiModel.i) && kotlin.jvm.internal.Intrinsics.b(this.j, commentUiModel.j);
    }

    public final int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ax1.bar.e(ax1.bar.e((this.e.hashCode() + ((e + i) * 31)) * 31, 31, this.f), 31, this.g)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("CommentUiModel(id=", this.a, ", phoneNumber=", this.b, ", originalPoster=");
        com.google.android.gms.internal.ads.yj.l(this.c, ", isVerified=", ", avatarXConfig=", E, this.d);
        E.append(this.e);
        E.append(", postedAt=");
        E.append(this.f);
        E.append(", text=");
        E.append(this.g);
        E.append(", thumbUpState=");
        E.append(this.h);
        E.append(", thumbDownState=");
        E.append(this.i);
        E.append(", commentFeedbackModel=");
        E.append(this.j);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
    }
}
