package com.truecaller.insights.tracking.utils.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/tracking/utils/api/model/InteractionActionType;", "", "", "action", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "Companion", "nx1/n", "CLICK", "DOUBLE_CLICK", "LONG_CLICK", "TAP", "DOUBLE_TAP", "LONG_PRESS", "SWIPE", "SCROLL", "tracking-utils_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InteractionActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.tracking.utils.api.model.InteractionActionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final nx1.n Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String action;
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType CLICK = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("CLICK", 0, "click");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType DOUBLE_CLICK = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("DOUBLE_CLICK", 1, "double_click");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType LONG_CLICK = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("LONG_CLICK", 2, "long_click");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType TAP = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("TAP", 3, "tap");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType DOUBLE_TAP = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("DOUBLE_TAP", 4, "double_tap");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType LONG_PRESS = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("LONG_PRESS", 5, "long_press");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType SWIPE = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("SWIPE", 6, "swipe");
    public static final com.truecaller.insights.tracking.utils.api.model.InteractionActionType SCROLL = new com.truecaller.insights.tracking.utils.api.model.InteractionActionType("SCROLL", 7, "scroll");

    private static final /* synthetic */ com.truecaller.insights.tracking.utils.api.model.InteractionActionType[] $values() {
        return new com.truecaller.insights.tracking.utils.api.model.InteractionActionType[]{CLICK, DOUBLE_CLICK, LONG_CLICK, TAP, DOUBLE_TAP, LONG_PRESS, SWIPE, SCROLL};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [nx1.n, java.lang.Object] */
    static {
        com.truecaller.insights.tracking.utils.api.model.InteractionActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private InteractionActionType(java.lang.String str, int i, java.lang.String str2) {
        this.action = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.tracking.utils.api.model.InteractionActionType valueOf(java.lang.String str) {
        return (com.truecaller.insights.tracking.utils.api.model.InteractionActionType) java.lang.Enum.valueOf(com.truecaller.insights.tracking.utils.api.model.InteractionActionType.class, str);
    }

    public static com.truecaller.insights.tracking.utils.api.model.InteractionActionType[] values() {
        return (com.truecaller.insights.tracking.utils.api.model.InteractionActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction() {
        return this.action;
    }
}
