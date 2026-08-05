package com.truecaller.call_assistant.core.detailsview;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallsInDetailsItemView extends android.widget.LinearLayout implements bd3.qux {
    public yc3.d a;
    public boolean b;
    public final w41.baz c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScreenedCallsInDetailsItemView(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "time");
        w41.baz bazVar = this.c;
        bazVar.c.setText(str);
        bazVar.d.setText(" · " + str2);
    }

    public /* synthetic */ ScreenedCallsInDetailsItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenedCallsInDetailsItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((aq0.bar) X3()).getClass();
        }
        androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(context).inflate(2131561082, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i = 2131364521;
        if (((android.widget.ImageView) df0.qux.o(2131364521, inflate)) != null) {
            i = 2131365321;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365321, inflate);
            if (textView != null) {
                i = 2131367005;
                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367005, inflate);
                if (textView2 != null) {
                    w41.baz bazVar = new w41.baz(inflate, textView, textView2, 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bazVar, "inflate(...)");
                    this.c = bazVar;
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
