package com.truecaller.account.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar {
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(21));

    public static wj3.k0 c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "installationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "installationId");
        wj3.k0 H = com.truecaller.account.network.b.f(com.truecaller.common.network.util.AuthRequirement.NONE, true).k(new com.truecaller.account.network.ExchangeCredentialsRequestDto(str)).H();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(H, "execute(...)");
        return H;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public static com.truecaller.account.network.AccountPhoneNumbersResponseDto d() {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.network.baz.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, (java.lang.String) null);
        obj2.c(true);
        ((j31.n) obj2).f = new j31.k(true);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        wj3.k0 H = ((com.truecaller.account.network.baz) obj.d(com.truecaller.account.network.baz.class)).j().H();
        if (!H.a.k()) {
            H = null;
        }
        if (H == null) {
            return null;
        }
        return (com.truecaller.account.network.AccountPhoneNumbersResponseDto) H.b;
    }

    public static wj3.k0 e() {
        wj3.k0 H = ((com.truecaller.account.network.baz) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT, com.truecaller.account.network.baz.class)).c().H();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(H, "execute(...)");
        return H;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public final com.truecaller.account.network.d a(com.truecaller.account.network.CheckCredentialsRequestDto checkCredentialsRequestDto, java.lang.String str) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCredentialsRequestDto, "requestDto");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCredentialsRequestDto, "requestDto");
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.network.baz.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, str);
        obj2.c(false);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        wj3.k0 H = ((com.truecaller.account.network.baz) obj.d(com.truecaller.account.network.baz.class)).l(checkCredentialsRequestDto).H();
        if (H.a.k()) {
            return (com.truecaller.account.network.d) H.b;
        }
        com.truecaller.account.network.CheckCredentialsResponseErrorDto checkCredentialsResponseErrorDto = (com.truecaller.account.network.CheckCredentialsResponseErrorDto) qe0.i1.n(H, (com.google.gson.Gson) this.a.getValue(), com.truecaller.account.network.CheckCredentialsResponseErrorDto.class);
        int i = H.a.d;
        java.lang.Long l = null;
        if (checkCredentialsResponseErrorDto != null) {
            num = java.lang.Integer.valueOf(checkCredentialsResponseErrorDto.getStatus());
        } else {
            num = null;
        }
        if (checkCredentialsResponseErrorDto != null) {
            l = checkCredentialsResponseErrorDto.getTtl();
        }
        return new com.truecaller.account.network.e(i, l, num);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public final com.truecaller.account.network.f b(com.truecaller.account.network.DeleteSecondaryNumberRequestDto deleteSecondaryNumberRequestDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteSecondaryNumberRequestDto, "requestDto");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteSecondaryNumberRequestDto, "requestDto");
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.network.baz.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, (java.lang.String) null);
        obj2.c(true);
        ((j31.n) obj2).f = new j31.k(true);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        wj3.k0 H = ((com.truecaller.account.network.baz) obj.d(com.truecaller.account.network.baz.class)).a(deleteSecondaryNumberRequestDto).H();
        if (H.a.k()) {
            return com.truecaller.account.network.h.a;
        }
        return (com.truecaller.account.network.f) qe0.i1.n(H, (com.google.gson.Gson) this.a.getValue(), com.truecaller.account.network.DeleteSecondaryNumberResponseError.class);
    }
}
