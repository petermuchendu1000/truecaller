package com.truecaller.settings.impl.ui.messaging;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/settings/impl/ui/messaging/MessagingSettings$SMSSettings$Companion", "", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class MessagingSettings$SMSSettings$Companion implements com.truecaller.settings.impl.ui.messaging.MessagingSettings {
    public static final /* synthetic */ com.truecaller.settings.impl.ui.messaging.MessagingSettings$SMSSettings$Companion a = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings$SMSSettings$Companion> CREATOR = new k90.bar(28);

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
