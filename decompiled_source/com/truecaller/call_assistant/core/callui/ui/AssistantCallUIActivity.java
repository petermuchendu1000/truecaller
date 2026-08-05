package com.truecaller.call_assistant.core.callui.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/ui/AssistantCallUIActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lsn0/bar;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantCallUIActivity extends androidx.appcompat.app.AppCompatActivity implements sn0.bar {
    public static final /* synthetic */ int d0 = 0;
    public dw2.qux a0;
    public qc3.bar b0;
    public xe1.b c0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        ye0.k.U(this);
        xe1.b a = xe1.b.a(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "inflate(...)");
        this.c0 = a;
        setContentView(a.b);
        rn0.b0 b0Var = (rn0.b0) mk.m.w(this).a;
        this.a0 = new dw2.qux((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), ((tx.w) b0Var.a).G());
        this.b0 = cd3.baz.a(b0Var.Q);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            h6.qux.s(getWindow());
            android.view.WindowInsetsController j = u6.f1.j(getWindow());
            if (j != null) {
                h6.qux.u(j, u6.f1.b());
                h6.qux.u(j, u6.f1.r());
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(getColor(2131099736));
        xe1.b bVar = this.c0;
        if (bVar != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = bVar.b;
            q9.x xVar = new q9.x(this, 9);
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.m(constraintLayout, xVar);
            s0().u0(this);
            dw2.qux s0 = s0();
            if (getIntent().getBooleanExtra("key_notification", false)) {
                ((a71.a) s0.g).k0();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void onDestroy() {
        super.onDestroy();
        s0().m1();
    }

    public final void onStart() {
        super.onStart();
        ((com.truecaller.call_assistant.core.callui.c) ((rn0.bar) s0().f)).g(com.truecaller.call_assistant.core.callui.AssistantCallUiState.OPENED);
    }

    public final void onStop() {
        super.onStop();
        ((com.truecaller.call_assistant.core.callui.c) ((rn0.bar) s0().f)).g(com.truecaller.call_assistant.core.callui.AssistantCallUiState.CLOSED);
    }

    public final dw2.qux s0() {
        dw2.qux quxVar = this.a0;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void t0(androidx.fragment.app.Fragment fragment) {
        java.lang.String name = fragment.getClass().getName();
        if (getSupportFragmentManager().G(name) != null) {
            return;
        }
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(2131364005, fragment, name);
        barVar.m(true, true);
    }
}
