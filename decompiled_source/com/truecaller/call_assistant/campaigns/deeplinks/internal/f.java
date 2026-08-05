package com.truecaller.call_assistant.campaigns.deeplinks.internal;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel[i];
    }
}
