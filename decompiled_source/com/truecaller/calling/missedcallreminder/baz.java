package com.truecaller.calling.missedcallreminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz {
    public final android.content.Context a;
    public final dn2.qux b;
    public final java.util.Map c;
    public final hw0.a d;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public baz(android.content.Context context, dn2.qux quxVar, hw0.a aVar) {
        java.util.Map map;
        java.util.Map synchronizedMap;
        this.a = context.getApplicationContext();
        this.b = quxVar;
        this.d = aVar;
        java.lang.String string = z62.d.a.getString("missedCallReminders", "");
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                map = (java.util.Map) new com.google.gson.Gson().fromJson(string, new hw.bar().getType());
            } catch (java.lang.Exception unused) {
            }
            synchronizedMap = java.util.Collections.synchronizedMap(map == null ? new java.util.HashMap() : map);
            this.c = synchronizedMap;
            synchronized (synchronizedMap) {
                try {
                    java.util.Iterator it = synchronizedMap.values().iterator();
                    while (it.hasNext()) {
                        e((com.truecaller.calling.missedcallreminder.MissedCallReminder) it.next());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return;
        }
        map = null;
        synchronizedMap = java.util.Collections.synchronizedMap(map == null ? new java.util.HashMap() : map);
        this.c = synchronizedMap;
        synchronized (synchronizedMap) {
        }
    }

    public final void a() {
        int i;
        synchronized (this.c) {
            try {
                for (com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder : this.c.values()) {
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        i = 570425344;
                    } else {
                        i = 536870912;
                    }
                    android.app.PendingIntent c = c(missedCallReminder, i);
                    if (c != null) {
                        ((android.app.AlarmManager) this.a.getSystemService("alarm")).cancel(c);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.c.clear();
        d();
    }

    public final void b(java.lang.String str) {
        int i;
        java.util.Map map = this.c;
        com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder = (com.truecaller.calling.missedcallreminder.MissedCallReminder) map.get(str);
        if (missedCallReminder != null) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                i = 570425344;
            } else {
                i = 536870912;
            }
            android.app.PendingIntent c = c(missedCallReminder, i);
            if (c != null) {
                ((android.app.AlarmManager) this.a.getSystemService("alarm")).cancel(c);
            }
            map.remove(str);
            d();
        }
    }

    public final android.app.PendingIntent c(com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder, int i) {
        int i2 = com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.n;
        android.content.Context context = this.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missedCallReminder, "reminder");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("reminder", missedCallReminder);
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.class).setAction("com.truecaller.intent.action.MISSED_CALL_POST_REMINDER").putExtra("reminderBundle", bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return android.app.PendingIntent.getBroadcast(context, missedCallReminder.d, putExtra, i);
    }

    public final void d() {
        java.lang.String json;
        if (!this.c.isEmpty()) {
            synchronized (this.c) {
                json = new com.google.gson.Gson().toJson(this.c);
            }
            z62.d.l("missedCallReminders", json);
            return;
        }
        z62.d.j("missedCallReminders");
    }

    public final void e(com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder) {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        android.app.PendingIntent c = c(missedCallReminder, i);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = missedCallReminder.c;
        ((android.app.AlarmManager) this.a.getSystemService("alarm")).setRepeating(1, ((((currentTimeMillis - j) / 3600000) + 1) * 3600000) + j, 3600000L, c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        r3 = r12.e;
        r4 = r12.j;
        r0 = new java.lang.Object();
        r0.a = r3;
        r0.b = r1;
        r0.c = r4;
        r12 = com.truecaller.calling.missedcallreminder.MissedCallReminder.e;
        com.truecaller.calling.missedcallreminder.MissedCallReminder.e = r12 + 1;
        r0.d = r12;
        e(r0);
        r2.put(r1, r0);
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.truecaller.calling.missedcallreminder.MissedCallReminder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(com.truecaller.data.entity.HistoryEvent historyEvent) {
        hw0.q qVar = (hw0.q) this.d;
        qVar.getClass();
        android.database.Cursor cursor = null;
        if (((java.lang.Boolean) fg3.h0.O(kotlin.coroutines.d.a, new hw0.i(qVar, cursor, 2))).booleanValue()) {
            android.content.Context context = this.a;
            if (((tx.a1) context).d()) {
                java.lang.String str = historyEvent.d;
                if (this.b.e(context, str)) {
                    java.util.Map map = this.c;
                    try {
                        if (!map.containsKey(str)) {
                            try {
                                cursor = context.getContentResolver().query(h81.c.b(), new java.lang.String[]{"timestamp"}, "timestamp > ? AND type=2 AND normalized_number=?", new java.lang.String[]{java.lang.String.valueOf(historyEvent.j), str}, null);
                                if (cursor != null) {
                                    if (cursor.getCount() > 0) {
                                        cursor.close();
                                    }
                                }
                            } catch (java.lang.Exception e) {
                                o82.a.C(e);
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
