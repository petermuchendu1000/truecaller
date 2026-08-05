package com.truecaller.commentfeedback.presentation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006,"}, d2 = {"Lcom/truecaller/commentfeedback/presentation/model/PostedFeedbackModel;", "Landroid/os/Parcelable;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "phoneNumber", "name", "isVerified", "", "text", "avatarUrl", "anonymous", "postedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPhoneNumber", "getName", "()Z", "getText", "getAvatarUrl", "getAnonymous", "getPostedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class PostedFeedbackModel implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel> CREATOR = new er2.d(29);
    private final boolean anonymous;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String avatarUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    private final boolean isVerified;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String postedAt;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    public PostedFeedbackModel(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, boolean z, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, boolean z2, @org.jetbrains.annotations.NotNull java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "avatarUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "postedAt");
        this.id = str;
        this.phoneNumber = str2;
        this.name = str3;
        this.isVerified = z;
        this.text = str4;
        this.avatarUrl = str5;
        this.anonymous = z2;
        this.postedAt = str6;
    }

    public static /* synthetic */ com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel copy$default(com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel postedFeedbackModel, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = postedFeedbackModel.id;
        }
        if ((i & 2) != 0) {
            str2 = postedFeedbackModel.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = postedFeedbackModel.name;
        }
        if ((i & 8) != 0) {
            z = postedFeedbackModel.isVerified;
        }
        if ((i & 16) != 0) {
            str4 = postedFeedbackModel.text;
        }
        if ((i & 32) != 0) {
            str5 = postedFeedbackModel.avatarUrl;
        }
        if ((i & 64) != 0) {
            z2 = postedFeedbackModel.anonymous;
        }
        if ((i & 128) != 0) {
            str6 = postedFeedbackModel.postedAt;
        }
        boolean z3 = z2;
        java.lang.String str7 = str6;
        java.lang.String str8 = str4;
        java.lang.String str9 = str5;
        return postedFeedbackModel.copy(str, str2, str3, z, str8, str9, z3, str7);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAnonymous() {
        return this.anonymous;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component8, reason: from getter */
    public final java.lang.String getPostedAt() {
        return this.postedAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull java.lang.String name, boolean isVerified, @org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.NotNull java.lang.String avatarUrl, boolean anonymous, @org.jetbrains.annotations.NotNull java.lang.String postedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postedAt, "postedAt");
        return new com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel(id, phoneNumber, name, isVerified, text, avatarUrl, anonymous, postedAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel)) {
            return false;
        }
        com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel postedFeedbackModel = (com.truecaller.commentfeedback.presentation.model.PostedFeedbackModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, postedFeedbackModel.id) && kotlin.jvm.internal.Intrinsics.b(this.phoneNumber, postedFeedbackModel.phoneNumber) && kotlin.jvm.internal.Intrinsics.b(this.name, postedFeedbackModel.name) && this.isVerified == postedFeedbackModel.isVerified && kotlin.jvm.internal.Intrinsics.b(this.text, postedFeedbackModel.text) && kotlin.jvm.internal.Intrinsics.b(this.avatarUrl, postedFeedbackModel.avatarUrl) && this.anonymous == postedFeedbackModel.anonymous && kotlin.jvm.internal.Intrinsics.b(this.postedAt, postedFeedbackModel.postedAt);
    }

    public final boolean getAnonymous() {
        return this.anonymous;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPostedAt() {
        return this.postedAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.phoneNumber), 31, this.name);
        int i2 = 1237;
        if (this.isVerified) {
            i = 1231;
        } else {
            i = 1237;
        }
        int e2 = ax1.bar.e(ax1.bar.e((e + i) * 31, 31, this.text), 31, this.avatarUrl);
        if (this.anonymous) {
            i2 = 1231;
        }
        return this.postedAt.hashCode() + ((e2 + i2) * 31);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.phoneNumber;
        java.lang.String str3 = this.name;
        boolean z = this.isVerified;
        java.lang.String str4 = this.text;
        java.lang.String str5 = this.avatarUrl;
        boolean z2 = this.anonymous;
        java.lang.String str6 = this.postedAt;
        java.lang.StringBuilder E = ro0.f.E("PostedFeedbackModel(id=", str, ", phoneNumber=", str2, ", name=");
        com.google.android.gms.internal.ads.yj.l(str3, ", isVerified=", ", text=", E, z);
        bar.E(E, str4, ", avatarUrl=", str5, ", anonymous=");
        E.append(z2);
        E.append(", postedAt=");
        E.append(str6);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.name);
        dest.writeInt(this.isVerified ? 1 : 0);
        dest.writeString(this.text);
        dest.writeString(this.avatarUrl);
        dest.writeInt(this.anonymous ? 1 : 0);
        dest.writeString(this.postedAt);
    }
}
