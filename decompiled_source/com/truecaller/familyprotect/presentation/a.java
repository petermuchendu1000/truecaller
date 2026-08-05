package com.truecaller.familyprotect.presentation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a implements f.baz {
    public final /* synthetic */ com.truecaller.familyprotect.presentation.Hilt_FamilyGroupMainActivity a;

    public a(com.truecaller.familyprotect.presentation.Hilt_FamilyGroupMainActivity hilt_FamilyGroupMainActivity) {
        this.a = hilt_FamilyGroupMainActivity;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [rq0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p7.bar, java.lang.Object] */
    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.familyprotect.presentation.Hilt_FamilyGroupMainActivity hilt_FamilyGroupMainActivity = this.a;
        if (!hilt_FamilyGroupMainActivity.c0) {
            hilt_FamilyGroupMainActivity.c0 = true;
            tx.e eVar = (com.truecaller.familyprotect.presentation.qux) hilt_FamilyGroupMainActivity.X3();
            com.truecaller.familyprotect.presentation.FamilyGroupMainActivity familyGroupMainActivity = (com.truecaller.familyprotect.presentation.FamilyGroupMainActivity) hilt_FamilyGroupMainActivity;
            tx.w wVar = eVar.f;
            familyGroupMainActivity.d0 = (uq2.baz) wVar.Xb.get();
            tx.c0 c0Var = wVar.b;
            tx.w wVar2 = c0Var.a;
            gk1.bar barVar = (gk1.bar) wVar2.W4.get();
            wl1.bar barVar2 = (wl1.bar) wVar2.O6.get();
            wk1.qux quxVar = (wk1.qux) wVar2.N6.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "familyGroupConfidenceFeatureResolver");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "activityRecognitionHelper");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "familyProtectionPermissionManager");
            ?? obj = new java.lang.Object();
            ((rq0.l) obj).a = barVar;
            ((rq0.l) obj).b = barVar2;
            ((rq0.l) obj).c = quxVar;
            familyGroupMainActivity.e0 = obj;
            familyGroupMainActivity.f0 = c0Var.d4();
            familyGroupMainActivity.g0 = new java.lang.Object();
            familyGroupMainActivity.h0 = new a8.l((android.content.Context) c0Var.a.I.get(), 7);
            familyGroupMainActivity.i0 = (i82.t) wVar.bc.get();
        }
    }
}
