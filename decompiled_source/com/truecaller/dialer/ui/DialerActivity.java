package com.truecaller.dialer.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/dialer/ui/DialerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "b91/c", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DialerActivity extends com.truecaller.dialer.ui.Hilt_DialerActivity {
    public static final /* synthetic */ int h0 = 0;
    public androidx.fragment.app.Fragment d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(df1.c.class), new bf1.u(this, 1), new bf1.u(this, 0), new bf1.u(this, 2));
    public bf1.c0 f0;
    public d91.c g0;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r10 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r8.p(r3, r10, r1) != r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r10 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object t0(com.truecaller.dialer.ui.DialerActivity dialerActivity, ff3.qux quxVar) {
        bf1.t tVar;
        int i;
        df1.h hVar;
        java.lang.String str;
        java.lang.String str2;
        androidx.lifecycle.o1 o1Var = dialerActivity.e0;
        if (quxVar instanceof bf1.t) {
            tVar = (bf1.t) quxVar;
            int i2 = tVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = tVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = tVar.z;
                java.lang.String str3 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                java.lang.String str4 = (java.lang.String) obj;
                                if (str4 != null) {
                                    androidx.fragment.app.Fragment fragment = dialerActivity.d0;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "number");
                                    if (fragment != null && (fragment instanceof bf1.b0)) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "number");
                                        bf1.j0 U4 = ((bf1.b0) fragment).U4();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "number");
                                        hg1.p pVar = U4.X;
                                        pVar.B = true;
                                        if (!kotlin.text.StringsKt.X(str4)) {
                                            str3 = str4;
                                        }
                                        pVar.F = str3;
                                        pVar.E2();
                                    }
                                }
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        df1.c cVar = (df1.c) o1Var.getValue();
                        tVar.z = 3;
                        obj = cVar.o(tVar);
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    df1.c cVar2 = (df1.c) o1Var.getValue();
                    tVar.z = 1;
                    obj = cVar2.b.y(tVar);
                }
                hVar = (df1.h) obj;
                if (!(hVar instanceof df1.d)) {
                    df1.d dVar = (df1.d) hVar;
                    str2 = dVar.a;
                    str = dVar.b;
                } else {
                    str = null;
                    str2 = null;
                }
                df1.c cVar3 = (df1.c) o1Var.getValue();
                tVar.z = 2;
            }
        }
        tVar = new bf1.t(dialerActivity, quxVar);
        java.lang.Object obj2 = tVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = tVar.z;
        java.lang.String str32 = null;
        if (i == 0) {
        }
        hVar = (df1.h) obj2;
        if (!(hVar instanceof df1.d)) {
        }
        df1.c cVar32 = (df1.c) o1Var.getValue();
        tVar.z = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.dialer.ui.Hilt_DialerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.s(this, ex2.a.a);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        int i = 1;
        df3.bar barVar = null;
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(from, true).inflate(2131558472, (android.view.ViewGroup) null, false);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131364007, inflate);
        if (frameLayout != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
            d91.c cVar = new d91.c(constraintLayout, frameLayout, constraintLayout, 21);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
            this.g0 = cVar;
            setContentView(constraintLayout);
            d91.c cVar2 = this.g0;
            if (cVar2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) cVar2.d;
                b93.b bVar = new b93.b(1);
                java.util.WeakHashMap weakHashMap = u6.t0.a;
                u6.k0.m(constraintLayout2, bVar);
                android.content.Intent intent = getIntent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                u0(intent);
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bf1.s(this, barVar, i), 3);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(2131364007)));
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        androidx.fragment.app.Fragment fragment = this.d0;
        if (fragment != null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            barVar.s(fragment);
            barVar.m(true, true);
            this.d0 = null;
        }
        u0(intent);
    }

    public final void u0(android.content.Intent intent) {
        com.truecaller.common_call_log.data.FilterType filterType;
        android.view.View view;
        java.lang.String stringExtra = intent.getStringExtra("ARGUMENT_PHONE_NUMBER");
        java.lang.String stringExtra2 = intent.getStringExtra("ARGUMENT_ANALYTICS_CONTEXT");
        if (stringExtra2 == null) {
            stringExtra2 = "undefined";
        }
        com.truecaller.common_call_log.data.FilterType serializableExtra = intent.getSerializableExtra("ARGUMENT_FILTER_TYPE");
        df3.bar barVar = null;
        if (serializableExtra instanceof com.truecaller.common_call_log.data.FilterType) {
            filterType = serializableExtra;
        } else {
            filterType = null;
        }
        if (filterType == null) {
            filterType = com.truecaller.common_call_log.data.FilterType.NONE;
        }
        androidx.fragment.app.Fragment fragment = this.d0;
        if (fragment == null) {
            bf1.c0 c0Var = this.f0;
            if (c0Var != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filterType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "analyticsContext");
                c0Var.a.c(com.truecaller.analytics.TimingEvent.DIALER_STARTUP, (java.lang.String) null, "fragment:V2");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putSerializable("filter_type", filterType);
                bundle.putString("phone_number", stringExtra);
                bundle.putString("stashed_number", null);
                bundle.putString("analytics_context", stringExtra2);
                bf1.b0 b0Var = new bf1.b0();
                b0Var.setArguments(bundle);
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
                barVar2.f(2131364007, b0Var, "TAG_DIALER_FRAGMENT", 1);
                barVar2.m(true, true);
                fragment = b0Var;
            } else {
                kotlin.jvm.internal.Intrinsics.n("dialerFragmentBuilder");
                throw null;
            }
        }
        this.d0 = fragment;
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bf1.s(this, barVar, 2), 3);
        androidx.fragment.app.Fragment fragment2 = this.d0;
        if (fragment2 != null && (view = fragment2.getView()) != null) {
            view.setVisibility(0);
        }
    }
}
