package com.truecaller.contacteditor.impl.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/contacteditor/impl/ui/ContactEditorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "La82/qux;", "Lf71/y;", "Lf71/baz;", "La82/bar;", "Le41/v;", "<init>", "()V", "e01/baz", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactEditorActivity extends com.truecaller.contacteditor.impl.ui.Hilt_ContactEditorActivity implements a82.qux, f71.y, f71.baz, a82.bar, e41.v {
    public static final /* synthetic */ int p0 = 0;
    public ag0.qux d0;
    public bv.c e0;
    public javax.inject.Provider f0;
    public f71.k g0;
    public nd1.bar h0;
    public a82.baz i0;
    public a53.bar j0;
    public e71.bar k0;
    public final androidx.lifecycle.o1 l0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(f71.x.class), new f71.f(this, 1), new f71.f(this, 0), new f71.f(this, 2));
    public final g.baz m0;
    public final g.baz n0;
    public final g.baz o0;

    public ContactEditorActivity() {
        final int i = 0;
        this.m0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: f71.a
            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

            {
                this.b = this;
            }

            public final void onActivityResult(java.lang.Object obj) {
                android.net.Uri uri;
                android.content.Intent intent;
                android.net.Uri uri2;
                int i2 = i;
                df3.bar barVar = null;
                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        int i4 = activityResult.a;
                        if (i4 != -1) {
                            if (i4 != 0) {
                                if (i4 == 3 || i4 == 5001) {
                                    f71.x u0 = contactEditorActivity.u0();
                                    u0.getClass();
                                    fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar, 5), 3);
                                    return;
                                }
                                return;
                            }
                            f71.x u03 = contactEditorActivity.u0();
                            u03.H = false;
                            if (u03.K) {
                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar, 10), 3);
                                return;
                            }
                            return;
                        }
                        android.content.Intent intent2 = activityResult.b;
                        if (intent2 != null) {
                            uri = intent2.getData();
                        } else {
                            uri = null;
                        }
                        f71.x u04 = contactEditorActivity.u0();
                        if (uri != null) {
                            u04.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "contactUri");
                            fg3.h0.J(androidx.lifecycle.g1.l(u04), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.profile.impl.remote.e(u04, uri, (df3.bar) null, 19), 3);
                            return;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        int i5 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "it");
                        f71.x u05 = contactEditorActivity.u0();
                        u05.getClass();
                        fg3.h0.J(androidx.lifecycle.g1.l(u05), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u05, barVar, 9), 3);
                        return;
                    default:
                        int i6 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (uri2 = (android.net.Uri) intent.getParcelableExtra("cropImageUriResult")) != null) {
                            f71.x u06 = contactEditorActivity.u0();
                            u06.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(u06), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.v(u06, uri2, barVar, 1), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        this.n0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: f71.a
            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

            {
                this.b = this;
            }

            public final void onActivityResult(java.lang.Object obj) {
                android.net.Uri uri;
                android.content.Intent intent;
                android.net.Uri uri2;
                int i22 = i2;
                df3.bar barVar = null;
                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        int i4 = activityResult.a;
                        if (i4 != -1) {
                            if (i4 != 0) {
                                if (i4 == 3 || i4 == 5001) {
                                    f71.x u0 = contactEditorActivity.u0();
                                    u0.getClass();
                                    fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar, 5), 3);
                                    return;
                                }
                                return;
                            }
                            f71.x u03 = contactEditorActivity.u0();
                            u03.H = false;
                            if (u03.K) {
                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar, 10), 3);
                                return;
                            }
                            return;
                        }
                        android.content.Intent intent2 = activityResult.b;
                        if (intent2 != null) {
                            uri = intent2.getData();
                        } else {
                            uri = null;
                        }
                        f71.x u04 = contactEditorActivity.u0();
                        if (uri != null) {
                            u04.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "contactUri");
                            fg3.h0.J(androidx.lifecycle.g1.l(u04), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.profile.impl.remote.e(u04, uri, (df3.bar) null, 19), 3);
                            return;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        int i5 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "it");
                        f71.x u05 = contactEditorActivity.u0();
                        u05.getClass();
                        fg3.h0.J(androidx.lifecycle.g1.l(u05), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u05, barVar, 9), 3);
                        return;
                    default:
                        int i6 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (uri2 = (android.net.Uri) intent.getParcelableExtra("cropImageUriResult")) != null) {
                            f71.x u06 = contactEditorActivity.u0();
                            u06.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(u06), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.v(u06, uri2, barVar, 1), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 2;
        this.o0 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: f71.a
            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

            {
                this.b = this;
            }

            public final void onActivityResult(java.lang.Object obj) {
                android.net.Uri uri;
                android.content.Intent intent;
                android.net.Uri uri2;
                int i22 = i3;
                df3.bar barVar = null;
                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i33 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        int i4 = activityResult.a;
                        if (i4 != -1) {
                            if (i4 != 0) {
                                if (i4 == 3 || i4 == 5001) {
                                    f71.x u0 = contactEditorActivity.u0();
                                    u0.getClass();
                                    fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar, 5), 3);
                                    return;
                                }
                                return;
                            }
                            f71.x u03 = contactEditorActivity.u0();
                            u03.H = false;
                            if (u03.K) {
                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar, 10), 3);
                                return;
                            }
                            return;
                        }
                        android.content.Intent intent2 = activityResult.b;
                        if (intent2 != null) {
                            uri = intent2.getData();
                        } else {
                            uri = null;
                        }
                        f71.x u04 = contactEditorActivity.u0();
                        if (uri != null) {
                            u04.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "contactUri");
                            fg3.h0.J(androidx.lifecycle.g1.l(u04), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.profile.impl.remote.e(u04, uri, (df3.bar) null, 19), 3);
                            return;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        int i5 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "it");
                        f71.x u05 = contactEditorActivity.u0();
                        u05.getClass();
                        fg3.h0.J(androidx.lifecycle.g1.l(u05), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u05, barVar, 9), 3);
                        return;
                    default:
                        int i6 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (uri2 = (android.net.Uri) intent.getParcelableExtra("cropImageUriResult")) != null) {
                            f71.x u06 = contactEditorActivity.u0();
                            u06.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "uri");
                            fg3.h0.J(androidx.lifecycle.g1.l(u06), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.v(u06, uri2, barVar, 1), 3);
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a82.qux
    public final void L1(a82.d dVar) {
        java.lang.Object value;
        h71.u a;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "result");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
        android.view.View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            gj.m.v0(currentFocus, 2, false);
        }
        f71.x u0 = u0();
        u0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "photoPickerResult");
        if (kotlin.jvm.internal.Intrinsics.b(dVar, a82.b.a)) {
            ig3.h2 h2Var = u0.x;
            do {
                value = h2Var.getValue();
                a = h71.u.a((h71.u) value, null, null, null, null, null, null, null, false, null, null, 32761);
                java.util.List list = a.f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber) it.next()).b;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                boolean r = f71.x.r(u0, arrayList);
                h71.a aVar = u0.D;
                if (!kotlin.jvm.internal.Intrinsics.b(aVar, h71.bar.a) && !(aVar instanceof h71.baz)) {
                    if (!(aVar instanceof h71.qux)) {
                        throw new java.lang.RuntimeException();
                    }
                } else if (f71.x.q(u0, a) && r) {
                    r = true;
                } else {
                    z = false;
                }
                z = r;
            } while (!h2Var.n(value, h71.u.a(a, null, null, null, null, null, null, null, z, null, null, 32511)));
            return;
        }
        df3.bar barVar = null;
        if (dVar instanceof a82.a) {
            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.t(u0, dVar, barVar, 0), 3);
        } else {
            if (dVar instanceof a82.c) {
                fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.t(u0, dVar, barVar, 1), 3);
                return;
            }
            throw new java.lang.RuntimeException();
        }
    }

    public final void L3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
    }

    @Override // a82.bar
    public final void W1(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        f71.x u0 = u0();
        u0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.v(u0, uri, null, 1), 3);
    }

    public final void e2(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null && tag.hashCode() == 2000315834 && tag.equals("TAG_UNSAVED_CHANGES_DIALOG")) {
            f71.x u0 = u0();
            u0.getClass();
            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, null, 7), 3);
        }
    }

    public final void f3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            df3.bar barVar = null;
            if (hashCode != 310632317) {
                if (hashCode == 2000315834 && tag.equals("TAG_UNSAVED_CHANGES_DIALOG")) {
                    f71.x u0 = u0();
                    u0.getClass();
                    if (!u0.H) {
                        if (!((h71.u) u0.x.getValue()).i) {
                            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar, 1), 3);
                            kotlin.Unit unit = kotlin.Unit.a;
                            return;
                        } else {
                            u0.x(new f71.m(u0, 0));
                            kotlin.Unit unit2 = kotlin.Unit.a;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (tag.equals("TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG")) {
                f71.x u03 = u0();
                ag0.qux quxVar = u03.m;
                quxVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("removeConfirmation", "action");
                nc0.u1.e(new rc0.b("removeConfirmation", (java.lang.String) null, "InAppContactEditor"), quxVar.a);
                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar, 11), 3);
            }
        }
    }

    public final void k4(java.lang.String str, com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.contacteditor.impl.ui.Hilt_ContactEditorActivity
    public final void onCreate(android.os.Bundle bundle) {
        androidx.recyclerview.widget.q qVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        final int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        final int i2 = 0;
        androidx.coordinatorlayout.widget.CoordinatorLayout inflate = getLayoutInflater().inflate(2131558463, (android.view.ViewGroup) null, false);
        int i3 = 2131361869;
        if (((android.widget.LinearLayout) df0.qux.o(2131361869, inflate)) != null) {
            i3 = 2131361871;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131361871, inflate);
            if (textView != null) {
                i3 = 2131362184;
                android.widget.Button button = (android.widget.Button) df0.qux.o(2131362184, inflate);
                if (button != null) {
                    i3 = 2131362185;
                    android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131362185, inflate);
                    if (textView2 != null) {
                        i3 = 2131362186;
                        android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131362186, inflate);
                        if (textView3 != null) {
                            i3 = 2131362267;
                            com.google.android.material.appbar.AppBarLayout o = df0.qux.o(2131362267, inflate);
                            if (o != null) {
                                i3 = 2131363151;
                                androidx.constraintlayout.widget.ConstraintLayout o2 = df0.qux.o(2131363151, inflate);
                                if (o2 != null) {
                                    i3 = 2131363617;
                                    android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131363617, inflate);
                                    if (textView4 != null) {
                                        i3 = 2131363940;
                                        com.google.android.material.textfield.TextInputEditText o3 = df0.qux.o(2131363940, inflate);
                                        if (o3 != null) {
                                            i3 = 2131364903;
                                            com.google.android.material.textfield.TextInputEditText o4 = df0.qux.o(2131364903, inflate);
                                            if (o4 != null) {
                                                i3 = 2131365423;
                                                android.view.View o5 = df0.qux.o(2131365423, inflate);
                                                if (o5 != null) {
                                                    i3 = 2131365424;
                                                    if (((android.widget.ImageView) df0.qux.o(2131365424, inflate)) != null) {
                                                        i3 = 2131365425;
                                                        if (df0.qux.o(2131365425, inflate) != null) {
                                                            i3 = 2131365426;
                                                            android.widget.CheckBox checkBox = (android.widget.CheckBox) df0.qux.o(2131365426, inflate);
                                                            if (checkBox != null) {
                                                                i3 = 2131365722;
                                                                if (df0.qux.o(2131365722, inflate) != null) {
                                                                    i3 = 2131365724;
                                                                    com.google.android.material.imageview.ShapeableImageView o6 = df0.qux.o(2131365724, inflate);
                                                                    if (o6 != null) {
                                                                        i3 = 2131365727;
                                                                        if (df0.qux.o(2131365727, inflate) != null) {
                                                                            i3 = 2131365728;
                                                                            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131365728, inflate);
                                                                            if (imageView != null) {
                                                                                i3 = 2131366051;
                                                                                android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131366051, inflate);
                                                                                if (button2 != null) {
                                                                                    i3 = 2131366205;
                                                                                    androidx.recyclerview.widget.RecyclerView o7 = df0.qux.o(2131366205, inflate);
                                                                                    if (o7 != null) {
                                                                                        i3 = 2131366230;
                                                                                        android.widget.TextView textView5 = (android.widget.TextView) df0.qux.o(2131366230, inflate);
                                                                                        if (textView5 != null) {
                                                                                            i3 = 2131366231;
                                                                                            android.widget.Button button3 = (android.widget.Button) df0.qux.o(2131366231, inflate);
                                                                                            if (button3 != null) {
                                                                                                i3 = 2131366233;
                                                                                                android.view.View o8 = df0.qux.o(2131366233, inflate);
                                                                                                if (o8 != null) {
                                                                                                    i3 = 2131366234;
                                                                                                    androidx.constraintlayout.widget.Group o9 = df0.qux.o(2131366234, inflate);
                                                                                                    if (o9 != null) {
                                                                                                        i3 = 2131366235;
                                                                                                        android.widget.TextView textView6 = (android.widget.TextView) df0.qux.o(2131366235, inflate);
                                                                                                        if (textView6 != null) {
                                                                                                            i3 = 2131366262;
                                                                                                            if (((android.widget.ScrollView) df0.qux.o(2131366262, inflate)) != null) {
                                                                                                                i3 = 2131367108;
                                                                                                                androidx.appcompat.widget.Toolbar o10 = df0.qux.o(2131367108, inflate);
                                                                                                                if (o10 != null) {
                                                                                                                    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = inflate;
                                                                                                                    e71.bar barVar = new e71.bar(coordinatorLayout, textView, button, textView2, textView3, o, o2, textView4, o3, o4, o5, checkBox, o6, imageView, button2, o7, textView5, button3, o8, o9, textView6, o10);
                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                                                                                                                    this.k0 = barVar;
                                                                                                                    setContentView(coordinatorLayout);
                                                                                                                    e71.bar barVar2 = this.k0;
                                                                                                                    if (barVar2 != null) {
                                                                                                                        com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) barVar2.n;
                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBar");
                                                                                                                        ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
                                                                                                                        e71.bar barVar3 = this.k0;
                                                                                                                        if (barVar3 != null) {
                                                                                                                            setSupportActionBar(barVar3.w);
                                                                                                                            i.baz supportActionBar = getSupportActionBar();
                                                                                                                            if (supportActionBar != null) {
                                                                                                                                supportActionBar.v(2131233387);
                                                                                                                                supportActionBar.p(true);
                                                                                                                                supportActionBar.t(true);
                                                                                                                                supportActionBar.A(2132020268);
                                                                                                                            }
                                                                                                                            e71.bar barVar4 = this.k0;
                                                                                                                            if (barVar4 != null) {
                                                                                                                                final int i4 = 5;
                                                                                                                                barVar4.w.setNavigationOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                    public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                    {
                                                                                                                                        this.b = this;
                                                                                                                                    }

                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                    public final void onClick(android.view.View view) {
                                                                                                                                        int i5 = i4;
                                                                                                                                        int i6 = 2;
                                                                                                                                        int i7 = 0;
                                                                                                                                        int i8 = 6;
                                                                                                                                        df3.bar barVar5 = null;
                                                                                                                                        int i9 = 3;
                                                                                                                                        com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                        switch (i5) {
                                                                                                                                            case 0:
                                                                                                                                                int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                u0.getClass();
                                                                                                                                                if (!u0.H) {
                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar5, 12), 3);
                                                                                                                                                    kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            case 1:
                                                                                                                                                int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                u03.getClass();
                                                                                                                                                if (!u03.H) {
                                                                                                                                                    if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar5, i6), 3);
                                                                                                                                                    } else {
                                                                                                                                                        u03.x(new f71.m(u03, i9));
                                                                                                                                                    }
                                                                                                                                                    kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            case 2:
                                                                                                                                                int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                u04.getClass();
                                                                                                                                                u04.x(new f71.m(u04, i7));
                                                                                                                                                return;
                                                                                                                                            case 3:
                                                                                                                                                int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                u05.getClass();
                                                                                                                                                u05.x(new f71.m(u05, i6));
                                                                                                                                                return;
                                                                                                                                            case 4:
                                                                                                                                                int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                contactEditorActivity.t0().p = true;
                                                                                                                                                f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                u06.getClass();
                                                                                                                                                u06.x(new f71.m(u06, 1));
                                                                                                                                                return;
                                                                                                                                            case 5:
                                                                                                                                                int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                if (!u07.H) {
                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar5, 8), 3);
                                                                                                                                                    kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            case 6:
                                                                                                                                                int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                u08.getClass();
                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar5, i7), 3);
                                                                                                                                                return;
                                                                                                                                            case 7:
                                                                                                                                                int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                    if (!u09.H) {
                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar5, i9), 3);
                                                                                                                                                        kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                if (!u09.H) {
                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar5, i8), 3);
                                                                                                                                                    kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            case 8:
                                                                                                                                                int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                if (!u010.H) {
                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar5, i9), 3);
                                                                                                                                                    kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            default:
                                                                                                                                                int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                if (!u011.H) {
                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar5, i8), 3);
                                                                                                                                                    kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                e71.bar barVar5 = this.k0;
                                                                                                                                if (barVar5 != null) {
                                                                                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = barVar5.b;
                                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "content");
                                                                                                                                    ak.r0.i(constraintLayout, com.truecaller.common.ui.insets.InsetType.Ime);
                                                                                                                                    e71.bar barVar6 = this.k0;
                                                                                                                                    if (barVar6 != null) {
                                                                                                                                        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout2 = barVar6.d;
                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "getRoot(...)");
                                                                                                                                        ak.r0.i(coordinatorLayout2, com.truecaller.common.ui.insets.InsetType.NavigationBar);
                                                                                                                                        final int i5 = 2;
                                                                                                                                        ge0.i.m(getOnBackPressedDispatcher(), this, new f71.c(this, i2), 2);
                                                                                                                                        a82.baz bazVar = this.i0;
                                                                                                                                        if (bazVar != null) {
                                                                                                                                            bazVar.a(this);
                                                                                                                                            e71.bar barVar7 = this.k0;
                                                                                                                                            if (barVar7 != null) {
                                                                                                                                                final int i6 = 7;
                                                                                                                                                barVar7.s.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                    public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                    {
                                                                                                                                                        this.b = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(android.view.View view) {
                                                                                                                                                        int i53 = i6;
                                                                                                                                                        int i63 = 2;
                                                                                                                                                        int i7 = 0;
                                                                                                                                                        int i8 = 6;
                                                                                                                                                        df3.bar barVar52 = null;
                                                                                                                                                        int i9 = 3;
                                                                                                                                                        com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                        switch (i53) {
                                                                                                                                                            case 0:
                                                                                                                                                                int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                u0.getClass();
                                                                                                                                                                if (!u0.H) {
                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                    kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                u03.getClass();
                                                                                                                                                                if (!u03.H) {
                                                                                                                                                                    if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                    } else {
                                                                                                                                                                        u03.x(new f71.m(u03, i9));
                                                                                                                                                                    }
                                                                                                                                                                    kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                u04.getClass();
                                                                                                                                                                u04.x(new f71.m(u04, i7));
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                u05.getClass();
                                                                                                                                                                u05.x(new f71.m(u05, i63));
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                contactEditorActivity.t0().p = true;
                                                                                                                                                                f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                u06.getClass();
                                                                                                                                                                u06.x(new f71.m(u06, 1));
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                if (!u07.H) {
                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                    kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                u08.getClass();
                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i7), 3);
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                    if (!u09.H) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i9), 3);
                                                                                                                                                                        kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                if (!u09.H) {
                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i8), 3);
                                                                                                                                                                    kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                if (!u010.H) {
                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i9), 3);
                                                                                                                                                                    kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                if (!u011.H) {
                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i8), 3);
                                                                                                                                                                    kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                e71.bar barVar8 = this.k0;
                                                                                                                                                if (barVar8 != null) {
                                                                                                                                                    final int i7 = 8;
                                                                                                                                                    ((android.widget.TextView) barVar8.g).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                        public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                        {
                                                                                                                                                            this.b = this;
                                                                                                                                                        }

                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                        public final void onClick(android.view.View view) {
                                                                                                                                                            int i53 = i7;
                                                                                                                                                            int i63 = 2;
                                                                                                                                                            int i72 = 0;
                                                                                                                                                            int i8 = 6;
                                                                                                                                                            df3.bar barVar52 = null;
                                                                                                                                                            int i9 = 3;
                                                                                                                                                            com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                            switch (i53) {
                                                                                                                                                                case 0:
                                                                                                                                                                    int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                    u0.getClass();
                                                                                                                                                                    if (!u0.H) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                        kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                    u03.getClass();
                                                                                                                                                                    if (!u03.H) {
                                                                                                                                                                        if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                        } else {
                                                                                                                                                                            u03.x(new f71.m(u03, i9));
                                                                                                                                                                        }
                                                                                                                                                                        kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                    u04.getClass();
                                                                                                                                                                    u04.x(new f71.m(u04, i72));
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                    u05.getClass();
                                                                                                                                                                    u05.x(new f71.m(u05, i63));
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    contactEditorActivity.t0().p = true;
                                                                                                                                                                    f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                    u06.getClass();
                                                                                                                                                                    u06.x(new f71.m(u06, 1));
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                    if (!u07.H) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                        kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                    com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                    f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                    u08.getClass();
                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                    if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                        if (!u09.H) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i9), 3);
                                                                                                                                                                            kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    if (!u09.H) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i8), 3);
                                                                                                                                                                        kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                    if (!u010.H) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i9), 3);
                                                                                                                                                                        kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                    f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                    if (!u011.H) {
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i8), 3);
                                                                                                                                                                        kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    e71.bar barVar9 = this.k0;
                                                                                                                                                    if (barVar9 != null) {
                                                                                                                                                        final int i8 = 9;
                                                                                                                                                        ((android.widget.TextView) barVar9.h).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                            {
                                                                                                                                                                this.b = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(android.view.View view) {
                                                                                                                                                                int i53 = i8;
                                                                                                                                                                int i63 = 2;
                                                                                                                                                                int i72 = 0;
                                                                                                                                                                int i82 = 6;
                                                                                                                                                                df3.bar barVar52 = null;
                                                                                                                                                                int i9 = 3;
                                                                                                                                                                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                switch (i53) {
                                                                                                                                                                    case 0:
                                                                                                                                                                        int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                        u0.getClass();
                                                                                                                                                                        if (!u0.H) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                            kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                        u03.getClass();
                                                                                                                                                                        if (!u03.H) {
                                                                                                                                                                            if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                            } else {
                                                                                                                                                                                u03.x(new f71.m(u03, i9));
                                                                                                                                                                            }
                                                                                                                                                                            kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    case 2:
                                                                                                                                                                        int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                        u04.getClass();
                                                                                                                                                                        u04.x(new f71.m(u04, i72));
                                                                                                                                                                        return;
                                                                                                                                                                    case 3:
                                                                                                                                                                        int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                        u05.getClass();
                                                                                                                                                                        u05.x(new f71.m(u05, i63));
                                                                                                                                                                        return;
                                                                                                                                                                    case 4:
                                                                                                                                                                        int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        contactEditorActivity.t0().p = true;
                                                                                                                                                                        f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                        u06.getClass();
                                                                                                                                                                        u06.x(new f71.m(u06, 1));
                                                                                                                                                                        return;
                                                                                                                                                                    case 5:
                                                                                                                                                                        int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                        if (!u07.H) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                            kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    case 6:
                                                                                                                                                                        int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                        com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                        f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                        u08.getClass();
                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                        return;
                                                                                                                                                                    case 7:
                                                                                                                                                                        int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                        if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                            if (!u09.H) {
                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i9), 3);
                                                                                                                                                                                kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        if (!u09.H) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                            kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    case 8:
                                                                                                                                                                        int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                        if (!u010.H) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i9), 3);
                                                                                                                                                                            kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    default:
                                                                                                                                                                        int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                        f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                        if (!u011.H) {
                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                            kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        e71.bar barVar10 = this.k0;
                                                                                                                                                        if (barVar10 != null) {
                                                                                                                                                            com.google.android.material.textfield.TextInputEditText textInputEditText = barVar10.o;
                                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputEditText, "firstNameEditText");
                                                                                                                                                            textInputEditText.addTextChangedListener(new f71.d(this, i2));
                                                                                                                                                            e71.bar barVar11 = this.k0;
                                                                                                                                                            if (barVar11 != null) {
                                                                                                                                                                com.google.android.material.textfield.TextInputEditText textInputEditText2 = barVar11.o;
                                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputEditText2, "firstNameEditText");
                                                                                                                                                                gj.m.t0(300L, textInputEditText2, true);
                                                                                                                                                                e71.bar barVar12 = this.k0;
                                                                                                                                                                if (barVar12 != null) {
                                                                                                                                                                    com.google.android.material.textfield.TextInputEditText textInputEditText3 = barVar12.p;
                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputEditText3, "lastNameEditText");
                                                                                                                                                                    textInputEditText3.addTextChangedListener(new f71.d(this, i));
                                                                                                                                                                    e71.bar barVar13 = this.k0;
                                                                                                                                                                    if (barVar13 != null) {
                                                                                                                                                                        ((android.widget.TextView) barVar13.e).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                                            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                                            {
                                                                                                                                                                                this.b = this;
                                                                                                                                                                            }

                                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                                            public final void onClick(android.view.View view) {
                                                                                                                                                                                int i53 = i2;
                                                                                                                                                                                int i63 = 2;
                                                                                                                                                                                int i72 = 0;
                                                                                                                                                                                int i82 = 6;
                                                                                                                                                                                df3.bar barVar52 = null;
                                                                                                                                                                                int i9 = 3;
                                                                                                                                                                                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                                switch (i53) {
                                                                                                                                                                                    case 0:
                                                                                                                                                                                        int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                                        u0.getClass();
                                                                                                                                                                                        if (!u0.H) {
                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                                            kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 1:
                                                                                                                                                                                        int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                                        u03.getClass();
                                                                                                                                                                                        if (!u03.H) {
                                                                                                                                                                                            if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                                            } else {
                                                                                                                                                                                                u03.x(new f71.m(u03, i9));
                                                                                                                                                                                            }
                                                                                                                                                                                            kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 2:
                                                                                                                                                                                        int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                                        u04.getClass();
                                                                                                                                                                                        u04.x(new f71.m(u04, i72));
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 3:
                                                                                                                                                                                        int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                                        u05.getClass();
                                                                                                                                                                                        u05.x(new f71.m(u05, i63));
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 4:
                                                                                                                                                                                        int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        contactEditorActivity.t0().p = true;
                                                                                                                                                                                        f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                                        u06.getClass();
                                                                                                                                                                                        u06.x(new f71.m(u06, 1));
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 5:
                                                                                                                                                                                        int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                                        if (!u07.H) {
                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                                            kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 6:
                                                                                                                                                                                        int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                                        com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                                        f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                                        u08.getClass();
                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 7:
                                                                                                                                                                                        int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                                        if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                                            if (!u09.H) {
                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i9), 3);
                                                                                                                                                                                                kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                                return;
                                                                                                                                                                                            }
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!u09.H) {
                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                                            kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    case 8:
                                                                                                                                                                                        int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                                        if (!u010.H) {
                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i9), 3);
                                                                                                                                                                                            kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    default:
                                                                                                                                                                                        int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                        f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                                        if (!u011.H) {
                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                                            kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                                            return;
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        });
                                                                                                                                                                        e71.bar barVar14 = this.k0;
                                                                                                                                                                        if (barVar14 != null) {
                                                                                                                                                                            final int i9 = 4;
                                                                                                                                                                            ((android.widget.CheckBox) barVar14.r).setOnCheckedChangeListener(new aq2.r(this, 4));
                                                                                                                                                                            e71.bar barVar15 = this.k0;
                                                                                                                                                                            if (barVar15 != null) {
                                                                                                                                                                                ((android.widget.Button) barVar15.k).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                                                    public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                                                    {
                                                                                                                                                                                        this.b = this;
                                                                                                                                                                                    }

                                                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                                                    public final void onClick(android.view.View view) {
                                                                                                                                                                                        int i53 = i;
                                                                                                                                                                                        int i63 = 2;
                                                                                                                                                                                        int i72 = 0;
                                                                                                                                                                                        int i82 = 6;
                                                                                                                                                                                        df3.bar barVar52 = null;
                                                                                                                                                                                        int i93 = 3;
                                                                                                                                                                                        com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                                        switch (i53) {
                                                                                                                                                                                            case 0:
                                                                                                                                                                                                int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                                                u0.getClass();
                                                                                                                                                                                                if (!u0.H) {
                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                                                    kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 1:
                                                                                                                                                                                                int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                                                u03.getClass();
                                                                                                                                                                                                if (!u03.H) {
                                                                                                                                                                                                    if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        u03.x(new f71.m(u03, i93));
                                                                                                                                                                                                    }
                                                                                                                                                                                                    kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 2:
                                                                                                                                                                                                int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                                                u04.getClass();
                                                                                                                                                                                                u04.x(new f71.m(u04, i72));
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 3:
                                                                                                                                                                                                int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                                                u05.getClass();
                                                                                                                                                                                                u05.x(new f71.m(u05, i63));
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 4:
                                                                                                                                                                                                int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                contactEditorActivity.t0().p = true;
                                                                                                                                                                                                f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                                                u06.getClass();
                                                                                                                                                                                                u06.x(new f71.m(u06, 1));
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 5:
                                                                                                                                                                                                int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                                                if (!u07.H) {
                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                                                    kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 6:
                                                                                                                                                                                                int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                                                com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                                                f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                                                u08.getClass();
                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 7:
                                                                                                                                                                                                int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                                                if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                                                    if (!u09.H) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i93), 3);
                                                                                                                                                                                                        kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!u09.H) {
                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                                                    kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 8:
                                                                                                                                                                                                int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                                                if (!u010.H) {
                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i93), 3);
                                                                                                                                                                                                    kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                return;
                                                                                                                                                                                            default:
                                                                                                                                                                                                int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                                                if (!u011.H) {
                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                                                    kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                                                    return;
                                                                                                                                                                                                }
                                                                                                                                                                                                return;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                });
                                                                                                                                                                                e71.bar barVar16 = this.k0;
                                                                                                                                                                                if (barVar16 != null) {
                                                                                                                                                                                    ((android.widget.Button) barVar16.m).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                                                        public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                                                        {
                                                                                                                                                                                            this.b = this;
                                                                                                                                                                                        }

                                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                                        public final void onClick(android.view.View view) {
                                                                                                                                                                                            int i53 = i5;
                                                                                                                                                                                            int i63 = 2;
                                                                                                                                                                                            int i72 = 0;
                                                                                                                                                                                            int i82 = 6;
                                                                                                                                                                                            df3.bar barVar52 = null;
                                                                                                                                                                                            int i93 = 3;
                                                                                                                                                                                            com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                                            switch (i53) {
                                                                                                                                                                                                case 0:
                                                                                                                                                                                                    int i10 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                                                    u0.getClass();
                                                                                                                                                                                                    if (!u0.H) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                                                        kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 1:
                                                                                                                                                                                                    int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                                                    u03.getClass();
                                                                                                                                                                                                    if (!u03.H) {
                                                                                                                                                                                                        if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            u03.x(new f71.m(u03, i93));
                                                                                                                                                                                                        }
                                                                                                                                                                                                        kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 2:
                                                                                                                                                                                                    int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                                                    u04.getClass();
                                                                                                                                                                                                    u04.x(new f71.m(u04, i72));
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 3:
                                                                                                                                                                                                    int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                                                    u05.getClass();
                                                                                                                                                                                                    u05.x(new f71.m(u05, i63));
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 4:
                                                                                                                                                                                                    int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    contactEditorActivity.t0().p = true;
                                                                                                                                                                                                    f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                                                    u06.getClass();
                                                                                                                                                                                                    u06.x(new f71.m(u06, 1));
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 5:
                                                                                                                                                                                                    int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                                                    if (!u07.H) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                                                        kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 6:
                                                                                                                                                                                                    int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                                                    com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                                                    f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                                                    u08.getClass();
                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 7:
                                                                                                                                                                                                    int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                                                    if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                                                        if (!u09.H) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i93), 3);
                                                                                                                                                                                                            kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!u09.H) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                                                        kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                                case 8:
                                                                                                                                                                                                    int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                                                    if (!u010.H) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i93), 3);
                                                                                                                                                                                                        kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                                default:
                                                                                                                                                                                                    int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                    f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                                                    if (!u011.H) {
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                                                        kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    e71.bar barVar17 = this.k0;
                                                                                                                                                                                    if (barVar17 != null) {
                                                                                                                                                                                        final int i10 = 3;
                                                                                                                                                                                        ((android.widget.TextView) barVar17.j).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                                                            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                                                            {
                                                                                                                                                                                                this.b = this;
                                                                                                                                                                                            }

                                                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                                                            public final void onClick(android.view.View view) {
                                                                                                                                                                                                int i53 = i10;
                                                                                                                                                                                                int i63 = 2;
                                                                                                                                                                                                int i72 = 0;
                                                                                                                                                                                                int i82 = 6;
                                                                                                                                                                                                df3.bar barVar52 = null;
                                                                                                                                                                                                int i93 = 3;
                                                                                                                                                                                                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                                                switch (i53) {
                                                                                                                                                                                                    case 0:
                                                                                                                                                                                                        int i102 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                                                        u0.getClass();
                                                                                                                                                                                                        if (!u0.H) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                                                            kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 1:
                                                                                                                                                                                                        int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                                                        u03.getClass();
                                                                                                                                                                                                        if (!u03.H) {
                                                                                                                                                                                                            if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                u03.x(new f71.m(u03, i93));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 2:
                                                                                                                                                                                                        int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                                                        u04.getClass();
                                                                                                                                                                                                        u04.x(new f71.m(u04, i72));
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 3:
                                                                                                                                                                                                        int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                                                        u05.getClass();
                                                                                                                                                                                                        u05.x(new f71.m(u05, i63));
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 4:
                                                                                                                                                                                                        int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        contactEditorActivity.t0().p = true;
                                                                                                                                                                                                        f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                                                        u06.getClass();
                                                                                                                                                                                                        u06.x(new f71.m(u06, 1));
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 5:
                                                                                                                                                                                                        int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                                                        if (!u07.H) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                                                            kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 6:
                                                                                                                                                                                                        int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                                                        com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                                                        f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                                                        u08.getClass();
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 7:
                                                                                                                                                                                                        int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                                                        if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                                                            if (!u09.H) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i93), 3);
                                                                                                                                                                                                                kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!u09.H) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                                                            kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    case 8:
                                                                                                                                                                                                        int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                                                        if (!u010.H) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i93), 3);
                                                                                                                                                                                                            kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                        f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                                                        if (!u011.H) {
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                                                            kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        });
                                                                                                                                                                                        e71.bar barVar18 = this.k0;
                                                                                                                                                                                        if (barVar18 != null) {
                                                                                                                                                                                            ((android.widget.TextView) barVar18.f).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                                                                public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                                                                {
                                                                                                                                                                                                    this.b = this;
                                                                                                                                                                                                }

                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                public final void onClick(android.view.View view) {
                                                                                                                                                                                                    int i53 = i9;
                                                                                                                                                                                                    int i63 = 2;
                                                                                                                                                                                                    int i72 = 0;
                                                                                                                                                                                                    int i82 = 6;
                                                                                                                                                                                                    df3.bar barVar52 = null;
                                                                                                                                                                                                    int i93 = 3;
                                                                                                                                                                                                    com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                                                    switch (i53) {
                                                                                                                                                                                                        case 0:
                                                                                                                                                                                                            int i102 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                                                            u0.getClass();
                                                                                                                                                                                                            if (!u0.H) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                                                                kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 1:
                                                                                                                                                                                                            int i11 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                                                            u03.getClass();
                                                                                                                                                                                                            if (!u03.H) {
                                                                                                                                                                                                                if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    u03.x(new f71.m(u03, i93));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 2:
                                                                                                                                                                                                            int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                                                            u04.getClass();
                                                                                                                                                                                                            u04.x(new f71.m(u04, i72));
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 3:
                                                                                                                                                                                                            int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                                                            u05.getClass();
                                                                                                                                                                                                            u05.x(new f71.m(u05, i63));
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 4:
                                                                                                                                                                                                            int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            contactEditorActivity.t0().p = true;
                                                                                                                                                                                                            f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                                                            u06.getClass();
                                                                                                                                                                                                            u06.x(new f71.m(u06, 1));
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 5:
                                                                                                                                                                                                            int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                                                            if (!u07.H) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                                                                kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 6:
                                                                                                                                                                                                            int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                                                            com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                                                            f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                                                            u08.getClass();
                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 7:
                                                                                                                                                                                                            int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                                                            if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                                                                if (!u09.H) {
                                                                                                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i93), 3);
                                                                                                                                                                                                                    kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!u09.H) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                                                                kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        case 8:
                                                                                                                                                                                                            int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                                                            if (!u010.H) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i93), 3);
                                                                                                                                                                                                                kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        default:
                                                                                                                                                                                                            int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                            f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                                                            if (!u011.H) {
                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                                                                kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                            f71.k t0 = t0();
                                                                                                                                                                                            f71.c cVar = new f71.c(this, i);
                                                                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                                                                                                                                                                                            t0.n = cVar;
                                                                                                                                                                                            f71.k t03 = t0();
                                                                                                                                                                                            f71.c cVar2 = new f71.c(this, i5);
                                                                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
                                                                                                                                                                                            t03.o = cVar2;
                                                                                                                                                                                            e71.bar barVar19 = this.k0;
                                                                                                                                                                                            if (barVar19 != null) {
                                                                                                                                                                                                androidx.recyclerview.widget.q itemAnimator = barVar19.u.getItemAnimator();
                                                                                                                                                                                                if (itemAnimator instanceof androidx.recyclerview.widget.q) {
                                                                                                                                                                                                    qVar = itemAnimator;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    qVar = null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (qVar != null) {
                                                                                                                                                                                                    qVar.g = false;
                                                                                                                                                                                                }
                                                                                                                                                                                                e71.bar barVar20 = this.k0;
                                                                                                                                                                                                if (barVar20 != null) {
                                                                                                                                                                                                    androidx.recyclerview.widget.RecyclerView recyclerView = barVar20.u;
                                                                                                                                                                                                    f71.k t04 = t0();
                                                                                                                                                                                                    t04.setHasStableIds(true);
                                                                                                                                                                                                    recyclerView.setAdapter(t04);
                                                                                                                                                                                                    e71.bar barVar21 = this.k0;
                                                                                                                                                                                                    if (barVar21 != null) {
                                                                                                                                                                                                        final int i11 = 6;
                                                                                                                                                                                                        ((android.widget.Button) barVar21.l).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: f71.b
                                                                                                                                                                                                            public final /* synthetic */ com.truecaller.contacteditor.impl.ui.ContactEditorActivity b;

                                                                                                                                                                                                            {
                                                                                                                                                                                                                this.b = this;
                                                                                                                                                                                                            }

                                                                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                                                                            public final void onClick(android.view.View view) {
                                                                                                                                                                                                                int i53 = i11;
                                                                                                                                                                                                                int i63 = 2;
                                                                                                                                                                                                                int i72 = 0;
                                                                                                                                                                                                                int i82 = 6;
                                                                                                                                                                                                                df3.bar barVar52 = null;
                                                                                                                                                                                                                int i93 = 3;
                                                                                                                                                                                                                com.truecaller.contacteditor.impl.ui.ContactEditorActivity contactEditorActivity = this.b;
                                                                                                                                                                                                                switch (i53) {
                                                                                                                                                                                                                    case 0:
                                                                                                                                                                                                                        int i102 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u0 = contactEditorActivity.u0();
                                                                                                                                                                                                                        u0.getClass();
                                                                                                                                                                                                                        if (!u0.H) {
                                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, barVar52, 12), 3);
                                                                                                                                                                                                                            kotlin.Unit unit = kotlin.Unit.a;
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 1:
                                                                                                                                                                                                                        int i112 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u03 = contactEditorActivity.u0();
                                                                                                                                                                                                                        u03.getClass();
                                                                                                                                                                                                                        if (!u03.H) {
                                                                                                                                                                                                                            if (((h71.u) u03.x.getValue()).i) {
                                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u03), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u03, barVar52, i63), 3);
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                u03.x(new f71.m(u03, i93));
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            kotlin.Unit unit2 = kotlin.Unit.a;
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 2:
                                                                                                                                                                                                                        int i13 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u04 = contactEditorActivity.u0();
                                                                                                                                                                                                                        u04.getClass();
                                                                                                                                                                                                                        u04.x(new f71.m(u04, i72));
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 3:
                                                                                                                                                                                                                        int i14 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u05 = contactEditorActivity.u0();
                                                                                                                                                                                                                        u05.getClass();
                                                                                                                                                                                                                        u05.x(new f71.m(u05, i63));
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 4:
                                                                                                                                                                                                                        int i15 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        contactEditorActivity.t0().p = true;
                                                                                                                                                                                                                        f71.x u06 = contactEditorActivity.u0();
                                                                                                                                                                                                                        u06.getClass();
                                                                                                                                                                                                                        u06.x(new f71.m(u06, 1));
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 5:
                                                                                                                                                                                                                        int i16 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u07 = contactEditorActivity.u0();
                                                                                                                                                                                                                        if (!u07.H) {
                                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u07), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u07, barVar52, 8), 3);
                                                                                                                                                                                                                            kotlin.Unit unit3 = kotlin.Unit.a;
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 6:
                                                                                                                                                                                                                        int i17 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        androidx.fragment.app.g1 supportFragmentManager = contactEditorActivity.getSupportFragmentManager();
                                                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                                                                                                        com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_REMOVE_CONTACT_CONFIRMATION_DIALOG", 2132020273, 2132020272, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                                                                                                                                                                                                                        f71.x u08 = contactEditorActivity.u0();
                                                                                                                                                                                                                        u08.getClass();
                                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.l(u08), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u08, barVar52, i72), 3);
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 7:
                                                                                                                                                                                                                        int i18 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u09 = contactEditorActivity.u0();
                                                                                                                                                                                                                        if (((h71.u) u09.x.getValue()).b == null) {
                                                                                                                                                                                                                            if (!u09.H) {
                                                                                                                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i93), 3);
                                                                                                                                                                                                                                kotlin.Unit unit4 = kotlin.Unit.a;
                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (!u09.H) {
                                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u09), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u09, barVar52, i82), 3);
                                                                                                                                                                                                                            kotlin.Unit unit5 = kotlin.Unit.a;
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    case 8:
                                                                                                                                                                                                                        int i19 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u010 = contactEditorActivity.u0();
                                                                                                                                                                                                                        if (!u010.H) {
                                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u010), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u010, barVar52, i93), 3);
                                                                                                                                                                                                                            kotlin.Unit unit6 = kotlin.Unit.a;
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    default:
                                                                                                                                                                                                                        int i20 = com.truecaller.contacteditor.impl.ui.ContactEditorActivity.p0;
                                                                                                                                                                                                                        f71.x u011 = contactEditorActivity.u0();
                                                                                                                                                                                                                        if (!u011.H) {
                                                                                                                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.l(u011), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u011, barVar52, i82), 3);
                                                                                                                                                                                                                            kotlin.Unit unit7 = kotlin.Unit.a;
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                        pe0.j.t(this, u0().y, new f71.e(this, i2));
                                                                                                                                                                                                        pe0.j.p(this, u0().A, new f71.e(this, i));
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                throw null;
                                                                                                                                                                            }
                                                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("photoCropHelper");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        f71.x u0 = u0();
        if (u0.o.b()) {
            return;
        }
        fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.s(u0, null, 4), 3);
    }

    public final f71.k t0() {
        f71.k kVar = this.g0;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.Intrinsics.n("phoneNumbersAdapter");
        throw null;
    }

    public final f71.x u0() {
        return (f71.x) this.l0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(vz1.a aVar) {
        if (aVar != null) {
            ak.r0.k0(this, 0, nj1.b0.N(aVar, this), 1, 1);
        }
    }
}
