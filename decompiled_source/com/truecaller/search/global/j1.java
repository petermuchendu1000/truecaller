package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j1 extends ey2.a implements com.truecaller.search.global.e1, com.truecaller.search.global.d1, com.truecaller.ui.w {
    public final /* synthetic */ xu0.e c;
    public final u03.b0 d;
    public final android.widget.TextView e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xu0.e] */
    public j1(android.view.View view, u03.b0 b0Var) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "itemView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        this.c = new java.lang.Object();
        this.d = b0Var;
        ((android.widget.TextView) view.findViewById(2131367033)).setVisibility(8);
        android.view.View findViewById = view.findViewById(2131362754);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setAllCaps(false);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextSize(2, 16.0f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.e = textView;
    }

    @Override // com.truecaller.ui.w
    public final java.lang.String b() {
        return ((com.truecaller.common.ui.n) this.c).a;
    }

    @Override // com.truecaller.ui.w
    public final void g(java.lang.String str) {
        ((com.truecaller.common.ui.n) this.c).a = str;
    }

    @Override // com.truecaller.ui.w
    public final boolean h() {
        return this.c.b;
    }

    @Override // com.truecaller.ui.w
    public final void m(boolean z) {
        this.c.b = z;
    }

    public final java.lang.String n(int i, java.lang.String str) {
        int i2;
        if (this.f != 0 && (r0 - i) - 3 >= 0 && i2 <= str.length()) {
            java.lang.String substring = str.substring(0, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring + "...";
        }
        return str;
    }
}
