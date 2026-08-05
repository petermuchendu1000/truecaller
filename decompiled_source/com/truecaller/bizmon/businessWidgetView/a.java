package com.truecaller.bizmon.businessWidgetView;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.e x;
    public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.truecaller.bizmon.businessWidgetView.e eVar, com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig, df3.bar barVar) {
        super(2, barVar);
        this.x = eVar;
        this.y = bizMultiViewConfig;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.bizmon.businessWidgetView.a(this.x, this.y, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        r23.v vVar = (r23.v) this.x.h.get();
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig) this.y;
        com.truecaller.data.entity.Contact contact = bizViewAcsConfig.a;
        java.lang.String str = bizViewAcsConfig.b;
        return vVar.a(contact);
    }
}
