package com.truecaller.editprofile.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/truecaller/editprofile/impl/ui/EditProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "La82/qux;", "Le41/v;", "<init>", "()V", "ih1/bar", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EditProfileActivity extends com.truecaller.editprofile.impl.ui.Hilt_EditProfileActivity implements a82.qux, e41.v {
    public static final /* synthetic */ int l0 = 0;
    public ag0.qux d0;
    public a82.baz e0;
    public bv.c f0;
    public hk2.i g0;
    public ak0.qux h0;
    public com.truecaller.google_login.g i0;
    public final androidx.lifecycle.o1 j0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ih1.t0.class), new ih1.c(this, 1), new ih1.c(this, 0), new ih1.c(this, 2));
    public final g.baz k0 = registerForActivityResult(new androidx.fragment.app.a1(8), new dj2.w(this, 25));

    @Override // a82.qux
    public final void L1(a82.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "result");
        ih1.t0 u0 = u0();
        u0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "result");
        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new i43.bar(dVar, u0, (df3.bar) null, 9), 3);
    }

    public final void L3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != -2092617451) {
                if (hashCode == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
                    t0().d();
                    return;
                }
                return;
            }
            if (tag.equals("TAG_EDIT_VERIFIED_NAME_DIALOG")) {
                ak0.qux t0 = t0();
                qx2.d3 h = qx2.hg.h();
                h.m("ChangeVerifiedNamePopup");
                h.l("CancelChangeName");
                qx2.hg h2 = h.h();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                j71.g.K(h2, t0.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e2(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != -2092617451) {
                if (hashCode != 318992986) {
                    if (hashCode == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
                        t0().d();
                        return;
                    }
                    return;
                }
                if (tag.equals("TAG_EXIT_WITHOUT_SAVING_DIALOG")) {
                    finish();
                    return;
                }
                return;
            }
            if (tag.equals("TAG_EDIT_VERIFIED_NAME_DIALOG")) {
                ak0.qux t0 = t0();
                qx2.d3 h = qx2.hg.h();
                h.m("ChangeVerifiedNamePopup");
                h.l("CancelChangeName");
                qx2.hg h2 = h.h();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                j71.g.K(h2, t0.a);
            }
        }
    }

    public final void f3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            df3.bar barVar = null;
            if (hashCode != -2092617451) {
                if (hashCode != 318992986) {
                    if (hashCode == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
                        ih1.t0 u0 = u0();
                        u0.getClass();
                        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ao1.a(true, (java.lang.Object) u0, barVar, 12), 3);
                        return;
                    }
                    return;
                }
                if (tag.equals("TAG_EXIT_WITHOUT_SAVING_DIALOG")) {
                    u0().C();
                    return;
                }
                return;
            }
            if (tag.equals("TAG_EDIT_VERIFIED_NAME_DIALOG")) {
                ih1.t0 u03 = u0();
                u03.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new i43.bar(u03, (df3.bar) null, 7), 3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k4(java.lang.String str, com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null && tag.hashCode() == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
            t41.p.n(this, str);
            ak0.qux t0 = t0();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ImageUploadCommunityGuidelinesClicked", "action");
            nc0.u1.e(new rc0.b("ImageUploadCommunityGuidelinesClicked", (java.lang.String) null, "InvalidImagePopup"), t0.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.editprofile.impl.ui.Hilt_EditProfileActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.editprofile.api.model.EditProfileStartDestinations editProfileStartDestinations;
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        a82.baz bazVar = this.e0;
        if (bazVar != null) {
            bazVar.a(new i.c0(this, 4));
            android.content.Intent intent = getIntent();
            if (intent == null || (stringExtra = intent.getStringExtra("extraStartDestinations")) == null || (editProfileStartDestinations = com.truecaller.editprofile.api.model.EditProfileStartDestinations.valueOf(stringExtra)) == null) {
                editProfileStartDestinations = com.truecaller.editprofile.api.model.EditProfileStartDestinations.EDIT_PROFILE;
            }
            e.d.a(this, new d3.qux(1019740085, new ih1.qux(this, editProfileStartDestinations, 0), true));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("photoCropHelper");
        throw null;
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        ih1.t0 u0 = u0();
        u0.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ih1.t(u0, null, 4), 3);
    }

    public final ak0.qux t0() {
        ak0.qux quxVar = this.h0;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    public final ih1.t0 u0() {
        return (ih1.t0) this.j0.getValue();
    }
}
