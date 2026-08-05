package com.truecaller.messaging.conversation.voice_notes;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RecordToastView extends android.widget.RelativeLayout {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final android.view.animation.LinearInterpolator d;
    public android.view.animation.AlphaAnimation e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordToastView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.Chronometer getChronometerCounter() {
        return (android.widget.Chronometer) this.a.getValue();
    }

    private final android.view.View getRecordDot() {
        return (android.view.View) this.b.getValue();
    }

    private final android.widget.TextView getTvRecordTip() {
        return (android.widget.TextView) this.c.getValue();
    }

    public final void b() {
        android.view.animation.AlphaAnimation alphaAnimation = this.e;
        if (alphaAnimation != null) {
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
                android.view.animation.AlphaAnimation alphaAnimation2 = this.e;
                if (alphaAnimation2 != null) {
                    alphaAnimation2.reset();
                } else {
                    kotlin.jvm.internal.Intrinsics.n("recordAlphaAnimation");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("recordAlphaAnimation");
                throw null;
            }
        }
        getRecordDot().clearAnimation();
    }

    public final void c() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.e = alphaAnimation;
        alphaAnimation.setDuration(500L);
        android.view.animation.AlphaAnimation alphaAnimation2 = this.e;
        if (alphaAnimation2 != null) {
            alphaAnimation2.setRepeatMode(2);
            android.view.animation.AlphaAnimation alphaAnimation3 = this.e;
            if (alphaAnimation3 != null) {
                alphaAnimation3.setRepeatCount(-1);
                android.view.View recordDot = getRecordDot();
                android.view.animation.AlphaAnimation alphaAnimation4 = this.e;
                if (alphaAnimation4 != null) {
                    recordDot.startAnimation(alphaAnimation4);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("recordAlphaAnimation");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("recordAlphaAnimation");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("recordAlphaAnimation");
        throw null;
    }

    public final void d() {
        getChronometerCounter().setBase(android.os.SystemClock.elapsedRealtime());
        getChronometerCounter().start();
        c();
    }

    public final void e() {
        getChronometerCounter().stop();
        b();
    }

    public final void f() {
        getTvRecordTip().setText(2132017833);
        getChronometerCounter().setVisibility(8);
        getRecordDot().setVisibility(8);
        b();
    }

    public final void g() {
        getTvRecordTip().setText(2132017832);
        getChronometerCounter().setVisibility(0);
        getRecordDot().setVisibility(0);
        c();
    }

    public final void setVisible(boolean z) {
        android.view.animation.LinearInterpolator linearInterpolator = this.d;
        if (z) {
            setVisibility(0);
            animate().translationY(0.0f).setDuration(150L).setInterpolator(linearInterpolator).start();
        } else {
            animate().translationY(getHeight()).setDuration(150L).setInterpolator(linearInterpolator).withEndAction(new rr1.b0(this, 23)).start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordToastView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordToastView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = gj.m.I(2131363007, this);
        this.b = gj.m.I(2131366002, this);
        this.c = gj.m.I(2131367216, this);
        this.d = new android.view.animation.LinearInterpolator();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166749);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165677);
        android.view.View.inflate(context, 2131561074, this);
        setBackgroundResource(2131234289);
        getBackground().setColorFilter(bi3.a.s(getContext(), 2130970650), android.graphics.PorterDuff.Mode.SRC_IN);
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setAlpha(0.7f);
    }

    public /* synthetic */ RecordToastView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
