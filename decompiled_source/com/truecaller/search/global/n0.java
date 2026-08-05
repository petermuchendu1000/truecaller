package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class n0 extends ey2.a implements com.truecaller.search.global.c1, com.truecaller.ui.w {
    public final /* synthetic */ xu0.e c;
    public final com.truecaller.common.ui.listitem.ListItemX d;
    public final com.bumptech.glide.j e;
    public final android.content.Context f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, xu0.e] */
    public n0(com.truecaller.common.ui.listitem.ListItemX listItemX, xf2.baz bazVar, u03.baz bazVar2, com.bumptech.glide.j jVar, n00.g gVar, android.view.View view) {
        super(view == 0 ? listItemX : view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItemX, "listItem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "requestManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "eventListener");
        this.c = new java.lang.Object();
        this.d = listItemX;
        this.e = jVar;
        android.content.Context context = listItemX.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f = context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 23));
        this.g = lazy;
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new a63.d(this, bazVar, bazVar2, 12));
        this.h = lazy2;
        listItemX.setAvatarPresenter((w31.c) lazy.getValue());
        listItemX.setAvailabilityPresenter((hg2.b) lazy2.getValue());
    }

    @Override // com.truecaller.ui.w
    public final java.lang.String b() {
        return ((com.truecaller.common.ui.n) this.c).a;
    }

    @Override // com.truecaller.ui.w
    public final void g(java.lang.String str) {
        ((com.truecaller.common.ui.n) this.c).a = str;
    }

    @Override // com.truecaller.ui.w
    public final boolean h() {
        return this.c.b;
    }

    @Override // com.truecaller.ui.w
    public final void m(boolean z) {
        this.c.b = z;
    }

    public final void n(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarXConfig");
        ((w31.c) this.g.getValue()).C2(avatarXConfig, false);
    }

    public final void o(boolean z) {
        com.truecaller.common.ui.listitem.ListItemX listItemX = this.d;
        if (z) {
            android.content.Context context = listItemX.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            qy2.baz bazVar = new qy2.baz(2132019474, context, 2131233416);
            listItemX.R(bazVar, java.lang.Integer.valueOf(bazVar.d));
            return;
        }
        int i = com.truecaller.common.ui.listitem.ListItemX.y;
        listItemX.R((android.graphics.drawable.Drawable) null, (java.lang.Integer) null);
    }

    public final void p() {
        android.content.Context context = this.f;
        java.lang.String string = context.getResources().getString(2132018306);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        com.truecaller.common.ui.listitem.ListItemX listItemX = this.d;
        com.truecaller.common.ui.listitem.ListItemX.Q(listItemX, string, 0, 0, 14);
        java.lang.String string2 = context.getResources().getString(2132018337);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        com.truecaller.common.ui.listitem.ListItemX.K(this.d, string2, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, (java.util.List) null, 4094);
        com.truecaller.common.ui.listitem.ListItemX.O(listItemX, (java.lang.String) null);
        com.truecaller.common.ui.listitem.ListItemX.J(listItemX, false, 0, 6);
        n(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -65537));
    }

    public final void q(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        com.truecaller.common.ui.listitem.ListItemX.K(this.d, str, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, (java.util.List) null, 4094);
    }

    public final void r(java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "highlightSpans");
        com.truecaller.common.ui.listitem.ListItemX.K(this.d, str, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, list, 2046);
    }

    public final void s(java.lang.String str, java.lang.Integer num, com.truecaller.data.entity.SpamCategoryModel spamCategoryModel) {
        android.graphics.drawable.Drawable drawable;
        java.lang.String iconUrl;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        android.content.Context context = this.f;
        if (num == null) {
            drawable = null;
        } else {
            drawable = context.getDrawable(num.intValue());
        }
        com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor = com.truecaller.common.ui.listitem.ListItemX.SubtitleColor.RED;
        com.truecaller.common.ui.listitem.ListItemX listItemX = this.d;
        com.truecaller.common.ui.listitem.ListItemX.K(listItemX, str2, subtitleColor, drawable, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, 2132022683, (java.util.List) null, 3576);
        com.truecaller.common.ui.listitem.ListItemX.M(listItemX, (android.graphics.drawable.Drawable) null);
        if (spamCategoryModel != null && (iconUrl = spamCategoryModel.getIconUrl()) != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166778);
            com.bumptech.glide.g m = com.bumptech.glide.baz.f(listItemX).q(iconUrl).m();
            m.Q(new com.truecaller.search.global.m0(dimensionPixelSize, this, 0), (mg.b) null, m, qg.b.a);
        }
    }

    public final void t(kw2.bar barVar) {
        java.lang.Integer num;
        int intValue;
        int s = bi3.a.s(this.f, 2130970634);
        java.lang.Long l = barVar.d;
        if (l != null) {
            num = java.lang.Integer.valueOf((int) l.longValue());
        } else {
            num = null;
        }
        if ((num == null || num.intValue() != 0) && num != null) {
            intValue = num.intValue();
        } else {
            intValue = s;
        }
        java.lang.String str = barVar.b;
        if (str == null) {
            str = "";
        }
        i41.a aVar = new i41.a(str, s, this.d.getSubtitleFontMetrics());
        aVar.o = barVar.e;
        aVar.n = java.lang.Integer.valueOf(intValue);
        android.content.Context context = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.bumptech.glide.j jVar = this.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "requestManager");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = aVar.m;
        int i = fontMetricsInt.descent - fontMetricsInt.ascent;
        com.bumptech.glide.g T = jVar.c().T(aVar.o);
        T.Q(new i41.qux(aVar, context, spannableStringBuilder, i, i), (mg.b) null, T, qg.b.a);
        com.truecaller.common.ui.listitem.ListItemX.K(this.d, spannableStringBuilder, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, (java.util.List) null, 4094);
    }

    public final void u(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        com.truecaller.common.ui.listitem.ListItemX.Q(this.d, str, 0, 0, 14);
    }
}
