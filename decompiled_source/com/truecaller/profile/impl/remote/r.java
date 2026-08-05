package com.truecaller.profile.impl.remote;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/truecaller/profile/impl/remote/r;", "", "Lwj3/a;", "Lcom/truecaller/profile/impl/remote/model/ProfileResponseDto;", "getProfile", "()Lwj3/a;", "Lcom/truecaller/profile/impl/remote/model/CreateProfileRequestDto;", "profile", "Lwj3/k0;", "Lokhttp3/ResponseBody;", "a", "(Lcom/truecaller/profile/impl/remote/model/CreateProfileRequestDto;Ldf3/bar;)Ljava/lang/Object;", "Lcom/truecaller/profile/impl/remote/model/UpdateProfileRequestDto;", com.vungle.ads.internal.executor.b.b, "(Lcom/truecaller/profile/impl/remote/model/UpdateProfileRequestDto;Ldf3/bar;)Ljava/lang/Object;", "c", "(Ldf3/bar;)Ljava/lang/Object;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
interface r {
    @ak3.l("/v5/profile/create")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.CreateProfileRequestDto createProfileRequestDto, @org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<okhttp3.ResponseBody>> barVar);

    @ak3.l("/v5/profile/update")
    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto, @org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<okhttp3.ResponseBody>> barVar);

    @ak3.c("/validate/profile")
    @org.jetbrains.annotations.Nullable
    java.lang.Object c(@org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<okhttp3.ResponseBody>> barVar);

    @ak3.c("/v5/profile")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.profile.impl.remote.model.ProfileResponseDto> getProfile();
}
