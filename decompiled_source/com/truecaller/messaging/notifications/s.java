package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class s implements com.truecaller.messaging.notifications.t {
    public final xd0.n a;

    public s(xd0.n nVar) {
        this.a = nVar;
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void a(long j) {
        this.a.b(new com.truecaller.messaging.notifications.o(new xd0.baz(), j, 2));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void b(long j) {
        this.a.b(new com.truecaller.messaging.notifications.o(new xd0.baz(), j, 1));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void c(java.util.Collection collection) {
        this.a.b(new com.truecaller.messaging.notifications.n(new xd0.baz(), collection, 0));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void d(com.truecaller.messaging.data.types.Message message) {
        this.a.b(new com.truecaller.messaging.notifications.p(new xd0.baz(), message, 4));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void e(com.truecaller.messaging.data.types.Message message) {
        this.a.b(new com.truecaller.messaging.notifications.p(new xd0.baz(), message, 1));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void f(com.truecaller.messaging.data.types.Conversation conversation) {
        this.a.b(new com.truecaller.messaging.notifications.r(new xd0.baz(), conversation, 0));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void g(java.util.Map map) {
        this.a.b(new com.truecaller.messaging.notifications.r(new xd0.baz(), map, 1));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void h(long j) {
        this.a.b(new com.truecaller.messaging.notifications.o(new xd0.baz(), j, 0));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void i() {
        this.a.b(new com.truecaller.messaging.notifications.q(new xd0.baz(), 0));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void j(com.truecaller.messaging.data.types.Message message) {
        this.a.b(new com.truecaller.messaging.notifications.p(new xd0.baz(), message, 3));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void k(com.truecaller.messaging.data.types.Message message) {
        this.a.b(new com.truecaller.messaging.notifications.p(new xd0.baz(), message, 2));
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void l(com.truecaller.messaging.data.types.Message message) {
        this.a.b(new com.truecaller.messaging.notifications.p(new xd0.baz(), message, 0));
    }
}
