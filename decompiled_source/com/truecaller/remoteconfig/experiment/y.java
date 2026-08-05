package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class y {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final kotlin.Lazy c;
    public volatile long d;

    public y(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        this.a = context;
        this.b = coroutineContext;
        this.c = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 21));
    }

    public static final void a(com.truecaller.remoteconfig.experiment.y yVar, java.io.DataOutputStream dataOutputStream, com.truecaller.remoteconfig.experiment.q qVar) {
        java.lang.String str = qVar.b;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        dataOutputStream.writeUTF(str);
        java.util.List<com.truecaller.remoteconfig.experiment.r> list = qVar.a;
        dataOutputStream.writeInt(list.size());
        for (com.truecaller.remoteconfig.experiment.r rVar : list) {
            dataOutputStream.writeUTF(rVar.a);
            dataOutputStream.writeUTF(rVar.c);
            dataOutputStream.writeUTF(rVar.b);
        }
        java.lang.String str3 = qVar.c;
        if (str3 != null) {
            str2 = str3;
        }
        dataOutputStream.writeUTF(str2);
    }

    public static com.truecaller.remoteconfig.experiment.q c(java.io.DataInputStream dataInputStream) {
        java.lang.String o;
        try {
            java.lang.String readUTF = dataInputStream.readUTF();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                java.lang.String readUTF2 = dataInputStream.readUTF();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readUTF2, "readUTF(...)");
                java.lang.String readUTF3 = dataInputStream.readUTF();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readUTF3, "readUTF(...)");
                java.lang.String readUTF4 = dataInputStream.readUTF();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readUTF4, "readUTF(...)");
                arrayList.add(new com.truecaller.remoteconfig.experiment.r(readUTF2, readUTF4, readUTF3));
            }
            try {
                kotlin.o oVar = kotlin.q.b;
                o = dataInputStream.readUTF();
            } catch (java.lang.Throwable th) {
                kotlin.o oVar2 = kotlin.q.b;
                o = od.p.o(th);
            }
            if (o instanceof kotlin.p) {
                o = null;
            }
            com.truecaller.remoteconfig.experiment.q qVar = new com.truecaller.remoteconfig.experiment.q(arrayList, readUTF, o);
            dataInputStream.close();
            return qVar;
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                i71.g.r(dataInputStream, th3);
                throw th4;
            }
        }
    }

    public final java.io.File b() {
        return (java.io.File) this.c.getValue();
    }
}
