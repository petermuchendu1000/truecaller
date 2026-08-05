package com.truecaller.insights.tracking.utils.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/insights/tracking/utils/api/model/Transport;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "nx1/o", "SMS", "IM", "tracking-utils_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Transport {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.tracking.utils.api.model.Transport[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final nx1.o Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.tracking.utils.api.model.Transport SMS = new com.truecaller.insights.tracking.utils.api.model.Transport("SMS", 0, "sms");
    public static final com.truecaller.insights.tracking.utils.api.model.Transport IM = new com.truecaller.insights.tracking.utils.api.model.Transport("IM", 1, "im");

    private static final /* synthetic */ com.truecaller.insights.tracking.utils.api.model.Transport[] $values() {
        return new com.truecaller.insights.tracking.utils.api.model.Transport[]{SMS, IM};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nx1.o] */
    static {
        com.truecaller.insights.tracking.utils.api.model.Transport[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private Transport(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.tracking.utils.api.model.Transport valueOf(java.lang.String str) {
        return (com.truecaller.insights.tracking.utils.api.model.Transport) java.lang.Enum.valueOf(com.truecaller.insights.tracking.utils.api.model.Transport.class, str);
    }

    public static com.truecaller.insights.tracking.utils.api.model.Transport[] values() {
        return (com.truecaller.insights.tracking.utils.api.model.Transport[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
