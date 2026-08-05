package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class y extends androidx.recyclerview.widget.q1 {
    public android.graphics.drawable.Drawable c;
    public final android.graphics.Paint d;
    public android.graphics.Paint e;
    public final android.view.View f;
    public final android.widget.TextView g;
    public final android.widget.TextView h;

    public y(int i, android.content.Context context, int i2) {
        this.c = bi3.a.u(android.R.attr.listDivider, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.d = paint;
        paint.setColor(i2);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null);
        this.f = inflate;
        inflate.setLayoutParams(new androidx.recyclerview.widget.u1(-1, -2));
        boolean a = mz1.bar.a();
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        inflate.setLayoutDirection(a ? 1 : 0);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131364435);
        this.g = textView;
        this.h = (android.widget.TextView) inflate.findViewById(2131366682);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColorFilter(new android.graphics.PorterDuffColorFilter(bi3.a.s(context, android.R.attr.textColorSecondary), android.graphics.PorterDuff.Mode.SRC_IN));
        textView.setLayerType(2, paint2);
    }

    public final void f(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f.measure(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void g(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k2 k2Var) {
        android.widget.TextView textView;
        if ((k2Var instanceof f32.j) && (textView = this.h) != null) {
            java.lang.String str = ((f32.j) k2Var).g;
            textView.setVisibility(0);
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
            }
            f(recyclerView);
            android.view.View view = this.f;
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.g2 g2Var) {
        super.getItemOffsets(rect, view, recyclerView, g2Var);
        com.truecaller.ui.w childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder instanceof com.truecaller.ui.w) {
            rect.setEmpty();
            if (childViewHolder.b() != null) {
                g(recyclerView, childViewHolder);
                f(recyclerView);
                rect.top = this.f.getMeasuredHeight() + rect.top;
            }
        }
    }

    public final void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.g2 g2Var) {
        super.onDraw(canvas, recyclerView, g2Var);
        f(recyclerView);
        android.view.View view = this.f;
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            f32.j childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder instanceof com.truecaller.ui.w) {
                canvas.save();
                com.truecaller.ui.w wVar = (com.truecaller.ui.w) childViewHolder;
                java.lang.String b = wVar.b();
                float translationX = childAt.getTranslationX() + childAt.getLeft();
                float top = childAt.getTop();
                float translationX2 = childAt.getTranslationX() + childAt.getRight();
                float bottom = childAt.getBottom();
                android.graphics.Paint paint = this.d;
                canvas.drawRect(translationX, top, translationX2, bottom, paint);
                if (wVar.h()) {
                    this.c.setBounds(childAt.getLeft(), childAt.getBottom(), childAt.getRight(), this.c.getIntrinsicHeight() + childAt.getBottom());
                    this.c.draw(canvas);
                }
                if (b != null) {
                    android.widget.TextView textView = this.g;
                    textView.setText(b);
                    g(recyclerView, childViewHolder);
                    int measuredHeight = view.getMeasuredHeight();
                    canvas.translate(0.0f, childAt.getTop() - measuredHeight);
                    float left = childAt.getLeft();
                    float right = childAt.getRight();
                    float f = measuredHeight;
                    android.graphics.Paint paint2 = this.e;
                    if (paint2 != null) {
                        paint = paint2;
                    }
                    canvas.drawRect(left, 0.0f, right, f, paint);
                    if (childViewHolder instanceof f32.j) {
                        childViewHolder.getClass();
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                    }
                    if (childViewHolder instanceof com.truecaller.ui.x) {
                        com.truecaller.ui.x xVar = (com.truecaller.ui.x) childViewHolder;
                        int i2 = xVar.i();
                        xVar.d();
                        xVar.e();
                        xVar.f();
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
                    }
                    textView.destroyDrawingCache();
                    android.widget.TextView textView2 = this.h;
                    if (textView2 != null) {
                        textView2.destroyDrawingCache();
                    }
                    view.draw(canvas);
                }
                canvas.restore();
            }
        }
    }
}
