package com.truecaller.callerid.callstate;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TruecallerCallScreeningService extends gu0.j {
    public static boolean s;
    public gu0.qux d;
    public il2.qux e;
    public u03.baz f;
    public cu0.n0 g;
    public nc0.bar h;
    public rk0.bar i;
    public kotlin.coroutines.CoroutineContext j;
    public to1.e k;
    public gu0.s l;
    public cu0.y0 m;
    public cu0.y n;
    public vx.bar o;
    public zw2.baz p;
    public qc3.bar q;
    public p93.k r;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r15.r(r12, r14, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r15.a(r12, r14, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006f, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.callerid.callstate.TruecallerCallScreeningService truecallerCallScreeningService, java.lang.String str, com.truecaller.callerid.callstate.PhoneState$Source phoneState$Source, ff3.qux quxVar) {
        gu0.t tVar;
        int i;
        gu0.p pVar;
        int i2;
        if (quxVar instanceof gu0.t) {
            tVar = (gu0.t) quxVar;
            int i3 = tVar.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.B = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = tVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = tVar.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        i2 = tVar.y;
                        pVar = tVar.x;
                        od.p.E(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            cu0.y yVar = truecallerCallScreeningService.n;
                            if (yVar != null) {
                                android.os.Bundle a = pVar.a();
                                tVar.x = null;
                                tVar.y = i2;
                                tVar.B = 3;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("callerIdManager");
                                throw null;
                            }
                        } else {
                            cu0.y0 y0Var = truecallerCallScreeningService.m;
                            if (y0Var != null) {
                                android.os.Bundle a2 = pVar.a();
                                tVar.x = null;
                                tVar.y = i2;
                                tVar.B = 4;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("callerIdServiceStarter");
                                throw null;
                            }
                        }
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    gu0.qux quxVar2 = truecallerCallScreeningService.d;
                    if (quxVar2 != null) {
                        if (truecallerCallScreeningService.f != null) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneState$Source, "source");
                            gu0.p pVar2 = new gu0.p(str, currentTimeMillis, phoneState$Source);
                            tVar.B = 1;
                            gu0.i iVar = (gu0.i) quxVar2;
                            obj = fg3.h0.W(iVar.v, new gu0.h(pVar2, iVar, null), tVar);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("clock");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("callProcessor");
                        throw null;
                    }
                }
                pVar = (gu0.p) obj;
                if (pVar != null) {
                    c("Start CallerIdManager. Broadcast receiver not called. Emulate hang up");
                    vx.bar barVar2 = truecallerCallScreeningService.o;
                    if (barVar2 != null) {
                        tVar.x = pVar;
                        tVar.y = 0;
                        tVar.B = 2;
                        java.lang.Object b = barVar2.b(tVar);
                        if (b != barVar) {
                            obj = b;
                            i2 = 0;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                        }
                        return barVar;
                    }
                    kotlin.jvm.internal.Intrinsics.n("removeCallerIdServiceFeatureHelper");
                    throw null;
                }
                return kotlin.Unit.a;
            }
        }
        tVar = new gu0.t(truecallerCallScreeningService, quxVar);
        java.lang.Object obj2 = tVar.z;
        ef3.bar barVar3 = ef3.bar.a;
        i = tVar.B;
        if (i == 0) {
        }
        pVar = (gu0.p) obj2;
        if (pVar != null) {
        }
        return kotlin.Unit.a;
    }

    public static void c(java.lang.String str) {
        w91.a.a(new java.lang.Object[]{str});
    }

    public final void b(android.telecom.Call.Details details) {
        fc.bar.u(this, details, fc.bar.g(fc.bar.D(fc.bar.C(fc.bar.e()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Type inference failed for: r8v3, types: [hi3.d, qx2.ie, java.lang.Object] */
    @Override // android.telecom.CallScreeningService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScreenCall(android.telecom.Call.Details details) {
        android.net.Uri uri;
        java.lang.String str;
        java.lang.String str2;
        int i;
        android.telecom.PhoneAccountHandle accountHandle;
        java.lang.String str3;
        java.lang.Boolean bool;
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        android.content.ComponentName componentName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        c("TruecallerCallScreeningService.onScreenCall");
        s = true;
        android.os.Bundle intentExtras = details.getIntentExtras();
        if (intentExtras != null) {
            uri = (android.net.Uri) ((android.os.Parcelable) t80.g.q(intentExtras, "android.telecom.extra.INCOMING_CALL_ADDRESS", android.net.Uri.class));
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.getSchemeSpecificPart();
        } else {
            str = null;
        }
        java.lang.String decode = android.net.Uri.decode(str);
        if (decode == null || kotlin.text.StringsKt.X(decode)) {
            decode = null;
        }
        if (decode == null) {
            android.net.Uri handle = details.getHandle();
            if (handle != null) {
                decode = handle.getSchemeSpecificPart();
            } else {
                str2 = null;
                i = android.os.Build.VERSION.SDK_INT;
                if (i < 29 && df.f.a(details) != 0) {
                    to1.e eVar = this.k;
                    if (eVar != null) {
                        if (eVar.h()) {
                            gu0.s sVar = this.l;
                            if (sVar != null) {
                                com.truecaller.callerid.callstate.PhoneState$Source phoneState$Source = com.truecaller.callerid.callstate.PhoneState$Source.CALL_SCREENING_SERVICE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneState$Source, "source");
                                sVar.g.getClass();
                                gu0.n nVar = new gu0.n(str2, java.lang.System.currentTimeMillis(), phoneState$Source);
                                if (sVar.a(gu0.s.t)) {
                                    fg3.h0.J(sVar.c, sVar.a, (fg3.f0) null, new gu0.r(sVar, nVar, this, (df3.bar) null), 2);
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("phoneStateHandler");
                                throw null;
                            }
                        }
                        b(details);
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("callerIdPermissionsHelper");
                    throw null;
                }
                accountHandle = details.getAccountHandle();
                if (accountHandle == null && (componentName = accountHandle.getComponentName()) != null) {
                    str3 = componentName.getPackageName();
                } else {
                    str3 = null;
                }
                if (!"com.whatsapp".equals(str3)) {
                    b(details);
                    return;
                }
                if (i > 29) {
                    int c = ah.z.c(details);
                    if (c != 1) {
                        if (c != 2) {
                            bool = null;
                        } else {
                            bool = java.lang.Boolean.FALSE;
                        }
                    } else {
                        bool = java.lang.Boolean.TRUE;
                    }
                    bi3.y0 y0Var = qx2.ie.d;
                    hi3.a aVar = qx2.ie.e;
                    bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                    boolean[] zArr = new boolean[j0VarArr.length];
                    hi3.e.d(j0VarArr[2], bool);
                    zArr[2] = true;
                    try {
                        ?? obj = new java.lang.Object();
                        if (zArr[0]) {
                            lhVar = null;
                        } else {
                            bi3.j0 j0Var = j0VarArr[0];
                            lhVar = (qx2.lh) aVar.g(j0Var.f, aVar.j(j0Var));
                        }
                        ((qx2.ie) obj).a = lhVar;
                        if (zArr[1]) {
                            clientHeaderV2 = null;
                        } else {
                            bi3.j0 j0Var2 = j0VarArr[1];
                            clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var2.f, aVar.j(j0Var2));
                        }
                        ((qx2.ie) obj).b = clientHeaderV2;
                        if (!zArr[2]) {
                            bi3.j0 j0Var3 = j0VarArr[2];
                            bool = (java.lang.Boolean) aVar.g(j0Var3.f, aVar.j(j0Var3));
                        }
                        ((qx2.ie) obj).c = bool;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                        nc0.bar barVar = this.h;
                        if (barVar != null) {
                            j71.g.K((hi3.d) obj, barVar);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("analytics");
                            throw null;
                        }
                    } catch (bi3.bar e) {
                        throw e;
                    } catch (java.lang.Exception e2) {
                        throw new java.lang.RuntimeException(e2);
                    }
                }
                if (this.f != null) {
                    gu0.o oVar = new gu0.o(str2, java.lang.System.currentTimeMillis(), com.truecaller.callerid.callstate.PhoneState$Source.CALL_SCREENING_SERVICE, null, null, 120);
                    kotlin.coroutines.CoroutineContext coroutineContext = this.j;
                    if (coroutineContext != null) {
                        fg3.h0.J(fg3.f1.a, coroutineContext, (fg3.f0) null, new gh1.m(this, details, str2, oVar, (df3.bar) null, 1), 2);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("uiContext");
                        throw null;
                    }
                }
                kotlin.jvm.internal.Intrinsics.n("clock");
                throw null;
            }
        }
        str2 = decode;
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 29) {
        }
        accountHandle = details.getAccountHandle();
        if (accountHandle == null) {
        }
        str3 = null;
        if (!"com.whatsapp".equals(str3)) {
        }
    }
}
