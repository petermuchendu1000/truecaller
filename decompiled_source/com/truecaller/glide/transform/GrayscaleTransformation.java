package com.truecaller.glide.transform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/glide/transform/GrayscaleTransformation;", "Lup1/bar;", "<init>", "()V", "glide-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GrayscaleTransformation extends up1.bar {
    public final android.graphics.Bitmap c(xf.bar barVar, android.graphics.Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "pool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "toTransform");
        android.graphics.Bitmap i3 = barVar.i(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i3, "get(...)");
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        new android.graphics.Canvas(i3).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return i3;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof com.truecaller.glide.transform.GrayscaleTransformation;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
