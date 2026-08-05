package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class j1 implements com.google.gson.u, com.google.gson.n {
    public final com.google.gson.o a(java.lang.Object obj, java.lang.reflect.Type type, mp2.qux quxVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "src");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "typeOfSrc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "context");
        return new com.google.gson.t(uri.toString());
    }

    public final java.lang.Object b(com.google.gson.o oVar, java.lang.reflect.Type type, com.google.gson.m mVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "typeOfT");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "context");
        try {
            android.net.Uri parse = android.net.Uri.parse(oVar.i());
            kotlin.jvm.internal.Intrinsics.d(parse);
            return parse;
        } catch (java.lang.Exception e) {
            com.truecaller.ads.util.n0.a(e);
            android.net.Uri uri = android.net.Uri.EMPTY;
            kotlin.jvm.internal.Intrinsics.d(uri);
            return uri;
        }
    }
}
