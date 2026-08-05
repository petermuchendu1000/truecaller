package com.truecaller.call_and_record.presentation.selectsim;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_and_record/presentation/selectsim/CallAndRecordSelectSimDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAndRecordSelectSimDialogActivity extends com.truecaller.call_and_record.presentation.selectsim.Hilt_CallAndRecordSelectSimDialogActivity {
    public static final /* synthetic */ int f0 = 0;
    public final androidx.lifecycle.o1 d0;
    public final androidx.lifecycle.o1 e0;

    public CallAndRecordSelectSimDialogActivity() {
        lf2.k kVar = new lf2.k(this, 4);
        ll0.qux quxVar = new ll0.qux(this, 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.d0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(ll0.c.class), new ll0.qux(this, 1), quxVar, new k91.d(kVar, this));
        this.e0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(hv0.m.class), new ll0.qux(this, 3), new ll0.qux(this, 2), new ll0.qux(this, 4));
    }

    public final void attachBaseContext(android.content.Context context) {
        android.view.ContextThemeWrapper contextThemeWrapper;
        if (context != null) {
            contextThemeWrapper = yy.qux.v(context, true);
        } else {
            contextThemeWrapper = null;
        }
        super.attachBaseContext(contextThemeWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        t41.p.d(this);
        super/*android.app.Activity*/.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_and_record.presentation.selectsim.Hilt_CallAndRecordSelectSimDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        h6.e.U(window, 0.75f);
        df3.bar barVar = null;
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ll0.baz(this, barVar, 1), 3);
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ll0.baz(this, barVar, 2), 3);
    }
}
