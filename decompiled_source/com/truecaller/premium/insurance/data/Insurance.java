package com.truecaller.premium.insurance.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/premium/insurance/data/Insurance;", "", "startDate", "Lorg/joda/time/DateTime;", "endDate", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getStartDate", "()Lorg/joda/time/DateTime;", "getEndDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Insurance {
    public static final int $stable = 8;

    @bw.qux("endDate")
    @org.jetbrains.annotations.Nullable
    private final org.joda.time.DateTime endDate;

    @bw.qux("startDate")
    @org.jetbrains.annotations.Nullable
    private final org.joda.time.DateTime startDate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Insurance() {
        this(r0, r0, 3, r0);
        org.joda.time.DateTime dateTime = null;
    }

    public static /* synthetic */ com.truecaller.premium.insurance.data.Insurance copy$default(com.truecaller.premium.insurance.data.Insurance insurance, org.joda.time.DateTime dateTime, org.joda.time.DateTime dateTime2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dateTime = insurance.startDate;
        }
        if ((i & 2) != 0) {
            dateTime2 = insurance.endDate;
        }
        return insurance.copy(dateTime, dateTime2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final org.joda.time.DateTime getStartDate() {
        return this.startDate;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final org.joda.time.DateTime getEndDate() {
        return this.endDate;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.insurance.data.Insurance copy(@org.jetbrains.annotations.Nullable org.joda.time.DateTime startDate, @org.jetbrains.annotations.Nullable org.joda.time.DateTime endDate) {
        return new com.truecaller.premium.insurance.data.Insurance(startDate, endDate);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.insurance.data.Insurance)) {
            return false;
        }
        com.truecaller.premium.insurance.data.Insurance insurance = (com.truecaller.premium.insurance.data.Insurance) other;
        return kotlin.jvm.internal.Intrinsics.b(this.startDate, insurance.startDate) && kotlin.jvm.internal.Intrinsics.b(this.endDate, insurance.endDate);
    }

    @org.jetbrains.annotations.Nullable
    public final org.joda.time.DateTime getEndDate() {
        return this.endDate;
    }

    @org.jetbrains.annotations.Nullable
    public final org.joda.time.DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        org.joda.time.DateTime dateTime = this.startDate;
        int hashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        org.joda.time.DateTime dateTime2 = this.endDate;
        return hashCode + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "Insurance(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }

    public Insurance(@org.jetbrains.annotations.Nullable org.joda.time.DateTime dateTime, @org.jetbrains.annotations.Nullable org.joda.time.DateTime dateTime2) {
        this.startDate = dateTime;
        this.endDate = dateTime2;
    }

    public /* synthetic */ Insurance(org.joda.time.DateTime dateTime, org.joda.time.DateTime dateTime2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dateTime, (i & 2) != 0 ? null : dateTime2);
    }
}
