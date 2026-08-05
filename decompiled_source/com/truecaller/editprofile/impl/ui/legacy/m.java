package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class m extends ff3.g implements kotlin.jvm.functions.Function2 {
    public java.lang.Object A;
    public java.lang.Object B;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.truecaller.editprofile.impl.ui.legacy.s sVar, android.net.Uri uri, df3.bar barVar) {
        super(2, barVar);
        this.x = 1;
        this.z = sVar;
        this.A = uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (r7.f(r17, r0) != r8) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object c(java.lang.Object obj) {
        java.lang.Float f;
        c1.g gVar;
        java.lang.Object c;
        e1.m1 m1Var = (e1.m1) this.z;
        c1.qux quxVar = m1Var.x;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        try {
        } catch (java.lang.Throwable th) {
            java.lang.Float f2 = new java.lang.Float(0.0f);
            this.B = th;
            this.A = null;
            this.y = 4;
            if (quxVar.f(this, f2) != barVar) {
                throw th;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th2 = (java.lang.Throwable) this.B;
                        od.p.E(obj);
                        throw th2;
                    }
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                od.p.E(obj);
                c = obj;
                java.lang.Float f3 = new java.lang.Float(0.0f);
                this.y = 3;
            } else {
                c1.g gVar2 = (c1.g) this.A;
                java.lang.Float f4 = (java.lang.Float) this.B;
                od.p.E(obj);
                gVar = gVar2;
                f = f4;
            }
        } else {
            od.p.E(obj);
            f = (java.lang.Float) this.B;
            if (f == null) {
                return kotlin.Unit.a;
            }
            float floatValue = f.floatValue();
            int i2 = m1Var.o;
            c1.g o0Var = new c1.o0(new c1.l1((int) java.lang.Math.ceil(floatValue / (java.lang.Math.abs(j4.i.w(m1Var).A.D0(m1Var.p)) / 1000.0f)), 1200, c1.v.d), c1.n0.a, ((-1200) + i2) * (-1));
            java.lang.Float f5 = new java.lang.Float(0.0f);
            this.B = f;
            this.A = o0Var;
            this.y = 1;
            if (quxVar.f(this, f5) != barVar) {
                gVar = o0Var;
            }
            return barVar;
        }
        c1.qux quxVar2 = m1Var.x;
        this.B = null;
        this.A = null;
        this.y = 2;
        c = c1.qux.c(quxVar2, f, gVar, (java.lang.Float) null, (kotlin.jvm.functions.Function1) null, this, 12);
        if (c == barVar) {
            return barVar;
        }
        java.lang.Float f33 = new java.lang.Float(0.0f);
        this.y = 3;
    }

    private final java.lang.Object f(java.lang.Object obj) {
        int i;
        long currentTimeMillis;
        java.util.Set set;
        e22.bar barVar = (e22.bar) this.A;
        ef3.bar barVar2 = ef3.bar.a;
        int i2 = this.y;
        if (i2 != 0) {
            if (i2 == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            e22.b bVar = barVar.c;
            com.truecaller.messaging.event_sender.model.RetryEvent retryEvent = new com.truecaller.messaging.event_sender.model.RetryEvent(0L, (com.truecaller.messaging.event_sender.model.RetryEventType) this.B, (byte[]) this.z, 0, 0L, 25, null);
            this.y = 1;
            f22.a aVar = bVar.a;
            int i3 = e22.qux.a[retryEvent.getType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i = 2;
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                i = 1;
            }
            int retryCount = retryEvent.getRetryCount();
            byte[] content = retryEvent.getContent();
            if (retryEvent.getAttemptTimestamp() != 0) {
                currentTimeMillis = retryEvent.getAttemptTimestamp();
            } else {
                bVar.b.getClass();
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            java.lang.Object q = mc.f.q(aVar.a, false, true, new ey2.k(1, aVar, new com.truecaller.messaging.event_sender.db.MsgEventToSend(0L, i, content, retryCount, currentTimeMillis, 1, null)), this);
            if (q != barVar2) {
                q = kotlin.Unit.a;
            }
            if (q != barVar2) {
                q = kotlin.Unit.a;
            }
            if (q == barVar2) {
                return barVar2;
            }
        }
        nd.j0 j0Var = barVar.d;
        nd.l lVar = nd.l.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.messaging.event_sender.RetryEventWorker.class, "workerClass");
        nd.x b = new f6.v0(com.truecaller.messaging.event_sender.RetryEventWorker.class).u(nd.bar.a, 10L, java.util.concurrent.TimeUnit.SECONDS).b("RetryEventLoggingWorker");
        nd.w wVar = nd.w.a;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        nd.w wVar2 = nd.w.b;
        wd.e t = com.appsflyer.internal.e.t(wVar2, "networkType", (android.net.NetworkRequest) null);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            set = kotlin.collections.CollectionsKt.K0(linkedHashSet);
        } else {
            set = kotlin.collections.j0.a;
        }
        return j0Var.g("RetryEventLoggingWorker", lVar, b.v(new nd.d(t, wVar2, false, false, false, false, -1L, -1L, set)).d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r9 != r7) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: baz -> 0x001f, TryCatch #0 {baz -> 0x001f, blocks: (B:7:0x001a, B:8:0x0090, B:13:0x002b, B:14:0x006f, B:19:0x008b, B:21:0x0033, B:22:0x0054, B:24:0x005c, B:27:0x0093, B:30:0x003a, B:32:0x0049, B:35:0x0096, B:36:0x00b0), top: B:2:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object g(java.lang.Object obj) {
        h22.qux quxVar;
        java.lang.Object W;
        e22.bar barVar = (e22.bar) this.B;
        com.truecaller.messaging.event_sender.model.Event event = (com.truecaller.messaging.event_sender.model.Event) this.z;
        ef3.bar barVar2 = ef3.bar.a;
        int i = this.y;
        df3.bar barVar3 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            od.p.E(obj);
                            return com.truecaller.messaging.event_sender.model.ResultSendEvent.RETRY;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    com.truecaller.messaging.event_sender.model.RetryEventType a = e22.bar.a(event);
                    this.A = null;
                    this.y = 3;
                    W = fg3.h0.W(barVar.a, new com.truecaller.editprofile.impl.ui.legacy.m(barVar, a, (byte[]) obj, barVar3, 25), this);
                    if (W == barVar2) {
                        W = kotlin.Unit.a;
                    }
                } else {
                    quxVar = (h22.qux) this.A;
                    od.p.E(obj);
                }
            } else {
                od.p.E(obj);
                quxVar = (h22.qux) barVar.b.get(e22.bar.a(event));
                if (quxVar != null) {
                    this.A = quxVar;
                    this.y = 1;
                    obj = h22.qux.b(quxVar, event, this);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                } else {
                    java.lang.String valueOf = java.lang.String.valueOf(e22.bar.a(event));
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "type");
                    throw new java.lang.IllegalArgumentException(bar.t("Handler not registered for type: ", valueOf, " "));
                }
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                this.A = null;
                this.y = 2;
                obj = fg3.h0.W(quxVar.a, new h22.bar(quxVar, event, barVar3, 0), this);
                if (obj == barVar2) {
                    return barVar2;
                }
                com.truecaller.messaging.event_sender.model.RetryEventType a2 = e22.bar.a(event);
                this.A = null;
                this.y = 3;
                W = fg3.h0.W(barVar.a, new com.truecaller.editprofile.impl.ui.legacy.m(barVar, a2, (byte[]) obj, barVar3, 25), this);
                if (W == barVar2) {
                }
            } else {
                return com.truecaller.messaging.event_sender.model.ResultSendEvent.SUCCESS;
            }
        } catch (e22.baz e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
            return com.truecaller.messaging.event_sender.model.ResultSendEvent.RETRY;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c3, code lost:
    
        if (r1.s(r3, true, r18) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (e93.t.p(r1, r3, r18) == r2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object j(java.lang.Object obj) {
        com.truecaller.google_login.GoogleProfileData p;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        e93.x xVar;
        java.lang.Object obj2;
        boolean z5;
        e93.t tVar = (e93.t) this.B;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p = (com.truecaller.google_login.GoogleProfileData) this.A;
            od.p.E(obj);
        } else {
            od.p.E(obj);
            p = ((t93.c) tVar.f.get()).p();
            if (kotlin.jvm.internal.Intrinsics.b(((androidx.lifecycle.d1) this.z).a("showManualInputArg"), java.lang.Boolean.TRUE) && p != null) {
                z = true;
            } else {
                z = false;
            }
            kr0.o oVar = tVar.j;
            android.content.Context context = (android.content.Context) oVar.b;
            if (g6.b.b(context, "android.permission.GET_ACCOUNTS") != 0) {
                z3 = true;
            } else {
                android.accounts.Account[] accountsByType = android.accounts.AccountManager.get(context).getAccountsByType("com.google");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accountsByType, "getAccountsByType(...)");
                if (accountsByType.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = !z2;
            }
            if (z3 && ((x42.a) oVar.c).d(x42.b.c)) {
                z4 = true;
            } else {
                z4 = false;
            }
            ig3.h2 h2Var = tVar.n;
            do {
                java.lang.Object value = h2Var.getValue();
                xVar = (e93.x) value;
                if (!z && z4) {
                    obj2 = value;
                    z5 = false;
                } else {
                    obj2 = value;
                    z5 = true;
                }
            } while (!h2Var.n(obj2, e93.x.a(xVar, z5, z4, (java.lang.String) null, false, false, (e93.w) null, 60)));
            this.A = p;
            this.y = 1;
        }
        this.A = null;
        this.y = 2;
    }

    private final java.lang.Object k(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
                return kotlin.Unit.a;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.p.E(obj);
        ig3.v1 v1Var = ((r1.u) this.A).r.a;
        ea0.c cVar = new ea0.c((ea0.u) this.B, (com.truecaller.ads.api.model.ad.AdPlacement) this.z, 1);
        this.y = 1;
        v1Var.collect(cVar, this);
        return barVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.editprofile.impl.ui.legacy.m((android.net.Uri) this.A, (com.truecaller.profile.api.model.ImageSource) this.B, (com.truecaller.editprofile.impl.ui.legacy.s) this.z, barVar, 0);
            case 1:
                com.truecaller.editprofile.impl.ui.legacy.m mVar = new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.editprofile.impl.ui.legacy.s) this.z, (android.net.Uri) this.A, barVar);
                mVar.B = obj;
                return mVar;
            case 2:
                com.truecaller.editprofile.impl.ui.legacy.m mVar2 = new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.messaging.notifications.g) this.B, (com.truecaller.messaging.data.types.Message) this.z, barVar, 2);
                mVar2.A = obj;
                return mVar2;
            case 3:
                return new com.truecaller.editprofile.impl.ui.legacy.m((java.util.List) this.B, (com.truecaller.messaging.notifications.g0) this.z, barVar, 3);
            case 4:
                return new com.truecaller.editprofile.impl.ui.legacy.m((kotlin.jvm.functions.Function1) this.A, (com.truecaller.rewardprogram.impl.ui.qa.j) this.B, (java.lang.String) this.z, barVar);
            case 5:
                return new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.search.global.a1) this.A, (java.util.List) this.B, (or2.z0) this.z, barVar, 5);
            case 6:
                return new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.ui.t) this.z, barVar, 6);
            case 7:
                return new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.ui.q0) this.A, (com.truecaller.startup_dialogs.StartupDialogType) this.B, (com.truecaller.startup_dialogs.StartupDialogDismissReason) this.z, barVar, 7);
            case 8:
                com.truecaller.editprofile.impl.ui.legacy.m mVar3 = new com.truecaller.editprofile.impl.ui.legacy.m((r2.m6) this.B, (android.content.res.Resources) this.z, barVar, 8);
                mVar3.A = obj;
                return mVar3;
            case 9:
                return new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.voicemail.presentation.deactivate.h) this.A, (r2.m6) this.B, (android.content.res.Resources) this.z, barVar, 9);
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.wizard.verification.s1) this.A, (com.truecaller.account.network.TokenResponseDto) this.B, (java.lang.String) this.z, barVar, 10);
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((ct0.l) this.A, (rb.e0) this.B, (java.lang.String) this.z, barVar, 11);
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((cu0.y) this.A, (com.truecaller.data.entity.HistoryEvent) this.B, (cu0.c) this.z, barVar, 12);
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((cu0.j0) this.A, (com.truecaller.data.entity.HistoryEvent) this.B, (cu0.c) this.z, barVar, 13);
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((cu0.j0) this.z, barVar, 14);
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((d53.k) this.A, (rb.e0) this.B, (kotlin.jvm.functions.Function0) this.z, barVar, 15);
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((java.lang.String) this.A, (com.truecaller.service.DialerNumberLookupService) this.B, (android.os.Bundle) this.z, barVar, 16);
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((dr1.h) this.A, (android.graphics.Bitmap) this.B, (br1.baz) this.z, barVar, 17);
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((dt0.c) this.A, (r2.m6) this.B, (android.content.res.Resources) this.z, barVar, 18);
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                return new com.truecaller.editprofile.impl.ui.legacy.m((dw0.qux) this.A, (com.truecaller.calling.util.roaming.CallCountrySelectionManager.Action.BottomSheet) this.B, (java.lang.String) this.z, barVar, 19);
            case 20:
                return new com.truecaller.editprofile.impl.ui.legacy.m((java.lang.Integer) this.A, (dw0.e) this.B, (java.lang.String) this.z, barVar, 20);
            case 21:
                return new com.truecaller.editprofile.impl.ui.legacy.m((dq1.h) this.A, this.y, (java.lang.String) this.B, (java.lang.String) this.z, barVar);
            case 22:
                return new com.truecaller.editprofile.impl.ui.legacy.m((k1.h) this.A, (k1.i) this.B, (fg3.t0) this.z, barVar, 22);
            case 23:
                return new com.truecaller.editprofile.impl.ui.legacy.m((k1.h) this.A, (k1.g) this.B, (fg3.t0) this.z, barVar, 23);
            case 24:
                com.truecaller.editprofile.impl.ui.legacy.m mVar4 = new com.truecaller.editprofile.impl.ui.legacy.m((e1.m1) this.z, barVar, 24);
                mVar4.B = obj;
                return mVar4;
            case 25:
                return new com.truecaller.editprofile.impl.ui.legacy.m((e22.bar) this.A, (com.truecaller.messaging.event_sender.model.RetryEventType) this.B, (byte[]) this.z, barVar, 25);
            case 26:
                return new com.truecaller.editprofile.impl.ui.legacy.m((e22.bar) this.B, (com.truecaller.messaging.event_sender.model.Event) this.z, barVar, 26);
            case 27:
                return new com.truecaller.editprofile.impl.ui.legacy.m((e93.t) this.B, (androidx.lifecycle.d1) this.z, barVar, 27);
            case 28:
                return new com.truecaller.editprofile.impl.ui.legacy.m((r1.u) this.A, (ea0.u) this.B, (com.truecaller.ads.api.model.ad.AdPlacement) this.z, barVar, 28);
            default:
                return new com.truecaller.editprofile.impl.ui.legacy.m((go2.v1) this.A, (r2.d6) this.B, (android.content.Context) this.z, barVar, 29);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.x) {
            case 0:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create((com.truecaller.voicemail.presentation.deactivate.a) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 20:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 21:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 22:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 23:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 24:
                return create((java.lang.Float) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 25:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 26:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 27:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 28:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            default:
                create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
    
        if (yp.d0.D(r4) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x048d A[Catch: all -> 0x0497, TryCatch #0 {all -> 0x0497, blocks: (B:246:0x0489, B:248:0x048d, B:250:0x0491, B:254:0x049c, B:256:0x04be), top: B:245:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a;
        com.truecaller.messaging.notifications.f o;
        java.lang.Object X;
        java.util.List list;
        java.lang.Object W;
        java.lang.Object value;
        java.lang.Object W2;
        java.lang.Object W3;
        com.truecaller.search.global.h0 h0Var;
        java.lang.Object f;
        pg2.m mVar;
        androidx.lifecycle.q0 q0Var;
        java.lang.Object g;
        java.lang.Object W4;
        java.lang.Object b;
        java.lang.Object f2;
        cu0.c cVar;
        java.lang.Object obj2;
        java.lang.Object f3;
        java.lang.Object obj3;
        cu0.j0 j0Var;
        pg3.a aVar;
        cu0.c cVar2;
        cu0.c cVar3;
        java.lang.Object obj4;
        java.lang.Object b2;
        int intValue;
        java.lang.String str;
        com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType;
        java.lang.String str2;
        com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        df3.bar o2;
        df3.bar barVar;
        java.lang.Boolean bool;
        boolean z = false;
        df3.bar barVar2 = null;
        switch (this.x) {
            case 0:
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) this.z;
                ef3.bar barVar3 = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    pg2.h0 h0Var2 = new pg2.h0((android.net.Uri) this.A, (com.truecaller.profile.api.model.ImageSource) this.B, sVar.y, false);
                    this.y = 1;
                    if (com.truecaller.editprofile.impl.ui.legacy.s.f2(sVar, h0Var2, this) == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                android.net.Uri uri = (android.net.Uri) this.A;
                com.truecaller.editprofile.impl.ui.legacy.s sVar2 = (com.truecaller.editprofile.impl.ui.legacy.s) this.z;
                fg3.e0 e0Var = (fg3.e0) this.B;
                ef3.bar barVar4 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                        a = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    xg2.a aVar2 = sVar2.n;
                    this.B = e0Var;
                    this.y = 1;
                    a = aVar2.a(uri, this);
                    if (a == barVar4) {
                        return barVar4;
                    }
                }
                android.net.Uri uri2 = (android.net.Uri) a;
                com.truecaller.profile.api.model.ImageSource imageSource = com.truecaller.profile.api.model.ImageSource.TRUECALLER;
                if (uri2 != null) {
                    kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                    if (hVar != null) {
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).k6(uri2);
                    }
                    fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(uri, imageSource, sVar2, (df3.bar) null, 0), 3);
                }
                kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                if (hVar2 != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).n6(true);
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar5 = ef3.bar.a;
                int i3 = this.y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            od.p.E(obj);
                            X = obj;
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.messaging.notifications.g gVar = (com.truecaller.messaging.notifications.g) this.B;
                        com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) this.z;
                        kotlin.o oVar = kotlin.q.b;
                        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(10L);
                        bu2.j jVar = new bu2.j(gVar, message, (df3.bar) null);
                        this.A = null;
                        this.y = 1;
                        X = fg3.h0.X(millis, jVar, this);
                        if (X == barVar5) {
                            return barVar5;
                        }
                    }
                    o = (com.truecaller.messaging.notifications.f) X;
                    kotlin.o oVar2 = kotlin.q.b;
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar3 = kotlin.q.b;
                    o = od.p.o(th);
                }
                java.lang.Throwable a2 = kotlin.q.a(o);
                if (a2 == null) {
                    com.truecaller.messaging.notifications.f fVar = o;
                    if (fVar != null) {
                        return new com.truecaller.messaging.notifications.c(fVar);
                    }
                    return com.truecaller.messaging.notifications.b.a;
                }
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a2);
                if (a2 instanceof fg3.q2) {
                    return com.truecaller.messaging.notifications.d.a;
                }
                return new com.truecaller.messaging.notifications.a(a2);
            case 3:
                com.truecaller.messaging.notifications.g0 g0Var = (com.truecaller.messaging.notifications.g0) this.z;
                java.util.List list2 = (java.util.List) this.B;
                ef3.bar barVar6 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        java.lang.Iterable iterable = (java.lang.Iterable) this.A;
                        od.p.E(obj);
                        list = iterable;
                        W = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    list = list2;
                    y12.o0 o0Var = (y12.o0) g0Var.n.get();
                    this.A = list;
                    this.y = 1;
                    W = fg3.h0.W(o0Var.d, new xy1.n(o0Var, list2, barVar2, 4), this);
                    if (W == barVar6) {
                        return barVar6;
                    }
                }
                java.util.List i0 = kotlin.collections.CollectionsKt.i0(list, (java.lang.Iterable) W);
                if (!i0.isEmpty()) {
                    g0Var.c(i0);
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar7 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ff3.g gVar2 = (ff3.g) this.A;
                    this.y = 1;
                    if (gVar2.invoke(this) == barVar7) {
                        return barVar7;
                    }
                }
                ig3.h2 h2Var = ((com.truecaller.rewardprogram.impl.ui.qa.j) this.B).j;
                java.lang.String str9 = (java.lang.String) this.z;
                do {
                    value = h2Var.getValue();
                } while (!h2Var.n(value, str9));
                return kotlin.Unit.a;
            case 5:
                com.truecaller.search.global.a1 a1Var = (com.truecaller.search.global.a1) this.A;
                ef3.bar barVar8 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            od.p.E(obj);
                            W3 = obj;
                            java.util.List list3 = (java.util.List) W3;
                            or2.z0 z0Var = (or2.z0) this.z;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.search.global.a1.j[0], "property");
                            h0Var = (com.truecaller.search.global.y0) ((java.lang.ref.WeakReference) z0Var.a).get();
                            if (h0Var != null) {
                                com.truecaller.search.global.h0 h0Var3 = h0Var;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "results");
                                if (((com.truecaller.sdk.bar) h0Var3).a != null) {
                                    fg3.k2 k2Var = h0Var3.t0;
                                    if (k2Var != null) {
                                        k2Var.cancel((java.util.concurrent.CancellationException) null);
                                    }
                                    h0Var3.t0 = fg3.h0.J(h0Var3, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.k(false, h0Var3, list3, (df3.bar) null, 7), 3);
                                }
                            }
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    W2 = obj;
                } else {
                    od.p.E(obj);
                    ev0.baz bazVar = a1Var.h;
                    this.y = 1;
                    W2 = fg3.h0.W(bazVar.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(bazVar, (df3.bar) null, 27), this);
                    if (W2 == barVar8) {
                        return barVar8;
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj5 : (java.lang.Iterable) W2) {
                    if (((fv0.bar) obj5).b) {
                        arrayList.add(obj5);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((fv0.bar) it.next()).a);
                }
                kotlin.coroutines.CoroutineContext coroutineContext = a1Var.d;
                com.truecaller.search.global.z0 z0Var2 = new com.truecaller.search.global.z0((java.util.List) this.B, arrayList2, a1Var, (df3.bar) null);
                this.y = 2;
                W3 = fg3.h0.W(coroutineContext, z0Var2, this);
                if (W3 == barVar8) {
                    return barVar8;
                }
                java.util.List list32 = (java.util.List) W3;
                or2.z0 z0Var3 = (or2.z0) this.z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.search.global.a1.j[0], "property");
                h0Var = (com.truecaller.search.global.y0) ((java.lang.ref.WeakReference) z0Var3.a).get();
                if (h0Var != null) {
                }
                return kotlin.Unit.a;
            case 6:
                com.truecaller.ui.t tVar = (com.truecaller.ui.t) this.z;
                rg2.m mVar2 = tVar.b;
                ef3.bar barVar9 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            q0Var = (androidx.lifecycle.q0) this.B;
                            pg2.m mVar3 = (pg2.m) this.A;
                            od.p.E(obj);
                            mVar = mVar3;
                            g = obj;
                            q0Var.i(new com.truecaller.ui.s(java.lang.String.valueOf(((java.lang.Number) g).longValue()), mVar.k(), mVar.getEmail()));
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    f = obj;
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    f = mVar2.f(this);
                    if (f == barVar9) {
                        return barVar9;
                    }
                }
                mVar = (pg2.m) f;
                q0Var = tVar.c;
                this.A = mVar;
                this.B = q0Var;
                this.y = 2;
                g = mVar2.g(this);
                if (g == barVar9) {
                    return barVar9;
                }
                q0Var.i(new com.truecaller.ui.s(java.lang.String.valueOf(((java.lang.Number) g).longValue()), mVar.k(), mVar.getEmail()));
                return kotlin.Unit.a;
            case 7:
                com.truecaller.ui.q0 q0Var2 = (com.truecaller.ui.q0) this.A;
                ig3.v1 v1Var = q0Var2.d;
                ef3.bar barVar10 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2 && i8 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        return kotlin.Unit.a;
                    }
                    od.p.E(obj);
                    W4 = obj;
                } else {
                    od.p.E(obj);
                    le2.v vVar = q0Var2.b;
                    com.truecaller.startup_dialogs.StartupDialogType startupDialogType = (com.truecaller.startup_dialogs.StartupDialogType) this.B;
                    this.y = 1;
                    vVar.getClass();
                    W4 = fg3.h0.W((kotlin.coroutines.CoroutineContext) vVar.b, new p91.d(vVar, new pt2.a(startupDialogType, 0), barVar2, 19), this);
                    if (W4 == barVar10) {
                        return barVar10;
                    }
                }
                pt2.qux quxVar = (pt2.qux) W4;
                if (quxVar != null) {
                    com.truecaller.startup_dialogs.StartupDialogDismissReason startupDialogDismissReason = (com.truecaller.startup_dialogs.StartupDialogDismissReason) this.z;
                    quxVar.e(startupDialogDismissReason);
                    if (startupDialogDismissReason == com.truecaller.startup_dialogs.StartupDialogDismissReason.BACKUP_RESTORED) {
                        com.truecaller.ui.h0 h0Var4 = com.truecaller.ui.h0.a;
                        this.y = 2;
                        if (v1Var.emit(h0Var4, this) == barVar10) {
                            return barVar10;
                        }
                    } else {
                        com.truecaller.ui.j0 j0Var2 = com.truecaller.ui.j0.a;
                        this.y = 3;
                        if (v1Var.emit(j0Var2, this) == barVar10) {
                            return barVar10;
                        }
                    }
                }
                return kotlin.Unit.a;
            case 8:
                com.truecaller.voicemail.presentation.deactivate.a aVar3 = (com.truecaller.voicemail.presentation.deactivate.a) this.A;
                ef3.bar barVar11 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (kotlin.jvm.internal.Intrinsics.b(aVar3, com.truecaller.voicemail.presentation.deactivate.baz.a)) {
                        r2.m6 m6Var = (r2.m6) this.B;
                        java.lang.String string = ((android.content.res.Resources) this.z).getString(2132023761);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        this.A = null;
                        this.y = 1;
                        if (r2.m6.b(m6Var, string, (java.lang.String) null, (r2.g6) null, this, 14) == barVar11) {
                            return barVar11;
                        }
                    } else if (kotlin.jvm.internal.Intrinsics.b(aVar3, com.truecaller.voicemail.presentation.deactivate.qux.a)) {
                        kotlin.Unit unit = kotlin.Unit.a;
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                }
                return kotlin.Unit.a;
            case 9:
                ef3.bar barVar12 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.d I = ig3.w1.I(((com.truecaller.voicemail.presentation.deactivate.h) this.A).d);
                    com.truecaller.editprofile.impl.ui.legacy.m mVar4 = new com.truecaller.editprofile.impl.ui.legacy.m((r2.m6) this.B, (android.content.res.Resources) this.z, barVar2, 8);
                    this.y = 1;
                    if (ig3.w1.m(I, mVar4, this) == barVar12) {
                        return barVar12;
                    }
                }
                return kotlin.Unit.a;
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                com.truecaller.wizard.verification.s1 s1Var = (com.truecaller.wizard.verification.s1) this.A;
                kotlin.coroutines.CoroutineContext coroutineContext2 = s1Var.d;
                ef3.bar barVar13 = ef3.bar.a;
                int i11 = this.y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        return kotlin.Unit.a;
                    }
                    od.p.E(obj);
                    b = obj;
                } else {
                    od.p.E(obj);
                    com.truecaller.wizard.verification.r0 r0Var = s1Var.h;
                    com.truecaller.account.network.TokenResponseDto tokenResponseDto = (com.truecaller.account.network.TokenResponseDto) this.B;
                    java.lang.Long l = s1Var.R;
                    java.lang.String str10 = s1Var.S;
                    java.lang.String str11 = s1Var.O;
                    this.y = 1;
                    b = r0Var.b(tokenResponseDto, l, str10, str11, this);
                    if (b == barVar13) {
                        return barVar13;
                    }
                }
                com.truecaller.wizard.verification.q0 q0Var3 = (com.truecaller.wizard.verification.q0) b;
                s1Var.e0 = false;
                if (kotlin.jvm.internal.Intrinsics.b(q0Var3, com.truecaller.wizard.verification.n0.a)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux quxVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(s1Var, (java.lang.String) this.z, (df3.bar) null, 22);
                    this.y = 2;
                    if (fg3.h0.W(coroutineContext2, quxVar2, this) == barVar13) {
                        return barVar13;
                    }
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.b(q0Var3, com.truecaller.wizard.verification.o0.a) && !kotlin.jvm.internal.Intrinsics.b(q0Var3, com.truecaller.wizard.verification.p0.a)) {
                        throw new java.lang.RuntimeException();
                    }
                    com.truecaller.wizard.verification.s1.d2(s1Var, (java.lang.String) yi3.bar.y((com.truecaller.account.network.TokenResponseDto) this.B).b);
                    com.truecaller.wizard.verification.d1 d1Var = new com.truecaller.wizard.verification.d1(q0Var3, s1Var, (df3.bar) null, 1);
                    this.y = 3;
                    if (fg3.h0.W(coroutineContext2, d1Var, this) == barVar13) {
                        return barVar13;
                    }
                }
                return kotlin.Unit.a;
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                ef3.bar barVar14 = ef3.bar.a;
                int i13 = this.y;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    ig3.p1 p1Var = ((ct0.l) this.A).f;
                    ag2.e eVar = new ag2.e(14, (rb.e0) this.B, (java.lang.String) this.z);
                    this.y = 1;
                    if (p1Var.a.collect(eVar, this) == barVar14) {
                        return barVar14;
                    }
                }
                throw new java.lang.RuntimeException();
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                cu0.y yVar = (cu0.y) this.A;
                hw0.q qVar = yVar.t;
                ef3.bar barVar15 = ef3.bar.a;
                int i14 = this.y;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        cVar = (cu0.c) this.z;
                        this.y = 3;
                        if (cVar.l) {
                            obj2 = lk3.bar.q(qVar.d(), new b63.qux(2, 23, (df3.bar) null), this);
                            if (obj2 != barVar15) {
                                obj2 = kotlin.Unit.a;
                            }
                            if (obj2 != barVar15) {
                                obj2 = kotlin.Unit.a;
                            }
                        } else {
                            obj2 = kotlin.Unit.a;
                        }
                        if (obj2 == barVar15) {
                            return barVar15;
                        }
                        return kotlin.Unit.a;
                    }
                    od.p.E(obj);
                    f2 = obj;
                } else {
                    od.p.E(obj);
                    w91.a.a("CallerIdManager.showAfterCallScreen: show details view screen");
                    this.y = 1;
                    f2 = qVar.f(this);
                    if (f2 == barVar15) {
                        return barVar15;
                    }
                }
                com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource a3 = ((ac1.bar) yVar.e0.get()).a((java.lang.String) f2);
                kotlin.coroutines.CoroutineContext coroutineContext3 = yVar.c;
                a61.bar barVar16 = new a61.bar(yVar, (com.truecaller.data.entity.HistoryEvent) this.B, a3, (df3.bar) null, 17);
                this.y = 2;
                if (fg3.h0.W(coroutineContext3, barVar16, this) == barVar15) {
                    return barVar15;
                }
                cVar = (cu0.c) this.z;
                this.y = 3;
                if (cVar.l) {
                }
                if (obj2 == barVar15) {
                }
                return kotlin.Unit.a;
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                cu0.j0 j0Var3 = (cu0.j0) this.A;
                hw0.q qVar2 = j0Var3.t;
                ef3.bar barVar17 = ef3.bar.a;
                int i15 = this.y;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    f3 = obj;
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    f3 = qVar2.f(this);
                    if (f3 == barVar17) {
                        return barVar17;
                    }
                }
                com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource a4 = ((ac1.bar) j0Var3.e0.get()).a((java.lang.String) f3);
                cu0.e1 e1Var = j0Var3.b;
                com.truecaller.data.entity.HistoryEvent historyEvent = (com.truecaller.data.entity.HistoryEvent) this.B;
                e1Var.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
                fg3.h0.J(e1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a61.bar(e1Var, historyEvent, a4, (df3.bar) null, 19), 3);
                cu0.c cVar4 = (cu0.c) this.z;
                this.y = 2;
                if (!cVar4.l) {
                    obj3 = lk3.bar.q(qVar2.d(), new b63.qux(2, 23, (df3.bar) null), this);
                    if (obj3 != barVar17) {
                        obj3 = kotlin.Unit.a;
                    }
                    if (obj3 != barVar17) {
                        obj3 = kotlin.Unit.a;
                    }
                } else {
                    obj3 = kotlin.Unit.a;
                }
                if (obj3 == barVar17) {
                    return barVar17;
                }
                return kotlin.Unit.a;
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                ef3.bar barVar18 = ef3.bar.a;
                int i16 = this.y;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            j0Var = (cu0.j0) this.B;
                            aVar = (pg3.a) this.A;
                            od.p.E(obj);
                            try {
                                cVar2 = j0Var.k0;
                                if (cVar2 != null) {
                                    if (cVar2.a == 0 && !cVar2.m) {
                                        cVar3 = cVar2;
                                    } else {
                                        cVar3 = null;
                                    }
                                    if (cVar3 != null) {
                                        j0Var.k0 = cu0.c.a(cVar3, 3, (com.truecaller.data.entity.Number) null, 0, (java.lang.String) null, 0L, (com.truecaller.data.entity.Contact) null, (com.truecaller.blocking.FilterMatch) null, false, false, 0L, false, false, (java.lang.String) null, 1048574);
                                        j0Var.m();
                                    }
                                }
                                kotlin.Unit unit2 = kotlin.Unit.a;
                                aVar.h((java.lang.Object) null);
                                return kotlin.Unit.a;
                            } catch (java.lang.Throwable th2) {
                                aVar.h((java.lang.Object) null);
                                throw th2;
                            }
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    xf3.qux quxVar3 = xf3.a.b;
                    long H = fj.a.H(30L, xf3.c.d);
                    this.y = 1;
                    if (fg3.h0.s(H, this) == barVar18) {
                        return barVar18;
                    }
                }
                cu0.j0 j0Var4 = (cu0.j0) this.z;
                pg3.a aVar4 = j0Var4.l0;
                this.A = aVar4;
                this.B = j0Var4;
                this.y = 2;
                if (aVar4.d(this) != barVar18) {
                    j0Var = j0Var4;
                    aVar = aVar4;
                    cVar2 = j0Var.k0;
                    if (cVar2 != null) {
                    }
                    kotlin.Unit unit22 = kotlin.Unit.a;
                    aVar.h((java.lang.Object) null);
                    return kotlin.Unit.a;
                }
                return barVar18;
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                ef3.bar barVar19 = ef3.bar.a;
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    ig3.p1 p1Var2 = ((d53.k) this.A).d;
                    com.truecaller.call_assistant.presentation.onboarding.c cVar5 = new com.truecaller.call_assistant.presentation.onboarding.c((rb.e0) this.B, (kotlin.jvm.functions.Function0) this.z, 1);
                    this.y = 1;
                    if (p1Var2.a.collect(cVar5, this) == barVar19) {
                        return barVar19;
                    }
                }
                throw new java.lang.RuntimeException();
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                ef3.bar barVar20 = ef3.bar.a;
                int i18 = this.y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String str12 = (java.lang.String) this.A;
                    if (str12 != null) {
                        com.truecaller.service.DialerNumberLookupService dialerNumberLookupService = (com.truecaller.service.DialerNumberLookupService) this.B;
                        android.os.Bundle bundle = (android.os.Bundle) this.z;
                        ah.n nVar = dialerNumberLookupService.g;
                        if (nVar != null) {
                            kotlin.Pair K = nVar.K(str12);
                            com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) K.a;
                            com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) K.b;
                            if (contact != null && number != null) {
                                this.y = 1;
                                if (com.truecaller.service.DialerNumberLookupService.a(dialerNumberLookupService, bundle, contact, str12, number, this) == barVar20) {
                                    return barVar20;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("mLocalContactSearcher");
                            throw null;
                        }
                    }
                }
                return kotlin.Unit.a;
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                dr1.h hVar3 = (dr1.h) this.A;
                ef3.bar barVar21 = ef3.bar.a;
                int i19 = this.y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        od.p.E(obj);
                        obj4 = ((kotlin.q) obj).a;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ej.b bVar = hVar3.d;
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.B;
                    br1.baz bazVar2 = (br1.baz) this.z;
                    this.y = 1;
                    java.lang.Object o3 = bVar.o(bitmap, bazVar2, this);
                    if (o3 != barVar21) {
                        obj4 = o3;
                    } else {
                        return barVar21;
                    }
                }
                if (kotlin.q.a(obj4) == null) {
                    ig3.h2 h2Var2 = hVar3.e;
                    dr1.e eVar2 = new dr1.e((android.net.Uri) obj4);
                    h2Var2.getClass();
                    h2Var2.p((java.lang.Object) null, eVar2);
                    hVar3.b.h(com.truecaller.imagecropping.api.analytics.ImageCroppingAnalytics$ViewAction.CONFIRM_CROP);
                } else {
                    ig3.h2 h2Var3 = hVar3.e;
                    dr1.f fVar2 = new dr1.f(2132021703);
                    h2Var3.getClass();
                    h2Var3.p((java.lang.Object) null, fVar2);
                }
                return kotlin.Unit.a;
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                ef3.bar barVar22 = ef3.bar.a;
                int i20 = this.y;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    ig3.p1 p1Var3 = ((dt0.c) this.A).h;
                    bt0.b bVar2 = new bt0.b((r2.m6) this.B, (android.content.res.Resources) this.z, 1);
                    this.y = 1;
                    if (p1Var3.a.collect(bVar2, this) == barVar22) {
                        return barVar22;
                    }
                }
                throw new java.lang.RuntimeException();
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                dw0.qux quxVar4 = (dw0.qux) this.A;
                ef3.bar barVar23 = ef3.bar.a;
                int i21 = this.y;
                if (i21 != 0) {
                    if (i21 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (fg3.h0.r(200L, this) == barVar23) {
                        return barVar23;
                    }
                }
                quxVar4.dismiss();
                java.lang.Integer num = ((com.truecaller.calling.util.roaming.CallCountrySelectionManager.Action.BottomSheet) this.B).h;
                java.lang.String str13 = (java.lang.String) this.z;
                android.os.Bundle arguments = quxVar4.getArguments();
                if (arguments != null) {
                    barVar2 = java.lang.Boolean.valueOf(arguments.getBoolean("shouldDismissTapToPaste"));
                }
                android.os.Parcelable result = new com.truecaller.calling.util.roaming.CallCountrySelectionManager.Result(barVar2, num, str13);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelable("countrySelectionResult", result);
                kotlin.Unit unit3 = kotlin.Unit.a;
                quxVar4.getParentFragmentManager().g0(bundle2, "requestStartCall");
                return kotlin.Unit.a;
            case 20:
                java.lang.String str14 = (java.lang.String) this.z;
                dw0.e eVar3 = (dw0.e) this.B;
                t41.e0 e0Var2 = eVar3.g;
                com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil = eVar3.b;
                xu0.d dVar = eVar3.f;
                q81.b bVar3 = eVar3.d;
                y42.f fVar3 = eVar3.c;
                ef3.bar barVar24 = ef3.bar.a;
                int i22 = this.y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        od.p.E(obj);
                        b2 = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.Integer num2 = (java.lang.Integer) this.A;
                    if (num2 != null || (num2 = dVar.c()) != null) {
                        intValue = num2.intValue();
                        if (((qo1.e) eVar3.a).b.a("featureCallingRoamingPrefix", com.truecaller.featuretoggles.FeatureState.DISABLED) && !kotlin.text.y.w(str14, "+", false)) {
                            int intValue2 = new java.lang.Integer(intValue).intValue();
                            if (!eVar3.h.isNetworkRoaming()) {
                                com.truecaller.multisim.SimInfo o4 = fVar3.o(intValue2);
                                if (o4 != null) {
                                    bool = java.lang.Boolean.valueOf(o4.j);
                                } else {
                                    bool = null;
                                }
                                break;
                            }
                            java.lang.Integer num3 = new java.lang.Integer(intValue);
                            if (!eVar3.e.b(str14)) {
                                com.truecaller.multisim.SimInfo o5 = fVar3.o(num3.intValue());
                                if (o5 != null) {
                                    str = o5.b;
                                } else {
                                    str = null;
                                }
                                q81.c cVar6 = (q81.c) bVar3;
                                com.truecaller.data.entity.Number g2 = cVar6.g(str14, eVar3.a(str), true);
                                if (g2 != null) {
                                    phoneNumberType = g2.f();
                                } else {
                                    phoneNumberType = null;
                                }
                                com.truecaller.multisim.SimInfo o6 = fVar3.o(num3.intValue());
                                if (o6 != null) {
                                    str2 = o6.b;
                                } else {
                                    str2 = null;
                                }
                                com.truecaller.data.entity.Number g3 = cVar6.g(str14, eVar3.b(str2), true);
                                if (g3 != null) {
                                    phoneNumberType2 = g3.f();
                                } else {
                                    phoneNumberType2 = null;
                                }
                                com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType[] phoneNumberTypeArr = dw0.f.a;
                                if (kotlin.collections.v.z(phoneNumberTypeArr, phoneNumberType) || kotlin.collections.v.z(phoneNumberTypeArr, phoneNumberType2)) {
                                    com.truecaller.multisim.SimInfo o7 = fVar3.o(new java.lang.Integer(intValue).intValue());
                                    if (o7 != null) {
                                        str3 = o7.b;
                                    } else {
                                        str3 = null;
                                    }
                                    if (str3 != null) {
                                        str4 = eVar3.a(str3);
                                    } else {
                                        str4 = null;
                                    }
                                    if (str3 != null) {
                                        str5 = eVar3.b(str3);
                                    } else {
                                        str5 = null;
                                    }
                                    if (str4 != null && !kotlin.text.StringsKt.X(str4) && str5 != null && !kotlin.text.StringsKt.X(str5) && !str5.equals(str4)) {
                                        java.util.Locale locale = java.util.Locale.ROOT;
                                        java.lang.String upperCase = str5.toUpperCase(locale);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        int countryCodeForRegion = phoneNumberUtil.getCountryCodeForRegion(upperCase);
                                        java.lang.String upperCase2 = str4.toUpperCase(locale);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                        int countryCodeForRegion2 = phoneNumberUtil.getCountryCodeForRegion(upperCase2);
                                        com.truecaller.data.entity.Number g4 = ((q81.c) bVar3).g(str14, str5, true);
                                        com.truecaller.data.entity.Number g5 = ((q81.c) bVar3).g(str14, str4, true);
                                        if (g4 == null && g5 == null) {
                                            return new dw0.b(str14);
                                        }
                                        if (g4 != null) {
                                            str6 = g4.f;
                                        } else {
                                            str6 = null;
                                        }
                                        if (g5 != null) {
                                            str7 = g5.f;
                                        } else {
                                            str7 = null;
                                        }
                                        java.lang.String o8 = e0Var2.o(str14, str5);
                                        if (o8 == null) {
                                            if (g4 != null) {
                                                o8 = g4.f;
                                            } else {
                                                str8 = null;
                                                o2 = e0Var2.o(str14, str4);
                                                if (o2 != null) {
                                                    if (g5 != null) {
                                                        barVar2 = g5.f;
                                                    }
                                                    barVar = barVar2;
                                                } else {
                                                    barVar = o2;
                                                }
                                                return new com.truecaller.calling.util.roaming.CallCountrySelectionManager.Action.BottomSheet(str14, str6, str7, str8, barVar, java.lang.String.valueOf(countryCodeForRegion), java.lang.String.valueOf(countryCodeForRegion2), new java.lang.Integer(intValue));
                                            }
                                        }
                                        str8 = o8;
                                        o2 = e0Var2.o(str14, str4);
                                        if (o2 != null) {
                                        }
                                        return new com.truecaller.calling.util.roaming.CallCountrySelectionManager.Action.BottomSheet(str14, str6, str7, str8, barVar, java.lang.String.valueOf(countryCodeForRegion), java.lang.String.valueOf(countryCodeForRegion2), new java.lang.Integer(intValue));
                                    }
                                }
                            }
                        }
                        return new dw0.b(str14);
                    }
                    this.y = 1;
                    b2 = dVar.b(this);
                    if (b2 == barVar24) {
                        return barVar24;
                    }
                }
                intValue = ((java.lang.Number) b2).intValue();
                if (((qo1.e) eVar3.a).b.a("featureCallingRoamingPrefix", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    int intValue22 = new java.lang.Integer(intValue).intValue();
                    if (!eVar3.h.isNetworkRoaming()) {
                    }
                    java.lang.Integer num32 = new java.lang.Integer(intValue);
                    if (!eVar3.e.b(str14)) {
                    }
                }
                return new dw0.b(str14);
            case 21:
                ef3.bar barVar25 = ef3.bar.a;
                od.p.E(obj);
                try {
                    c62.q qVar3 = (c62.q) ((dq1.h) this.A).b;
                    java.util.UUID randomUUID = java.util.UUID.randomUUID();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                    c62.o c = ((c62.r) qVar3).c(randomUUID, "afterCall");
                    c.x = this.y;
                    c.y = (java.lang.String) this.B;
                    c.e((java.lang.String) this.z);
                    c62.v a5 = c.a();
                    if (a5 == null) {
                        return null;
                    }
                    com.truecaller.data.entity.Contact a6 = a5.a();
                    if (a6 != null && m03.r.q(a6)) {
                        z = true;
                    }
                    return new e00.g(z);
                } catch (e62.c e) {
                    java.lang.String str15 = e.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str15, "token");
                    return new e00.h(str15);
                } catch (java.io.IOException unused) {
                    return null;
                }
            case 22:
                ef3.bar barVar26 = ef3.bar.a;
                int i23 = this.y;
                if (i23 != 0) {
                    if (i23 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    k1.h hVar4 = (k1.h) this.A;
                    k1.i iVar = (k1.i) this.B;
                    this.y = 1;
                    if (hVar4.a(iVar, this) == barVar26) {
                        return barVar26;
                    }
                }
                fg3.t0 t0Var = (fg3.t0) this.z;
                if (t0Var != null) {
                    t0Var.dispose();
                }
                return kotlin.Unit.a;
            case 23:
                ef3.bar barVar27 = ef3.bar.a;
                int i24 = this.y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    k1.h hVar5 = (k1.h) this.A;
                    k1.g gVar3 = (k1.g) this.B;
                    this.y = 1;
                    if (hVar5.a(gVar3, this) == barVar27) {
                        return barVar27;
                    }
                }
                fg3.t0 t0Var2 = (fg3.t0) this.z;
                if (t0Var2 != null) {
                    t0Var2.dispose();
                }
                return kotlin.Unit.a;
            case 24:
                return c(obj);
            case 25:
                return f(obj);
            case 26:
                return g(obj);
            case 27:
                return j(obj);
            case 28:
                return k(obj);
            default:
                ef3.bar barVar28 = ef3.bar.a;
                int i25 = this.y;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    ig3.p1 p1Var4 = ((go2.v1) this.A).h;
                    ag2.e eVar4 = new ag2.e(23, (r2.d6) this.B, (android.content.Context) this.z);
                    this.y = 1;
                    if (p1Var4.a.collect(eVar4, this) == barVar28) {
                        return barVar28;
                    }
                }
                throw new java.lang.RuntimeException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dq1.h hVar, int i, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        super(2, barVar);
        this.x = 21;
        this.A = hVar;
        this.y = i;
        this.B = str;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(java.lang.Object obj, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(java.lang.Object obj, java.lang.Object obj2, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.B = obj;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = obj;
        this.B = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.functions.Function1 function1, com.truecaller.rewardprogram.impl.ui.qa.j jVar, java.lang.String str, df3.bar barVar) {
        super(2, barVar);
        this.x = 4;
        this.A = (ff3.g) function1;
        this.B = jVar;
        this.z = str;
    }
}
