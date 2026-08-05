package com.truecaller.profile.impl.remote;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/profile/impl/remote/baz;", "", "Lokhttp3/RequestBody;", "avatarFile", "", "source", "Lwj3/a;", "Lokhttp3/ResponseBody;", "a", "(Lokhttp3/RequestBody;I)Lwj3/a;", com.vungle.ads.internal.executor.b.b, "()Lwj3/a;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface baz {
    @ak3.l("/v2/avatar")
    @ak3.i
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> a(@ak3.n("file\"; filename=\"avatar.jpg\"") @org.jetbrains.annotations.NotNull okhttp3.RequestBody avatarFile, @ak3.n("source") int source);

    @ak3.baz("/v2/avatar")
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> b();
}
