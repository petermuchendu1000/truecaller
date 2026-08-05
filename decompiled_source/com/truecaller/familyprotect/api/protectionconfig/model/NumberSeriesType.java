package com.truecaller.familyprotect.api.protectionconfig.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/truecaller/familyprotect/api/protectionconfig/model/NumberSeriesType;", "", "prefix", "", "suffix", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getSuffix", "START", "CONTAIN", "END", "formatPattern", "input", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NumberSeriesType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String prefix;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String suffix;
    public static final com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType START = new com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType("START", 0, "^", ".*");
    public static final com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType CONTAIN = new com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType("CONTAIN", 1, ".*", ".*");
    public static final com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType END = new com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType("END", 2, ".*", "$");

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType[]{START, CONTAIN, END};
    }

    static {
        com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NumberSeriesType(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.prefix = str2;
        this.suffix = str3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.model.NumberSeriesType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatPattern(@org.jetbrains.annotations.NotNull java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return h8.s0.q(this.prefix, input, this.suffix);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefix() {
        return this.prefix;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSuffix() {
        return this.suffix;
    }
}
