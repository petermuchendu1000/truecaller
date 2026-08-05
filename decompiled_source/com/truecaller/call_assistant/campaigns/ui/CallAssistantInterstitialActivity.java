package com.truecaller.call_assistant.campaigns.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/ui/CallAssistantInterstitialActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "rm0/bar", "Lrm0/k;", "uiState", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantInterstitialActivity extends com.truecaller.call_assistant.campaigns.ui.Hilt_CallAssistantInterstitialActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(rm0.f.class), new rm0.qux(this, 1), new rm0.qux(this, 0), new rm0.qux(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.call_assistant.campaigns.ui.Hilt_CallAssistantInterstitialActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(882923096, new oe1.n(this, 14), true));
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rm0.baz(this, null, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        boolean z2;
        java.lang.Object value;
        java.lang.String str3;
        java.lang.String str4;
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData assistantCampaignViewImageData;
        java.lang.String str5;
        rm0.k kVar;
        java.lang.String str6;
        java.lang.String str7;
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData assistantCampaignViewImageData2;
        java.lang.String str8;
        boolean z3;
        boolean z4;
        boolean z5;
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData;
        super/*android.app.Activity*/.onResume();
        rm0.f fVar = (rm0.f) this.d0.getValue();
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial interstitial = fVar.i;
        if (interstitial != null) {
            fVar.c.b(interstitial.b, com.truecaller.call_assistant.campaigns.data.CampaignFeatureType.ASSISTANT, com.truecaller.call_assistant.campaigns.data.CampaignViewType.INTERSTITIAL, fVar.j);
        }
        if (interstitial != null) {
            str = interstitial.h;
        } else {
            str = null;
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (interstitial != null) {
            str2 = interstitial.h;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ig3.h2 h2Var = fVar.g;
        do {
            value = h2Var.getValue();
            rm0.k kVar2 = (rm0.k) value;
            if (interstitial != null) {
                str3 = interstitial.d;
            } else {
                str3 = null;
            }
            if (interstitial != null) {
                str4 = interstitial.e;
            } else {
                str4 = null;
            }
            if (interstitial != null) {
                assistantCampaignViewImageData = interstitial.c;
            } else {
                assistantCampaignViewImageData = null;
            }
            if (interstitial != null && (assistantCampaignViewButtonData = interstitial.f) != null) {
                str5 = assistantCampaignViewButtonData.b;
            } else {
                str5 = null;
            }
            if (interstitial != null && interstitial.g) {
                kVar = kVar2;
                str6 = str3;
                str7 = str4;
                assistantCampaignViewImageData2 = assistantCampaignViewImageData;
                str8 = str5;
                z3 = true;
            } else {
                kVar = kVar2;
                str6 = str3;
                str7 = str4;
                assistantCampaignViewImageData2 = assistantCampaignViewImageData;
                str8 = str5;
                z3 = false;
            }
            if (interstitial != null && interstitial.j) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (interstitial != null && interstitial.k) {
                z5 = true;
            } else {
                z5 = false;
            }
            kVar.getClass();
        } while (!h2Var.n(value, new rm0.k(str6, str7, assistantCampaignViewImageData2, str8, z3, null, null, z4, z5, z, z2)));
        m03.r.t(fVar, new rm0.e(fVar, null));
    }
}
