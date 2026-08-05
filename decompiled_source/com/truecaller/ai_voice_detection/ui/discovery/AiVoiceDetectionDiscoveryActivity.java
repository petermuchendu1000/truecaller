package com.truecaller.ai_voice_detection.ui.discovery;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ai_voice_detection/ui/discovery/AiVoiceDetectionDiscoveryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "h6/e", "ai-voice-detection_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AiVoiceDetectionDiscoveryActivity extends com.truecaller.ai_voice_detection.ui.discovery.Hilt_AiVoiceDetectionDiscoveryActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 19));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ai_voice_detection.ui.discovery.Hilt_AiVoiceDetectionDiscoveryActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        setContentView(((ec0.bar) lazy.getValue()).a);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            int id = ((ec0.bar) lazy.getValue()).b.getId();
            h72.a aVar = kc0.k.o;
            java.lang.String stringExtra = getIntent().getStringExtra("intent_extra_analytics_context");
            boolean booleanExtra = getIntent().getBooleanExtra("should_show_feedback_dialog", false);
            java.lang.String stringExtra2 = getIntent().getStringExtra("feedback_for_call_id");
            aVar.getClass();
            kc0.k kVar = new kc0.k();
            kVar.setArguments(ue0.i.t(new kotlin.Pair("intent_extra_analytics_context", stringExtra), new kotlin.Pair("feedback_for_call_id", stringExtra2), new kotlin.Pair("should_show_feedback_dialog", java.lang.Boolean.valueOf(booleanExtra))));
            j.g(id, kVar, (java.lang.String) null);
            j.l();
        }
    }
}
