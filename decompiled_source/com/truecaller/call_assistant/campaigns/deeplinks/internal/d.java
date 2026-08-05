package com.truecaller.call_assistant.campaigns.deeplinks.internal;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int x;
    public final /* synthetic */ com.truecaller.call_assistant.campaigns.deeplinks.internal.e y;
    public final /* synthetic */ com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.truecaller.call_assistant.campaigns.deeplinks.internal.e eVar, com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult actionResult, df3.bar barVar) {
        super(2, barVar);
        this.y = eVar;
        this.z = actionResult;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.call_assistant.campaigns.deeplinks.internal.d(this.y, this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            wm0.bar barVar2 = this.y.a;
            java.lang.String str = ((com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Skip) this.z).a;
            this.x = 1;
            if (barVar2.D(str, this) == barVar) {
                return barVar;
            }
        }
        return kotlin.Unit.a;
    }
}
