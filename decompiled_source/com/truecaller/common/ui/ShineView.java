package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ShineView extends android.view.View implements androidx.lifecycle.d {
    public float a;
    public float b;
    public final android.graphics.Paint c;
    public final android.graphics.RectF d;
    public final int e;
    public final int f;
    public final android.graphics.Matrix g;
    public android.graphics.LinearGradient h;
    public boolean i;
    public final pz1.bar j;
    public final cc2.i0 k;
    public float l;
    public androidx.lifecycle.d0 m;
    public kotlin.jvm.functions.Function0 n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShineView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRotationData(com.truecaller.common.ui.i iVar) {
        this.i = true;
        this.a = iVar.b + 0.5f;
        this.b = iVar.c;
        invalidate();
    }

    public final void b() {
        androidx.lifecycle.d0 d0Var;
        androidx.lifecycle.t lifecycle;
        androidx.lifecycle.s b;
        if (gj.m.H(this) && (d0Var = this.m) != null && (lifecycle = d0Var.getLifecycle()) != null && (b = lifecycle.b()) != null && b.a(androidx.lifecycle.s.e)) {
            pz1.bar barVar = this.j;
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) barVar.b;
            cc2.i0 i0Var = this.k;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i0Var, "subscriber");
            if (((com.truecaller.common.ui.j) barVar.c) == null) {
                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(9);
                android.hardware.Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
                android.hardware.Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
                if (defaultSensor3 != null) {
                    if (defaultSensor != null || defaultSensor2 != null) {
                        com.truecaller.common.ui.j jVar = new com.truecaller.common.ui.j(i0Var);
                        barVar.c = jVar;
                        if (defaultSensor != null) {
                            sensorManager.registerListener(jVar, defaultSensor, 1);
                        }
                        if (defaultSensor == null && defaultSensor2 != null) {
                            sensorManager.registerListener((com.truecaller.common.ui.j) barVar.c, defaultSensor2, 1);
                        }
                        sensorManager.registerListener((com.truecaller.common.ui.j) barVar.c, defaultSensor3, 1);
                    }
                }
            }
        }
    }

    public final float getCornerRadius() {
        return this.l;
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.d0 getLifecycleOwner() {
        return this.m;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnInvalidateCallback() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        kotlin.jvm.functions.Function0 function0 = this.n;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final /* bridge */ void k(androidx.lifecycle.d0 d0Var) {
        bar.d(d0Var);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    public final void onDestroy(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        pz1.bar barVar = this.j;
        ((android.hardware.SensorManager) barVar.b).unregisterListener((com.truecaller.common.ui.j) barVar.c);
        barVar.c = null;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (gj.m.H(this) && this.i) {
            if (this.h == null) {
                float measuredWidth = getMeasuredWidth() * 2.0f;
                float f = -measuredWidth;
                float measuredHeight = (float) (getMeasuredHeight() * 1.5d);
                int i = this.f;
                this.h = new android.graphics.LinearGradient(f, measuredHeight, f + measuredWidth, measuredHeight - (getMeasuredHeight() * 2.0f), new int[]{i, this.e, i}, new float[]{0.3f, 0.5f, 0.7f}, android.graphics.Shader.TileMode.CLAMP);
            }
            int measuredWidth2 = getMeasuredWidth() * 3;
            int measuredHeight2 = getMeasuredHeight() * 2;
            float f2 = measuredWidth2 * this.a;
            float f3 = measuredHeight2 * this.b;
            android.graphics.Matrix matrix = this.g;
            matrix.setTranslate(f2, f3);
            android.graphics.LinearGradient linearGradient = this.h;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix);
            }
            android.graphics.LinearGradient linearGradient2 = this.h;
            android.graphics.Paint paint = this.c;
            paint.setShader(linearGradient2);
            android.graphics.RectF rectF = this.d;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.bottom = getMeasuredHeight();
            rectF.right = getMeasuredWidth();
            float f4 = this.l;
            if (f4 == 0.0f) {
                canvas.drawRect(rectF, paint);
            } else {
                canvas.drawRoundRect(rectF, f4, f4, paint);
            }
        }
    }

    public final void onPause(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        this.i = false;
        pz1.bar barVar = this.j;
        ((android.hardware.SensorManager) barVar.b).unregisterListener((com.truecaller.common.ui.j) barVar.c);
        barVar.c = null;
    }

    public final void onResume(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        bar.e(d0Var);
        b();
    }

    public final /* bridge */ void onStart(androidx.lifecycle.d0 d0Var) {
        bar.f(d0Var);
    }

    public final void onStop(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    public final void setCornerRadius(float f) {
        this.l = f;
    }

    public final void setLifecycleOwner(@org.jetbrains.annotations.Nullable androidx.lifecycle.d0 d0Var) {
        androidx.lifecycle.t lifecycle;
        if (this.m == null) {
            this.m = d0Var;
            if (d0Var != null && (lifecycle = d0Var.getLifecycle()) != null) {
                lifecycle.a(this);
            }
        }
    }

    public final void setOnInvalidateCallback(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.n = function0;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (gj.m.H(this)) {
            b();
            return;
        }
        this.i = false;
        pz1.bar barVar = this.j;
        ((android.hardware.SensorManager) barVar.b).unregisterListener((com.truecaller.common.ui.j) barVar.c);
        barVar.c = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShineView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShineView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.c = new android.graphics.Paint();
        this.d = new android.graphics.RectF();
        this.e = k6.a.i(-1, com.ctc.wstx.cfg.OutputConfigFlags.CFG_AUTOMATIC_END_ELEMENTS);
        this.f = k6.a.i(-1, 0);
        this.g = new android.graphics.Matrix();
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.j = new pz1.bar((android.hardware.SensorManager) systemService);
        this.k = new cc2.i0(1, this, com.truecaller.common.ui.ShineView.class, "setRotationData", "setRotationData(Lcom/truecaller/common/ui/RotationSensorDataProvider$Data;)V", 0, 20);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.h, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.l = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            setLayerType(2, null);
        } catch (java.lang.Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public /* synthetic */ ShineView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
