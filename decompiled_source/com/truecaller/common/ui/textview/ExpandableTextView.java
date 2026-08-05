package com.truecaller.common.ui.textview;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ExpandableTextView extends androidx.appcompat.widget.AppCompatTextView {
    public final kotlin.Lazy h;
    public com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle i;
    public com.truecaller.common.ui.textview.ExpandableTextView.LayoutState j;
    public kotlin.jvm.functions.Function1 k;
    public final android.graphics.RectF l;
    public final float m;
    public final int n;
    public final int o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/common/ui/textview/ExpandableTextView$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final class LayoutState {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.common.ui.textview.ExpandableTextView.LayoutState[] $VALUES;
        public static final com.truecaller.common.ui.textview.ExpandableTextView.LayoutState EXPANDED = new com.truecaller.common.ui.textview.ExpandableTextView.LayoutState("EXPANDED", 0);
        public static final com.truecaller.common.ui.textview.ExpandableTextView.LayoutState COLLAPSED = new com.truecaller.common.ui.textview.ExpandableTextView.LayoutState("COLLAPSED", 1);

        private static final /* synthetic */ com.truecaller.common.ui.textview.ExpandableTextView.LayoutState[] $values() {
            return new com.truecaller.common.ui.textview.ExpandableTextView.LayoutState[]{EXPANDED, COLLAPSED};
        }

        static {
            com.truecaller.common.ui.textview.ExpandableTextView.LayoutState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private LayoutState(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.common.ui.textview.ExpandableTextView.LayoutState valueOf(java.lang.String str) {
            return (com.truecaller.common.ui.textview.ExpandableTextView.LayoutState) java.lang.Enum.valueOf(com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.class, str);
        }

        public static com.truecaller.common.ui.textview.ExpandableTextView.LayoutState[] values() {
            return (com.truecaller.common.ui.textview.ExpandableTextView.LayoutState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/common/ui/textview/ExpandableTextView$LayoutStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_MORE", "NORMAL", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final class LayoutStyle {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle[] $VALUES;
        public static final com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle SHOW_MORE = new com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle("SHOW_MORE", 0);
        public static final com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle NORMAL = new com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle("NORMAL", 1);

        private static final /* synthetic */ com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle[] $values() {
            return new com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle[]{SHOW_MORE, NORMAL};
        }

        static {
            com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private LayoutStyle(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle valueOf(java.lang.String str) {
            return (com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle) java.lang.Enum.valueOf(com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.class, str);
        }

        public static com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle[] values() {
            return (com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.appcompat.widget.AppCompatTextView g(android.content.Context context, com.truecaller.common.ui.textview.ExpandableTextView expandableTextView) {
        float f;
        float b = t41.i.b(24.0f, context);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context);
        appCompatTextView.setLayoutDirection(expandableTextView.getLayoutDirection());
        appCompatTextView.setText(2132020426);
        appCompatTextView.setTextColor(expandableTextView.getTextColor());
        boolean z = false;
        appCompatTextView.setPaddingRelative((int) b, 0, 0, 0);
        appCompatTextView.measure(0, 0);
        appCompatTextView.layout(0, 0, appCompatTextView.getMeasuredWidth(), appCompatTextView.getMeasuredHeight());
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        if (expandableTextView.getLayoutDirection() == 1) {
            z = true;
        }
        android.graphics.Paint paint = paintDrawable.getPaint();
        if (z) {
            f = appCompatTextView.getMeasuredWidth();
        } else {
            f = 0.0f;
        }
        if (z) {
            b = appCompatTextView.getMeasuredWidth() - b;
        }
        paint.setShader(new android.graphics.LinearGradient(f, 0.0f, b, 0.0f, 0, bi3.a.s(context, 2130970615), android.graphics.Shader.TileMode.CLAMP));
        paintDrawable.setAutoMirrored(true);
        appCompatTextView.setBackground(paintDrawable);
        return appCompatTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getExpandTextColor() {
        return bi3.a.s(getContext(), 2130970931);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final android.graphics.RectF getShowMoreBounds() {
        float width;
        int width2;
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            width = getPaddingStart();
        } else {
            width = (getWidth() - getShowMoreButton().getMeasuredWidth()) - getPaddingEnd();
        }
        float height = (getHeight() - getShowMoreButton().getMeasuredHeight()) - getPaddingBottom();
        if (z) {
            width2 = getShowMoreButton().getMeasuredWidth();
        } else {
            width2 = getWidth() - getPaddingEnd();
        }
        float height2 = getHeight();
        android.graphics.RectF rectF = this.l;
        rectF.set(width, height, width2, height2);
        return rectF;
    }

    private final androidx.appcompat.widget.AppCompatTextView getShowMoreButton() {
        return (androidx.appcompat.widget.AppCompatTextView) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getTextColor() {
        return bi3.a.s(getContext(), 2130970935);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setPaddingEnd(int i) {
        setPadding(getPaddingStart(), getPaddingTop(), i, getPaddingBottom());
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.ui.textview.ExpandableTextView.LayoutState getCurrentLayoutState() {
        return this.j;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle getCurrentLayoutStyle() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle layoutStyle, com.truecaller.common.ui.textview.ExpandableTextView.LayoutState layoutState, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutState, "layoutState");
        this.i = layoutStyle;
        this.j = layoutState;
        int[] iArr = com.truecaller.common.ui.textview.bar.a;
        int i = iArr[layoutStyle.ordinal()];
        int i2 = 2;
        if (i != 1 && i != 2) {
            throw new java.lang.RuntimeException();
        }
        setTextColor(getExpandTextColor());
        setTextSize(0, this.m);
        setSingleLine(false);
        setEllipsize(null);
        int i3 = iArr[this.i.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i2 = Integer.MAX_VALUE;
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        setMaxLines(i2);
        if (num != null) {
            setMaxLines(num.intValue());
        }
        if (this.i == com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.SHOW_MORE && this.j == com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.COLLAPSED) {
            setMinWidth(java.lang.Math.max(getMinWidth(), getPaddingEnd() + getPaddingStart() + getShowMoreButton().getMeasuredWidth()));
            requestLayout();
        } else if (this.j == com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.EXPANDED) {
            int minWidth = getMinWidth();
            int i4 = this.o;
            if (minWidth > i4) {
                setMinWidth(i4);
                requestLayout();
            }
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        if (getMaxLines() > 0 && getLayout().getLineCount() > getMaxLines() && this.i == com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.SHOW_MORE && this.j == com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.COLLAPSED) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        setPaddingEnd(t41.i.b(16.0f, getContext()) + this.n);
        super/*android.widget.TextView*/.onDraw(canvas);
        int i = com.truecaller.common.ui.textview.bar.a[this.i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.RuntimeException();
            }
        } else {
            if (this.j != com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.COLLAPSED || !i()) {
                return;
            }
            canvas.save();
            android.graphics.RectF showMoreBounds = getShowMoreBounds();
            canvas.translate(showMoreBounds.left, showMoreBounds.top);
            getShowMoreButton().draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (com.truecaller.common.ui.textview.bar.a[this.i.ordinal()] == 1 && i() && getShowMoreBounds().contains(motionEvent.getX(), motionEvent.getY())) {
            if (motionEvent.getAction() == 1) {
                com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle layoutStyle = com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.NORMAL;
                com.truecaller.common.ui.textview.ExpandableTextView.LayoutState layoutState = com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.EXPANDED;
                h(layoutStyle, layoutState, null);
                kotlin.jvm.functions.Function1 function1 = this.k;
                if (function1 != null) {
                    function1.invoke(layoutState);
                }
            }
            return true;
        }
        return super/*android.widget.TextView*/.onTouchEvent(motionEvent);
    }

    public final void setOnResizeClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.truecaller.common.ui.textview.ExpandableTextView.LayoutState, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        this.k = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.h = kotlin.LazyKt.lazy(new q52.l(12, context, this));
        this.i = com.truecaller.common.ui.textview.ExpandableTextView.LayoutStyle.NORMAL;
        this.j = com.truecaller.common.ui.textview.ExpandableTextView.LayoutState.EXPANDED;
        this.l = new android.graphics.RectF();
        this.m = getTextSize();
        this.n = getPaddingEnd();
        getPaddingStart();
        this.o = getWidth();
    }

    public /* synthetic */ ExpandableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
