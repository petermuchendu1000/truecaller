package com.truecaller.truestory.domain.data.remote.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/truecaller/truestory/domain/data/remote/entity/TrueStoryItem;", "", "id", "", "url", "validFor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getUrl", "getValidFor", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TrueStoryItem {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String url;
    private final int validFor;

    public TrueStoryItem(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "url");
        this.id = str;
        this.url = str2;
        this.validFor = i;
    }

    public static /* synthetic */ com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem copy$default(com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem trueStoryItem, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = trueStoryItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = trueStoryItem.url;
        }
        if ((i2 & 4) != 0) {
            i = trueStoryItem.validFor;
        }
        return trueStoryItem.copy(str, str2, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final int getValidFor() {
        return this.validFor;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String url, int validFor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem(id, url, validFor);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem)) {
            return false;
        }
        com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem trueStoryItem = (com.truecaller.truestory.domain.data.remote.entity.TrueStoryItem) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, trueStoryItem.id) && kotlin.jvm.internal.Intrinsics.b(this.url, trueStoryItem.url) && this.validFor == trueStoryItem.validFor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return this.url;
    }

    public final int getValidFor() {
        return this.validFor;
    }

    public int hashCode() {
        return ax1.bar.e(this.id.hashCode() * 31, 31, this.url) + this.validFor;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.m(this.validFor, ")", ro0.f.E("TrueStoryItem(id=", this.id, ", url=", this.url, ", validFor="));
    }

    public /* synthetic */ TrueStoryItem(java.lang.String str, java.lang.String str2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 7 : i);
    }
}
