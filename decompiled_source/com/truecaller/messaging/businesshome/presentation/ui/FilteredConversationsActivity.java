package com.truecaller.messaging.businesshome.presentation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/messaging/businesshome/presentation/ui/FilteredConversationsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/view/View;", "anchorView", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FilteredConversationsActivity extends com.truecaller.messaging.businesshome.presentation.ui.Hilt_FilteredConversationsActivity {
    public static final /* synthetic */ int e0 = 0;
    public qc3.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.businesshome.presentation.ui.Hilt_FilteredConversationsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            bundle2.putAll(extras);
        }
        e.d.a(this, new d3.qux(-447384553, new j02.w(this, bundle2, 0), true));
    }

    public final void t0(kotlin.jvm.functions.Function0 function0, android.os.Bundle bundle, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        nVar.b0(-727847306);
        if (nVar.h(function0)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar.h(bundle)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (nVar.h(this)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i7 & 1, z)) {
            java.lang.Object M = nVar.M();
            if (M == v2.k.a) {
                M = androidx.compose.runtime.a.j((java.lang.Object) null);
                nVar.k0(M);
            }
            long j = ((y41.i) nVar.j(y41.j.a)).g().a;
            java.util.WeakHashMap weakHashMap = m1.p2.w;
            r2.n5.a((j3.q) null, d3.a.d(-1508694214, new fj1.bar(function0, this, (v2.t0) M, 26), nVar), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, j, 0L, m1.b.f(nVar).g, d3.a.d(-1328600827, new a03.g(bundle, 17), nVar), nVar, 805306416, 189);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new fj1.bar(this, function0, bundle, i, 27);
        }
    }
}
