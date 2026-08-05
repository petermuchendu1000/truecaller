package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class g0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd b;

    public /* synthetic */ g0(com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd, int i) {
        this.a = i;
        this.b = nativeCustomFormatAd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.a) {
            case 0:
                this.b.performClick("Image");
                return;
            case 1:
                this.b.performClick("Image");
                return;
            default:
                this.b.performClick("Image");
                return;
        }
    }
}
