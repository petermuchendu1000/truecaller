package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.wizard.verification.s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(com.truecaller.wizard.verification.s1 s1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = s1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 0);
            case 1:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 1);
            case 2:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 2);
            case 3:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 3);
            case 4:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 4);
            case 5:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 5);
            default:
                return new com.truecaller.wizard.verification.b1(this.z, barVar, 6);
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
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x0395. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object W;
        com.truecaller.accountonboarding.v1.Service.SendOnboardingOtpResponse.ResponseCase responseCase;
        int i;
        int i2;
        com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase e;
        java.lang.Object y;
        java.lang.Object obj2;
        int i3 = this.x;
        int i4 = 29;
        boolean z = false;
        int i5 = 12;
        int i6 = 2;
        df3.bar barVar = null;
        com.truecaller.wizard.verification.s1 s1Var = this.z;
        switch (i3) {
            case 0:
                ef3.bar barVar2 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.wizard.verification.s1.e2(s1Var, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar3 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.wizard.verification.s1.e2(s1Var, this) == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar4 = ef3.bar.a;
                int i9 = this.y;
                com.truecaller.wizard.verification.s1 s1Var2 = this.z;
                if (i9 != 0) {
                    if (i9 == 1) {
                        od.p.E(obj);
                        W = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    s1Var2.E2(new com.truecaller.wizard.verification.v1(new com.truecaller.wizard.verification.e(false), null, null));
                    s1Var2.h2();
                    ah.n nVar = s1Var2.B;
                    java.lang.Object obj3 = s1Var2.e.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    java.lang.String str = (java.lang.String) obj3;
                    java.lang.Object obj4 = s1Var2.f.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    java.lang.Integer num = (java.lang.Integer) s1Var2.g.get();
                    int i10 = s1Var2.M + 1;
                    this.y = 1;
                    W = fg3.h0.W((kotlin.coroutines.CoroutineContext) nVar.b, new bu1.e(str, (java.lang.String) obj4, num, i10, nVar, (df3.bar) null), this);
                    if (W == barVar4) {
                        return barVar4;
                    }
                }
                o93.j jVar = (o93.j) W;
                if (jVar instanceof o93.h) {
                    yy.x1 x1Var = ((o93.h) jVar).a;
                    if (x1Var != null) {
                        responseCase = x1Var.h();
                    } else {
                        responseCase = null;
                    }
                    int i11 = -1;
                    if (responseCase == null) {
                        i = -1;
                    } else {
                        i = com.truecaller.wizard.verification.y0.a[responseCase.ordinal()];
                    }
                    if (i != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        s1Var2.r2(com.truecaller.wizard.verification.s0.q, "SendOnboardingOTPGrpc");
                                    } else {
                                        s1Var2.k2(x1Var.e().e().getValue(), java.lang.Integer.valueOf(x1Var.e().d()), "SendOnboardingOTPGrpc");
                                    }
                                } else {
                                    yy.u0 f = x1Var.f();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "getExpectingOtp(...)");
                                    u03.baz bazVar = s1Var2.m;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "<this>");
                                    com.truecaller.accountonboarding.v1.Models.ExpectingOtp.MethodCase e2 = f.e();
                                    if (e2 == null) {
                                        i2 = -1;
                                    } else {
                                        i2 = com.truecaller.wizard.verification.bar.a[e2.ordinal()];
                                    }
                                    switch (i2) {
                                        case -1:
                                        case 6:
                                            if (!z) {
                                                int i12 = s1Var2.M + 1;
                                                s1Var2.M = i12;
                                                s1Var2.i.c(i12);
                                            }
                                            s1Var2.O = f.g();
                                            s1Var2.S = f.b();
                                            s1Var2.R = java.lang.Long.valueOf(f.f());
                                            e = f.e();
                                            if (e != null) {
                                                i11 = com.truecaller.wizard.verification.y0.d[e.ordinal()];
                                            }
                                            if (i11 == 1) {
                                                if (i11 != 2) {
                                                    if (i11 != 3) {
                                                        if (i11 != 4) {
                                                            if (i11 == 5) {
                                                                s1Var2.D2("reverse_whatsapp");
                                                                s1Var2.X = java.util.concurrent.TimeUnit.SECONDS.toMillis(f.i().f());
                                                                ((u03.qux) bazVar).getClass();
                                                                s1Var2.P = java.lang.System.currentTimeMillis() + s1Var2.X;
                                                                s1Var2.T = f.i().b();
                                                                s1Var2.W = f.i().getMessage();
                                                                s1Var2.U = kotlin.collections.x.c(f.i().e());
                                                            }
                                                        } else {
                                                            s1Var2.D2("reverse_otp");
                                                            s1Var2.X = java.util.concurrent.TimeUnit.SECONDS.toMillis(f.h().f());
                                                            ((u03.qux) bazVar).getClass();
                                                            s1Var2.P = java.lang.System.currentTimeMillis() + s1Var2.X;
                                                            s1Var2.T = f.h().b();
                                                            s1Var2.W = f.h().getMessage();
                                                            s1Var2.U = f.h().e();
                                                        }
                                                    } else {
                                                        s1Var2.D2("call");
                                                        ((u03.qux) bazVar).getClass();
                                                        s1Var2.P = java.util.concurrent.TimeUnit.SECONDS.toMillis(f.d().e()) + java.lang.System.currentTimeMillis();
                                                        s1Var2.Q = f.d().c();
                                                    }
                                                } else {
                                                    s1Var2.D2("whatsapp");
                                                    ((u03.qux) bazVar).getClass();
                                                    s1Var2.P = java.util.concurrent.TimeUnit.SECONDS.toMillis(f.k().d()) + java.lang.System.currentTimeMillis();
                                                }
                                            } else {
                                                s1Var2.D2("sms");
                                                ((u03.qux) bazVar).getClass();
                                                s1Var2.P = java.util.concurrent.TimeUnit.SECONDS.toMillis(f.j().d()) + java.lang.System.currentTimeMillis();
                                            }
                                            s1Var2.f2(true);
                                            break;
                                        case 0:
                                        default:
                                            throw new java.lang.RuntimeException();
                                        case 1:
                                            z = f.j().c();
                                            if (!z) {
                                            }
                                            s1Var2.O = f.g();
                                            s1Var2.S = f.b();
                                            s1Var2.R = java.lang.Long.valueOf(f.f());
                                            e = f.e();
                                            if (e != null) {
                                            }
                                            if (i11 == 1) {
                                            }
                                            s1Var2.f2(true);
                                            break;
                                        case 2:
                                            z = f.d().d();
                                            if (!z) {
                                            }
                                            s1Var2.O = f.g();
                                            s1Var2.S = f.b();
                                            s1Var2.R = java.lang.Long.valueOf(f.f());
                                            e = f.e();
                                            if (e != null) {
                                            }
                                            if (i11 == 1) {
                                            }
                                            s1Var2.f2(true);
                                            break;
                                        case 3:
                                            z = f.h().d();
                                            if (!z) {
                                            }
                                            s1Var2.O = f.g();
                                            s1Var2.S = f.b();
                                            s1Var2.R = java.lang.Long.valueOf(f.f());
                                            e = f.e();
                                            if (e != null) {
                                            }
                                            if (i11 == 1) {
                                            }
                                            s1Var2.f2(true);
                                            break;
                                        case 4:
                                            z = f.k().c();
                                            if (!z) {
                                            }
                                            s1Var2.O = f.g();
                                            s1Var2.S = f.b();
                                            s1Var2.R = java.lang.Long.valueOf(f.f());
                                            e = f.e();
                                            if (e != null) {
                                            }
                                            if (i11 == 1) {
                                            }
                                            s1Var2.f2(true);
                                            break;
                                        case 5:
                                            z = f.i().d();
                                            if (!z) {
                                            }
                                            s1Var2.O = f.g();
                                            s1Var2.S = f.b();
                                            s1Var2.R = java.lang.Long.valueOf(f.f());
                                            e = f.e();
                                            if (e != null) {
                                            }
                                            if (i11 == 1) {
                                            }
                                            s1Var2.f2(true);
                                            break;
                                    }
                                }
                            } else {
                                yy.y b = x1Var.b();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getAttestationRequired(...)");
                                if (!((b92.f) s1Var2.q.e).c()) {
                                    s1Var2.r2(com.truecaller.wizard.verification.s0.i, "NumberVerification");
                                } else {
                                    java.lang.String c = b.c();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getNonce(...)");
                                    java.lang.String e3 = b.e();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e3, "getRequestId(...)");
                                    fg3.h0.J(s1Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b2.e(s1Var2, c, e3, b.d(), (df3.bar) null, 5), 3);
                                }
                            }
                        } else {
                            yy.e1 g = x1Var.g();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "getOnboarded(...)");
                            fg3.h0.J(s1Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(s1Var2, g, (df3.bar) null, 19), 3);
                        }
                    } else {
                        s1Var2.r2(com.truecaller.wizard.verification.s0.p, "SendOnboardingOTPGrpc");
                    }
                } else if (jVar instanceof o93.i) {
                    com.truecaller.wizard.verification.s1.c2(s1Var2, ((o93.i) jVar).a, "SendOnboardingOTP");
                } else {
                    throw new java.lang.RuntimeException();
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar5 = ef3.bar.a;
                int i14 = this.y;
                com.truecaller.wizard.verification.s1 s1Var3 = this.z;
                if (i14 != 0) {
                    if (i14 == 1) {
                        od.p.E(obj);
                        y = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.util.List list = s1Var3.U;
                    if (list != null) {
                        if (list.isEmpty()) {
                            s1Var3.r2(com.truecaller.wizard.verification.s0.q, "NumberVerification");
                            return kotlin.Unit.a;
                        }
                        java.lang.String str2 = (java.lang.String) list.get(s1Var3.V % list.size());
                        java.lang.String str3 = s1Var3.W;
                        if (str3 != null) {
                            bm.e eVar = s1Var3.t;
                            java.lang.Object obj5 = s1Var3.f.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                            java.lang.Object obj6 = s1Var3.e.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                            java.lang.String str4 = (java.lang.String) obj6;
                            int i15 = s1Var3.V;
                            this.y = 1;
                            y = eVar.y((java.lang.String) obj5, str4, str2, str3, i15, this);
                            if (y == barVar5) {
                                return barVar5;
                            }
                        } else {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                }
                int i16 = com.truecaller.wizard.verification.f1.a[((com.truecaller.wizard.verification.otp.sms.SendSmsHelper$Result) y).ordinal()];
                if (i16 != 1) {
                    if (i16 != 2 && i16 != 3) {
                        if (i16 == 4) {
                            s1Var3.V++;
                            java.lang.String h = ((u03.g0) s1Var3.u).h(2132018846, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                            java.lang.String h2 = ((u03.g0) s1Var3.u).h(2132018847, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                            java.lang.String h3 = ((u03.g0) s1Var3.u).h(2132019051, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                            s1Var3.w2(h, h2, h3, "SendSmsFailed", "NumberVerification");
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    }
                } else {
                    s1Var3.V++;
                    com.truecaller.wizard.verification.v1 v1Var = s1Var3.f0;
                    com.truecaller.wizard.verification.s sVar = v1Var.a;
                    if (sVar instanceof com.truecaller.wizard.verification.k) {
                        s1Var3.E2(com.truecaller.wizard.verification.v1.a(v1Var, com.truecaller.wizard.verification.k.a((com.truecaller.wizard.verification.k) sVar, false, 61), com.truecaller.wizard.verification.a0.a, null, 4));
                    }
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar6 = ef3.bar.a;
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    android.content.Context context = s1Var.K.a;
                    qe.i.b(context, "dropcall.lottie");
                    qe.i.b(context, "success.lottie");
                    this.y = 1;
                    if (com.truecaller.wizard.verification.s1.e2(s1Var, this) == barVar6) {
                        return barVar6;
                    }
                }
                return kotlin.Unit.a;
            case 5:
                ef3.bar barVar7 = ef3.bar.a;
                int i18 = this.y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ah.y yVar = s1Var.v;
                    this.y = 1;
                    f43.baz bazVar2 = (f43.baz) yVar.i;
                    qo1.i iVar = (qo1.i) yVar.m;
                    so1.baz bazVar3 = iVar.a;
                    com.truecaller.featuretoggles.FeatureState featureState = com.truecaller.featuretoggles.FeatureState.DISABLED;
                    if (bazVar3.a("callScreeningServiceDropCall_61877", featureState) && ((u03.c) ((u03.b) yVar.p)).m()) {
                        bazVar2.c0("callScreeningService");
                        obj2 = ((p93.k) yVar.h).a.collect(new g93.z(i5, new nm1.m2(new g93.z(i5, new g93.z(i4, new p93.d(yVar, 0), yVar), new p93.c(yVar, null, 1)), 3), new p93.c(yVar, null, 0)), this);
                    } else if (((u03.z) yVar.o).g("android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG")) {
                        bazVar2.c0("phoneStateListener");
                        boolean a = iVar.a.a("disableVerificationCallRejection_70213", featureState);
                        p93.j jVar2 = (p93.j) yVar.g;
                        com.truecaller.wizard.verification.h1 h1Var = new com.truecaller.wizard.verification.h1(new androidx.room.o(25, new ig3.v(new ig3.m2(new ig3.p1(jVar2.d), new oi2.e(jVar2, (df3.bar) null, 16)), new ke1.y(jVar2, (df3.bar) null, 1)), new p93.c(yVar, null, 2)), 3);
                        long j = p93.g.b;
                        t41.r0 r0Var = (t41.r0) yVar.n;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1Var, "<this>");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "timestampUtil");
                        obj2 = new ig3.r1(new b2.e(h1Var, r0Var, j, (df3.bar) null, 18)).collect(new g93.z(i5, new nm1.m2(new p93.d(yVar, 1), 5), new a00.b(yVar, a, (df3.bar) null, 16)), this);
                        if (obj2 != barVar7) {
                            obj2 = kotlin.Unit.a;
                        }
                        if (obj2 != barVar7) {
                            obj2 = kotlin.Unit.a;
                        }
                        if (obj2 != barVar7) {
                            obj2 = kotlin.Unit.a;
                        }
                        if (obj2 != barVar7) {
                            obj2 = kotlin.Unit.a;
                        }
                    } else {
                        bazVar2.c0(com.truecaller.suspension.data.UnSuspendAccountSuccessResponseDto.REASON_ERROR);
                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.IllegalStateException("Can't register verification drop call listener"));
                        obj2 = kotlin.Unit.a;
                    }
                    if (obj2 == barVar7) {
                        return barVar7;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar8 = ef3.bar.a;
                int i19 = this.y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    q93.l lVar = s1Var.s;
                    ig3.v vVar = new ig3.v(new ig3.m2(lVar.i, new oi2.e(lVar, (df3.bar) null, 29)), new dz0.b(lVar, (df3.bar) null, 1));
                    com.truecaller.wizard.verification.p1 p1Var = new com.truecaller.wizard.verification.p1(s1Var, barVar, i6);
                    a32.e eVar2 = new a32.e(s1Var, 23);
                    this.y = 1;
                    java.lang.Object collect = vVar.collect(new g93.z(i5, new a63.g0((ig3.j) eVar2, 18), p1Var), this);
                    if (collect != barVar8) {
                        collect = kotlin.Unit.a;
                    }
                    if (collect != barVar8) {
                        collect = kotlin.Unit.a;
                    }
                    if (collect == barVar8) {
                        return barVar8;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
