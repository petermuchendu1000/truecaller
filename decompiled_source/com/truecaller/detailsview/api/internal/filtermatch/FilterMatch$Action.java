package com.truecaller.detailsview.api.internal.filtermatch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/detailsview/api/internal/filtermatch/FilterMatch$Action", "", "Lcom/truecaller/detailsview/api/internal/filtermatch/FilterMatch$Action;", "<init>", "(Ljava/lang/String;I)V", "NoneFound", "Whitelisted", "Blacklisted", "Disabled", "AutoReject", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FilterMatch$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action[] $VALUES;
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action NoneFound = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action("NoneFound", 0);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action Whitelisted = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action("Whitelisted", 1);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action Blacklisted = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action("Blacklisted", 2);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action Disabled = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action("Disabled", 3);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action AutoReject = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action("AutoReject", 4);

    private static final /* synthetic */ com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action[] $values() {
        return new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action[]{NoneFound, Whitelisted, Blacklisted, Disabled, AutoReject};
    }

    static {
        com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FilterMatch$Action(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action) java.lang.Enum.valueOf(com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action.class, str);
    }

    public static com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action[] values() {
        return (com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Action[]) $VALUES.clone();
    }
}
