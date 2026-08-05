package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int x;
    public final /* synthetic */ tx.w y;
    public final /* synthetic */ android.content.Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bar(tx.w wVar, android.content.Context context, df3.bar barVar) {
        super(2, barVar);
        this.y = wVar;
        this.z = context;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.deeplink.handlers.bar(this.y, this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        tx.w wVar = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            oz0.baz bazVar = (oz0.baz) wVar.H.b.z2.get();
            this.x = 1;
            obj = bazVar.a(this);
            if (obj == barVar) {
                return barVar;
            }
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Context context = this.z;
        if (booleanValue) {
            f6.k1 e = wVar.z0().e(context);
            int i2 = com.truecaller.ai_voice_detection.ui.discovery.AiVoiceDetectionDiscoveryActivity.e0;
            e.a.add(h6.e.u0(context, (java.lang.String) null, (java.lang.String) null, false));
            e.d();
        } else {
            wVar.z0().e(context).d();
        }
        return kotlin.Unit.a;
    }
}
