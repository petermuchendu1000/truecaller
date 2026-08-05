package com.truecaller.android.sdk.legacy;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class d {
    public static final java.util.ArrayList a;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a = arrayList;
        arrayList.add(new java.lang.Object());
        arrayList.add(new java.lang.Object());
        arrayList.add(new java.lang.Object());
        arrayList.add(new java.lang.Object());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.content.Intent a(android.content.Context context, java.lang.String str) {
        android.database.Cursor query;
        java.util.Iterator it = a.iterator();
        while (true) {
            android.content.pm.PackageInfo packageInfo = null;
            if (!it.hasNext()) {
                return null;
            }
            com.truecaller.android.sdk.legacy.baz bazVar = (com.truecaller.android.sdk.legacy.baz) it.next();
            android.content.Intent addCategory = new android.content.Intent(str).setPackage(bazVar.a()).addCategory("android.intent.category.DEFAULT");
            boolean z = false;
            android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(addCategory, 0);
            if (resolveActivity != null) {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(resolveActivity.activityInfo.packageName, 64);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                if (packageInfo == null) {
                    continue;
                } else {
                    for (android.content.pm.Signature signature : packageInfo.signatures) {
                        java.lang.String t = lk3.bar.t(signature.toByteArray());
                        if (t != null && com.truecaller.android.sdk.legacy.baz.a.contains(t)) {
                            if (str.equals("com.truecaller.android.sdk.intent.action.v3.SHARE_PROFILE")) {
                                java.lang.String a2 = bazVar.a();
                                boolean z2 = true;
                                try {
                                    query = context.getContentResolver().query(android.net.Uri.parse("content://" + a2 + ".TcInfoContentProvider/tcBottomSheet"), null, null, null, null);
                                } catch (java.lang.Exception unused2) {
                                }
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            if (query.getInt(0) == 1) {
                                                z = true;
                                            }
                                            query.close();
                                            z2 = z;
                                            if (!z2) {
                                                addCategory.setAction("com.truecaller.android.sdk.intent.action.v1.SHARE_PROFILE");
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (query != null) {
                                    query.close();
                                }
                                if (!z2) {
                                }
                            }
                            return addCategory;
                        }
                    }
                }
            }
        }
    }
}
