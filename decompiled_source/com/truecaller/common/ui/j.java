package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class j implements android.hardware.SensorEventListener {
    public final kotlin.jvm.functions.Function1 a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public boolean h;
    public boolean i;
    public boolean j;

    public j(cc2.i0 i0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i0Var, "subscriber");
        this.a = i0Var;
        this.b = new float[3];
        this.c = new float[3];
        this.d = new float[3];
        this.e = new float[9];
        this.f = new float[9];
        this.g = new float[9];
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorEvent, "event");
        int type = sensorEvent.sensor.getType();
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        if (type != 1) {
            if (type != 2) {
                if (type == 9) {
                    float[] fArr3 = sensorEvent.values;
                    fArr2[0] = fArr3[0];
                    fArr2[1] = fArr3[1];
                    fArr2[2] = fArr3[2];
                    this.h = true;
                } else {
                    return;
                }
            } else {
                float[] fArr4 = sensorEvent.values;
                fArr[0] = fArr4[0];
                fArr[1] = fArr4[1];
                fArr[2] = fArr4[2];
                this.j = true;
            }
        } else if (!this.h) {
            float[] fArr5 = sensorEvent.values;
            fArr2[0] = fArr5[0];
            fArr2[1] = fArr5[1];
            fArr2[2] = fArr5[2];
            this.i = true;
        }
        if ((this.h || this.i) && this.j) {
            float[] fArr6 = this.f;
            float[] fArr7 = this.e;
            android.hardware.SensorManager.getRotationMatrix(fArr7, fArr6, fArr2, fArr);
            float[] fArr8 = this.g;
            android.hardware.SensorManager.remapCoordinateSystem(fArr7, 2, 129, fArr8);
            float[] fArr9 = this.d;
            android.hardware.SensorManager.getOrientation(fArr8, fArr9);
            this.a.invoke(new com.truecaller.common.ui.i(fArr9[0], fArr9[1], fArr9[2]));
        }
    }
}
