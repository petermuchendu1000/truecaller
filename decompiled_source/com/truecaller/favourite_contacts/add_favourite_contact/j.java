package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class j extends com.truecaller.favourite_contacts.add_favourite_contact.k {
    public final java.util.List a;
    public final java.lang.String b;

    public j(java.util.List list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "contacts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchPattern");
        this.a = list;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.favourite_contacts.add_favourite_contact.j)) {
            return false;
        }
        com.truecaller.favourite_contacts.add_favourite_contact.j jVar = (com.truecaller.favourite_contacts.add_favourite_contact.j) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, jVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "SearchResults(contacts=" + this.a + ", searchPattern=" + this.b + ")";
    }
}
