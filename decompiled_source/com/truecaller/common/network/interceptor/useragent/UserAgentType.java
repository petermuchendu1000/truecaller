package com.truecaller.common.network.interceptor.useragent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/common/network/interceptor/useragent/UserAgentType;", "", "<init>", "(Ljava/lang/String;I)V", "TRUECALLER_VERSION", "WEB_NATIVE", "common-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class UserAgentType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.network.interceptor.useragent.UserAgentType[] $VALUES;
    public static final com.truecaller.common.network.interceptor.useragent.UserAgentType TRUECALLER_VERSION = new com.truecaller.common.network.interceptor.useragent.UserAgentType("TRUECALLER_VERSION", 0);
    public static final com.truecaller.common.network.interceptor.useragent.UserAgentType WEB_NATIVE = new com.truecaller.common.network.interceptor.useragent.UserAgentType("WEB_NATIVE", 1);

    private static final /* synthetic */ com.truecaller.common.network.interceptor.useragent.UserAgentType[] $values() {
        return new com.truecaller.common.network.interceptor.useragent.UserAgentType[]{TRUECALLER_VERSION, WEB_NATIVE};
    }

    static {
        com.truecaller.common.network.interceptor.useragent.UserAgentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UserAgentType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.network.interceptor.useragent.UserAgentType valueOf(java.lang.String str) {
        return (com.truecaller.common.network.interceptor.useragent.UserAgentType) java.lang.Enum.valueOf(com.truecaller.common.network.interceptor.useragent.UserAgentType.class, str);
    }

    public static com.truecaller.common.network.interceptor.useragent.UserAgentType[] values() {
        return (com.truecaller.common.network.interceptor.useragent.UserAgentType[]) $VALUES.clone();
    }
}
