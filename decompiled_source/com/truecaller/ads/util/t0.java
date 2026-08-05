package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class t0 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.widget.TextView b;

    public /* synthetic */ t0(android.widget.TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        int i = this.a;
        android.widget.TextView textView = this.b;
        switch (i) {
            case 0:
                android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
                    layoutParams = (android.widget.FrameLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    android.content.Context context = textView.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    layoutParams.bottomMargin = ak.r0.s(context, 2);
                    android.content.Context context2 = textView.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    layoutParams.rightMargin = ak.r0.s(context2, 2);
                    textView.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 1:
                textView.setSelected(true);
                return;
            case 2:
                p22.b bVar = q52.o.i0;
                textView.setSelected(true);
                return;
            default:
                textView.setEnabled(true);
                return;
        }
    }
}
