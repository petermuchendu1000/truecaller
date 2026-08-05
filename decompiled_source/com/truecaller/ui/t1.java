package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class t1 extends androidx.recyclerview.widget.q1 implements androidx.recyclerview.widget.x1 {
    public final float c;
    public final android.graphics.drawable.Drawable d;
    public final android.graphics.drawable.Drawable f;
    public final android.graphics.Paint g;
    public final android.graphics.drawable.Drawable h;
    public final com.truecaller.ui.q1 i;
    public android.graphics.drawable.Drawable j;
    public boolean k;
    public float l;
    public float m;
    public android.view.View n;
    public boolean q;
    public final java.util.HashMap e = new java.util.HashMap();
    public int o = -1;
    public int p = 1;

    public t1(android.view.ContextThemeWrapper contextThemeWrapper, java.util.Map map, com.truecaller.ui.q1 q1Var) {
        this.i = q1Var;
        this.c = android.view.ViewConfiguration.get(contextThemeWrapper).getScaledTouchSlop() * 6.0f;
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
        android.graphics.drawable.Drawable x = bi3.a.x(contextThemeWrapper, 2131233348, 2130970615, mode);
        this.d = x;
        x.setBounds((-x.getIntrinsicWidth()) / 2, (-x.getIntrinsicHeight()) / 2, x.getIntrinsicWidth() / 2, x.getIntrinsicHeight() / 2);
        android.graphics.drawable.Drawable x2 = bi3.a.x(contextThemeWrapper, 2131233363, 2130970615, mode);
        this.f = x2;
        x2.setBounds((-x2.getIntrinsicWidth()) / 2, (-x2.getIntrinsicHeight()) / 2, x2.getIntrinsicWidth() / 2, x2.getIntrinsicHeight() / 2);
        for (java.util.Map.Entry entry : map.entrySet()) {
            android.graphics.drawable.Drawable x3 = bi3.a.x(contextThemeWrapper, ((java.lang.Integer) entry.getValue()).intValue(), 2130970615, android.graphics.PorterDuff.Mode.SRC_IN);
            x3.setBounds((-x3.getIntrinsicWidth()) / 2, (-x3.getIntrinsicHeight()) / 2, x3.getIntrinsicWidth() / 2, x3.getIntrinsicHeight() / 2);
            this.e.put(entry.getKey(), x3);
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(bi3.a.s(contextThemeWrapper, 2130971025));
        this.h = bi3.a.u(2130970615, contextThemeWrapper);
    }

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        android.view.View g = g(recyclerView);
        if (this.p != 4 && this.o != -1 && g != null) {
            int actionMasked = motionEvent.getActionMasked();
            com.truecaller.ui.q1 q1Var = this.i;
            float f = 1.0f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        q1Var.getClass();
                        f(recyclerView, true);
                        return;
                    }
                    return;
                }
                if (this.p == 3) {
                    float rawX = (motionEvent.getRawX() - this.l) * 0.5f;
                    if (java.lang.Math.abs(rawX) > 1.0f) {
                        f = 1.0f - ((java.lang.Math.abs(motionEvent.getRawX() - this.l) / (g.getWidth() - g.getHeight())) / 2.0f);
                    }
                    g.setTranslationX(rawX * f);
                    recyclerView.invalidateItemDecorations();
                    return;
                }
                return;
            }
            float rawX2 = (motionEvent.getRawX() - this.l) * 0.5f;
            if (java.lang.Math.abs(rawX2 / g.getHeight()) > 1.0f) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(g);
                if (childAdapterPosition == -1) {
                    recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new com.truecaller.ui.r1(this, recyclerView, g, rawX2));
                } else {
                    h(g, childAdapterPosition, rawX2);
                }
                f(recyclerView, false);
                return;
            }
            q1Var.getClass();
            f(recyclerView, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 != 3) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        if (this.p != 4) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (this.p == 2) {
                            float abs = java.lang.Math.abs(this.l - motionEvent.getRawX());
                            float f = this.c;
                            if (abs > f) {
                                android.view.View g = g(recyclerView);
                                int childAdapterPosition = recyclerView.getChildAdapterPosition(g);
                                if (childAdapterPosition >= 0) {
                                    com.truecaller.ui.q1 q1Var = this.i;
                                    q1Var.getClass();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "view");
                                    if (q1Var.a.k(new n00.d("ItemEvent.SWIPE_START", childAdapterPosition, -1L, g, g.getTag()))) {
                                        this.q = mz1.bar.a();
                                        this.p = 3;
                                        android.graphics.drawable.Drawable drawable = this.h;
                                        if (drawable != null) {
                                            this.j = g.getBackground();
                                            g.setBackground(drawable);
                                            this.k = true;
                                        }
                                    }
                                }
                                this.p = 1;
                            } else if (java.lang.Math.abs(this.m - motionEvent.getRawY()) > f) {
                                this.p = 1;
                            }
                        }
                        if (this.p == 3) {
                        }
                    }
                }
                int i = this.p;
                if (i != 3) {
                    if (i == 2) {
                        this.p = 1;
                        this.o = -1;
                        return false;
                    }
                }
            } else {
                android.view.View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                this.o = recyclerView.getChildAdapterPosition(findChildViewUnder);
                if ((findChildViewUnder instanceof android.view.ViewGroup) && ((android.view.ViewGroup) findChildViewUnder).getChildAt(0) != null) {
                    this.p = 2;
                    this.l = motionEvent.getRawX();
                    this.m = motionEvent.getRawY();
                }
            }
            return false;
        }
        return true;
    }

    public final void e(boolean z) {
    }

    public final void f(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z) {
        if (this.o != -1 && this.p == 3) {
            android.view.View g = g(recyclerView);
            if (z) {
                this.p = 4;
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(g.getTranslationX(), 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new com.truecaller.common.ui.baz(1, g, recyclerView));
                ofFloat.addListener(new com.truecaller.ui.s1(0, this, recyclerView));
                ofFloat.start();
                return;
            }
            recyclerView.postDelayed(new com.ironsource.th(this, g, recyclerView, 10), 500L);
            return;
        }
        i(recyclerView);
    }

    public final android.view.View g(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.k2 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.o);
        if (findViewHolderForAdapterPosition == null) {
            return null;
        }
        android.view.View view = findViewHolderForAdapterPosition.itemView;
        android.view.View view2 = this.n;
        if (view2 == null) {
            this.n = view;
            return view;
        }
        if (view2 != view) {
            ((android.view.ViewGroup) view2).getChildAt(0).setTranslationX(0.0f);
            this.n = view;
            recyclerView.invalidateItemDecorations();
        }
        return view;
    }

    public final void h(android.view.View view, int i, float f) {
        boolean z;
        java.lang.String str;
        if ((f > 0.0f && !this.q) || (f < 0.0f && this.q)) {
            z = true;
        } else {
            z = false;
        }
        com.truecaller.ui.q1 q1Var = this.i;
        q1Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        if (z) {
            str = "ItemEvent.SWIPE_COMPLETED_FROM_START";
        } else {
            str = "ItemEvent.SWIPE_COMPLETED_FROM_END";
        }
        q1Var.a.k(new n00.d(str, i, -1L, view, view.getTag()));
    }

    public final void i(androidx.recyclerview.widget.RecyclerView recyclerView) {
        android.view.View g = g(recyclerView);
        if (g != null && this.k) {
            g.setBackground(this.j);
            this.k = false;
        }
        this.p = 1;
        this.o = -1;
    }

    public final void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.g2 g2Var) {
        android.graphics.Canvas canvas2;
        float f;
        super.onDraw(canvas, recyclerView, g2Var);
        int i = this.p;
        if (i == 3 || i == 4) {
            android.view.View g = g(recyclerView);
            android.view.View g2 = g(recyclerView);
            if (g != null && g2 != null) {
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) this.e.get(g.getTag());
                float translationX = g2.getTranslationX();
                float left = g.getLeft();
                android.graphics.drawable.Drawable drawable2 = this.d;
                android.graphics.drawable.Drawable drawable3 = this.f;
                android.graphics.Paint paint = this.g;
                if (translationX >= left) {
                    canvas2 = canvas;
                    canvas2.drawRect(g.getLeft(), g.getTop(), g2.getTranslationX(), g.getBottom(), paint);
                    if (this.q) {
                        drawable = drawable3;
                    } else if (drawable == null) {
                        drawable = drawable2;
                    }
                    f = g.getHeight() / 2;
                } else {
                    canvas2 = canvas;
                    if (g2.getTranslationX() < 0.0f) {
                        if (this.q) {
                            if (drawable == null) {
                                drawable = drawable2;
                            }
                        } else {
                            drawable = drawable3;
                        }
                        f = g.getWidth() - (g.getHeight() / 2);
                        canvas2.drawRect(g2.getTranslationX() + g.getRight(), g.getTop(), g.getRight(), g.getBottom(), paint);
                    } else {
                        drawable = null;
                        f = 0.0f;
                    }
                }
                if (drawable != null) {
                    int save = canvas2.save();
                    canvas2.translate(f, (g.getHeight() / 2) + g.getTop());
                    float min = java.lang.Math.min(java.lang.Math.abs(g2.getTranslationX() / g.getHeight()), 1.0f);
                    canvas2.scale(min, min);
                    drawable.setAlpha((int) (min * 255.0f));
                    drawable.draw(canvas2);
                    canvas2.restoreToCount(save);
                }
            }
        }
    }
}
