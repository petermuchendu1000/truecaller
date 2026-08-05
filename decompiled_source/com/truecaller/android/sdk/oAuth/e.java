package com.truecaller.android.sdk.oAuth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class e {
    public static final java.util.ArrayList a;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a = arrayList;
        arrayList.add(new java.lang.Object());
        arrayList.add(new java.lang.Object());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.content.Intent a(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] s;
        android.database.Cursor query;
        java.util.Iterator it = a.iterator();
        while (it.hasNext()) {
            com.truecaller.android.sdk.oAuth.b bVar = (com.truecaller.android.sdk.oAuth.b) it.next();
            android.content.Intent addCategory = new android.content.Intent(str).setPackage(bVar.a()).addCategory("android.intent.category.DEFAULT");
            boolean z = false;
            android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(addCategory, 0);
            if (resolveActivity != null && (s = ll.baz.s(context, resolveActivity.activityInfo.packageName)) != null) {
                for (android.content.pm.Signature signature : s) {
                    java.lang.String v = ll.baz.v(signature.toByteArray());
                    if (v != null && com.truecaller.android.sdk.oAuth.b.a.contains(v)) {
                        if (str.equals("com.truecaller.android.sdk.intent.action.v2.oAuth")) {
                            java.lang.String a2 = bVar.a();
                            boolean z2 = true;
                            try {
                                query = context.getContentResolver().query(android.net.Uri.parse("content://" + a2 + ".TcInfoContentProvider/tcOAuthPopup"), null, null, null, null);
                            } catch (java.lang.Exception unused) {
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
                                            addCategory.setAction("com.truecaller.android.sdk.intent.action.v1.oAuth");
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
        return null;
    }
}
