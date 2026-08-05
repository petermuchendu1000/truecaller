package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k extends com.truecaller.sdk.g {
    @Override // com.truecaller.sdk.g, com.truecaller.sdk.f
    public final void e2() {
        super.e2();
        ab.e eVar = this.v;
        if (eVar == null || !eVar.y(64)) {
            int i = 0;
            if (n2().c().getBoolean("PARTNERINFO_OTHER_NUMBER", false)) {
                java.lang.Object obj = this.a;
                kotlin.jvm.internal.Intrinsics.e(obj, "null cannot be cast to non-null type com.truecaller.sdk.views.FullScreenConfirmView");
                boolean z = this.w;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = ((com.truecaller.sdk.FullScreenConfirmActivity) ((ip2.qux) obj)).u0().c.b;
                if (z) {
                    i = 8;
                }
                appCompatTextView.setVisibility(i);
            }
        }
    }

    @Override // com.truecaller.sdk.g, com.truecaller.sdk.f
    public final void h2() {
        super.h2();
        try {
            java.lang.Object obj = this.a;
            kotlin.jvm.internal.Intrinsics.e(obj, "null cannot be cast to non-null type com.truecaller.sdk.views.FullScreenConfirmView");
            android.graphics.drawable.Drawable applicationIcon = this.d.getApplicationIcon(n2().e());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationIcon, "getApplicationIcon(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationIcon, "partnerAppIcon");
            ((com.truecaller.sdk.FullScreenConfirmActivity) ((ip2.qux) obj)).u0().i.e.setImageDrawable(applicationIcon);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }
}
