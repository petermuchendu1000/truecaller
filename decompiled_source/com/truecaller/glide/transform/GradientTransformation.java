package com.truecaller.glide.transform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/glide/transform/GradientTransformation;", "Lup1/bar;", "<init>", "()V", "glide-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GradientTransformation extends up1.bar {
    public final android.graphics.Bitmap c(xf.bar barVar, android.graphics.Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "pool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "toTransform");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap copy = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        android.graphics.Canvas canvas = new android.graphics.Canvas(copy);
        float f = width / 2;
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f, height / 2, f, height, new int[]{android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0)}, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = new android.graphics.Paint(4);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setShader(linearGradient);
        canvas.drawPaint(paint);
        kotlin.jvm.internal.Intrinsics.d(copy);
        return copy;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof com.truecaller.glide.transform.GradientTransformation;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }
}
