package com.truecaller.premium.data.component.banner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/premium/data/component/banner/BannerDismissCondition;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "y82/bar", "OPTION_TO_DISMISS", "DISMISS_ON_CLICK", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BannerDismissCondition {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.component.banner.BannerDismissCondition[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final y82.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.component.banner.BannerDismissCondition OPTION_TO_DISMISS = new com.truecaller.premium.data.component.banner.BannerDismissCondition("OPTION_TO_DISMISS", 0, "dismiss_option");
    public static final com.truecaller.premium.data.component.banner.BannerDismissCondition DISMISS_ON_CLICK = new com.truecaller.premium.data.component.banner.BannerDismissCondition("DISMISS_ON_CLICK", 1, "banner_click");

    private static final /* synthetic */ com.truecaller.premium.data.component.banner.BannerDismissCondition[] $values() {
        return new com.truecaller.premium.data.component.banner.BannerDismissCondition[]{OPTION_TO_DISMISS, DISMISS_ON_CLICK};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [y82.bar, java.lang.Object] */
    static {
        com.truecaller.premium.data.component.banner.BannerDismissCondition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private BannerDismissCondition(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.component.banner.BannerDismissCondition valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.component.banner.BannerDismissCondition) java.lang.Enum.valueOf(com.truecaller.premium.data.component.banner.BannerDismissCondition.class, str);
    }

    public static com.truecaller.premium.data.component.banner.BannerDismissCondition[] values() {
        return (com.truecaller.premium.data.component.banner.BannerDismissCondition[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
