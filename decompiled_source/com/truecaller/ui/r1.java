package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class r1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ com.truecaller.ui.t1 d;

    public r1(com.truecaller.ui.t1 t1Var, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f) {
        this.d = t1Var;
        this.a = recyclerView;
        this.b = view;
        this.c = f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.a;
        android.view.View view = this.b;
        this.d.h(view, recyclerView.getChildAdapterPosition(view), this.c);
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
