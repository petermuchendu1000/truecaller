package com.truecaller.calling_common.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/truecaller/calling_common/settings/CallingSettings$CallLogMergeStrategy", "", "Lcom/truecaller/calling_common/settings/CallingSettings$CallLogMergeStrategy;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(Ljava/lang/String;II)V", "", "isSlim", "()Z", "I", "getId", "()I", "Companion", "hw0/bar", "NumberAndDay", "Slim", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class CallingSettings$CallLogMergeStrategy {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final hw0.bar Companion;
    public static final com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy NumberAndDay;
    public static final com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy Slim;
    private final int id;

    private static final /* synthetic */ com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy[] $values() {
        return new com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy[]{NumberAndDay, Slim};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hw0.bar, java.lang.Object] */
    static {
        int i = 1;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        NumberAndDay = new com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy("NumberAndDay", 0, i, defaultConstructorMarker);
        Slim = new com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy("Slim", i, 3, defaultConstructorMarker);
        com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    public /* synthetic */ CallingSettings$CallLogMergeStrategy(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy) java.lang.Enum.valueOf(com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy.class, str);
    }

    public static com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy[] values() {
        return (com.truecaller.calling_common.settings.CallingSettings$CallLogMergeStrategy[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public abstract boolean isSlim();

    private CallingSettings$CallLogMergeStrategy(java.lang.String str, int i, int i2) {
        this.id = i2;
    }
}
