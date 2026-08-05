package com.truecaller.acs.ui.widgets.mute;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MuteVideoCallerIdButtonView extends androidx.appcompat.widget.AppCompatImageButton implements bd3.qux {
    public yc3.d d;
    public final boolean e;
    public final kotlin.Lazy f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MuteVideoCallerIdButtonView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(com.truecaller.acs.ui.widgets.mute.MuteVideoCallerIdButtonView muteVideoCallerIdButtonView) {
        yz.b viewModel = muteVideoCallerIdButtonView.getViewModel();
        if (viewModel != null) {
            m03.r.t(viewModel, new nu1.v0(viewModel, (df3.bar) null, 22));
        }
    }

    public final yz.b getViewModel() {
        return (yz.b) this.f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.d == null) {
            this.d = new yc3.d(this);
        }
        return this.d.X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.ImageButton*/.onAttachedToWindow();
        yz.b viewModel = getViewModel();
        if (viewModel != null) {
            ig3.w1.F(new androidx.room.o(25, (ig3.h2) viewModel.b.a, new yz.qux(viewModel, null, 2)), androidx.lifecycle.g1.l(viewModel));
        }
        gj.m.Y(this, new yz.bar(this, null, 1));
        setOnClickListener(new yt2.a(this, 2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MuteVideoCallerIdButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MuteVideoCallerIdButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MuteVideoCallerIdButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.e) {
            this.e = true;
            ((yz.baz) X3()).getClass();
        }
        this.f = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 21));
    }
}
