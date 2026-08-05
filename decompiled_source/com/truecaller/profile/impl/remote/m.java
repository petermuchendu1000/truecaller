package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class m extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int x;
    public final /* synthetic */ com.truecaller.profile.impl.remote.p y;
    public final /* synthetic */ pg2.j0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.truecaller.profile.impl.remote.p pVar, pg2.j0 j0Var, df3.bar barVar) {
        super(2, barVar);
        this.y = pVar;
        this.z = j0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.profile.impl.remote.m(this.y, this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c;
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        com.truecaller.profile.impl.remote.p pVar = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
                c = obj;
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            com.truecaller.profile.impl.remote.g gVar = pVar.c;
            pg2.j0 j0Var = this.z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var, "<this>");
            com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto = new com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto(j0Var.a, j0Var.b, new com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData(j0Var.e, new com.truecaller.profile.impl.remote.model.Address(j0Var.f, j0Var.g, j0Var.h, j0Var.i), new com.truecaller.profile.impl.remote.model.OnlineIds(j0Var.j, j0Var.d, j0Var.o, j0Var.k), j0Var.l, j0Var.r, j0Var.m, j0Var.n, j0Var.p, j0Var.q, j0Var.c, null, 1024, null));
            this.x = 1;
            c = gVar.c(updateProfileRequestDto, this);
            if (c == barVar) {
                return barVar;
            }
        }
        com.truecaller.profile.api.model.ProfileSaveResult.UnprocessableEntity unprocessableEntity = (com.truecaller.profile.api.model.ProfileSaveResult) c;
        if (((com.truecaller.profile.api.model.ProfileSaveResult) unprocessableEntity).success) {
            return pg2.n0.a;
        }
        if (unprocessableEntity instanceof com.truecaller.profile.api.model.ProfileSaveResult.UnprocessableEntity) {
            java.util.List errors = unprocessableEntity.getErrors();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(errors, 10));
            java.util.Iterator it = errors.iterator();
            while (it.hasNext()) {
                arrayList.add(com.truecaller.profile.impl.remote.p.a(pVar, (com.truecaller.profile.api.model.ProfileSaveError) it.next()));
            }
            return new pg2.m0(arrayList);
        }
        return new pg2.l0(new java.lang.Exception(java.lang.String.valueOf(unprocessableEntity.getCode())));
    }
}
