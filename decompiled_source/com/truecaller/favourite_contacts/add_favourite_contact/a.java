package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a extends androidx.recyclerview.widget.h1 {
    public final xf2.baz m;
    public final u03.baz n;
    public final w31.g o;
    public final ae.i p;
    public final java.util.ArrayList q;
    public java.lang.String r;
    public com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity s;

    public a(xf2.baz bazVar, u03.baz bazVar2, w31.g gVar, ae.i iVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "contactAvatarXConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "textHighlightHelper");
        this.m = bazVar;
        this.n = bazVar2;
        this.o = gVar;
        this.p = iVar;
        this.q = new java.util.ArrayList();
    }

    public final int getItemCount() {
        return this.q.size();
    }

    public final long getItemId(int i) {
        java.lang.Long x = ((d81.a) this.q.get(i)).a.x();
        if (x != null) {
            return x.longValue();
        }
        return -1L;
    }

    public final void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String c;
        boolean z;
        java.lang.String c2;
        com.truecaller.favourite_contacts.add_favourite_contact.b bVar = (com.truecaller.favourite_contacts.add_favourite_contact.b) k2Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "holder");
        java.util.ArrayList arrayList = this.q;
        d81.a aVar = (d81.a) arrayList.get(i);
        int i2 = i - 1;
        java.lang.String str3 = null;
        if (i2 >= 0 && i2 <= arrayList.size() && kotlin.jvm.internal.Intrinsics.b(((d81.a) arrayList.get(i2)).b.c, aVar.b.c)) {
            str = null;
        } else {
            str = aVar.b.c;
            if (str == null) {
                str = "?";
            }
        }
        java.lang.String str4 = this.r;
        bVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "contact");
        com.truecaller.data.entity.Contact contact = aVar.a;
        java.lang.String y = contact.y();
        kotlin.jvm.internal.Intrinsics.d(y);
        if (y.length() <= 0) {
            y = null;
        }
        if (y == null) {
            com.truecaller.contact.entity.model.AddressEntity m = contact.m();
            if (m == null) {
                c = "";
            } else {
                c = m03.bar.c(m);
            }
            if (c != null && c.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                com.truecaller.contact.entity.model.AddressEntity m2 = contact.m();
                if (m2 != null) {
                    c2 = m2.getStreet();
                } else {
                    c2 = null;
                }
            } else if (!z) {
                com.truecaller.contact.entity.model.AddressEntity m3 = contact.m();
                if (m3 == null) {
                    c2 = "";
                } else {
                    c2 = m03.bar.c(m3);
                }
            } else {
                throw new java.lang.RuntimeException();
            }
            if (c2 != null && c2.length() > 0) {
                str3 = c2;
            }
        } else {
            str3 = y;
        }
        java.lang.String t = contact.t();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "getDisplayNameOrNumber(...)");
        java.lang.String a = t41.i.a(t);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "bidiFormat(...)");
        if (str4 != null && !kotlin.text.StringsKt.X(str4)) {
            bVar.e.x(str4, t, a, false, false, new c80.p(10, bVar, a));
        } else {
            com.truecaller.common.ui.listitem.ListItemX.Q(bVar.c, a, 0, 0, 14);
        }
        com.truecaller.common.ui.listitem.ListItemX listItemX = bVar.c;
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        com.truecaller.common.ui.listitem.ListItemX.K(listItemX, str2, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, (java.util.List) null, 4094);
        bVar.f.C2(bVar.d.a(contact), false);
        bVar.g.e2(ee0.l.o(contact));
        bVar.g(str);
        ((androidx.recyclerview.widget.k2) bVar).itemView.setOnClickListener(new ah1.bar(11, this, aVar));
    }

    public final androidx.recyclerview.widget.k2 onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "parent");
        com.truecaller.common.ui.listitem.ListItemX inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131560071, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.common.ui.listitem.ListItemX");
        return new com.truecaller.favourite_contacts.add_favourite_contact.b(inflate, this.m, this.n, this.o, this.p);
    }
}
