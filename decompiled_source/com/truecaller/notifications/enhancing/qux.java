package com.truecaller.notifications.enhancing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux extends androidx.recyclerview.widget.k2 {
    public final com.truecaller.common.ui.avatar.AvatarXView b;
    public final android.widget.ImageView c;
    public final android.widget.TextView d;
    public final android.widget.TextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.truecaller.common.ui.avatar.AvatarXView findViewById = view.findViewById(2131362392);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.b = findViewById;
        android.view.View findViewById2 = view.findViewById(2131362270);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.c = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131363124);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(2131362266);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.e = (android.widget.TextView) findViewById4;
    }
}
