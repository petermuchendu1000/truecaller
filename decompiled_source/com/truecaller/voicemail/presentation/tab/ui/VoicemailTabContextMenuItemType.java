package com.truecaller.voicemail.presentation.tab.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/voicemail/presentation/tab/ui/VoicemailTabContextMenuItemType;", "", "", "iconResId", "textResId", "", "isDefaultIconColors", "<init>", "(Ljava/lang/String;IIIZ)V", "Lkotlin/Function0;", "", "onClick", "Lu43/baz;", "toContextMenuItem", "(Lkotlin/jvm/functions/Function0;)Lu43/baz;", "I", "getIconResId", "()I", "getTextResId", "Z", "()Z", "DELETE_ALL", "SETTINGS", "DISABLE_VOICEMAIL", "ENABLE_VOICEMAIL", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailTabContextMenuItemType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType[] $VALUES;
    private final int iconResId;
    private final boolean isDefaultIconColors;
    private final int textResId;
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType DELETE_ALL = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType("DELETE_ALL", 0, 2131233356, 2132023842, false);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType SETTINGS = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType("SETTINGS", 1, 2131233557, 2132023838, false, 4, null);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType DISABLE_VOICEMAIL = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType("DISABLE_VOICEMAIL", 2, 2131232530, 2132023836, false, 4, null);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType ENABLE_VOICEMAIL = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType("ENABLE_VOICEMAIL", 3, 2131232577, 2132023837, false, 4, null);

    private static final /* synthetic */ com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType[] $values() {
        return new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType[]{DELETE_ALL, SETTINGS, DISABLE_VOICEMAIL, ENABLE_VOICEMAIL};
    }

    static {
        com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VoicemailTabContextMenuItemType(java.lang.String str, int i, int i2, int i3, boolean z) {
        this.iconResId = i2;
        this.textResId = i3;
        this.isDefaultIconColors = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType valueOf(java.lang.String str) {
        return (com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType) java.lang.Enum.valueOf(com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType.class, str);
    }

    public static com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType[] values() {
        return (com.truecaller.voicemail.presentation.tab.ui.VoicemailTabContextMenuItemType[]) $VALUES.clone();
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    /* renamed from: isDefaultIconColors, reason: from getter */
    public final boolean getIsDefaultIconColors() {
        return this.isDefaultIconColors;
    }

    @org.jetbrains.annotations.NotNull
    public final u43.baz toContextMenuItem(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new u43.baz(onClick, this.isDefaultIconColors, this.iconResId, this.textResId);
    }

    public /* synthetic */ VoicemailTabContextMenuItemType(java.lang.String str, int i, int i2, int i3, boolean z, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i4 & 4) != 0 ? true : z);
    }
}
