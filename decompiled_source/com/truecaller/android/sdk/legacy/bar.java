package com.truecaller.android.sdk.legacy;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar {
    public static com.truecaller.android.sdk.legacy.bar b;
    public pd0.bar a;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.android.sdk.legacy.bar, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.truecaller.android.sdk.legacy.bar a(com.truecaller.android.sdk.legacy.TruecallerSdkScope truecallerSdkScope) {
        boolean z;
        pd0.bar barVar;
        boolean z2;
        boolean z3;
        android.database.Cursor query;
        ?? obj = new java.lang.Object();
        android.content.Context context = truecallerSdkScope.context;
        android.content.Intent a = com.truecaller.android.sdk.legacy.d.a(context, "com.truecaller.android.sdk.intent.action.v1.SHARE_PROFILE");
        if (a != null) {
            java.lang.String str = a.getPackage();
            java.util.Objects.requireNonNull(str);
            z = true;
            try {
                query = context.getContentResolver().query(android.net.Uri.parse("content://" + str + ".TcInfoContentProvider/tcAccountState"), null, null, null, null);
                if (query == null) {
                    query = context.getContentResolver().query(android.net.Uri.parse("content://" + str + ".TcAccountStateProvider/tcAccountState"), null, null, null, null);
                }
            } catch (java.lang.Exception unused) {
            }
            if (query != null && query.moveToFirst()) {
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
                        android.database.Cursor query2 = context.getContentResolver().query(android.net.Uri.parse("content://" + str2 + ".TcInfoContentProvider/tc1Tap"), null, null, null, null);
                        if (query2 != null) {
                            try {
                                if (query2.moveToFirst()) {
                                    if (query2.getInt(0) == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    query2.close();
                                }
                            } finally {
                            }
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                    z3 = true;
                }
            }
            z2 = true;
            if (z2) {
            }
        }
        z = false;
        ab.e eVar = new ab.e(truecallerSdkScope.sdkFlag, truecallerSdkScope.consentTitleOption, 9, truecallerSdkScope.customDataBundle);
        if (z) {
            barVar = new pd0.baz(truecallerSdkScope.context, truecallerSdkScope.partnerKey, truecallerSdkScope.callback, eVar);
        } else if (eVar.y(32)) {
            barVar = new pd0.qux(truecallerSdkScope.context, truecallerSdkScope.partnerKey, truecallerSdkScope.callback, false);
        } else {
            barVar = null;
        }
        obj.a = barVar;
        b = obj;
        return obj;
    }
}
