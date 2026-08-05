package com.truecaller.settings.impl.ui.watch;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/settings/impl/ui/watch/WatchSettings$Instructions$InstructionList", "", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WatchSettings$Instructions$InstructionList implements com.truecaller.settings.impl.ui.watch.WatchSettings {
    public static final com.truecaller.settings.impl.ui.watch.WatchSettings$Instructions$InstructionList a = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.watch.WatchSettings$Instructions$InstructionList> CREATOR = new xs2.f(1);

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
