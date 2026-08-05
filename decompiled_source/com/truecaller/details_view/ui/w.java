package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class w extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.details_view.ui.i0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.truecaller.details_view.ui.i0 i0Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = i0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 0);
            case 1:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 1);
            case 2:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 2);
            case 3:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 3);
            case 4:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 4);
            case 5:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 5);
            case 6:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 6);
            case 7:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 7);
            case 8:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 8);
            case 9:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 9);
            default:
                return new com.truecaller.details_view.ui.w(this.z, barVar, 10);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.content.Context, java.lang.Object, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object h;
        java.lang.Object B;
        java.lang.Object W;
        java.lang.Object f0;
        java.lang.Object t;
        com.truecaller.details_view.ui.u uVar;
        int i = this.x;
        int i2 = 2132020429;
        int i3 = 0;
        df3.bar barVar = null;
        com.truecaller.details_view.ui.i0 i0Var = this.z;
        final int i4 = 1;
        switch (i) {
            case 0:
                ef3.bar barVar2 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.details_view.ui.i0.d2(i0Var, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar3 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.details_view.ui.i0.d2(i0Var, this) == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar4 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.p1 p1Var = i0Var.P.b;
                    com.truecaller.details_view.ui.b0 b0Var = new com.truecaller.details_view.ui.b0(i0Var, i3);
                    this.y = 1;
                    if (p1Var.a.collect(b0Var, this) == barVar4) {
                        return barVar4;
                    }
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar5 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    h = obj;
                } else {
                    od.p.E(obj);
                    ij0.e eVar = i0Var.S;
                    this.y = 1;
                    h = eVar.h(this);
                    if (h == barVar5) {
                        return barVar5;
                    }
                }
                com.truecaller.details_view.ui.b0 b0Var2 = new com.truecaller.details_view.ui.b0(i0Var, i4);
                this.y = 2;
                if (((ig3.i) h).collect(b0Var2, this) == barVar5) {
                    return barVar5;
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar6 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        od.p.E(obj);
                        B = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    p.c3 c3Var = i0Var.t;
                    com.truecaller.details_view.ui.d1 d1Var = i0Var.d0;
                    if (d1Var != null) {
                        com.truecaller.data.entity.Contact contact = d1Var.a;
                        this.y = 1;
                        B = c3Var.B(contact, this);
                        if (B == barVar6) {
                            return barVar6;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                boolean booleanValue = ((java.lang.Boolean) B).booleanValue();
                if (booleanValue) {
                    i2 = 2132020430;
                }
                com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar2 != null) {
                    ((com.truecaller.details_view.ui.x0) uVar2).e(i2);
                }
                if (booleanValue) {
                    com.truecaller.details_view.ui.u uVar3 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                    if (uVar3 != null) {
                        ((com.truecaller.details_view.ui.x0) uVar3).b.finish();
                    }
                } else {
                    qa1.a aVar = (qa1.a) i0Var.q;
                    aVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("failure", "action");
                    nc0.u1.e(new rc0.b("failure", (java.lang.String) null, "deleteContact"), aVar.a);
                }
                return kotlin.Unit.a;
            case 5:
                ef3.bar barVar7 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        od.p.E(obj);
                        W = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    p.c3 c3Var2 = i0Var.t;
                    com.truecaller.details_view.ui.d1 d1Var2 = i0Var.d0;
                    if (d1Var2 != null) {
                        com.truecaller.data.entity.Contact contact2 = d1Var2.a;
                        this.y = 1;
                        W = fg3.h0.W((kotlin.coroutines.CoroutineContext) c3Var2.b, new a32.d(contact2, c3Var2, barVar, 10), this);
                        if (W == barVar7) {
                            return barVar7;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                boolean booleanValue2 = ((java.lang.Boolean) W).booleanValue();
                if (booleanValue2) {
                    i2 = 2132020430;
                }
                com.truecaller.details_view.ui.u uVar4 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar4 != null) {
                    ((com.truecaller.details_view.ui.x0) uVar4).e(i2);
                }
                if (booleanValue2) {
                    com.truecaller.details_view.ui.u uVar5 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                    if (uVar5 != null) {
                        ((com.truecaller.details_view.ui.x0) uVar5).b.finish();
                    }
                } else {
                    qa1.a aVar2 = (qa1.a) i0Var.q;
                    aVar2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("failure", "action");
                    nc0.u1.e(new rc0.b("failure", (java.lang.String) null, "deleteIdentifiedContact"), aVar2.a);
                }
                return kotlin.Unit.a;
            case 6:
                ef3.bar barVar8 = ef3.bar.a;
                int i11 = this.y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        od.p.E(obj);
                        f0 = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    o02.baz bazVar = i0Var.M;
                    com.truecaller.details_view.ui.d1 d1Var3 = i0Var.d0;
                    if (d1Var3 != null) {
                        com.truecaller.data.entity.Contact contact3 = d1Var3.a;
                        this.y = 1;
                        f0 = bazVar.f0(contact3, this);
                        if (f0 == barVar8) {
                            return barVar8;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                boolean booleanValue3 = ((java.lang.Boolean) f0).booleanValue();
                com.truecaller.details_view.ui.u uVar6 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar6 != null) {
                    com.truecaller.details_view.ui.d1 d1Var4 = i0Var.d0;
                    if (d1Var4 != null) {
                        com.truecaller.data.entity.Contact contact4 = d1Var4.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "contact");
                        ?? r2 = ((com.truecaller.details_view.ui.x0) uVar6).b;
                        com.google.firebase.messaging.o A0 = r2.A0();
                        android.content.Context context = (android.content.Context) A0.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "contact");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r2, "activity");
                        com.truecaller.log.AssertionUtil.isTrue(!contact4.U(), new java.lang.String[0]);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        if (jj3.bar.k(contact4.s())) {
                            sb.append(contact4.s());
                            sb.append("\r\n");
                        }
                        sb.append(contact4.n());
                        sb.append("\r\n");
                        if (jj3.bar.k(contact4.e()) && !booleanValue3) {
                            sb.append(contact4.e());
                            sb.append("\r\n");
                        }
                        sb.append(((t41.o0) A0.b).a(contact4.n()));
                        sb.append("\r\n\r\n");
                        sb.append(context.getString(2132020496));
                        java.lang.String sb3 = sb.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                        t41.p.t((android.content.Context) r2, context.getString(2132020498), context.getString(2132020497), sb3, (android.net.Uri) null);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            case 7:
                ef3.bar barVar9 = ef3.bar.a;
                int i13 = this.y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.d1 d1Var5 = i0Var.d0;
                    if (d1Var5 != null) {
                        com.truecaller.data.entity.Contact contact5 = d1Var5.a;
                        java.util.List C = contact5.C();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = C.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = ((com.truecaller.data.entity.Number) it.next()).f;
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            java.lang.Object next = it2.next();
                            if (((java.lang.String) next).length() > 0) {
                                arrayList2.add(next);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return kotlin.Unit.a;
                        }
                        final int i14 = contact5.W;
                        qa1.baz bazVar2 = i0Var.q;
                        final java.lang.Long E = contact5.E();
                        this.y = 1;
                        qa1.a aVar3 = (qa1.a) bazVar2;
                        aVar3.getClass();
                        java.lang.String b0 = kotlin.collections.CollectionsKt.b0(arrayList2, ";", (java.lang.String) null, (java.lang.String) null, new kotlin.jvm.functions.Function1() { // from class: hd1.b
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                java.lang.String str2 = (java.lang.String) obj2;
                                switch (i4) {
                                    case 0:
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
                                        return str2 + "|" + i14 + "|" + E;
                                    default:
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
                                        return str2 + "|" + i14 + "|" + E;
                                }
                            }
                        }, 30);
                        qx2.d3 h2 = qx2.hg.h();
                        h2.m("diagnostic_phantom_contact");
                        h2.l(java.lang.String.valueOf(i14));
                        h2.o(b0);
                        qx2.hg h3 = h2.h();
                        nc0.a aVar4 = aVar3.a;
                        java.lang.Object W2 = fg3.h0.W(aVar4.c, new nc0.qux(aVar4, h3, (df3.bar) null, 1), this);
                        if (W2 != ef3.bar.a) {
                            W2 = kotlin.Unit.a;
                        }
                        if (W2 == barVar9) {
                            return barVar9;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            case 8:
                ef3.bar barVar10 = ef3.bar.a;
                int i15 = this.y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        od.p.E(obj);
                        t = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (i0Var.e0 != null) {
                        ((java.util.concurrent.atomic.AtomicBoolean) i0Var.k.l).set(true);
                        java.lang.Integer num = i0Var.e0;
                        if (num != null) {
                            int intValue = num.intValue();
                            yd3.qux quxVar = i0Var.l;
                            com.truecaller.details_view.ui.d1 d1Var6 = i0Var.d0;
                            if (d1Var6 != null) {
                                com.truecaller.data.entity.Contact contact6 = d1Var6.a;
                                this.y = 1;
                                t = quxVar.t(intValue, contact6, this, true);
                                if (t == barVar10) {
                                    return barVar10;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                                throw null;
                            }
                        }
                        uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar != null) {
                            ea1.bar barVar11 = ((com.truecaller.details_view.ui.x0) uVar).b.C0;
                            if (barVar11 != null) {
                                barVar11.B.setRefreshing(false);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                        }
                        return kotlin.Unit.a;
                    }
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                ((java.lang.Boolean) t).getClass();
                uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar != null) {
                }
                return kotlin.Unit.a;
            case 9:
                ef3.bar barVar12 = ef3.bar.a;
                int i16 = this.y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.details_view.ui.i0.d2(i0Var, this) == barVar12) {
                        return barVar12;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar13 = ef3.bar.a;
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    g11.p pVar = i0Var.E;
                    com.truecaller.details_view.ui.d1 d1Var7 = i0Var.d0;
                    if (d1Var7 != null) {
                        com.truecaller.data.entity.Contact contact7 = d1Var7.a;
                        this.y = 1;
                        if (f63.qux.h(pVar, contact7, this) == barVar13) {
                            return barVar13;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
