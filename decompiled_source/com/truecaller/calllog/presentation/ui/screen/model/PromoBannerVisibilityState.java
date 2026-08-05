package com.truecaller.calllog.presentation.ui.screen.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/calllog/presentation/ui/screen/model/PromoBannerVisibilityState;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "HIDDEN", "BANNER_MIGRATION", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PromoBannerVisibilityState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState[] $VALUES;
    public static final com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState VISIBLE = new com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState("VISIBLE", 0);
    public static final com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState HIDDEN = new com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState("HIDDEN", 1);
    public static final com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState BANNER_MIGRATION = new com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState("BANNER_MIGRATION", 2);

    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState[] $values() {
        return new com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState[]{VISIBLE, HIDDEN, BANNER_MIGRATION};
    }

    static {
        com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PromoBannerVisibilityState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState valueOf(java.lang.String str) {
        return (com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState) java.lang.Enum.valueOf(com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState.class, str);
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState[] values() {
        return (com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState[]) $VALUES.clone();
    }
}
