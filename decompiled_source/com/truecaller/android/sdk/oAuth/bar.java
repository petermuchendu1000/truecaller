package com.truecaller.android.sdk.oAuth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar {
    public static com.truecaller.android.sdk.oAuth.bar b;
    public qd0.bar a;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        if (r0 == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.android.sdk.oAuth.bar, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.truecaller.android.sdk.oAuth.bar a(com.truecaller.android.sdk.oAuth.TcSdkOptions tcSdkOptions) {
        boolean z;
        qd0.bar barVar;
        boolean z2;
        boolean z3;
        boolean z4;
        android.database.Cursor query;
        android.database.Cursor query2;
        ?? obj = new java.lang.Object();
        android.content.Context context = tcSdkOptions.context;
        android.content.Intent a = com.truecaller.android.sdk.oAuth.e.a(context, "com.truecaller.android.sdk.intent.action.v1.oAuth");
        if (a != null) {
            java.lang.String str = a.getPackage();
            java.util.Objects.requireNonNull(str);
            z = true;
            try {
                query = context.getContentResolver().query(android.net.Uri.parse("content://" + str + ".TcInfoContentProvider/tcAccountState"), null, null, null, null);
            } catch (java.lang.Exception unused) {
            }
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        if (query.getInt(0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        query.close();
                        if (z2) {
                            java.lang.String str2 = a.getPackage();
                            java.util.Objects.requireNonNull(str2);
                            try {
                                query2 = context.getContentResolver().query(android.net.Uri.parse("content://" + str2 + ".TcInfoContentProvider/tcOAuth"), null, null, null, null);
                            } catch (java.lang.Exception unused2) {
                            }
                            if (query2 != null) {
                                try {
                                    if (query2.moveToFirst()) {
                                        if (query2.getInt(0) == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        query2.close();
                                        if (z3) {
                                            java.lang.String str3 = a.getPackage();
                                            java.util.Objects.requireNonNull(str3);
                                            try {
                                                query = context.getContentResolver().query(android.net.Uri.parse("content://" + str3 + ".TcInfoContentProvider/tcOAuthBlacklistedDevice"), null, null, null, null);
                                                if (query != null) {
                                                    try {
                                                        if (query.moveToFirst()) {
                                                            if (query.getInt(0) == 1) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            query.close();
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                if (query != null) {
                                                    query.close();
                                                }
                                            } catch (java.lang.Exception unused3) {
                                            }
                                            z4 = true;
                                        }
                                    }
                                } finally {
                                    try {
                                        query2.close();
                                        throw th;
                                    } catch (java.lang.Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            }
                            if (query2 != null) {
                                query2.close();
                            }
                            z3 = true;
                            if (z3) {
                            }
                        }
                    }
                } finally {
                    try {
                        query.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            if (query != null) {
                query.close();
            }
            z2 = true;
            if (z2) {
            }
        }
        z = false;
        a3.k kVar = new a3.k(tcSdkOptions.sdkFlag, tcSdkOptions.sdkOptionsDataBundle);
        if (z) {
            barVar = new qd0.baz(tcSdkOptions.context, tcSdkOptions.clientId, tcSdkOptions.callback, kVar);
        } else if (kVar.i(64)) {
            barVar = new qd0.qux(tcSdkOptions.context, tcSdkOptions.clientId, tcSdkOptions.callback, false);
        } else {
            barVar = null;
        }
        obj.a = barVar;
        b = obj;
        return obj;
    }
}
