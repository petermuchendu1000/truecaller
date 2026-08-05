package com.truecaller.contactrequest.pending.card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/contactrequest/pending/card/ContactRequestStackedMvp$View$ViewState", "", "Lcom/truecaller/contactrequest/pending/card/ContactRequestStackedMvp$View$ViewState;", "", "id", "<init>", "(Ljava/lang/String;II)V", "I", "getId", "()I", "Companion", "q71/c", "SingleItem", "MultipleItems", "PrepareAnimation", "Accept", "Reject", "PrepareAnimationSingleItem", "SingleItemAccept", "SingleItemReject", "PostAnimation", "Empty", "Unknown", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactRequestStackedMvp$View$ViewState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final q71.c Companion;
    private final int id;
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState SingleItem = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("SingleItem", 0, 2131366482);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState MultipleItems = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("MultipleItems", 1, 2131365406);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState PrepareAnimation = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("PrepareAnimation", 2, 2131365800);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState Accept = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("Accept", 3, 2131361833);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState Reject = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("Reject", 4, 2131366034);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState PrepareAnimationSingleItem = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("PrepareAnimationSingleItem", 5, 2131365801);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState SingleItemAccept = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("SingleItemAccept", 6, 2131366483);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState SingleItemReject = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("SingleItemReject", 7, 2131366484);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState PostAnimation = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("PostAnimation", 8, 2131365766);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState Empty = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("Empty", 9, 2131366620);
    public static final com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState Unknown = new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState("Unknown", 10, -1);

    private static final /* synthetic */ com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[] $values() {
        return new com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[]{SingleItem, MultipleItems, PrepareAnimation, Accept, Reject, PrepareAnimationSingleItem, SingleItemAccept, SingleItemReject, PostAnimation, Empty, Unknown};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [q71.c, java.lang.Object] */
    static {
        com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ContactRequestStackedMvp$View$ViewState(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState valueOf(java.lang.String str) {
        return (com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState) java.lang.Enum.valueOf(com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState.class, str);
    }

    public static com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[] values() {
        return (com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
