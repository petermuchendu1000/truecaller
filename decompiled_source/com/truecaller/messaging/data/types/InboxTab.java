package com.truecaller.messaging.data.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/messaging/data/types/InboxTab;", "", "", "conversationFilter", "", "analyticsContext", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "I", "getConversationFilter", "()I", "Ljava/lang/String;", "getAnalyticsContext", "()Ljava/lang/String;", "Companion", "c22/d", "PERSONAL", "OTHERS", "BUSINESS", "SPAM", "PROMOTIONAL", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InboxTab {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.data.types.InboxTab[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final c22.d Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsContext;
    private final int conversationFilter;
    public static final com.truecaller.messaging.data.types.InboxTab PERSONAL = new com.truecaller.messaging.data.types.InboxTab("PERSONAL", 0, 1, "inbox_main_tab");
    public static final com.truecaller.messaging.data.types.InboxTab OTHERS = new com.truecaller.messaging.data.types.InboxTab("OTHERS", 1, 2, "inbox_others_tab");
    public static final com.truecaller.messaging.data.types.InboxTab BUSINESS = new com.truecaller.messaging.data.types.InboxTab("BUSINESS", 2, 1, "inbox_business_tab");
    public static final com.truecaller.messaging.data.types.InboxTab SPAM = new com.truecaller.messaging.data.types.InboxTab("SPAM", 3, 3, "inbox_spam_tab");
    public static final com.truecaller.messaging.data.types.InboxTab PROMOTIONAL = new com.truecaller.messaging.data.types.InboxTab("PROMOTIONAL", 4, 4, "inbox_promotional_tab");

    private static final /* synthetic */ com.truecaller.messaging.data.types.InboxTab[] $values() {
        return new com.truecaller.messaging.data.types.InboxTab[]{PERSONAL, OTHERS, BUSINESS, SPAM, PROMOTIONAL};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [c22.d, java.lang.Object] */
    static {
        com.truecaller.messaging.data.types.InboxTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private InboxTab(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.conversationFilter = i2;
        this.analyticsContext = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.data.types.InboxTab valueOf(java.lang.String str) {
        return (com.truecaller.messaging.data.types.InboxTab) java.lang.Enum.valueOf(com.truecaller.messaging.data.types.InboxTab.class, str);
    }

    public static com.truecaller.messaging.data.types.InboxTab[] values() {
        return (com.truecaller.messaging.data.types.InboxTab[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsContext() {
        return this.analyticsContext;
    }

    public final int getConversationFilter() {
        return this.conversationFilter;
    }
}
