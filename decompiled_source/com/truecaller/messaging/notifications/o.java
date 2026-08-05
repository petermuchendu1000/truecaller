package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class o extends xd0.m {
    public final /* synthetic */ int b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(xd0.baz bazVar, long j, int i) {
        super(bazVar);
        this.b = i;
        this.c = j;
    }

    public final bi3.a invoke(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                ((com.truecaller.messaging.notifications.t) obj).h(this.c);
                return null;
            case 1:
                ((com.truecaller.messaging.notifications.t) obj).b(this.c);
                return null;
            case 2:
                ((com.truecaller.messaging.notifications.t) obj).a(this.c);
                return null;
            case 3:
                return ((f42.d0) obj).f(this.c);
            case 4:
                return ((f42.d0) obj).c(this.c);
            case 5:
                ((f42.d0) obj).b(this.c);
                return null;
            case 6:
                ((f42.d0) obj).d(this.c);
                return null;
            case 7:
                ((f42.d0) obj).a(this.c);
                return null;
            case 8:
                return ((f42.o1) obj).g(this.c);
            case 9:
                bi3.a d = ((h61.b) obj).d(this.c);
                b(d);
                return d;
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                bi3.a g = ((h61.b) obj).g(this.c);
                b(g);
                return g;
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return ((su0.i) obj).j(this.c);
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                ((su0.i) obj).a(this.c);
                return null;
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                ((su0.i) obj).d(this.c);
                return null;
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return ((y12.v) obj).E(this.c);
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                return ((y12.v) obj).b0(this.c);
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                return ((y12.v) obj).F(this.c);
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                return ((y12.v) obj).P(this.c);
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                ((y12.v) obj).k0(this.c);
                return null;
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                ((y12.v) obj).b(this.c);
                return null;
            case 20:
                ((y12.v) obj).V(this.c);
                return null;
            case 21:
                return ((y12.v) obj).m(this.c);
            case 22:
                return ((y12.v) obj).j(this.c);
            case 23:
                return ((y12.v) obj).o(this.c);
            default:
                ((y12.v) obj).u(this.c);
                return null;
        }
    }

    public final java.lang.String toString() {
        switch (this.b) {
            case 0:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".hideFailed("));
            case 1:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".lockConversation("));
            case 2:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".unlockConversation("));
            case 3:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".getReactionEmoji("));
            case 4:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".getReactionsWithParticipants("));
            case 5:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".lockConversation("));
            case 6:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".markReactionSeenByConversationId("));
            case 7:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".unlockConversation("));
            case 8:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".getJoinedImUsersForNotification("));
            case 9:
                return ro0.f.B(1, this.c, ")", new java.lang.StringBuilder(".getAggregatedContactFromAggregatedId("));
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".syncPhoneBookByContactId("));
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".getNewMissedCalls("));
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".markAsSeen("));
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".markMissedCallsAsShown("));
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".clearEditState("));
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".deleteMessage("));
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".deleteScheduledMessages("));
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".fetchMessage("));
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".markConversationActionsDismissed("));
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".markConversationUnread("));
            case 20:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".markMessageSeen("));
            case 21:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".removeDraftMessage("));
            case 22:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".reportConversationAsNotSpam("));
            case 23:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".reportConversationAsSpam("));
            default:
                return ro0.f.B(2, this.c, ")", new java.lang.StringBuilder(".setNudgeToSendDone("));
        }
    }
}
