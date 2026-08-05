package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class r extends xd0.m {
    public final /* synthetic */ int b;
    public final java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(xd0.baz bazVar, java.lang.Object obj, int i) {
        super(bazVar);
        this.b = i;
        this.c = obj;
    }

    public final bi3.a invoke(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                ((com.truecaller.messaging.notifications.t) obj).f((com.truecaller.messaging.data.types.Conversation) this.c);
                return null;
            case 1:
                ((com.truecaller.messaging.notifications.t) obj).g((java.util.Map) this.c);
                return null;
            case 2:
                ((f42.o) obj).b((com.truecaller.messaging.data.types.Entity) this.c);
                return null;
            case 3:
                bi3.a a = ((h61.b) obj).a((java.util.List) this.c);
                b(a);
                return a;
            case 4:
                ((su0.i) obj).i((com.truecaller.data.entity.HistoryEvent) this.c);
                return null;
            case 5:
                return ((su0.i) obj).m((com.truecaller.data.entity.Contact) this.c);
            case 6:
                return ((x32.p) obj).c((com.truecaller.messaging.data.types.Draft) this.c);
            case 7:
                xd0.h hVar = (xd0.s) obj;
                if (hVar instanceof xd0.h) {
                    ((xd0.m) this).a = hVar.exception();
                }
                hVar.onResult(this.c);
                return null;
            case 8:
                return ((y12.v) obj).I((com.truecaller.messaging.data.types.Conversation[]) this.c);
            default:
                return ((y12.v) obj).U((java.lang.Long) this.c);
        }
    }

    public final java.lang.String toString() {
        switch (this.b) {
            case 0:
                return ".notifyHiddenNumberResolved(" + xd0.m.a(1, (com.truecaller.messaging.data.types.Conversation) this.c) + ")";
            case 1:
                return ".notifyUnseenMessagesWithPermission(" + xd0.m.a(1, (java.util.Map) this.c) + ")";
            case 2:
                return ".restoreThumbnail(" + xd0.m.a(2, (com.truecaller.messaging.data.types.Entity) this.c) + ")";
            case 3:
                return ".fetchVCardsData(" + xd0.m.a(2, (java.util.List) this.c) + ")";
            case 4:
                return ".add(" + xd0.m.a(1, (com.truecaller.data.entity.HistoryEvent) this.c) + ")";
            case 5:
                return ".getLastOutGoingCallForContact(" + xd0.m.a(1, (com.truecaller.data.entity.Contact) this.c) + ")";
            case 6:
                return ".scheduleTrueHelperMessages(" + xd0.m.a(2, (com.truecaller.messaging.data.types.Draft) this.c) + ")";
            case 7:
                java.lang.Object obj = this.c;
                if (obj instanceof xd0.l) {
                    return obj.toString();
                }
                return os0.bar.x(obj, ".onResult(", ")");
            case 8:
                return bar.v(xd0.m.a(1, (com.truecaller.messaging.data.types.Conversation[]) this.c), ")", new java.lang.StringBuilder(".markConversationsUnread("));
            default:
                return ".trustConversationForLinks(" + xd0.m.a(2, (java.lang.Long) this.c) + "," + xd0.m.a(2, java.lang.Boolean.TRUE) + ")";
        }
    }
}
