package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s1 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ s1(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        switch (this.a) {
            case 0:
                ((com.truecaller.ui.t1) this.c).i((androidx.recyclerview.widget.RecyclerView) this.b);
                return;
            case 1:
            default:
                super.onAnimationCancel(animator);
                return;
            case 2:
                ((u6.b1) this.b).b();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.truecaller.wizard.internal.components.EditText, android.widget.TextView] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (i) {
            case 0:
                ((com.truecaller.ui.t1) obj).i((androidx.recyclerview.widget.RecyclerView) obj2);
                return;
            case 1:
                ?? r1 = (com.truecaller.wizard.internal.components.EditText) obj;
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj2;
                r1.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, drawable, null);
                int i2 = com.truecaller.wizard.internal.components.EditText.n;
                r1.b(drawable, true).start();
                return;
            case 2:
                ((u6.b1) obj2).d();
                return;
            case 3:
                u6.j1 j1Var = (u6.j1) obj2;
                j1Var.a.e(1.0f);
                u6.e1.f((android.view.View) obj, j1Var);
                return;
            case 4:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "animation");
                ((com.truecaller.messaging.conversation.emoji.QuickAnimatedEmojiView) obj2).setVisibility(4);
                ((p02.g0) obj).invoke();
                return;
            default:
                ((z0.b) obj2).remove(animator);
                ((zc.n) obj).n.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        switch (this.a) {
            case 2:
                ((u6.b1) this.b).a();
                return;
            case 5:
                ((zc.n) this.c).n.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ s1(java.lang.Object obj, java.lang.Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
