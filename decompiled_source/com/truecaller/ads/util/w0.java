package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class w0 extends android.view.ViewOutlineProvider {
    public final /* synthetic */ int a;

    public w0(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
