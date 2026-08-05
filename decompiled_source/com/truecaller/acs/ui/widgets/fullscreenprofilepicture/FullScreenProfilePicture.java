package com.truecaller.acs.ui.widgets.fullscreenprofilepicture;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FullScreenProfilePicture extends g41.baz {
    public static final /* synthetic */ int d = 0;
    public final boolean b;
    public final kotlin.Lazy c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenProfilePicture(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final vz.qux getViewModel() {
        return (vz.qux) this.c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.ImageView*/.onAttachedToWindow();
        vz.qux viewModel = getViewModel();
        if (viewModel != null) {
            ig3.w1.F(new androidx.room.o(25, new a61.b((ig3.h2) viewModel.e.a, viewModel.f.a(), new b00.qux(3, 1, null), 4), new td1.f(viewModel, (df3.bar) null, 26)), androidx.lifecycle.g1.l(viewModel));
        }
        gj.m.Y(this, new vz.baz(this, null, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenProfilePicture(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenProfilePicture(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = com.truecaller.common.ui.R.styleable.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "FullScreenProfilePicture");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.c = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 13));
    }

    public /* synthetic */ FullScreenProfilePicture(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
