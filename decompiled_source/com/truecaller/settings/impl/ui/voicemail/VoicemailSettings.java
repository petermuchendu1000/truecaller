package com.truecaller.settings.impl.ui.voicemail;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings;", "Lcom/truecaller/settings/impl/framework/ui/model/CategoryType;", "CallRulesSettings", "Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface VoicemailSettings extends com.truecaller.settings.impl.framework.ui.model.CategoryType {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings;", "Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings;", "Companion", "SendContactsToVoicemail", "Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings$Companion;", "Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings$SendContactsToVoicemail;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface CallRulesSettings extends com.truecaller.settings.impl.ui.voicemail.VoicemailSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings$Companion;", "Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.voicemail.VoicemailSettings.CallRulesSettings {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.voicemail.VoicemailSettings.CallRulesSettings.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.voicemail.VoicemailSettings.CallRulesSettings.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings$SendContactsToVoicemail;", "Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettings$CallRulesSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class SendContactsToVoicemail implements com.truecaller.settings.impl.ui.voicemail.VoicemailSettings.CallRulesSettings {
            public static final com.truecaller.settings.impl.ui.voicemail.VoicemailSettings.CallRulesSettings.SendContactsToVoicemail a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.voicemail.VoicemailSettings.CallRulesSettings.SendContactsToVoicemail> CREATOR = new java.lang.Object();

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
    }
}
