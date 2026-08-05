package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i extends android.widget.BaseAdapter {
    public final /* synthetic */ int a = 1;
    public final java.util.ArrayList b;
    public final android.view.LayoutInflater c;

    public i(android.content.Context context, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "simInfos");
        this.b = arrayList;
        this.c = li.qux.u(context, "from(...)", true);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (this.a) {
            case 0:
                java.util.ArrayList arrayList = this.b;
                if (arrayList != null) {
                    return arrayList.size();
                }
                return 0;
            default:
                return this.b.size() + 1;
        }
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        switch (this.a) {
            case 0:
                return (java.lang.String) this.b.get(i);
            default:
                return (com.truecaller.multisim.SimInfo) this.b.get(i);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        switch (this.a) {
            case 0:
                return ((java.lang.String) this.b.get(i)).hashCode();
            default:
                return 0L;
        }
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        com.truecaller.scanner.h hVar;
        kotlin.Unit o;
        int i2 = this.a;
        android.view.LayoutInflater layoutInflater = this.c;
        java.util.ArrayList arrayList = this.b;
        switch (i2) {
            case 0:
                if (view == null) {
                    view = layoutInflater.inflate(2131560091, viewGroup, false);
                    hVar = new com.truecaller.scanner.h(view);
                    view.setTag(hVar);
                } else {
                    hVar = (com.truecaller.scanner.h) view.getTag();
                }
                hVar.a.setText((java.lang.CharSequence) arrayList.get(i));
                return view;
            default:
                if (view == null) {
                    view = layoutInflater.inflate(2131561154, viewGroup, false);
                }
                android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131367612);
                if (i < arrayList.size()) {
                    com.truecaller.multisim.SimInfo simInfo = (com.truecaller.multisim.SimInfo) arrayList.get(i);
                    textView.setText(t41.i.a(simInfo.c));
                    try {
                        kotlin.o oVar = kotlin.q.b;
                        int i3 = simInfo.a;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                gj.m.d0(textView, 2131233264);
                            } else {
                                gj.m.d0(textView, 2131233261);
                            }
                        } else {
                            gj.m.d0(textView, 2131233260);
                        }
                        o = kotlin.Unit.a;
                    } catch (java.lang.Throwable th) {
                        kotlin.o oVar2 = kotlin.q.b;
                        o = od.p.o(th);
                    }
                    java.lang.Throwable a = kotlin.q.a(o);
                    if (a != null) {
                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
                    }
                } else {
                    textView.setText(2132019161);
                    gj.m.d0(textView, 0);
                }
                return view;
        }
    }

    public i(androidx.fragment.app.FragmentActivity fragmentActivity, java.util.ArrayList arrayList) {
        this.c = android.view.LayoutInflater.from(fragmentActivity);
        this.b = arrayList;
    }
}
