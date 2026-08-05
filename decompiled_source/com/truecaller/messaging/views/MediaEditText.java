package com.truecaller.messaging.views;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MediaEditText extends p.p {
    public v42.qux e;
    public v6.g f;
    public final java.lang.Runnable g;
    public final w6.c h;

    public /* synthetic */ MediaEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, android.R.attr.autoCompleteTextViewStyle, false);
    }

    public static boolean a(com.truecaller.messaging.views.MediaEditText mediaEditText, v6.g gVar, int i) {
        v42.qux quxVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "inputContentInfo");
        if (mediaEditText.f == null && (quxVar = mediaEditText.e) != null) {
            if ((i & 1) != 0) {
                try {
                    ((w6.e) gVar.a).g();
                } catch (java.lang.Exception unused) {
                }
            }
            android.content.ClipDescription description = ((w6.e) gVar.a).getDescription();
            java.lang.String str = null;
            if (description.getMimeTypeCount() != 1) {
                description = null;
            }
            if (description != null) {
                str = description.getMimeType(0);
            }
            mediaEditText.f = gVar;
            android.net.Uri f = ((w6.e) gVar.a).f();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "getContentUri(...)");
            quxVar.K3(f, str, mediaEditText.g);
            return true;
        }
        return false;
    }

    @org.jetbrains.annotations.Nullable
    public final v42.qux getMediaCallback() {
        return this.e;
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editorInfo, "outAttrs");
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        v42.qux quxVar = this.e;
        if (quxVar == null) {
            return onCreateInputConnection;
        }
        w6.qux.b(editorInfo, quxVar.k2());
        return w6.qux.a(onCreateInputConnection, editorInfo, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSelectionChanged(int i, int i2) {
        super/*android.widget.MultiAutoCompleteTextView*/.onSelectionChanged(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.Editable text = getText();
        if (text instanceof android.text.SpannableStringBuilder) {
            spannableStringBuilder = (android.text.SpannableStringBuilder) text;
        } else {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
            ud0.bar.a(spannableStringBuilder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTextContextMenuItem(int i) {
        java.lang.CharSequence charSequence;
        android.content.ClipDescription description;
        if (i == 16908322) {
            java.lang.Object systemService = getContext().getSystemService("clipboard");
            kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            android.content.ClipData primaryClip = ((android.content.ClipboardManager) systemService).getPrimaryClip();
            if (primaryClip != null && (description = primaryClip.getDescription()) != null) {
                charSequence = description.getLabel();
            } else {
                charSequence = null;
            }
            if (kotlin.jvm.internal.Intrinsics.b(charSequence, "LABEL_NUMBER") && new java.text.Bidi(kotlin.text.StringsKt.n0(kotlin.text.StringsKt.u0(getText().toString()).toString(), " "), -2).isRightToLeft()) {
                java.lang.String s = kotlin.text.y.s(wi0.bar.s("\\s", kotlin.text.StringsKt.u0(primaryClip.getItemAt(0).getText().toString()).toString(), ""), "-", "", false);
                if (kotlin.text.c0.E(s) == '+') {
                    s = h0.b.Q(kotlin.text.StringsKt.c0(s, "+"), "+");
                }
                android.text.Editable text = getText();
                if (text != null) {
                    text.append((java.lang.CharSequence) s);
                    return true;
                }
                return true;
            }
        }
        return super/*android.widget.MultiAutoCompleteTextView*/.onTextContextMenuItem(i);
    }

    public final void setMediaCallback(@org.jetbrains.annotations.Nullable v42.qux quxVar) {
        this.e = quxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaEditText(android.content.Context context) {
        this(context, (android.util.AttributeSet) null, 6, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.g = new rr1.b0(this, 18);
        this.h = new q9.x(this, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        this.g = new rr1.b0(this, 18);
        this.h = new q9.x(this, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        this.g = new rr1.b0(this, 18);
        this.h = new q9.x(this, 20);
    }
}
