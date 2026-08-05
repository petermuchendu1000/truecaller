package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.account.domain.auth.r b;

    public /* synthetic */ m(com.truecaller.account.domain.auth.r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                wj3.k0 H = this.b.a(false).a().H();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(H, "execute(...)");
                return H;
            case 1:
                wj3.k0 H2 = this.b.a(true).b().H();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(H2, "execute(...)");
                return H2;
            default:
                return new okhttp3.Cache(new java.io.File(this.b.a.getCacheDir(), "at_config_cache"), 1048576L);
        }
    }
}
