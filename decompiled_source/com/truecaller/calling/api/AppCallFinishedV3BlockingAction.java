package com.truecaller.calling.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/calling/api/AppCallFinishedV3BlockingAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUTO_BLOCK", "SILENT_RING", "ASSISTANT_AUTO_REJECT", "NONE", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AppCallFinishedV3BlockingAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.api.AppCallFinishedV3BlockingAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calling.api.AppCallFinishedV3BlockingAction AUTO_BLOCK = new com.truecaller.calling.api.AppCallFinishedV3BlockingAction("AUTO_BLOCK", 0, "autoBlock");
    public static final com.truecaller.calling.api.AppCallFinishedV3BlockingAction SILENT_RING = new com.truecaller.calling.api.AppCallFinishedV3BlockingAction("SILENT_RING", 1, "silentRing");
    public static final com.truecaller.calling.api.AppCallFinishedV3BlockingAction ASSISTANT_AUTO_REJECT = new com.truecaller.calling.api.AppCallFinishedV3BlockingAction("ASSISTANT_AUTO_REJECT", 2, "assistantAutoReject");
    public static final com.truecaller.calling.api.AppCallFinishedV3BlockingAction NONE = new com.truecaller.calling.api.AppCallFinishedV3BlockingAction("NONE", 3, "");

    private static final /* synthetic */ com.truecaller.calling.api.AppCallFinishedV3BlockingAction[] $values() {
        return new com.truecaller.calling.api.AppCallFinishedV3BlockingAction[]{AUTO_BLOCK, SILENT_RING, ASSISTANT_AUTO_REJECT, NONE};
    }

    static {
        com.truecaller.calling.api.AppCallFinishedV3BlockingAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AppCallFinishedV3BlockingAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.api.AppCallFinishedV3BlockingAction valueOf(java.lang.String str) {
        return (com.truecaller.calling.api.AppCallFinishedV3BlockingAction) java.lang.Enum.valueOf(com.truecaller.calling.api.AppCallFinishedV3BlockingAction.class, str);
    }

    public static com.truecaller.calling.api.AppCallFinishedV3BlockingAction[] values() {
        return (com.truecaller.calling.api.AppCallFinishedV3BlockingAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
