package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationActionModeView extends android.widget.LinearLayout {
    public p02.i a;
    public p.y1 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationActionModeView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final androidx.appcompat.widget.AppCompatTextView a(com.truecaller.messaging.conversation.Action action) {
        int i;
        androidx.appcompat.widget.AppCompatTextView inflate = android.view.LayoutInflater.from(getContext()).inflate(2131560984, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = inflate;
        appCompatTextView.setId(action.getId());
        appCompatTextView.setText(action.getText());
        android.content.Context context = appCompatTextView.getContext();
        int icon = action.getIcon();
        if (action == com.truecaller.messaging.conversation.Action.DELETE) {
            i = 2130970571;
        } else {
            i = 2130970935;
        }
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, bi3.a.x(context, icon, i, android.graphics.PorterDuff.Mode.SRC_IN), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        appCompatTextView.setOnClickListener(new op0.baz(this, 17));
        return appCompatTextView;
    }

    public final void b(android.view.MenuItem menuItem, java.lang.String str) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        if (icon != null) {
            bi3.a.o(icon, spannableStringBuilder, java.lang.Integer.valueOf(bi3.a.s(getContext(), 2130970935)), (android.graphics.Paint.FontMetricsInt) null, 12);
        }
        spannableStringBuilder.append((java.lang.CharSequence) "     ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(1.2f), length, str.length() + length, 33);
        menuItem.setTitle(spannableStringBuilder);
    }

    public final void setCallback(@org.jetbrains.annotations.NotNull p02.i iVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "actionModeCallback");
        this.a = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationActionModeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationActionModeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166764);
        setOrientation(0);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131165558)));
        setBackgroundColor(bi3.a.s(context, 2130970648));
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public /* synthetic */ ConversationActionModeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
