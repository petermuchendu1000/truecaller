package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/truecaller/account/network/AppDto;", "", "majorVersion", "", "minorVersion", "buildVersion", "store", "", "updatedStore", "<init>", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getMajorVersion", "()I", "getMinorVersion", "getBuildVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStore", "()Ljava/lang/String;", "getUpdatedStore", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AppDto {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer buildVersion;
    private final int majorVersion;
    private final int minorVersion;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String store;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String updatedStore;

    public AppDto(int i, int i2, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.majorVersion = i;
        this.minorVersion = i2;
        this.buildVersion = num;
        this.store = str;
        this.updatedStore = str2;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getBuildVersion() {
        return this.buildVersion;
    }

    public final int getMajorVersion() {
        return this.majorVersion;
    }

    public final int getMinorVersion() {
        return this.minorVersion;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStore() {
        return this.store;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdatedStore() {
        return this.updatedStore;
    }
}
