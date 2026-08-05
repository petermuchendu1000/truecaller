package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k0 implements mg.c {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd b;
    public final /* synthetic */ android.widget.ImageView c;

    public k0(boolean z, com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd, android.widget.ImageView imageView) {
        this.a = z;
        this.b = nativeCustomFormatAd;
        this.c = imageView;
    }

    public final boolean b(java.lang.Object obj, java.lang.Object obj2, ng.e eVar, uf.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.graphics.drawable.Drawable) obj, "resource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "dataSource");
        if (this.a) {
            this.b.recordImpression();
            return false;
        }
        return false;
    }

    public final boolean c(wf.n nVar, ng.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "target");
        this.c.setVisibility(8);
        return true;
    }
}
