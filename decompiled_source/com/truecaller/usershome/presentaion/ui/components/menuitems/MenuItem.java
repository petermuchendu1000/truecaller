package com.truecaller.usershome.presentaion.ui.components.menuitems;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0017\b\u0080\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/usershome/presentaion/ui/components/menuitems/MenuItem;", "", "", "titleRes", "iconRes", "<init>", "(Ljava/lang/String;III)V", "I", "getTitleRes", "()I", "getIconRes", "Companion", "uz2/e", "WHO_VIEWED_MY_PROFILE", "WHO_SEARCHED_FOR_ME", "CONTACT_REQUESTS", "FRAUD_INSURANCE", "SETTINGS", "BACKUP", "CHANGE_APP_THEME", "ANDROID_WATCH", "GOVERNMENT_SERVICES", "INVITE_FRIENDS", "CONNECT_WITH_US", "HELP", "presentaion_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class MenuItem {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[] $VALUES;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem ANDROID_WATCH;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem BACKUP;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem CHANGE_APP_THEME;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem CONNECT_WITH_US;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem CONTACT_REQUESTS;

    @org.jetbrains.annotations.NotNull
    public static final uz2.e Companion;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem FRAUD_INSURANCE;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem GOVERNMENT_SERVICES;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem HELP;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem INVITE_FRIENDS;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem SETTINGS;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem WHO_SEARCHED_FOR_ME;
    public static final com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem WHO_VIEWED_MY_PROFILE;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.util.List<com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem>> otherItems;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.util.List<com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem>> premiumItems;
    private final int iconRes;
    private final int titleRes;

    private static final /* synthetic */ com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[] $values() {
        return new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[]{WHO_VIEWED_MY_PROFILE, WHO_SEARCHED_FOR_ME, CONTACT_REQUESTS, FRAUD_INSURANCE, SETTINGS, BACKUP, CHANGE_APP_THEME, ANDROID_WATCH, GOVERNMENT_SERVICES, INVITE_FRIENDS, CONNECT_WITH_US, HELP};
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, uz2.e] */
    static {
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("WHO_VIEWED_MY_PROFILE", 0, 2132023680, 2131233618);
        WHO_VIEWED_MY_PROFILE = menuItem;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem2 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("WHO_SEARCHED_FOR_ME", 1, 2132023679, 2131233617);
        WHO_SEARCHED_FOR_ME = menuItem2;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem3 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("CONTACT_REQUESTS", 2, 2132023674, 2131233432);
        CONTACT_REQUESTS = menuItem3;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem4 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("FRAUD_INSURANCE", 3, 2132023675, 2131233464);
        FRAUD_INSURANCE = menuItem4;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem5 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("SETTINGS", 4, 2132021630, 2131233557);
        SETTINGS = menuItem5;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem6 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("BACKUP", 5, 2132023671, 2131232208);
        BACKUP = menuItem6;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem7 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("CHANGE_APP_THEME", 6, 2132023672, 2131233424);
        CHANGE_APP_THEME = menuItem7;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem8 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("ANDROID_WATCH", 7, 2132023670, 2131232941);
        ANDROID_WATCH = menuItem8;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem9 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("GOVERNMENT_SERVICES", 8, 2132023676, 2131232694);
        GOVERNMENT_SERVICES = menuItem9;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem10 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("INVITE_FRIENDS", 9, 2132023678, 2131232771);
        INVITE_FRIENDS = menuItem10;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem11 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("CONNECT_WITH_US", 10, 2132023673, 2131232532);
        CONNECT_WITH_US = menuItem11;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem menuItem12 = new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem("HELP", 11, 2132023677, 2131232627);
        HELP = menuItem12;
        com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        premiumItems = kotlin.collections.x.c(kotlin.collections.y.j(new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[]{menuItem, menuItem2, menuItem3, menuItem4}));
        otherItems = kotlin.collections.y.j(new java.util.List[]{kotlin.collections.y.j(new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[]{menuItem5, menuItem6, menuItem7, menuItem8, menuItem9}), kotlin.collections.y.j(new com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[]{menuItem10, menuItem11, menuItem12})});
    }

    private MenuItem(java.lang.String str, int i, int i2, int i3) {
        this.titleRes = i2;
        this.iconRes = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem valueOf(java.lang.String str) {
        return (com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem) java.lang.Enum.valueOf(com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem.class, str);
    }

    public static com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[] values() {
        return (com.truecaller.usershome.presentaion.ui.components.menuitems.MenuItem[]) $VALUES.clone();
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }
}
