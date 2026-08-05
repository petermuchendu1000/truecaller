package com.truecaller.compose.ui.components.avatar.config;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/compose/ui/components/avatar/config/AvatarType;", "", "<init>", "(Ljava/lang/String;I)V", "TRUECALLER_USER", "VERIFIED_BUSINESS", "SMALL_BUSINESS", "BLOCKED", "SPAM", "FRAUD", "GOLD", "HIDDEN", "PREMIUM", "PRIORITY_CALL", "SOFT_THROTTLED", "MANUAL_CALLER_ID", "GROUP", "ALPHA_NUMERIC", "CONFERENCE", "DEFAULT", "compose-ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class AvatarType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.avatar.config.AvatarType[] $VALUES;
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType TRUECALLER_USER = new com.truecaller.compose.ui.components.avatar.config.AvatarType("TRUECALLER_USER", 0);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType VERIFIED_BUSINESS = new com.truecaller.compose.ui.components.avatar.config.AvatarType("VERIFIED_BUSINESS", 1);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType SMALL_BUSINESS = new com.truecaller.compose.ui.components.avatar.config.AvatarType("SMALL_BUSINESS", 2);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType BLOCKED = new com.truecaller.compose.ui.components.avatar.config.AvatarType("BLOCKED", 3);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType SPAM = new com.truecaller.compose.ui.components.avatar.config.AvatarType("SPAM", 4);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType FRAUD = new com.truecaller.compose.ui.components.avatar.config.AvatarType("FRAUD", 5);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType GOLD = new com.truecaller.compose.ui.components.avatar.config.AvatarType("GOLD", 6);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType HIDDEN = new com.truecaller.compose.ui.components.avatar.config.AvatarType("HIDDEN", 7);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType PREMIUM = new com.truecaller.compose.ui.components.avatar.config.AvatarType("PREMIUM", 8);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType PRIORITY_CALL = new com.truecaller.compose.ui.components.avatar.config.AvatarType("PRIORITY_CALL", 9);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType SOFT_THROTTLED = new com.truecaller.compose.ui.components.avatar.config.AvatarType("SOFT_THROTTLED", 10);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType MANUAL_CALLER_ID = new com.truecaller.compose.ui.components.avatar.config.AvatarType("MANUAL_CALLER_ID", 11);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType GROUP = new com.truecaller.compose.ui.components.avatar.config.AvatarType("GROUP", 12);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType ALPHA_NUMERIC = new com.truecaller.compose.ui.components.avatar.config.AvatarType("ALPHA_NUMERIC", 13);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType CONFERENCE = new com.truecaller.compose.ui.components.avatar.config.AvatarType("CONFERENCE", 14);
    public static final com.truecaller.compose.ui.components.avatar.config.AvatarType DEFAULT = new com.truecaller.compose.ui.components.avatar.config.AvatarType("DEFAULT", 15);

    private static final /* synthetic */ com.truecaller.compose.ui.components.avatar.config.AvatarType[] $values() {
        return new com.truecaller.compose.ui.components.avatar.config.AvatarType[]{TRUECALLER_USER, VERIFIED_BUSINESS, SMALL_BUSINESS, BLOCKED, SPAM, FRAUD, GOLD, HIDDEN, PREMIUM, PRIORITY_CALL, SOFT_THROTTLED, MANUAL_CALLER_ID, GROUP, ALPHA_NUMERIC, CONFERENCE, DEFAULT};
    }

    static {
        com.truecaller.compose.ui.components.avatar.config.AvatarType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AvatarType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.avatar.config.AvatarType valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.avatar.config.AvatarType) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.avatar.config.AvatarType.class, str);
    }

    public static com.truecaller.compose.ui.components.avatar.config.AvatarType[] values() {
        return (com.truecaller.compose.ui.components.avatar.config.AvatarType[]) $VALUES.clone();
    }
}
