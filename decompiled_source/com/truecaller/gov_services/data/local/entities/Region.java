package com.truecaller.gov_services.data.local.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/gov_services/data/local/entities/Region;", "", "id", "", "name", "", "type", "", "<init>", "(JLjava/lang/String;I)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Region {
    public static final int $stable = 0;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final int type;

    public Region(long j, @org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        this.id = j;
        this.name = str;
        this.type = i;
    }

    public static /* synthetic */ com.truecaller.gov_services.data.local.entities.Region copy$default(com.truecaller.gov_services.data.local.entities.Region region, long j, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = region.id;
        }
        if ((i2 & 2) != 0) {
            str = region.name;
        }
        if ((i2 & 4) != 0) {
            i = region.type;
        }
        return region.copy(j, str, i);
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

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.gov_services.data.local.entities.Region copy(long id, @org.jetbrains.annotations.NotNull java.lang.String name, int type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.truecaller.gov_services.data.local.entities.Region(id, name, type);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.gov_services.data.local.entities.Region)) {
            return false;
        }
        com.truecaller.gov_services.data.local.entities.Region region = (com.truecaller.gov_services.data.local.entities.Region) other;
        return this.id == region.id && kotlin.jvm.internal.Intrinsics.b(this.name, region.name) && this.type == region.type;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        long j = this.id;
        return ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.name) + this.type;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.name;
        return t.c.q(com.appsflyer.internal.e.p("Region(id=", j, ", name=", str), ", type=", this.type, ")");
    }
}
