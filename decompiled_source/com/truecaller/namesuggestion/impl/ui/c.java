package com.truecaller.namesuggestion.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/namesuggestion/impl/ui/c;", "Le52/qux;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "b91/a", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c extends com.truecaller.namesuggestion.impl.ui.baz implements android.view.View.OnClickListener {
    public f52.qux h;
    public kotlin.coroutines.CoroutineContext i;
    public kotlin.coroutines.CoroutineContext j;
    public ms.qux k;
    public final fg3.m2 l = fg3.h0.e();
    public final kotlin.Lazy m = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 19));
    public nc0.bar n;
    public com.truecaller.data.entity.Contact o;
    public java.lang.String p;
    public final j13.bar q;
    public static final /* synthetic */ kotlin.reflect.KProperty[] s = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/namesuggestion/impl/databinding/ViewSuggestNameBinding;", com.truecaller.namesuggestion.impl.ui.c.class))};
    public static final b91.a r = new b91.a(22);

    public c() {
        a42.b bVar = new a42.b(16);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "viewBinder");
        this.q = new j13.bar(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object T4(com.truecaller.namesuggestion.impl.ui.c cVar, ff3.qux quxVar) {
        com.truecaller.namesuggestion.impl.ui.a aVar;
        int i;
        java.lang.String str;
        int i2;
        boolean z;
        if (quxVar instanceof com.truecaller.namesuggestion.impl.ui.a) {
            aVar = (com.truecaller.namesuggestion.impl.ui.a) quxVar;
            int i3 = aVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.A = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.A;
                if (i == 0) {
                    if (i == 1) {
                        str = aVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String obj2 = cVar.V4().c.getText().toString();
                    int length = obj2.length() - 1;
                    boolean z2 = false;
                    int i4 = 0;
                    boolean z3 = false;
                    while (i4 <= length) {
                        if (!z3) {
                            i2 = i4;
                        } else {
                            i2 = length;
                        }
                        if (kotlin.jvm.internal.Intrinsics.g(obj2.charAt(i2), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z3) {
                            if (!z) {
                                z3 = true;
                            } else {
                                i4++;
                            }
                        } else {
                            if (!z) {
                                break;
                            }
                            length--;
                        }
                    }
                    java.lang.String obj3 = obj2.subSequence(i4, length + 1).toString();
                    if (android.text.TextUtils.isEmpty(obj3) && android.text.TextUtils.isEmpty(cVar.p)) {
                        android.widget.Toast.makeText((android.content.Context) cVar.getActivity(), 2132022183, 0).show();
                        return kotlin.Unit.a;
                    }
                    g52.bar V4 = cVar.V4();
                    V4.c.setEnabled(false);
                    V4.d.setEnabled(false);
                    V4.e.setEnabled(false);
                    com.truecaller.data.entity.Contact contact = cVar.o;
                    if (contact != null) {
                        if (cVar.V4().d.getCheckedRadioButtonId() == 2131362627) {
                            z2 = true;
                        }
                        java.lang.String str2 = contact.I;
                        f52.qux quxVar2 = cVar.h;
                        if (quxVar2 != null) {
                            aVar.x = str2;
                            aVar.A = 1;
                            obj = quxVar2.a(contact, obj3, z2, aVar);
                            if (obj == barVar) {
                                return barVar;
                            }
                            str = str2;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("nameSuggestionSaver");
                            throw null;
                        }
                    } else {
                        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Contact is null. Failed to suggest name");
                        cVar.U4(null, null);
                        return kotlin.Unit.a;
                    }
                }
                cVar.U4((com.truecaller.data.entity.Contact) obj, str);
                android.widget.Toast.makeText((android.content.Context) cVar.getActivity(), 2132022185, 1).show();
                return kotlin.Unit.a;
            }
        }
        aVar = new com.truecaller.namesuggestion.impl.ui.a(cVar, quxVar);
        java.lang.Object obj4 = aVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = aVar.A;
        if (i == 0) {
        }
        cVar.U4((com.truecaller.data.entity.Contact) obj4, str);
        android.widget.Toast.makeText((android.content.Context) cVar.getActivity(), 2132022185, 1).show();
        return kotlin.Unit.a;
    }

    public final void U4(com.truecaller.data.entity.Contact contact, java.lang.String str) {
        java.lang.String str2;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("contact", contact);
            if (contact != null) {
                str2 = contact.s();
            } else {
                str2 = null;
            }
            intent.putExtra("contact_name", str2);
            intent.putExtra("originalContactName", str);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final g52.bar V4() {
        return (g52.bar) this.q.a(this, s[0]);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.fragment.app.FragmentActivity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
        int id = view.getId();
        if (id == 2131366231) {
            androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.namesuggestion.impl.ui.b(this, null, 0), 3);
        } else if (id == 2131363056 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        nc0.bar barVar = this.n;
        if (barVar != null) {
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("source")) == null) {
                str = "n/a";
            }
            bd.bar.u(barVar, "nameSuggestion", str);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(2131561110, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        fg3.h0.k((fg3.e0) this.m.getValue(), (java.util.concurrent.CancellationException) null);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.truecaller.data.entity.Contact contact;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.widget.LinearLayout linearLayout = V4().a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        ak.r0.p(linearLayout, new aj0.g(23));
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(2132022186);
        }
        android.os.Bundle arguments = getArguments();
        df3.bar barVar = null;
        if (arguments != null) {
            contact = (com.truecaller.data.entity.Contact) ((android.os.Parcelable) t80.g.q(arguments, "contact", com.truecaller.data.entity.Contact.class));
        } else {
            contact = null;
        }
        this.o = contact;
        if (contact != null) {
            fg3.h0.J((fg3.e0) this.m.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(this, contact, barVar, 7), 3);
        }
        g52.bar V4 = V4();
        android.widget.TextView textView = V4.f;
        android.widget.EditText editText = V4.c;
        textView.setText(2132022187);
        editText.setHint(2132022186);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "nameText");
        i61.bar.l(editText);
        editText.setOnEditorActionListener(new c41.c(this, 1));
        V4.e.setOnClickListener(this);
        V4.b.setOnClickListener(this);
        gj.m.v0(view, 3, false);
        super.onViewCreated(view, bundle);
    }
}
