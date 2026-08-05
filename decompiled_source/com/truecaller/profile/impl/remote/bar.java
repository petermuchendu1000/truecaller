package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class bar implements com.google.gson.n {
    public final java.lang.Object b(com.google.gson.o oVar, java.lang.reflect.Type type, com.google.gson.m mVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "context");
        com.google.gson.r f = oVar.f();
        com.google.gson.l q = f.q("sections_");
        com.google.gson.l q2 = f.q("fieldConfiguration_");
        xe0.n0 g = xe0.o0.g();
        java.util.Iterator it = q.a.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            com.google.gson.r f2 = ((com.google.gson.o) it.next()).f();
            com.google.gson.l q3 = f2.q("fields_");
            xe0.c1 e = xe0.d1.e();
            e.b(f2.p("displayName_").i());
            kotlin.jvm.internal.Intrinsics.d(q3);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(q3, 10));
            java.util.Iterator it3 = q3.a.iterator();
            while (it3.hasNext()) {
                arrayList.add(((com.google.gson.o) it3.next()).i());
            }
            e.a(arrayList);
            g.b(e.build());
        }
        java.util.Iterator it4 = q2.a.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it4, "iterator(...)");
        while (it4.hasNext()) {
            com.google.gson.r f3 = ((com.google.gson.o) it4.next()).f();
            xe0.h k = xe0.i.k();
            mp2.qux quxVar = (mp2.qux) mVar;
            k.e((xe0.l) quxVar.o(f3.p("name_").f(), xe0.l.class));
            k.g(f3.p("value_").i());
            k.c(f3.p("isMandatory_").c());
            k.f(f3.p("readOnly_").c());
            com.google.gson.r f4 = f3.p("fieldType_").f();
            int d = f4.p("typeCase_").d();
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        k.b((xe0.c0) quxVar.o(f4, xe0.c0.class));
                    } else {
                        xe0.n j = xe0.c0.j();
                        xe0.w d2 = xe0.x.d();
                        java.util.Iterator it5 = f4.p("type_").f().p("values_").e().a.iterator();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it5, "iterator(...)");
                        while (it5.hasNext()) {
                            d2.a((xe0.v) quxVar.o((com.google.gson.o) it5.next(), xe0.v.class));
                        }
                        kotlin.Unit unit = kotlin.Unit.a;
                        j.b(d2);
                        k.a(j);
                    }
                } else {
                    xe0.n j2 = xe0.c0.j();
                    xe0.o d3 = xe0.p.d();
                    java.util.Iterator it6 = f4.p("type_").f().p("values_").e().a.iterator();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it6, "iterator(...)");
                    while (it6.hasNext()) {
                        d3.a((xe0.v) quxVar.o((com.google.gson.o) it6.next(), xe0.v.class));
                    }
                    kotlin.Unit unit2 = kotlin.Unit.a;
                    j2.a(d3);
                    k.a(j2);
                }
            } else {
                xe0.n j3 = xe0.c0.j();
                xe0.y i = xe0.z.i();
                i.b(com.truecaller.api.services.profile.model.FieldType.Input.forNumber(f4.p("type_").f().p("input_").d()));
                i.c(f4.p("type_").f().p("lines_").d());
                java.util.Iterator it7 = f4.p("type_").f().p("patterns_").e().a.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it7, "iterator(...)");
                while (it7.hasNext()) {
                    i.a((xe0.b0) quxVar.o((com.google.gson.o) it7.next(), xe0.b0.class));
                }
                kotlin.Unit unit3 = kotlin.Unit.a;
                j3.c(i);
                k.a(j3);
            }
            g.a(k);
        }
        xe0.o0 build = g.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
