package com.truecaller.videocallerid.ui.videoplayer;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class NoIconAvatarXView extends com.truecaller.common.ui.avatar.AvatarXView {
    public boolean T;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoIconAvatarXView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void onDraw(android.graphics.Canvas canvas) {
        w31.c presenter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.T && (presenter = getPresenter()) != null) {
            w31.c cVar = presenter;
            cVar.e = null;
            cVar.f = null;
            cVar.g = null;
            cVar.m = null;
            presenter.n2((java.lang.Integer) null);
        }
        super.onDraw(canvas);
    }

    public final void setNoIcon(boolean z) {
        this.T = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoIconAvatarXView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoIconAvatarXView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NoIconAvatarXView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
