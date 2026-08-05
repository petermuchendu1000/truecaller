package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/mediation/model/AdSize;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "width", "", "height", "groupIds", "", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "getId", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getGroupIds", "()Ljava/util/List;", "getSizeId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdSize {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> groupIds;
    private final int height;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    private final int width;

    public AdSize(@org.jetbrains.annotations.NotNull java.lang.String str, int i, int i2, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        this.id = str;
        this.width = i;
        this.height = i2;
        this.groupIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mediation.model.AdSize copy$default(com.truecaller.ads.mediation.model.AdSize adSize, java.lang.String str, int i, int i2, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = adSize.id;
        }
        if ((i3 & 2) != 0) {
            i = adSize.width;
        }
        if ((i3 & 4) != 0) {
            i2 = adSize.height;
        }
        if ((i3 & 8) != 0) {
            list = adSize.groupIds;
        }
        return adSize.copy(str, i, i2, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component4() {
        return this.groupIds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.AdSize copy(@org.jetbrains.annotations.NotNull java.lang.String id, int width, int height, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> groupIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        return new com.truecaller.ads.mediation.model.AdSize(id, width, height, groupIds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.AdSize)) {
            return false;
        }
        com.truecaller.ads.mediation.model.AdSize adSize = (com.truecaller.ads.mediation.model.AdSize) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, adSize.id) && this.width == adSize.width && this.height == adSize.height && kotlin.jvm.internal.Intrinsics.b(this.groupIds, adSize.groupIds);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getGroupIds() {
        return this.groupIds;
    }

    public final int getHeight() {
        return this.height;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSizeId() {
        java.lang.String str;
        java.util.List<java.lang.String> list = this.groupIds;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null && (str = (java.lang.String) kotlin.collections.CollectionsKt.o0(list, sf3.a.a)) != null) {
                return str;
            }
        }
        return this.id;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.width) * 31) + this.height) * 31;
        java.util.List<java.lang.String> list = this.groupIds;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        int i = this.width;
        int i2 = this.height;
        java.util.List<java.lang.String> list = this.groupIds;
        java.lang.StringBuilder z = bar.z("AdSize(id=", i, str, ", width=", ", height=");
        z.append(i2);
        z.append(", groupIds=");
        z.append(list);
        z.append(")");
        return z.toString();
    }

    public /* synthetic */ AdSize(java.lang.String str, int i, int i2, java.util.List list, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : list);
    }
}
