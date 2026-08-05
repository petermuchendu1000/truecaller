package com.truecaller.settings.impl.ui.general;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings;", "Lcom/truecaller/settings/impl/framework/ui/model/CategoryType;", "Appearance", "Backup", "EnhancedSearch", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface GeneralSettings extends com.truecaller.settings.impl.framework.ui.model.CategoryType {

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings;", "Companion", "Default", "Bright", "Dark", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Bright;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Companion;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Dark;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Default;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface Appearance extends com.truecaller.settings.impl.ui.general.GeneralSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Bright;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Bright implements com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Bright a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Bright> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Companion;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Dark;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Dark implements com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Dark a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Dark> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance$Default;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Appearance;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Default implements com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Default a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Default> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings;", "Companion", "ChangeBackup", "Video", "Frequency", com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_NETWORK, "GoogleAccount", "BackupNow", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$BackupNow;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$ChangeBackup;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Companion;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Frequency;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$GoogleAccount;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Network;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Video;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface Backup extends com.truecaller.settings.impl.ui.general.GeneralSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$BackupNow;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class BackupNow implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.BackupNow a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.BackupNow> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$ChangeBackup;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class ChangeBackup implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.ChangeBackup a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.ChangeBackup> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Companion;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Companion> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Frequency;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Frequency implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Frequency a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Frequency> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$GoogleAccount;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class GoogleAccount implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.GoogleAccount a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.GoogleAccount> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Network;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Network implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Network a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Network> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup$Video;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$Backup;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Video implements com.truecaller.settings.impl.ui.general.GeneralSettings.Backup {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Video a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Video> CREATOR = new java.lang.Object();

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

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings;", "Companion", "ChangeEnhancedSearch", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch$ChangeEnhancedSearch;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch$Companion;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface EnhancedSearch extends com.truecaller.settings.impl.ui.general.GeneralSettings {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch$ChangeEnhancedSearch;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class ChangeEnhancedSearch implements com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch {
            public static final com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch.ChangeEnhancedSearch a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch.ChangeEnhancedSearch> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch$Companion;", "Lcom/truecaller/settings/impl/ui/general/GeneralSettings$EnhancedSearch;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Companion implements com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch {
            public static final /* synthetic */ com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch.Companion a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch.Companion> CREATOR = new java.lang.Object();

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
