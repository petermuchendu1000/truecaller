package com.truecaller.gov_services.data.local.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/truecaller/gov_services/data/local/entities/District;", "", "id", "", "name", "", "isGeneral", "", "<init>", "(JLjava/lang/String;Z)V", "getId", "()J", "getName", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class District {
    public static final int $stable = 0;
    private final long id;
    private final boolean isGeneral;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    public District(long j, @org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        this.id = j;
        this.name = str;
        this.isGeneral = z;
    }

    public static /* synthetic */ com.truecaller.gov_services.data.local.entities.District copy$default(com.truecaller.gov_services.data.local.entities.District district, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = district.id;
        }
        if ((i & 2) != 0) {
            str = district.name;
        }
        if ((i & 4) != 0) {
            z = district.isGeneral;
        }
        return district.copy(j, str, z);
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
    public final boolean getIsGeneral() {
        return this.isGeneral;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.gov_services.data.local.entities.District copy(long id, @org.jetbrains.annotations.NotNull java.lang.String name, boolean isGeneral) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.truecaller.gov_services.data.local.entities.District(id, name, isGeneral);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.gov_services.data.local.entities.District)) {
            return false;
        }
        com.truecaller.gov_services.data.local.entities.District district = (com.truecaller.gov_services.data.local.entities.District) other;
        return this.id == district.id && kotlin.jvm.internal.Intrinsics.b(this.name, district.name) && this.isGeneral == district.isGeneral;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        int i;
        long j = this.id;
        int e = ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.name);
        if (this.isGeneral) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    public final boolean isGeneral() {
        return this.isGeneral;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.name;
        return com.appsflyer.internal.e.n(com.appsflyer.internal.e.p("District(id=", j, ", name=", str), ", isGeneral=", this.isGeneral, ")");
    }
}
