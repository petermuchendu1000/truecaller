package com.truecaller.scamfeed.data.transport.settings.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/settings/entities/PushNotificationCategorySettingsRemote;", "", "", "isEnabled", "Lsm2/c;", "category", "<init>", "(ZLsm2/c;)V", "component1", "()Z", "component2", "()Lsm2/c;", "copy", "(ZLsm2/c;)Lcom/truecaller/scamfeed/data/transport/settings/entities/PushNotificationCategorySettingsRemote;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lsm2/c;", "getCategory", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class PushNotificationCategorySettingsRemote {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final sm2.c category;
    private final boolean isEnabled;

    public PushNotificationCategorySettingsRemote(boolean z, @org.jetbrains.annotations.NotNull sm2.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "category");
        this.isEnabled = z;
        this.category = cVar;
    }

    public static /* synthetic */ com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote copy$default(com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote pushNotificationCategorySettingsRemote, boolean z, sm2.c cVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pushNotificationCategorySettingsRemote.isEnabled;
        }
        if ((i & 2) != 0) {
            cVar = pushNotificationCategorySettingsRemote.category;
        }
        return pushNotificationCategorySettingsRemote.copy(z, cVar);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final sm2.c getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote copy(boolean isEnabled, @org.jetbrains.annotations.NotNull sm2.c category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        return new com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote(isEnabled, category);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote)) {
            return false;
        }
        com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote pushNotificationCategorySettingsRemote = (com.truecaller.scamfeed.data.transport.settings.entities.PushNotificationCategorySettingsRemote) other;
        return this.isEnabled == pushNotificationCategorySettingsRemote.isEnabled && kotlin.jvm.internal.Intrinsics.b(this.category, pushNotificationCategorySettingsRemote.category);
    }

    @org.jetbrains.annotations.NotNull
    public final sm2.c getCategory() {
        return this.category;
    }

    public int hashCode() {
        int i;
        if (this.isEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.category.hashCode() + (i * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "PushNotificationCategorySettingsRemote(isEnabled=" + this.isEnabled + ", category=" + this.category + ")";
    }
}
