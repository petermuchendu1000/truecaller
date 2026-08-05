package com.truecaller.details_view.ui.optionmenu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/details_view/ui/optionmenu/OptionMenu;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "SHARE", "SAVE_CONTACT", "COPY_CONTACT", "COPY_NAME", "COPY_PHONE", "DELETE_CONTACT", "DELETE_IDENTIFIED_CONTACT", "SEARCH_WEB", "FAVORITE", "UNFAVORITE", "EDIT", "REPORT_PROFILE", "SHOW_PAY_APPS", "COLLECT_DIAGNOSTIC", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OptionMenu {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.details_view.ui.optionmenu.OptionMenu[] $VALUES;
    private final int id;
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu SHARE = new com.truecaller.details_view.ui.optionmenu.OptionMenu("SHARE", 0, 2131362068);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu SAVE_CONTACT = new com.truecaller.details_view.ui.optionmenu.OptionMenu("SAVE_CONTACT", 1, 2131362057);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu COPY_CONTACT = new com.truecaller.details_view.ui.optionmenu.OptionMenu("COPY_CONTACT", 2, 2131361996);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu COPY_NAME = new com.truecaller.details_view.ui.optionmenu.OptionMenu("COPY_NAME", 3, 2131361997);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu COPY_PHONE = new com.truecaller.details_view.ui.optionmenu.OptionMenu("COPY_PHONE", 4, 2131361998);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu DELETE_CONTACT = new com.truecaller.details_view.ui.optionmenu.OptionMenu("DELETE_CONTACT", 5, 2131362004);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu DELETE_IDENTIFIED_CONTACT = new com.truecaller.details_view.ui.optionmenu.OptionMenu("DELETE_IDENTIFIED_CONTACT", 6, 2131362005);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu SEARCH_WEB = new com.truecaller.details_view.ui.optionmenu.OptionMenu("SEARCH_WEB", 7, 2131362062);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu FAVORITE = new com.truecaller.details_view.ui.optionmenu.OptionMenu("FAVORITE", 8, 2131362013);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu UNFAVORITE = new com.truecaller.details_view.ui.optionmenu.OptionMenu("UNFAVORITE", 9, 2131362080);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu EDIT = new com.truecaller.details_view.ui.optionmenu.OptionMenu("EDIT", 10, 2131362009);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu REPORT_PROFILE = new com.truecaller.details_view.ui.optionmenu.OptionMenu("REPORT_PROFILE", 11, 2131362054);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu SHOW_PAY_APPS = new com.truecaller.details_view.ui.optionmenu.OptionMenu("SHOW_PAY_APPS", 12, 2131362073);
    public static final com.truecaller.details_view.ui.optionmenu.OptionMenu COLLECT_DIAGNOSTIC = new com.truecaller.details_view.ui.optionmenu.OptionMenu("COLLECT_DIAGNOSTIC", 13, 2131361993);

    private static final /* synthetic */ com.truecaller.details_view.ui.optionmenu.OptionMenu[] $values() {
        return new com.truecaller.details_view.ui.optionmenu.OptionMenu[]{SHARE, SAVE_CONTACT, COPY_CONTACT, COPY_NAME, COPY_PHONE, DELETE_CONTACT, DELETE_IDENTIFIED_CONTACT, SEARCH_WEB, FAVORITE, UNFAVORITE, EDIT, REPORT_PROFILE, SHOW_PAY_APPS, COLLECT_DIAGNOSTIC};
    }

    static {
        com.truecaller.details_view.ui.optionmenu.OptionMenu[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OptionMenu(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.details_view.ui.optionmenu.OptionMenu valueOf(java.lang.String str) {
        return (com.truecaller.details_view.ui.optionmenu.OptionMenu) java.lang.Enum.valueOf(com.truecaller.details_view.ui.optionmenu.OptionMenu.class, str);
    }

    public static com.truecaller.details_view.ui.optionmenu.OptionMenu[] values() {
        return (com.truecaller.details_view.ui.optionmenu.OptionMenu[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
