package com.truecaller.util;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class TempContentProvider extends android.content.ContentProvider {
    public static final java.lang.String[] a = {"_size"};

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r3.createNewFile() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.net.Uri a(android.content.Context context) {
        java.io.File file = new java.io.File(context.getCacheDir(), "temp_provider");
        if (file.exists() || file.mkdirs()) {
            java.lang.String a2 = jj3.baz.a(32, false, true);
            java.io.File file2 = new java.io.File(file, a2);
            try {
                if (!file2.exists()) {
                }
                return android.net.Uri.withAppendedPath(android.net.Uri.parse("content://" + context.getPackageName() + ".TempContentProvider"), a2);
            } catch (java.io.IOException e) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                return null;
            }
        }
        return null;
    }

    public final java.io.File b(android.net.Uri uri) {
        java.lang.String path;
        java.lang.String str;
        android.content.Context context = getContext();
        if (context != null && (path = uri.getPath()) != null) {
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (path.startsWith("-")) {
                str = path.substring(1);
            } else {
                str = path;
            }
            if (!jj3.bar.l(str)) {
                return null;
            }
            return new java.io.File(new java.io.File(context.getCacheDir(), "temp_provider"), path);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.io.File b = b(uri);
        if (b != null && b.delete()) {
            return 1;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        int i;
        java.io.File b = b(uri);
        if (b == null) {
            return null;
        }
        if (com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ.equals(str)) {
            i = 268435456;
        } else {
            i = 603979776;
        }
        return android.os.ParcelFileDescriptor.open(b, i);
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i;
        boolean z;
        long j;
        java.lang.Long valueOf;
        java.lang.String[] strArr3 = a;
        if (strArr == null) {
            strArr = strArr3;
        } else if (strArr.length > 0) {
            for (java.lang.String str3 : strArr) {
                if (str3 == null) {
                    i = 0;
                    while (i < 1) {
                        if (strArr3[i] == null) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                } else {
                    if (strArr3.getClass().getComponentType().isInstance(str3)) {
                        i = 0;
                        while (i < 1) {
                            if (str3.equals(strArr3[i])) {
                                break;
                            }
                            i++;
                        }
                    }
                    i = -1;
                }
                if (i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                com.truecaller.log.AssertionUtil.isTrue(z, new java.lang.String[]{bar.t("Unsupported column '", str3, "' queried")});
            }
        }
        java.io.File b = b(uri);
        if (b == null) {
            return null;
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str4 : strArr) {
            if (str4.equals("_size")) {
                try {
                    j = b.length();
                } catch (java.lang.SecurityException unused) {
                    j = -1;
                }
                valueOf = java.lang.Long.valueOf(j);
            } else {
                valueOf = null;
            }
            arrayList.add(valueOf);
        }
        matrixCursor.addRow(arrayList);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
