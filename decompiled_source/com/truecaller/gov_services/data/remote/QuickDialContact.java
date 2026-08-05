package com.truecaller.gov_services.data.remote;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/truecaller/gov_services/data/remote/QuickDialContact;", "", "listPosition", "", "number", "", "name", "avatarUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getListPosition", "()I", "getNumber", "()Ljava/lang/String;", "getName", "getAvatarUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class QuickDialContact {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String avatarUrl;
    private final int listPosition;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String number;

    public QuickDialContact(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        this.listPosition = i;
        this.number = str;
        this.name = str2;
        this.avatarUrl = str3;
    }

    public static /* synthetic */ com.truecaller.gov_services.data.remote.QuickDialContact copy$default(com.truecaller.gov_services.data.remote.QuickDialContact quickDialContact, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = quickDialContact.listPosition;
        }
        if ((i2 & 2) != 0) {
            str = quickDialContact.number;
        }
        if ((i2 & 4) != 0) {
            str2 = quickDialContact.name;
        }
        if ((i2 & 8) != 0) {
            str3 = quickDialContact.avatarUrl;
        }
        return quickDialContact.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getListPosition() {
        return this.listPosition;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNumber() {
        return this.number;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.gov_services.data.remote.QuickDialContact copy(int listPosition, @org.jetbrains.annotations.NotNull java.lang.String number, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String avatarUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.truecaller.gov_services.data.remote.QuickDialContact(listPosition, number, name, avatarUrl);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.gov_services.data.remote.QuickDialContact)) {
            return false;
        }
        com.truecaller.gov_services.data.remote.QuickDialContact quickDialContact = (com.truecaller.gov_services.data.remote.QuickDialContact) other;
        return this.listPosition == quickDialContact.listPosition && kotlin.jvm.internal.Intrinsics.b(this.number, quickDialContact.number) && kotlin.jvm.internal.Intrinsics.b(this.name, quickDialContact.name) && kotlin.jvm.internal.Intrinsics.b(this.avatarUrl, quickDialContact.avatarUrl);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getListPosition() {
        return this.listPosition;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumber() {
        return this.number;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(this.listPosition * 31, 31, this.number), 31, this.name);
        java.lang.String str = this.avatarUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.listPosition;
        java.lang.String str = this.number;
        return bar.x(qb.qux.r("QuickDialContact(listPosition=", i, ", number=", str, ", name="), this.name, ", avatarUrl=", this.avatarUrl, ")");
    }
}
