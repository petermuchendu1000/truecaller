package com.truecaller.account.domain.attestation.data;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz {
    public final kotlin.Lazy a;
    public final java.lang.Object b;

    public baz(tx.v vVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "deviceInfoUtil");
        this.b = vVar;
        this.a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(20));
    }

    public static wj3.k0 a(com.truecaller.account.domain.attestation.AttestationEngine attestationEngine) {
        wj3.a<com.truecaller.account.domain.attestation.data.AttestationNonceDto> a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationEngine, "engine");
        int i = com.truecaller.account.domain.attestation.data.bar.a[attestationEngine.ordinal()];
        if (i != 1) {
            if (i == 2) {
                a = ((com.truecaller.account.domain.attestation.data.b) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.DEVICE_SAFETY, com.truecaller.account.domain.attestation.data.b.class)).d();
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            a = ((com.truecaller.account.domain.attestation.data.b) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.DEVICE_SAFETY, com.truecaller.account.domain.attestation.data.b.class)).a();
        }
        wj3.k0 H = a.H();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(H, "execute(...)");
        return H;
    }

    public com.truecaller.account.domain.attestation.data.qux b(java.lang.String str, com.truecaller.account.domain.attestation.AttestationEngine attestationEngine) {
        wj3.a<com.truecaller.account.domain.attestation.data.AttestationSuccessResponseDto> c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "attestation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationEngine, "engine");
        int i = com.truecaller.account.domain.attestation.data.bar.a[attestationEngine.ordinal()];
        if (i != 1) {
            if (i == 2) {
                java.lang.String k = ((u03.b) this.b).k();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "attestation");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "build");
                c = ((com.truecaller.account.domain.attestation.data.b) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.DEVICE_SAFETY, com.truecaller.account.domain.attestation.data.b.class)).e(new com.truecaller.account.domain.attestation.data.AttestationRequestDto(str, k));
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "attestation");
            c = ((com.truecaller.account.domain.attestation.data.b) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.DEVICE_SAFETY, com.truecaller.account.domain.attestation.data.b.class)).c(new com.truecaller.account.domain.attestation.data.AttestationRequestDto(str, null, 2, null));
        }
        wj3.k0 H = c.H();
        okhttp3.Response response = H.a;
        int i2 = response.d;
        if (response.k()) {
            return new com.truecaller.account.domain.attestation.data.qux(i2, (com.truecaller.account.domain.attestation.data.a) H.b);
        }
        return new com.truecaller.account.domain.attestation.data.qux(i2, (com.truecaller.account.domain.attestation.data.a) qe0.i1.n(H, (com.google.gson.Gson) this.a.getValue(), com.truecaller.account.domain.attestation.data.AttestationErrorResponseDto.class));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j31.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [j31.n, java.lang.Object] */
    public com.truecaller.account.domain.attestation.data.d c(java.lang.String str, com.truecaller.account.domain.attestation.AttestationEngine attestationEngine, java.lang.String str2, long j) {
        wj3.a<okhttp3.ResponseBody> b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "attestation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationEngine, "engine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "requestId");
        int i = com.truecaller.account.domain.attestation.data.c.a[attestationEngine.ordinal()];
        if (i != 1) {
            if (i == 2) {
                java.lang.String k = ((u03.b) ((javax.inject.Provider) this.b).get()).k();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "attestation");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "requestId");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "build");
                com.truecaller.common.network.util.KnownEndpoints knownEndpoints = com.truecaller.common.network.util.KnownEndpoints.DEVICE_SAFETY;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(knownEndpoints, "endpoint");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.account.domain.attestation.data.b.class, "api");
                ?? obj = new java.lang.Object();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "it");
                ?? obj2 = new java.lang.Object();
                obj2.b(com.truecaller.common.network.util.AuthRequirement.NONE, (java.lang.String) null);
                obj2.c(false);
                okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
                ((p31.bar) obj).g = a;
                kotlin.Unit unit = kotlin.Unit.a;
                obj.a(knownEndpoints);
                obj.g(com.truecaller.account.domain.attestation.data.b.class);
                b = ((com.truecaller.account.domain.attestation.data.b) obj.d(com.truecaller.account.domain.attestation.data.b.class)).f(new com.truecaller.account.domain.attestation.data.VerificationAttestationRequestDto(str, str2, j, k));
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "attestation");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "requestId");
            com.truecaller.common.network.util.KnownEndpoints knownEndpoints2 = com.truecaller.common.network.util.KnownEndpoints.DEVICE_SAFETY;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(knownEndpoints2, "endpoint");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.account.domain.attestation.data.b.class, "api");
            ?? obj3 = new java.lang.Object();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj3, "it");
            ?? obj4 = new java.lang.Object();
            obj4.b(com.truecaller.common.network.util.AuthRequirement.NONE, (java.lang.String) null);
            obj4.c(false);
            okhttp3.OkHttpClient a2 = p31.baz.a((j31.n) obj4);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "client");
            ((p31.bar) obj3).g = a2;
            kotlin.Unit unit2 = kotlin.Unit.a;
            obj3.a(knownEndpoints2);
            obj3.g(com.truecaller.account.domain.attestation.data.b.class);
            b = ((com.truecaller.account.domain.attestation.data.b) obj3.d(com.truecaller.account.domain.attestation.data.b.class)).b(new com.truecaller.account.domain.attestation.data.VerificationAttestationRequestDto(str, str2, j, null, 8, null));
        }
        wj3.k0 H = b.H();
        okhttp3.Response response = H.a;
        int i2 = response.d;
        if (response.k()) {
            return new com.truecaller.account.domain.attestation.data.d(i2, com.truecaller.account.domain.attestation.data.f.a);
        }
        return new com.truecaller.account.domain.attestation.data.d(i2, (com.truecaller.account.domain.attestation.data.e) qe0.i1.n(H, (com.google.gson.Gson) this.a.getValue(), com.truecaller.account.domain.attestation.data.VerificationAttestationErrorResponseDto.class));
    }

    public baz(u03.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        this.b = bVar;
        this.a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(19));
    }
}
