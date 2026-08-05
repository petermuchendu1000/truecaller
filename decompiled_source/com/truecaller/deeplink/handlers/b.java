package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int x;
    public final /* synthetic */ tx.w y;
    public final /* synthetic */ android.content.Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tx.w wVar, android.content.Context context, df3.bar barVar) {
        super(2, barVar);
        this.y = wVar;
        this.z = context;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.deeplink.handlers.b(this.y, this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        android.content.Context context = this.z;
        tx.w wVar = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            if (((qo1.g) ((qo1.f) wVar.X5.get())).b()) {
                j01.n nVar = (j01.n) cd3.baz.a(wVar.Zn).get();
                this.x = 1;
                java.lang.Object g = nVar.a.g(this);
                if (g != barVar) {
                    g = kotlin.Unit.a;
                }
                if (g == barVar) {
                    return barVar;
                }
            } else {
                wVar.z0().e(context).d();
                return kotlin.Unit.a;
            }
        }
        f6.k1 e = wVar.z0().e(context);
        e.a.add(((kp1.bar) cd3.baz.a(wVar.Ml).get()).a(context, com.truecaller.floatingtoolbar.api.CallHistoryTab$Type.Recordings).putExtra("subview", "SHOW_LATEST_RECORDING_TRANSCRIPTION"));
        e.d();
        return kotlin.Unit.a;
    }
}
