package com.truecaller.messaging.conversation.voice_notes;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CountDownChronometer extends android.widget.Chronometer {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final java.lang.StringBuilder e;
    public long f;
    public final p.f1 g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownChronometer(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        boolean z;
        if (this.b && this.c && isShown()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.d) {
            p.f1 f1Var = this.g;
            if (z) {
                b(android.os.SystemClock.elapsedRealtime());
                postDelayed(f1Var, 1000L);
            } else {
                removeCallbacks(f1Var);
            }
            this.d = z;
        }
    }

    public final synchronized void b(long j) {
        synchronized (this) {
            long c = qf3.a.c((this.a - j) / 1000);
            if (c < 0) {
                c = 0;
            }
            setText(android.text.format.DateUtils.formatElapsedTime(this.e, c));
        }
    }

    @Override // android.widget.Chronometer, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        a();
    }

    @Override // android.widget.Chronometer, android.widget.TextView, android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "changedView");
        super.onVisibilityChanged(view, i);
        a();
    }

    @Override // android.widget.Chronometer, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        a();
    }

    public final void setChronometerBase(long j) {
        this.a = j;
        b(android.os.SystemClock.elapsedRealtime());
    }

    @Override // android.widget.Chronometer
    public final void start() {
        if (this.f != 0) {
            this.a = android.os.SystemClock.elapsedRealtime() + this.f;
        }
        this.c = true;
        a();
    }

    @Override // android.widget.Chronometer
    public final void stop() {
        this.c = false;
        a();
        this.f = this.a - android.os.SystemClock.elapsedRealtime();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownChronometer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownChronometer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.e = new java.lang.StringBuilder(8);
        this.g = new p.f1(this, 9);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        b(elapsedRealtime);
    }

    public /* synthetic */ CountDownChronometer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
