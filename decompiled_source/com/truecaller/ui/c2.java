package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class c2 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit b;

    public /* synthetic */ c2(com.truecaller.ui.TruecallerInit truecallerInit, int i) {
        this.a = i;
        this.b = truecallerInit;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, com.truecaller.ui.TruecallerInit] */
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.a;
        final int i2 = 0;
        ?? r4 = this.b;
        switch (i) {
            case 0:
                int intValue = ((java.lang.Integer) obj).intValue();
                int i3 = com.truecaller.ui.TruecallerInit.y1;
                r4.q1(intValue);
                return kotlin.Unit.a;
            case 1:
                java.lang.String str = (java.lang.String) obj;
                int i4 = com.truecaller.ui.TruecallerInit.y1;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
                qc3.bar barVar = r4.f1;
                if (barVar != null) {
                    java.lang.Object obj2 = barVar.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    os0.bar.F((pv0.bar) obj2, str);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("limitCallSystemDialogEvaluator");
                throw null;
            case 2:
                java.lang.String str2 = (java.lang.String) obj;
                d91.e eVar = r4.w1;
                if (eVar != null) {
                    final androidx.appcompat.widget.AppCompatTextView appCompatTextView = eVar.t;
                    appCompatTextView.setText(str2);
                    appCompatTextView.setVisibility(0);
                    appCompatTextView.setAlpha(1.0f);
                    appCompatTextView.animate().setStartDelay(3000L).alpha(0.0f).setDuration(200L).withEndAction(new java.lang.Runnable() { // from class: com.truecaller.ui.x1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i2;
                            androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = appCompatTextView;
                            switch (i5) {
                                case 0:
                                    int i6 = com.truecaller.ui.TruecallerInit.y1;
                                    appCompatTextView2.setVisibility(8);
                                    return;
                                default:
                                    android.view.ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
                                    layoutParams.height = -2;
                                    appCompatTextView2.setLayoutParams(layoutParams);
                                    return;
                            }
                        }
                    }).start();
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            case 3:
                int intValue2 = ((java.lang.Integer) obj).intValue();
                int i5 = com.truecaller.ui.TruecallerInit.y1;
                return java.lang.Integer.valueOf(a.bar.o(8, (android.content.Context) r4) + intValue2);
            default:
                int intValue3 = ((java.lang.Integer) obj).intValue();
                if (!((java.lang.Boolean) r4.n1.getValue()).booleanValue()) {
                    i2 = a.bar.o(8, (android.content.Context) r4) + intValue3;
                }
                return java.lang.Integer.valueOf(i2);
        }
    }
}
