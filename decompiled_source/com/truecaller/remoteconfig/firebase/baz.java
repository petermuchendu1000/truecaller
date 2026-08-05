package com.truecaller.remoteconfig.firebase;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz {
    public final android.content.Context a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;

    public baz(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "appContext");
        this.a = context;
        final int i = 0;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.remoteconfig.firebase.bar
            public final /* synthetic */ com.truecaller.remoteconfig.firebase.baz b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
                switch (i) {
                    case 0:
                        com.truecaller.remoteconfig.firebase.baz bazVar = this.b;
                        w91.a.a(new java.lang.Object[]{k9.d.q("Firebase:: App is initialized on ", java.lang.Thread.currentThread().getName())});
                        return fu.d.f(bazVar.a);
                    case 1:
                        pv.bar a = ((pv.e) fu.d.c().b(pv.e.class)).a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getInstance(...)");
                        android.content.Context context2 = a.a;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        try {
                            android.content.res.Resources resources = context2.getResources();
                            if (resources != null) {
                                android.content.res.XmlResourceParser xml = resources.getXml(2132213776);
                                java.lang.String str = null;
                                java.lang.String str2 = null;
                                java.lang.String str3 = null;
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 2) {
                                        str = xml.getName();
                                    } else if (eventType == 3) {
                                        if (xml.getName().equals("entry")) {
                                            if (str2 != null && str3 != null) {
                                                hashMap.put(str2, str3);
                                            }
                                            str2 = null;
                                            str3 = null;
                                        }
                                        str = null;
                                    } else if (eventType == 4 && str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != 106079) {
                                            if (hashCode == 111972721 && str.equals("value")) {
                                                str3 = xml.getText();
                                            }
                                        } else if (str.equals("key")) {
                                            str2 = xml.getText();
                                        }
                                    }
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        }
                        try {
                            c80.l0 c = qv.a.c();
                            c.b = new org.json.JSONObject(hashMap);
                            a.f.e(c.a()).onSuccessTask(nu.e.a, new nm.b(23));
                        } catch (org.json.JSONException unused2) {
                            com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
                        }
                        w91.a.a(new java.lang.Object[]{"Firebase:: RemoteConfig is initialized!"});
                        return a;
                    case 2:
                        com.truecaller.remoteconfig.firebase.baz bazVar2 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseAnalytics is initialized!"});
                        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(bazVar2.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                        return firebaseAnalytics;
                    case 3:
                        com.truecaller.remoteconfig.firebase.baz bazVar3 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseMessaging is initialized!"});
                        com.google.firebase.messaging.q qVar = com.google.firebase.messaging.FirebaseMessaging.k;
                        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
                            firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance(fu.d.c());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
                        return firebaseMessaging;
                    case 4:
                        com.truecaller.remoteconfig.firebase.baz bazVar4 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseInstallations is initialized!"});
                        java.lang.Object obj = ev.a.m;
                        ev.a aVar = (ev.a) fu.d.c().b(ev.b.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "getInstance(...)");
                        return aVar;
                    default:
                        com.truecaller.remoteconfig.firebase.baz bazVar5 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseDynamicLinks is initialized!"});
                        tu.bar b = tu.bar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance(...)");
                        return b;
                }
            }
        });
        final int i2 = 1;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.remoteconfig.firebase.bar
            public final /* synthetic */ com.truecaller.remoteconfig.firebase.baz b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
                switch (i2) {
                    case 0:
                        com.truecaller.remoteconfig.firebase.baz bazVar = this.b;
                        w91.a.a(new java.lang.Object[]{k9.d.q("Firebase:: App is initialized on ", java.lang.Thread.currentThread().getName())});
                        return fu.d.f(bazVar.a);
                    case 1:
                        pv.bar a = ((pv.e) fu.d.c().b(pv.e.class)).a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getInstance(...)");
                        android.content.Context context2 = a.a;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        try {
                            android.content.res.Resources resources = context2.getResources();
                            if (resources != null) {
                                android.content.res.XmlResourceParser xml = resources.getXml(2132213776);
                                java.lang.String str = null;
                                java.lang.String str2 = null;
                                java.lang.String str3 = null;
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 2) {
                                        str = xml.getName();
                                    } else if (eventType == 3) {
                                        if (xml.getName().equals("entry")) {
                                            if (str2 != null && str3 != null) {
                                                hashMap.put(str2, str3);
                                            }
                                            str2 = null;
                                            str3 = null;
                                        }
                                        str = null;
                                    } else if (eventType == 4 && str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != 106079) {
                                            if (hashCode == 111972721 && str.equals("value")) {
                                                str3 = xml.getText();
                                            }
                                        } else if (str.equals("key")) {
                                            str2 = xml.getText();
                                        }
                                    }
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        }
                        try {
                            c80.l0 c = qv.a.c();
                            c.b = new org.json.JSONObject(hashMap);
                            a.f.e(c.a()).onSuccessTask(nu.e.a, new nm.b(23));
                        } catch (org.json.JSONException unused2) {
                            com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
                        }
                        w91.a.a(new java.lang.Object[]{"Firebase:: RemoteConfig is initialized!"});
                        return a;
                    case 2:
                        com.truecaller.remoteconfig.firebase.baz bazVar2 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseAnalytics is initialized!"});
                        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(bazVar2.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                        return firebaseAnalytics;
                    case 3:
                        com.truecaller.remoteconfig.firebase.baz bazVar3 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseMessaging is initialized!"});
                        com.google.firebase.messaging.q qVar = com.google.firebase.messaging.FirebaseMessaging.k;
                        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
                            firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance(fu.d.c());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
                        return firebaseMessaging;
                    case 4:
                        com.truecaller.remoteconfig.firebase.baz bazVar4 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseInstallations is initialized!"});
                        java.lang.Object obj = ev.a.m;
                        ev.a aVar = (ev.a) fu.d.c().b(ev.b.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "getInstance(...)");
                        return aVar;
                    default:
                        com.truecaller.remoteconfig.firebase.baz bazVar5 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseDynamicLinks is initialized!"});
                        tu.bar b = tu.bar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance(...)");
                        return b;
                }
            }
        });
        final int i3 = 2;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.remoteconfig.firebase.bar
            public final /* synthetic */ com.truecaller.remoteconfig.firebase.baz b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
                switch (i3) {
                    case 0:
                        com.truecaller.remoteconfig.firebase.baz bazVar = this.b;
                        w91.a.a(new java.lang.Object[]{k9.d.q("Firebase:: App is initialized on ", java.lang.Thread.currentThread().getName())});
                        return fu.d.f(bazVar.a);
                    case 1:
                        pv.bar a = ((pv.e) fu.d.c().b(pv.e.class)).a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getInstance(...)");
                        android.content.Context context2 = a.a;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        try {
                            android.content.res.Resources resources = context2.getResources();
                            if (resources != null) {
                                android.content.res.XmlResourceParser xml = resources.getXml(2132213776);
                                java.lang.String str = null;
                                java.lang.String str2 = null;
                                java.lang.String str3 = null;
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 2) {
                                        str = xml.getName();
                                    } else if (eventType == 3) {
                                        if (xml.getName().equals("entry")) {
                                            if (str2 != null && str3 != null) {
                                                hashMap.put(str2, str3);
                                            }
                                            str2 = null;
                                            str3 = null;
                                        }
                                        str = null;
                                    } else if (eventType == 4 && str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != 106079) {
                                            if (hashCode == 111972721 && str.equals("value")) {
                                                str3 = xml.getText();
                                            }
                                        } else if (str.equals("key")) {
                                            str2 = xml.getText();
                                        }
                                    }
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        }
                        try {
                            c80.l0 c = qv.a.c();
                            c.b = new org.json.JSONObject(hashMap);
                            a.f.e(c.a()).onSuccessTask(nu.e.a, new nm.b(23));
                        } catch (org.json.JSONException unused2) {
                            com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
                        }
                        w91.a.a(new java.lang.Object[]{"Firebase:: RemoteConfig is initialized!"});
                        return a;
                    case 2:
                        com.truecaller.remoteconfig.firebase.baz bazVar2 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseAnalytics is initialized!"});
                        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(bazVar2.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                        return firebaseAnalytics;
                    case 3:
                        com.truecaller.remoteconfig.firebase.baz bazVar3 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseMessaging is initialized!"});
                        com.google.firebase.messaging.q qVar = com.google.firebase.messaging.FirebaseMessaging.k;
                        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
                            firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance(fu.d.c());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
                        return firebaseMessaging;
                    case 4:
                        com.truecaller.remoteconfig.firebase.baz bazVar4 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseInstallations is initialized!"});
                        java.lang.Object obj = ev.a.m;
                        ev.a aVar = (ev.a) fu.d.c().b(ev.b.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "getInstance(...)");
                        return aVar;
                    default:
                        com.truecaller.remoteconfig.firebase.baz bazVar5 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseDynamicLinks is initialized!"});
                        tu.bar b = tu.bar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance(...)");
                        return b;
                }
            }
        });
        final int i4 = 3;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.remoteconfig.firebase.bar
            public final /* synthetic */ com.truecaller.remoteconfig.firebase.baz b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
                switch (i4) {
                    case 0:
                        com.truecaller.remoteconfig.firebase.baz bazVar = this.b;
                        w91.a.a(new java.lang.Object[]{k9.d.q("Firebase:: App is initialized on ", java.lang.Thread.currentThread().getName())});
                        return fu.d.f(bazVar.a);
                    case 1:
                        pv.bar a = ((pv.e) fu.d.c().b(pv.e.class)).a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getInstance(...)");
                        android.content.Context context2 = a.a;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        try {
                            android.content.res.Resources resources = context2.getResources();
                            if (resources != null) {
                                android.content.res.XmlResourceParser xml = resources.getXml(2132213776);
                                java.lang.String str = null;
                                java.lang.String str2 = null;
                                java.lang.String str3 = null;
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 2) {
                                        str = xml.getName();
                                    } else if (eventType == 3) {
                                        if (xml.getName().equals("entry")) {
                                            if (str2 != null && str3 != null) {
                                                hashMap.put(str2, str3);
                                            }
                                            str2 = null;
                                            str3 = null;
                                        }
                                        str = null;
                                    } else if (eventType == 4 && str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != 106079) {
                                            if (hashCode == 111972721 && str.equals("value")) {
                                                str3 = xml.getText();
                                            }
                                        } else if (str.equals("key")) {
                                            str2 = xml.getText();
                                        }
                                    }
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        }
                        try {
                            c80.l0 c = qv.a.c();
                            c.b = new org.json.JSONObject(hashMap);
                            a.f.e(c.a()).onSuccessTask(nu.e.a, new nm.b(23));
                        } catch (org.json.JSONException unused2) {
                            com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
                        }
                        w91.a.a(new java.lang.Object[]{"Firebase:: RemoteConfig is initialized!"});
                        return a;
                    case 2:
                        com.truecaller.remoteconfig.firebase.baz bazVar2 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseAnalytics is initialized!"});
                        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(bazVar2.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                        return firebaseAnalytics;
                    case 3:
                        com.truecaller.remoteconfig.firebase.baz bazVar3 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseMessaging is initialized!"});
                        com.google.firebase.messaging.q qVar = com.google.firebase.messaging.FirebaseMessaging.k;
                        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
                            firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance(fu.d.c());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
                        return firebaseMessaging;
                    case 4:
                        com.truecaller.remoteconfig.firebase.baz bazVar4 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseInstallations is initialized!"});
                        java.lang.Object obj = ev.a.m;
                        ev.a aVar = (ev.a) fu.d.c().b(ev.b.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "getInstance(...)");
                        return aVar;
                    default:
                        com.truecaller.remoteconfig.firebase.baz bazVar5 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseDynamicLinks is initialized!"});
                        tu.bar b = tu.bar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance(...)");
                        return b;
                }
            }
        });
        final int i5 = 4;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.remoteconfig.firebase.bar
            public final /* synthetic */ com.truecaller.remoteconfig.firebase.baz b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
                switch (i5) {
                    case 0:
                        com.truecaller.remoteconfig.firebase.baz bazVar = this.b;
                        w91.a.a(new java.lang.Object[]{k9.d.q("Firebase:: App is initialized on ", java.lang.Thread.currentThread().getName())});
                        return fu.d.f(bazVar.a);
                    case 1:
                        pv.bar a = ((pv.e) fu.d.c().b(pv.e.class)).a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getInstance(...)");
                        android.content.Context context2 = a.a;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        try {
                            android.content.res.Resources resources = context2.getResources();
                            if (resources != null) {
                                android.content.res.XmlResourceParser xml = resources.getXml(2132213776);
                                java.lang.String str = null;
                                java.lang.String str2 = null;
                                java.lang.String str3 = null;
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 2) {
                                        str = xml.getName();
                                    } else if (eventType == 3) {
                                        if (xml.getName().equals("entry")) {
                                            if (str2 != null && str3 != null) {
                                                hashMap.put(str2, str3);
                                            }
                                            str2 = null;
                                            str3 = null;
                                        }
                                        str = null;
                                    } else if (eventType == 4 && str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != 106079) {
                                            if (hashCode == 111972721 && str.equals("value")) {
                                                str3 = xml.getText();
                                            }
                                        } else if (str.equals("key")) {
                                            str2 = xml.getText();
                                        }
                                    }
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        }
                        try {
                            c80.l0 c = qv.a.c();
                            c.b = new org.json.JSONObject(hashMap);
                            a.f.e(c.a()).onSuccessTask(nu.e.a, new nm.b(23));
                        } catch (org.json.JSONException unused2) {
                            com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
                        }
                        w91.a.a(new java.lang.Object[]{"Firebase:: RemoteConfig is initialized!"});
                        return a;
                    case 2:
                        com.truecaller.remoteconfig.firebase.baz bazVar2 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseAnalytics is initialized!"});
                        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(bazVar2.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                        return firebaseAnalytics;
                    case 3:
                        com.truecaller.remoteconfig.firebase.baz bazVar3 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseMessaging is initialized!"});
                        com.google.firebase.messaging.q qVar = com.google.firebase.messaging.FirebaseMessaging.k;
                        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
                            firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance(fu.d.c());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
                        return firebaseMessaging;
                    case 4:
                        com.truecaller.remoteconfig.firebase.baz bazVar4 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseInstallations is initialized!"});
                        java.lang.Object obj = ev.a.m;
                        ev.a aVar = (ev.a) fu.d.c().b(ev.b.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "getInstance(...)");
                        return aVar;
                    default:
                        com.truecaller.remoteconfig.firebase.baz bazVar5 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseDynamicLinks is initialized!"});
                        tu.bar b = tu.bar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance(...)");
                        return b;
                }
            }
        });
        final int i6 = 5;
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.remoteconfig.firebase.bar
            public final /* synthetic */ com.truecaller.remoteconfig.firebase.baz b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
                switch (i6) {
                    case 0:
                        com.truecaller.remoteconfig.firebase.baz bazVar = this.b;
                        w91.a.a(new java.lang.Object[]{k9.d.q("Firebase:: App is initialized on ", java.lang.Thread.currentThread().getName())});
                        return fu.d.f(bazVar.a);
                    case 1:
                        pv.bar a = ((pv.e) fu.d.c().b(pv.e.class)).a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getInstance(...)");
                        android.content.Context context2 = a.a;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        try {
                            android.content.res.Resources resources = context2.getResources();
                            if (resources != null) {
                                android.content.res.XmlResourceParser xml = resources.getXml(2132213776);
                                java.lang.String str = null;
                                java.lang.String str2 = null;
                                java.lang.String str3 = null;
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 2) {
                                        str = xml.getName();
                                    } else if (eventType == 3) {
                                        if (xml.getName().equals("entry")) {
                                            if (str2 != null && str3 != null) {
                                                hashMap.put(str2, str3);
                                            }
                                            str2 = null;
                                            str3 = null;
                                        }
                                        str = null;
                                    } else if (eventType == 4 && str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != 106079) {
                                            if (hashCode == 111972721 && str.equals("value")) {
                                                str3 = xml.getText();
                                            }
                                        } else if (str.equals("key")) {
                                            str2 = xml.getText();
                                        }
                                    }
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        }
                        try {
                            c80.l0 c = qv.a.c();
                            c.b = new org.json.JSONObject(hashMap);
                            a.f.e(c.a()).onSuccessTask(nu.e.a, new nm.b(23));
                        } catch (org.json.JSONException unused2) {
                            com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
                        }
                        w91.a.a(new java.lang.Object[]{"Firebase:: RemoteConfig is initialized!"});
                        return a;
                    case 2:
                        com.truecaller.remoteconfig.firebase.baz bazVar2 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseAnalytics is initialized!"});
                        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(bazVar2.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                        return firebaseAnalytics;
                    case 3:
                        com.truecaller.remoteconfig.firebase.baz bazVar3 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseMessaging is initialized!"});
                        com.google.firebase.messaging.q qVar = com.google.firebase.messaging.FirebaseMessaging.k;
                        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
                            firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance(fu.d.c());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
                        return firebaseMessaging;
                    case 4:
                        com.truecaller.remoteconfig.firebase.baz bazVar4 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseInstallations is initialized!"});
                        java.lang.Object obj = ev.a.m;
                        ev.a aVar = (ev.a) fu.d.c().b(ev.b.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "getInstance(...)");
                        return aVar;
                    default:
                        com.truecaller.remoteconfig.firebase.baz bazVar5 = this.b;
                        w91.a.a(new java.lang.Object[]{"Firebase:: FirebaseDynamicLinks is initialized!"});
                        tu.bar b = tu.bar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance(...)");
                        return b;
                }
            }
        });
    }
}
