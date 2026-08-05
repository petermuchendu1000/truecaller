package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ c0(int i, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        la0.qux quxVar;
        boolean z;
        float f;
        switch (this.a) {
            case 0:
                com.truecaller.search.global.h0 h0Var = (com.truecaller.search.global.h0) this.c;
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.d;
                java.lang.String str = (java.lang.String) this.e;
                com.truecaller.ui.w wVar = (com.truecaller.search.global.b1) this.f;
                java.lang.Integer num = (java.lang.Integer) obj;
                int intValue = num.intValue();
                h0Var.s0 = intValue;
                if (function1 != null) {
                    function1.invoke(num);
                }
                kotlin.Pair n = pe0.j.n(intValue, h0Var.e0, str, this.b);
                ((com.truecaller.search.global.n0) wVar).r((java.lang.String) n.a, (java.util.List) n.b);
                return kotlin.Unit.a;
            case 1:
                kotlin.jvm.internal.i0 i0Var = (kotlin.jvm.internal.i0) this.c;
                g2.s sVar = (g2.s) this.d;
                v1.h0 h0Var2 = (v1.h0) this.e;
                kotlin.jvm.internal.i0 i0Var2 = (kotlin.jvm.internal.i0) this.f;
                long a = j2.l0.a(sVar.o(this.b));
                i0Var.a = a;
                sVar.z(h0Var2, a);
                i0Var2.a = 0L;
                sVar.w = -1;
                return kotlin.Unit.a;
            case 2:
                zf3.baz<im1.baz> bazVar = (zf3.baz) this.c;
                zf3.baz bazVar2 = (zf3.baz) this.e;
                zf3.qux quxVar2 = (zf3.qux) this.f;
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) this.d;
                o1.d dVar = (o1.d) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "$this$LazyColumn");
                if (!bazVar.isEmpty()) {
                    o1.baz.e(dVar, "suggested_header", gm1.f.a, 2);
                    for (im1.baz bazVar3 : bazVar) {
                        o1.baz.e(dVar, ia0.bar.j(bazVar3.a, "suggested_"), new d3.qux(354257919, new ab0.baz(quxVar2, bazVar3, function12, 14), true), 2);
                    }
                }
                if (!bazVar2.isEmpty() && this.b) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.lang.Object obj2 : bazVar2) {
                        java.lang.String u = fu.baz.u(((im1.baz) obj2).b);
                        if (u == null) {
                            u = "?";
                        }
                        java.lang.Object obj3 = linkedHashMap.get(u);
                        if (obj3 == null) {
                            obj3 = h8.s0.u(linkedHashMap, u);
                        }
                        ((java.util.List) obj3).add(obj2);
                    }
                    for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                        java.lang.String str2 = (java.lang.String) entry.getKey();
                        java.util.List list = (java.util.List) entry.getValue();
                        o1.baz.e(dVar, k9.d.q("header_", str2), new d3.qux(-1730836277, new al2.e(str2, 7), true), 2);
                        dVar.e(list.size(), new bt0.c(13, new ge3.bar(15), list), new ae1.a(list, 14), new d3.qux(802480018, new gm1.m(list, quxVar2, function12, 1), true));
                    }
                } else if (!bazVar2.isEmpty()) {
                    dVar.e(bazVar2.size(), new bt0.c(12, new ge3.bar(16), bazVar2), new ae1.a(bazVar2, 13), new d3.qux(802480018, new gm1.m(bazVar2, quxVar2, function12, 0), true));
                }
                return kotlin.Unit.a;
            case 3:
                ui1.n nVar = (ui1.n) this.c;
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) this.f;
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) this.d;
                o1.d dVar2 = (o1.d) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "$this$LazyRow");
                if (this.b) {
                    o1.baz.e(dVar2, "BusinessVideoThumbnail", new d3.qux(414008342, new a32.b(18, function0, function2), true), 2);
                }
                o1.baz.f(dVar2, nVar.f.size(), new dk3.bar(12), new d3.qux(-2079791512, new an1.u(1, nVar, function13), true), 4);
                return kotlin.Unit.a;
            case 4:
                la0.p pVar = (la0.p) this.c;
                la0.i iVar = (la0.i) this.d;
                la0.baz bazVar4 = (la0.baz) this.e;
                java.lang.String str3 = bazVar4.b;
                c90.c cVar = (c90.b) this.f;
                android.webkit.WebView webView = (android.webkit.WebView) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = pVar.c;
                java.util.concurrent.atomic.AtomicReference atomicReference = pVar.d;
                if (atomicBoolean.get()) {
                    return kotlin.Unit.a;
                }
                if (this.b) {
                    webView.setBackgroundColor(0);
                }
                la0.qux l = df.bar.l(webView);
                if (l instanceof la0.qux) {
                    quxVar = l;
                } else {
                    quxVar = null;
                }
                if (quxVar != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "handler");
                    quxVar.d = iVar;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "contentId");
                if (!kotlin.jvm.internal.Intrinsics.b(atomicReference.get(), str3)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "contentId");
                    pVar.a.set(false);
                    pVar.b.set(false);
                    atomicReference.set(str3);
                    if (cVar != null) {
                        cVar.b();
                    }
                    if (cVar != null) {
                        c90.c cVar2 = cVar;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
                        cVar2.f = webView;
                        cVar2.g = true;
                    }
                    gf0.e.H(webView, bazVar4);
                }
                return kotlin.Unit.a;
            case 5:
                com.truecaller.messaging.conversation.qux quxVar3 = (com.truecaller.messaging.conversation.qux) this.c;
                com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) this.d;
                com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle = (com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle) this.e;
                com.truecaller.messaging.conversation.ExpandableEmojiTextView expandableEmojiTextView = (com.truecaller.android.truemoji.widget.EmojiTextView) this.f;
                com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState = (com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutState, "it");
                if (layoutState == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED) {
                    z = true;
                } else {
                    z = false;
                }
                t02.qux quxVar4 = quxVar3.b;
                quxVar4.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                quxVar4.f.Z(message, z);
                quxVar3.U(layoutStyle, layoutState, message, false, this.b);
                expandableEmojiTextView.setTag(java.lang.Long.valueOf(message.a));
                return kotlin.Unit.a;
            default:
                v2.h2 h2Var = ((c1.i0) this.c).c;
                v2.t0 t0Var = (v2.t0) this.d;
                v2.p2 p2Var = (v2.p2) this.e;
                v2.p2 p2Var2 = (v2.p2) this.f;
                q3.n0 n0Var = (q3.n0) obj;
                boolean z2 = this.b;
                float f2 = 0.8f;
                float f3 = 1.0f;
                if (!z2) {
                    f = ((java.lang.Number) p2Var.getValue()).floatValue();
                } else if (((java.lang.Boolean) h2Var.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                n0Var.o(f);
                if (!z2) {
                    f2 = ((java.lang.Number) p2Var.getValue()).floatValue();
                } else if (((java.lang.Boolean) h2Var.getValue()).booleanValue()) {
                    f2 = 1.0f;
                }
                n0Var.p(f2);
                if (!z2) {
                    f3 = ((java.lang.Number) p2Var2.getValue()).floatValue();
                } else if (!((java.lang.Boolean) h2Var.getValue()).booleanValue()) {
                    f3 = 0.0f;
                }
                n0Var.b(f3);
                n0Var.x(((q3.t0) t0Var.getValue()).a);
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ c0(g2.s sVar, kotlin.jvm.internal.i0 i0Var, kotlin.jvm.internal.i0 i0Var2, v1.h0 h0Var, boolean z) {
        this.a = 1;
        this.c = i0Var;
        this.d = sVar;
        this.b = z;
        this.e = h0Var;
        this.f = i0Var2;
    }

    public /* synthetic */ c0(la0.p pVar, boolean z, la0.i iVar, la0.baz bazVar, c90.b bVar) {
        this.a = 4;
        this.c = pVar;
        this.b = z;
        this.d = iVar;
        this.e = bazVar;
        this.f = bVar;
    }

    public /* synthetic */ c0(zf3.baz bazVar, zf3.baz bazVar2, boolean z, zf3.qux quxVar, kotlin.jvm.functions.Function1 function1) {
        this.a = 2;
        this.c = bazVar;
        this.e = bazVar2;
        this.b = z;
        this.f = quxVar;
        this.d = function1;
    }

    public /* synthetic */ c0(boolean z, c1.i0 i0Var, v2.t0 t0Var, c1.f1 f1Var, c1.f1 f1Var2) {
        this.a = 6;
        this.b = z;
        this.c = i0Var;
        this.d = t0Var;
        this.e = f1Var;
        this.f = f1Var2;
    }

    public /* synthetic */ c0(boolean z, ui1.n nVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1) {
        this.a = 3;
        this.b = z;
        this.c = nVar;
        this.e = function0;
        this.f = function2;
        this.d = function1;
    }
}
