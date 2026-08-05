package com.truecaller.insights.core.linkify;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class h {
    public static final void a(com.truecaller.insights.core.linkify.InsightsSpanAction insightsSpanAction) {
        ot1.b bVar;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsSpanAction, "<this>");
        if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction openAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(openAction.a, 5), new ot1.baz(openAction.b, new ot1.c(openAction.c, openAction.d, openAction.e)));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction messageAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(messageAction.a, 3), new ot1.bar(new ot1.c(messageAction.b, messageAction.c, messageAction.d), 4));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction callAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(callAction.a, 0), new ot1.bar(new ot1.c(callAction.b, callAction.c, callAction.d), 1));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction composeAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(composeAction.a, 1), new ot1.bar(new ot1.c(composeAction.b, composeAction.c, composeAction.d), 2));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction eventAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.a(eventAction.a), new ot1.bar(new ot1.c(eventAction.b, eventAction.c, eventAction.d), 0));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction copyAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.d(copyAction.a, com.truecaller.insights.smartcards.CodeType.TEXT), new ot1.baz(copyAction.b, new ot1.c(copyAction.c, copyAction.d, copyAction.e)));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction profileAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(profileAction.a, 4), new ot1.bar(new ot1.c(profileAction.b, profileAction.c, profileAction.d), 5));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction payAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(payAction.a, 6), new ot1.bar(new ot1.c(payAction.b, payAction.c, payAction.d), 6));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction saveContactAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction) insightsSpanAction;
            java.lang.String str = saveContactAction.b;
            ex1.d dVar = new ex1.d(saveContactAction.a, str);
            ot1.c cVar = new ot1.c(saveContactAction.c, saveContactAction.d, saveContactAction.e);
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            bVar = new ot1.b(dVar, new ot1.a(cVar, z));
        } else if (insightsSpanAction instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction) {
            com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction deeplinkAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction) insightsSpanAction;
            bVar = new ot1.b(new ex1.b(deeplinkAction.a, 2), new ot1.bar(new ot1.c(deeplinkAction.b, deeplinkAction.c, deeplinkAction.d), 3));
        } else {
            throw new java.lang.RuntimeException();
        }
        bVar.a.c();
        bVar.b.Q();
    }
}
