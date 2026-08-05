package com.truecaller.settings.impl.ui.call_assistant;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$AssistantPreferences$DeleteYourVoice", "", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class CallAssistantSettings$AssistantPreferences$DeleteYourVoice implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings {
    public static final com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$DeleteYourVoice a = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$DeleteYourVoice> CREATOR = new or2.qux(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        return this == obj || (obj instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$DeleteYourVoice);
    }

    public final int hashCode() {
        return 946610349;
    }

    public final java.lang.String toString() {
        return "DeleteYourVoice";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}
