package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar implements ew0.c, n41.bar {
    public final /* synthetic */ com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity a;

    public /* synthetic */ bar(com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity addFavouriteContactActivity) {
        this.a = addFavouriteContactActivity;
    }

    public void E1() {
        int i = com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity.j0;
        com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity addFavouriteContactActivity = this.a;
        i.d0 d0Var = addFavouriteContactActivity.d0;
        d0Var.d(false);
        d0Var.g();
        com.truecaller.favourite_contacts.add_favourite_contact.d v0 = addFavouriteContactActivity.v0();
        v0.o(v0.h);
    }

    public void onDataChanged() {
        int i = com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity.j0;
        com.truecaller.favourite_contacts.add_favourite_contact.d v0 = this.a.v0();
        v0.i.cancel((java.util.concurrent.CancellationException) null);
        v0.i = fg3.h0.J(androidx.lifecycle.g1.l(v0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(v0, null, 4), 3);
    }

    public void z(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchToken");
        int i = com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity.j0;
        com.truecaller.favourite_contacts.add_favourite_contact.d v0 = this.a.v0();
        v0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchPattern");
        fg3.h0.J(androidx.lifecycle.g1.l(v0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(v0, str, null, 5), 3);
    }

    public /* bridge */ void D1() {
    }

    public /* bridge */ void E0() {
    }
}
