package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k1 extends androidx.recyclerview.widget.k2 {
    public final wt2.qux b;
    public final android.content.Context c;
    public final boolean d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(wt2.qux quxVar) {
        super(quxVar.b);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "binding");
        this.b = quxVar;
        android.content.Context context = ((androidx.recyclerview.widget.k2) this).itemView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.c = context;
        dx2.bar barVar = dx2.bar.a;
        this.d = dx2.bar.d();
        this.e = 2;
    }
}
