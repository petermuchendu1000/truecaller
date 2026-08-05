package com.truecaller.settings.impl.ui.messaging;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings;", "Lcom/truecaller/settings/impl/framework/ui/model/CategoryType;", "MessageID", "Sim2", "ThreeLevelOfSpam", "FraudWarnings", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface MessagingSettings extends com.truecaller.settings.impl.framework.ui.model.CategoryType {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings;", "Companion", "FraudWarningsToggle", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings$FraudWarningsToggle;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface FraudWarnings extends com.truecaller.settings.impl.ui.messaging.MessagingSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings$FraudWarningsToggle;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$FraudWarnings;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class FraudWarningsToggle implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings {
            public static final com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings.FraudWarningsToggle a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings.FraudWarningsToggle> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings;", "Companion", "ManagePreferences", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID$ManagePreferences;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface MessageID extends com.truecaller.settings.impl.ui.messaging.MessagingSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID$ManagePreferences;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$MessageID;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class ManagePreferences implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID {
            public static final com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID.ManagePreferences a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID.ManagePreferences> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings;", "Companion", "SMSDeliveryReports", "AutoDownloadMMS", "AutoDownloadMMSWhenRoaming", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$AutoDownloadMMS;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$AutoDownloadMMSWhenRoaming;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$SMSDeliveryReports;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface Sim2 extends com.truecaller.settings.impl.ui.messaging.MessagingSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$AutoDownloadMMS;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class AutoDownloadMMS implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2 {
            public static final com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.AutoDownloadMMS a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.AutoDownloadMMS> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$AutoDownloadMMSWhenRoaming;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class AutoDownloadMMSWhenRoaming implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2 {
            public static final com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.AutoDownloadMMSWhenRoaming a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.AutoDownloadMMSWhenRoaming> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2 {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2$SMSDeliveryReports;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$Sim2;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class SMSDeliveryReports implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2 {
            public static final com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.SMSDeliveryReports a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.SMSDeliveryReports> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings;", "Companion", "MessagingThreeLevelOfSpamStatus", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam$MessagingThreeLevelOfSpamStatus;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface ThreeLevelOfSpam extends com.truecaller.settings.impl.ui.messaging.MessagingSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam$Companion;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam$MessagingThreeLevelOfSpamStatus;", "Lcom/truecaller/settings/impl/ui/messaging/MessagingSettings$ThreeLevelOfSpam;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class MessagingThreeLevelOfSpamStatus implements com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam {
            public static final com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus> CREATOR = new java.lang.Object();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus);
            }

            public final int hashCode() {
                return 1129771028;
            }

            public final java.lang.String toString() {
                return "MessagingThreeLevelOfSpamStatus";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeInt(1);
            }
        }
    }
}
