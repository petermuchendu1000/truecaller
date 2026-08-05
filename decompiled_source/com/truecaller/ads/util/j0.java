package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class j0 implements da0.i {
    public final /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd a;
    public final /* synthetic */ android.app.Activity b;

    public j0(android.app.Activity activity, com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd) {
        this.a = nativeCustomFormatAd;
        this.b = activity;
    }

    @Override // da0.i
    public final void a(android.widget.ImageView imageView, android.widget.TextView textView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "fallbackImage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "fallbackTextView");
        gj.m.f0(textView);
        com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd = this.a;
        com.google.android.gms.ads.nativead.NativeAd.Image image = nativeCustomFormatAd.getImage("Image");
        if (image != null) {
            android.app.Activity activity = this.b;
            com.bumptech.glide.baz.b(activity).c(activity).o(image.getUri()).G(new com.truecaller.ads.util.k0(true, nativeCustomFormatAd, imageView)).P(imageView);
            imageView.setOnClickListener(new com.truecaller.ads.util.g0(nativeCustomFormatAd, 2));
        }
    }
}
