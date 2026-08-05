package com.truecaller.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/truecaller/ads/AdsGamError;", "", "code", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "QA_OVERRIDE", "BUILDER_EXCEPTION", "ERROR_NO_INTERNET", "SDK_EXCEPTIONS", "ERROR_AD_CANCELLED", "ERROR_AD_TIMEOUT", "ERROR", "build", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsGamError {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.AdsGamError[] $VALUES;
    private int code;

    @org.jetbrains.annotations.NotNull
    private java.lang.String message;
    public static final com.truecaller.ads.AdsGamError QA_OVERRIDE = new com.truecaller.ads.AdsGamError("QA_OVERRIDE", 0, -1, "QA override");
    public static final com.truecaller.ads.AdsGamError BUILDER_EXCEPTION = new com.truecaller.ads.AdsGamError("BUILDER_EXCEPTION", 1, -3, "Error creating AdLoader");
    public static final com.truecaller.ads.AdsGamError ERROR_NO_INTERNET = new com.truecaller.ads.AdsGamError("ERROR_NO_INTERNET", 2, -4, "No internet connection");
    public static final com.truecaller.ads.AdsGamError SDK_EXCEPTIONS = new com.truecaller.ads.AdsGamError("SDK_EXCEPTIONS", 3, -5, "Error while requesting an ad");
    public static final com.truecaller.ads.AdsGamError ERROR_AD_CANCELLED = new com.truecaller.ads.AdsGamError("ERROR_AD_CANCELLED", 4, -6, "Ad is cancelled");
    public static final com.truecaller.ads.AdsGamError ERROR_AD_TIMEOUT = new com.truecaller.ads.AdsGamError("ERROR_AD_TIMEOUT", 5, -10, "Ad timeout");
    public static final com.truecaller.ads.AdsGamError ERROR = new com.truecaller.ads.AdsGamError("ERROR", 6, -99, "");

    private static final /* synthetic */ com.truecaller.ads.AdsGamError[] $values() {
        return new com.truecaller.ads.AdsGamError[]{QA_OVERRIDE, BUILDER_EXCEPTION, ERROR_NO_INTERNET, SDK_EXCEPTIONS, ERROR_AD_CANCELLED, ERROR_AD_TIMEOUT, ERROR};
    }

    static {
        com.truecaller.ads.AdsGamError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdsGamError(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.code = i2;
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.AdsGamError valueOf(java.lang.String str) {
        return (com.truecaller.ads.AdsGamError) java.lang.Enum.valueOf(com.truecaller.ads.AdsGamError.class, str);
    }

    public static com.truecaller.ads.AdsGamError[] values() {
        return (com.truecaller.ads.AdsGamError[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.AdsGamError build(int code, @org.jetbrains.annotations.NotNull java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        this.code = code;
        this.message = message;
        return this;
    }

    public final int getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }
}
