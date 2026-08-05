package com.truecaller.messaging.urgent.conversations;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/messaging/urgent/conversations/UrgentConversationsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lq42/d;", "Lp02/o5;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UrgentConversationsActivity extends com.truecaller.messaging.urgent.conversations.Hilt_UrgentConversationsActivity implements q42.d, p02.o5 {
    public static final /* synthetic */ int o0 = 0;
    public q42.e d0;
    public q42.baz e0;
    public q42.baz f0;
    public r42.d h0;
    public n00.c i0;
    public n00.c j0;
    public p02.s0 k0;
    public final kotlin.Lazy g0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 29));
    public final android.os.Handler l0 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final androidx.room.r m0 = new androidx.room.r(this, 5);
    public final o83.b n0 = new o83.b(this, 17);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.urgent.conversations.Hilt_UrgentConversationsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        final int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        getWindow().setBackgroundDrawableResource(2131231351);
        getWindow().setStatusBarColor(getColor(2131102033));
        getWindow().setNavigationBarColor(getColor(2131102033));
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        final int i2 = 0;
        yy.qux.k(window, false);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        getWindow().setFlags(2621440, 2621440);
        setContentView(t0().a);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = t0().a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ak.r0.p(constraintLayout, new j03.baz(29));
        q42.baz bazVar = this.e0;
        android.view.ViewGroup viewGroup = null;
        if (bazVar != null) {
            n00.c cVar = new n00.c(new n00.l(bazVar, 2131559876, new kotlin.jvm.functions.Function1(this) { // from class: q42.a
                public final /* synthetic */ com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity b;

                {
                    this.b = this;
                }

                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i3 = i2;
                    com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity urgentConversationsActivity = this.b;
                    android.view.View view = (android.view.View) obj;
                    switch (i3) {
                        case 0:
                            int i4 = com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity.o0;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "it");
                            n00.c cVar2 = urgentConversationsActivity.i0;
                            if (cVar2 != null) {
                                return new q42.qux(view, cVar2);
                            }
                            kotlin.jvm.internal.Intrinsics.n("adapter");
                            throw null;
                        default:
                            int i5 = com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity.o0;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "it");
                            n00.c cVar3 = urgentConversationsActivity.j0;
                            if (cVar3 != null) {
                                return new q42.qux(view, cVar3);
                            }
                            kotlin.jvm.internal.Intrinsics.n("overflowAdapter");
                            throw null;
                    }
                }
            }, new ph0.qux(16)));
            this.i0 = cVar;
            cVar.setHasStableIds(true);
            androidx.recyclerview.widget.RecyclerView recyclerView = t0().f;
            n00.c cVar2 = this.i0;
            if (cVar2 != null) {
                recyclerView.setAdapter(cVar2);
                q42.baz bazVar2 = this.f0;
                if (bazVar2 != null) {
                    bazVar2.g = true;
                    if (bazVar2 != null) {
                        n00.c cVar3 = new n00.c(new n00.l(bazVar2, 2131559876, new kotlin.jvm.functions.Function1(this) { // from class: q42.a
                            public final /* synthetic */ com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity b;

                            {
                                this.b = this;
                            }

                            public final java.lang.Object invoke(java.lang.Object obj) {
                                int i3 = i;
                                com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity urgentConversationsActivity = this.b;
                                android.view.View view = (android.view.View) obj;
                                switch (i3) {
                                    case 0:
                                        int i4 = com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity.o0;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "it");
                                        n00.c cVar22 = urgentConversationsActivity.i0;
                                        if (cVar22 != null) {
                                            return new q42.qux(view, cVar22);
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("adapter");
                                        throw null;
                                    default:
                                        int i5 = com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity.o0;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "it");
                                        n00.c cVar32 = urgentConversationsActivity.j0;
                                        if (cVar32 != null) {
                                            return new q42.qux(view, cVar32);
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("overflowAdapter");
                                        throw null;
                                }
                            }
                        }, new ph0.qux(17)));
                        this.j0 = cVar3;
                        cVar3.setHasStableIds(true);
                        androidx.recyclerview.widget.RecyclerView recyclerView2 = t0().e;
                        n00.c cVar4 = this.j0;
                        if (cVar4 != null) {
                            recyclerView2.setAdapter(cVar4);
                            u0().a = this;
                            t0().b.setOnClickListener(new pn0.a(this, 6));
                            android.view.View findViewById = findViewById(2131362036);
                            android.view.ViewParent parent = findViewById.getParent();
                            if (parent instanceof android.view.ViewGroup) {
                                viewGroup = (android.view.ViewGroup) parent;
                            }
                            if (viewGroup == null) {
                                return;
                            }
                            viewGroup.removeView(findViewById);
                            android.view.View findViewById2 = findViewById(2131362037);
                            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                            android.view.ViewParent parent2 = findViewById2.getParent();
                            kotlin.jvm.internal.Intrinsics.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent2;
                            viewGroup2.removeView(findViewById2);
                            viewGroup2.addView(findViewById, layoutParams);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("overflowAdapter");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("overflowItemPresenter");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("overflowItemPresenter");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("adapter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("itemPresenter");
        throw null;
    }

    @Override // com.truecaller.messaging.urgent.conversations.Hilt_UrgentConversationsActivity
    public final void onDestroy() {
        super.onDestroy();
        u0().a = null;
        this.l0.removeCallbacks(this.n0);
        t0().f.setAdapter((androidx.recyclerview.widget.h1) null);
        t0().e.setAdapter((androidx.recyclerview.widget.h1) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        bindService(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.messaging.urgent.service.UrgentMessageService.class), this.m0, 0);
        android.os.Handler handler = this.l0;
        o83.b bVar = this.n0;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStop() {
        super.onStop();
        unbindService(this.m0);
        w0();
    }

    public final d91.f t0() {
        return (d91.f) this.g0.getValue();
    }

    public final q42.e u0() {
        q42.e eVar = this.d0;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void v0() {
        n00.c cVar = this.i0;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
            n00.c cVar2 = this.j0;
            if (cVar2 != null) {
                cVar2.notifyDataSetChanged();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("overflowAdapter");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("adapter");
        throw null;
    }

    public final void w0() {
        r42.d dVar = this.h0;
        if (dVar == null) {
            return;
        }
        this.h0 = null;
        q42.e u0 = u0();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0, "listener");
        r42.f fVar = (r42.f) dVar.a.get();
        if (fVar != null) {
            java.util.LinkedHashSet linkedHashSet = fVar.m;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0, "listener");
            linkedHashSet.remove(u0);
            if (linkedHashSet.isEmpty()) {
                java.util.ArrayList arrayList = fVar.l;
                if (arrayList == null || !arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!fVar.d2((com.truecaller.messaging.urgent.UrgentConversation) it.next())) {
                            fVar.a1(-1L);
                            r42.j jVar = (r42.j) ((com.truecaller.sdk.bar) fVar).a;
                            if (jVar != null) {
                                gj.m.k0(jVar.c, true);
                            }
                        }
                    }
                }
                fVar.e2(false);
            }
        }
        ((of0.a) u0()).b = null;
    }
}
