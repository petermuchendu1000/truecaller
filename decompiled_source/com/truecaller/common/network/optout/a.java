package com.truecaller.common.network.optout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/common/network/optout/a;", "", "", "type", "Lwj3/a;", "Ljava/lang/Void;", "a", "(Ljava/lang/String;)Lwj3/a;", com.freshchat.consumer.sdk.util.c.c.a, "Lcom/truecaller/common/network/optout/OptOutRestAdapter$OptOutsDto;", "b", "()Lwj3/a;", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
interface a {
    @ak3.l("/v1/optout/{type}")
    @org.jetbrains.annotations.NotNull
    wj3.a<java.lang.Void> a(@ak3.p("type") @org.jetbrains.annotations.NotNull java.lang.String type);

    @ak3.c("/v1/optouts")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.common.network.optout.OptOutRestAdapter$OptOutsDto> b();

    @ak3.baz("/v1/optout/{type}")
    @org.jetbrains.annotations.NotNull
    wj3.a<java.lang.Void> c(@ak3.p("type") @org.jetbrains.annotations.NotNull java.lang.String type);
}
