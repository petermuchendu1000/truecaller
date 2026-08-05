package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a1 {
    public static final /* synthetic */ kotlin.reflect.KProperty[] j = {kotlin.jvm.internal.k0.a.property0(new kotlin.jvm.internal.y(com.truecaller.search.global.a1.class, "weakListener"))};
    public final ij0.e a;
    public final p81.bar b;
    public final kotlin.coroutines.CoroutineContext c;
    public final kotlin.coroutines.CoroutineContext d;
    public final jp2.c e;
    public final su0.u f;
    public final y12.o0 g;
    public final ev0.baz h;
    public fg3.c2 i;

    public a1(ij0.e eVar, p81.bar barVar, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, jp2.c cVar, su0.u uVar, y12.o0 o0Var, ev0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "filterMatchCoordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "aggregatedContactDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "asyncCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "extraInfoReaderProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uVar, "callLogManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o0Var, "readMessageStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "contactSettingsRepository");
        this.a = eVar;
        this.b = barVar;
        this.c = coroutineContext;
        this.d = coroutineContext2;
        this.e = cVar;
        this.f = uVar;
        this.g = o0Var;
        this.h = bazVar;
        this.i = fg3.h0.c();
    }
}
