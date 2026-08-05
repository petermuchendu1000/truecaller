package com.truecaller.premium;

/* loaded from: /home/user/tc_decoded/classes.dex */
public final class GoldCallerIdPreviewView extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f4552s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f4553t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f4554u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f4555v;

    /* renamed from: w, reason: collision with root package name */
    public final w31.c f4556w;

    /* renamed from: x, reason: collision with root package name */
    public final com.truecaller.common.ui.ShineView f4557x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldCallerIdPreviewView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.ui.ShineView getShineView() {
        return this.f4557x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldCallerIdPreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldCallerIdPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View.inflate(context, 2131561031, this);
        setClipChildren(false);
        u03.g0 g0Var = new u03.g0(context);
        w31.c cVar = new w31.c(g0Var, 0);
        this.f4556w = cVar;
        com.truecaller.common.ui.f fVar = new com.truecaller.common.ui.f(g0Var);
        fVar.setCornerRadius(g0Var.c(2131165502));
        setBackground(fVar);
        findViewById(2131362801).setPresenter(cVar);
        android.view.View findViewById = findViewById(2131362804);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f4552s = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(2131362803);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f4553t = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(2131362798);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f4554u = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(2131362799);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f4555v = (android.widget.TextView) findViewById4;
        com.truecaller.common.ui.ShineView findViewById5 = findViewById(2131364309);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f4557x = findViewById5;
    }

    public /* synthetic */ GoldCallerIdPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
