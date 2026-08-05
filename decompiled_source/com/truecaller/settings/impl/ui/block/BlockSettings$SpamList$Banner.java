package com.truecaller.settings.impl.ui.block;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/settings/impl/ui/block/BlockSettings$SpamList$Banner", "", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BlockSettings$SpamList$Banner implements com.truecaller.settings.impl.ui.block.BlockSettings {
    public static final com.truecaller.settings.impl.ui.block.BlockSettings$SpamList$Banner a = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.block.BlockSettings$SpamList$Banner> CREATOR = new er2.d(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}
