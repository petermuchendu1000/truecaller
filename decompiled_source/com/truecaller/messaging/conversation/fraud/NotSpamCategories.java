package com.truecaller.messaging.conversation.fraud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/messaging/conversation/fraud/NotSpamCategories;", "", "", "id", "<init>", "(Ljava/lang/String;IJ)V", "J", "getId", "()J", "Companion", "b12/f", "TRANSACTION", "BILL", "DELIVERY", "TRAVEL", "OTP", "OTHER", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotSpamCategories {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.NotSpamCategories[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final b12.f Companion;
    private final long id;
    public static final com.truecaller.messaging.conversation.fraud.NotSpamCategories TRANSACTION = new com.truecaller.messaging.conversation.fraud.NotSpamCategories("TRANSACTION", 0, 1);
    public static final com.truecaller.messaging.conversation.fraud.NotSpamCategories BILL = new com.truecaller.messaging.conversation.fraud.NotSpamCategories("BILL", 1, 2);
    public static final com.truecaller.messaging.conversation.fraud.NotSpamCategories DELIVERY = new com.truecaller.messaging.conversation.fraud.NotSpamCategories("DELIVERY", 2, 3);
    public static final com.truecaller.messaging.conversation.fraud.NotSpamCategories TRAVEL = new com.truecaller.messaging.conversation.fraud.NotSpamCategories("TRAVEL", 3, 4);
    public static final com.truecaller.messaging.conversation.fraud.NotSpamCategories OTP = new com.truecaller.messaging.conversation.fraud.NotSpamCategories("OTP", 4, 5);
    public static final com.truecaller.messaging.conversation.fraud.NotSpamCategories OTHER = new com.truecaller.messaging.conversation.fraud.NotSpamCategories("OTHER", 5, 6);

    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.NotSpamCategories[] $values() {
        return new com.truecaller.messaging.conversation.fraud.NotSpamCategories[]{TRANSACTION, BILL, DELIVERY, TRAVEL, OTP, OTHER};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [b12.f, java.lang.Object] */
    static {
        com.truecaller.messaging.conversation.fraud.NotSpamCategories[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private NotSpamCategories(java.lang.String str, int i, long j) {
        this.id = j;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.fraud.NotSpamCategories valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.fraud.NotSpamCategories) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.fraud.NotSpamCategories.class, str);
    }

    public static com.truecaller.messaging.conversation.fraud.NotSpamCategories[] values() {
        return (com.truecaller.messaging.conversation.fraud.NotSpamCategories[]) $VALUES.clone();
    }

    public final long getId() {
        return this.id;
    }
}
