package com.truecaller.messaging.conversation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/conversation/ConversationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "h0/s", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationActivity extends com.truecaller.messaging.conversation.Hilt_ConversationActivity {
    public static final /* synthetic */ int f0 = 0;
    public b02.qux d0;
    public hy1.f0 e0;

    public final void onBackPressed() {
        p02.j1 j1Var;
        p02.s0 G = getSupportFragmentManager().G(p02.s.a);
        if (G != null && (j1Var = (p02.j1) ((com.truecaller.sdk.bar) ((p02.i1) G.j)).a) != null) {
            p02.s0 s0Var = (p02.s0) j1Var;
            com.truecaller.common.ui.fab.FloatingActionButton floatingActionButton = s0Var.b1;
            if (floatingActionButton.j) {
                floatingActionButton.c();
            } else {
                s0Var.f6();
            }
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.Hilt_ConversationActivity
    public final void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent;
        int[] intArray;
        java.util.ArrayList<? extends android.os.Parcelable> e;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        android.content.Intent intent2 = getIntent();
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        b02.qux quxVar = this.d0;
        if (quxVar != null) {
            quxVar.k = -1L;
            quxVar.d.getClass();
            quxVar.g = java.lang.System.currentTimeMillis();
            kotlin.jvm.internal.Intrinsics.d(intent2);
            android.os.Bundle bundle2 = new android.os.Bundle();
            android.os.Bundle extras = intent2.getExtras();
            if (extras != null) {
                bundle2.putAll(extras);
            }
            if (intent2.hasExtra("send_intent")) {
                intent = (android.content.Intent) intent2.getParcelableExtra("send_intent");
            } else {
                intent = intent2;
            }
            if (intent != null) {
                java.lang.String f = t41.p.f(intent);
                if (f != null) {
                    bundle2.putString("initial_content", f);
                }
                if (ze0.q.K(intent) && (e = t41.p.e(intent)) != null && !e.isEmpty()) {
                    bundle2.putParcelableArrayList("initial_attachments", e);
                    java.lang.String type = intent.getType();
                    if (type != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "contentType");
                        if (!kotlin.text.y.w(type, "application/", true) || ((kotlin.text.y.w(type, "application/vnd.truecaller", false) && !type.equals("text/vnd.plain-file")) || kotlin.text.y.w(type, "application/vnd.gsma.botmessage", true))) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "contentType");
                            for (int i = 0; i < 4; i++) {
                                if (!type.equalsIgnoreCase(com.truecaller.messaging.data.types.Entity.d[i])) {
                                }
                            }
                        }
                        bundle2.remove("initial_content");
                        break;
                    }
                }
            }
            p02.s0 s0Var = new p02.s0();
            s0Var.setArguments(bundle2);
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(android.R.id.content, s0Var, p02.s.a);
            j.l();
            android.os.Bundle extras2 = intent2.getExtras();
            if (extras2 != null && kotlin.jvm.internal.Intrinsics.b(extras2.getString("launch_source"), "notificationIMCustomAction") && (intArray = extras2.getIntArray("com.truecaller.messaging.insights_notification_ids")) != null) {
                for (int i2 : intArray) {
                    hy1.f0 f0Var = this.e0;
                    if (f0Var != null) {
                        f0Var.t(i2);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("smsIdBannerManager");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("messagingPerformanceAnalytics");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startActivity(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (t41.p.b(getApplicationContext(), intent)) {
            android.content.Context applicationContext = getApplicationContext();
            if (android.text.TextUtils.equals(intent.getAction(), "android.intent.action.VIEW")) {
                java.lang.String packageName = applicationContext.getPackageName();
                java.util.Iterator<android.content.pm.ResolveInfo> it = applicationContext.getPackageManager().queryIntentActivities(intent, 0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (android.text.TextUtils.equals(it.next().activityInfo.packageName, packageName)) {
                        intent.setPackage(packageName);
                        break;
                    }
                }
            }
            super/*android.app.Activity*/.startActivity(intent);
            return;
        }
        android.widget.Toast.makeText(getApplicationContext(), 2132019015, 1).show();
    }
}
