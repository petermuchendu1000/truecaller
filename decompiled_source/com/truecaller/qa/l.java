package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l implements p.j2 {
    public final /* synthetic */ com.truecaller.qa.o a;

    public l(com.truecaller.qa.o oVar) {
        this.a = oVar;
    }

    public final boolean onQueryTextChange(java.lang.String str) {
        this.a.filter(str);
        return false;
    }

    public final boolean onQueryTextSubmit(java.lang.String str) {
        return false;
    }
}
