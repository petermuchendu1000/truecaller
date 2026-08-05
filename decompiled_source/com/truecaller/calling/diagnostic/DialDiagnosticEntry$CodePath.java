package com.truecaller.calling.diagnostic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/calling/diagnostic/DialDiagnosticEntry$CodePath", "", "Lcom/truecaller/calling/diagnostic/DialDiagnosticEntry$CodePath;", "<init>", "(Ljava/lang/String;I)V", "SWEDISH_WORKAROUND", "DIAL_ASSIST", "REGION_PARSER", "FALLBACK", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DialDiagnosticEntry$CodePath {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath[] $VALUES;
    public static final com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath SWEDISH_WORKAROUND = new com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath("SWEDISH_WORKAROUND", 0);
    public static final com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath DIAL_ASSIST = new com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath("DIAL_ASSIST", 1);
    public static final com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath REGION_PARSER = new com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath("REGION_PARSER", 2);
    public static final com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath FALLBACK = new com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath("FALLBACK", 3);

    private static final /* synthetic */ com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath[] $values() {
        return new com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath[]{SWEDISH_WORKAROUND, DIAL_ASSIST, REGION_PARSER, FALLBACK};
    }

    static {
        com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DialDiagnosticEntry$CodePath(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath valueOf(java.lang.String str) {
        return (com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath) java.lang.Enum.valueOf(com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath.class, str);
    }

    public static com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath[] values() {
        return (com.truecaller.calling.diagnostic.DialDiagnosticEntry$CodePath[]) $VALUES.clone();
    }
}
