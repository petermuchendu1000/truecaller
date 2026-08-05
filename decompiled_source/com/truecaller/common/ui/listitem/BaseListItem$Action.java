package com.truecaller.common.ui.listitem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/common/ui/listitem/BaseListItem$Action", "", "Lcom/truecaller/common/ui/listitem/BaseListItem$Action;", "", "drawableResId", "<init>", "(Ljava/lang/String;II)V", "I", "getDrawableResId", "()I", "CALL", "WHATSAPP", "HIDDEN_CALL", "PROFILE", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class BaseListItem$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.ui.listitem.BaseListItem$Action[] $VALUES;
    private final int drawableResId;
    public static final com.truecaller.common.ui.listitem.BaseListItem$Action CALL = new com.truecaller.common.ui.listitem.BaseListItem$Action("CALL", 0, 2131233333);
    public static final com.truecaller.common.ui.listitem.BaseListItem$Action WHATSAPP = new com.truecaller.common.ui.listitem.BaseListItem$Action("WHATSAPP", 1, 2131233334);
    public static final com.truecaller.common.ui.listitem.BaseListItem$Action HIDDEN_CALL = new com.truecaller.common.ui.listitem.BaseListItem$Action("HIDDEN_CALL", 2, 2131233333);
    public static final com.truecaller.common.ui.listitem.BaseListItem$Action PROFILE = new com.truecaller.common.ui.listitem.BaseListItem$Action("PROFILE", 3, 2131232076);

    private static final /* synthetic */ com.truecaller.common.ui.listitem.BaseListItem$Action[] $values() {
        return new com.truecaller.common.ui.listitem.BaseListItem$Action[]{CALL, WHATSAPP, HIDDEN_CALL, PROFILE};
    }

    static {
        com.truecaller.common.ui.listitem.BaseListItem$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BaseListItem$Action(java.lang.String str, int i, int i2) {
        this.drawableResId = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.ui.listitem.BaseListItem$Action valueOf(java.lang.String str) {
        return (com.truecaller.common.ui.listitem.BaseListItem$Action) java.lang.Enum.valueOf(com.truecaller.common.ui.listitem.BaseListItem$Action.class, str);
    }

    public static com.truecaller.common.ui.listitem.BaseListItem$Action[] values() {
        return (com.truecaller.common.ui.listitem.BaseListItem$Action[]) $VALUES.clone();
    }

    public final int getDrawableResId() {
        return this.drawableResId;
    }
}
