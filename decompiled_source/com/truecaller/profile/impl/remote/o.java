package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int x;
    public final /* synthetic */ com.truecaller.profile.impl.remote.p y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.truecaller.profile.impl.remote.p pVar, df3.bar barVar) {
        super(2, barVar);
        this.y = pVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.profile.impl.remote.o(this.y, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0040, code lost:
    
        if (r8 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        if (r8 == r0) goto L44;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [gd3.k1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xe0.c2 c2Var;
        java.util.List errorsList;
        com.truecaller.profile.api.model.ProfileSaveResult.UnprocessableEntity unprocessableEntity;
        java.util.List errors;
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        com.truecaller.profile.impl.remote.p pVar = this.y;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            od.p.E(obj);
                            com.truecaller.profile.api.model.ProfileSaveResult.UnprocessableEntity unprocessableEntity2 = (com.truecaller.profile.api.model.ProfileSaveResult) obj;
                            if (unprocessableEntity2 instanceof com.truecaller.profile.api.model.ProfileSaveResult.UnprocessableEntity) {
                                unprocessableEntity = unprocessableEntity2;
                            } else {
                                unprocessableEntity = null;
                            }
                            if (unprocessableEntity != null && (errors = unprocessableEntity.getErrors()) != null) {
                                java.util.List list = errors;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                                java.util.Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(com.truecaller.profile.impl.remote.p.a(pVar, (com.truecaller.profile.api.model.ProfileSaveError) it.next()));
                                }
                                return arrayList;
                            }
                            return kotlin.collections.h0.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    c2Var = (xe0.c2) obj;
                    if (c2Var == null && (errorsList = c2Var.getErrorsList()) != null) {
                        java.util.List<xe0.f2> list2 = errorsList;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list2, 10));
                        for (xe0.f2 f2Var : list2) {
                            kotlin.jvm.internal.Intrinsics.d(f2Var);
                            arrayList2.add(com.truecaller.profile.impl.remote.p.b(pVar, f2Var));
                        }
                        return arrayList2;
                    }
                    return kotlin.collections.h0.a;
                }
                od.p.E(obj);
                we0.h hVar = (we0.h) obj;
                if (hVar == null) {
                    return kotlin.collections.h0.a;
                }
                xe0.z1 build = xe0.z1.c().build();
                kotlin.jvm.internal.Intrinsics.d(build);
                this.x = 2;
                obj = hVar.R(build, (gd3.k1) new java.lang.Object(), this);
                if (obj == barVar) {
                    return barVar;
                }
                c2Var = (xe0.c2) obj;
                if (c2Var == null) {
                }
                return kotlin.collections.h0.a;
            }
            od.p.E(obj);
            if (pVar.d.a()) {
                com.truecaller.profile.impl.remote.t tVar = pVar.b;
                this.x = 1;
                obj = wi0.bar.k(tVar, this);
            } else {
                com.truecaller.profile.impl.remote.g gVar = pVar.c;
                this.x = 3;
                obj = gVar.d(this);
            }
            return barVar;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception unused) {
            return kotlin.collections.h0.a;
        }
    }
}
