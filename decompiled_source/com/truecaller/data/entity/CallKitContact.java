package com.truecaller.data.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/truecaller/data/entity/CallKitContact;", "", "number", "", "name", "badge", "logoUrl", "isTopCaller", "", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getName", "getBadge", "getLogoUrl", "()Z", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CallKitContact {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String badge;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String createdAt;
    private final boolean isTopCaller;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String logoUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String number;

    public CallKitContact(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, boolean z, @org.jetbrains.annotations.NotNull java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "badge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "logoUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "createdAt");
        this.number = str;
        this.name = str2;
        this.badge = str3;
        this.logoUrl = str4;
        this.isTopCaller = z;
        this.createdAt = str5;
    }

    public static /* synthetic */ com.truecaller.data.entity.CallKitContact copy$default(com.truecaller.data.entity.CallKitContact callKitContact, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = callKitContact.number;
        }
        if ((i & 2) != 0) {
            str2 = callKitContact.name;
        }
        if ((i & 4) != 0) {
            str3 = callKitContact.badge;
        }
        if ((i & 8) != 0) {
            str4 = callKitContact.logoUrl;
        }
        if ((i & 16) != 0) {
            z = callKitContact.isTopCaller;
        }
        if ((i & 32) != 0) {
            str5 = callKitContact.createdAt;
        }
        boolean z2 = z;
        java.lang.String str6 = str5;
        return callKitContact.copy(str, str2, str3, str4, z2, str6);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNumber() {
        return this.number;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBadge() {
        return this.badge;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTopCaller() {
        return this.isTopCaller;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.data.entity.CallKitContact copy(@org.jetbrains.annotations.NotNull java.lang.String number, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String badge, @org.jetbrains.annotations.NotNull java.lang.String logoUrl, boolean isTopCaller, @org.jetbrains.annotations.NotNull java.lang.String createdAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badge, "badge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.data.entity.CallKitContact(number, name, badge, logoUrl, isTopCaller, createdAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.data.entity.CallKitContact)) {
            return false;
        }
        com.truecaller.data.entity.CallKitContact callKitContact = (com.truecaller.data.entity.CallKitContact) other;
        return kotlin.jvm.internal.Intrinsics.b(this.number, callKitContact.number) && kotlin.jvm.internal.Intrinsics.b(this.name, callKitContact.name) && kotlin.jvm.internal.Intrinsics.b(this.badge, callKitContact.badge) && kotlin.jvm.internal.Intrinsics.b(this.logoUrl, callKitContact.logoUrl) && this.isTopCaller == callKitContact.isTopCaller && kotlin.jvm.internal.Intrinsics.b(this.createdAt, callKitContact.createdAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBadge() {
        return this.badge;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
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
        int i;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.number.hashCode() * 31, 31, this.name), 31, this.badge), 31, this.logoUrl);
        if (this.isTopCaller) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.createdAt.hashCode() + ((e + i) * 31);
    }

    public final boolean isTopCaller() {
        return this.isTopCaller;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.number;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.badge;
        java.lang.String str4 = this.logoUrl;
        boolean z = this.isTopCaller;
        java.lang.String str5 = this.createdAt;
        java.lang.StringBuilder E = ro0.f.E("CallKitContact(number=", str, ", name=", str2, ", badge=");
        bar.E(E, str3, ", logoUrl=", str4, ", isTopCaller=");
        E.append(z);
        E.append(", createdAt=");
        E.append(str5);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ CallKitContact(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z, str5);
    }
}
