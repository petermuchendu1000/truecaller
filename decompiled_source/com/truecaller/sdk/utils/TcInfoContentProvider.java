package com.truecaller.sdk.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TcInfoContentProvider extends android.content.ContentProvider {
    public static final /* synthetic */ int b = 0;
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new h40.b(this, 13));

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/sdk/utils/TcInfoContentProvider$bar;", "", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface bar {
    }

    public final hp2.d a() {
        return (hp2.d) this.a.getValue();
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return "vnd.android.cursor.item/";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i;
        java.util.List g0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        android.content.Context context = getContext();
        java.lang.Object obj = null;
        android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
        r11.bar barVar = applicationContext instanceof r11.bar ? (r11.bar) applicationContext : null;
        if (barVar != null) {
            tx.w wVar = (com.truecaller.sdk.utils.TcInfoContentProvider.bar) f40.d0.z(barVar, com.truecaller.sdk.utils.TcInfoContentProvider.bar.class);
            qo1.q qVar = (qo1.q) wVar.u3.get();
            wj2.h hVar = (wj2.h) wVar.v3.get();
            if (!kotlin.jvm.internal.Intrinsics.b(uri, a().b) && !kotlin.jvm.internal.Intrinsics.b(uri, a().a)) {
                if (kotlin.jvm.internal.Intrinsics.b(uri, a().c)) {
                    android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(new java.lang.String[]{"accountState"}, 1);
                    matrixCursor.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(qVar.a.a("featureSdkBottomSheetDialog", com.truecaller.featuretoggles.FeatureState.ENABLED) ? 1 : 0)});
                    return matrixCursor;
                }
                if (kotlin.jvm.internal.Intrinsics.b(uri, a().d)) {
                    android.database.MatrixCursor matrixCursor2 = new android.database.MatrixCursor(new java.lang.String[]{"accountState"}, 1);
                    matrixCursor2.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(qVar.a.a("featureSdkOAuth", com.truecaller.featuretoggles.FeatureState.DISABLED) ? 1 : 0)});
                    return matrixCursor2;
                }
                if (kotlin.jvm.internal.Intrinsics.b(uri, a().e)) {
                    android.database.MatrixCursor matrixCursor3 = new android.database.MatrixCursor(new java.lang.String[]{"accountState"}, 1);
                    matrixCursor3.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(qVar.a.a("featureSdkOAuthPopupMode", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG) ? 1 : 0)});
                    return matrixCursor3;
                }
                if (kotlin.jvm.internal.Intrinsics.b(uri, a().f)) {
                    android.database.MatrixCursor matrixCursor4 = new android.database.MatrixCursor(new java.lang.String[]{"accountState"}, 1);
                    matrixCursor4.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(qVar.a.a("featureSdk1tap", com.truecaller.featuretoggles.FeatureState.ENABLED) ? 1 : 0)});
                    return matrixCursor4;
                }
                if (kotlin.jvm.internal.Intrinsics.b(uri, a().g)) {
                    u03.b bVar = (u03.b) wVar.O.get();
                    android.database.MatrixCursor matrixCursor5 = new android.database.MatrixCursor(new java.lang.String[]{"accountState"}, 1);
                    java.lang.String d = hVar.a.d("oauthSdkDeviceModelBlacklist_36521", "");
                    if (kotlin.text.StringsKt.X(d)) {
                        d = null;
                    }
                    if (d != null && (g0 = kotlin.text.StringsKt.g0(d, new java.lang.String[]{","}, 0, 6)) != null) {
                        if (g0.isEmpty()) {
                            g0 = null;
                        }
                        if (g0 != null) {
                            ((u03.c) bVar).getClass();
                            java.lang.String str3 = android.os.Build.DEVICE;
                            if (kotlin.text.StringsKt.X(str3)) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                java.util.Iterator it = g0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    java.lang.Object next = it.next();
                                    if (str3.equalsIgnoreCase((java.lang.String) next)) {
                                        obj = next;
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    i = 0;
                                    matrixCursor5.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(i)});
                                    return matrixCursor5;
                                }
                            }
                        }
                    }
                    i = 1;
                    matrixCursor5.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(i)});
                    return matrixCursor5;
                }
            } else {
                android.database.MatrixCursor matrixCursor6 = new android.database.MatrixCursor(new java.lang.String[]{"accountState"}, 1);
                matrixCursor6.addRow(new java.lang.Integer[]{java.lang.Integer.valueOf(barVar.d() ? 1 : 0)});
                return matrixCursor6;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, android.os.Bundle bundle, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return query(uri, strArr, null, null, null);
    }
}
