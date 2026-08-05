package com.truecaller.insights.database.entities.processing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/insights/database/entities/processing/ProcessedDuring;", "", "", "key", "<init>", "(Ljava/lang/String;II)V", "I", "getKey", "()I", "Companion", "qu1/d", "NEW_MESSAGE_SYNC", "HISTORIC_MESSAGE_SYNC", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProcessedDuring {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.database.entities.processing.ProcessedDuring[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final qu1.d Companion;
    private final int key;
    public static final com.truecaller.insights.database.entities.processing.ProcessedDuring NEW_MESSAGE_SYNC = new com.truecaller.insights.database.entities.processing.ProcessedDuring("NEW_MESSAGE_SYNC", 0, 1);
    public static final com.truecaller.insights.database.entities.processing.ProcessedDuring HISTORIC_MESSAGE_SYNC = new com.truecaller.insights.database.entities.processing.ProcessedDuring("HISTORIC_MESSAGE_SYNC", 1, 2);

    private static final /* synthetic */ com.truecaller.insights.database.entities.processing.ProcessedDuring[] $values() {
        return new com.truecaller.insights.database.entities.processing.ProcessedDuring[]{NEW_MESSAGE_SYNC, HISTORIC_MESSAGE_SYNC};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qu1.d] */
    static {
        com.truecaller.insights.database.entities.processing.ProcessedDuring[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ProcessedDuring(java.lang.String str, int i, int i2) {
        this.key = i2;
    }

    @org.jetbrains.annotations.Nullable
    public static final com.truecaller.insights.database.entities.processing.ProcessedDuring fromKey(int i) {
        java.lang.Object obj;
        Companion.getClass();
        java.util.Iterator it = getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.truecaller.insights.database.entities.processing.ProcessedDuring) obj).getKey() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring = (com.truecaller.insights.database.entities.processing.ProcessedDuring) obj;
        if (processedDuring == null) {
            return NEW_MESSAGE_SYNC;
        }
        return processedDuring;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static final int toKey(@org.jetbrains.annotations.NotNull com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processedDuring, "processedDuring");
        return processedDuring.getKey();
    }

    public static com.truecaller.insights.database.entities.processing.ProcessedDuring valueOf(java.lang.String str) {
        return (com.truecaller.insights.database.entities.processing.ProcessedDuring) java.lang.Enum.valueOf(com.truecaller.insights.database.entities.processing.ProcessedDuring.class, str);
    }

    public static com.truecaller.insights.database.entities.processing.ProcessedDuring[] values() {
        return (com.truecaller.insights.database.entities.processing.ProcessedDuring[]) $VALUES.clone();
    }

    public final int getKey() {
        return this.key;
    }
}
