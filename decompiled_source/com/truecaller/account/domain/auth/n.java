package com.truecaller.account.domain.auth;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t0\u0002H'¢\u0006\u0004\b\n\u0010\u0005¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/account/domain/auth/n;", "", "Lwj3/a;", "Lcom/truecaller/account/network/m;", "b", "()Lwj3/a;", "", "", "Lcom/truecaller/account/network/n;", "Lcom/truecaller/account/network/TokenResponse;", "a", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
interface n {
    @ak3.l("/v1/access-token/generate")
    @org.jetbrains.annotations.NotNull
    wj3.a<java.util.Map<java.lang.String, com.truecaller.account.network.n>> a();

    @ak3.c("/v1/access-token/config")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.m> b();
}
