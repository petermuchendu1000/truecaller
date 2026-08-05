package com.truecaller.premium.familysharing.editfamily.listitem;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingListItemX extends com.truecaller.common.ui.listitem.ListItemX {
    public final android.widget.TextView z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FamilySharingListItemX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTopTitle(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        android.widget.TextView textView = this.z;
        gj.m.k0(textView, z);
        textView.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FamilySharingListItemX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FamilySharingListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.widget.TextView textView = new android.widget.TextView(context, null, 2132083521);
        this.z = textView;
        textView.setId(android.view.View.generateViewId());
        textView.setVisibility(8);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setLetterSpacing(0.0333f);
        textView.setTextColor(bi3.a.s(context, 2130970935));
        textView.setTextSize(2, 10.0f);
        addView(textView);
        d6.j jVar = new d6.j();
        jVar.e(this);
        jVar.g(textView.getId(), 7, getLxBinding().b.getId(), 6);
        jVar.g(textView.getId(), 4, getLxBinding().h.getId(), 3);
        jVar.g(textView.getId(), 6, getLxBinding().h.getId(), 6);
        jVar.g(textView.getId(), 3, 2131362381, 3);
        jVar.j(textView.getId()).d.u = 0.0f;
        jVar.j(textView.getId()).d.R = 2;
        jVar.j(textView.getId()).d.S = 2;
        jVar.j(textView.getId()).d.T = -2;
        jVar.d(getLxBinding().h.getId(), 3);
        jVar.g(getLxBinding().h.getId(), 3, textView.getId(), 4);
        jVar.b(this);
    }

    public /* synthetic */ FamilySharingListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
