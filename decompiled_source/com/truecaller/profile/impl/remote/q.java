package com.truecaller.profile.impl.remote;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/profile/impl/remote/q;", "", "Lcom/truecaller/profile/impl/remote/model/CreateProfileRequestDto;", "profile", "Lwj3/k0;", "Lokhttp3/ResponseBody;", "a", "(Lcom/truecaller/profile/impl/remote/model/CreateProfileRequestDto;Ldf3/bar;)Ljava/lang/Object;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface q {
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.CreateProfileRequestDto createProfileRequestDto, @org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<okhttp3.ResponseBody>> barVar);

    java.lang.Object b(com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto, com.truecaller.profile.impl.remote.d dVar);

    java.lang.Object c(com.truecaller.profile.impl.remote.f fVar);

    wj3.a getProfile();
}
