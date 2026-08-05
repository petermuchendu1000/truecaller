package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d {
    public final com.truecaller.scanner.NumberScannerActivity a;
    public final com.truecaller.scanner.ScannerView b;
    public final com.truecaller.scanner.NumberScannerActivity c;
    public final com.truecaller.scanner.NumberScannerActivity d;
    public final com.truecaller.scanner.baz e;
    public com.google.android.gms.vision.CameraSource f;
    public final com.truecaller.scanner.f g;

    public d(com.truecaller.scanner.NumberScannerActivity numberScannerActivity, android.view.View view, com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType, com.truecaller.scanner.NumberScannerActivity numberScannerActivity2, com.truecaller.scanner.NumberScannerActivity numberScannerActivity3, com.truecaller.scanner.f fVar) {
        this.a = numberScannerActivity;
        this.b = (com.truecaller.scanner.ScannerView) view.findViewById(2131362814);
        this.c = numberScannerActivity2;
        this.d = numberScannerActivity3;
        this.e = new com.truecaller.scanner.baz(this, numberDetectorProcessor$ScanType);
        this.g = fVar;
        new com.google.android.gms.vision.barcode.BarcodeDetector(new com.google.android.gms.internal.vision.zzm(numberScannerActivity, new com.google.android.gms.internal.vision.zzk()));
    }

    public final void a() {
        com.google.android.gms.vision.text.TextRecognizer textRecognizer = new com.google.android.gms.vision.text.TextRecognizer(new com.google.android.gms.internal.vision.zzan(this.a, new com.google.android.gms.internal.vision.zzam()));
        com.truecaller.scanner.baz bazVar = this.e;
        synchronized (((com.google.android.gms.vision.Detector) textRecognizer).a) {
            try {
                com.google.android.gms.vision.Detector.Processor processor = ((com.google.android.gms.vision.Detector) textRecognizer).b;
                if (processor != null) {
                    processor.release();
                }
                ((com.google.android.gms.vision.Detector) textRecognizer).b = bazVar;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (!textRecognizer.c.b()) {
            if (g6.b.j(this.a, (android.content.BroadcastReceiver) null, new android.content.IntentFilter("android.intent.action.DEVICE_STORAGE_LOW"), (java.lang.String) null, (android.os.Handler) null, 2) != null) {
                com.truecaller.log.AssertionUtil.reportWithSummary("ScannerManager", new java.lang.String[]{"Low storage"});
                b();
                return;
            }
        }
        com.google.android.gms.vision.CameraSource.Builder builder = new com.google.android.gms.vision.CameraSource.Builder(this.a, textRecognizer);
        com.google.android.gms.vision.CameraSource cameraSource = builder.b;
        cameraSource.getClass();
        cameraSource.f = 30.0f;
        cameraSource.g = 1280;
        cameraSource.h = 1024;
        cameraSource.i = true;
        cameraSource.l = new com.google.android.gms.vision.bar(cameraSource, builder.a);
        this.f = cameraSource;
    }

    public final void b() {
        com.truecaller.filters.blockedevents.qux quxVar;
        java.lang.Object obj;
        com.truecaller.scanner.NumberScannerActivity numberScannerActivity = this.d;
        if (numberScannerActivity != null && (obj = (quxVar = numberScannerActivity.h0).a) != null) {
            android.widget.Toast.makeText((android.content.Context) ((com.truecaller.scanner.a) obj), (java.lang.CharSequence) ((u03.g0) ((u03.b0) quxVar.c)).h(2132022882, new java.lang.Object[0]), 0).show();
            ((com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) quxVar.a)).finish();
        }
    }

    public final void c() {
        this.g.a = false;
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.a;
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(appCompatActivity);
        if (isGooglePlayServicesAvailable != 0) {
            com.google.android.gms.common.GoogleApiAvailability.getInstance().d(appCompatActivity, isGooglePlayServicesAvailable, 9001, (android.content.DialogInterface.OnCancelListener) null).show();
        }
        com.google.android.gms.vision.CameraSource cameraSource = this.f;
        if (cameraSource != null) {
            try {
                com.truecaller.scanner.ScannerView scannerView = this.b;
                if (scannerView.getChildCount() == 0) {
                    scannerView.addView(scannerView.a);
                }
                scannerView.e = this;
                scannerView.d = cameraSource;
                scannerView.b = true;
                scannerView.a();
                return;
            } catch (java.lang.SecurityException e) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                b();
                return;
            }
        }
        com.truecaller.log.AssertionUtil.reportWithSummary("ScannerManager", new java.lang.String[]{"Camera source null"});
        b();
    }
}
