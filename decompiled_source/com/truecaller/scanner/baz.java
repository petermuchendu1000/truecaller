package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz implements com.google.android.gms.vision.Detector.Processor {
    public final com.truecaller.scanner.d a;
    public final com.truecaller.scanner.NumberDetectorProcessor$ScanType b;
    public final android.os.Handler c = new android.os.Handler();
    public boolean d = false;
    public final com.mbridge.msdk.config.component.common.network.connect.socket.bar e = new com.mbridge.msdk.config.component.common.network.connect.socket.bar(this, 9);

    public baz(com.truecaller.scanner.d dVar, com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType) {
        this.a = dVar;
        this.b = numberDetectorProcessor$ScanType;
    }

    public final void a(com.google.android.gms.vision.Detector.Detections detections) {
        com.truecaller.filters.blockedevents.qux quxVar;
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        if (!this.d) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.util.SparseArray sparseArray = detections.a;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    java.util.ArrayList<com.google.android.gms.vision.text.Text> arrayList3 = new com.truecaller.scanner.k((com.google.android.gms.vision.text.TextBlock) sparseArray.valueAt(i)).a;
                    if (arrayList3 != null && arrayList3.size() != 0) {
                        arrayList = new java.util.ArrayList();
                        for (com.google.android.gms.vision.text.Text text : arrayList3) {
                            if (text != null) {
                                int i2 = com.truecaller.scanner.j.a[this.b.ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 == 3) {
                                            arrayList.addAll(com.truecaller.scanner.k.a(text.getValue()));
                                            java.lang.String value = text.getValue();
                                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                            java.util.regex.Matcher matcher = com.truecaller.scanner.k.c.matcher(value);
                                            while (matcher.find()) {
                                                arrayList4.add(matcher.group());
                                            }
                                            arrayList.addAll(arrayList4);
                                        }
                                    } else {
                                        java.lang.String value2 = text.getValue();
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                        java.util.regex.Matcher matcher2 = com.truecaller.scanner.k.c.matcher(value2);
                                        while (matcher2.find()) {
                                            arrayList5.add(matcher2.group());
                                        }
                                        arrayList.addAll(arrayList5);
                                    }
                                } else {
                                    arrayList.addAll(com.truecaller.scanner.k.a(text.getValue()));
                                }
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                    }
                }
                if (arrayList2.size() > 0) {
                    this.d = true;
                    this.c.postDelayed(this.e, 800L);
                    com.truecaller.scanner.NumberScannerActivity numberScannerActivity = this.a.c;
                    if (numberScannerActivity != null && (obj = (quxVar = numberScannerActivity.h0).a) != null) {
                        java.lang.Runnable dVar = new k0.d((com.truecaller.scanner.a) obj, arrayList2);
                        quxVar.e = dVar;
                        ((android.os.Handler) quxVar.d).post(dVar);
                        com.truecaller.scanner.NumberScannerActivity numberScannerActivity2 = (com.truecaller.scanner.NumberScannerActivity) ((com.truecaller.scanner.a) quxVar.a);
                        numberScannerActivity2.g0 = true;
                        com.truecaller.scanner.d dVar2 = numberScannerActivity2.d0;
                        com.truecaller.scanner.ScannerView scannerView = dVar2.b;
                        if (scannerView != null) {
                            new com.truecaller.scanner.e(dVar2.g, dVar2.e, scannerView).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
                        }
                    }
                }
            }
        }
    }

    public final void release() {
        this.c.removeCallbacks(this.e);
    }
}
