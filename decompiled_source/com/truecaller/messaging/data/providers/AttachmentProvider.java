package com.truecaller.messaging.data.providers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AttachmentProvider extends android.content.ContentProvider {
    public static b22.baz b(android.net.Uri uri) {
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(pathSegments);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 108243) {
                if (hashCode != 870994574) {
                    if (hashCode == 959285800 && str.equals("private_media")) {
                        return b22.baz.b;
                    }
                } else if (str.equals("public_media")) {
                    return b22.baz.c;
                }
            } else if (str.equals("mms")) {
                return b22.baz.d;
            }
        }
        return b22.baz.a;
    }

    public static android.os.ParcelFileDescriptor c(android.net.Uri uri, java.io.File file) {
        java.io.File a = b22.bar.a(uri, file);
        if (a != null && a.exists()) {
            android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(a, 268435456);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            return open;
        }
        throw new java.io.FileNotFoundException(uri.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Long] */
    public static java.util.ArrayList e(android.net.Uri uri, java.util.ArrayList arrayList, java.io.File file) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String str2 = null;
            android.os.ParcelFileDescriptor parcelFileDescriptor = null;
            str2 = null;
            str2 = null;
            str2 = null;
            str2 = null;
            switch (str.hashCode()) {
                case -488395321:
                    if (!str.equals("_display_name")) {
                        break;
                    } else {
                        java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(uri.getQueryParameter("mime"));
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = "bin";
                        }
                        str2 = "attachment.".concat(extensionFromMimeType);
                        break;
                    }
                case -196041627:
                    if (!str.equals("mime_type")) {
                        break;
                    } else {
                        str2 = uri.getQueryParameter("mime");
                        break;
                    }
                case 90810505:
                    if (!str.equals("_data")) {
                        break;
                    } else {
                        str2 = uri.toString();
                        break;
                    }
                case 91265248:
                    if (str.equals("_size")) {
                        try {
                            parcelFileDescriptor = c(uri, file);
                            ?? valueOf = java.lang.Long.valueOf(parcelFileDescriptor.getStatSize());
                            parcelFileDescriptor.close();
                            str2 = valueOf;
                            break;
                        } catch (java.lang.Throwable th) {
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                            throw th;
                        }
                    } else {
                        continue;
                    }
            }
            arrayList2.add(str2);
        }
        return arrayList2;
    }

    public final java.io.File a() {
        java.io.File file;
        android.content.Context context = getContext();
        if (context != null) {
            file = context.getFilesDir();
        } else {
            file = null;
        }
        return new java.io.File(file, "media");
    }

    public final android.os.ParcelFileDescriptor d(android.net.Uri uri) {
        java.util.List f0;
        java.lang.String str;
        android.content.ContentResolver contentResolver;
        android.os.ParcelFileDescriptor openFileDescriptor;
        try {
            java.lang.String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null && (f0 = kotlin.text.StringsKt.f0(lastPathSegment, new char[]{'.'}, 6)) != null && (str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(f0)) != null) {
                if (jj3.bar.l(str)) {
                    android.net.Uri build = b22.bar.a.buildUpon().appendPath(str).build();
                    android.content.Context context = getContext();
                    if (context != null && (contentResolver = context.getContentResolver()) != null && (openFileDescriptor = contentResolver.openFileDescriptor(build, "r")) != null) {
                        return openFileDescriptor;
                    }
                    throw new java.io.FileNotFoundException(uri.toString());
                }
                throw new java.io.FileNotFoundException(uri.toString());
            }
            throw new java.io.FileNotFoundException(uri.toString());
        } catch (java.io.IOException e) {
            throw new java.io.FileNotFoundException(e.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.io.File file;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(pathSegments);
        if (kotlin.jvm.internal.Intrinsics.b(str2, "private_media")) {
            file = b22.bar.a(uri, a());
        } else if (kotlin.jvm.internal.Intrinsics.b(str2, "public_media")) {
            file = b22.bar.a(uri, new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Truecaller"));
        } else {
            file = null;
        }
        if (file == null) {
            return 0;
        }
        return file.delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return uri.getQueryParameter("mime");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        throw new java.lang.UnsupportedOperationException("No inserts allowed");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "mode");
        if (kotlin.jvm.internal.Intrinsics.b(str, "r")) {
            int ordinal = b(uri).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return d(uri);
                        }
                        throw new java.lang.RuntimeException();
                    }
                    return c(uri, new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Truecaller"));
                }
                return c(uri, a());
            }
            throw new java.lang.IllegalArgumentException(os0.bar.v(uri, "Unsupported path: "));
        }
        throw new java.lang.IllegalArgumentException(bar.t("Open mode \"", str, "\" is not allowed"));
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return query(uri, strArr, str, strArr2, str2, null);
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        throw new java.lang.UnsupportedOperationException("No updates allowed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
        java.util.ArrayList e;
        android.os.ParcelFileDescriptor parcelFileDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        b22.baz b = b(uri);
        java.lang.Iterable u = kotlin.collections.v.u(strArr == null ? new java.lang.String[0] : strArr);
        java.lang.String[] strArr3 = b22.bar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str3 : strArr3) {
            if (strArr == null || !kotlin.collections.v.z(strArr, str3)) {
                arrayList.add(str3);
            }
        }
        java.util.ArrayList j0 = kotlin.collections.CollectionsKt.j0(u, arrayList);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor((java.lang.String[]) j0.toArray(new java.lang.String[0]), 1);
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                e = e(uri, j0, a());
            } else if (ordinal == 2) {
                e = e(uri, j0, new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Truecaller"));
            } else if (ordinal == 3) {
                e = new java.util.ArrayList(kotlin.collections.z.q(j0, 10));
                java.util.Iterator it = j0.iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it.next();
                    ?? r1 = 0;
                    r1 = 0;
                    r1 = 0;
                    android.os.ParcelFileDescriptor parcelFileDescriptor2 = null;
                    r1 = 0;
                    r1 = 0;
                    r1 = 0;
                    r1 = 0;
                    switch (str4.hashCode()) {
                        case -488395321:
                            if (str4.equals("_display_name")) {
                                r1 = uri.getLastPathSegment();
                                break;
                            } else {
                                break;
                            }
                        case -196041627:
                            if (str4.equals("mime_type")) {
                                r1 = getType(uri);
                                break;
                            } else {
                                break;
                            }
                        case 90810505:
                            if (str4.equals("_data")) {
                                r1 = uri.toString();
                                break;
                            } else {
                                break;
                            }
                        case 91265248:
                            if (str4.equals("_size")) {
                                try {
                                    parcelFileDescriptor = d(uri);
                                } catch (java.io.FileNotFoundException unused) {
                                    parcelFileDescriptor = null;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                }
                                try {
                                    r1 = java.lang.Long.valueOf(parcelFileDescriptor.getStatSize());
                                } catch (java.io.FileNotFoundException unused2) {
                                    if (parcelFileDescriptor == null) {
                                        e.add(r1);
                                    }
                                    parcelFileDescriptor.close();
                                    e.add(r1);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    parcelFileDescriptor2 = parcelFileDescriptor;
                                    if (parcelFileDescriptor2 != null) {
                                        parcelFileDescriptor2.close();
                                    }
                                    throw th;
                                }
                                parcelFileDescriptor.close();
                            }
                    }
                    e.add(r1);
                }
            } else {
                throw new java.lang.RuntimeException();
            }
            matrixCursor.addRow(e.toArray(new java.lang.Object[0]));
            return matrixCursor;
        }
        throw new java.lang.IllegalArgumentException(os0.bar.v(uri, "Unsupported uri: "));
    }
}
