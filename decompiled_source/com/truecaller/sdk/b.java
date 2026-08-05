package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b extends zc.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ b(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.truecaller.sdk.oAuth.view.consentScreen.BottomSheetOAuthActivity, android.app.Activity] */
    public final void b(zc.n nVar) {
        yo2.qux quxVar;
        yo2.qux quxVar2;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "transition");
                ((com.truecaller.sdk.g) ((com.truecaller.sdk.BottomSheetConfirmProfileActivity) this.b).u0()).n2().y();
                return;
            case 1:
                ((com.truecaller.sdk.g) ((com.truecaller.sdk.ConfirmProfileActivity) this.b).h0).n2().y();
                return;
            case 2:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "transition");
                ?? r4 = (com.truecaller.sdk.oAuth.view.consentScreen.BottomSheetOAuthActivity) this.b;
                if (!r4.isFinishing() && (quxVar = r4.e0) != null) {
                    ro2.c cVar = (ro2.c) quxVar.e2();
                    fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ro2.qux(cVar, null, 2), 3);
                    return;
                }
                return;
            case 3:
                ((zc.n) this.b).F();
                nVar.C(this);
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "transition");
                zo2.baz bazVar = (zo2.baz) this.b;
                if (!bazVar.requireActivity().isFinishing() && (quxVar2 = bazVar.i) != null) {
                    ro2.c cVar2 = (ro2.c) quxVar2.e2();
                    fg3.h0.J(cVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ro2.qux(cVar2, null, 2), 3);
                    return;
                }
                return;
        }
    }
}
