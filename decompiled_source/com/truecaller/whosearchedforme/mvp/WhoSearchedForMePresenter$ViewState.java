package com.truecaller.whosearchedforme.mvp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/whosearchedforme/mvp/WhoSearchedForMePresenter$ViewState", "", "Lcom/truecaller/whosearchedforme/mvp/WhoSearchedForMePresenter$ViewState;", "<init>", "(Ljava/lang/String;I)V", "NONE_PREMIUM", "PREMIUM", "NONE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhoSearchedForMePresenter$ViewState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState[] $VALUES;
    public static final com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState NONE_PREMIUM = new com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState("NONE_PREMIUM", 0);
    public static final com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState PREMIUM = new com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState("PREMIUM", 1);
    public static final com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState NONE = new com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState("NONE", 2);

    private static final /* synthetic */ com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState[] $values() {
        return new com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState[]{NONE_PREMIUM, PREMIUM, NONE};
    }

    static {
        com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WhoSearchedForMePresenter$ViewState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState valueOf(java.lang.String str) {
        return (com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState) java.lang.Enum.valueOf(com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState.class, str);
    }

    public static com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState[] values() {
        return (com.truecaller.whosearchedforme.mvp.WhoSearchedForMePresenter$ViewState[]) $VALUES.clone();
    }
}
