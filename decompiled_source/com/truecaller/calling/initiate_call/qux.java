package com.truecaller.calling.initiate_call;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public final java.lang.String a;
    public final java.lang.String b;
    public java.lang.String c;
    public java.lang.Integer d;
    public boolean e;
    public com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions f;
    public final java.lang.String g;
    public com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource h;

    public qux(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticsContext");
        this.a = str;
        this.b = str2;
        this.g = str2;
        this.h = com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource.UNKNOWN;
    }

    public final com.truecaller.calling.initiate_call.InitiateCallHelper$CallOptions a() {
        return new com.truecaller.calling.initiate_call.InitiateCallHelper$CallOptions(this.a, this.b, this.g, this.c, this.d, false, false, false, this.e, null, false, com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.ShowOnBoarded.a, this.f, this.h);
    }
}
