package com.truecaller.dynamicfeaturesupport.qm;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/dynamicfeaturesupport/qm/DynamicFeaturePanelActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lah1/b;", "", "<init>", "()V", "dynamic-features-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DynamicFeaturePanelActivity extends com.truecaller.dynamicfeaturesupport.qm.Hilt_DynamicFeaturePanelActivity implements ah1.b {
    public ah1.c d0;
    public androidx.recyclerview.widget.RecyclerView e0;
    public android.widget.TextView f0;
    public ah1.qux g0;
    public androidx.recyclerview.widget.RecyclerView h0;
    public android.widget.TextView i0;
    public ah1.qux j0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.dynamicfeaturesupport.qm.Hilt_DynamicFeaturePanelActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        setContentView(2131558473);
        android.view.View findViewById = findViewById(2131362377);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f0 = (android.widget.TextView) findViewById;
        androidx.recyclerview.widget.RecyclerView findViewById2 = findViewById(2131362379);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById2;
        this.e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
            ah1.qux quxVar = new ah1.qux(this, false);
            this.g0 = quxVar;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.e0;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(quxVar);
                android.view.View findViewById3 = findViewById(2131364701);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                this.i0 = (android.widget.TextView) findViewById3;
                androidx.recyclerview.widget.RecyclerView findViewById4 = findViewById(2131364703);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                androidx.recyclerview.widget.RecyclerView recyclerView3 = findViewById4;
                this.h0 = recyclerView3;
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
                    ah1.qux quxVar2 = new ah1.qux(this, true);
                    this.j0 = quxVar2;
                    androidx.recyclerview.widget.RecyclerView recyclerView4 = this.h0;
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(quxVar2);
                        ah1.c cVar = this.d0;
                        if (cVar != null) {
                            cVar.u0(this);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("presenter");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.n("installedModuleRcv");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("installedModuleRcv");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("availableModuleRcv");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("availableModuleRcv");
        throw null;
    }

    @Override // com.truecaller.dynamicfeaturesupport.qm.Hilt_DynamicFeaturePanelActivity
    public final void onDestroy() {
        super.onDestroy();
        ah1.c cVar = this.d0;
        if (cVar != null) {
            cVar.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }
}
