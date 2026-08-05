package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class w0 extends com.truecaller.search.global.n0 implements com.truecaller.search.global.b1 {
    public final d41.a i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0(d41.a aVar, xf2.baz bazVar, u03.baz bazVar2, com.bumptech.glide.j jVar, com.truecaller.search.global.l lVar) {
        super(r2, bazVar, bazVar2, jVar, lVar, aVar.b);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "binding");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "requestManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "eventListener");
        com.truecaller.common.ui.listitem.ListItemX listItemX = aVar.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listItemX, "listItem");
        this.i = aVar;
        listItemX.setClickable(false);
        listItemX.setFocusable(false);
        listItemX.setBackgroundResource(2131102017);
    }

    public final void v(ex1.i0 i0Var) {
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        d41.a aVar = this.i;
        if (i0Var == null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) aVar.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "smartCardOuterContainer");
            gj.m.f0(linearLayout);
            return;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) aVar.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "smartCardOuterContainer");
        gj.m.j0(linearLayout2);
        do1.a aVar2 = (do1.a) aVar.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar2, "smartCardContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i0Var, "smartCardUiModel");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = aVar2.b;
        android.widget.TextView textView = (android.widget.TextView) aVar2.e;
        android.widget.TextView textView2 = (android.widget.TextView) aVar2.g;
        android.widget.TextView textView3 = (android.widget.TextView) aVar2.f;
        android.widget.TextView textView4 = (android.widget.TextView) aVar2.h;
        android.content.Context context = constraintLayout.getContext();
        android.widget.ImageView imageView = (android.widget.ImageView) aVar2.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "imageCategoryIcon");
        com.truecaller.insights.models.smartcards.SmartCardCategory smartCardCategory = i0Var.a;
        com.truecaller.insights.smartcards.SmartCardStatus smartCardStatus = i0Var.b;
        if (smartCardCategory != null) {
            num = java.lang.Integer.valueOf(ak.r0.c0(smartCardCategory));
        } else {
            num = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (num == null) {
            gj.m.f0(imageView);
        } else {
            gj.m.j0(imageView);
            imageView.setImageResource(num.intValue());
        }
        android.widget.TextView textView5 = (android.widget.TextView) aVar2.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView5, "textCategory");
        if (smartCardCategory != null) {
            kotlin.jvm.internal.Intrinsics.d(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartCardCategory, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            str = context.getString(ak.r0.d0(smartCardCategory));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        } else {
            str = null;
        }
        ue0.i.J(textView5, str, (lw1.h) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView3, "textStatus");
        if (smartCardStatus != null) {
            str2 = context.getString(smartCardStatus.getLabel());
        } else {
            str2 = null;
        }
        ue0.i.J(textView3, str2, (lw1.h) null);
        if (smartCardStatus != null) {
            textView3.setBackgroundTintList(android.content.res.ColorStateList.valueOf(bi3.a.s(context, smartCardStatus.getColor())));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView4, "textTitle");
        ue0.i.J(textView4, i0Var.c, i0Var.f);
        if (kotlin.collections.CollectionsKt.N(kotlin.collections.y.j(new com.truecaller.insights.models.smartcards.SmartCardCategory[]{com.truecaller.insights.models.smartcards.SmartCardCategory.OTP, com.truecaller.insights.models.smartcards.SmartCardCategory.Promotion}), smartCardCategory)) {
            textView4.setTextSize(2, 24.0f);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "textSubtitle");
            gj.m.f0(textView2);
        } else {
            textView4.setTextSize(2, 16.0f);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "textSubtitle");
            ue0.i.J(textView2, i0Var.g, (lw1.h) null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "textRightTitle");
        ue0.i.J(textView, i0Var.h, (lw1.h) null);
        java.lang.Integer num2 = i0Var.i;
        if (num2 != null) {
            textView.setTextColor(context.getColor(num2.intValue()));
        }
    }
}
