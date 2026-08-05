package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz extends android.os.Handler {
    public final /* synthetic */ int a = 3;
    public java.lang.ref.WeakReference b;

    public /* synthetic */ baz() {
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i;
        long j;
        long j2;
        switch (this.a) {
            case 0:
                com.truecaller.messaging.notifications.ClassZeroActivity classZeroActivity = (com.truecaller.messaging.notifications.ClassZeroActivity) this.b.get();
                if (message.what == 1 && classZeroActivity != null) {
                    int i2 = com.truecaller.messaging.notifications.ClassZeroActivity.k0;
                    classZeroActivity.v0(false);
                    classZeroActivity.u0();
                    return;
                }
                return;
            case 1:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "msg");
                f42.qux quxVar = (f42.qux) this.b.get();
                if (quxVar != null) {
                    bm.e eVar = quxVar.b;
                    int i3 = message.what;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            java.lang.Object obj = message.obj;
                            kotlin.jvm.internal.Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                            if (!booleanValue) {
                                xz1.q qVar = (xz1.q) eVar.c;
                                ((u03.baz) eVar.b).getClass();
                                ((xz1.r) qVar).e0("lastProcessedImEventTimestamp", java.lang.System.currentTimeMillis());
                            }
                            quxVar.d(booleanValue);
                            return;
                        }
                        return;
                    }
                    java.lang.Object obj2 = message.obj;
                    kotlin.jvm.internal.Intrinsics.e(obj2, "null cannot be cast to non-null type com.truecaller.api.services.messenger.v1.events.Event");
                    re0.t0 t0Var = (re0.t0) obj2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t0Var, "event");
                    if (!quxVar.h) {
                        com.truecaller.messaging.transport.im.ProcessResult u = eVar.u(t0Var);
                        if (u == null) {
                            i = -1;
                        } else {
                            i = f42.baz.a[u.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1) {
                                if (i == 2) {
                                    quxVar.e();
                                    return;
                                }
                                throw new java.lang.RuntimeException();
                            }
                            quxVar.c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "msg");
                f42.n0 n0Var = (f42.n0) this.b.get();
                if (n0Var != null) {
                    bm.e eVar2 = n0Var.d;
                    int i4 = message.what;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            java.lang.Object obj3 = message.obj;
                            kotlin.jvm.internal.Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
                            if (!booleanValue2) {
                                xz1.q qVar2 = (xz1.q) eVar2.c;
                                ((u03.baz) eVar2.b).getClass();
                                ((xz1.r) qVar2).e0("lastProcessedImEventTimestamp", java.lang.System.currentTimeMillis());
                            }
                            if (!n0Var.h) {
                                ab.baz bazVar = n0Var.b;
                                n0Var.a.getClass();
                                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                if (booleanValue2) {
                                    j = 30000;
                                } else {
                                    j = 10000;
                                }
                                if (elapsedRealtime - bazVar.b > 2 * j) {
                                    bazVar.a = 0L;
                                }
                                if (booleanValue2) {
                                    j2 = 5000;
                                } else {
                                    j2 = 1000;
                                }
                                long min = (long) java.lang.Math.min(java.lang.Math.pow(2.0d, bazVar.a) * j2, j);
                                bazVar.a++;
                                bazVar.b = elapsedRealtime;
                                com.truecaller.messaging.notifications.baz bazVar2 = n0Var.g;
                                if (bazVar2 != null) {
                                    bazVar2.postDelayed(n0Var.e, min);
                                    return;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("handler");
                                    throw null;
                                }
                            }
                            f42.l0 l0Var = n0Var.c;
                            synchronized (l0Var) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0Var, "observer");
                                l0Var.h.remove(n0Var);
                            }
                            android.os.HandlerThread handlerThread = n0Var.f;
                            if (handlerThread != null) {
                                handlerThread.quitSafely();
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("thread");
                                throw null;
                            }
                        }
                        return;
                    }
                    java.lang.Object obj4 = message.obj;
                    kotlin.jvm.internal.Intrinsics.e(obj4, "null cannot be cast to non-null type com.truecaller.api.services.messenger.v1.events.Event");
                    re0.t0 t0Var2 = (re0.t0) obj4;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t0Var2, "event");
                    if (!n0Var.h && eVar2.u(t0Var2) == com.truecaller.messaging.transport.im.ProcessResult.FORCE_UPGRADE_ENCOUNTERED) {
                        n0Var.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                int i5 = message.what;
                if (i5 != -3 && i5 != -2 && i5 != -1) {
                    if (i5 == 1) {
                        ((android.content.DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) this.b.get(), message.what);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(f42.n0 n0Var, android.os.Looper looper) {
        super(looper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0Var, "subscriptionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
        this.b = new java.lang.ref.WeakReference(n0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(f42.qux quxVar, android.os.Looper looper) {
        super(looper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "subscriptionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
        this.b = new java.lang.ref.WeakReference(quxVar);
    }

    public baz(com.truecaller.messaging.notifications.ClassZeroActivity classZeroActivity) {
        this.b = new java.lang.ref.WeakReference(classZeroActivity);
    }
}
