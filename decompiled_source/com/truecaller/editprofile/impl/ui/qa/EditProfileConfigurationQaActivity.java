package com.truecaller.editprofile.impl.ui.qa;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/editprofile/impl/ui/qa/EditProfileConfigurationQaActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/truecaller/editprofile/impl/ui/qa/e;", "configurationUI", "", "snackMessage", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EditProfileConfigurationQaActivity extends com.truecaller.editprofile.impl.ui.qa.Hilt_EditProfileConfigurationQaActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.editprofile.impl.ui.qa.d.class), new com.truecaller.editprofile.impl.ui.qa.baz(this, 1), new com.truecaller.editprofile.impl.ui.qa.baz(this, 0), new com.truecaller.editprofile.impl.ui.qa.baz(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.editprofile.impl.ui.qa.Hilt_EditProfileConfigurationQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        final int i = 0;
        e.d.a(this, new d3.qux(1838017993, new kotlin.jvm.functions.Function2(this) { // from class: com.truecaller.editprofile.impl.ui.qa.bar
            public final /* synthetic */ com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean z;
                com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity editProfileConfigurationQaActivity;
                r2.m6 m6Var;
                java.lang.Object value;
                java.util.List J;
                switch (i) {
                    case 0:
                        com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity editProfileConfigurationQaActivity2 = this.b;
                        androidx.lifecycle.o1 o1Var = editProfileConfigurationQaActivity2.d0;
                        v2.n nVar = (v2.n) obj;
                        int intValue = ((java.lang.Integer) obj2).intValue();
                        int i2 = com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity.e0;
                        if ((intValue & 3) != 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (nVar.P(intValue & 1, z)) {
                            com.truecaller.editprofile.impl.ui.qa.d dVar = (com.truecaller.editprofile.impl.ui.qa.d) o1Var.getValue();
                            ig3.h2 h2Var = dVar.d;
                            v2.t0 r = mf0.o.r(ig3.w1.L(new com.truecaller.editprofile.impl.ui.qa.c(h2Var), androidx.lifecycle.g1.l(dVar), ig3.z1.a(3, 0L), h2Var.getValue()), nVar, 0, 7);
                            v2.t0 r2 = mf0.o.r(((com.truecaller.editprofile.impl.ui.qa.d) o1Var.getValue()).f, nVar, 0, 7);
                            o3.i iVar = (o3.i) nVar.j(k4.g1.i);
                            java.lang.Object M = nVar.M();
                            v2.c cVar = v2.k.a;
                            if (M == cVar) {
                                M = qb.qux.u(nVar);
                            }
                            r2.m6 m6Var2 = (r2.m6) M;
                            java.lang.String str = (java.lang.String) r2.getValue();
                            boolean f = nVar.f(r2) | nVar.h(editProfileConfigurationQaActivity2);
                            java.lang.Object M2 = nVar.M();
                            if (f || M2 == cVar) {
                                editProfileConfigurationQaActivity = editProfileConfigurationQaActivity2;
                                m6Var = m6Var2;
                                ag2.qux quxVar = new ag2.qux(r2, m6Var, editProfileConfigurationQaActivity, (df3.bar) null, 28);
                                nVar.k0(quxVar);
                                M2 = quxVar;
                            } else {
                                editProfileConfigurationQaActivity = editProfileConfigurationQaActivity2;
                                m6Var = m6Var2;
                            }
                            v2.f.h(str, (kotlin.jvm.functions.Function2) M2, nVar);
                            yp.d0.o(false, d3.a.d(-346843, new a32.i(m6Var, editProfileConfigurationQaActivity, iVar, r, 9), nVar), nVar, 48, 1);
                        } else {
                            nVar.S();
                        }
                        return kotlin.Unit.a;
                    default:
                        java.lang.String str2 = (java.lang.String) obj;
                        int i3 = com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity.e0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "id");
                        com.truecaller.editprofile.impl.ui.qa.d dVar2 = (com.truecaller.editprofile.impl.ui.qa.d) this.b.d0.getValue();
                        dVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "id");
                        ig3.h2 h2Var2 = dVar2.d;
                        do {
                            value = h2Var2.getValue();
                            J = j0.b.J(obj2, str2, ((com.truecaller.editprofile.impl.ui.qa.e) value).a);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(J, "fields");
                        } while (!h2Var2.n(value, new com.truecaller.editprofile.impl.ui.qa.e(J)));
                        return kotlin.Unit.a;
                }
            }
        }, true));
    }
}
