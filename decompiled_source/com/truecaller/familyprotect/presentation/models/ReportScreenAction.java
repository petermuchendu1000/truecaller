package com.truecaller.familyprotect.presentation.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/familyprotect/presentation/models/ReportScreenAction;", "", "textResId", "", "<init>", "(Ljava/lang/String;II)V", "getTextResId", "()I", "WEEKLY", "ALL_TIME", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ReportScreenAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.presentation.models.ReportScreenAction[] $VALUES;
    private final int textResId;
    public static final com.truecaller.familyprotect.presentation.models.ReportScreenAction WEEKLY = new com.truecaller.familyprotect.presentation.models.ReportScreenAction("WEEKLY", 0, 2132021209);
    public static final com.truecaller.familyprotect.presentation.models.ReportScreenAction ALL_TIME = new com.truecaller.familyprotect.presentation.models.ReportScreenAction("ALL_TIME", 1, 2132021206);

    private static final /* synthetic */ com.truecaller.familyprotect.presentation.models.ReportScreenAction[] $values() {
        return new com.truecaller.familyprotect.presentation.models.ReportScreenAction[]{WEEKLY, ALL_TIME};
    }

    static {
        com.truecaller.familyprotect.presentation.models.ReportScreenAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReportScreenAction(java.lang.String str, int i, int i2) {
        this.textResId = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.presentation.models.ReportScreenAction valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.presentation.models.ReportScreenAction) java.lang.Enum.valueOf(com.truecaller.familyprotect.presentation.models.ReportScreenAction.class, str);
    }

    public static com.truecaller.familyprotect.presentation.models.ReportScreenAction[] values() {
        return (com.truecaller.familyprotect.presentation.models.ReportScreenAction[]) $VALUES.clone();
    }

    public final int getTextResId() {
        return this.textResId;
    }
}
