package com.truecaller.dialpad_view;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SelectionAwareEditText extends androidx.appcompat.widget.AppCompatEditText {
    public int g;
    public int h;
    public eg1.baz i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectionAwareEditText(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.Nullable
    public final eg1.baz getSelectionChangeListener() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSelectionChanged(int i, int i2) {
        super/*android.widget.EditText*/.onSelectionChanged(i, i2);
        if (i == this.g && i2 == this.h) {
            return;
        }
        eg1.baz bazVar = this.i;
        if (bazVar != null) {
            hg1.p pVar = (hg1.p) bazVar;
            pVar.x = i;
            pVar.y = i2;
        }
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.EditText*/.onTextChanged(charSequence, i, i2, i3);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart == this.g && selectionEnd == this.h) {
            return;
        }
        eg1.baz bazVar = this.i;
        if (bazVar != null) {
            hg1.p pVar = (hg1.p) bazVar;
            pVar.x = selectionStart;
            pVar.y = selectionEnd;
        }
        this.g = selectionStart;
        this.h = selectionEnd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super/*android.widget.EditText*/.onTouchEvent(motionEvent);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelectionChangeListener(@org.jetbrains.annotations.Nullable eg1.baz bazVar) {
        this.i = bazVar;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart == this.g && selectionEnd == this.h) {
            return;
        }
        eg1.baz bazVar2 = this.i;
        if (bazVar2 != null) {
            hg1.p pVar = (hg1.p) bazVar2;
            pVar.x = selectionStart;
            pVar.y = selectionEnd;
        }
        this.g = selectionStart;
        this.h = selectionEnd;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectionAwareEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionAwareEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
    }

    public /* synthetic */ SelectionAwareEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
