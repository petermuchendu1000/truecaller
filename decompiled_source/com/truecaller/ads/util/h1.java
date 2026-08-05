package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class h1 {
    public final kotlin.Lazy a;

    public h1(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "block");
        this.a = kotlin.LazyKt.lazy(new al2.v(17, function0));
    }

    public void a() {
        this.a.getValue();
    }

    public h1() {
        this.a = kotlin.LazyKt.lazy(new jq0.qux(20));
    }
}
