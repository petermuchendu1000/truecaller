package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class qux implements android.widget.DatePicker.OnDateChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.fragment.app.Fragment b;

    public /* synthetic */ qux(androidx.fragment.app.Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(android.widget.DatePicker datePicker, int i, int i2, int i3) {
        int i4 = this.a;
        androidx.fragment.app.Fragment fragment = this.b;
        switch (i4) {
            case 0:
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) ((com.truecaller.editprofile.impl.ui.legacy.d) fragment).d6();
                com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar != null) {
                    kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.set(1, i);
                    calendar.set(2, i2);
                    calendar.set(5, i3);
                    java.util.Date time = calendar.getTime();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).m6(time, sVar.B);
                    return;
                }
                return;
            default:
                p02.u3 u3Var = q12.b.l;
                q12.c l5 = ((q12.b) fragment).l5();
                q12.bar barVar = l5.e;
                barVar.a().set(1, i);
                barVar.a().set(2, i2);
                barVar.a().set(5, i3);
                q12.d dVar = (q12.d) ((com.truecaller.sdk.bar) l5).a;
                if (dVar != null) {
                    ((q12.b) dVar).m5(l5.d.c(barVar.a().getTimeInMillis(), "MMMM dd, YYYY"));
                    return;
                }
                return;
        }
    }
}
