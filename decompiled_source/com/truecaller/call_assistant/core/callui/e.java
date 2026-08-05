package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e extends ff3.g implements kotlin.jvm.functions.Function2 {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ oo0.bar y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(oo0.bar barVar, df3.bar barVar2) {
        super(2, barVar2);
        this.y = barVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        com.truecaller.call_assistant.core.callui.e eVar = new com.truecaller.call_assistant.core.callui.e(this.y, barVar);
        eVar.x = obj;
        return eVar;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((com.truecaller.call_assistant.core.callui.AssistantCallState) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        oo0.bar barVar = this.y;
        no0.qux quxVar = barVar.c;
        no0.bar barVar2 = (no0.bar) barVar.d;
        com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState = (com.truecaller.call_assistant.core.callui.AssistantCallState) this.x;
        ef3.bar barVar3 = ef3.bar.a;
        od.p.E(obj);
        if (kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.None.INSTANCE)) {
            return kotlin.Unit.a;
        }
        if (kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming.INSTANCE)) {
            ((no0.baz) barVar2).a();
            android.os.Vibrator vibrator = quxVar.a;
            if (vibrator.hasVibrator() && quxVar.b.getRingerMode() != 0) {
                m03.n.z(vibrator, m03.n.l(new long[]{1000, 1000}), new android.media.AudioAttributes.Builder().setContentType(4).setUsage(6).build());
            }
        } else if (!kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.Error.INSTANCE) && !kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.Disconnected.INSTANCE)) {
            ((no0.baz) barVar2).c();
            quxVar.a();
        } else {
            fg3.h0.J(barVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(barVar, (df3.bar) null, 2), 3);
        }
        return kotlin.Unit.a;
    }
}
