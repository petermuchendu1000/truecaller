package com.truecaller.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MissedCallsNotificationActionReceiver extends com.truecaller.messaging.notifications.i {
    public static final /* synthetic */ int l = 0;
    public n11.l d;
    public xd0.qux e;
    public com.truecaller.calling.missedcallreminder.baz f;
    public nv0.c g;
    public nd1.bar h;
    public s62.d i;
    public android.content.Context j;
    public android.content.Intent k;

    public MissedCallsNotificationActionReceiver() {
        super(4);
    }

    public final void e(boolean z) {
        android.content.Intent intent = this.k;
        if (intent != null) {
            long longExtra = intent.getLongExtra("lastTimestamp", Long.MAX_VALUE);
            xd0.qux quxVar = this.e;
            if (quxVar != null) {
                ((su0.i) quxVar.a()).j(longExtra).E(new com.truecaller.messaging.notifications.x(this, 4));
                xd0.qux quxVar2 = this.e;
                if (quxVar2 != null) {
                    ((su0.i) quxVar2.a()).d(longExtra);
                    if (!z) {
                        android.content.Context context = this.j;
                        if (context != null) {
                            new java.lang.Thread((java.lang.Runnable) new d23.bar(context, 5)).start();
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("context");
                            throw null;
                        }
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("historyManager");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("historyManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("intent");
        throw null;
    }

    @Override // com.truecaller.messaging.notifications.i, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        super.onReceive(context, intent);
        if (context != null) {
            this.j = context;
            if (intent != null) {
                this.k = intent;
                java.lang.String action = intent.getAction();
                if (action != null) {
                    n11.o oVar = this.d;
                    if (oVar != null) {
                        if (!oVar.j()) {
                            return;
                        }
                        switch (action.hashCode()) {
                            case -1134405151:
                                if (action.equals("com.truecaller.BIZ_CALL_ME_BACK")) {
                                    android.content.Intent intent2 = this.k;
                                    if (intent2 != null) {
                                        java.lang.String stringExtra = intent2.getStringExtra("number");
                                        if (stringExtra != null) {
                                            android.content.Context context2 = this.j;
                                            if (context2 != null) {
                                                ak.r0.l(context2);
                                                android.content.Context context3 = this.j;
                                                if (context3 != null) {
                                                    nd1.bar barVar = this.h;
                                                    if (barVar != null) {
                                                        context3.startActivity(barVar.a(context3, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$ContactData(null, null, null, stringExtra, null, null, 55, null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationCallMeBack, null, 0, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.ShowCallMeBackBottomSheet.INSTANCE, 12, null)).addFlags(268435456));
                                                        break;
                                                    } else {
                                                        kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
                                                        throw null;
                                                    }
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("context");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("context");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("intent");
                                        throw null;
                                    }
                                }
                                break;
                            case -502740451:
                                if (action.equals("com.truecaller.CLEAR_ALTERNATIVE_MISSED_CALLS")) {
                                    e(true);
                                    break;
                                }
                                break;
                            case -152353365:
                                if (action.equals("com.truecaller.CLEAR_MISSED_CALLS")) {
                                    e(false);
                                    break;
                                }
                                break;
                            case 603891238:
                                if (action.equals("com.truecaller.CALL")) {
                                    android.content.Intent intent3 = this.k;
                                    if (intent3 != null) {
                                        long longExtra = intent3.getLongExtra("callLogId", -1L);
                                        if (longExtra != -1) {
                                            xd0.qux quxVar = this.e;
                                            if (quxVar != null) {
                                                ((su0.i) quxVar.a()).a(longExtra);
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("historyManager");
                                                throw null;
                                            }
                                        }
                                        android.content.Context context4 = this.j;
                                        if (context4 != null) {
                                            ak.r0.l(context4);
                                            android.content.Intent intent4 = this.k;
                                            if (intent4 != null) {
                                                java.lang.String stringExtra2 = intent4.getStringExtra("number");
                                                if (stringExtra2 != null) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("missedCallNotification", "analyticsContext");
                                                    android.os.Parcelable.Creator creator = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CREATOR;
                                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded showOnBoarded = com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded.a;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOnBoarded, "callContextOption");
                                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.MISSED_CALL_NOTIFICATION;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callSource, "source");
                                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions callOptions = new com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions(stringExtra2, "missedCallNotification", "missedCallNotification", stringExtra2, (java.lang.Integer) null, false, false, false, false, (android.telecom.PhoneAccountHandle) null, false, showOnBoarded, (com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions) null, callSource);
                                                    nv0.l lVar = this.g;
                                                    if (lVar != null) {
                                                        lVar.d(callOptions);
                                                        break;
                                                    } else {
                                                        kotlin.jvm.internal.Intrinsics.n("initiateCallHelper");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("intent");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("context");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("intent");
                                        throw null;
                                    }
                                }
                                break;
                            case 2097706097:
                                if (action.equals("com.truecaller.SMS")) {
                                    android.content.Intent intent5 = this.k;
                                    if (intent5 != null) {
                                        long longExtra2 = intent5.getLongExtra("callLogId", -1L);
                                        if (longExtra2 != -1) {
                                            xd0.qux quxVar2 = this.e;
                                            if (quxVar2 != null) {
                                                ((su0.i) quxVar2.a()).a(longExtra2);
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("historyManager");
                                                throw null;
                                            }
                                        }
                                        android.content.Context context5 = this.j;
                                        if (context5 != null) {
                                            ak.r0.l(context5);
                                            android.content.Intent intent6 = this.k;
                                            if (intent6 != null) {
                                                android.content.Intent intent7 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.fromParts("smsto", intent6.getStringExtra("number"), null));
                                                intent7.setFlags(268435456);
                                                android.content.Context context6 = this.j;
                                                if (context6 != null) {
                                                    context6.startActivity(intent7);
                                                    break;
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("context");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("intent");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("context");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("intent");
                                        throw null;
                                    }
                                }
                                break;
                        }
                        s62.d dVar = this.i;
                        if (dVar != null) {
                            ((s62.f) dVar).b(12345, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "missedCall", "notificationMissedCall");
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("notificationManager");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.n("accountManger");
                    throw null;
                }
            }
        }
    }
}
