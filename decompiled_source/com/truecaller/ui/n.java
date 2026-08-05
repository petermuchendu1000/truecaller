package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n extends ff3.g implements kotlin.jvm.functions.Function2 {
    public java.lang.Object A;
    public java.lang.Object B;
    public java.lang.Object C;
    public java.lang.CharSequence D;
    public java.lang.CharSequence E;
    public final /* synthetic */ java.lang.Object F;
    public final /* synthetic */ java.lang.Object G;
    public final /* synthetic */ int x = 1;
    public int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p02.q qVar, com.truecaller.messaging.data.types.Message message, boolean z, df3.bar barVar) {
        super(2, barVar);
        this.F = qVar;
        this.G = message;
        this.z = z;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.ui.n(this.z, (ki.qux) this.C, (c80.p) this.B, this.D, this.E, (java.lang.CharSequence) this.F, (java.lang.CharSequence) this.G, barVar);
            default:
                return new com.truecaller.ui.n((p02.q) this.F, (com.truecaller.messaging.data.types.Message) this.G, this.z, barVar);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10, types: [hi3.d, qx2.ze, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object j;
        kotlin.jvm.functions.Function1 function1;
        java.lang.Object W;
        d42.d dVar;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj2;
        m03.s sVar;
        java.lang.Object W2;
        java.lang.String str5;
        java.lang.Object W3;
        java.lang.String str6;
        boolean z2;
        java.lang.CharSequence charSequence;
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        int i = this.x;
        boolean z3 = this.z;
        java.lang.Object obj3 = this.F;
        java.lang.Object obj4 = this.G;
        switch (i) {
            case 0:
                ki.qux quxVar = (ki.qux) this.C;
                ef3.bar barVar = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            kotlin.jvm.functions.Function1 function12 = (c80.p) this.A;
                            od.p.E(obj);
                            function1 = function12;
                            W = obj;
                            function1.invoke(W);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    j = obj;
                } else {
                    od.p.E(obj);
                    if (z3) {
                        tf2.s0 s0Var = (tf2.s0) quxVar.c;
                        this.y = 1;
                        j = s0Var.j(this);
                        if (j == barVar) {
                            return barVar;
                        }
                    } else {
                        str = null;
                        function1 = (c80.p) this.B;
                        com.moloco.sdk.internal.services.bidtoken.t tVar = (com.moloco.sdk.internal.services.bidtoken.t) quxVar.b;
                        java.lang.String i3 = ((tf2.s0) quxVar.c).i();
                        this.A = function1;
                        this.y = 2;
                        W = fg3.h0.W((kotlin.coroutines.CoroutineContext) tVar.c, new com.truecaller.feedback.network.baz(this.D, this.E, (java.lang.CharSequence) obj3, (java.lang.CharSequence) obj4, i3, str, tVar, (df3.bar) null), this);
                        if (W == barVar) {
                            return barVar;
                        }
                        function1.invoke(W);
                        return kotlin.Unit.a;
                    }
                }
                str = (java.lang.String) j;
                function1 = (c80.p) this.B;
                com.moloco.sdk.internal.services.bidtoken.t tVar2 = (com.moloco.sdk.internal.services.bidtoken.t) quxVar.b;
                java.lang.String i32 = ((tf2.s0) quxVar.c).i();
                this.A = function1;
                this.y = 2;
                W = fg3.h0.W((kotlin.coroutines.CoroutineContext) tVar2.c, new com.truecaller.feedback.network.baz(this.D, this.E, (java.lang.CharSequence) obj3, (java.lang.CharSequence) obj4, i32, str, tVar2, (df3.bar) null), this);
                if (W == barVar) {
                }
                function1.invoke(W);
                return kotlin.Unit.a;
            default:
                android.os.Parcelable parcelable = (com.truecaller.messaging.data.types.Message) obj4;
                p02.q qVar = (p02.q) obj3;
                kotlin.coroutines.CoroutineContext coroutineContext = qVar.f;
                m03.s sVar2 = qVar.k;
                xz1.r rVar = qVar.D;
                p02.r4 r4Var = qVar.B;
                ef3.bar barVar2 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            od.p.E(obj);
                            W3 = obj;
                            sVar = sVar2;
                            str6 = (java.lang.String) W3;
                            if (str6 != null) {
                                return kotlin.Unit.a;
                            }
                            qVar.j.e.put(new java.lang.Long(((com.truecaller.messaging.data.types.Message) parcelable).a), str6);
                            p02.s0 s0Var2 = (p02.r) qVar.a;
                            if (s0Var2 != null) {
                                s0Var2.H6();
                            }
                            p02.v vVar = qVar.s;
                            java.lang.CharSequence a = sVar.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getLanguageIso(...)");
                            int i5 = qVar.g;
                            if (qVar.a0.d() && parcelable.m()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            vVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelable, "message");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "deviceLanguage");
                            bi3.y0 y0Var = qx2.ze.g;
                            hi3.a aVar = qx2.ze.h;
                            bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                            boolean[] zArr = new boolean[j0VarArr.length];
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        charSequence = "personal";
                                    } else {
                                        charSequence = "promotional";
                                    }
                                } else {
                                    charSequence = "spam";
                                }
                            } else {
                                charSequence = "other";
                            }
                            bi3.j0 j0Var = j0VarArr[2];
                            zArr[2] = true;
                            hi3.e.d(j0VarArr[3], a);
                            zArr[3] = true;
                            java.lang.CharSequence i6 = nc0.u1.i(parcelable, z2);
                            bi3.j0 j0Var2 = j0VarArr[4];
                            zArr[4] = true;
                            java.lang.CharSequence charSequence2 = ((com.truecaller.messaging.data.types.Message) parcelable).A;
                            if (charSequence2 == null) {
                                charSequence2 = "";
                            }
                            bi3.j0 j0Var3 = j0VarArr[5];
                            zArr[5] = true;
                            try {
                                ?? obj5 = new java.lang.Object();
                                if (zArr[0]) {
                                    lhVar = null;
                                } else {
                                    bi3.j0 j0Var4 = j0VarArr[0];
                                    lhVar = (qx2.lh) aVar.g(j0Var4.f, aVar.j(j0Var4));
                                }
                                obj5.a = lhVar;
                                if (zArr[1]) {
                                    clientHeaderV2 = null;
                                } else {
                                    bi3.j0 j0Var5 = j0VarArr[1];
                                    clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var5.f, aVar.j(j0Var5));
                                }
                                obj5.b = clientHeaderV2;
                                if (!zArr[2]) {
                                    bi3.j0 j0Var6 = j0VarArr[2];
                                    charSequence = (java.lang.CharSequence) aVar.g(j0Var6.f, aVar.j(j0Var6));
                                }
                                obj5.c = charSequence;
                                if (!zArr[3]) {
                                    bi3.j0 j0Var7 = j0VarArr[3];
                                    a = (java.lang.CharSequence) aVar.g(j0Var7.f, aVar.j(j0Var7));
                                }
                                obj5.d = a;
                                if (!zArr[4]) {
                                    bi3.j0 j0Var8 = j0VarArr[4];
                                    i6 = (java.lang.CharSequence) aVar.g(j0Var8.f, aVar.j(j0Var8));
                                }
                                obj5.e = i6;
                                if (!zArr[5]) {
                                    bi3.j0 j0Var9 = j0VarArr[5];
                                    charSequence2 = (java.lang.CharSequence) aVar.g(j0Var9.f, aVar.j(j0Var9));
                                }
                                obj5.f = charSequence2;
                                vVar.a.f((hi3.d) obj5);
                                return kotlin.Unit.a;
                            } catch (bi3.bar e) {
                                throw e;
                            } catch (java.lang.Exception e2) {
                                throw new java.lang.RuntimeException(e2);
                            }
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) this.E;
                    str3 = (java.lang.String) this.D;
                    str2 = (java.lang.String) this.C;
                    java.lang.String str7 = (java.lang.String) this.B;
                    dVar = (d42.d) this.A;
                    od.p.E(obj);
                    z = z3;
                    str5 = str7;
                    obj2 = obj4;
                    sVar = sVar2;
                    W2 = obj;
                } else {
                    od.p.E(obj);
                    if (r4Var.f.a(com.truecaller.dynamicfeaturesupport.DynamicFeature.MESSAGING_TRANSLATE)) {
                        dVar = (d42.d) qVar.C.get();
                        if (dVar == null) {
                            return kotlin.Unit.a;
                        }
                        boolean a2 = r4Var.a(parcelable);
                        str2 = ((com.truecaller.messaging.data.types.Message) parcelable).A;
                        z = z3;
                        if (a2) {
                            qVar.k2("checkLangSupport", parcelable, (java.lang.String) null);
                            java.lang.String a3 = parcelable.a();
                            kotlin.jvm.internal.Intrinsics.d(a3);
                            if (a3.length() <= 0) {
                                a3 = null;
                            }
                            if (a3 == null) {
                                return kotlin.Unit.a;
                            }
                            if (str2 == null) {
                                return kotlin.Unit.a;
                            }
                            if (!str2.equals("en") || !r4Var.c()) {
                                str3 = "en";
                            } else {
                                java.lang.String a4 = sVar2.a();
                                kotlin.jvm.internal.Intrinsics.d(a4);
                                str3 = a4;
                            }
                            if (str2.equals("en")) {
                                str4 = str3;
                            } else {
                                str4 = str2;
                            }
                            obj2 = obj4;
                            sVar = sVar2;
                            ob2.n nVar = new ob2.n(dVar, str4, (df3.bar) null, 19);
                            this.A = dVar;
                            this.B = a3;
                            this.C = str2;
                            this.D = str3;
                            this.E = str4;
                            this.y = 1;
                            W2 = fg3.h0.W(coroutineContext, nVar, this);
                            if (W2 != barVar2) {
                                str5 = a3;
                            } else {
                                return barVar2;
                            }
                        } else {
                            p02.s0 s0Var3 = (p02.r) qVar.a;
                            if (s0Var3 != null) {
                                s0Var3.l(2132017873);
                            }
                            qVar.k2("checkLangSupport", parcelable, java.lang.String.valueOf(str2));
                            return kotlin.Unit.a;
                        }
                    } else {
                        p02.s0 s0Var4 = (p02.r) qVar.a;
                        if (s0Var4 != null) {
                            androidx.fragment.app.g1 childFragmentManager = s0Var4.getChildFragmentManager();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager, "fragmentManager");
                            p02.v2 v2Var = new p02.v2();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putParcelable("message", parcelable);
                            v2Var.setArguments(bundle);
                            v2Var.show(childFragmentManager, (java.lang.String) null);
                        }
                        return kotlin.Unit.a;
                    }
                }
                d42.d dVar2 = dVar;
                java.lang.String str8 = str3;
                java.lang.String str9 = str2;
                if (((java.lang.Boolean) W2).booleanValue()) {
                    gh1.m mVar = new gh1.m(dVar2, str9, str8, str5, (com.truecaller.messaging.data.types.Message) obj2, (df3.bar) null, 18);
                    this.A = null;
                    this.B = null;
                    this.C = null;
                    this.D = null;
                    this.E = null;
                    this.y = 2;
                    W3 = fg3.h0.W(coroutineContext, mVar, this);
                    if (W3 == barVar2) {
                        return barVar2;
                    }
                    str6 = (java.lang.String) W3;
                    if (str6 != null) {
                    }
                } else {
                    if (z) {
                        if (rVar.z("translationPreferencesShown", false) && !kotlin.jvm.internal.Intrinsics.b(rVar.r0(), "ask")) {
                            qVar.h2(parcelable, str4, kotlin.jvm.internal.Intrinsics.b(rVar.r0(), "wifiOrMobile"));
                        } else {
                            p02.s0 s0Var5 = (p02.r) qVar.a;
                            if (s0Var5 != null) {
                                p02.s0 s0Var6 = s0Var5;
                                if (cp1.bar.v(s0Var6)) {
                                    hg.bar barVar3 = p02.x2.l;
                                    androidx.fragment.app.g1 childFragmentManager2 = s0Var6.getChildFragmentManager();
                                    barVar3.getClass();
                                    hg.bar.j(childFragmentManager2, str4, parcelable);
                                }
                            }
                        }
                    } else {
                        p02.s0 s0Var7 = (p02.r) qVar.a;
                        if (s0Var7 != null) {
                            androidx.fragment.app.g1 childFragmentManager3 = s0Var7.getChildFragmentManager();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager3, "fragmentManager");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "languageCode");
                            p02.a3 a3Var = new p02.a3();
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString("languageCode", str4);
                            bundle2.putParcelable("message", parcelable);
                            a3Var.setArguments(bundle2);
                            a3Var.show(childFragmentManager3, (java.lang.String) null);
                        }
                    }
                    return kotlin.Unit.a;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z, ki.qux quxVar, c80.p pVar, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, df3.bar barVar) {
        super(2, barVar);
        this.z = z;
        this.C = quxVar;
        this.B = pVar;
        this.D = charSequence;
        this.E = charSequence2;
        this.F = charSequence3;
        this.G = charSequence4;
    }
}
