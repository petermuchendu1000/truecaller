package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class p extends xd0.m {
    public final /* synthetic */ int b;
    public final com.truecaller.messaging.data.types.Message c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(xd0.baz bazVar, com.truecaller.messaging.data.types.Message message, int i) {
        super(bazVar);
        this.b = i;
        this.c = message;
    }

    public final bi3.a invoke(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                ((com.truecaller.messaging.notifications.t) obj).l(this.c);
                return null;
            case 1:
                ((com.truecaller.messaging.notifications.t) obj).e(this.c);
                return null;
            case 2:
                ((com.truecaller.messaging.notifications.t) obj).k(this.c);
                return null;
            case 3:
                ((com.truecaller.messaging.notifications.t) obj).j(this.c);
                return null;
            case 4:
                ((com.truecaller.messaging.notifications.t) obj).d(this.c);
                return null;
            case 5:
                return ((e42.g) obj).c(this.c);
            case 6:
                ((e42.g) obj).e(this.c);
                return null;
            case 7:
                ((e42.g) obj).a(this.c);
                return null;
            case 8:
                ((l42.a) obj).a(this.c);
                return null;
            case 9:
                return ((y12.v) obj).j0(this.c);
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return ((y12.v) obj).a(this.c);
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return ((y12.v) obj).h0(this.c);
            default:
                return ((y12.v) obj).C(this.c);
        }
    }

    public final java.lang.String toString() {
        switch (this.b) {
            case 0:
                return ".notifyClassZero(" + xd0.m.a(1, this.c) + ")";
            case 1:
                return ".notifyFailed(" + xd0.m.a(1, this.c) + ")";
            case 2:
                return ".notifyScheduledMessageFailed(" + xd0.m.a(1, this.c) + ")";
            case 3:
                return ".notifyScheduledMessageSent(" + xd0.m.a(1, this.c) + ")";
            case 4:
                return ".notifyUnseenMessageWithoutPermission(" + xd0.m.a(1, this.c) + ")";
            case 5:
                return ".addEditMessageToQueue(" + xd0.m.a(1, this.c) + ")";
            case 6:
                return ".resendMessage(" + xd0.m.a(1, this.c) + ")";
            case 7:
                return ".sendMessage(" + xd0.m.a(1, this.c) + ")";
            case 8:
                return ".sendMessage(" + xd0.m.a(1, this.c) + ")";
            case 9:
                return ".addEditToWaitingQueue(" + xd0.m.a(1, this.c) + ")";
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return ".enqueueFailedMessageForSending(" + xd0.m.a(1, this.c) + ")";
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return ".removeFromWaitingQueue(" + xd0.m.a(1, this.c) + ")";
            default:
                return ".updateMessageStatusToFailed(" + xd0.m.a(1, this.c) + ")";
        }
    }
}
