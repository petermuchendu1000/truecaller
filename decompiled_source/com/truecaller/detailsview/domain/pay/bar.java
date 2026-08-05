package com.truecaller.detailsview.domain.pay;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar {
    public final android.content.Context a;
    public final kotlin.Lazy b;

    public bar(android.content.Context context, wj2.i iVar, u03.q qVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "searchConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "gsonUtil");
        this.a = context;
        this.b = kotlin.LazyKt.lazy(new i7.qux(3, qVar, iVar));
    }

    public final java.util.List a() {
        java.util.List list = (java.util.List) this.b.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            boolean z = false;
            try {
                android.content.pm.ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(((com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp) obj).getPackageName(), 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                z = applicationInfo.enabled;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.w0(new fq1.c(13), arrayList);
    }
}
