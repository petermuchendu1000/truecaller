package com.truecaller.android.truemoji.keyboard;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class EmojiKeyboardView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final ao.q s;
    public rd0.c t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiKeyboardView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setOnEmojiClickListener(@org.jetbrains.annotations.Nullable rd0.c cVar) {
        this.t = cVar;
        this.s.q = cVar;
    }

    public final void setRecentEmoji(@org.jetbrains.annotations.NotNull rd0.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "recentEmoji");
        ao.q qVar = this.s;
        qVar.o = dVar;
        qVar.notifyDataSetChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmojiKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View.inflate(context, 2131561013, this);
        com.google.android.material.tabs.TabLayout findViewById = findViewById(2131366776);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(2131362409);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        androidx.viewpager2.widget.ViewPager2 findViewById3 = findViewById(2131367418);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        androidx.viewpager2.widget.ViewPager2 viewPager2 = findViewById3;
        ao.q qVar = new ao.q(sd0.qux.a);
        this.s = qVar;
        viewPager2.setAdapter(qVar);
        new com.google.android.gms.internal.ads.cm(findViewById, viewPager2, true, new r9.c(24)).d();
        findViewById2.setOnClickListener(new pn0.a(this, 23));
        viewPager2.c(new com.truecaller.cloudtelephony.callrecording.ui.details.b(this, 4));
    }

    public /* synthetic */ EmojiKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
