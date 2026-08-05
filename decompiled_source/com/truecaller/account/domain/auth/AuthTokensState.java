package com.truecaller.account.domain.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/account/domain/auth/AuthTokensState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_VALID", "STATE_EXPIRED_AND_REFRESHED", "STATE_EXPIRED", "STATE_ABOUT_TO_EXPIRE", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AuthTokensState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.account.domain.auth.AuthTokensState[] $VALUES;
    private final int value;
    public static final com.truecaller.account.domain.auth.AuthTokensState STATE_VALID = new com.truecaller.account.domain.auth.AuthTokensState("STATE_VALID", 0, 0);
    public static final com.truecaller.account.domain.auth.AuthTokensState STATE_EXPIRED_AND_REFRESHED = new com.truecaller.account.domain.auth.AuthTokensState("STATE_EXPIRED_AND_REFRESHED", 1, 1);
    public static final com.truecaller.account.domain.auth.AuthTokensState STATE_EXPIRED = new com.truecaller.account.domain.auth.AuthTokensState("STATE_EXPIRED", 2, 2);
    public static final com.truecaller.account.domain.auth.AuthTokensState STATE_ABOUT_TO_EXPIRE = new com.truecaller.account.domain.auth.AuthTokensState("STATE_ABOUT_TO_EXPIRE", 3, 3);

    private static final /* synthetic */ com.truecaller.account.domain.auth.AuthTokensState[] $values() {
        return new com.truecaller.account.domain.auth.AuthTokensState[]{STATE_VALID, STATE_EXPIRED_AND_REFRESHED, STATE_EXPIRED, STATE_ABOUT_TO_EXPIRE};
    }

    static {
        com.truecaller.account.domain.auth.AuthTokensState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AuthTokensState(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.account.domain.auth.AuthTokensState valueOf(java.lang.String str) {
        return (com.truecaller.account.domain.auth.AuthTokensState) java.lang.Enum.valueOf(com.truecaller.account.domain.auth.AuthTokensState.class, str);
    }

    public static com.truecaller.account.domain.auth.AuthTokensState[] values() {
        return (com.truecaller.account.domain.auth.AuthTokensState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
