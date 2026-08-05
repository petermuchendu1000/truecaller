package com.truecaller.call_assistant.campaigns.deeplinks.internal;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ReactivateVoicemail.a;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ReactivateVoicemail[i];
    }
}
