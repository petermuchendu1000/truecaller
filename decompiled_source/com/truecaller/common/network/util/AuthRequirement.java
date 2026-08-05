package com.truecaller.common.network.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/common/network/util/AuthRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "OPTIONAL", "NONE", "common-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class AuthRequirement {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.network.util.AuthRequirement[] $VALUES;
    public static final com.truecaller.common.network.util.AuthRequirement REQUIRED = new com.truecaller.common.network.util.AuthRequirement("REQUIRED", 0);
    public static final com.truecaller.common.network.util.AuthRequirement OPTIONAL = new com.truecaller.common.network.util.AuthRequirement("OPTIONAL", 1);
    public static final com.truecaller.common.network.util.AuthRequirement NONE = new com.truecaller.common.network.util.AuthRequirement("NONE", 2);

    private static final /* synthetic */ com.truecaller.common.network.util.AuthRequirement[] $values() {
        return new com.truecaller.common.network.util.AuthRequirement[]{REQUIRED, OPTIONAL, NONE};
    }

    static {
        com.truecaller.common.network.util.AuthRequirement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AuthRequirement(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.network.util.AuthRequirement valueOf(java.lang.String str) {
        return (com.truecaller.common.network.util.AuthRequirement) java.lang.Enum.valueOf(com.truecaller.common.network.util.AuthRequirement.class, str);
    }

    public static com.truecaller.common.network.util.AuthRequirement[] values() {
        return (com.truecaller.common.network.util.AuthRequirement[]) $VALUES.clone();
    }
}
