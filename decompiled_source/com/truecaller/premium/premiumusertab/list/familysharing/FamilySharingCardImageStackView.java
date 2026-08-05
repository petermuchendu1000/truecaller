package com.truecaller.premium.premiumusertab.list.familysharing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingCardImageStackView extends android.widget.FrameLayout {
    public final ck2.bar a;
    public final dp0.b b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FamilySharingCardImageStackView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setOverlapItemOffset(int i) {
        ck2.bar barVar = this.a;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) barVar.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView, "imagesRecyclerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (recyclerView.getItemDecorationCount() > 0) {
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            while (true) {
                itemDecorationCount--;
                if (-1 >= itemDecorationCount) {
                    break;
                } else {
                    recyclerView.removeItemDecorationAt(itemDecorationCount);
                }
            }
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) barVar.c;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView2.addItemDecoration(new lc2.e(context, -i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FamilySharingCardImageStackView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilySharingCardImageStackView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131560012, this);
        androidx.recyclerview.widget.RecyclerView o = df0.qux.o(2131364598, this);
        if (o != null) {
            ck2.bar barVar = new ck2.bar(this, 4, o);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
            this.a = barVar;
            dp0.b bVar = new dp0.b(new d01.qux(5));
            this.b = bVar;
            o.setAdapter(bVar);
            o.addItemDecoration(new lc2.e(context, -24));
            o.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
            return;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(2131364598)));
    }

    public /* synthetic */ FamilySharingCardImageStackView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
