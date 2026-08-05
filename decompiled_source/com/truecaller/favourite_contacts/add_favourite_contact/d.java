package com.truecaller.favourite_contacts.add_favourite_contact;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/favourite_contacts/add_favourite_contact/d;", "Landroidx/lifecycle/n1;", "favourite-contacts_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d extends androidx.lifecycle.n1 {
    public final kotlin.coroutines.CoroutineContext b;
    public final to1.e c;
    public final ao1.b d;
    public final eo1.baz e;
    public final ig3.h2 f;
    public final ig3.q1 g;
    public final java.util.ArrayList h;
    public fg3.c2 i;
    public com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource j;

    public d(kotlin.coroutines.CoroutineContext coroutineContext, to1.e eVar, ao1.b bVar, eo1.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "cpuContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "getContactsUC");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "favoriteContactsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "analytics");
        this.b = coroutineContext;
        this.c = eVar;
        this.d = bVar;
        this.e = bazVar;
        ig3.h2 c = ig3.w1.c(com.truecaller.favourite_contacts.add_favourite_contact.h.a);
        this.f = c;
        this.g = new ig3.q1(c);
        this.h = new java.util.ArrayList();
        this.i = fg3.h0.c();
    }

    public final void o(java.util.List list) {
        boolean isEmpty = list.isEmpty();
        ig3.h2 h2Var = this.f;
        if (isEmpty) {
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, com.truecaller.favourite_contacts.add_favourite_contact.e.a);
        } else {
            com.truecaller.favourite_contacts.add_favourite_contact.g gVar = new com.truecaller.favourite_contacts.add_favourite_contact.g(list);
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, gVar);
        }
    }
}
