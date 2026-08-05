package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g implements android.view.SurfaceHolder.Callback {
    public final /* synthetic */ com.truecaller.scanner.ScannerView a;

    public g(com.truecaller.scanner.ScannerView scannerView) {
        this.a = scannerView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.truecaller.scanner.ScannerView scannerView = this.a;
        scannerView.c = true;
        scannerView.a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.a.c = false;
    }
}
