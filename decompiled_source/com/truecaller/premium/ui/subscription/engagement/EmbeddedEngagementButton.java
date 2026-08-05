package com.truecaller.premium.ui.subscription.engagement;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EmbeddedEngagementButton extends android.widget.LinearLayout implements if2.bar {
    public static final /* synthetic */ int b = 0;
    public final if2.qux a;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/premium/ui/subscription/engagement/EmbeddedEngagementButton$bar;", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedEngagementButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static android.view.View a(com.truecaller.premium.ui.subscription.engagement.EmbeddedEngagementButton embeddedEngagementButton, int i) {
        android.content.Context context = embeddedEngagementButton.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.view.View inflate = android.view.LayoutInflater.from(yy.qux.v(context, true)).inflate(i, (android.view.ViewGroup) embeddedEngagementButton, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.u0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.a.m1();
        super.onDetachedFromWindow();
    }

    public void setButtonSpecs(@org.jetbrains.annotations.NotNull if2.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "spec");
        if2.qux quxVar = this.a;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "spec");
        quxVar.l = bVar;
        quxVar.m = false;
        fg3.h0.J(quxVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new fl2.d(quxVar, (df3.bar) null, 5), 3);
    }

    public void setLaunchContext(@org.jetbrains.annotations.NotNull i82.r rVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "launchContext");
        if2.qux quxVar = this.a;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "premiumLaunchContext");
        quxVar.k = rVar;
    }

    public void setOnStateChangedListener(@org.jetbrains.annotations.NotNull if2.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "listener");
        if2.qux quxVar = this.a;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "listener");
        quxVar.j = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedEngagementButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedEngagementButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        tx.c0 c0Var = ((com.truecaller.premium.ui.subscription.engagement.EmbeddedEngagementButton.bar) f40.d0.z(applicationContext, com.truecaller.premium.ui.subscription.engagement.EmbeddedEngagementButton.bar.class)).H.b;
        qb2.g gVar = (qb2.g) c0Var.f4.get();
        k82.d dVar = (k82.d) c0Var.Q4.get();
        tx.w wVar = c0Var.a;
        this.a = new if2.qux(gVar, dVar, (dd2.h) wVar.ti.get(), (tf2.z0) c0Var.H4.get(), (hf2.baz) c0Var.M4.get(), (kotlin.coroutines.CoroutineContext) wVar.V1.get());
        setOrientation(1);
        android.content.res.Resources resources = getResources();
        if (resources != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(2131166785);
            setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
    }

    public /* synthetic */ EmbeddedEngagementButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
