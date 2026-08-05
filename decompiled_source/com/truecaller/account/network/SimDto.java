package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/truecaller/account/network/SimDto;", "", "", "imsi", "operator", "mcc", "mnc", "msin", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getImsi", "()Ljava/lang/String;", "getOperator", "getMcc", "getMnc", "getMsin", "getPhoneNumber", "Companion", "com/truecaller/account/network/l", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SimDto {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.l Companion = new java.lang.Object();

    @org.jetbrains.annotations.Nullable
    private final java.lang.String imsi;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String mcc;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String mnc;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String msin;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String operator;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String phoneNumber;

    public SimDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6) {
        this.imsi = str;
        this.operator = str2;
        this.mcc = str3;
        this.mnc = str4;
        this.msin = str5;
        this.phoneNumber = str6;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImsi() {
        return this.imsi;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMcc() {
        return this.mcc;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMnc() {
        return this.mnc;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMsin() {
        return this.msin;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOperator() {
        return this.operator;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }
}
