package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class ScannerView extends android.view.ViewGroup {
    public final android.view.SurfaceView a;
    public boolean b;
    public boolean c;
    public com.google.android.gms.vision.CameraSource d;
    public com.truecaller.scanner.d e;

    public ScannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = false;
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
        this.a = surfaceView;
        surfaceView.getHolder().addCallback(new com.truecaller.scanner.g(this));
        addView(surfaceView);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        com.truecaller.scanner.NumberScannerActivity numberScannerActivity;
        java.lang.Object obj;
        com.truecaller.scanner.d dVar;
        com.google.android.gms.vision.CameraSource cameraSource;
        try {
            if (this.b && this.c && (cameraSource = this.d) != null) {
                cameraSource.a(this.a.getHolder());
                this.b = false;
            }
        } catch (java.io.IOException e) {
            e = e;
            dVar = this.e;
            if (dVar != null) {
                dVar.b();
            }
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
        } catch (java.lang.SecurityException e2) {
            com.truecaller.scanner.d dVar2 = this.e;
            if (dVar2 != null && (numberScannerActivity = dVar2.d) != null && (obj = numberScannerActivity.h0.a) != null) {
                f6.baz.l((com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) obj), new java.lang.String[]{"android.permission.CAMERA"}, 2);
            }
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            dVar = this.e;
            if (dVar != null) {
            }
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        com.google.android.gms.common.images.Size size;
        com.google.android.gms.vision.CameraSource cameraSource = this.d;
        if (cameraSource != null && (size = cameraSource.e) != null) {
            i5 = size.a;
            i6 = size.b;
        } else {
            i5 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
            i6 = 240;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        float f = i6;
        float f2 = i9 / f;
        float f3 = i5;
        float f4 = i10 / f3;
        if (f2 > f4) {
            int i11 = (int) (f3 * f2);
            int i12 = (i11 - i10) / 2;
            i10 = i11;
            i8 = i12;
            i7 = 0;
        } else {
            int i14 = (int) (f * f4);
            i7 = (i14 - i9) / 2;
            i9 = i14;
            i8 = 0;
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            getChildAt(i15).layout(i7 * (-1), i8 * (-1), i9 - i7, i10 - i8);
        }
        if (this.a != null) {
            a();
        }
    }
}
