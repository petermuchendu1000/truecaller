package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class l implements f.baz {
    public final /* synthetic */ com.truecaller.favourite_contacts.add_favourite_contact.Hilt_AddFavouriteContactActivity a;

    public l(com.truecaller.favourite_contacts.add_favourite_contact.Hilt_AddFavouriteContactActivity hilt_AddFavouriteContactActivity) {
        this.a = hilt_AddFavouriteContactActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.favourite_contacts.add_favourite_contact.Hilt_AddFavouriteContactActivity hilt_AddFavouriteContactActivity = this.a;
        if (!hilt_AddFavouriteContactActivity.c0) {
            hilt_AddFavouriteContactActivity.c0 = true;
            tx.e eVar = (com.truecaller.favourite_contacts.add_favourite_contact.qux) hilt_AddFavouriteContactActivity.X3();
            com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity addFavouriteContactActivity = (com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity) hilt_AddFavouriteContactActivity;
            tx.e eVar2 = eVar;
            xf2.baz bazVar = (xf2.baz) eVar2.c0.get();
            tx.w wVar = eVar2.f;
            addFavouriteContactActivity.e0 = new com.truecaller.favourite_contacts.add_favourite_contact.a(bazVar, (u03.baz) wVar.W.get(), wVar.U(), new ae.i(21));
            android.content.ContentResolver contentResolver = (android.content.ContentResolver) wVar.I0.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            android.net.Uri withAppendedPath = android.net.Uri.withAppendedPath(h81.e.a, "sorted_contacts_with_data");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withAppendedPath, "getSortedContactsWithDataUri(...)");
            addFavouriteContactActivity.f0 = new ew0.a(contentResolver, withAppendedPath, -1L);
        }
    }
}
