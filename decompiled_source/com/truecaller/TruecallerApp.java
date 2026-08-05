package com.truecaller;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TruecallerApp extends tx.a1 implements bd3.qux {
    public boolean H = false;
    public final yc3.d I = new yc3.d(new q6.baz(this, 16));

    public final java.lang.Object X3() {
        return this.I.X3();
    }

    @Override // tx.a1
    public final void onCreate() {
        if (!this.H) {
            this.H = true;
            tx.c0 c0Var = ((tx.w) ((tx.b1) this.I.X3())).H.b;
            tx.w wVar = c0Var.a;
            com.google.common.collect.ImmutableMap.Builder builderWithExpectedSize = com.google.common.collect.ImmutableMap.builderWithExpectedSize(74);
            builderWithExpectedSize.put("com.truecaller.familyprotect.domain.status.worker.ActivityStatusWorker", wVar.sl);
            builderWithExpectedSize.put("com.truecaller.common.cloudtelephony.autodial.worker.AutoDialWorker", wVar.zl);
            builderWithExpectedSize.put("com.truecaller.backup.worker.BackupWorker", wVar.Cl);
            builderWithExpectedSize.put("com.truecaller.familyprotect.domain.status.worker.BatteryStatusWorker", wVar.Dl);
            builderWithExpectedSize.put("com.truecaller.bizmon.dynamicCalls.worker.BizDynamicCallerInfoSyncWorker", wVar.Fl);
            builderWithExpectedSize.put("com.truecaller.businesscard.BusinessCardBackgroundWorker", wVar.Jl);
            builderWithExpectedSize.put("com.truecaller.call_assistant.core.network.CallAssistantAuthTokenUpdateWorker", wVar.Kl);
            builderWithExpectedSize.put("com.truecaller.callhistory.CallHistoryFullSyncWorker", wVar.Ll);
            builderWithExpectedSize.put("com.truecaller.cloudtelephony.callrecording.data.CallRecordingDefaultDialerNotificationWorker", wVar.Ol);
            builderWithExpectedSize.put("com.truecaller.cloudtelephony.callrecording.util.CallRecordingDeleteFromCallLogWorker", wVar.Ql);
            builderWithExpectedSize.put("com.truecaller.messaging.categorizer.CategorizeMessagesWorker", wVar.Rl);
            builderWithExpectedSize.put("com.truecaller.cloudtelephony.callrecording.network.CloudTelephonyTokenUpdateWorker", wVar.Tl);
            builderWithExpectedSize.put("com.truecaller.commentfeedback.workers.CommentFeedbackUploadWorker", wVar.Yl);
            builderWithExpectedSize.put("com.truecaller.premium.contactrequest.ContactRequestNotificationWorker", wVar.em);
            builderWithExpectedSize.put("com.truecaller.messaging.messaginglist.v2.worker.ConversationMarkAsReadWorker", wVar.qm);
            builderWithExpectedSize.put("com.truecaller.messaging.conversationlist.ConversationSpamSearchWorker", wVar.sm);
            builderWithExpectedSize.put("com.truecaller.ugc.EnhancedSearchStateWorker", wVar.tm);
            builderWithExpectedSize.put("com.truecaller.familyprotect.domain.data.configuration.FamilyGroupInviteNudgeNotificationOneTimeWorker", wVar.ym);
            builderWithExpectedSize.put("com.truecaller.familyprotect.domain.notification.FamilyGroupNotificationWorker", wVar.zm);
            builderWithExpectedSize.put("com.truecaller.familyprotect.FamilyProtectFetchConfigWorker", wVar.Am);
            builderWithExpectedSize.put("com.truecaller.premium.familysharing.FamilySharingNotificationWorker", wVar.Vm);
            builderWithExpectedSize.put("com.truecaller.bizmon.callSurvey.data.FetchBizSurveysWorkAction", wVar.sn);
            builderWithExpectedSize.put("com.truecaller.messaging.transport.im.FetchLinkPreviewWorker", wVar.tn);
            builderWithExpectedSize.put("com.truecaller.filters.sync.FilterRestoreWorker", wVar.un);
            builderWithExpectedSize.put("com.truecaller.filters.sync.FilterSettingsUploadWorker", wVar.wn);
            builderWithExpectedSize.put("com.truecaller.filters.sync.FilterUploadWorker", wVar.xn);
            builderWithExpectedSize.put("com.truecaller.whoviewedme.GenerateProfileViewWorker", wVar.yn);
            builderWithExpectedSize.put("com.truecaller.searchwarnings.supernova.GetSupernovaSettingsWorker", wVar.zn);
            builderWithExpectedSize.put("com.truecaller.premium.gift.GoldGiftNotificationWorker", wVar.An);
            builderWithExpectedSize.put("com.truecaller.impact.ImpactNotificationWorker", wVar.Bn);
            builderWithExpectedSize.put("com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker", wVar.En);
            builderWithExpectedSize.put("com.truecaller.insights.workers.InsightsOneOffEnrichmentWorker", wVar.Fn);
            builderWithExpectedSize.put("com.truecaller.insights.workers.InsightsReSyncWorker", wVar.Gn);
            builderWithExpectedSize.put("com.truecaller.insights.workers.InsightsRestoreSyncWorker", wVar.Hn);
            builderWithExpectedSize.put("com.truecaller.insights.workers.InsightsResyncEventLogWorker", wVar.In);
            builderWithExpectedSize.put("com.truecaller.editprofile.InvalidProfileNotificationWorker", wVar.Jn);
            builderWithExpectedSize.put("com.truecaller.background_work.JointActionsWorker", c0Var.o);
            builderWithExpectedSize.put("com.truecaller.messaging.notifications.mass.MassDndWorker", c0Var.p);
            builderWithExpectedSize.put("com.truecaller.messaging.nudgetosend.MessageToNudgeWorker", c0Var.r);
            builderWithExpectedSize.put("com.truecaller.service.MissedCallsNotificationWorker", c0Var.E);
            builderWithExpectedSize.put("com.truecaller.namesuggestion.impl.sync.NameSuggestionUploadWork", c0Var.F);
            builderWithExpectedSize.put("com.truecaller.messaging.categorizer.OverrideCategoryWorker", c0Var.H);
            builderWithExpectedSize.put("com.truecaller.contact.phonebook.worker.PhonebookSyncWorker", c0Var.J);
            builderWithExpectedSize.put("com.truecaller.bizmon.callSurvey.data.PostBizSurveyAnswersWorker", c0Var.K);
            builderWithExpectedSize.put("com.truecaller.presence.domain.worker.PostLastSeenWorker", c0Var.L);
            builderWithExpectedSize.put("com.truecaller.presence.domain.worker.PostPresenceWorker", c0Var.M);
            builderWithExpectedSize.put("com.truecaller.surveys.data.PostSurveyAnswersWorker", c0Var.N);
            builderWithExpectedSize.put("com.truecaller.premium.PremiumEntitlementNotificationWorker", c0Var.P);
            builderWithExpectedSize.put("com.truecaller.premium.noconnection.PremiumNoConnectionWorker", c0Var.Q);
            builderWithExpectedSize.put("com.truecaller.premium.PremiumSubscriptionStatusNotificationWorker", c0Var.R);
            builderWithExpectedSize.put("com.truecaller.messaging.rcs.worker.RCSHistoricDataCorrectionWorker", c0Var.S);
            builderWithExpectedSize.put("com.truecaller.whoviewedme.ReceiveProfileViewWorker", c0Var.U);
            builderWithExpectedSize.put("com.truecaller.service.contact.RefreshContactIndexingWorker", c0Var.V);
            builderWithExpectedSize.put("com.truecaller.messaging.event_sender.RetryEventWorker", c0Var.W);
            builderWithExpectedSize.put("com.truecaller.messaging.transport.im.RetryImMessageWorker", c0Var.X);
            builderWithExpectedSize.put("com.truecaller.messaging.transport.truehelper.RetrySendTrueHelperMessageWorker", c0Var.Y);
            builderWithExpectedSize.put("com.truecaller.rewardprogram.RewardProgramNotificationOneTimeWorker", c0Var.Z);
            builderWithExpectedSize.put("com.truecaller.presence.domain.worker.RingerModeListenerWorker", c0Var.a0);
            builderWithExpectedSize.put("com.truecaller.scamfeed.ScamFeedNotificationWorker", c0Var.f0);
            builderWithExpectedSize.put("com.truecaller.messaging.sending.ScheduleMessageWorker", c0Var.g0);
            builderWithExpectedSize.put("com.truecaller.call_assistant.core.screenedcallrecording.ScreenedCallRecordingDownloadWorker", c0Var.j0);
            builderWithExpectedSize.put("com.truecaller.call_assistant.core.screenedcallrecording.ScreenedCallRecordingMultiDownloadWorker", c0Var.k0);
            builderWithExpectedSize.put("com.truecaller.messaging.transport.im.SendImReportWorker", c0Var.l0);
            builderWithExpectedSize.put("com.truecaller.messaging.transport.im.SendReactionWorker", c0Var.m0);
            builderWithExpectedSize.put("com.truecaller.searchwarnings.supernova.SetSupernovaSettingsWorker", c0Var.n0);
            builderWithExpectedSize.put("com.truecaller.background_work.StandaloneActionWorker", c0Var.o0);
            builderWithExpectedSize.put("com.truecaller.tagger.impl.sync.TagInitWorker", c0Var.p0);
            builderWithExpectedSize.put("com.truecaller.familyprotect.domain.transferblocklist.TransferBlockListWorker", c0Var.r0);
            builderWithExpectedSize.put("com.truecaller.name_quality_feedback.internal.upload.UploadNameQualityFeedbackWorker", c0Var.t0);
            builderWithExpectedSize.put("com.truecaller.service.vbmissedcall.VerifiedBusinessMissedCallNotificationWorker", c0Var.y0);
            builderWithExpectedSize.put("com.truecaller.bizmon.banner.clickStream.VerifiedCampaignClickStreamWorker", c0Var.A0);
            builderWithExpectedSize.put("com.truecaller.verifiedcampaign.domain.internal.clickStream.VerifiedCampaignClickStreamWorker", c0Var.F0);
            builderWithExpectedSize.put("com.truecaller.videocallerid.worker.VideoCallerIdCachingWorker", c0Var.J0);
            builderWithExpectedSize.put("com.truecaller.commentfeedback.workers.VoteCommentWorker", c0Var.K0);
            this.b = new v8.bar(builderWithExpectedSize.build());
            this.c = cd3.baz.a(wVar.Pp);
            this.d = cd3.baz.a(wVar.o0);
            this.e = cd3.baz.a(c0Var.L0);
            this.f = c0Var.S0;
            this.g = c0Var.T0;
            this.h = wVar.cj;
            this.i = c0Var.a1;
            this.j = c0Var.d1;
            this.k = (qw2.v) wVar.k5.get();
            this.l = wVar.uh;
            this.m = wVar.ca;
            this.n = wVar.U2;
            this.o = wVar.Xo;
            this.p = wVar.M2;
            this.q = wVar.hi;
            this.r = wVar.Em;
            this.s = wVar.s7;
            this.t = wVar.F2;
            this.u = cd3.baz.a(wVar.Eo);
            this.v = cd3.baz.a(wVar.u7);
            this.w = cd3.baz.a(wVar.Ph);
            this.x = cd3.baz.a(wVar.Ra);
            this.y = cd3.baz.a(c0Var.e1);
            this.z = cd3.baz.a(c0Var.k1);
            this.A = cd3.baz.a(wVar.j6);
            this.B = cd3.baz.a(wVar.d5);
            this.C = cd3.baz.a(c0Var.l1);
            this.D = cd3.baz.a(wVar.m6);
            this.E = cd3.baz.a(wVar.Qh);
        }
        super.onCreate();
    }
}
