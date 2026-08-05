package com.truecaller.util.background.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/truecaller/util/background/qa/WorkActionStatusActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "o03/qux", "o03/baz", "ho2/d", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WorkActionStatusActivity extends com.truecaller.util.background.qa.Hilt_WorkActionStatusActivity {
    public java.util.Map d0;
    public nd.j0 e0;
    public java.util.LinkedHashMap f0;
    public final java.util.LinkedHashMap g0 = new java.util.LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.util.background.qa.Hilt_WorkActionStatusActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        java.util.Map map = this.d0;
        if (map != null) {
            java.util.Set<uf0.bar> keySet = map.keySet();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (uf0.bar barVar : keySet) {
                uf0.f fVar = new uf0.f(barVar.b, barVar.c);
                java.lang.Object obj = linkedHashMap.get(fVar);
                if (obj == null) {
                    linkedHashMap.containsKey(fVar);
                }
                java.util.List list = (java.util.List) obj;
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(barVar.a);
                linkedHashMap.put(fVar, list);
            }
            this.f0 = linkedHashMap;
            final ho2.d dVar = new ho2.d(this);
            java.util.LinkedHashMap linkedHashMap2 = this.f0;
            if (linkedHashMap2 != null) {
                java.util.Set<uf0.f> keySet2 = linkedHashMap2.keySet();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(keySet2, 10));
                for (uf0.f fVar2 : keySet2) {
                    nd.j0 j0Var = this.e0;
                    if (j0Var != null) {
                        arrayList.add(new kotlin.Pair(fVar2, j0Var.i(fVar2.c)));
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("workManager");
                        throw null;
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kotlin.Pair pair = (kotlin.Pair) it.next();
                    final uf0.f fVar3 = (uf0.f) pair.a;
                    ((androidx.lifecycle.m0) pair.b).e(this, new androidx.lifecycle.r0() { // from class: o03.bar
                        public final void a(java.lang.Object obj2) {
                            java.util.List list2 = (java.util.List) obj2;
                            java.util.LinkedHashMap linkedHashMap3 = com.truecaller.util.background.qa.WorkActionStatusActivity.this.g0;
                            kotlin.jvm.internal.Intrinsics.d(list2);
                            linkedHashMap3.put(fVar3, kotlin.collections.CollectionsKt.X(0, list2));
                            dVar.notifyDataSetChanged();
                        }
                    });
                }
                android.widget.TextView textView = new android.widget.TextView(this);
                textView.setText("Clicking on the work action will trigger it");
                textView.setGravity(17);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                float f = 16;
                int r = ak.r0.r(f, this);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                textView.setPadding(0, r, 0, ak.r0.r(f, this));
                android.view.View recyclerView = new androidx.recyclerview.widget.RecyclerView(this);
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
                recyclerView.setAdapter(dVar);
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, new android.view.ViewGroup.LayoutParams(-1, -2));
                linearLayout.addView(recyclerView, new android.view.ViewGroup.LayoutParams(-1, -1));
                setContentView(linearLayout);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("groupedActions");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("actionSpecs");
        throw null;
    }
}
