package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/PhoneNumber;", "", "number", "", "countryCode", "", "<init>", "(JLjava/lang/String;)V", "getNumber", "()J", "getCountryCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class PhoneNumber {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String countryCode;
    private final long number;

    public PhoneNumber(long j, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryCode");
        this.number = j;
        this.countryCode = str;
    }

    public static /* synthetic */ com.truecaller.profile.impl.remote.model.PhoneNumber copy$default(com.truecaller.profile.impl.remote.model.PhoneNumber phoneNumber, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = phoneNumber.number;
        }
        if ((i & 2) != 0) {
            str = phoneNumber.countryCode;
        }
        return phoneNumber.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getNumber() {
        return this.number;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.PhoneNumber copy(long number, @org.jetbrains.annotations.NotNull java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new com.truecaller.profile.impl.remote.model.PhoneNumber(number, countryCode);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.profile.impl.remote.model.PhoneNumber)) {
            return false;
        }
        com.truecaller.profile.impl.remote.model.PhoneNumber phoneNumber = (com.truecaller.profile.impl.remote.model.PhoneNumber) other;
        return this.number == phoneNumber.number && kotlin.jvm.internal.Intrinsics.b(this.countryCode, phoneNumber.countryCode);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final long getNumber() {
        return this.number;
    }

    public int hashCode() {
        long j = this.number;
        return this.countryCode.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("PhoneNumber(number=", this.number, ", countryCode=", this.countryCode);
        p.append(")");
        return p.toString();
    }
}
