package com.truecaller.familyprotect.domain.remotereject;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/truecaller/familyprotect/domain/remotereject/ScamCallInfo;", "", "callId", "", "memberPhoneNumber", "", "fraudsterPhoneNumber", "fraudsterName", "isIncoming", "", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "getMemberPhoneNumber", "()J", "getFraudsterPhoneNumber", "getFraudsterName", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ScamCallInfo {

    @bw.qux("call_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String callId;

    @bw.qux("fraudster_name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fraudsterName;

    @bw.qux("fraudster_phone")
    private final long fraudsterPhoneNumber;

    @bw.qux("is_incoming")
    private final boolean isIncoming;

    @bw.qux("member_phone")
    private final long memberPhoneNumber;

    public ScamCallInfo(@org.jetbrains.annotations.NotNull java.lang.String str, long j, long j2, @org.jetbrains.annotations.NotNull java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fraudsterName");
        this.callId = str;
        this.memberPhoneNumber = j;
        this.fraudsterPhoneNumber = j2;
        this.fraudsterName = str2;
        this.isIncoming = z;
    }

    public static /* synthetic */ com.truecaller.familyprotect.domain.remotereject.ScamCallInfo copy$default(com.truecaller.familyprotect.domain.remotereject.ScamCallInfo scamCallInfo, java.lang.String str, long j, long j2, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = scamCallInfo.callId;
        }
        if ((i & 2) != 0) {
            j = scamCallInfo.memberPhoneNumber;
        }
        if ((i & 4) != 0) {
            j2 = scamCallInfo.fraudsterPhoneNumber;
        }
        if ((i & 8) != 0) {
            str2 = scamCallInfo.fraudsterName;
        }
        if ((i & 16) != 0) {
            z = scamCallInfo.isIncoming;
        }
        long j3 = j2;
        return scamCallInfo.copy(str, j, j3, str2, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMemberPhoneNumber() {
        return this.memberPhoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFraudsterPhoneNumber() {
        return this.fraudsterPhoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFraudsterName() {
        return this.fraudsterName;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsIncoming() {
        return this.isIncoming;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.familyprotect.domain.remotereject.ScamCallInfo copy(@org.jetbrains.annotations.NotNull java.lang.String callId, long memberPhoneNumber, long fraudsterPhoneNumber, @org.jetbrains.annotations.NotNull java.lang.String fraudsterName, boolean isIncoming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fraudsterName, "fraudsterName");
        return new com.truecaller.familyprotect.domain.remotereject.ScamCallInfo(callId, memberPhoneNumber, fraudsterPhoneNumber, fraudsterName, isIncoming);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.familyprotect.domain.remotereject.ScamCallInfo)) {
            return false;
        }
        com.truecaller.familyprotect.domain.remotereject.ScamCallInfo scamCallInfo = (com.truecaller.familyprotect.domain.remotereject.ScamCallInfo) other;
        return kotlin.jvm.internal.Intrinsics.b(this.callId, scamCallInfo.callId) && this.memberPhoneNumber == scamCallInfo.memberPhoneNumber && this.fraudsterPhoneNumber == scamCallInfo.fraudsterPhoneNumber && kotlin.jvm.internal.Intrinsics.b(this.fraudsterName, scamCallInfo.fraudsterName) && this.isIncoming == scamCallInfo.isIncoming;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFraudsterName() {
        return this.fraudsterName;
    }

    public final long getFraudsterPhoneNumber() {
        return this.fraudsterPhoneNumber;
    }

    public final long getMemberPhoneNumber() {
        return this.memberPhoneNumber;
    }

    public int hashCode() {
        int i;
        int hashCode = this.callId.hashCode() * 31;
        long j = this.memberPhoneNumber;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.fraudsterPhoneNumber;
        int e = ax1.bar.e((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.fraudsterName);
        if (this.isIncoming) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    public final boolean isIncoming() {
        return this.isIncoming;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.callId;
        long j = this.memberPhoneNumber;
        long j2 = this.fraudsterPhoneNumber;
        java.lang.String str2 = this.fraudsterName;
        boolean z = this.isIncoming;
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("ScamCallInfo(callId=", str, ", memberPhoneNumber=", j);
        ro0.f.L(q, ", fraudsterPhoneNumber=", j2, ", fraudsterName=");
        return ax1.bar.m(str2, ", isIncoming=", ")", q, z);
    }
}
