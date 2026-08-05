package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class DialerNumberLookupService extends androidx.lifecycle.g0 implements android.os.Handler.Callback, bd3.qux {
    public volatile yc3.g b;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d = false;
    public q81.b e;
    public su0.b f;
    public ah.n g;
    public n11.l h;
    public c62.q i;
    public java.text.NumberFormat j;
    public android.os.Messenger k;
    public android.os.Handler l;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(2:22|(2:24|25)(10:26|(2:28|(1:30)(2:50|51))(1:52)|31|(1:33)|34|(1:36)(1:49)|37|(2:39|(1:41))|42|(2:44|(1:46))(2:47|48)))|12|(2:14|(1:16))|17|18))|54|6|7|(0)(0)|12|(0)|17|18) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0142 A[Catch: InterruptedException -> 0x0156, TryCatch #0 {InterruptedException -> 0x0156, blocks: (B:11:0x0025, B:12:0x013e, B:14:0x0142, B:16:0x014a, B:42:0x012d, B:44:0x0131, B:47:0x0150, B:48:0x0155), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.service.DialerNumberLookupService dialerNumberLookupService, android.os.Bundle bundle, com.truecaller.data.entity.Contact contact, java.lang.String str, com.truecaller.data.entity.Number number, ff3.qux quxVar) {
        dq2.a aVar;
        int i;
        java.lang.String logo;
        com.truecaller.data.entity.HistoryEvent historyEvent;
        if (quxVar instanceof dq2.a) {
            aVar = (dq2.a) quxVar;
            int i2 = aVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.A;
                if (i == 0) {
                    if (i == 1) {
                        bundle = aVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (contact == null) {
                        return kotlin.Unit.a;
                    }
                    bundle.putString("phoneNumber", number.d());
                    bundle.putString("normalizedNumber", number.f);
                    java.lang.Integer num = number.m;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "getTelType(...)");
                    bundle.putInt("phoneType", num.intValue());
                    bundle.putString("phoneLabel", number.l);
                    if (contact.X()) {
                        bundle.putString("displayName", dialerNumberLookupService.getString(2132017224, contact.s()));
                        java.text.NumberFormat numberFormat = dialerNumberLookupService.j;
                        if (numberFormat != null) {
                            bundle.putString("spamString", dialerNumberLookupService.getString(2132017225, numberFormat.format(contact.A)));
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("numberFormat");
                            throw null;
                        }
                    } else {
                        bundle.putString("displayName", contact.s());
                    }
                    android.net.Uri j = m03.r.j(contact, false);
                    if (j != null) {
                        bundle.putString("imageUrl", j.toString());
                    }
                    java.util.ArrayList arrayList = contact.d;
                    if (arrayList.isEmpty()) {
                        logo = "";
                    } else {
                        logo = ((com.truecaller.contact.entity.model.SourceEntity) arrayList.get(0)).getLogo();
                    }
                    bundle.putBoolean("isBusiness", jj3.bar.k(logo));
                    bundle.putBoolean("isSpam", contact.X());
                    android.content.res.Resources resources = dialerNumberLookupService.getResources();
                    bundle.putString("spamLogo", resources.getResourceEntryName(2131234234));
                    if (!contact.Q()) {
                        e42.bar c = r03.d.b(dialerNumberLookupService).c(dialerNumberLookupService);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getTheme(...)");
                        bundle.putString("partnerLogo", resources.getResourceEntryName(c.b));
                        bundle.putString("identifiedByText", resources.getString(2132018074));
                        if (c.b()) {
                            bundle.putString("poweredByLogo", null);
                            bundle.putString("poweredByText", resources.getString(2132018381));
                        }
                    }
                    su0.f fVar = dialerNumberLookupService.f;
                    if (fVar != null) {
                        aVar.x = bundle;
                        aVar.A = 1;
                        obj = fVar.b(str, aVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("mHistoryManager");
                        throw null;
                    }
                }
                historyEvent = (com.truecaller.data.entity.HistoryEvent) obj;
                if (historyEvent != null) {
                    long j2 = historyEvent.j;
                    if (j2 > 0) {
                        bundle.putLong("lastCall", j2);
                    }
                }
                return kotlin.Unit.a;
            }
        }
        aVar = new dq2.a(dialerNumberLookupService, quxVar);
        java.lang.Object obj2 = aVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = aVar.A;
        if (i == 0) {
        }
        historyEvent = (com.truecaller.data.entity.HistoryEvent) obj2;
        if (historyEvent != null) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.b == null) {
            synchronized (this.c) {
                try {
                    if (this.b == null) {
                        this.b = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.b.X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.d) {
            this.d = true;
            tx.w wVar = ((dq2.b) X3()).b;
            this.e = (q81.b) wVar.S5.get();
            this.f = (su0.b) wVar.Qh.get();
            this.g = wVar.A2();
            this.h = (n11.l) wVar.o0.get();
            this.i = (c62.q) wVar.t4.get();
            this.j = jp2.g.a();
        }
        super.onCreate();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(1:3)(2:45|(9:47|5|6|7|(1:9)|11|(6:13|14|15|16|17|(4:19|(7:21|22|23|24|(1:26)|27|28)|35|36))|41|42)(1:48))|4|5|6|7|(0)|11|(0)|41|42) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[Catch: RemoteException -> 0x0079, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x0079, blocks: (B:7:0x0072, B:9:0x0076), top: B:6:0x0072 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(android.os.Message message) {
        com.truecaller.service.DialerNumberLookupService dialerNumberLookupService;
        boolean z;
        java.lang.String string;
        android.os.Messenger messenger;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
        java.lang.String string2 = message.getData().getString("phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "responseData");
        android.graphics.Bitmap bitmap = null;
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(string2, this, bundle, (df3.bar) null, 16), 3);
        int i = message.what;
        if (1001 == i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "responseData");
            dialerNumberLookupService = this;
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new be1.w(string2, bundle, dialerNumberLookupService, 2, (df3.bar) null, 6), 3);
        } else {
            if (2002 == i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "responseData");
                dialerNumberLookupService = this;
                z = true;
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new be1.w(string2, bundle, dialerNumberLookupService, 1, (df3.bar) null, 6), 3);
                obtain.setData(bundle);
                messenger = message.replyTo;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                string = bundle.getString("imageUrl");
                if (!jj3.bar.i(string)) {
                    android.net.Uri parse = android.net.Uri.parse(string);
                    try {
                        com.bumptech.glide.g q = com.bumptech.glide.baz.b(this).c(this).c().S(parse).q(800, 800);
                        dg.k kVar = dg.k.b;
                        q.getClass();
                        com.bumptech.glide.g e = q.x(dg.k.h, kVar).e();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "centerInside(...)");
                        bitmap = (android.graphics.Bitmap) j52.b.r(e, parse).V(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                    } catch (java.lang.Throwable unused) {
                    }
                    android.os.Handler handler = dialerNumberLookupService.l;
                    if (handler != null) {
                        android.os.Message obtainMessage = handler.obtainMessage(4004);
                        if (bitmap != null) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            try {
                                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream);
                            } catch (java.lang.IllegalStateException e2) {
                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.IllegalStateException(k9.d.q("Cannot compress bitmap: ", e2.getMessage())));
                            }
                            bundle2.putByteArray("image_data", byteArrayOutputStream.toByteArray());
                            if (obtainMessage != null) {
                                obtainMessage.setData(bundle2);
                            }
                            try {
                                bitmap.recycle();
                            } catch (java.lang.IllegalStateException e3) {
                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.IllegalStateException(k9.d.q("Cannot recycle bitmap: ", e3.getMessage())));
                            }
                        }
                        try {
                            message.replyTo.send(obtainMessage);
                        } catch (android.os.RemoteException unused2) {
                        }
                    }
                }
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                return z;
            }
            dialerNumberLookupService = this;
        }
        z = true;
        obtain.setData(bundle);
        messenger = message.replyTo;
        if (messenger != null) {
        }
        string = bundle.getString("imageUrl");
        if (!jj3.bar.i(string)) {
        }
        android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        return z;
    }

    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super.onBind(intent);
        android.os.Messenger messenger = this.k;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        b();
        this.l = new android.os.Handler(uf.qux.i("DialerLookup").getLooper(), this);
        this.k = new android.os.Messenger(this.l);
    }

    public final void onDestroy() {
        android.os.Looper looper;
        android.os.Handler handler = this.l;
        if (handler != null && (looper = handler.getLooper()) != null) {
            looper.quit();
        }
        this.l = null;
        this.k = null;
        super.onDestroy();
    }
}
