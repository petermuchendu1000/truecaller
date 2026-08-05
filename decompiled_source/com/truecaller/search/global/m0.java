package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class m0 extends ng.baz {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, java.lang.Object obj, int i2) {
        super(i, i);
        this.d = i2;
        this.e = obj;
    }

    public final void e(android.graphics.drawable.Drawable drawable) {
        switch (this.d) {
            case 0:
                com.truecaller.common.ui.listitem.ListItemX.M(((com.truecaller.search.global.n0) this.e).d, drawable);
                return;
            case 1:
            case 2:
                return;
            case 3:
                ((com.google.android.material.chip.Chip) this.e).setChipIconVisible(false);
                return;
            default:
                return;
        }
    }

    public void j(android.graphics.drawable.Drawable drawable) {
        switch (this.d) {
            case 2:
                fg3.j jVar = (fg3.j) this.e;
                if (!jVar.w()) {
                    kotlin.o oVar = kotlin.q.b;
                    jVar.resumeWith((java.lang.Object) null);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                return;
        }
    }

    public final void k(java.lang.Object obj, og.a aVar) {
        int i = this.d;
        java.lang.Object obj2 = this.e;
        switch (i) {
            case 0:
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "resource");
                com.truecaller.common.ui.listitem.ListItemX.M(((com.truecaller.search.global.n0) obj2).d, drawable);
                return;
            case 1:
                android.graphics.drawable.Drawable drawable2 = (android.graphics.drawable.Drawable) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable2, "resource");
                ((com.truecaller.call_assistant.core.callui.ui.widgets.callerlabel.AssistantCallerLabelView) obj2).setCompoundDrawablesWithIntrinsicBounds(drawable2, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                return;
            case 2:
                android.graphics.drawable.Drawable drawable3 = (android.graphics.drawable.Drawable) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable3, "resource");
                fg3.j jVar = (fg3.j) obj2;
                if (!jVar.w()) {
                    kotlin.o oVar = kotlin.q.b;
                    jVar.resumeWith(drawable3);
                    return;
                }
                return;
            case 3:
                android.graphics.drawable.Drawable drawable4 = (android.graphics.drawable.Drawable) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable4, "resource");
                com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) obj2;
                chip.setChipIcon(drawable4);
                chip.setChipIconVisible(true);
                return;
            default:
                android.graphics.drawable.Drawable drawable5 = (android.graphics.drawable.Drawable) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable5, "resource");
                ve2.c cVar = (ve2.c) obj2;
                ve2.c.I(cVar).setImageDrawable(drawable5);
                android.widget.ImageView I = ve2.c.I(cVar);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(I, "access$getIconImageView(...)");
                gj.m.j0(I);
                return;
        }
    }

    public m0(ve2.c cVar) {
        this.d = 4;
        this.e = cVar;
    }

    private final void b(android.graphics.drawable.Drawable drawable) {
    }

    private final void c(android.graphics.drawable.Drawable drawable) {
    }

    private final void h(android.graphics.drawable.Drawable drawable) {
    }

    private final void l(android.graphics.drawable.Drawable drawable) {
    }
}
