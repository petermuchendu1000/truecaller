package com.truecaller.details_view.ui.comments.single.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/details_view/ui/comments/single/model/ThumbState;", "Landroid/os/Parcelable;", "ThumbUpDefault", "ThumbUpPressed", "ThumbDownDefault", "ThumbDownPressed", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbDownDefault;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbDownPressed;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbUpDefault;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbUpPressed;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class ThumbState implements android.os.Parcelable {
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final int d;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbDownDefault;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ThumbDownDefault extends com.truecaller.details_view.ui.comments.single.model.ThumbState {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownDefault> CREATOR = new java.lang.Object();
        public final int e;
        public final java.lang.String f;
        public final int g;
        public final int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThumbDownDefault(int i, java.lang.String str, int i2, int i3) {
            super(2131232514, str, i2, i3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countForDisplay");
            this.e = i;
            this.f = str;
            this.g = i2;
            this.h = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownDefault)) {
                return false;
            }
            com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownDefault thumbDownDefault = (com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownDefault) obj;
            return this.e == thumbDownDefault.e && kotlin.jvm.internal.Intrinsics.b(this.f, thumbDownDefault.f) && this.g == thumbDownDefault.g && this.h == thumbDownDefault.h;
        }

        public final int hashCode() {
            return ((ax1.bar.e(this.e * 31, 31, this.f) + this.g) * 31) + this.h;
        }

        public final java.lang.String toString() {
            return h8.s0.l(this.g, this.h, ", colorIcon=", ")", qb.qux.r("ThumbDownDefault(count=", this.e, ", countForDisplay=", this.f, ", color="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbDownPressed;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ThumbDownPressed extends com.truecaller.details_view.ui.comments.single.model.ThumbState {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownPressed> CREATOR = new java.lang.Object();
        public final int e;
        public final java.lang.String f;
        public final int g;
        public final int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThumbDownPressed(int i, java.lang.String str, int i2, int i3) {
            super(2131233064, str, i2, i3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countForDisplay");
            this.e = i;
            this.f = str;
            this.g = i2;
            this.h = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownPressed)) {
                return false;
            }
            com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownPressed thumbDownPressed = (com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbDownPressed) obj;
            return this.e == thumbDownPressed.e && kotlin.jvm.internal.Intrinsics.b(this.f, thumbDownPressed.f) && this.g == thumbDownPressed.g && this.h == thumbDownPressed.h;
        }

        public final int hashCode() {
            return ((ax1.bar.e(this.e * 31, 31, this.f) + this.g) * 31) + this.h;
        }

        public final java.lang.String toString() {
            return h8.s0.l(this.g, this.h, ", colorIcon=", ")", qb.qux.r("ThumbDownPressed(count=", this.e, ", countForDisplay=", this.f, ", color="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbUpDefault;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ThumbUpDefault extends com.truecaller.details_view.ui.comments.single.model.ThumbState {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpDefault> CREATOR = new java.lang.Object();
        public final int e;
        public final java.lang.String f;
        public final int g;
        public final int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThumbUpDefault(int i, java.lang.String str, int i2, int i3) {
            super(2131232515, str, i2, i3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countForDisplay");
            this.e = i;
            this.f = str;
            this.g = i2;
            this.h = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpDefault)) {
                return false;
            }
            com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpDefault thumbUpDefault = (com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpDefault) obj;
            return this.e == thumbUpDefault.e && kotlin.jvm.internal.Intrinsics.b(this.f, thumbUpDefault.f) && this.g == thumbUpDefault.g && this.h == thumbUpDefault.h;
        }

        public final int hashCode() {
            return ((ax1.bar.e(this.e * 31, 31, this.f) + this.g) * 31) + this.h;
        }

        public final java.lang.String toString() {
            return h8.s0.l(this.g, this.h, ", colorIcon=", ")", qb.qux.r("ThumbUpDefault(count=", this.e, ", countForDisplay=", this.f, ", color="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/ui/comments/single/model/ThumbState$ThumbUpPressed;", "Lcom/truecaller/details_view/ui/comments/single/model/ThumbState;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ThumbUpPressed extends com.truecaller.details_view.ui.comments.single.model.ThumbState {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed> CREATOR = new java.lang.Object();
        public final int e;
        public final java.lang.String f;
        public final int g;
        public final int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThumbUpPressed(int i, java.lang.String str, int i2, int i3) {
            super(2131233065, str, i2, i3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countForDisplay");
            this.e = i;
            this.f = str;
            this.g = i2;
            this.h = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed)) {
                return false;
            }
            com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed thumbUpPressed = (com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed) obj;
            return this.e == thumbUpPressed.e && kotlin.jvm.internal.Intrinsics.b(this.f, thumbUpPressed.f) && this.g == thumbUpPressed.g && this.h == thumbUpPressed.h;
        }

        public final int hashCode() {
            return ((ax1.bar.e(this.e * 31, 31, this.f) + this.g) * 31) + this.h;
        }

        public final java.lang.String toString() {
            return h8.s0.l(this.g, this.h, ", colorIcon=", ")", qb.qux.r("ThumbUpPressed(count=", this.e, ", countForDisplay=", this.f, ", color="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    public ThumbState(int i, java.lang.String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }
}
