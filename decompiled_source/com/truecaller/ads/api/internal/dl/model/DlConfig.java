package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlConfig;", "", "version", "", "screens", "", "Lcom/truecaller/ads/api/internal/dl/model/DlScreen;", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getScreens", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlConfig {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.api.internal.dl.model.DlScreen> screens;
    private final int version;

    public DlConfig(int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlScreen> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "screens");
        this.version = i;
        this.screens = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlConfig copy$default(com.truecaller.ads.api.internal.dl.model.DlConfig dlConfig, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = dlConfig.version;
        }
        if ((i2 & 2) != 0) {
            list = dlConfig.screens;
        }
        return dlConfig.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlScreen> component2() {
        return this.screens;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlConfig copy(int version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlScreen> screens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screens, "screens");
        return new com.truecaller.ads.api.internal.dl.model.DlConfig(version, screens);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlConfig)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlConfig dlConfig = (com.truecaller.ads.api.internal.dl.model.DlConfig) other;
        return this.version == dlConfig.version && kotlin.jvm.internal.Intrinsics.b(this.screens, dlConfig.screens);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlScreen> getScreens() {
        return this.screens;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.screens.hashCode() + (this.version * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "DlConfig(version=" + this.version + ", screens=" + this.screens + ")";
    }
}
