package com.truecaller.premium.ui.subscription.buttons;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CardPurchaseButtonView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPurchaseButtonView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.TextView getPriceTextView() {
        return (android.widget.TextView) this.t.getValue();
    }

    private final androidx.appcompat.widget.AppCompatTextView getProfitTextView() {
        return (androidx.appcompat.widget.AppCompatTextView) this.u.getValue();
    }

    private final android.widget.TextView getStrikeThroughPriceTextView() {
        return (android.widget.TextView) this.s.getValue();
    }

    private final android.widget.TextView getSubTextView() {
        return (android.widget.TextView) this.v.getValue();
    }

    private final void setPrice(java.lang.String str) {
        boolean z;
        android.widget.TextView priceTextView = getPriceTextView();
        priceTextView.setText(str);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(priceTextView, !z);
    }

    private final void setProfit(java.lang.String str) {
        boolean z;
        androidx.appcompat.widget.AppCompatTextView profitTextView = getProfitTextView();
        profitTextView.setText(str);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(profitTextView, !z);
    }

    private final void setStrikeThroughPrice(java.lang.String str) {
        boolean z;
        android.widget.TextView strikeThroughPriceTextView = getStrikeThroughPriceTextView();
        strikeThroughPriceTextView.setText(str);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(strikeThroughPriceTextView, !z);
    }

    private final void setSubText(java.lang.String str) {
        boolean z;
        android.widget.TextView subTextView = getSubTextView();
        subTextView.setText(str);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(subTextView, !z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPremiumCardSubscriptionButton(@org.jetbrains.annotations.NotNull xe2.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "purchaseButton");
        setStrikeThroughPrice(cVar.a);
        setPrice(cVar.b);
        setProfit(cVar.c);
        setSubText(cVar.d);
        setBackgroundResource(cVar.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPurchaseButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardPurchaseButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131366673, this);
        this.t = gj.m.I(2131365809, this);
        this.u = gj.m.I(2131365845, this);
        this.v = gj.m.I(2131366691, this);
        setLayoutParams(new d6.a(-1, -2));
        gj.m.z(this, 2131559956, true);
        android.widget.TextView strikeThroughPriceTextView = getStrikeThroughPriceTextView();
        strikeThroughPriceTextView.setPaintFlags(strikeThroughPriceTextView.getPaintFlags() | 16);
    }

    public /* synthetic */ CardPurchaseButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
