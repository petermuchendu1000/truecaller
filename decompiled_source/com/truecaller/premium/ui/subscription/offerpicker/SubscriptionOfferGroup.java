package com.truecaller.premium.ui.subscription.offerpicker;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionOfferGroup extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public static final /* synthetic */ int j = 0;
    public final java.util.ArrayList a;
    public kotlin.jvm.functions.Function1 b;
    public kotlin.jvm.functions.Function1 c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public int i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionOfferGroup(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static java.util.List a(com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferGroup subscriptionOfferGroup) {
        return kotlin.collections.y.j(new com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton[]{subscriptionOfferGroup.getFirst(), subscriptionOfferGroup.getSecond(), subscriptionOfferGroup.getThird()});
    }

    private final com.google.android.material.button.MaterialButton getActionButton() {
        return (com.google.android.material.button.MaterialButton) this.g.getValue();
    }

    private final com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton getFirst() {
        return (com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton) this.d.getValue();
    }

    private final com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton getSecond() {
        return (com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton) this.e.getValue();
    }

    private final java.util.List<com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton> getSubscriptionButtons() {
        return (java.util.List) this.h.getValue();
    }

    private final com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton getThird() {
        return (com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton) this.f.getValue();
    }

    private final void setSelected(int i) {
        throw h8.s0.j(this.a, i);
    }

    public final int getCurrentSelected() {
        return this.i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == 2131363927) {
            setSelected(0);
        } else if (id == 2131366296) {
            setSelected(1);
        } else if (id == 2131366969) {
            setSelected(2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            java.util.List<com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton> subscriptionButtons = getSubscriptionButtons();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(subscriptionButtons, 10));
            java.util.Iterator<T> it = subscriptionButtons.iterator();
            while (true) {
                i5 = -2;
                if (!it.hasNext()) {
                    break;
                }
                com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton subscriptionOfferButton = (com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton) it.next();
                if (subscriptionOfferButton.getInnerContainer().getHeight() > 0) {
                    i5 = subscriptionOfferButton.getInnerContainer().getHeight();
                }
                arrayList.add(java.lang.Integer.valueOf(i5));
            }
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.f0(arrayList);
            if (num != null) {
                i5 = num.intValue();
            }
            java.util.Iterator<T> it2 = getSubscriptionButtons().iterator();
            while (it2.hasNext()) {
                ((com.truecaller.premium.ui.subscription.offerpicker.SubscriptionOfferButton) it2.next()).setInnerContainerHeight(i5);
            }
        }
    }

    public final void setCurrentSelected(int i) {
        this.i = i;
    }

    public final void setOfferActionButtonClick(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onClick");
        this.b = function1;
    }

    public final void setOnOfferSelectedListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        this.c = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionOfferGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOfferGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = new java.util.ArrayList();
        this.d = gj.m.I(2131363927, this);
        this.e = gj.m.I(2131366296, this);
        this.f = gj.m.I(2131366969, this);
        this.g = gj.m.I(2131361912, this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.h = kotlin.LazyKt.lazy(new jq0.baz(this, 14));
        setOrientation(1);
        yy.qux.z(this, 2131560913, true);
        com.google.android.material.button.MaterialButton actionButton = getActionButton();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actionButton, "<get-actionButton>(...)");
        mf0.o.F(actionButton, 300L, new jm2.p(this, 11));
        this.i = -1;
    }

    public /* synthetic */ SubscriptionOfferGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
