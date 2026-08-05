package com.truecaller.notifications.support;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/notifications/support/FeedbackDialogLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeedbackDialogLauncherActivity extends com.truecaller.notifications.support.Hilt_FeedbackDialogLauncherActivity {
    public static final /* synthetic */ int p0 = 0;
    public qc3.bar d0;
    public s12.b e0;
    public xd0.qux f0;
    public s62.d g0;
    public zr1.g h0;
    public ix1.b i0;
    public zr1.q j0;
    public kotlin.coroutines.CoroutineContext k0;
    public final androidx.lifecycle.x l0 = androidx.lifecycle.g1.j(this);
    public final kotlin.Lazy m0;
    public final kotlin.Lazy n0;
    public final kotlin.Lazy o0;

    public FeedbackDialogLauncherActivity() {
        final int i = 0;
        this.m0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w62.bar
            public final /* synthetic */ com.truecaller.notifications.support.FeedbackDialogLauncherActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                android.os.Parcelable[] parcelableArrayExtra;
                android.os.Parcelable[] parcelableArr;
                int i2 = i;
                bd3.qux quxVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        android.content.Intent intent = quxVar.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        if (android.os.Build.VERSION.SDK_INT >= 34) {
                            parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "messages", com.truecaller.messaging.data.types.Message.class);
                        } else {
                            parcelableArrayExtra = intent.getParcelableArrayExtra("messages");
                        }
                        if (parcelableArrayExtra != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                            for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                if (parcelable != null) {
                                    arrayList.add((com.truecaller.messaging.data.types.Message) parcelable);
                                } else {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.messaging.data.types.Message");
                                }
                            }
                            parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.messaging.data.types.Message[0]);
                        } else {
                            parcelableArr = null;
                        }
                        com.truecaller.messaging.data.types.Message[] messageArr = (com.truecaller.messaging.data.types.Message[]) parcelableArr;
                        if (messageArr == null) {
                            return new com.truecaller.messaging.data.types.Message[0];
                        }
                        return messageArr;
                    case 1:
                        int i4 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        return quxVar.getIntent().getStringExtra("analytics_context");
                    default:
                        int i5 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        android.content.Intent intent2 = quxVar.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                        return (com.truecaller.messaging.notifications.NotificationIdentifier) ((android.os.Parcelable) g6.b.g(intent2, "notification_id", com.truecaller.messaging.notifications.NotificationIdentifier.class));
                }
            }
        });
        final int i2 = 1;
        this.n0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w62.bar
            public final /* synthetic */ com.truecaller.notifications.support.FeedbackDialogLauncherActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                android.os.Parcelable[] parcelableArrayExtra;
                android.os.Parcelable[] parcelableArr;
                int i22 = i2;
                bd3.qux quxVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        android.content.Intent intent = quxVar.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        if (android.os.Build.VERSION.SDK_INT >= 34) {
                            parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "messages", com.truecaller.messaging.data.types.Message.class);
                        } else {
                            parcelableArrayExtra = intent.getParcelableArrayExtra("messages");
                        }
                        if (parcelableArrayExtra != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                            for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                if (parcelable != null) {
                                    arrayList.add((com.truecaller.messaging.data.types.Message) parcelable);
                                } else {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.messaging.data.types.Message");
                                }
                            }
                            parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.messaging.data.types.Message[0]);
                        } else {
                            parcelableArr = null;
                        }
                        com.truecaller.messaging.data.types.Message[] messageArr = (com.truecaller.messaging.data.types.Message[]) parcelableArr;
                        if (messageArr == null) {
                            return new com.truecaller.messaging.data.types.Message[0];
                        }
                        return messageArr;
                    case 1:
                        int i4 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        return quxVar.getIntent().getStringExtra("analytics_context");
                    default:
                        int i5 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        android.content.Intent intent2 = quxVar.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                        return (com.truecaller.messaging.notifications.NotificationIdentifier) ((android.os.Parcelable) g6.b.g(intent2, "notification_id", com.truecaller.messaging.notifications.NotificationIdentifier.class));
                }
            }
        });
        final int i3 = 2;
        this.o0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w62.bar
            public final /* synthetic */ com.truecaller.notifications.support.FeedbackDialogLauncherActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                android.os.Parcelable[] parcelableArrayExtra;
                android.os.Parcelable[] parcelableArr;
                int i22 = i3;
                bd3.qux quxVar = this.b;
                switch (i22) {
                    case 0:
                        int i33 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        android.content.Intent intent = quxVar.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        if (android.os.Build.VERSION.SDK_INT >= 34) {
                            parcelableArrayExtra = (android.os.Parcelable[]) g6.e.a(intent, "messages", com.truecaller.messaging.data.types.Message.class);
                        } else {
                            parcelableArrayExtra = intent.getParcelableArrayExtra("messages");
                        }
                        if (parcelableArrayExtra != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayExtra.length);
                            for (android.os.Parcelable parcelable : parcelableArrayExtra) {
                                if (parcelable != null) {
                                    arrayList.add((com.truecaller.messaging.data.types.Message) parcelable);
                                } else {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.truecaller.messaging.data.types.Message");
                                }
                            }
                            parcelableArr = (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.messaging.data.types.Message[0]);
                        } else {
                            parcelableArr = null;
                        }
                        com.truecaller.messaging.data.types.Message[] messageArr = (com.truecaller.messaging.data.types.Message[]) parcelableArr;
                        if (messageArr == null) {
                            return new com.truecaller.messaging.data.types.Message[0];
                        }
                        return messageArr;
                    case 1:
                        int i4 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        return quxVar.getIntent().getStringExtra("analytics_context");
                    default:
                        int i5 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                        android.content.Intent intent2 = quxVar.getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                        return (com.truecaller.messaging.notifications.NotificationIdentifier) ((android.os.Parcelable) g6.b.g(intent2, "notification_id", com.truecaller.messaging.notifications.NotificationIdentifier.class));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(2130772073, 2130772060);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.notifications.support.Hilt_FeedbackDialogLauncherActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier;
        java.lang.String str;
        int i;
        long j;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.truecaller.data.entity.messaging.Participant participant;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.n0;
        java.lang.String str5 = null;
        if (kotlin.jvm.internal.Intrinsics.b((java.lang.String) lazy.getValue(), "business_im_notification")) {
            com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) kotlin.collections.v.F(t0());
            if (message != null && (participant = message.c) != null) {
                str3 = yp.k.y(participant);
            } else {
                str3 = null;
            }
            if (str3 != null) {
                p.c3 g = z0.a0.g("business_im_notification", "<set-?>");
                g.a = "business_im_notification";
                ix1.b bVar = this.i0;
                if (bVar != null) {
                    g.F(hz1.h.g(str3, bVar.b()));
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("click", "<set-?>");
                    g.e = "click";
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mark_as_spam", "<set-?>");
                    g.f = "mark_as_spam";
                    com.truecaller.messaging.data.types.Message message2 = (com.truecaller.messaging.data.types.Message) kotlin.collections.v.F(t0());
                    if (message2 != null) {
                        str4 = yp.k.z(message2);
                    } else {
                        str4 = null;
                    }
                    we0.bar.m(g, str4);
                    zr1.q qVar = this.j0;
                    if (qVar != null) {
                        we0.bar.l(g, qVar.b(message));
                        vu1.baz e = g.e();
                        zr1.g gVar = this.h0;
                        if (gVar != null) {
                            gVar.e(e);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("insightsAnalyticsManager");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("rawMessageIdHelper");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("environmentHelper");
                    throw null;
                }
            }
            com.truecaller.messaging.data.types.Message[] t0 = t0();
            kotlin.coroutines.CoroutineContext coroutineContext = this.k0;
            if (coroutineContext != null) {
                fg3.h0.J(this.l0, coroutineContext, (fg3.f0) null, new td1.f(t0, this, str5, 28), 2);
            } else {
                kotlin.jvm.internal.Intrinsics.n("ioContext");
                throw null;
            }
        }
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        if (t0().length != 0 && (str2 = (java.lang.String) lazy.getValue()) != null && str2.length() != 0) {
            com.truecaller.messaging.data.types.Message[] t03 = t0();
            java.util.ArrayList arrayList = new java.util.ArrayList(t03.length);
            for (com.truecaller.messaging.data.types.Message message3 : t03) {
                long j2 = message3.a;
                long j3 = message3.b;
                java.lang.String z = yp.k.z(message3);
                java.lang.String a = message3.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "buildMessageText(...)");
                org.joda.time.DateTime dateTime = message3.e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateTime, "date");
                arrayList.add(new iv1.qux(j2, j3, z, a, "non-spam", null, dateTime, message3.c.n(), null, null, false, null, 3072));
            }
            xz1.u uVar = yx1.e.B;
            com.truecaller.insights.feedbackrevamp.RevampFeedbackType revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.BUSINESS_IM_NOTIFICATION_SPAM;
            java.lang.String str6 = (java.lang.String) lazy.getValue();
            if (str6 == null) {
                str6 = "";
            }
            xz1.u.c(uVar, revampFeedbackType, arrayList, str6, new nm1.i(this, 21), new th3.bar(0, this, com.truecaller.notifications.support.FeedbackDialogLauncherActivity.class, "finish", "finish()V", 0, 29)).show(getSupportFragmentManager(), yx1.e.D);
        } else {
            finish();
        }
        kotlin.Lazy lazy2 = this.o0;
        if (((com.truecaller.messaging.notifications.NotificationIdentifier) lazy2.getValue()) != null && (notificationIdentifier = (com.truecaller.messaging.notifications.NotificationIdentifier) lazy2.getValue()) != null && (str = notificationIdentifier.b) != null) {
            com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier2 = (com.truecaller.messaging.notifications.NotificationIdentifier) lazy2.getValue();
            if (notificationIdentifier2 != null && notificationIdentifier2.a == 2131365483) {
                xd0.qux quxVar = this.f0;
                if (quxVar != null) {
                    com.truecaller.messaging.notifications.t tVar = (com.truecaller.messaging.notifications.t) quxVar.a();
                    if (tVar != null) {
                        try {
                            j = java.lang.Long.parseLong(u03.e0.z(str));
                        } catch (java.lang.RuntimeException unused) {
                            j = 0;
                        }
                        tVar.c(kotlin.collections.y0.b(java.lang.Long.valueOf(j)));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("notifications");
                throw null;
            }
            s62.d dVar = this.g0;
            if (dVar != null) {
                com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier3 = (com.truecaller.messaging.notifications.NotificationIdentifier) lazy2.getValue();
                if (notificationIdentifier3 != null) {
                    str5 = notificationIdentifier3.b;
                }
                com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier4 = (com.truecaller.messaging.notifications.NotificationIdentifier) lazy2.getValue();
                if (notificationIdentifier4 != null) {
                    i = notificationIdentifier4.a;
                } else {
                    i = -1;
                }
                ((s62.f) dVar).b(i, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), str5, "notificationIncomingMessage");
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
    }

    public final com.truecaller.messaging.data.types.Message[] t0() {
        return (com.truecaller.messaging.data.types.Message[]) this.m0.getValue();
    }
}
