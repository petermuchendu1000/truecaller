package com.truecaller.premium.ui.friendpromo;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class PremiumFriendUpgradedPromoView extends androidx.constraintlayout.widget.ConstraintLayout implements e6.bar {
    public final w31.c A;
    public final java.util.List B;
    public final com.truecaller.premium.ui.friendpromo.CustomHideBottomViewOnScrollBehavior C;
    public final h02.qux s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final w31.c y;
    public final w31.c z;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/premium/ui/friendpromo/PremiumFriendUpgradedPromoView$bar;", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PremiumFriendUpgradedPromoView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.truecaller.common.ui.avatar.AvatarXView getAvatar1() {
        return (com.truecaller.common.ui.avatar.AvatarXView) this.t.getValue();
    }

    private final com.truecaller.common.ui.avatar.AvatarXView getAvatar2() {
        return (com.truecaller.common.ui.avatar.AvatarXView) this.u.getValue();
    }

    private final com.truecaller.common.ui.avatar.AvatarXView getAvatar3() {
        return (com.truecaller.common.ui.avatar.AvatarXView) this.v.getValue();
    }

    private final android.widget.ImageView getFakeAvatars() {
        return (android.widget.ImageView) this.w.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.x.getValue();
    }

    public final com.truecaller.common.ui.avatar.AvatarXConfig F(com.truecaller.data.entity.Contact contact) {
        java.lang.String str;
        this.s.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        android.net.Uri j = m03.r.j(contact, true);
        com.truecaller.data.entity.Number r = contact.r();
        java.lang.String str2 = null;
        if (r != null) {
            str = r.f;
        } else {
            str = null;
        }
        java.lang.String str3 = contact.I;
        if (str3 != null) {
            str2 = gf0.e.y(str3);
        }
        return new com.truecaller.common.ui.avatar.AvatarXConfig(j, str, str2, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(int i, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "contacts");
        int size = list.size();
        java.util.List list2 = this.B;
        if (size < 3) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                gj.m.f0((android.view.View) it.next());
            }
            android.widget.ImageView fakeAvatars = getFakeAvatars();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fakeAvatars, "<get-fakeAvatars>(...)");
            gj.m.j0(fakeAvatars);
            getTitle().setText(2132018525);
            return;
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            gj.m.j0((android.view.View) it2.next());
        }
        this.y.C2(F((com.truecaller.data.entity.Contact) list.get(0)), false);
        this.z.C2(F((com.truecaller.data.entity.Contact) list.get(1)), false);
        this.A.C2(F((com.truecaller.data.entity.Contact) list.get(2)), false);
        getTitle().setText(getContext().getString(2132018526, ((com.truecaller.data.entity.Contact) list.get(0)).I, java.lang.Integer.valueOf(i - 1)));
    }

    @org.jetbrains.annotations.NotNull
    public e6.baz getBehavior() {
        return this.C;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PremiumFriendUpgradedPromoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [h02.qux, java.lang.Object] */
    public PremiumFriendUpgradedPromoView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.t = gj.m.I(2131362382, this);
        this.u = gj.m.I(2131362383, this);
        this.v = gj.m.I(2131362384, this);
        this.w = gj.m.I(2131363807, this);
        this.x = gj.m.I(2131367033, this);
        u03.g0 g0Var = new u03.g0(context);
        w31.c cVar = new w31.c(g0Var, 0);
        this.y = cVar;
        w31.c cVar2 = new w31.c(g0Var, 0);
        this.z = cVar2;
        w31.c cVar3 = new w31.c(g0Var, 0);
        this.A = cVar3;
        this.C = new com.truecaller.premium.ui.friendpromo.CustomHideBottomViewOnScrollBehavior();
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ((com.truecaller.premium.ui.friendpromo.PremiumFriendUpgradedPromoView.bar) f40.d0.z(applicationContext, com.truecaller.premium.ui.friendpromo.PremiumFriendUpgradedPromoView.bar.class)).getClass();
        this.s = new java.lang.Object();
        yy.qux.z(this, 2131561027, true);
        int b = t41.i.b(16.0f, context);
        setPadding(b, b, b, b);
        setBackgroundResource(2131231304);
        getAvatar1().setPresenter(cVar);
        getAvatar2().setPresenter(cVar2);
        getAvatar3().setPresenter(cVar3);
        this.B = kotlin.collections.y.j(new com.truecaller.common.ui.avatar.AvatarXView[]{getAvatar1(), getAvatar2(), getAvatar3()});
    }

    public /* synthetic */ PremiumFriendUpgradedPromoView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
