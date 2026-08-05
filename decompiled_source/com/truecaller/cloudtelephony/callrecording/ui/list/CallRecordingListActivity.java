package com.truecaller.cloudtelephony.callrecording.ui.list;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/ui/list/CallRecordingListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingListActivity extends com.truecaller.cloudtelephony.callrecording.ui.list.Hilt_CallRecordingListActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 17));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.cloudtelephony.callrecording.ui.list.Hilt_CallRecordingListActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen callRecordingSourceScreen;
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        setContentView(((uz0.baz) lazy.getValue()).a);
        if (bundle == null) {
            android.content.Intent intent = getIntent();
            if (intent != null && (stringExtra = intent.getStringExtra("ACTIVITY_EXTRA_SOURCE_SCREEN")) != null) {
                callRecordingSourceScreen = com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen.valueOf(stringExtra);
            } else {
                callRecordingSourceScreen = null;
            }
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            ((androidx.fragment.app.q1) barVar).p = true;
            int id = ((uz0.baz) lazy.getValue()).b.getId();
            j01.i.x.getClass();
            barVar.g(id, hc.bar.m(callRecordingSourceScreen, false), (java.lang.String) null);
            barVar.l();
        }
    }
}
