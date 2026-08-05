package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz extends ey2.a implements com.truecaller.search.global.e1 {
    public java.lang.String c;
    public boolean d;
    public final android.widget.TextView e;

    public baz(android.view.View view) {
        super(view);
        this.e = (android.widget.TextView) view.findViewById(2131365052);
    }

    @Override // com.truecaller.ui.w
    public final java.lang.String b() {
        return this.c;
    }

    @Override // com.truecaller.ui.w
    public final void g(java.lang.String str) {
        this.c = str;
    }

    @Override // com.truecaller.ui.w
    public final boolean h() {
        return this.d;
    }

    @Override // com.truecaller.ui.w
    public final void m(boolean z) {
        this.d = z;
    }
}
