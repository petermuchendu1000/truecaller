package com.truecaller.call_assistant.campaigns.deeplinks.internal;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e implements mm0.a {
    public final wm0.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final qc3.bar e;

    public e(wm0.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "occurrencesUpdater");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "appScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "assistantDeeplinkActionHandlerDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "voicemailDeeplinkActionHandlerDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "voicemailFeatureManager");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = barVar4;
        this.e = barVar5;
    }

    public final void a(com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult actionResult, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionResult, "result");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (actionResult instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action) {
            mm0.bar barVar = (mm0.bar) this.c.get();
            com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction deepLinkAction = ((com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action) actionResult).a;
            if (!barVar.a(deepLinkAction)) {
                o43.qux quxVar = (o43.qux) this.e.get();
                if (quxVar.a() && !quxVar.b.a()) {
                    ((mm0.bar) this.d.get()).a(deepLinkAction);
                    return;
                }
                return;
            }
            return;
        }
        if (actionResult instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Navigation) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(((com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Navigation) actionResult).a));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } else if (actionResult instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Skip) {
            java.lang.Object obj = this.b.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            fg3.h0.J((fg3.e0) obj, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.campaigns.deeplinks.internal.d(this, actionResult, null), 3);
        } else if (!actionResult.equals(com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Dismiss.a) && !actionResult.equals(com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Unknown.a)) {
            throw new java.lang.RuntimeException();
        }
    }
}
