package com.truecaller.wearable.data.services;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class DataLayerListenerService extends com.google.android.gms.wearable.WearableListenerService implements bd3.qux {
    public static final /* synthetic */ int p = 0;
    public volatile yc3.g i;
    public final java.lang.Object j = new java.lang.Object();
    public boolean k = false;
    public final fe3.bar l = fg3.h0.b(kotlin.coroutines.b.d(fg3.h0.e(), fg3.r0.b));
    public final kotlin.Lazy m = kotlin.LazyKt.lazy(new e41.s(6));
    public com.google.android.gms.wearable.MessageClient n;
    public e63.a o;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.i.X3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(com.google.android.gms.wearable.DataEventBuffer dataEventBuffer) {
        java.lang.String host;
        java.lang.String path;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.Map f;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataEventBuffer, "dataEvents");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(dataEventBuffer, 10));
        java.util.Iterator it = dataEventBuffer.iterator();
        while (true) {
            java.lang.String str4 = null;
            if (it.hasNext()) {
                com.google.android.gms.wearable.DataEvent dataEvent = (com.google.android.gms.wearable.DataEvent) it.next();
                if (dataEvent.getType() == 1 && (host = dataEvent.s().getUri().getHost()) != null && (path = dataEvent.s().getUri().getPath()) != null) {
                    com.google.android.gms.wearable.DataItem s = dataEvent.s();
                    if (s != null) {
                        com.google.android.gms.wearable.DataMap dataMap = new com.google.android.gms.wearable.DataMapItem(s).a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataMap, "getDataMap(...)");
                        java.util.HashMap hashMap = dataMap.a;
                        java.util.HashMap hashMap2 = dataMap.a;
                        java.lang.Object obj2 = hashMap.get("_requestId");
                        if (obj2 != null) {
                            try {
                                str = (java.lang.String) obj2;
                            } catch (java.lang.ClassCastException unused) {
                            }
                            if (str == null) {
                                str = "";
                            }
                            str2 = str;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                            if (str2.length() != 0) {
                                java.lang.Object obj3 = hashMap2.get("_headers");
                                if (obj3 != null) {
                                    try {
                                        str3 = (java.lang.String) obj3;
                                    } catch (java.lang.ClassCastException unused2) {
                                    }
                                    if (str3 != null) {
                                        f = (java.util.Map) ((com.google.gson.Gson) this.m.getValue()).fromJson(str3, new e63.bar().getType());
                                    }
                                    f = kotlin.collections.r0.f();
                                    java.util.Map map = f;
                                    obj = hashMap2.get("_body");
                                    if (obj != null) {
                                        try {
                                            str4 = (java.lang.String) obj;
                                        } catch (java.lang.ClassCastException unused3) {
                                        }
                                    }
                                    if (str4 == null) {
                                        str4 = "{}";
                                    }
                                    linkedHashSet.add(new com.truecaller.wearable.data.services.DataLayerRequest(host, path, str2, str4, map));
                                }
                                str3 = null;
                                if (str3 != null) {
                                }
                                f = kotlin.collections.r0.f();
                                java.util.Map map2 = f;
                                obj = hashMap2.get("_body");
                                if (obj != null) {
                                }
                                if (str4 == null) {
                                }
                                linkedHashSet.add(new com.truecaller.wearable.data.services.DataLayerRequest(host, path, str2, str4, map2));
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                        str2 = str;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                        if (str2.length() != 0) {
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("dataItem must not be null");
                    }
                }
                arrayList.add(kotlin.Unit.a);
            } else {
                fg3.h0.J(this.l, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bu1.e(linkedHashSet, this, (df3.bar) null, 9), 3);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.k) {
            this.k = true;
            tx.c0 c0Var = ((e63.baz) X3()).b.b;
            this.n = (com.google.android.gms.wearable.MessageClient) c0Var.yd.get();
            this.o = (e63.a) c0Var.Bd.get();
        }
        super.onCreate();
    }

    public final void onDestroy() {
        super.onDestroy();
        fg3.h0.k(this.l, (java.util.concurrent.CancellationException) null);
    }
}
