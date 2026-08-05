package com.truecaller.ads.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsSwitchView extends android.widget.FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsSwitchView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getBannerPosition() {
        return ((java.lang.Number) this.a.getValue()).intValue();
    }

    private final int getNativePosition() {
        return ((java.lang.Number) this.b.getValue()).intValue();
    }

    public final int a(int i) {
        java.lang.Object obj;
        kotlin.collections.m0 it = uf3.p.l(0, getChildCount()).iterator();
        while (true) {
            if (((uf3.h) it).c) {
                obj = it.next();
                android.view.View childAt = getChildAt(((java.lang.Number) obj).intValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt.getId() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        throw new java.lang.IllegalStateException("No child with required ID");
    }

    public final void b(u90.a aVar, com.truecaller.ads.AdLayoutTypeX adLayoutTypeX) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutTypeX, "layout");
        if (aVar instanceof u90.bar) {
            android.view.View childAt = getChildAt(getBannerPosition());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt.findViewById(2131363145);
            viewGroup.removeAllViews();
            viewGroup.addView(o00.e.i((u90.bar) aVar, null));
            c(getBannerPosition());
            return;
        }
        if (aVar instanceof u90.d) {
            u90.d dVar = (u90.d) aVar;
            android.view.View childAt2 = getChildAt(getNativePosition());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) childAt2.findViewById(2131363145);
            viewGroup2.removeAllViews();
            android.content.Context context = viewGroup2.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutTypeX, "layout");
            com.google.android.gms.ads.nativead.NativeAdView k = o00.e.k(context, adLayoutTypeX);
            o00.e.b(k, dVar.u(), dVar.b, adLayoutTypeX);
            viewGroup2.addView(k);
            c(getNativePosition());
            return;
        }
        if (aVar instanceof u90.qux) {
            u90.qux quxVar = (u90.qux) aVar;
            android.view.View childAt3 = getChildAt(getNativePosition());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt3, "getChildAt(...)");
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) childAt3.findViewById(2131363145);
            android.content.Context context2 = viewGroup3.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            android.app.Activity n = bf0.s2.n(context2);
            if (n != null) {
                viewGroup3.removeAllViews();
                viewGroup3.addView(o00.e.h(quxVar, n, adLayoutTypeX, false));
            }
            c(getNativePosition());
        }
    }

    public final void c(int i) {
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (i3 == i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            childAt.setVisibility(i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: da0.qux
            public final /* synthetic */ com.truecaller.ads.ui.AdsSwitchView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int a;
                int i3 = i2;
                com.truecaller.ads.ui.AdsSwitchView adsSwitchView = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.ads.ui.AdsSwitchView.c;
                        a = adsSwitchView.a(2131362203);
                        break;
                    default:
                        int i5 = com.truecaller.ads.ui.AdsSwitchView.c;
                        a = adsSwitchView.a(2131362204);
                        break;
                }
                return java.lang.Integer.valueOf(a);
            }
        });
        final int i3 = 1;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: da0.qux
            public final /* synthetic */ com.truecaller.ads.ui.AdsSwitchView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int a;
                int i32 = i3;
                com.truecaller.ads.ui.AdsSwitchView adsSwitchView = this.b;
                switch (i32) {
                    case 0:
                        int i4 = com.truecaller.ads.ui.AdsSwitchView.c;
                        a = adsSwitchView.a(2131362203);
                        break;
                    default:
                        int i5 = com.truecaller.ads.ui.AdsSwitchView.c;
                        a = adsSwitchView.a(2131362204);
                        break;
                }
                return java.lang.Integer.valueOf(a);
            }
        });
        c(-1);
    }

    public /* synthetic */ AdsSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
