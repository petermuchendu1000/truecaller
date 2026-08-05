package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class bar implements f.baz {
    public final /* synthetic */ com.truecaller.scanner.Hilt_NumberScannerActivity a;

    public bar(com.truecaller.scanner.Hilt_NumberScannerActivity hilt_NumberScannerActivity) {
        this.a = hilt_NumberScannerActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.scanner.Hilt_NumberScannerActivity hilt_NumberScannerActivity = this.a;
        if (!hilt_NumberScannerActivity.c0) {
            hilt_NumberScannerActivity.c0 = true;
            tx.e eVar = (com.truecaller.scanner.qux) hilt_NumberScannerActivity.X3();
            com.truecaller.scanner.NumberScannerActivity numberScannerActivity = (com.truecaller.scanner.NumberScannerActivity) hilt_NumberScannerActivity;
            tx.w wVar = eVar.f;
            numberScannerActivity.h0 = new com.truecaller.filters.blockedevents.qux((u03.b0) wVar.v4.get());
            numberScannerActivity.i0 = (u03.z) wVar.M.get();
            numberScannerActivity.j0 = (com.truecaller.scanner.f) wVar.b.E6.get();
        }
    }
}
