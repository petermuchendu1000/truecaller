package com.truecaller.notifications.enhancing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class SourcedContactListActivity extends com.truecaller.notifications.enhancing.Hilt_SourcedContactListActivity {
    public static final /* synthetic */ int g0 = 0;
    public nc0.bar d0;
    public u03.f0 e0;
    public nd1.bar f0;

    public static android.content.Intent t0(android.content.Context context, java.util.LinkedHashSet linkedHashSet) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.enhancing.SourcedContactListActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(8388608);
        intent.addFlags(524288);
        intent.putParcelableArrayListExtra("sourcedContacts", new java.util.ArrayList<>(linkedHashSet));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.notifications.enhancing.Hilt_SourcedContactListActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        long longValue;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        yy.qux.m(getTheme());
        android.content.Intent intent = getIntent();
        if (intent != null) {
            arrayList = intent.getParcelableArrayListExtra("sourcedContacts");
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (bundle == null) {
                long[] jArr = new long[arrayList.size()];
                java.util.Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    java.lang.Long l = ((com.truecaller.notifications.enhancing.SourcedContact) it.next()).c;
                    int i2 = i + 1;
                    if (l == null) {
                        longValue = 0;
                    } else {
                        longValue = l.longValue();
                    }
                    jArr[i] = longValue;
                    i = i2;
                }
                android.content.Intent intent2 = new android.content.Intent("com.truecaller.ACTION_ENHANCED_NOTIFICATION_DELETED").setPackage(getApplicationContext().getPackageName());
                intent2.putExtra("ids", jArr);
                sendBroadcast(intent2);
            }
            setContentView(2131561092);
            android.view.View findViewById = findViewById(2131363050);
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131166692);
            int i3 = m03.v.b;
            findViewById.post(new hz1.p(findViewById, dimensionPixelSize, dimensionPixelSize, 1));
            findViewById.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 3));
            ao.q qVar = new ao.q(com.bumptech.glide.baz.b(this).e(this), this.e0, arrayList, new com.google.firebase.crashlytics.internal.concurrency.baz(this, 12));
            androidx.recyclerview.widget.RecyclerView findViewById2 = findViewById(2131366203);
            findViewById2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
            findViewById2.setAdapter(qVar);
            return;
        }
        finish();
    }
}
