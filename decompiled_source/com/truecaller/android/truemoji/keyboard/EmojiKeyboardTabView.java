package com.truecaller.android.truemoji.keyboard;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class EmojiKeyboardTabView extends androidx.recyclerview.widget.RecyclerView {
    public final androidx.recyclerview.widget.GridLayoutManager c;
    public final j23.i d;
    public final int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiKeyboardTabView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.K1(java.lang.Math.max(i / this.e, 1));
    }

    public final void setCategory(@org.jetbrains.annotations.NotNull sd0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "category");
        j23.i iVar = this.d;
        iVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "category");
        iVar.n = new sd0.bar[0];
        iVar.o = bazVar;
        iVar.notifyDataSetChanged();
    }

    public final void setEmojis(@org.jetbrains.annotations.NotNull sd0.bar[] barVarArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVarArr, "emojis");
        j23.i iVar = this.d;
        iVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVarArr, "emojis");
        iVar.o = null;
        iVar.n = barVarArr;
        iVar.notifyDataSetChanged();
    }

    public final void setOnEmojiClickListener(@org.jetbrains.annotations.Nullable rd0.c cVar) {
        this.d.p = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiKeyboardTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiKeyboardTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, 1);
        ((androidx.recyclerview.widget.LinearLayoutManager) gridLayoutManager).z = true;
        this.c = gridLayoutManager;
        j23.i iVar = new j23.i();
        iVar.n = new sd0.bar[0];
        iVar.setHasStableIds(true);
        this.d = iVar;
        this.e = context.getResources().getDimensionPixelSize(2131165637);
        setLayoutManager(gridLayoutManager);
        setAdapter(iVar);
    }

    public /* synthetic */ EmojiKeyboardTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
