package com.truecaller.premium.insurance.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/truecaller/premium/insurance/data/GrantInsuranceDto;", "", "mobileNumber", "", "firstName", "", "lastName", "salutation", "email", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMobileNumber", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "getSalutation", "getEmail", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class GrantInsuranceDto {
    public static final int $stable = 0;

    @bw.qux("email")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email;

    @bw.qux("first_name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstName;

    @bw.qux("last_name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastName;

    @bw.qux("mobile_number")
    private final long mobileNumber;

    @bw.qux("salutation")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String salutation;

    public GrantInsuranceDto(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "salutation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "email");
        this.mobileNumber = j;
        this.firstName = str;
        this.lastName = str2;
        this.salutation = str3;
        this.email = str4;
    }

    public static /* synthetic */ com.truecaller.premium.insurance.data.GrantInsuranceDto copy$default(com.truecaller.premium.insurance.data.GrantInsuranceDto grantInsuranceDto, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = grantInsuranceDto.mobileNumber;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = grantInsuranceDto.firstName;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = grantInsuranceDto.lastName;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = grantInsuranceDto.salutation;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = grantInsuranceDto.email;
        }
        return grantInsuranceDto.copy(j2, str5, str6, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMobileNumber() {
        return this.mobileNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSalutation() {
        return this.salutation;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.insurance.data.GrantInsuranceDto copy(long mobileNumber, @org.jetbrains.annotations.NotNull java.lang.String firstName, @org.jetbrains.annotations.NotNull java.lang.String lastName, @org.jetbrains.annotations.NotNull java.lang.String salutation, @org.jetbrains.annotations.NotNull java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salutation, "salutation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return new com.truecaller.premium.insurance.data.GrantInsuranceDto(mobileNumber, firstName, lastName, salutation, email);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.insurance.data.GrantInsuranceDto)) {
            return false;
        }
        com.truecaller.premium.insurance.data.GrantInsuranceDto grantInsuranceDto = (com.truecaller.premium.insurance.data.GrantInsuranceDto) other;
        return this.mobileNumber == grantInsuranceDto.mobileNumber && kotlin.jvm.internal.Intrinsics.b(this.firstName, grantInsuranceDto.firstName) && kotlin.jvm.internal.Intrinsics.b(this.lastName, grantInsuranceDto.lastName) && kotlin.jvm.internal.Intrinsics.b(this.salutation, grantInsuranceDto.salutation) && kotlin.jvm.internal.Intrinsics.b(this.email, grantInsuranceDto.email);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final long getMobileNumber() {
        return this.mobileNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSalutation() {
        return this.salutation;
    }

    public int hashCode() {
        long j = this.mobileNumber;
        return this.email.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.firstName), 31, this.lastName), 31, this.salutation);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.mobileNumber;
        java.lang.String str = this.firstName;
        java.lang.String str2 = this.lastName;
        java.lang.String str3 = this.salutation;
        java.lang.String str4 = this.email;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("GrantInsuranceDto(mobileNumber=", j, ", firstName=", str);
        bar.E(p, ", lastName=", str2, ", salutation=", str3);
        return y.o.f(", email=", str4, ")", p);
    }
}
