package com.truecaller.glide.transform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/glide/transform/TintTransformation;", "Lup1/bar;", "glide-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TintTransformation extends up1.bar {
    public final int c;

    public TintTransformation(int i) {
        this.c = i;
    }

    @Override // up1.bar
    public final void b(java.security.MessageDigest messageDigest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        super.b(messageDigest);
        messageDigest.update(java.nio.ByteBuffer.allocate(4).putInt(this.c).array());
    }

    public final android.graphics.Bitmap c(xf.bar barVar, android.graphics.Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "pool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "toTransform");
        new android.graphics.Canvas(bitmap).drawColor(this.c, android.graphics.PorterDuff.Mode.SRC_OVER);
        return bitmap;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof com.truecaller.glide.transform.TintTransformation) && ((com.truecaller.glide.transform.TintTransformation) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), java.lang.Integer.valueOf(this.c)};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "values");
        int i = 17;
        for (int i2 = 0; i2 < 2; i2++) {
            i = qg.h.g(objArr[i2].hashCode(), i);
        }
        return i;
    }
}
