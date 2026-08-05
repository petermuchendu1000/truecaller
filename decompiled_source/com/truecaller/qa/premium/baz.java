package com.truecaller.qa.premium;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz extends ff3.g implements kotlin.jvm.functions.Function2 {
    public android.widget.TextView x;
    public int y;
    public final /* synthetic */ com.truecaller.qa.premium.QaPremiumReportDialog z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(com.truecaller.qa.premium.QaPremiumReportDialog qaPremiumReportDialog, df3.bar barVar) {
        super(2, barVar);
        this.z = qaPremiumReportDialog;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.qa.premium.baz(this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        com.truecaller.qa.premium.QaPremiumReportDialog qaPremiumReportDialog = this.z;
        kotlin.Lazy lazy = qaPremiumReportDialog.m;
        kotlin.Lazy lazy2 = qaPremiumReportDialog.n;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        textView3 = this.x;
                        od.p.E(obj);
                        textView3.setText((java.lang.CharSequence) obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    textView2 = this.x;
                    od.p.E(obj);
                    textView2.setText((java.lang.CharSequence) obj);
                }
            } else {
                textView = this.x;
                od.p.E(obj);
                textView.setText((java.lang.CharSequence) obj);
            }
        } else {
            od.p.E(obj);
            com.truecaller.qa.premium.QaPremiumReportDialog.Type type = qaPremiumReportDialog.l;
            if (type != null) {
                int i2 = com.truecaller.qa.premium.bar.a[type.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ((android.widget.TextView) lazy2.getValue()).setText("Discount String Formating");
                            android.widget.TextView textView4 = (android.widget.TextView) lazy.getValue();
                            ki2.h hVar = qaPremiumReportDialog.k;
                            if (hVar != null) {
                                this.x = textView4;
                                this.y = 3;
                                java.lang.Object b = hVar.b(this);
                                if (b != barVar) {
                                    textView3 = textView4;
                                    obj = b;
                                    textView3.setText((java.lang.CharSequence) obj);
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("discountStringProvider");
                                throw null;
                            }
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        ((android.widget.TextView) lazy2.getValue()).setText("Products");
                        android.widget.TextView textView5 = (android.widget.TextView) lazy.getValue();
                        is0.qux quxVar = qaPremiumReportDialog.j;
                        if (quxVar != null) {
                            this.x = textView5;
                            this.y = 2;
                            java.lang.Object z = quxVar.z(this);
                            if (z != barVar) {
                                textView2 = textView5;
                                obj = z;
                                textView2.setText((java.lang.CharSequence) obj);
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("productsReporter");
                            throw null;
                        }
                    }
                } else {
                    ((android.widget.TextView) lazy2.getValue()).setText("Premium Report");
                    android.widget.TextView textView6 = (android.widget.TextView) lazy.getValue();
                    tf2.s0 s0Var = qaPremiumReportDialog.i;
                    if (s0Var != null) {
                        this.x = textView6;
                        this.y = 1;
                        java.lang.Object j = s0Var.j(this);
                        if (j != barVar) {
                            textView = textView6;
                            obj = j;
                            textView.setText((java.lang.CharSequence) obj);
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("premiumReporter");
                        throw null;
                    }
                }
                return barVar;
            }
            kotlin.jvm.internal.Intrinsics.n(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            throw null;
        }
        return kotlin.Unit.a;
    }
}
