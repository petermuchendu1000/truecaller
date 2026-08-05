package com.truecaller.premium.util;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DebugSubscriptionEditView extends android.widget.LinearLayout {
    public tf2.baz a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugSubscriptionEditView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.google.android.material.checkbox.MaterialCheckBox getEnabledSwitch() {
        return (com.google.android.material.checkbox.MaterialCheckBox) this.k.getValue();
    }

    private final com.truecaller.premium.util.DebugPeriodView getFreeTrialPeriod() {
        return (com.truecaller.premium.util.DebugPeriodView) this.b.getValue();
    }

    private final com.truecaller.premium.util.DebugPeriodView getIntroductoryPeriod() {
        return (com.truecaller.premium.util.DebugPeriodView) this.c.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getIntroductoryPeriodCycles() {
        return (com.google.android.material.textfield.TextInputEditText) this.d.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getIntroductoryPrice() {
        return (com.google.android.material.textfield.TextInputEditText) this.e.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getIntroductoryPriceAmountMicros() {
        return (com.google.android.material.textfield.TextInputEditText) this.f.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getPrice() {
        return (com.google.android.material.textfield.TextInputEditText) this.g.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getPriceAmountMicros() {
        return (com.google.android.material.textfield.TextInputEditText) this.h.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getPriceCurrencyCode() {
        return (com.google.android.material.textfield.TextInputEditText) this.i.getValue();
    }

    private final com.google.android.material.textfield.TextInputEditText getSku() {
        return (com.google.android.material.textfield.TextInputEditText) this.l.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.j.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final tf2.baz getSubscription() {
        tf2.baz bazVar = this.a;
        if (bazVar != null) {
            long j = 1000000;
            r82.w a = r82.w.a(bazVar.a, java.lang.String.valueOf(getSku().getText()), java.lang.String.valueOf(getPrice().getText()), java.lang.String.valueOf(getPriceCurrencyCode().getText()), java.lang.Long.parseLong(java.lang.String.valueOf(getPriceAmountMicros().getText())) * j, java.lang.String.valueOf(getIntroductoryPrice().getText()), java.lang.Long.parseLong(java.lang.String.valueOf(getIntroductoryPriceAmountMicros().getText())) * j, getFreeTrialPeriod().getPeriod(), java.lang.Integer.parseInt(java.lang.String.valueOf(getIntroductoryPeriodCycles().getText())), getIntroductoryPeriod().getPeriod(), (com.truecaller.premium.data.ProductKind) null, (com.truecaller.premium.data.PremiumProductType) null, (java.lang.String) null, false, (w82.v2) null, (java.lang.Integer) null, (w82.l) null, (com.truecaller.premium.data.tier.PremiumTierType) null, 8387586);
            boolean isChecked = getEnabledSwitch().isChecked();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "subscription");
            return new tf2.baz(a, isChecked);
        }
        kotlin.jvm.internal.Intrinsics.n("holder");
        throw null;
    }

    public final void setSubscription(@org.jetbrains.annotations.NotNull tf2.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "holder");
        this.a = bazVar;
        r82.w wVar = bazVar.a;
        getTitle().setText(wVar.b);
        getPrice().setText(wVar.c);
        getPriceCurrencyCode().setText(wVar.d);
        long j = 1000000;
        getPriceAmountMicros().setText(java.lang.String.valueOf(wVar.e / j));
        getFreeTrialPeriod().setTitle("Free Trial Period");
        getFreeTrialPeriod().setPeriod(wVar.h);
        getIntroductoryPrice().setText(wVar.f);
        getIntroductoryPriceAmountMicros().setText(java.lang.String.valueOf(wVar.g / j));
        getIntroductoryPeriodCycles().setText(java.lang.String.valueOf(wVar.i));
        getIntroductoryPeriod().setTitle("Introductory Price Period");
        getIntroductoryPeriod().setPeriod(wVar.j);
        getEnabledSwitch().setChecked(bazVar.b);
        getSku().setText(wVar.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugSubscriptionEditView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugSubscriptionEditView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = gj.m.I(2131364024, this);
        this.c = gj.m.I(2131364732, this);
        this.d = gj.m.I(2131364733, this);
        this.e = gj.m.I(2131364734, this);
        this.f = gj.m.I(2131364735, this);
        this.g = gj.m.I(2131365809, this);
        this.h = gj.m.I(2131365810, this);
        this.i = gj.m.I(2131365811, this);
        this.j = gj.m.I(2131367033, this);
        this.k = gj.m.I(2131363672, this);
        this.l = gj.m.I(2131366495, this);
        android.view.View.inflate(context, 2131561006, this);
        setOrientation(1);
    }

    public /* synthetic */ DebugSubscriptionEditView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
