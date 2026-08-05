package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class q extends xd0.m {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(xd0.baz bazVar, int i) {
        super(bazVar);
        this.b = i;
    }

    public final bi3.a invoke(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                ((com.truecaller.messaging.notifications.t) obj).i();
                return null;
            case 1:
                ((f42.o) obj).a();
                return null;
            case 2:
                ((f42.d0) obj).e();
                return null;
            case 3:
                return ((f42.f1) obj).b();
            case 4:
                ((su0.i) obj).c();
                return null;
            case 5:
                ((su0.i) obj).h();
                return null;
            case 6:
                ((su0.i) obj).f();
                return null;
            case 7:
                ((y12.v) obj).n0();
                return null;
            case 8:
                return ((y12.v) obj).f();
            case 9:
                ((y12.v) obj).D();
                return null;
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                ((y12.v) obj).l();
                return null;
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                ((y12.v) obj).L();
                return null;
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                ((y12.v) obj).n();
                return null;
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return ((y12.v) obj).y();
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return ((y12.v) obj).N();
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                ((y12.v) obj).m0();
                return null;
            default:
                return ((y12.v) obj).e();
        }
    }

    public final java.lang.String toString() {
        switch (this.b) {
            case 0:
                return ".notifyDownloadFailed()";
            case 1:
                return ".downloadEntities()";
            case 2:
                return ".notifyUnseenReactions()";
            case 3:
                return ".restoreUnsupportedEvents()";
            case 4:
                return ".clearSearchHistory(" + xd0.m.a(2, 5) + ")";
            case 5:
                return ".performSync()";
            case 6:
                return ".scheduleFullSync()";
            case 7:
                return ".classifyUnclassifiedIncomingMessages()";
            case 8:
                return ".getSyncLiveData()";
            case 9:
                return ".hideSmsMmsMessages()";
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return ".markPendingMessagesAsRead()";
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return ".markPromotionalMessagesAsSpam()";
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                return ".notifyMessages()";
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return ".overrideNonSpamToSpam()";
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return ".overrideSpamToNonSpam()";
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                return ".syncMessagesReadFlagIfIgnored()";
            default:
                return ".waitUntilMessagesProcessed()";
        }
    }
}
