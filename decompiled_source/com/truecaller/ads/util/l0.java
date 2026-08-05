package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class l0 {
    public static final android.view.View a(android.app.Activity activity, com.truecaller.ads.AdLayoutTypeX adLayoutTypeX, u90.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutTypeX, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        int i = com.truecaller.ads.util.i0.a[aVar.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return o00.e.h((u90.qux) aVar, activity, adLayoutTypeX, false);
                    }
                    throw new java.lang.RuntimeException();
                }
                return c(activity, adLayoutTypeX, (u90.c) aVar);
            }
            u90.d dVar = (u90.d) aVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutTypeX, "layout");
            com.google.android.gms.ads.nativead.NativeAdView k = o00.e.k(activity, adLayoutTypeX);
            o00.e.b(k, dVar.u(), dVar.b, adLayoutTypeX);
            return k;
        }
        return o00.e.i((u90.bar) aVar, adLayoutTypeX);
    }

    public static final android.view.View b(android.app.Activity activity, com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCustomFormatAd, "ad");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        android.view.View inflate = yy.qux.F(from, true).inflate(2131558528, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(2131363250);
        imageView.setOnClickListener(new com.truecaller.ads.util.g0(nativeCustomFormatAd, 0));
        com.google.android.gms.ads.nativead.NativeAd.Image image = nativeCustomFormatAd.getImage("Image");
        if (image != null) {
            com.bumptech.glide.baz.b(activity).c(activity).o(image.getUri()).G(new com.truecaller.ads.util.k0(true, nativeCustomFormatAd, imageView)).P(imageView);
        }
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return inflate;
    }

    public static final da0.f c(android.content.Context context, o00.baz bazVar, u90.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "adType");
        da0.f fVar = new da0.f(context, bazVar);
        v90.baz bazVar2 = (v90.baz) cVar.a;
        com.truecaller.ads.keywords.model.AdCampaign.CtaStyle ctaStyle = cVar.b.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "ad");
        fVar.a(bazVar2, ctaStyle);
        return fVar;
    }

    public static final android.view.View d(android.content.Context context, o00.baz bazVar, android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "adType");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        android.view.View inflate = yy.qux.F(from, true).inflate(bazVar.getPlaceholderLayout(), viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
