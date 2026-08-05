package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n implements wj3.d {
    public final /* synthetic */ com.truecaller.sdk.push.PushAppData a;

    public n(com.truecaller.sdk.push.PushAppData pushAppData) {
        this.a = pushAppData;
    }

    public final void g(wj3.a aVar, wj3.k0 k0Var) {
        okhttp3.Response response = k0Var.a;
        if (!response.k()) {
            com.truecaller.sdk.push.PushAppData pushAppData = this.a;
            java.lang.String str = pushAppData.b;
            java.lang.String str2 = pushAppData.a;
            java.lang.String str3 = response.c;
            java.lang.StringBuilder E = ro0.f.E("TrueSDK - WebPartner: ", str, ", requestId: ", str2, ", error: ");
            E.append(str3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(E.toString(), "msg");
        }
    }

    public final void h(wj3.a aVar, java.lang.Throwable th) {
        o82.a.C(th);
    }
}
