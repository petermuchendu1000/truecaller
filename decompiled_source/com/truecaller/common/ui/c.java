package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class c implements android.view.View.OnClickListener {
    public static boolean c = true;
    public static final bx.bar d = new bx.bar(15);
    public final long a;
    public final kotlin.jvm.functions.Function1 b;

    public c(long j, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "doClick");
        this.a = j;
        this.b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
        if (c) {
            c = false;
            view.postDelayed(d, this.a);
            this.b.invoke(view);
        }
    }
}
