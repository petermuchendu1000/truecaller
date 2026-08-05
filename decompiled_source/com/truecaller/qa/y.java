package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class y extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int x;
    public final /* synthetic */ wt.l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(wt.l lVar, df3.bar barVar, int i) {
        super(1, barVar);
        this.x = i;
        this.y = lVar;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.qa.y(this.y, barVar, 0);
            case 1:
                return new com.truecaller.qa.y(this.y, barVar, 1);
            default:
                return new com.truecaller.qa.y(this.y, barVar, 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        wt.l lVar = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                ((ga1.e) lVar.c).o();
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                mi2.baz bazVar = new mi2.baz();
                androidx.fragment.app.FragmentActivity fragmentActivity = (android.content.Context) lVar.a;
                lVar.getClass();
                kotlin.jvm.internal.Intrinsics.e(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.g1 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                bazVar.show(supportFragmentManager, "qa_identified_contacts_notification");
                return kotlin.Unit.a;
            default:
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                ye0.e0.T((android.content.Context) lVar.a);
                return kotlin.Unit.a;
        }
    }
}
