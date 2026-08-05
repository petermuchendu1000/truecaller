package com.truecaller.premium.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/premium/data/WebOrderRequestAddress;", "", "line1", "", "line2", "city", "state", "country", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLine1", "()Ljava/lang/String;", "getLine2", "getCity", "getState", "getCountry", "getPostalCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class WebOrderRequestAddress {
    public static final int $stable = 0;

    @bw.qux("city")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String city;

    @bw.qux("country")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country;

    @bw.qux("line1")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String line1;

    @bw.qux("line2")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String line2;

    @bw.qux("postalCode")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String postalCode;

    @bw.qux("state")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;

    public WebOrderRequestAddress(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "line1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "line2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "state");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "country");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "postalCode");
        this.line1 = str;
        this.line2 = str2;
        this.city = str3;
        this.state = str4;
        this.country = str5;
        this.postalCode = str6;
    }

    public static /* synthetic */ com.truecaller.premium.data.WebOrderRequestAddress copy$default(com.truecaller.premium.data.WebOrderRequestAddress webOrderRequestAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = webOrderRequestAddress.line1;
        }
        if ((i & 2) != 0) {
            str2 = webOrderRequestAddress.line2;
        }
        if ((i & 4) != 0) {
            str3 = webOrderRequestAddress.city;
        }
        if ((i & 8) != 0) {
            str4 = webOrderRequestAddress.state;
        }
        if ((i & 16) != 0) {
            str5 = webOrderRequestAddress.country;
        }
        if ((i & 32) != 0) {
            str6 = webOrderRequestAddress.postalCode;
        }
        java.lang.String str7 = str5;
        java.lang.String str8 = str6;
        return webOrderRequestAddress.copy(str, str2, str3, str4, str7, str8);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLine1() {
        return this.line1;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLine2() {
        return this.line2;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCity() {
        return this.city;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.WebOrderRequestAddress copy(@org.jetbrains.annotations.NotNull java.lang.String line1, @org.jetbrains.annotations.NotNull java.lang.String line2, @org.jetbrains.annotations.NotNull java.lang.String city, @org.jetbrains.annotations.NotNull java.lang.String state, @org.jetbrains.annotations.NotNull java.lang.String country, @org.jetbrains.annotations.NotNull java.lang.String postalCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line1, "line1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line2, "line2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(city, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "country");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        return new com.truecaller.premium.data.WebOrderRequestAddress(line1, line2, city, state, country, postalCode);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.WebOrderRequestAddress)) {
            return false;
        }
        com.truecaller.premium.data.WebOrderRequestAddress webOrderRequestAddress = (com.truecaller.premium.data.WebOrderRequestAddress) other;
        return kotlin.jvm.internal.Intrinsics.b(this.line1, webOrderRequestAddress.line1) && kotlin.jvm.internal.Intrinsics.b(this.line2, webOrderRequestAddress.line2) && kotlin.jvm.internal.Intrinsics.b(this.city, webOrderRequestAddress.city) && kotlin.jvm.internal.Intrinsics.b(this.state, webOrderRequestAddress.state) && kotlin.jvm.internal.Intrinsics.b(this.country, webOrderRequestAddress.country) && kotlin.jvm.internal.Intrinsics.b(this.postalCode, webOrderRequestAddress.postalCode);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCity() {
        return this.city;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return this.country;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLine1() {
        return this.line1;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLine2() {
        return this.line2;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.postalCode.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.line1.hashCode() * 31, 31, this.line2), 31, this.city), 31, this.state), 31, this.country);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.line1;
        java.lang.String str2 = this.line2;
        java.lang.String str3 = this.city;
        java.lang.String str4 = this.state;
        java.lang.String str5 = this.country;
        java.lang.String str6 = this.postalCode;
        java.lang.StringBuilder E = ro0.f.E("WebOrderRequestAddress(line1=", str, ", line2=", str2, ", city=");
        bar.E(E, str3, ", state=", str4, ", country=");
        return bar.x(E, str5, ", postalCode=", str6, ")");
    }
}
