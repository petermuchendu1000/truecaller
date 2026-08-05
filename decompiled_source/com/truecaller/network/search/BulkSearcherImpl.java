package com.truecaller.network.search;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class BulkSearcherImpl {
    public final android.content.Context a;
    public final int b;
    public final int c;
    public final int d;
    public final android.os.Handler e;
    public final u03.w f;
    public final c62.q g;
    public final int h;
    public final java.lang.String i;
    public boolean m;

    @androidx.annotation.Keep
    private c62.n mListener;
    public java.lang.Long n;
    public final java.util.ArrayList p;
    public final k0.d q;
    public final java.util.HashSet j = new java.util.HashSet();
    public final java.util.HashSet k = new java.util.HashSet();
    public final java.util.HashMap l = new java.util.HashMap();
    public final c62.g o = new c62.g(this);

    public BulkSearcherImpl(android.content.Context context, int i, java.lang.String str, c62.f fVar, c62.q qVar, u03.w wVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.p = arrayList;
        this.q = new k0.d(this);
        this.a = context.getApplicationContext();
        this.b = 10;
        this.c = 2;
        this.d = 500;
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.h = i;
        this.i = str;
        if (fVar != null) {
            arrayList.add(fVar);
        }
        this.g = qVar;
        this.f = wVar;
        this.m = ((u03.x) wVar).e();
        this.n = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        java.lang.Integer num;
        if (str != null) {
            boolean contains = this.j.contains(str);
            c62.g gVar = this.o;
            if (!contains && !this.k.contains(str) && !gVar.containsKey(str) && (((num = (java.lang.Integer) this.l.get(str)) == null || num.intValue() <= this.c) && !jj3.bar.h(str) && (20 == this.h || t41.i0.f(str)))) {
                if (java.lang.System.currentTimeMillis() > this.n.longValue() + 60000) {
                    this.m = this.f.e();
                    this.n = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                }
                if (this.m && this.a.d()) {
                    gVar.put(str, new c62.c(str, str2));
                }
            }
            android.os.Handler handler = this.e;
            k0.d dVar = this.q;
            handler.removeCallbacks(dVar);
            if (!gVar.isEmpty()) {
                handler.postDelayed(dVar, this.d);
            }
        }
    }

    public final void c(java.util.ArrayList arrayList) {
        int i;
        this.j.removeAll(arrayList);
        this.k.removeAll(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.HashMap hashMap = this.l;
            if (hashMap.containsKey(str)) {
                i = ((java.lang.Integer) hashMap.get(str)).intValue() + 1;
            } else {
                i = 0;
            }
            hashMap.put(str, java.lang.Integer.valueOf(i));
        }
        java.util.Iterator it2 = this.p.iterator();
        while (it2.hasNext()) {
            ((c62.f) it2.next()).s1(new java.util.HashSet(arrayList));
        }
    }

    public final boolean d(java.lang.String str) {
        if (str != null) {
            if (this.o.containsKey(str) || this.k.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
