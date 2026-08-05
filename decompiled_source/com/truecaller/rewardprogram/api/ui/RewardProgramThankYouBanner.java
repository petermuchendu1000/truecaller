package com.truecaller.rewardprogram.api.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramThankYouBanner extends k4.bar implements bd3.qux {
    public static final /* synthetic */ int m = 0;
    public yc3.d i;
    public boolean j;
    public final v2.c2 k;
    public final v2.c2 l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardProgramThankYouBanner(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getSubtitleColor() {
        return this.l.g();
    }

    private final int getTitleColor() {
        return this.k.g();
    }

    private final void setSubtitleColor(int i) {
        this.l.i(i);
    }

    private final void setTitleColor(int i) {
        this.k.i(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.i == null) {
            this.i = new yc3.d((android.view.View) this);
        }
        return this.i.X3();
    }

    public final void a(int i, v2.n nVar) {
        int i2;
        boolean z;
        v2.n nVar2;
        nVar.b0(1659663678);
        if (nVar.f(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            nVar2 = nVar;
            gk2.bar.d(0, null, getTitleColor(), getSubtitleColor(), null, nVar2, 0, 19);
        } else {
            nVar2 = nVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new ee3.y(this, i, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "changedView");
        super/*android.view.ViewGroup*/.onVisibilityChanged(view, i);
        if (i == 0) {
            d();
            c();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardProgramThankYouBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardProgramThankYouBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.j) {
            this.j = true;
            ((gk2.m) X3()).getClass();
        }
        this.k = androidx.compose.runtime.a.g(0);
        this.l = androidx.compose.runtime.a.g(0);
        int[] iArr = com.truecaller.rewardprogram.api.R$styleable.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "RewardProgramThankYouBanner");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setTitleColor(obtainStyledAttributes.getColor(1, bi3.a.s(context, 2130970563)));
        setSubtitleColor(obtainStyledAttributes.getColor(0, bi3.a.s(context, 2130970565)));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ RewardProgramThankYouBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
