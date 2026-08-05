package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class w0 extends ur.d {
    public final /* synthetic */ ur.i a;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ boolean d;

    public w0(ur.i iVar, com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, java.lang.String str, boolean z) {
        this.a = iVar;
        this.b = detailsViewActivityLegacy;
        this.c = str;
        this.d = z;
    }

    public final void a(ur.g gVar) {
        com.truecaller.details_view.ui.x0.d(this.b, this.c, this.d);
        java.util.ArrayList arrayList = ((ur.g) this.a).u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(this);
    }
}
