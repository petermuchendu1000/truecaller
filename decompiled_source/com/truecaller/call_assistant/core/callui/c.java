package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements rn0.bar, fg3.e0, kn0.f, kn0.d {
    public final rn0.m A;
    public final kn0.f B;
    public final kn0.d C;
    public final kn0.c D;
    public final kn0.i E;
    public final a53.bar F;
    public final un0.baz G;
    public final no0.c H;
    public final kotlin.Lazy I;
    public final kotlin.Lazy J;
    public final kotlin.Lazy K;
    public fg3.k2 L;
    public java.lang.String M;
    public final ig3.h2 N;
    public final ig3.h2 O;
    public final ig3.v1 P;
    public fg3.k2 Q;
    public android.net.Uri R;
    public boolean S;
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final kotlin.coroutines.CoroutineContext c;
    public final pr0.e1 d;
    public final lu0.baz e;
    public final cn0.bar f;
    public final rn0.u g;
    public final rn0.s h;
    public final q81.b i;
    public final nu0.a j;
    public final un0.bar k;
    public final com.truecaller.qa.x l;
    public final no0.a m;
    public final rr1.n n;
    public final ir1.e o;
    public final j21.a p;
    public final h13.c q;
    public final wj2.qux r;
    public final u03.b0 s;
    public final zy.f t;
    public final uk2.t u;
    public final mr0.t v;
    public final le2.v w;
    public final qo1.b x;
    public final ep0.bar y;
    public final uk2.q z;

    public c(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, pr0.e1 e1Var, lu0.baz bazVar, cn0.bar barVar, rn0.u uVar, rn0.s sVar, q81.b bVar, nu0.a aVar, un0.bar barVar2, com.truecaller.qa.x xVar, no0.a aVar2, rr1.n nVar, ir1.e eVar, j21.a aVar3, h13.c cVar, wj2.qux quxVar, u03.b0 b0Var, zy.f fVar, uk2.t tVar, mr0.t tVar2, le2.v vVar, qo1.b bVar2, ep0.bar barVar3, uk2.q qVar, rn0.m mVar, kn0.f fVar2, kn0.d dVar, kn0.c cVar2, kn0.i iVar, a53.bar barVar4, un0.baz bazVar2, no0.c cVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e1Var, "screenedCallsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "callerInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "assistantAcsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uVar, "proximityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "hapticFeedbackManagerProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "numberProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "historyManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "callCompletedNotification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "qaSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "callAnswerer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "callManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "inCallUIConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar3, "pstnContactUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "telephonyUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "configsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "temporarilySkipAcsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "quickResponseRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar2, "customizeQuickResponseNotification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "assistantNavigator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "featuresInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "assistantScreenCallMessageNotification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "pushTransformer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "notificationMetaDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar2, "callUiStateManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "assistantCallSettingDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar2, "acceptCallDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "screenedCallRecordingDownloadWorkerDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "assistantDownloadRecordingServiceDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "assistantNotificationDisplayResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar3, "inCallScreenShower");
        this.a = context;
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = e1Var;
        this.e = bazVar;
        this.f = barVar;
        this.g = uVar;
        this.h = sVar;
        this.i = bVar;
        this.j = aVar;
        this.k = barVar2;
        this.l = xVar;
        this.m = aVar2;
        this.n = nVar;
        this.o = eVar;
        this.p = aVar3;
        this.q = cVar;
        this.r = quxVar;
        this.s = b0Var;
        this.t = fVar;
        this.u = tVar;
        this.v = tVar2;
        this.w = vVar;
        this.x = bVar2;
        this.y = barVar3;
        this.z = qVar;
        this.A = mVar;
        this.B = fVar2;
        this.C = dVar;
        this.D = cVar2;
        this.E = iVar;
        this.F = barVar4;
        this.G = bazVar2;
        this.H = cVar3;
        final int i = 0;
        this.I = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: rn0.qux
            public final /* synthetic */ com.truecaller.call_assistant.core.callui.c b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.lang.String str;
                switch (i) {
                    case 0:
                        return java.lang.Boolean.valueOf(this.b.x.a());
                    case 1:
                        return (oo0.bar) this.b.h.f.getValue();
                    default:
                        rn0.m mVar2 = this.b.A;
                        s62.f fVar3 = mVar2.b;
                        if (mVar2.a.a()) {
                            str = "incoming_calls";
                        } else {
                            str = "phone_calls";
                        }
                        return fVar3.o(str);
                }
            }
        });
        final int i2 = 1;
        this.J = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: rn0.qux
            public final /* synthetic */ com.truecaller.call_assistant.core.callui.c b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.lang.String str;
                switch (i2) {
                    case 0:
                        return java.lang.Boolean.valueOf(this.b.x.a());
                    case 1:
                        return (oo0.bar) this.b.h.f.getValue();
                    default:
                        rn0.m mVar2 = this.b.A;
                        s62.f fVar3 = mVar2.b;
                        if (mVar2.a.a()) {
                            str = "incoming_calls";
                        } else {
                            str = "phone_calls";
                        }
                        return fVar3.o(str);
                }
            }
        });
        final int i3 = 2;
        this.K = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: rn0.qux
            public final /* synthetic */ com.truecaller.call_assistant.core.callui.c b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.lang.String str;
                switch (i3) {
                    case 0:
                        return java.lang.Boolean.valueOf(this.b.x.a());
                    case 1:
                        return (oo0.bar) this.b.h.f.getValue();
                    default:
                        rn0.m mVar2 = this.b.A;
                        s62.f fVar3 = mVar2.b;
                        if (mVar2.a.a()) {
                            str = "incoming_calls";
                        } else {
                            str = "phone_calls";
                        }
                        return fVar3.o(str);
                }
            }
        });
        this.N = ig3.w1.c(com.truecaller.call_assistant.core.callui.AssistantCallState.None.INSTANCE);
        this.O = ig3.w1.c((java.lang.Object) null);
        this.P = ig3.w1.b(0, 1, (hg3.bar) null, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object l(com.truecaller.call_assistant.core.callui.c cVar, java.lang.String str, ff3.qux quxVar) {
        rn0.c cVar2;
        int i;
        if (quxVar instanceof rn0.c) {
            cVar2 = (rn0.c) quxVar;
            int i2 = cVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar2.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = cVar2.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            com.truecaller.call_assistant.core.data.SendResponseActionResponseDto sendResponseActionResponseDto = (com.truecaller.call_assistant.core.data.SendResponseActionResponseDto) obj;
                            if (sendResponseActionResponseDto != null && sendResponseActionResponseDto.getSuccess()) {
                                cVar.u();
                            }
                            return sendResponseActionResponseDto;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = cVar2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    cVar2.x = str;
                    cVar2.A = 1;
                    obj = cVar.s(cVar2);
                }
                cVar2.x = null;
                cVar2.A = 2;
                obj = cVar.z(str, (java.lang.String) obj, cVar2);
            }
        }
        cVar2 = new rn0.c(cVar, quxVar);
        java.lang.Object obj3 = cVar2.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = cVar2.A;
        if (i == 0) {
        }
        cVar2.x = null;
        cVar2.A = 2;
        obj3 = cVar.z(str, (java.lang.String) obj3, cVar2);
    }

    public static final void m(com.truecaller.call_assistant.core.callui.c cVar) {
        android.net.Uri uri = cVar.R;
        if (uri != null) {
            j21.a aVar = cVar.p;
            aVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            try {
                aVar.b.delete(uri, null, null);
            } catch (android.content.OperationApplicationException e) {
                e.toString();
            } catch (android.os.RemoteException e2) {
                e2.toString();
            }
        }
    }

    public static final void n(com.truecaller.call_assistant.core.callui.c cVar) {
        fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.core.callui.bar(cVar, true, (com.truecaller.call_assistant.core.callui.AssistantCallState) cVar.N.getValue(), null, null), 3);
        cVar.r(com.truecaller.call_assistant.core.callui.AssistantCallState.Error.INSTANCE);
        cVar.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object o(com.truecaller.call_assistant.core.callui.c cVar, java.lang.String str, java.lang.String str2, ff3.qux quxVar) {
        rn0.h hVar;
        int i;
        if (quxVar instanceof rn0.h) {
            hVar = (rn0.h) quxVar;
            int i2 = hVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = hVar.A;
                if (i == 0) {
                    if (i == 1) {
                        cVar = hVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (str2 != null) {
                        if (str == null) {
                            str = cVar.s.h(2132017481, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                        }
                        j21.a aVar = cVar.p;
                        com.truecaller.data.entity.Number number = new com.truecaller.data.entity.Number(str2, (java.lang.String) null);
                        hVar.x = cVar;
                        hVar.A = 1;
                        obj = aVar.a(number, str, (java.lang.Integer) null, hVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return kotlin.Unit.a;
                }
                cVar.R = (android.net.Uri) obj;
                return kotlin.Unit.a;
            }
        }
        hVar = new rn0.h(cVar, quxVar);
        java.lang.Object obj3 = hVar.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = hVar.A;
        if (i == 0) {
        }
        cVar.R = (android.net.Uri) obj3;
        return kotlin.Unit.a;
    }

    public static void q(com.truecaller.call_assistant.core.callui.c cVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        ig3.h2 h2Var = cVar.O;
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) h2Var.getValue();
        if (screenedCall != null) {
            h2Var.o(com.truecaller.call_assistant.core.data.ScreenedCall.copy$default(screenedCall, null, null, null, null, 0, null, "completed", str, false, null, null, null, null, null, null, false, null, 130879, null));
            pr0.e1 e1Var = cVar.d;
            java.lang.String id = screenedCall.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "callId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "terminationReason");
            str3 = null;
            fg3.h0.J(e1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ce2.i(str2, id, e1Var, (java.lang.Object) null, str, (df3.bar) null, 11), 3);
        } else {
            str3 = null;
        }
        v(cVar, str3, str2, 3);
    }

    public static void v(com.truecaller.call_assistant.core.callui.c cVar, java.lang.String str, java.lang.String str2, int i) {
        boolean z;
        java.lang.String str3;
        java.lang.String str4;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        df3.bar barVar = null;
        if ((i & 2) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        cVar.S = false;
        ig3.h2 h2Var = cVar.O;
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) h2Var.getValue();
        if (screenedCall != null) {
            fg3.h0.J(cVar, cVar.c, (fg3.f0) null, new rn0.f(cVar, screenedCall, barVar, 0), 2);
        }
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall2 = (com.truecaller.call_assistant.core.data.ScreenedCall) h2Var.getValue();
        if (screenedCall2 != null && str4 != null) {
            un0.baz bazVar = cVar.G;
            java.lang.String terminationReason = screenedCall2.getTerminationReason();
            if (bazVar.a.a() || (terminationReason != null && (terminationReason.equals("caller_hungup") || terminationReason.equals("caller_timeout") || terminationReason.equals("voicemail")))) {
                un0.bar barVar2 = cVar.k;
                java.lang.String str5 = (java.lang.String) cVar.K.getValue();
                barVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenedCall2, com.truecaller.account.network.TokenResponseDto.METHOD_CALL);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "pushBody");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "notificationChannelId");
                fg3.h0.J(barVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ms1.g(barVar2, screenedCall2, str5, str3, str4, (df3.bar) null), 3);
            }
        }
        mr0.t tVar = cVar.v;
        fg3.h0.J(tVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mc.b(tVar, (df3.bar) null, 7), 3);
        fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.core.callui.bar(cVar, z, (com.truecaller.call_assistant.core.callui.AssistantCallState) cVar.N.getValue(), str4, null), 3);
        cVar.r(com.truecaller.call_assistant.core.callui.AssistantCallState.Disconnected.INSTANCE);
        cVar.y();
    }

    public final void A(com.truecaller.call_assistant.core.data.ScreenedCall screenedCall) {
        java.lang.String fromNumber = screenedCall.getFromNumber();
        df3.bar barVar = null;
        if (!this.S) {
            this.S = true;
            fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rn0.g(this, fromNumber, null), 3);
        }
        ig3.f2 h = this.B.h();
        com.truecaller.call_assistant.core.callui.f fVar = (com.truecaller.call_assistant.core.callui.f) this.g;
        fVar.getClass();
        ig3.h2 h2Var = this.N;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2Var, "callStates");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "callUiState");
        ig3.w1.F(new androidx.room.o(25, h2Var, new rn0.v(fVar, h2Var, h, barVar, 0)), fVar);
        ig3.w1.F(new androidx.room.o(25, h, new rn0.v(fVar, h2Var, h, barVar, 1)), fVar);
        oo0.bar barVar2 = (oo0.bar) this.J.getValue();
        switch (barVar2.a) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2Var, "callStates");
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2Var, "callStates");
                ig3.w1.F(new androidx.room.o(25, h2Var, new com.truecaller.call_assistant.core.callui.e(barVar2, null)), barVar2);
                return;
        }
    }

    @Override // kn0.d
    public final ig3.f2 a() {
        return this.C.a();
    }

    @Override // kn0.d
    public final void b(boolean z) {
        this.C.b(z);
    }

    @Override // kn0.d
    public final boolean c() {
        return this.C.c();
    }

    @Override // kn0.d
    public final boolean d() {
        return this.C.d();
    }

    @Override // kn0.d
    public final java.lang.Long e() {
        return this.C.e();
    }

    @Override // kn0.d
    public final void f() {
        this.C.f();
    }

    @Override // kn0.f
    public final void g(com.truecaller.call_assistant.core.callui.AssistantCallUiState assistantCallUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCallUiState, "newState");
        this.B.g(assistantCallUiState);
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // kn0.f
    public final ig3.f2 h() {
        return this.B.h();
    }

    @Override // kn0.d
    public final void i(boolean z) {
        this.C.i(z);
    }

    public final void j() {
        java.lang.String str;
        fg3.k2 k2Var = this.L;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        r(com.truecaller.call_assistant.core.callui.AssistantCallState.Connecting.INSTANCE);
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) this.O.getValue();
        if (screenedCall != null) {
            str = screenedCall.getId();
        } else {
            str = null;
        }
        kn0.c cVar = this.D;
        cVar.getClass();
        ig3.w1.F(new androidx.room.o(25, new ig3.r1(new kk1.c0(str, cVar, (df3.bar) null, 5)), new p62.a(this, (df3.bar) null, 27)), this);
    }

    public final void k(java.lang.String str) {
        fg3.k2 k2Var = this.L;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        this.L = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rn0.b(this, null, 0), 3);
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q7.f(this, str, (df3.bar) null, 18), 3);
    }

    public final void p(com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason chatMessage$TerminationReason, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatMessage$TerminationReason, "terminationReason");
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) this.O.getValue();
        java.lang.String str3 = null;
        if (screenedCall != null) {
            str2 = screenedCall.getStatus();
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.b(str2, "completed")) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatMessage$TerminationReason, "<this>");
        switch (ro0.l.b[chatMessage$TerminationReason.ordinal()]) {
            case 1:
                str3 = "caller_hungup";
                break;
            case 2:
                str3 = "caller_timeout";
                break;
            case 3:
                str3 = "user_hungup";
                break;
            case 4:
                str3 = "user_timeout";
                break;
            case 5:
                str3 = "answered";
                break;
            case 6:
                break;
            default:
                throw new java.lang.RuntimeException();
        }
        if (str3 == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("UNRECOGNIZED termination reason, can't be saved to db");
        } else {
            q(this, str3, str);
        }
    }

    public final void r(com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState) {
        this.N.o(assistantCallState);
    }

    @Override // kn0.d
    public final void reset() {
        this.C.reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s(ff3.qux quxVar) {
        rn0.d dVar;
        int i;
        ao0.qux quxVar2;
        java.lang.String str;
        java.lang.Object obj;
        if (quxVar instanceof rn0.d) {
            dVar = (rn0.d) quxVar;
            int i2 = dVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = dVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = dVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj2);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj2);
                    dVar.z = 1;
                    obj2 = this.u.q(dVar);
                    if (obj2 == barVar) {
                        return barVar;
                    }
                }
                quxVar2 = (ao0.qux) obj2;
                str = null;
                if (quxVar2 != null) {
                    java.util.Iterator it = quxVar2.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((ao0.bar) obj).a == 7) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    ao0.bar barVar2 = (ao0.bar) obj;
                    if (barVar2 != null) {
                        str = barVar2.b;
                    }
                }
                if (str != null) {
                    return "";
                }
                return str;
            }
        }
        dVar = new rn0.d(this, quxVar);
        java.lang.Object obj22 = dVar.x;
        ef3.bar barVar3 = ef3.bar.a;
        i = dVar.z;
        if (i == 0) {
        }
        quxVar2 = (ao0.qux) obj22;
        str = null;
        if (quxVar2 != null) {
        }
        if (str != null) {
        }
    }

    public final boolean t() {
        return ((java.lang.Boolean) this.I.getValue()).booleanValue();
    }

    public final void u() {
        ig3.h2 h2Var = this.O;
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) h2Var.getValue();
        if (screenedCall != null) {
            h2Var.o(com.truecaller.call_assistant.core.data.ScreenedCall.copy$default(screenedCall, null, null, null, null, 0, null, "answered", "answered", false, null, null, null, null, null, null, false, null, 130879, null));
            java.lang.String id = screenedCall.getId();
            pr0.e1 e1Var = this.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "callId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("answered", "status");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("answered", "terminationReason");
            fg3.h0.J(e1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new pr0.p0(id, e1Var, (df3.bar) null, 4), 3);
        }
    }

    public final void w(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "text");
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.core.callui.baz(this, str, i, str3, str2, z, null), 3);
        ((oo0.bar) this.J.getValue()).b();
    }

    public final void x(t80.g gVar) {
        kotlin.Pair pair;
        rn0.p pVar;
        rn0.n nVar;
        java.lang.String str;
        java.lang.String a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "push");
        if (!(this.N.getValue() instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Screening)) {
            return;
        }
        oo0.bar barVar = (oo0.bar) this.J.getValue();
        switch (barVar.a) {
            case 0:
                fg3.h0.J(barVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nm1.i2(barVar, (df3.bar) null, 7), 3);
                break;
        }
        if (gVar instanceof fr0.baz) {
            java.lang.Object value = this.e.h.getValue();
            if (value instanceof rn0.p) {
                pVar = (rn0.p) value;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                nVar = pVar.a;
            } else {
                nVar = null;
            }
            fr0.baz bazVar = (fr0.baz) gVar;
            uk2.q qVar = this.z;
            android.content.Context context = (android.content.Context) qVar.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "push");
            if (bazVar.h == com.truecaller.call_assistant.core.callui.v2.chat.MessageType.ASSISTANT) {
                a = context.getString(2132017400);
            } else {
                po0.baz bazVar2 = (po0.baz) qVar.c;
                if (nVar != null) {
                    if (nVar.h) {
                        nVar = null;
                    }
                    if (nVar != null) {
                        str = nVar.b;
                        a = bazVar2.a(str);
                    }
                }
                str = null;
                a = bazVar2.a(str);
            }
            kotlin.jvm.internal.Intrinsics.d(a);
            java.lang.String string = context.getString(2132017399, a);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            java.lang.String o0 = bazVar.i.o0();
            if (o0 == null) {
                o0 = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o0, "body");
            pair = new kotlin.Pair(string, o0);
        } else if (gVar instanceof fr0.bar) {
            com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload screenCallAlertPayload = ((fr0.bar) gVar).i;
            pair = new kotlin.Pair(screenCallAlertPayload.getTitle(), screenCallAlertPayload.getBody());
        } else {
            throw new java.lang.RuntimeException();
        }
        java.lang.String str2 = (java.lang.String) pair.a;
        java.lang.String str3 = (java.lang.String) pair.b;
        java.lang.String m = gVar.m();
        java.lang.String str4 = (java.lang.String) this.K.getValue();
        ep0.bar barVar2 = this.y;
        barVar2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "pushTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "pushBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "channelId");
        fg3.h0.J(barVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a63.w(barVar2, str4, str2, str3, (df3.bar) null, 27), 3);
    }

    public final void y() {
        java.lang.String id;
        fg3.k2 k2Var = this.L;
        df3.bar barVar = null;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) this.O.getValue();
        if (screenedCall != null && (id = screenedCall.getId()) != null) {
            pr0.e1 e1Var = this.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "callId");
            fg3.h0.J(e1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new pr0.p0(e1Var, id, barVar, 0), 3);
        }
        this.C.reset();
        android.os.PowerManager.WakeLock wakeLock = ((com.truecaller.call_assistant.core.callui.f) this.g).b.a;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        oo0.bar barVar2 = (oo0.bar) this.J.getValue();
        switch (barVar2.a) {
            case 0:
                fg3.h0.J(barVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new oi2.e(barVar2, (df3.bar) null, 3), 3);
                break;
            default:
                fg3.h0.J(barVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new qd1.b(barVar2, (df3.bar) null, 16), 3);
                break;
        }
        rn0.baz.a = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object z(java.lang.String str, java.lang.String str2, ff3.qux quxVar) {
        rn0.i iVar;
        int i;
        if (quxVar instanceof rn0.i) {
            iVar = (rn0.i) quxVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = iVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return (com.truecaller.call_assistant.core.data.SendResponseActionResponseDto) obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    return (com.truecaller.call_assistant.core.data.SendResponseActionResponseDto) obj;
                }
                od.p.E(obj);
                boolean t = t();
                pr0.e1 e1Var = this.d;
                if (t) {
                    iVar.z = 1;
                    obj = e1Var.n(str, iVar);
                } else {
                    iVar.z = 2;
                    obj = fg3.h0.W(e1Var.b, new fl2.d(str, str2, e1Var, 7, (java.lang.Object) null, (df3.bar) null, 10), iVar);
                }
                return barVar;
            }
        }
        iVar = new rn0.i(this, quxVar);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
    }
}
