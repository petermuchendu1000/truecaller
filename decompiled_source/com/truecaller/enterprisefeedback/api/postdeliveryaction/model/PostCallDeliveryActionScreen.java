package com.truecaller.enterprisefeedback.api.postdeliveryaction.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostCallDeliveryActionScreen;", "", "context", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContext", "()Ljava/lang/String;", "FACS", "NEO_FACS", "PACS", "NEO_PACS", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PostCallDeliveryActionScreen {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;
    public static final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen FACS = new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen("FACS", 0, "facs");
    public static final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen NEO_FACS = new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen("NEO_FACS", 1, "neoFacs");
    public static final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen PACS = new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen("PACS", 2, "pacs");
    public static final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen NEO_PACS = new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen("NEO_PACS", 3, "neoPacs");
    public static final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen UNKNOWN = new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen[] $values() {
        return new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen[]{FACS, NEO_FACS, PACS, NEO_PACS, UNKNOWN};
    }

    static {
        com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PostCallDeliveryActionScreen(java.lang.String str, int i, java.lang.String str2) {
        this.context = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen valueOf(java.lang.String str) {
        return (com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen) java.lang.Enum.valueOf(com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen.class, str);
    }

    public static com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen[] values() {
        return (com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }
}
