package com.truecaller.settings.api.call_assistant;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting;", "Landroid/os/Parcelable;", "PhonebookContacts", "TopSpammers", "NonPhonebookCallers", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface CallAssistantScreeningSetting extends android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting;", "ScreenCalls", "RingPhone", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers$RingPhone;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers$ScreenCalls;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface NonPhonebookCallers extends com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers$RingPhone;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class RingPhone implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers.RingPhone a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers.RingPhone> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers$ScreenCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$NonPhonebookCallers;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class ScreenCalls implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers.ScreenCalls a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers.ScreenCalls> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting;", "ScreenCalls", "SendToVoicemail", "DoNotScreenCalls", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts$DoNotScreenCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts$ScreenCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts$SendToVoicemail;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface PhonebookContacts extends com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts$DoNotScreenCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class DoNotScreenCalls implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.DoNotScreenCalls a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.DoNotScreenCalls> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts$ScreenCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class ScreenCalls implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.ScreenCalls a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.ScreenCalls> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts$SendToVoicemail;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$PhonebookContacts;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class SendToVoicemail implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.SendToVoicemail a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.SendToVoicemail> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting;", "ScreenCalls", "RingPhone", "BlockCalls", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers$BlockCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers$RingPhone;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers$ScreenCalls;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface TopSpammers extends com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers$BlockCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class BlockCalls implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.BlockCalls a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.BlockCalls> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers$RingPhone;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class RingPhone implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.RingPhone a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.RingPhone> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers$ScreenCalls;", "Lcom/truecaller/settings/api/call_assistant/CallAssistantScreeningSetting$TopSpammers;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class ScreenCalls implements com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers {
            public static final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.ScreenCalls a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.ScreenCalls> CREATOR = new java.lang.Object();

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
