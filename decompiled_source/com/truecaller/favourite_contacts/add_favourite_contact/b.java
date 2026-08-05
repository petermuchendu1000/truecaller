package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b extends androidx.recyclerview.widget.k2 implements com.truecaller.ui.x {
    public final /* synthetic */ b81.bar b;
    public final com.truecaller.common.ui.listitem.ListItemX c;
    public final w31.g d;
    public final ae.i e;
    public final w31.c f;
    public final hg2.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.truecaller.common.ui.listitem.ListItemX listItemX, xf2.baz bazVar, u03.baz bazVar2, w31.g gVar, ae.i iVar) {
        super(listItemX);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItemX, "listItem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "contactAvatarXConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "textHighlightHelper");
        this.b = new b81.bar();
        this.c = listItemX;
        this.d = gVar;
        this.e = iVar;
        android.content.Context context = listItemX.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u03.g0 g0Var = new u03.g0(context);
        w31.c cVar = new w31.c(g0Var, 0);
        this.f = cVar;
        hg2.b bVar = new hg2.b(g0Var, bazVar, bazVar2);
        this.g = bVar;
        listItemX.setAvatarPresenter(cVar);
        listItemX.setAvailabilityPresenter(bVar);
    }

    public final java.lang.String b() {
        return ((com.truecaller.common.ui.n) this.b).a;
    }

    public final void d() {
        this.b.getClass();
    }

    public final void e() {
        this.b.getClass();
    }

    public final void f() {
        this.b.getClass();
    }

    public final void g(java.lang.String str) {
        this.b.g(str);
    }

    public final boolean h() {
        this.b.getClass();
        return false;
    }

    public final int i() {
        return this.b.i();
    }
}
