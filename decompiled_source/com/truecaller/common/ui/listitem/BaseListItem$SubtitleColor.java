package com.truecaller.common.ui.listitem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000f\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/common/ui/listitem/BaseListItem$SubtitleColor", "", "Lcom/truecaller/common/ui/listitem/BaseListItem$SubtitleColor;", "", "textColorAttr", "textColorBoldAttr", "iconColorAttr", "iconColorBoldAttr", "<init>", "(Ljava/lang/String;IIIII)V", "I", "getTextColorAttr", "()I", "getTextColorBoldAttr", "getIconColorAttr", "getIconColorBoldAttr", "DEFAULT", "BLUE", "RED", "ACTIVE_BLUE", "ACTIVE_RED", "ACTIVE_GREEN", "ACTIVE_GREY2", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class BaseListItem$SubtitleColor {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor[] $VALUES;
    private final int iconColorAttr;
    private final int iconColorBoldAttr;
    private final int textColorAttr;
    private final int textColorBoldAttr;
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor DEFAULT = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("DEFAULT", 0, 2130970565, 2130970563, 2130970566, 2130970565);
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor BLUE = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("BLUE", 1, 2130970529, 2130970529, 2130970529, 2130970529);
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor RED = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("RED", 2, 2130970474, 2130970474, 2130970474, 2130970474);
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor ACTIVE_BLUE = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("ACTIVE_BLUE", 3, 2130970547, 2130970547, 2130970547, 2130970547);
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor ACTIVE_RED = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("ACTIVE_RED", 4, 2130970551, 2130970551, 2130970551, 2130970551);
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor ACTIVE_GREEN = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("ACTIVE_GREEN", 5, 2130970548, 2130970548, 2130970548, 2130970548);
    public static final com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor ACTIVE_GREY2 = new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor("ACTIVE_GREY2", 6, 2130970550, 2130970550, 2130970550, 2130970550);

    private static final /* synthetic */ com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor[] $values() {
        return new com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor[]{DEFAULT, BLUE, RED, ACTIVE_BLUE, ACTIVE_RED, ACTIVE_GREEN, ACTIVE_GREY2};
    }

    static {
        com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BaseListItem$SubtitleColor(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        this.textColorAttr = i2;
        this.textColorBoldAttr = i3;
        this.iconColorAttr = i4;
        this.iconColorBoldAttr = i5;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor valueOf(java.lang.String str) {
        return (com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor) java.lang.Enum.valueOf(com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor.class, str);
    }

    public static com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor[] values() {
        return (com.truecaller.common.ui.listitem.BaseListItem$SubtitleColor[]) $VALUES.clone();
    }

    public final int getIconColorAttr() {
        return this.iconColorAttr;
    }

    public final int getIconColorBoldAttr() {
        return this.iconColorBoldAttr;
    }

    public final int getTextColorAttr() {
        return this.textColorAttr;
    }

    public final int getTextColorBoldAttr() {
        return this.textColorBoldAttr;
    }
}
