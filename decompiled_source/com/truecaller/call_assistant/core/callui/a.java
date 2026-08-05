package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a implements ig3.j {
    public final /* synthetic */ com.truecaller.call_assistant.core.callui.c a;

    public a(com.truecaller.call_assistant.core.callui.c cVar) {
        this.a = cVar;
    }

    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        com.truecaller.incallui.service.CallState callState = (com.truecaller.incallui.service.CallState) obj;
        java.util.Objects.toString(callState);
        w91.a.a(new java.lang.Object[]{"PSTN callManager.callStateFlow callState: " + callState});
        if (callState == com.truecaller.incallui.service.CallState.STATE_RINGING) {
            com.truecaller.call_assistant.core.callui.c cVar = this.a;
            for (rr1.m0 m0Var : (java.lang.Iterable) cVar.n.P.getValue()) {
                java.lang.String s = j0.b.s(m0Var);
                if (s != null) {
                    w91.a.a(new java.lang.Object[]{k9.d.r("PSTN callManager call.getPhoneNumber(): ", s, "; pstnCallerNumber: ", cVar.M)});
                    java.lang.String str = cVar.M;
                    if (str != null && m0Var.c == com.truecaller.calling_common.utils.CallType.INCOMING && kotlin.jvm.internal.Intrinsics.b(new com.truecaller.data.entity.Number(s, (java.lang.String) null).d(), new com.truecaller.data.entity.Number(str, (java.lang.String) null).d())) {
                        cVar.r(com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerWhenDefaultDialer.INSTANCE);
                        fg3.k2 k2Var = cVar.L;
                        if (k2Var != null) {
                            k2Var.cancel((java.util.concurrent.CancellationException) null);
                        }
                        fg3.k2 k2Var2 = cVar.Q;
                        if (k2Var2 != null) {
                            k2Var2.cancel((java.util.concurrent.CancellationException) null);
                        }
                        fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rn0.b(cVar, null, 1), 3);
                    }
                }
            }
        }
        return kotlin.Unit.a;
    }
}
