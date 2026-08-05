package com.truecaller.settings.impl.ui.call_assistant;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d implements zq2.d {
    public final or2.z0 a;
    public final qo1.b b;
    public final f0.x0 c;

    public d(or2.z0 z0Var, qo1.b bVar, f0.x0 x0Var, qr2.bar barVar, hg.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z0Var, "visibility");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "callAssistantFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x0Var, "assistantNewSettingsItemsTitleProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "assistantDomainToSettingsDomainMapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "assistantNewSettingsRepository");
        this.a = z0Var;
        this.b = bVar;
        this.c = x0Var;
    }

    @Override // zq2.d
    public final java.lang.Object a(ff3.qux quxVar) {
        if (this.b.b.a("featureAssistantSettingsNewUi", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            return c(quxVar);
        }
        return i61.bar.n(yp.k.l(new ok1.baz(6)).a(), this.a, quxVar);
    }

    @Override // zq2.d
    public final com.truecaller.settings.impl.ui.search.SettingCategory b() {
        return com.truecaller.settings.impl.ui.search.SettingCategory.CALL_ASSISTANT;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(ff3.qux quxVar) {
        or2.b bVar;
        int i;
        if (quxVar instanceof or2.b) {
            bVar = (or2.b) quxVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = bVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    bVar.z = 1;
                    obj = hg.bar.h();
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                return yp.k.l(new or2.a((java.util.List) obj, this, 0)).a();
            }
        }
        bVar = new or2.b(this, quxVar);
        java.lang.Object obj3 = bVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = bVar.z;
        if (i == 0) {
        }
        return yp.k.l(new or2.a((java.util.List) obj3, this, 0)).a();
    }
}
