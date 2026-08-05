package com.truecaller.common.network.optout;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/truecaller/common/network/optout/OptOutRestAdapter$OptOutsDto", "", "", "", "optOuts", "optIns", "", "consentRefresh", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "Ljava/util/List;", "getOptOuts", "()Ljava/util/List;", "getOptIns", "Z", "getConsentRefresh", "()Z", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class OptOutRestAdapter$OptOutsDto {
    private final boolean consentRefresh;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> optIns;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> optOuts;

    public OptOutRestAdapter$OptOutsDto(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "optOuts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "optIns");
        this.optOuts = list;
        this.optIns = list2;
        this.consentRefresh = z;
    }

    public final boolean getConsentRefresh() {
        return this.consentRefresh;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getOptIns() {
        return this.optIns;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getOptOuts() {
        return this.optOuts;
    }
}
