package com.truecaller.details_view.ui.comments.keywords;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CommentsKeywordsViewForLists extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public yc3.d s;
    public final boolean t;
    public final ea1.i u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsKeywordsViewForLists(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsKeywordsViewForLists(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsKeywordsViewForLists(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CommentsKeywordsViewForLists(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsKeywordsViewForLists(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            ((ab1.b) X3()).getClass();
        }
        ea1.i a = ea1.i.a(android.view.LayoutInflater.from(context), this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "inflate(...)");
        this.u = a;
        setBackground(context.getDrawable(2131231198));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        gj.m.f0(constraintLayout);
    }
}
