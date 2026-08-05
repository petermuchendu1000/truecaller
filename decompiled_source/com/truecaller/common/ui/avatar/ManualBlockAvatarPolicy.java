package com.truecaller.common.ui.avatar;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy;", "Landroid/os/Parcelable;", "BlockIconManualBlockAvatarPolicy", "ProfilePictureManualBlockAvatarPolicy", "Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy$BlockIconManualBlockAvatarPolicy;", "Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy$ProfilePictureManualBlockAvatarPolicy;", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public interface ManualBlockAvatarPolicy extends android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy$BlockIconManualBlockAvatarPolicy;", "Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy;", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final /* data */ class BlockIconManualBlockAvatarPolicy implements com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy {
        public static final com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.BlockIconManualBlockAvatarPolicy a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.BlockIconManualBlockAvatarPolicy> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.BlockIconManualBlockAvatarPolicy);
        }

        public final int hashCode() {
            return -516735778;
        }

        public final java.lang.String toString() {
            return "BlockIconManualBlockAvatarPolicy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy$ProfilePictureManualBlockAvatarPolicy;", "Lcom/truecaller/common/ui/avatar/ManualBlockAvatarPolicy;", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final /* data */ class ProfilePictureManualBlockAvatarPolicy implements com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy {
        public static final com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.ProfilePictureManualBlockAvatarPolicy a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.ProfilePictureManualBlockAvatarPolicy> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.ProfilePictureManualBlockAvatarPolicy);
        }

        public final int hashCode() {
            return -778780181;
        }

        public final java.lang.String toString() {
            return "ProfilePictureManualBlockAvatarPolicy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
