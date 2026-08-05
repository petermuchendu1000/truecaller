package com.truecaller.call_assistant.campaigns.deeplinks.internal;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements mm0.baz {
    public final com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType) {
        com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action action;
        java.lang.Object obj;
        com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction deepLinkAction;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "link");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignViewType, "viewType");
        if (str3 != null) {
            try {
                java.lang.String lowerCase = str3.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (kotlin.jvm.internal.Intrinsics.b(lowerCase, "skip")) {
                    if (campaignViewType == com.truecaller.call_assistant.campaigns.data.CampaignViewType.BANNER) {
                        return new com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Skip(str);
                    }
                    return com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Dismiss.a;
                }
                kotlin.text.m b = new kotlin.text.Regex("truecaller://cloud-telephony/campaigns/action/(\\w+)(.*)").b(str2);
                kotlin.text.m b2 = new kotlin.text.Regex("^(truecaller|https?)://(.*)").b(str2);
                if (b != null) {
                    java.lang.String str5 = (java.lang.String) b.a().get(1);
                    java.lang.String str6 = (java.lang.String) b.a().get(2);
                    java.util.Iterator it = com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkActionId.getEntries().iterator();
                    while (true) {
                        action = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkActionId) obj).getId(), str5)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkActionId deepLinkActionId = (com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkActionId) obj;
                    if (deepLinkActionId != null) {
                        int i = mm0.qux.a[deepLinkActionId.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                deepLinkAction = com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ReactivateVoicemail.a;
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            kotlin.text.m b3 = new kotlin.text.Regex("\\?dial=([^&]+)&?(.+)?").b(str6);
                            if (b3 == null || (str4 = (java.lang.String) kotlin.collections.CollectionsKt.X(1, b3.a())) == null) {
                                deepLinkAction = null;
                            } else {
                                java.lang.String str7 = (java.lang.String) kotlin.collections.CollectionsKt.X(2, b3.a());
                                if (str7 == null || str7.length() == 0) {
                                    str7 = null;
                                }
                                deepLinkAction = new com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel(str4, str7);
                            }
                        }
                        if (deepLinkAction != null) {
                            action = new com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action(deepLinkAction);
                        }
                        if (action != null) {
                            return action;
                        }
                    }
                } else if (b2 != null) {
                    return new com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Navigation(str2);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Unknown.a;
    }
}
