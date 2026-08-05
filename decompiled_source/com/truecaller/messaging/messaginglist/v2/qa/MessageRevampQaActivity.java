package com.truecaller.messaging.messaginglist.v2.qa;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/qa/MessageRevampQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "showAvatar", "showTrustLevel", "Lz4/v;", "deleteCacheText", "", "contactDetails", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageRevampQaActivity extends com.truecaller.messaging.messaginglist.v2.qa.Hilt_MessageRevampQaActivity {
    public static final /* synthetic */ int e0 = 0;
    public p81.b d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.messaginglist.v2.qa.Hilt_MessageRevampQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(732101564, new x22.baz(this, 0, (byte) 0), true));
    }

    public final void t0(int i, v2.n nVar) {
        int i2;
        boolean z;
        nVar.b0(-1233207380);
        if (nVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            java.lang.Object M = nVar.M();
            v2.c cVar = v2.k.a;
            if (M == cVar) {
                M = t.c.u(x22.bar.e, nVar);
            }
            v2.t0 t0Var = (v2.t0) M;
            java.lang.Object M2 = nVar.M();
            if (M2 == cVar) {
                M2 = t.c.u(x22.bar.f, nVar);
            }
            v2.t0 t0Var2 = (v2.t0) M2;
            java.lang.Object M3 = nVar.M();
            if (M3 == cVar) {
                M3 = androidx.compose.runtime.a.j(new z4.v("", 0L, 6));
                nVar.k0(M3);
            }
            v2.t0 t0Var3 = (v2.t0) M3;
            java.lang.Object M4 = nVar.M();
            java.lang.Object obj = M4;
            if (M4 == cVar) {
                v2.t0 j = androidx.compose.runtime.a.j("");
                nVar.k0(j);
                obj = j;
            }
            r2.z6.a(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), (q3.q0) null, ((y41.i) nVar.j(y41.j.a)).g().a, 0L, 0.0f, 0.0f, (e1.s) null, d3.a.d(-908503225, new sm1.a(this, t0Var, t0Var2, t0Var3, (v2.t0) obj, 13), nVar), nVar, 12582912, 122);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new x22.baz(this, i);
        }
    }
}
