package com.truecaller.tagger.api.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"com/truecaller/tagger/api/network/TagRestModel$TagsResponse", "", "", "Lcom/truecaller/tagger/api/network/TagRestModel$Tag;", com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lcom/truecaller/tagger/api/network/TagRestModel$TagsResponse;", "copy", "(Ljava/util/List;)Lcom/truecaller/tagger/api/network/TagRestModel$TagsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TagRestModel$TagsResponse {

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.tagger.api.network.TagRestModel$Tag> data;

    public TagRestModel$TagsResponse(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.tagger.api.network.TagRestModel$Tag> list) {
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.tagger.api.network.TagRestModel$TagsResponse copy$default(com.truecaller.tagger.api.network.TagRestModel$TagsResponse tagRestModel$TagsResponse, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = tagRestModel$TagsResponse.data;
        }
        return tagRestModel$TagsResponse.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.tagger.api.network.TagRestModel$Tag> component1() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.tagger.api.network.TagRestModel$TagsResponse copy(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.tagger.api.network.TagRestModel$Tag> data) {
        return new com.truecaller.tagger.api.network.TagRestModel$TagsResponse(data);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.tagger.api.network.TagRestModel$TagsResponse) && kotlin.jvm.internal.Intrinsics.b(this.data, ((com.truecaller.tagger.api.network.TagRestModel$TagsResponse) other).data);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.tagger.api.network.TagRestModel$Tag> getData() {
        return this.data;
    }

    public int hashCode() {
        java.util.List<com.truecaller.tagger.api.network.TagRestModel$Tag> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("TagsResponse(data=", ")", this.data);
    }
}
