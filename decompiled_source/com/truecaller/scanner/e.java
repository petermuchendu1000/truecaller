package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e extends android.os.AsyncTask {
    public final com.truecaller.scanner.f a;
    public final java.lang.ref.WeakReference b;
    public final java.lang.ref.WeakReference c;

    public e(com.truecaller.scanner.f fVar, com.truecaller.scanner.baz bazVar, com.truecaller.scanner.ScannerView scannerView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "scannerSourceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "detectorProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannerView, "scannerView");
        this.a = fVar;
        this.b = new java.lang.ref.WeakReference(bazVar);
        this.c = new java.lang.ref.WeakReference(scannerView);
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Void[]) objArr, "voids");
        com.truecaller.scanner.baz bazVar = (com.truecaller.scanner.baz) this.b.get();
        if (bazVar != null) {
            bazVar.release();
        }
        com.truecaller.scanner.ScannerView scannerView = (com.truecaller.scanner.ScannerView) this.c.get();
        if (scannerView != null) {
            scannerView.c = false;
            scannerView.b = false;
            com.google.android.gms.vision.CameraSource cameraSource = scannerView.d;
            if (cameraSource != null) {
                try {
                    synchronized (cameraSource.b) {
                        cameraSource.b();
                        com.google.android.gms.vision.bar barVar = cameraSource.l;
                        com.google.android.gms.vision.Detector detector = barVar.a;
                        if (detector != null) {
                            detector.d();
                            barVar.a = null;
                        }
                    }
                } catch (java.lang.RuntimeException unused) {
                }
                scannerView.post(new com.mbridge.msdk.config.component.common.network.connect.socket.bar(scannerView, 10));
                scannerView.d = null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(java.lang.Object obj) {
        com.truecaller.scanner.f fVar = this.a;
        fVar.a = true;
        com.google.firebase.crashlytics.internal.concurrency.baz bazVar = fVar.b;
        if (bazVar != null) {
            com.truecaller.scanner.d dVar = (com.truecaller.scanner.d) bazVar.b;
            dVar.a();
            dVar.c();
            dVar.g.b = null;
        }
    }
}
