package com.truecaller.editprofile.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b implements ig3.j {
    public final /* synthetic */ ig3.j a;

    public b(ig3.j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        com.truecaller.editprofile.impl.ui.qa.a aVar;
        int i;
        if (barVar instanceof com.truecaller.editprofile.impl.ui.qa.a) {
            aVar = (com.truecaller.editprofile.impl.ui.qa.a) barVar;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = aVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = aVar.y;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj2);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj2);
                    java.util.List list = ((com.truecaller.editprofile.impl.ui.qa.e) obj).a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj3 : list) {
                        if (((ah2.f) obj3).isVisible()) {
                            arrayList.add(obj3);
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "fields");
                    com.truecaller.editprofile.impl.ui.qa.e eVar = new com.truecaller.editprofile.impl.ui.qa.e(arrayList);
                    aVar.y = 1;
                    if (this.a.emit(eVar, aVar) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            }
        }
        aVar = new com.truecaller.editprofile.impl.ui.qa.a(this, barVar);
        java.lang.Object obj22 = aVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = aVar.y;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }
}
