package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/truecaller/account/network/VersionDto;", "", "majorVersion", "", "minorVersion", "buildVersion", "<init>", "(IILjava/lang/Integer;)V", "getMajorVersion", "()I", "getMinorVersion", "getBuildVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VersionDto {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer buildVersion;
    private final int majorVersion;
    private final int minorVersion;

    public VersionDto(int i, int i2, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.majorVersion = i;
        this.minorVersion = i2;
        this.buildVersion = num;
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
}
