package com.truecaller.usershome.presentaion.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/usershome/presentaion/ui/screen/UsersHomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "La82/qux;", "La82/bar;", "<init>", "()V", "presentaion_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UsersHomeActivity extends com.truecaller.usershome.presentaion.ui.screen.Hilt_UsersHomeActivity implements a82.qux, a82.bar {
    public static final /* synthetic */ int m0 = 0;
    public lz2.qux d0;
    public bv.c e0;
    public uk2.x f0;
    public a82.baz g0;
    public final androidx.lifecycle.o1 h0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(mz2.d1.class), new c03.qux(this, 1), new c03.qux(this, 0), new c03.qux(this, 2));
    public final g.baz i0;
    public final g.baz j0;
    public final g.baz k0;
    public final g.baz l0;

    public UsersHomeActivity() {
        final int i = 0;
        this.i0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: c03.baz
            public final /* synthetic */ com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, java.lang.Object, com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity, androidx.appcompat.app.AppCompatActivity] */
            public final void onActivityResult(java.lang.Object obj) {
                android.content.Intent intent;
                android.os.Parcelable[] parcelableArrayExtra;
                java.util.List c;
                android.content.Intent intent2;
                android.net.Uri uri;
                int i2 = i;
                android.os.Parcelable[] parcelableArr = null;
                ?? r5 = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.app.Activity activity = r5.t0().q;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
                            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.truecaller.userverification.impl.ui.UserVerificationActivity.class));
                            return;
                        }
                        return;
                    case 1:
                        int i4 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "configs", com.truecaller.rewardprogram.api.model.ProgressConfig.class);
                            } else {
                                parcelableArrayExtra = intent.getParcelableArrayExtra("configs");
                            }
                            if (parcelableArrayExtra != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                                for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                    if (parcelable != null) {
                                        arrayList.add((com.truecaller.rewardprogram.api.model.ProgressConfig) parcelable);
                                    } else {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.rewardprogram.api.model.ProgressConfig");
                                    }
                                }
                                parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.rewardprogram.api.model.ProgressConfig[0]);
                            }
                            com.truecaller.rewardprogram.api.model.ProgressConfig[] progressConfigArr = (com.truecaller.rewardprogram.api.model.ProgressConfig[]) parcelableArr;
                            if (progressConfigArr != null && (c = kotlin.collections.t.c(progressConfigArr)) != null && !c.isEmpty()) {
                                lz2.qux t0 = r5.t0();
                                android.view.View findViewById = r5.findViewById(android.R.id.content);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById, "view");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "configs");
                                t0.f.L(findViewById, new hk2.h(c), com.truecaller.rewardprogram.api.RewardProgramSource.USERS_HOME);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        int i5 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                            r5.startActivity(new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.premium.insurance.ui.InsuranceActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i6 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent2 = activityResult.b) != null && (uri = (android.net.Uri) intent2.getParcelableExtra("cropImageUriResult")) != null) {
                            mz2.d1 d1Var = (mz2.d1) r5.h0.getValue();
                            d1Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(d1Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mc.b(d1Var, uri, (df3.bar) null, 14), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        this.j0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: c03.baz
            public final /* synthetic */ com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, java.lang.Object, com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity, androidx.appcompat.app.AppCompatActivity] */
            public final void onActivityResult(java.lang.Object obj) {
                android.content.Intent intent;
                android.os.Parcelable[] parcelableArrayExtra;
                java.util.List c;
                android.content.Intent intent2;
                android.net.Uri uri;
                int i22 = i2;
                android.os.Parcelable[] parcelableArr = null;
                ?? r5 = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.app.Activity activity = r5.t0().q;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
                            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.truecaller.userverification.impl.ui.UserVerificationActivity.class));
                            return;
                        }
                        return;
                    case 1:
                        int i4 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "configs", com.truecaller.rewardprogram.api.model.ProgressConfig.class);
                            } else {
                                parcelableArrayExtra = intent.getParcelableArrayExtra("configs");
                            }
                            if (parcelableArrayExtra != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                                for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                    if (parcelable != null) {
                                        arrayList.add((com.truecaller.rewardprogram.api.model.ProgressConfig) parcelable);
                                    } else {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.rewardprogram.api.model.ProgressConfig");
                                    }
                                }
                                parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.rewardprogram.api.model.ProgressConfig[0]);
                            }
                            com.truecaller.rewardprogram.api.model.ProgressConfig[] progressConfigArr = (com.truecaller.rewardprogram.api.model.ProgressConfig[]) parcelableArr;
                            if (progressConfigArr != null && (c = kotlin.collections.t.c(progressConfigArr)) != null && !c.isEmpty()) {
                                lz2.qux t0 = r5.t0();
                                android.view.View findViewById = r5.findViewById(android.R.id.content);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById, "view");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "configs");
                                t0.f.L(findViewById, new hk2.h(c), com.truecaller.rewardprogram.api.RewardProgramSource.USERS_HOME);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        int i5 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                            r5.startActivity(new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.premium.insurance.ui.InsuranceActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i6 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent2 = activityResult.b) != null && (uri = (android.net.Uri) intent2.getParcelableExtra("cropImageUriResult")) != null) {
                            mz2.d1 d1Var = (mz2.d1) r5.h0.getValue();
                            d1Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(d1Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mc.b(d1Var, uri, (df3.bar) null, 14), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 2;
        this.k0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: c03.baz
            public final /* synthetic */ com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, java.lang.Object, com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity, androidx.appcompat.app.AppCompatActivity] */
            public final void onActivityResult(java.lang.Object obj) {
                android.content.Intent intent;
                android.os.Parcelable[] parcelableArrayExtra;
                java.util.List c;
                android.content.Intent intent2;
                android.net.Uri uri;
                int i22 = i3;
                android.os.Parcelable[] parcelableArr = null;
                ?? r5 = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.app.Activity activity = r5.t0().q;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
                            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.truecaller.userverification.impl.ui.UserVerificationActivity.class));
                            return;
                        }
                        return;
                    case 1:
                        int i4 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "configs", com.truecaller.rewardprogram.api.model.ProgressConfig.class);
                            } else {
                                parcelableArrayExtra = intent.getParcelableArrayExtra("configs");
                            }
                            if (parcelableArrayExtra != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                                for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                    if (parcelable != null) {
                                        arrayList.add((com.truecaller.rewardprogram.api.model.ProgressConfig) parcelable);
                                    } else {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.rewardprogram.api.model.ProgressConfig");
                                    }
                                }
                                parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.rewardprogram.api.model.ProgressConfig[0]);
                            }
                            com.truecaller.rewardprogram.api.model.ProgressConfig[] progressConfigArr = (com.truecaller.rewardprogram.api.model.ProgressConfig[]) parcelableArr;
                            if (progressConfigArr != null && (c = kotlin.collections.t.c(progressConfigArr)) != null && !c.isEmpty()) {
                                lz2.qux t0 = r5.t0();
                                android.view.View findViewById = r5.findViewById(android.R.id.content);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById, "view");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "configs");
                                t0.f.L(findViewById, new hk2.h(c), com.truecaller.rewardprogram.api.RewardProgramSource.USERS_HOME);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        int i5 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                            r5.startActivity(new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.premium.insurance.ui.InsuranceActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i6 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent2 = activityResult.b) != null && (uri = (android.net.Uri) intent2.getParcelableExtra("cropImageUriResult")) != null) {
                            mz2.d1 d1Var = (mz2.d1) r5.h0.getValue();
                            d1Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(d1Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mc.b(d1Var, uri, (df3.bar) null, 14), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i4 = 3;
        this.l0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: c03.baz
            public final /* synthetic */ com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, java.lang.Object, com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity, androidx.appcompat.app.AppCompatActivity] */
            public final void onActivityResult(java.lang.Object obj) {
                android.content.Intent intent;
                android.os.Parcelable[] parcelableArrayExtra;
                java.util.List c;
                android.content.Intent intent2;
                android.net.Uri uri;
                int i22 = i4;
                android.os.Parcelable[] parcelableArr = null;
                ?? r5 = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.app.Activity activity = r5.t0().q;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
                            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.truecaller.userverification.impl.ui.UserVerificationActivity.class));
                            return;
                        }
                        return;
                    case 1:
                        int i42 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "configs", com.truecaller.rewardprogram.api.model.ProgressConfig.class);
                            } else {
                                parcelableArrayExtra = intent.getParcelableArrayExtra("configs");
                            }
                            if (parcelableArrayExtra != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                                for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                    if (parcelable != null) {
                                        arrayList.add((com.truecaller.rewardprogram.api.model.ProgressConfig) parcelable);
                                    } else {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.rewardprogram.api.model.ProgressConfig");
                                    }
                                }
                                parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.rewardprogram.api.model.ProgressConfig[0]);
                            }
                            com.truecaller.rewardprogram.api.model.ProgressConfig[] progressConfigArr = (com.truecaller.rewardprogram.api.model.ProgressConfig[]) parcelableArr;
                            if (progressConfigArr != null && (c = kotlin.collections.t.c(progressConfigArr)) != null && !c.isEmpty()) {
                                lz2.qux t0 = r5.t0();
                                android.view.View findViewById = r5.findViewById(android.R.id.content);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById, "view");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "configs");
                                t0.f.L(findViewById, new hk2.h(c), com.truecaller.rewardprogram.api.RewardProgramSource.USERS_HOME);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        int i5 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                            r5.startActivity(new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.premium.insurance.ui.InsuranceActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i6 = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent2 = activityResult.b) != null && (uri = (android.net.Uri) intent2.getParcelableExtra("cropImageUriResult")) != null) {
                            mz2.d1 d1Var = (mz2.d1) r5.h0.getValue();
                            d1Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(d1Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mc.b(d1Var, uri, (df3.bar) null, 14), 3);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void L1(a82.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "result");
        ((mz2.d1) this.h0.getValue()).z(new mz2.h0(dVar));
    }

    public final void W1(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        mz2.d1 d1Var = (mz2.d1) this.h0.getValue();
        d1Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        fg3.h0.J(androidx.lifecycle.g1.l(d1Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mc.b(d1Var, uri, (df3.bar) null, 14), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.usershome.presentaion.ui.screen.Hilt_UsersHomeActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(-748408603, new c03.bar(this, 0), true));
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a10.n(this, (df3.bar) null, 28), 3);
        a82.baz bazVar = this.g0;
        if (bazVar != null) {
            bazVar.a(this);
            pe0.j.t(this, ((mz2.d1) this.h0.getValue()).x, new a32.e(this, 11));
        } else {
            kotlin.jvm.internal.Intrinsics.n("photoCropHelper");
            throw null;
        }
    }

    public final lz2.qux t0() {
        lz2.qux quxVar = this.d0;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("usersHomeNavigationHelper");
        throw null;
    }
}
