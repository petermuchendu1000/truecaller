package com.truecaller.ui.settings.privacy.authorizedApps;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CustomRecyclerViewWithStates extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final ck2.bar s;
    public final d41.a t;
    public final d91.c u;
    public final d91.w v;
    public java.lang.String w;
    public java.lang.String x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomRecyclerViewWithStates(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131558955, (android.view.ViewGroup) this);
        int i2 = 2131363158;
        androidx.recyclerview.widget.RecyclerView o = df0.qux.o(2131363158, this);
        if (o != null) {
            i2 = 2131363646;
            android.view.View o2 = df0.qux.o(2131363646, this);
            if (o2 != null) {
                int i3 = 2131363644;
                android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131363644, o2);
                if (imageView != null) {
                    i3 = 2131363647;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131363647, o2);
                    if (textView != null) {
                        d91.c cVar = new d91.c((android.widget.LinearLayout) o2, imageView, textView, 1);
                        int i4 = 2131363694;
                        android.view.View o3 = df0.qux.o(2131363694, this);
                        if (o3 != null) {
                            int i5 = 2131363693;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131363693, o3);
                            if (imageView2 != null) {
                                i5 = 2131363695;
                                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131363695, o3);
                                if (textView2 != null) {
                                    i5 = 2131366153;
                                    com.google.android.material.button.MaterialButton o4 = df0.qux.o(2131366153, o3);
                                    if (o4 != null) {
                                        d41.a aVar = new d41.a((android.widget.LinearLayout) o3, imageView2, textView2, o4, 5);
                                        i4 = 2131365008;
                                        android.view.View o5 = df0.qux.o(2131365008, this);
                                        if (o5 != null) {
                                            if (((android.widget.ProgressBar) df0.qux.o(2131365848, o5)) != null) {
                                                d91.w wVar = new d91.w((android.widget.LinearLayout) o5, 1);
                                                ck2.bar barVar = new ck2.bar(this, o, cVar, aVar, wVar);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                                                this.s = barVar;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "errorLayout");
                                                this.t = aVar;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "emptyLayout");
                                                this.u = cVar;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wVar, "loadingLayout");
                                                this.v = wVar;
                                                this.w = "";
                                                this.x = "";
                                                android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.a, 0, 0);
                                                try {
                                                    java.lang.String string = obtainStyledAttributes.getString(3);
                                                    if (string == null) {
                                                        string = context.getString(2132017964);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                    }
                                                    setErrorText(string);
                                                    java.lang.String string2 = obtainStyledAttributes.getString(1);
                                                    if (string2 == null) {
                                                        string2 = context.getString(2132018933);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                                    }
                                                    setEmptyText(string2);
                                                    setErrorIcon(obtainStyledAttributes.getResourceId(2, 2131232942));
                                                    setEmptyIcon(obtainStyledAttributes.getResourceId(0, 2131232888));
                                                    obtainStyledAttributes.recycle();
                                                    return;
                                                } catch (java.lang.Throwable th) {
                                                    obtainStyledAttributes.recycle();
                                                    throw th;
                                                }
                                            }
                                            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o5.getResources().getResourceName(2131365848)));
                                        }
                                    }
                                }
                            }
                            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o3.getResources().getResourceName(i5)));
                        }
                        i2 = i4;
                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
                    }
                }
                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o2.getResources().getResourceName(i3)));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public final int getEmptyIcon() {
        return this.z;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmptyText() {
        return this.x;
    }

    public final int getErrorIcon() {
        return this.y;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorText() {
        return this.w;
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.s.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView, "contentLayout");
        return recyclerView;
    }

    public final void setEmptyIcon(int i) {
        this.z = i;
        ((android.widget.ImageView) this.u.c).setImageResource(i);
    }

    public final void setEmptyText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "value");
        this.x = str;
        ((android.widget.TextView) this.u.d).setText(str);
    }

    public final void setErrorIcon(int i) {
        this.y = i;
        ((android.widget.ImageView) this.t.c).setImageResource(i);
    }

    public final void setErrorText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "value");
        this.w = str;
        ((android.widget.TextView) this.t.d).setText(str);
    }

    public final void setOnRetryClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "callback");
        this.t.e.setOnClickListener(new be2.bar(11, function0));
    }

    public /* synthetic */ CustomRecyclerViewWithStates(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomRecyclerViewWithStates(android.content.Context context) {
        this(context, null, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomRecyclerViewWithStates(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }
}
