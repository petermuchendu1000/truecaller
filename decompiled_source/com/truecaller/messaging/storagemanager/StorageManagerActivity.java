package com.truecaller.messaging.storagemanager;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/storagemanager/StorageManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class StorageManagerActivity extends com.truecaller.messaging.storagemanager.Hilt_StorageManagerActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.storagemanager.Hilt_StorageManagerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            android.content.Intent intent = getIntent();
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("extra_return_to_call_log", false);
            }
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            z32.a.m.getClass();
            z32.a aVar = new z32.a();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("arg_return_to_call_log", z);
            aVar.setArguments(bundle2);
            j.g(android.R.id.content, aVar, (java.lang.String) null);
            j.l();
        }
    }
}
