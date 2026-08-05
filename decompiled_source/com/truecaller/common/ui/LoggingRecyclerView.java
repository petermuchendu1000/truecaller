package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class LoggingRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingRecyclerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        java.lang.String str;
        try {
            super.requestChildFocus(view, view2);
        } catch (java.lang.IllegalArgumentException e) {
            if (kotlin.jvm.internal.Intrinsics.b(e.getMessage(), "parameter must be a descendant of this view")) {
                try {
                    str = "component:" + mk.m.q(getContext()) + " RecyclerView:" + mk.m.p(this) + " child:" + mk.m.p(view) + " focused:" + mk.m.p(view2);
                } catch (java.lang.Exception unused) {
                    str = "Error";
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "cause");
                throw new java.lang.IllegalArgumentException(str, e);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LoggingRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
