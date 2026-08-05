package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class NumberScannerActivity extends com.truecaller.scanner.Hilt_NumberScannerActivity implements com.truecaller.scanner.a, android.view.View.OnClickListener {
    public static final /* synthetic */ int k0 = 0;
    public com.truecaller.scanner.d d0;
    public android.view.View e0;
    public boolean f0 = false;
    public boolean g0 = false;
    public com.truecaller.filters.blockedevents.qux h0;
    public u03.z i0;
    public com.truecaller.scanner.f j0;

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Object obj;
        if (view.getId() == 2131363058 && (obj = this.h0.a) != null) {
            ((com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) obj)).finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.scanner.Hilt_NumberScannerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.B(this, false, new ex2.qux(com.truecaller.themes.utils.StatusBarStyle.AUTO));
        setContentView(2131558488);
        com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType2 = com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE;
        if (getIntent().hasExtra("scan_type")) {
            numberDetectorProcessor$ScanType = (com.truecaller.scanner.NumberDetectorProcessor$ScanType) getIntent().getSerializableExtra("scan_type");
        } else {
            numberDetectorProcessor$ScanType = numberDetectorProcessor$ScanType2;
        }
        if (numberDetectorProcessor$ScanType == numberDetectorProcessor$ScanType2) {
            ((android.widget.TextView) findViewById(2131362813)).setText(2132022885);
        } else {
            ((android.widget.TextView) findViewById(2131362813)).setText(2132022886);
        }
        this.e0 = findViewById(2131367125);
        ((android.widget.ImageButton) findViewById(2131363058)).setOnClickListener(this);
        android.view.View view = this.e0;
        b93.b bVar = new b93.b(26);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(view, bVar);
        this.d0 = new com.truecaller.scanner.d(this, this.e0, numberDetectorProcessor$ScanType, this, this, this.j0);
        this.h0.a = this;
        boolean g = this.i0.g("android.permission.CAMERA");
        this.f0 = g;
        java.lang.Object obj = this.h0.a;
        if (obj != null && !g) {
            f6.baz.l((com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) obj), new java.lang.String[]{"android.permission.CAMERA"}, 2);
        }
    }

    @Override // com.truecaller.scanner.Hilt_NumberScannerActivity
    public final void onDestroy() {
        super.onDestroy();
        this.h0.m1();
    }

    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        com.truecaller.filters.blockedevents.qux quxVar = this.h0;
        if (i == 2) {
            java.lang.Object obj = quxVar.a;
            if (obj != null) {
                if (iArr.length != 0 && iArr[0] == 0) {
                    com.truecaller.scanner.NumberScannerActivity numberScannerActivity = (com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) obj);
                    numberScannerActivity.f0 = true;
                    com.truecaller.scanner.d dVar = numberScannerActivity.d0;
                    if (dVar.g.a) {
                        dVar.c();
                        return;
                    }
                    return;
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) obj);
                android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) ((u03.g0) ((u03.b0) quxVar.c)).h(2132022881, new java.lang.Object[0]), 0).show();
                ((com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) quxVar.a)).finish();
                return;
            }
            return;
        }
        quxVar.getClass();
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        if (this.f0) {
            com.truecaller.scanner.d dVar = this.d0;
            if (dVar.g.a) {
                dVar.c();
            }
        }
    }

    public final void onStart() {
        super.onStart();
        com.truecaller.scanner.d dVar = this.d0;
        com.truecaller.scanner.f fVar = dVar.g;
        if (fVar.a) {
            dVar.a();
        } else {
            fVar.b = new com.google.firebase.crashlytics.internal.concurrency.baz(dVar, 15);
        }
    }

    public final void onStop() {
        super.onStop();
        com.truecaller.scanner.d dVar = this.d0;
        com.truecaller.scanner.ScannerView scannerView = dVar.b;
        if (scannerView != null) {
            scannerView.c = false;
        }
        dVar.g.b = null;
        if (!this.g0 && scannerView != null) {
            new com.truecaller.scanner.e(dVar.g, dVar.e, scannerView).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        }
    }
}
