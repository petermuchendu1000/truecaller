package com.truecaller.call_assistant.core.callui.ui.widgets.spam;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantSpamButton extends androidx.appcompat.widget.AppCompatImageButton implements lo0.baz {
    public static final /* synthetic */ int j = 0;
    public lo0.bar d;
    public gk2.n e;
    public hk2.s f;
    public gk2.qux g;
    public qo1.b h;
    public xj0.bar i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantSpamButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(com.truecaller.blocking.ui.BlockResult blockResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockResult, "blockResult");
        lo0.qux quxVar = (lo0.qux) getPresenter();
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockResult, "blockResult");
        fg3.h0.J(quxVar, quxVar.d, (fg3.f0) null, new lj0.baz(quxVar, blockResult, null, 9), 2);
    }

    @org.jetbrains.annotations.NotNull
    public final xj0.bar getBlockingActivityRouter() {
        xj0.bar barVar = this.i;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("blockingActivityRouter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qo1.b getCallAssistantFeaturesInventory() {
        qo1.b bVar = this.h;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.Intrinsics.n("callAssistantFeaturesInventory");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final lo0.bar getPresenter() {
        lo0.bar barVar = this.d;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final gk2.qux getRewardProgramClaimRewardSnackbar() {
        gk2.qux quxVar = this.g;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("rewardProgramClaimRewardSnackbar");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final hk2.s getRewardProgramProgressSnackbar() {
        hk2.s sVar = this.f;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.Intrinsics.n("rewardProgramProgressSnackbar");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final gk2.n getRewardProgramThankYouSnackbar() {
        gk2.n nVar = this.e;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.Intrinsics.n("rewardProgramThankYouSnackbar");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.ImageButton*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        this.d = new lo0.qux((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), cd3.baz.a(b0Var.P), (lu0.baz) b0Var.d.get(), cd3.baz.a(b0Var.R), (qo1.b) b0Var.i.get());
        tx.w wVar = (tx.w) b0Var.a;
        this.e = new gk2.n(wVar.K3());
        this.f = new hk2.s(new gk2.qux(((tx.w) b0Var.a).K3()));
        this.g = new gk2.qux(((tx.w) b0Var.a).K3());
        this.h = (qo1.b) b0Var.i.get();
        xj0.bar F = wVar.F();
        es.baz.k(F);
        this.i = F;
        getPresenter().a = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.ImageButton*/.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    public final void setBlockingActivityRouter(@org.jetbrains.annotations.NotNull xj0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.i = barVar;
    }

    public final void setCallAssistantFeaturesInventory(@org.jetbrains.annotations.NotNull qo1.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.h = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
        super/*android.widget.ImageButton*/.setOnClickListener(new f81.a(18, onClickListener, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnClickListenerStandard(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
        super/*android.widget.ImageButton*/.setOnClickListener(new lb1.b(onClickListener, 3));
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull lo0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.d = barVar;
    }

    public final void setRewardProgramClaimRewardSnackbar(@org.jetbrains.annotations.NotNull gk2.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
        this.g = quxVar;
    }

    public final void setRewardProgramProgressSnackbar(@org.jetbrains.annotations.NotNull hk2.s sVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.f = sVar;
    }

    public final void setRewardProgramThankYouSnackbar(@org.jetbrains.annotations.NotNull gk2.n nVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.e = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantSpamButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSpamButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistantSpamButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
