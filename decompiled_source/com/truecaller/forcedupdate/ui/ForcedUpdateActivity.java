package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class ForcedUpdateActivity extends com.truecaller.forcedupdate.ui.Hilt_ForcedUpdateActivity {

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    public static boolean t0(android.content.Context context) {
        com.truecaller.forcedupdate.UpdateType b = ((mp1.bar) ((com.truecaller.forcedupdate.ui.ForcedUpdateActivity.bar) f40.d0.z(context.getApplicationContext(), com.truecaller.forcedupdate.ui.ForcedUpdateActivity.bar.class)).G0.get()).b(false);
        if (b == com.truecaller.forcedupdate.UpdateType.NONE) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.forcedupdate.ui.ForcedUpdateActivity.class);
        intent.addFlags(268533760);
        intent.putExtra("updateType", b.name());
        intent.putExtra("compactMode", false);
        context.startActivity(intent);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.forcedupdate.ui.Hilt_ForcedUpdateActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.forcedupdate.UpdateType updateType;
        androidx.fragment.app.Fragment instantiate;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        if (bundle == null && getIntent() != null) {
            android.content.Intent intent = getIntent();
            mp1.qux quxVar = com.truecaller.forcedupdate.UpdateType.Companion;
            java.lang.String stringExtra = intent.getStringExtra("updateType");
            quxVar.getClass();
            if (stringExtra == null) {
                updateType = com.truecaller.forcedupdate.UpdateType.NONE;
            } else {
                try {
                    updateType = com.truecaller.forcedupdate.UpdateType.valueOf(stringExtra);
                } catch (java.lang.IllegalArgumentException unused) {
                    updateType = com.truecaller.forcedupdate.UpdateType.NONE;
                }
            }
            if (updateType == com.truecaller.forcedupdate.UpdateType.NONE) {
                com.truecaller.log.AssertionUtil.report("No update type specified");
                instantiate = null;
            } else if (intent.getBooleanExtra("compactMode", false) && updateType.getSupportsCompactMode()) {
                instantiate = androidx.fragment.app.Fragment.instantiate(this, com.truecaller.forcedupdate.ui.qux.class.getName(), intent.getExtras());
            } else {
                instantiate = androidx.fragment.app.Fragment.instantiate(this, com.truecaller.forcedupdate.ui.d.class.getName(), intent.getExtras());
            }
            if (instantiate != null) {
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                barVar.g(android.R.id.content, instantiate, (java.lang.String) null);
                barVar.l();
                return;
            }
            finish();
        }
    }
}
