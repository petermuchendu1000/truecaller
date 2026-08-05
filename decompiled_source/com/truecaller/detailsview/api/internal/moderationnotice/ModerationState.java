package com.truecaller.detailsview.api.internal.moderationnotice;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/detailsview/api/internal/moderationnotice/ModerationState;", "", "<init>", "(Ljava/lang/String;I)V", "Moderated", "NotModerated", "Unknown", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ModerationState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.internal.moderationnotice.ModerationState[] $VALUES;
    public static final com.truecaller.detailsview.api.internal.moderationnotice.ModerationState Moderated = new com.truecaller.detailsview.api.internal.moderationnotice.ModerationState("Moderated", 0);
    public static final com.truecaller.detailsview.api.internal.moderationnotice.ModerationState NotModerated = new com.truecaller.detailsview.api.internal.moderationnotice.ModerationState("NotModerated", 1);
    public static final com.truecaller.detailsview.api.internal.moderationnotice.ModerationState Unknown = new com.truecaller.detailsview.api.internal.moderationnotice.ModerationState("Unknown", 2);

    private static final /* synthetic */ com.truecaller.detailsview.api.internal.moderationnotice.ModerationState[] $values() {
        return new com.truecaller.detailsview.api.internal.moderationnotice.ModerationState[]{Moderated, NotModerated, Unknown};
    }

    static {
        com.truecaller.detailsview.api.internal.moderationnotice.ModerationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ModerationState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.internal.moderationnotice.ModerationState valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.internal.moderationnotice.ModerationState) java.lang.Enum.valueOf(com.truecaller.detailsview.api.internal.moderationnotice.ModerationState.class, str);
    }

    public static com.truecaller.detailsview.api.internal.moderationnotice.ModerationState[] values() {
        return (com.truecaller.detailsview.api.internal.moderationnotice.ModerationState[]) $VALUES.clone();
    }
}
