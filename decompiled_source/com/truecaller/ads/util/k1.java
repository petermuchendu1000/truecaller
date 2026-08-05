package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k1 implements android.view.View.OnLayoutChangeListener {
    public final /* synthetic */ android.widget.FrameLayout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public k1(android.widget.FrameLayout frameLayout, int i, boolean z) {
        this.a = frameLayout;
        this.b = i;
        this.c = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        android.widget.FrameLayout frameLayout = this.a;
        int width = frameLayout.getWidth();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(width);
        android.view.View view2 = null;
        if (width <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            float intValue = valueOf.intValue();
            float f = this.b / intValue;
            frameLayout.setScaleX(f);
            frameLayout.setScaleY(f);
            frameLayout.setPivotX(intValue / 2.0f);
            frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
            if (this.c) {
                int scaleY = (int) (frameLayout.getScaleY() * frameLayout.getHeight());
                java.lang.Object parent = frameLayout.getParent();
                if (parent instanceof android.view.View) {
                    view2 = (android.view.View) parent;
                }
                if (view2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = scaleY;
                    view2.setLayoutParams(layoutParams);
                    view2.requestLayout();
                }
            }
        }
    }
}
