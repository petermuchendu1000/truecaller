package com.truecaller.call_assistant.core.callui.ui.widgets.avatar;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantAvatarView extends com.truecaller.common.ui.avatar.AvatarXView implements do0.baz {
    public do0.bar T;
    public w31.c U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantAvatarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final do0.bar getPresenter() {
        do0.bar barVar = this.T;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        this.T = new ab1.qux((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), (lu0.baz) b0Var.d.get(), new b91.a(28));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        w31.c cVar = new w31.c(new u03.g0(context2), 0);
        this.U = cVar;
        setPresenter(cVar);
        getPresenter().u0(this);
    }

    public final void onDetachedFromWindow() {
        ((of0.baz) getPresenter()).m1();
        super.onDetachedFromWindow();
    }

    @Override // do0.baz
    public void setAvatar(@org.jetbrains.annotations.NotNull com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarConfig");
        w31.c cVar = this.U;
        if (cVar != null) {
            cVar.C2(avatarXConfig, false);
        } else {
            kotlin.jvm.internal.Intrinsics.n("avatarPresenter");
            throw null;
        }
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull do0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.T = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantAvatarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantAvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistantAvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
