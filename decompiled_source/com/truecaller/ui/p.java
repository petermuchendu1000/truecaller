package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class p implements ey2.p, ed.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ p(int i, int i2, androidx.viewpager2.widget.ViewPager2 viewPager2) {
        this.a = i;
        this.b = i2;
        this.c = viewPager2;
    }

    public void d(android.view.View view, float f) {
        androidx.viewpager2.widget.ViewPager2 viewPager2 = (androidx.viewpager2.widget.ViewPager2) this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "page");
        float f2 = f * (-((this.a * 2) + this.b));
        if (viewPager2.getOrientation() == 0) {
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            if (viewPager2.getLayoutDirection() == 1) {
                view.setTranslationX(-f2);
                return;
            } else {
                view.setTranslationX(f2);
                return;
            }
        }
        view.setTranslationY(f2);
    }

    public /* synthetic */ p(com.truecaller.ui.FeedbackFormFragment feedbackFormFragment, int i, int i2) {
        this.c = feedbackFormFragment;
        this.a = i;
        this.b = i2;
    }
}
