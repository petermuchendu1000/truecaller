package com.truecaller.insights.commons.utils.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/insights/commons/utils/common/UseCaseTitleColorTypes;", "", "color", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getColor", "()Ljava/lang/String;", "GREEN", "BLACK", "ORANGE", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UseCaseTitleColorTypes {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String color;
    public static final com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes GREEN = new com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes("GREEN", 0, "green");
    public static final com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes BLACK = new com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes("BLACK", 1, "black");
    public static final com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes ORANGE = new com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes("ORANGE", 2, "orange");

    private static final /* synthetic */ com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes[] $values() {
        return new com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes[]{GREEN, BLACK, ORANGE};
    }

    static {
        com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UseCaseTitleColorTypes(java.lang.String str, int i, java.lang.String str2) {
        this.color = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes.class, str);
    }

    public static com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes[] values() {
        return (com.truecaller.insights.commons.utils.common.UseCaseTitleColorTypes[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getColor() {
        return this.color;
    }
}
