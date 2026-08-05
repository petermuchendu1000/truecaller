package com.truecaller.messaging.conversation.translation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/conversation/translation/RelativeSizeColorSpan;", "Landroid/text/style/RelativeSizeSpan;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RelativeSizeColorSpan extends android.text.style.RelativeSizeSpan {
    public final int a;

    public RelativeSizeColorSpan(int i) {
        super(0.75f);
        this.a = i;
    }

    @Override // android.text.style.RelativeSizeSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.a);
    }
}
