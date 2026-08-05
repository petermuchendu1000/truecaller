package com.truecaller.announce_caller_id.settings;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/announce_caller_id/settings/AnnounceCallerIdSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "androidx/fragment/app/a1", "announce-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnnounceCallerIdSettingsActivity extends com.truecaller.announce_caller_id.settings.Hilt_AnnounceCallerIdSettingsActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.announce_caller_id.settings.Hilt_AnnounceCallerIdSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(android.R.id.content, new be0.b(), (java.lang.String) null);
            j.l();
        }
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
}
