package com.truecaller.ugc;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e {
    public final nc0.bar a;
    public final oo1.f b;
    public final n11.g c;
    public final pk0.baz d;
    public final n11.l e;
    public final com.truecaller.ugc.b f;

    public e(nc0.bar barVar, oo1.f fVar, n11.g gVar, pk0.baz bazVar, n11.l lVar, com.truecaller.ugc.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "featuresRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "buildHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "truecallerAccountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ugcManager");
        this.a = barVar;
        this.b = fVar;
        this.c = gVar;
        this.d = bazVar;
        this.e = lVar;
        this.f = bVar;
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [hi3.d, java.lang.Object, qx2.mf] */
    public final void a(boolean z) {
        char c;
        qx2.lh lhVar;
        boolean booleanValue;
        bi3.y0 y0Var = qx2.mf.h;
        hi3.a aVar = qx2.mf.i;
        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
        boolean[] zArr = new boolean[j0VarArr.length];
        bi3.j0 j0Var = j0VarArr[2];
        zArr[2] = true;
        java.lang.CharSequence charSequence = this.d.f;
        if (charSequence == null) {
            charSequence = "";
        }
        bi3.j0 j0Var2 = j0VarArr[3];
        zArr[3] = true;
        boolean j = this.e.j();
        bi3.j0 j0Var3 = j0VarArr[4];
        zArr[4] = true;
        boolean k = li.qux.k(this.c);
        bi3.j0 j0Var4 = j0VarArr[5];
        zArr[5] = true;
        oo1.f fVar = this.b;
        boolean isEnabled = fVar.Z.n(fVar, oo1.f.i1[53]).isEnabled();
        bi3.j0 j0Var5 = j0VarArr[6];
        zArr[6] = true;
        try {
            ?? obj = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                c = 2;
                lhVar = null;
            } else {
                bi3.j0 j0Var6 = j0VarArr[0];
                c = 2;
                lhVar = (qx2.lh) aVar.g(j0Var6.f, aVar.j(j0Var6));
            }
            obj.a = lhVar;
            if (!zArr[1]) {
                bi3.j0 j0Var7 = j0VarArr[1];
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var7.f, aVar.j(j0Var7));
            }
            obj.b = clientHeaderV2;
            if (zArr[c]) {
                booleanValue = z;
            } else {
                bi3.j0 j0Var8 = j0VarArr[c];
                booleanValue = ((java.lang.Boolean) aVar.g(j0Var8.f, aVar.j(j0Var8))).booleanValue();
            }
            obj.c = booleanValue;
            if (!zArr[3]) {
                bi3.j0 j0Var9 = j0VarArr[3];
                charSequence = (java.lang.CharSequence) aVar.g(j0Var9.f, aVar.j(j0Var9));
            }
            obj.d = charSequence;
            if (!zArr[4]) {
                bi3.j0 j0Var10 = j0VarArr[4];
                j = ((java.lang.Boolean) aVar.g(j0Var10.f, aVar.j(j0Var10))).booleanValue();
            }
            obj.e = j;
            if (!zArr[5]) {
                bi3.j0 j0Var11 = j0VarArr[5];
                k = ((java.lang.Boolean) aVar.g(j0Var11.f, aVar.j(j0Var11))).booleanValue();
            }
            obj.f = k;
            if (!zArr[6]) {
                bi3.j0 j0Var12 = j0VarArr[6];
                isEnabled = ((java.lang.Boolean) aVar.g(j0Var12.f, aVar.j(j0Var12))).booleanValue();
            }
            obj.g = isEnabled;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
            j71.g.K((hi3.d) obj, this.a);
        } catch (bi3.bar e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
