package com.truecaller.blocking.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/blocking/api/model/FilterState;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "fj0/qux", "DISABLED", "ENABLED", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FilterState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.api.model.FilterState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final fj0.qux Companion;
    public static final com.truecaller.blocking.api.model.FilterState DISABLED = new com.truecaller.blocking.api.model.FilterState("DISABLED", 0, 0);
    public static final com.truecaller.blocking.api.model.FilterState ENABLED = new com.truecaller.blocking.api.model.FilterState("ENABLED", 1, 1);
    private final int value;

    private static final /* synthetic */ com.truecaller.blocking.api.model.FilterState[] $values() {
        return new com.truecaller.blocking.api.model.FilterState[]{DISABLED, ENABLED};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, fj0.qux] */
    static {
        com.truecaller.blocking.api.model.FilterState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FilterState(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.api.model.FilterState valueOf(java.lang.String str) {
        return (com.truecaller.blocking.api.model.FilterState) java.lang.Enum.valueOf(com.truecaller.blocking.api.model.FilterState.class, str);
    }

    public static com.truecaller.blocking.api.model.FilterState[] values() {
        return (com.truecaller.blocking.api.model.FilterState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
