package com.truecaller.settings.impl.ui.call_assistant;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings;", "Lcom/truecaller/settings/impl/framework/ui/model/CategoryType;", "NewAssistantSettings", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface CallAssistantSettings extends com.truecaller.settings.impl.framework.ui.model.CategoryType {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings;", "Companion", "LanguageAndVoices", "Greetings", "QuickReplies", "CallRules", "Privacy", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$CallRules;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$Companion;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$Greetings;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$LanguageAndVoices;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$Privacy;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$QuickReplies;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface NewAssistantSettings extends com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$CallRules;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class CallRules implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings {
            public static final com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.CallRules a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.CallRules> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$Companion;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$Greetings;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Greetings implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings {
            public static final com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Greetings a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Greetings> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$LanguageAndVoices;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class LanguageAndVoices implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings {
            public static final com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.LanguageAndVoices a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.LanguageAndVoices> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$Privacy;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Privacy implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings {
            public static final com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Privacy a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Privacy> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings$QuickReplies;", "Lcom/truecaller/settings/impl/ui/call_assistant/CallAssistantSettings$NewAssistantSettings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class QuickReplies implements com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings {
            public static final com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.QuickReplies a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.QuickReplies> CREATOR = new java.lang.Object();

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
