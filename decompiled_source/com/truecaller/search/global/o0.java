package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o0 extends ey2.a implements com.truecaller.search.global.e1, com.truecaller.ui.w {
    public final /* synthetic */ xu0.e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xu0.e] */
    public o0(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "itemView");
        this.c = new java.lang.Object();
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
}
