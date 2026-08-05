package com.truecaller.filters.blockedlist;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/filters/blockedlist/BlockedListActivity;", "Lcom/truecaller/filters/BlockBaseActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BlockedListActivity extends com.truecaller.filters.blockedlist.Hilt_BlockedListActivity {
    public static final /* synthetic */ int e0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.filters.blockedlist.Hilt_BlockedListActivity, com.truecaller.filters.BlockBaseActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType dialogType;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            dialogType = (com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType) s9.x.i(getIntent());
        } else {
            java.io.Serializable serializableExtra = getIntent().getSerializableExtra("type");
            if (serializableExtra instanceof com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType) {
                dialogType = (com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType) serializableExtra;
            } else {
                dialogType = null;
            }
        }
        if (bundle == null) {
            zo1.a aVar = new zo1.a();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putSerializable("dialog_type", dialogType);
            aVar.setArguments(bundle2);
            this.a0 = aVar;
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(android.R.id.content, this.a0, (java.lang.String) null);
            j.l();
            return;
        }
        this.a0 = (zo1.a) getSupportFragmentManager().F(2131363151);
    }
}
