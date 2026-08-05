package com.truecaller.call_assistant.core.callui.v2.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/ui/AssistantV2CallUIActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantV2CallUIActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int f0 = 0;
    public ay1.bar a0;
    public qc3.bar b0;
    public xe1.b c0;
    public final kotlin.Lazy d0;
    public final kotlin.Lazy e0;

    public AssistantV2CallUIActivity() {
        final int i = 0;
        this.d0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: vo0.bar
            public final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.ui.AssistantV2CallUIActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                androidx.lifecycle.u1 u1Var = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.call_assistant.core.callui.v2.ui.AssistantV2CallUIActivity.f0;
                        return java.lang.Boolean.valueOf(u1Var.getIntent().getBooleanExtra("key_notification", false));
                    default:
                        ay1.bar barVar = u1Var.a0;
                        java.lang.String str = null;
                        if (barVar != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u1Var, "owner");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "factory");
                            androidx.lifecycle.t1 viewModelStore = u1Var.getViewModelStore();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u1Var, "owner");
                            a9.qux defaultViewModelCreationExtras = u1Var.getDefaultViewModelCreationExtras();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "store");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "factory");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultViewModelCreationExtras, "defaultCreationExtras");
                            ej.b bVar = new ej.b(viewModelStore, barVar, defaultViewModelCreationExtras);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vo0.qux.class, "modelClass");
                            kotlin.reflect.KClass r = t.c.r(vo0.qux.class, "modelClass", "modelClass");
                            if (r != null) {
                                str = r.getQualifiedName();
                            }
                            if (str != null) {
                                return (vo0.qux) bVar.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str), r);
                            }
                            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        kotlin.jvm.internal.Intrinsics.n("viewModelFactory");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        this.e0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: vo0.bar
            public final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.ui.AssistantV2CallUIActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                androidx.lifecycle.u1 u1Var = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.call_assistant.core.callui.v2.ui.AssistantV2CallUIActivity.f0;
                        return java.lang.Boolean.valueOf(u1Var.getIntent().getBooleanExtra("key_notification", false));
                    default:
                        ay1.bar barVar = u1Var.a0;
                        java.lang.String str = null;
                        if (barVar != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u1Var, "owner");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "factory");
                            androidx.lifecycle.t1 viewModelStore = u1Var.getViewModelStore();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u1Var, "owner");
                            a9.qux defaultViewModelCreationExtras = u1Var.getDefaultViewModelCreationExtras();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "store");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "factory");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultViewModelCreationExtras, "defaultCreationExtras");
                            ej.b bVar = new ej.b(viewModelStore, barVar, defaultViewModelCreationExtras);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vo0.qux.class, "modelClass");
                            kotlin.reflect.KClass r = t.c.r(vo0.qux.class, "modelClass", "modelClass");
                            if (r != null) {
                                str = r.getQualifiedName();
                            }
                            if (str != null) {
                                return (vo0.qux) bVar.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str), r);
                            }
                            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        kotlin.jvm.internal.Intrinsics.n("viewModelFactory");
                        throw null;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.baz.b);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        ye0.k.U(this);
        xe1.b a = xe1.b.a(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "inflate(...)");
        this.c0 = a;
        setContentView(a.b);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
        rn0.b0 b0Var = rn0.baz.a;
        if (b0Var == null) {
            android.content.Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            rn0.a0 a0Var = (rn0.a0) f40.d0.z(applicationContext, rn0.a0.class);
            a0Var.getClass();
            rn0.b0 b0Var2 = new rn0.b0(a0Var);
            rn0.baz.a = b0Var2;
            b0Var = b0Var2;
        }
        rn0.b0 b0Var3 = b0Var.b;
        this.a0 = new ay1.bar((rn0.bar) b0Var3.C.get(), ((tx.w) b0Var3.a).G(), (qo1.b) b0Var3.i.get());
        this.b0 = cd3.baz.a(b0Var3.Q);
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
            q9.x xVar = new q9.x(this, 24);
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.m(constraintLayout, xVar);
            kotlin.Lazy lazy = this.e0;
            pe0.j.p(this, ((vo0.qux) lazy.getValue()).e, new rv2.qux(this, 23));
            vo0.qux quxVar = (vo0.qux) lazy.getValue();
            if (((java.lang.Boolean) this.d0.getValue()).booleanValue()) {
                quxVar.c.k0();
            } else {
                quxVar.getClass();
            }
            m03.r.t(quxVar, new nu1.v0(quxVar, (df3.bar) null, 18));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void onStart() {
        super.onStart();
        ((com.truecaller.call_assistant.core.callui.c) ((vo0.qux) this.e0.getValue()).b).g(com.truecaller.call_assistant.core.callui.AssistantCallUiState.OPENED);
    }

    public final void onStop() {
        super.onStop();
        ((com.truecaller.call_assistant.core.callui.c) ((vo0.qux) this.e0.getValue()).b).g(com.truecaller.call_assistant.core.callui.AssistantCallUiState.CLOSED);
    }

    public final void s0(androidx.fragment.app.Fragment fragment) {
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
