package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class g extends com.truecaller.favourite_contacts.add_favourite_contact.k {
    public final java.util.List a;

    public g(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "contacts");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.favourite_contacts.add_favourite_contact.g) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.favourite_contacts.add_favourite_contact.g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return com.appsflyer.internal.e.k("Loaded(contacts=", ")", this.a);
    }
}
