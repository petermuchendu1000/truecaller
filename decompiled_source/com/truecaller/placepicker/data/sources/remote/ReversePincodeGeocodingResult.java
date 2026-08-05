package com.truecaller.placepicker.data.sources.remote;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/placepicker/data/sources/remote/ReversePincodeGeocodingResult;", "", "status", "", "results", "", "Lcom/truecaller/placepicker/data/sources/remote/ReversePincodeGeocodedPlace;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "placepicker_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ReversePincodeGeocodingResult {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace> results;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String status;

    public ReversePincodeGeocodingResult(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "results");
        this.status = str;
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult copy$default(com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult reversePincodeGeocodingResult, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reversePincodeGeocodingResult.status;
        }
        if ((i & 2) != 0) {
            list = reversePincodeGeocodingResult.results;
        }
        return reversePincodeGeocodingResult.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace> component2() {
        return this.results;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult copy(@org.jetbrains.annotations.NotNull java.lang.String status, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace> results) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "results");
        return new com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult(status, results);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult)) {
            return false;
        }
        com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult reversePincodeGeocodingResult = (com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodingResult) other;
        return kotlin.jvm.internal.Intrinsics.b(this.status, reversePincodeGeocodingResult.status) && kotlin.jvm.internal.Intrinsics.b(this.results, reversePincodeGeocodingResult.results);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace> getResults() {
        return this.results;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.results.hashCode() + (this.status.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("ReversePincodeGeocodingResult(status=", this.status, ", results=", this.results, ")");
    }
}
