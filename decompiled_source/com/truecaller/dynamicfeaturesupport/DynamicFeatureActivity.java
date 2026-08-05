package com.truecaller.dynamicfeaturesupport;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/dynamicfeaturesupport/DynamicFeatureActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "dynamic-features-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class DynamicFeatureActivity extends androidx.appcompat.app.AppCompatActivity {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        android.app.Application application = getApplication();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
        ms.bar.d(application, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
        ms.bar barVar = (ms.bar) ms.bar.e.get();
        if (barVar == null) {
            if (getApplicationContext() != null) {
                ms.bar.d(getApplicationContext(), false);
            }
            ms.bar.d(this, false);
            return;
        }
        i.d0 d0Var = barVar.d;
        java.util.HashSet a = barVar.a();
        synchronized (d0Var) {
            try {
                threadPolicy = android.os.StrictMode.getThreadPolicy();
                try {
                    android.os.StrictMode.allowThreadDiskReads();
                    android.os.StrictMode.allowThreadDiskWrites();
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception unused2) {
                threadPolicy = null;
            }
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = a.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    java.io.File file = new java.io.File(((e4.baz) d0Var.b).j(), "verified-splits");
                    e4.baz.h(file);
                    hashSet.add(e4.baz.g(file, java.lang.String.valueOf(str).concat(".apk")));
                }
                d0Var.H(this, hashSet);
            } catch (java.lang.Exception unused3) {
                if (threadPolicy != null) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (java.lang.Throwable th) {
                if (threadPolicy != null) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
    }
}
