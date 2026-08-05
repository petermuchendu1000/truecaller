package com.truecaller.glide;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/glide/TruecallerGlideModule;", "Lif0/y1;", "<init>", "()V", "glide-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TruecallerGlideModule extends if0.y1 {
    public final void M(android.content.Context context, com.bumptech.glide.baz bazVar, com.bumptech.glide.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "glide");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "registry");
        eVar.i(java.io.InputStream.class, new ag.e(context, 9));
        eVar.i(java.nio.ByteBuffer.class, new ag.e(context, 8));
        dg.z zVar = new dg.z(3);
        lg.a aVar = eVar.c;
        synchronized (aVar) {
            aVar.b("legacy_prepend_all").add(0, new lg.qux(java.io.InputStream.class, android.graphics.BitmapFactory.Options.class, zVar));
        }
    }

    public final void x(android.content.Context context, com.bumptech.glide.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "builder");
        aVar.a = 6;
    }
}
