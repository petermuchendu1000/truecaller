package com.truecaller.messaging.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/messaging/api/RCSMessageType;", "", "", "type", "<init>", "(Ljava/lang/String;II)V", "I", "getType", "()I", "Companion", "d02/baz", "RCS_TEXT", "RCS_TEXT_AND_MEDIA", "RCS_MEDIA", "RCS_UNIDENTIFIED", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RCSMessageType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.api.RCSMessageType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final d02.baz Companion;
    private final int type;
    public static final com.truecaller.messaging.api.RCSMessageType RCS_TEXT = new com.truecaller.messaging.api.RCSMessageType("RCS_TEXT", 0, 1);
    public static final com.truecaller.messaging.api.RCSMessageType RCS_TEXT_AND_MEDIA = new com.truecaller.messaging.api.RCSMessageType("RCS_TEXT_AND_MEDIA", 1, 2);
    public static final com.truecaller.messaging.api.RCSMessageType RCS_MEDIA = new com.truecaller.messaging.api.RCSMessageType("RCS_MEDIA", 2, 3);
    public static final com.truecaller.messaging.api.RCSMessageType RCS_UNIDENTIFIED = new com.truecaller.messaging.api.RCSMessageType("RCS_UNIDENTIFIED", 3, 4);

    private static final /* synthetic */ com.truecaller.messaging.api.RCSMessageType[] $values() {
        return new com.truecaller.messaging.api.RCSMessageType[]{RCS_TEXT, RCS_TEXT_AND_MEDIA, RCS_MEDIA, RCS_UNIDENTIFIED};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, d02.baz] */
    static {
        com.truecaller.messaging.api.RCSMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private RCSMessageType(java.lang.String str, int i, int i2) {
        this.type = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.api.RCSMessageType valueOf(java.lang.String str) {
        return (com.truecaller.messaging.api.RCSMessageType) java.lang.Enum.valueOf(com.truecaller.messaging.api.RCSMessageType.class, str);
    }

    public static com.truecaller.messaging.api.RCSMessageType[] values() {
        return (com.truecaller.messaging.api.RCSMessageType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
