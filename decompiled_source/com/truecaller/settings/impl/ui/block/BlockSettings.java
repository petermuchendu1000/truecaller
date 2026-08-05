package com.truecaller.settings.impl.ui.block;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings;", "Lcom/truecaller/settings/impl/framework/ui/model/CategoryType;", "HowToHandleSpamCalls", "ThreeLevelOfSpam", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface BlockSettings extends com.truecaller.settings.impl.framework.ui.model.CategoryType {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings;", "Companion", "HowToHandleSpamCallOptions", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls$Companion;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls$HowToHandleSpamCallOptions;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface HowToHandleSpamCalls extends com.truecaller.settings.impl.ui.block.BlockSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls$Companion;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls$HowToHandleSpamCallOptions;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$HowToHandleSpamCalls;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class HowToHandleSpamCallOptions implements com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls {
            public static final com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.HowToHandleSpamCallOptions a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.HowToHandleSpamCallOptions> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings;", "Companion", "MessagingThreeLevelOfSpamStatus", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam$Companion;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam$MessagingThreeLevelOfSpamStatus;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface ThreeLevelOfSpam extends com.truecaller.settings.impl.ui.block.BlockSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam$Companion;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam$MessagingThreeLevelOfSpamStatus;", "Lcom/truecaller/settings/impl/ui/block/BlockSettings$ThreeLevelOfSpam;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class MessagingThreeLevelOfSpamStatus implements com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam {
            public static final com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus> CREATOR = new java.lang.Object();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus);
            }

            public final int hashCode() {
                return -238789630;
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
