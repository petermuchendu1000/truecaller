package com.truecaller.scamfeed.data.transport.settings.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/settings/entities/PushNotificationSettingsRemote;", "", "isEnabled", "", "childSettings", "", "Lcom/truecaller/scamfeed/data/transport/settings/entities/PushNotificationCategorySettingsRemote;", "<init>", "(ZLjava/util/List;)V", "()Z", "getChildSettings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class PushNotificationSettingsRemote {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote> childSettings;
    private final boolean isEnabled;

    public PushNotificationSettingsRemote(boolean z, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "childSettings");
        this.isEnabled = z;
        this.childSettings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote copy$default(com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote pushNotificationSettingsRemote, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pushNotificationSettingsRemote.isEnabled;
        }
        if ((i & 2) != 0) {
            list = pushNotificationSettingsRemote.childSettings;
        }
        return pushNotificationSettingsRemote.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote> component2() {
        return this.childSettings;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote copy(boolean isEnabled, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote> childSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childSettings, "childSettings");
        return new com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote(isEnabled, childSettings);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote)) {
            return false;
        }
        com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote pushNotificationSettingsRemote = (com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationSettingsRemote) other;
        return this.isEnabled == pushNotificationSettingsRemote.isEnabled && kotlin.jvm.internal.Intrinsics.b(this.childSettings, pushNotificationSettingsRemote.childSettings);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote> getChildSettings() {
        return this.childSettings;
    }

    public int hashCode() {
        int i;
        if (this.isEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.childSettings.hashCode() + (i * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "PushNotificationSettingsRemote(isEnabled=" + this.isEnabled + ", childSettings=" + this.childSettings + ")";
    }
}
