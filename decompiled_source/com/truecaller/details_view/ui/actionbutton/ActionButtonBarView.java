package com.truecaller.details_view.ui.actionbutton;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ActionButtonBarView extends android.widget.LinearLayout {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonBarView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.details_view.ui.actionbutton.ActionButtonView, androidx.constraintlayout.widget.ConstraintLayout, android.view.View] */
    public final void a(la1.baz bazVar) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ?? actionButtonView = new com.truecaller.details_view.ui.actionbutton.ActionButtonView(context, null, 0, 0, 14, null);
        actionButtonView.setId(bazVar.a);
        actionButtonView.setTitle(bazVar.b);
        actionButtonView.setIcon(bazVar.c);
        actionButtonView.setBadge(bazVar.h);
        mf0.o.F((android.view.View) actionButtonView, 300L, new l10.baz(bazVar, 4));
        actionButtonView.setTextColor(bazVar.d);
        actionButtonView.setIconPainter(bazVar.e);
        actionButtonView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(actionButtonView);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            java.lang.Object childAt = getChildAt(i);
            if (childAt instanceof com.truecaller.details_view.ui.actionbutton.ActionButtonView) {
                com.truecaller.details_view.ui.actionbutton.ActionButtonView actionButtonView = (com.truecaller.details_view.ui.actionbutton.ActionButtonView) childAt;
                actionButtonView.setTextAlpha(f);
                actionButtonView.setBorderAlpha(f);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActionButtonBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
