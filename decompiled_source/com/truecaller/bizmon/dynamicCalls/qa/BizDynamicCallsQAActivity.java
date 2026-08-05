package com.truecaller.bizmon.dynamicCalls.qa;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/bizmon/dynamicCalls/qa/BizDynamicCallsQAActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lfg3/e0;", "<init>", "()V", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizDynamicCallsQAActivity extends com.truecaller.bizmon.dynamicCalls.qa.Hilt_BizDynamicCallsQAActivity implements fg3.e0 {
    public static final /* synthetic */ int i0 = 0;
    public kotlin.coroutines.CoroutineContext d0;
    public kotlin.coroutines.CoroutineContext e0;
    public qc3.bar f0;
    public qc3.bar g0;
    public hi0.bar h0;

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.e0;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.bizmon.dynamicCalls.qa.Hilt_BizDynamicCallsQAActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558445);
        final int i = 0;
        ((android.widget.Button) findViewById(2131362655)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: li0.bar
            public final /* synthetic */ com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                int i3 = 1;
                com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity = this.b;
                df3.bar barVar = null;
                switch (i2) {
                    case 0:
                        int i4 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity2 = this.b;
                        fg3.h0.J(bizDynamicCallsQAActivity2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new en1.s(bizDynamicCallsQAActivity2, (df3.bar) null, java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366896).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366888).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366852).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366884).getText()), bizDynamicCallsQAActivity2.findViewById(2131362411).isChecked()), 3);
                        return;
                    case 1:
                        int i5 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.e0 e0Var = this.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "context");
                        od.n k = od.n.k(e0Var);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
                        fe0.m.D(k, "BizDynamicCallSyncWorkAction", e0Var, null, null, 12);
                        return;
                    case 2:
                        int i6 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.baz(bizDynamicCallsQAActivity, (df3.bar) null, 1), 3);
                        return;
                    default:
                        int i7 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.qux(bizDynamicCallsQAActivity, java.lang.String.valueOf(bizDynamicCallsQAActivity.findViewById(2131366903).getText()), barVar, i3), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        ((android.widget.Button) findViewById(2131362646)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: li0.bar
            public final /* synthetic */ com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                int i3 = 1;
                com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity = this.b;
                df3.bar barVar = null;
                switch (i22) {
                    case 0:
                        int i4 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity2 = this.b;
                        fg3.h0.J(bizDynamicCallsQAActivity2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new en1.s(bizDynamicCallsQAActivity2, (df3.bar) null, java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366896).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366888).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366852).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366884).getText()), bizDynamicCallsQAActivity2.findViewById(2131362411).isChecked()), 3);
                        return;
                    case 1:
                        int i5 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.e0 e0Var = this.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "context");
                        od.n k = od.n.k(e0Var);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
                        fe0.m.D(k, "BizDynamicCallSyncWorkAction", e0Var, null, null, 12);
                        return;
                    case 2:
                        int i6 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.baz(bizDynamicCallsQAActivity, (df3.bar) null, 1), 3);
                        return;
                    default:
                        int i7 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.qux(bizDynamicCallsQAActivity, java.lang.String.valueOf(bizDynamicCallsQAActivity.findViewById(2131366903).getText()), barVar, i3), 3);
                        return;
                }
            }
        });
        final int i3 = 2;
        ((android.widget.Button) findViewById(2131362641)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: li0.bar
            public final /* synthetic */ com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i3;
                int i32 = 1;
                com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity = this.b;
                df3.bar barVar = null;
                switch (i22) {
                    case 0:
                        int i4 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity2 = this.b;
                        fg3.h0.J(bizDynamicCallsQAActivity2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new en1.s(bizDynamicCallsQAActivity2, (df3.bar) null, java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366896).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366888).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366852).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366884).getText()), bizDynamicCallsQAActivity2.findViewById(2131362411).isChecked()), 3);
                        return;
                    case 1:
                        int i5 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.e0 e0Var = this.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "context");
                        od.n k = od.n.k(e0Var);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
                        fe0.m.D(k, "BizDynamicCallSyncWorkAction", e0Var, null, null, 12);
                        return;
                    case 2:
                        int i6 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.baz(bizDynamicCallsQAActivity, (df3.bar) null, 1), 3);
                        return;
                    default:
                        int i7 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.qux(bizDynamicCallsQAActivity, java.lang.String.valueOf(bizDynamicCallsQAActivity.findViewById(2131366903).getText()), barVar, i32), 3);
                        return;
                }
            }
        });
        final int i4 = 3;
        ((android.widget.Button) findViewById(2131362665)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: li0.bar
            public final /* synthetic */ com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i4;
                int i32 = 1;
                com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity = this.b;
                df3.bar barVar = null;
                switch (i22) {
                    case 0:
                        int i42 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity bizDynamicCallsQAActivity2 = this.b;
                        fg3.h0.J(bizDynamicCallsQAActivity2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new en1.s(bizDynamicCallsQAActivity2, (df3.bar) null, java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366896).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366888).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366852).getText()), java.lang.String.valueOf(bizDynamicCallsQAActivity2.findViewById(2131366884).getText()), bizDynamicCallsQAActivity2.findViewById(2131362411).isChecked()), 3);
                        return;
                    case 1:
                        int i5 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.e0 e0Var = this.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "context");
                        od.n k = od.n.k(e0Var);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
                        fe0.m.D(k, "BizDynamicCallSyncWorkAction", e0Var, null, null, 12);
                        return;
                    case 2:
                        int i6 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.baz(bizDynamicCallsQAActivity, (df3.bar) null, 1), 3);
                        return;
                    default:
                        int i7 = com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.i0;
                        fg3.h0.J(bizDynamicCallsQAActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.qux(bizDynamicCallsQAActivity, java.lang.String.valueOf(bizDynamicCallsQAActivity.findViewById(2131366903).getText()), barVar, i32), 3);
                        return;
                }
            }
        });
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new li0.baz(this, (df3.bar) null, 3), 3);
    }
}
