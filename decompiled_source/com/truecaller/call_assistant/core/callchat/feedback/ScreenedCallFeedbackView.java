package com.truecaller.call_assistant.core.callchat.feedback;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallFeedbackView extends android.widget.LinearLayout {
    public jn0.c a;
    public final android.widget.TextView b;
    public final android.view.View c;
    public final android.view.View d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenedCallFeedbackView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.Nullable
    public final jn0.c getListener() {
        return this.a;
    }

    public final void setLabelText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "label");
        android.widget.TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setListener(@org.jetbrains.annotations.Nullable jn0.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenedCallFeedbackView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenedCallFeedbackView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 1;
        gj.m.z(this, 2131561080, true);
        setBackgroundResource(2131231387);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131364878);
        this.b = textView;
        android.view.View findViewById = findViewById(2131366985);
        this.c = findViewById;
        android.view.View findViewById2 = findViewById(2131366984);
        this.d = findViewById2;
        setGravity(16);
        final int i3 = 0;
        setOrientation(0);
        setPadding(8, 8, 8, 8);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.call_assistant.core.R$styleable.d, 0, 0);
        if (textView != null) {
            textView.setText(obtainStyledAttributes.getString(0));
        }
        obtainStyledAttributes.recycle();
        if (findViewById != null) {
            findViewById.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: jn0.b
                public final /* synthetic */ com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    switch (i3) {
                        case 0:
                            jn0.c cVar = this.b.a;
                            if (cVar != null) {
                                cVar.i();
                                return;
                            }
                            return;
                        default:
                            jn0.c cVar2 = this.b.a;
                            if (cVar2 != null) {
                                cVar2.k();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: jn0.b
                public final /* synthetic */ com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    switch (i2) {
                        case 0:
                            jn0.c cVar = this.b.a;
                            if (cVar != null) {
                                cVar.i();
                                return;
                            }
                            return;
                        default:
                            jn0.c cVar2 = this.b.a;
                            if (cVar2 != null) {
                                cVar2.k();
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }

    public /* synthetic */ ScreenedCallFeedbackView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
