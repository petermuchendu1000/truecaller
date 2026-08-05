package com.truecaller.spamcategories;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/truecaller/spamcategories/SpamCategoryEntity;", "", "id", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "", "icon", "rowId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getIcon", "getRowId", "()Ljava/lang/Long;", "setRowId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/truecaller/spamcategories/SpamCategoryEntity;", "equals", "", "other", "hashCode", "", "toString", "spamcategories_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SpamCategoryEntity {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String icon;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.Nullable
    private java.lang.Long rowId;

    public SpamCategoryEntity(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        this.id = j;
        this.name = str;
        this.icon = str2;
        this.rowId = l;
    }

    public static /* synthetic */ com.truecaller.spamcategories.SpamCategoryEntity copy$default(com.truecaller.spamcategories.SpamCategoryEntity spamCategoryEntity, long j, java.lang.String str, java.lang.String str2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = spamCategoryEntity.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = spamCategoryEntity.name;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = spamCategoryEntity.icon;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            l = spamCategoryEntity.rowId;
        }
        return spamCategoryEntity.copy(j2, str3, str4, l);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIcon() {
        return this.icon;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getRowId() {
        return this.rowId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.spamcategories.SpamCategoryEntity copy(long id, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String icon, @org.jetbrains.annotations.Nullable java.lang.Long rowId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        return new com.truecaller.spamcategories.SpamCategoryEntity(id, name, icon, rowId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.spamcategories.SpamCategoryEntity)) {
            return false;
        }
        com.truecaller.spamcategories.SpamCategoryEntity spamCategoryEntity = (com.truecaller.spamcategories.SpamCategoryEntity) other;
        return this.id == spamCategoryEntity.id && kotlin.jvm.internal.Intrinsics.b(this.name, spamCategoryEntity.name) && kotlin.jvm.internal.Intrinsics.b(this.icon, spamCategoryEntity.icon) && kotlin.jvm.internal.Intrinsics.b(this.rowId, spamCategoryEntity.rowId);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getRowId() {
        return this.rowId;
    }

    public int hashCode() {
        int hashCode;
        long j = this.id;
        int e = ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.name);
        java.lang.String str = this.icon;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.Long l = this.rowId;
        if (l != null) {
            i = l.hashCode();
        }
        return i2 + i;
    }

    public final void setRowId(@org.jetbrains.annotations.Nullable java.lang.Long l) {
        this.rowId = l;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.name;
        java.lang.String str2 = this.icon;
        java.lang.Long l = this.rowId;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("SpamCategoryEntity(id=", j, ", name=", str);
        p.append(", icon=");
        p.append(str2);
        p.append(", rowId=");
        p.append(l);
        p.append(")");
        return p.toString();
    }

    public /* synthetic */ SpamCategoryEntity(long j, java.lang.String str, java.lang.String str2, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : l);
    }
}
