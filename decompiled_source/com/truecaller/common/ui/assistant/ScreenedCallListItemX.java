package com.truecaller.common.ui.assistant;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ScreenedCallListItemX extends com.truecaller.common.ui.listitem.ListItemX {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenedCallListItemX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.common.ui.listitem.ListItemX
    public final void onAttachedToWindow() {
        android.graphics.drawable.Drawable background = getBackground();
        super.onAttachedToWindow();
        if (!kotlin.jvm.internal.Intrinsics.b(background, getBackground())) {
            setBackground(background);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenedCallListItemX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenedCallListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.ViewGroup.LayoutParams layoutParams = getLxBinding().f.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(0);
        }
        d6.j jVar = new d6.j();
        jVar.e(this);
        d41.qux lxBinding = getLxBinding();
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = lxBinding.h;
        androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = lxBinding.g;
        jVar.g(appCompatTextView.getId(), 7, appCompatTextView2.getId(), 6);
        jVar.d(appCompatTextView2.getId(), 6);
        jVar.g(appCompatTextView2.getId(), 3, appCompatTextView.getId(), 3);
        jVar.g(appCompatTextView2.getId(), 4, appCompatTextView.getId(), 4);
        jVar.g(appCompatTextView2.getId(), 7, 0, 7);
        jVar.j(appCompatTextView2.getId()).d.u = 1.0f;
        jVar.g(lxBinding.f.getId(), 7, lxBinding.b.getId(), 6);
        jVar.b(this);
    }

    public /* synthetic */ ScreenedCallListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
