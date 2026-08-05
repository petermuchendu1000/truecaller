package com.truecaller.remoteconfig.firebase;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.remoteconfig.firebase.b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.truecaller.remoteconfig.firebase.b bVar, df3.bar barVar) {
        super(2, barVar);
        this.x = bVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.remoteconfig.firebase.a(this.x, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.File[] listFiles;
        java.io.File file;
        java.lang.Long templateVersionNumberKey;
        com.truecaller.remoteconfig.firebase.b bVar = this.x;
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        long j = -1;
        try {
            listFiles = bVar.a.getFilesDir().listFiles((java.io.FilenameFilter) new com.google.firebase.crashlytics.internal.persistence.bar(2));
        } catch (java.io.IOException unused) {
        }
        if (listFiles != null && (file = (java.io.File) kotlin.collections.v.F(listFiles)) != null) {
            com.truecaller.remoteconfig.firebase.e eVar = (com.truecaller.remoteconfig.firebase.e) bVar.c.a(kf3.h.c(file), com.truecaller.remoteconfig.firebase.e.class);
            if (eVar != null && (templateVersionNumberKey = eVar.getTemplateVersionNumberKey()) != null) {
                j = templateVersionNumberKey.longValue();
            }
            return new java.lang.Long(j);
        }
        return new java.lang.Long(-1L);
    }
}
