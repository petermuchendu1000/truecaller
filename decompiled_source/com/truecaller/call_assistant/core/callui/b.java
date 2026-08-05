package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b implements ig3.j {
    public final /* synthetic */ com.truecaller.call_assistant.core.callui.c a;

    public b(com.truecaller.call_assistant.core.callui.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(h13.a aVar, df3.bar barVar) {
        rn0.j jVar;
        int i;
        java.lang.String str;
        com.truecaller.call_assistant.core.callui.c cVar;
        fg3.k2 k2Var;
        if (barVar instanceof rn0.j) {
            jVar = (rn0.j) barVar;
            int i2 = jVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = jVar.y;
                ef3.bar barVar2 = ef3.bar.a;
                i = jVar.A;
                if (i == 0) {
                    if (i == 1) {
                        cVar = jVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.util.Objects.toString(aVar);
                    w91.a.a(new java.lang.Object[]{"PSTN telephonyUtil callState: " + aVar});
                    if (aVar instanceof h13.qux) {
                        java.lang.String str2 = ((h13.qux) aVar).b;
                        com.truecaller.call_assistant.core.callui.c cVar2 = this.a;
                        w91.a.a(new java.lang.Object[]{k9.d.r("PSTN telephonyUtil Ringing call.getPhoneNumber(): ", str2, "; pstnCallerNumber: ", cVar2.M)});
                        if (str2 != null && (str = cVar2.M) != null && kotlin.jvm.internal.Intrinsics.b(new com.truecaller.data.entity.Number(str2, (java.lang.String) null).d(), new com.truecaller.data.entity.Number(str, (java.lang.String) null).d())) {
                            fg3.k2 k2Var2 = cVar2.L;
                            if (k2Var2 != null) {
                                k2Var2.cancel((java.util.concurrent.CancellationException) null);
                            }
                            no0.a aVar2 = cVar2.m;
                            aVar2.getClass();
                            try {
                                if (android.os.Build.VERSION.SDK_INT < 28) {
                                    android.telephony.TelephonyManager telephonyManager = aVar2.a;
                                    try {
                                        java.lang.reflect.Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getITelephony", null);
                                        declaredMethod.setAccessible(true);
                                        java.lang.Object invoke = declaredMethod.invoke(telephonyManager, null);
                                        if (invoke != null) {
                                            java.lang.reflect.Method declaredMethod2 = invoke.getClass().getDeclaredMethod("answerRingingCall", null);
                                            declaredMethod2.setAccessible(true);
                                            declaredMethod2.invoke(invoke, null);
                                        }
                                    } catch (java.lang.Exception unused) {
                                        java.lang.reflect.Method declaredMethod3 = telephonyManager.getClass().getDeclaredMethod("getITelephonyMSim", null);
                                        declaredMethod3.setAccessible(true);
                                        java.lang.Object invoke2 = declaredMethod3.invoke(telephonyManager, null);
                                        if (invoke2 != null && kotlin.jvm.internal.Intrinsics.b(no0.a.a(invoke2, 0), java.lang.Boolean.FALSE)) {
                                            no0.a.a(invoke2, 1);
                                        }
                                    }
                                } else {
                                    m03.n.A(aVar2.b);
                                }
                            } catch (java.lang.Exception unused2) {
                            }
                            cVar2.r(com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerNonDefaultDialer.INSTANCE);
                            no0.c cVar3 = cVar2.H;
                            jVar.x = cVar2;
                            jVar.A = 1;
                            if (cVar3.a(jVar) == barVar2) {
                                return barVar2;
                            }
                            cVar = cVar2;
                        }
                    }
                    return kotlin.Unit.a;
                }
                k2Var = cVar.Q;
                if (k2Var != null) {
                    k2Var.cancel((java.util.concurrent.CancellationException) null);
                }
                fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rn0.b(cVar, null, 1), 3);
                return kotlin.Unit.a;
            }
        }
        jVar = new rn0.j(this, barVar);
        java.lang.Object obj2 = jVar.y;
        ef3.bar barVar22 = ef3.bar.a;
        i = jVar.A;
        if (i == 0) {
        }
        k2Var = cVar.Q;
        if (k2Var != null) {
        }
        fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rn0.b(cVar, null, 1), 3);
        return kotlin.Unit.a;
    }
}
