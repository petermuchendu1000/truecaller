package com.truecaller.gov_services.data.local.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/truecaller/gov_services/data/local/entities/Category;", "", "id", "", "name", "", "iconName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getIconName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Category {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String iconName;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    public Category(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "iconName");
        this.id = j;
        this.name = str;
        this.iconName = str2;
    }

    public static /* synthetic */ com.truecaller.gov_services.data.local.entities.Category copy$default(com.truecaller.gov_services.data.local.entities.Category category, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = category.id;
        }
        if ((i & 2) != 0) {
            str = category.name;
        }
        if ((i & 4) != 0) {
            str2 = category.iconName;
        }
        return category.copy(j, str, str2);
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

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIconName() {
        return this.iconName;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.gov_services.data.local.entities.Category copy(long id, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String iconName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconName, "iconName");
        return new com.truecaller.gov_services.data.local.entities.Category(id, name, iconName);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.gov_services.data.local.entities.Category)) {
            return false;
        }
        com.truecaller.gov_services.data.local.entities.Category category = (com.truecaller.gov_services.data.local.entities.Category) other;
        return this.id == category.id && kotlin.jvm.internal.Intrinsics.b(this.name, category.name) && kotlin.jvm.internal.Intrinsics.b(this.iconName, category.iconName);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIconName() {
        return this.iconName;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        long j = this.id;
        return this.iconName.hashCode() + ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.name);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.f(", iconName=", this.iconName, ")", com.appsflyer.internal.e.p("Category(id=", this.id, ", name=", this.name));
    }
}
