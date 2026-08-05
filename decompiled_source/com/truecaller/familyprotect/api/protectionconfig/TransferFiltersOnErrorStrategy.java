package com.truecaller.familyprotect.api.protectionconfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/familyprotect/api/protectionconfig/TransferFiltersOnErrorStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "IGNORE", "ABORT", "ROLLBACK", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TransferFiltersOnErrorStrategy {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy[] $VALUES;
    public static final com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy IGNORE = new com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy("IGNORE", 0);
    public static final com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy ABORT = new com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy("ABORT", 1);
    public static final com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy ROLLBACK = new com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy("ROLLBACK", 2);

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy[]{IGNORE, ABORT, ROLLBACK};
    }

    static {
        com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TransferFiltersOnErrorStrategy(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.TransferFiltersOnErrorStrategy[]) $VALUES.clone();
    }
}
