package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ java.util.Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(java.util.Set set, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = set;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.remoteconfig.experiment.b bVar = new com.truecaller.remoteconfig.experiment.b(this.z, barVar, 0);
                bVar.y = obj;
                return bVar;
            case 1:
                com.truecaller.remoteconfig.experiment.b bVar2 = new com.truecaller.remoteconfig.experiment.b(this.z, barVar, 1);
                bVar2.y = obj;
                return bVar2;
            case 2:
                com.truecaller.remoteconfig.experiment.b bVar3 = new com.truecaller.remoteconfig.experiment.b(this.z, barVar, 2);
                bVar3.y = obj;
                return bVar3;
            case 3:
                com.truecaller.remoteconfig.experiment.b bVar4 = new com.truecaller.remoteconfig.experiment.b(this.z, barVar, 3);
                bVar4.y = obj;
                return bVar4;
            default:
                com.truecaller.remoteconfig.experiment.b bVar5 = new com.truecaller.remoteconfig.experiment.b(this.z, barVar, 4);
                bVar5.y = obj;
                return bVar5;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.x) {
            case 0:
                return create((com.truecaller.remoteconfig.experiment.h) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create((y7.d) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create((y7.baz) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create((b11.bar) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            default:
                return create((y7.d) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        boolean z = true;
        java.util.Set set = this.z;
        switch (i) {
            case 0:
                com.truecaller.remoteconfig.experiment.h hVar = (com.truecaller.remoteconfig.experiment.h) this.y;
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                com.google.protobuf.Internal.ProtobufList<com.truecaller.remoteconfig.experiment.qux> e = hVar.e();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getActivationList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(e, 10));
                for (com.truecaller.remoteconfig.experiment.qux quxVar : e) {
                    if (set.contains(quxVar)) {
                        com.truecaller.remoteconfig.experiment.baz bazVar = (com.truecaller.remoteconfig.experiment.baz) quxVar.toBuilder();
                        bazVar.c(com.truecaller.remoteconfig.experiment.ExperimentActivationStatus.COMPLETED);
                        quxVar = (com.truecaller.remoteconfig.experiment.qux) bazVar.build();
                    }
                    arrayList.add(quxVar);
                }
                com.truecaller.remoteconfig.experiment.g gVar = (com.truecaller.remoteconfig.experiment.g) hVar.toBuilder();
                gVar.c();
                gVar.b(arrayList);
                com.google.protobuf.GeneratedMessageLite build = gVar.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                y7.d dVar = (y7.d) this.y;
                java.util.Set set2 = (java.util.Set) dVar.b(h8.g0.g);
                if (set2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : set2) {
                        if (!set.contains((java.lang.String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        y7.baz c = dVar.c();
                        c.h(h8.g0.g, kotlin.collections.a1.g(set2, arrayList2));
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = (java.lang.String) it.next();
                            h8.g0.d.getClass();
                            c.g(lk.c.S("provider:" + str));
                        }
                        return c.d();
                    }
                    return dVar;
                }
                return dVar;
            case 2:
                y7.baz bazVar2 = (y7.baz) this.y;
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                bazVar2.h(kl1.j.h, kotlin.collections.CollectionsKt.b0(set, ",", (java.lang.String) null, (java.lang.String) null, new k2.e0(11), 30));
                return kotlin.Unit.a;
            case 3:
                b11.bar barVar4 = (b11.bar) this.y;
                ef3.bar barVar5 = ef3.bar.a;
                od.p.E(obj);
                return java.lang.Boolean.valueOf(!set.contains(barVar4.a));
            default:
                ef3.bar barVar6 = ef3.bar.a;
                od.p.E(obj);
                java.util.Set keySet = ((y7.d) this.y).a().keySet();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(keySet, 10));
                java.util.Iterator it3 = keySet.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((y7.b) it3.next()).a);
                }
                if (set != x7.f.a) {
                    java.util.Set set3 = set;
                    if (!(set3 instanceof java.util.Collection) || !set3.isEmpty()) {
                        java.util.Iterator it4 = set3.iterator();
                        while (it4.hasNext()) {
                            if (!arrayList3.contains((java.lang.String) it4.next())) {
                            }
                        }
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
