package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ExpandableEmojiTextView extends com.truecaller.android.truemoji.widget.EmojiTextView {
    public static final /* synthetic */ int w = 0;
    public com.truecaller.messaging.data.types.Message j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle n;
    public com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState o;
    public kotlin.jvm.functions.Function1 p;
    public final android.graphics.RectF q;
    public final android.graphics.Rect r;
    public final float s;
    public final int t;
    public final int u;
    public final int v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/messaging/conversation/ExpandableEmojiTextView$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class LayoutState {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState[] $VALUES;
        public static final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState EXPANDED = new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState("EXPANDED", 0);
        public static final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState COLLAPSED = new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState("COLLAPSED", 1);

        private static final /* synthetic */ com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState[] $values() {
            return new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState[]{EXPANDED, COLLAPSED};
        }

        static {
            com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private LayoutState(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState valueOf(java.lang.String str) {
            return (com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.class, str);
        }

        public static com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState[] values() {
            return (com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/messaging/conversation/ExpandableEmojiTextView$LayoutStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_MORE", "EXPANDABLE", "NORMAL", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class LayoutStyle {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle[] $VALUES;
        public static final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle SHOW_MORE = new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle("SHOW_MORE", 0);
        public static final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle EXPANDABLE = new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle("EXPANDABLE", 1);
        public static final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle NORMAL = new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle("NORMAL", 2);

        private static final /* synthetic */ com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle[] $values() {
            return new com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle[]{SHOW_MORE, EXPANDABLE, NORMAL};
        }

        static {
            com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private LayoutStyle(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle valueOf(java.lang.String str) {
            return (com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.class, str);
        }

        public static com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle[] values() {
            return (com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableEmojiTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.appcompat.widget.AppCompatTextView g(com.truecaller.messaging.conversation.ExpandableEmojiTextView expandableEmojiTextView, android.content.Context context) {
        float f;
        float dimension = expandableEmojiTextView.getResources().getDimension(2131166826);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context);
        appCompatTextView.setLayoutDirection(expandableEmojiTextView.getLayoutDirection());
        appCompatTextView.setText(2132021790);
        appCompatTextView.setTextAppearance(2132083246);
        appCompatTextView.setTextColor(expandableEmojiTextView.getTextColor());
        boolean z = false;
        appCompatTextView.setPaddingRelative((int) dimension, 0, 0, 0);
        appCompatTextView.measure(0, 0);
        appCompatTextView.layout(0, 0, appCompatTextView.getMeasuredWidth(), appCompatTextView.getMeasuredHeight());
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        if (expandableEmojiTextView.getLayoutDirection() == 1) {
            z = true;
        }
        android.graphics.Paint paint = paintDrawable.getPaint();
        if (z) {
            f = appCompatTextView.getMeasuredWidth();
        } else {
            f = 0.0f;
        }
        if (z) {
            dimension = appCompatTextView.getMeasuredWidth() - dimension;
        }
        paint.setShader(new android.graphics.LinearGradient(f, 0.0f, dimension, 0.0f, 0, expandableEmojiTextView.getBgColor(), android.graphics.Shader.TileMode.CLAMP));
        paintDrawable.setAutoMirrored(true);
        appCompatTextView.setBackground(paintDrawable);
        return appCompatTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getBgColor() {
        com.truecaller.messaging.data.types.Message message;
        com.truecaller.messaging.data.types.Message message2;
        com.truecaller.messaging.data.types.Message message3 = this.j;
        if (message3 != null && a.bar.N(message3)) {
            return bi3.a.s(getContext(), 2130970510);
        }
        com.truecaller.messaging.data.types.Message message4 = this.j;
        if (message4 != null && a.bar.I(message4) && (message2 = this.j) != null && message2.k == 2) {
            return bi3.a.s(getContext(), 2130970507);
        }
        com.truecaller.messaging.data.types.Message message5 = this.j;
        if (message5 != null && a.bar.I(message5) && (((message = this.j) != null && message.k == 0) || (message != null && message.k == 1))) {
            return bi3.a.s(getContext(), 2130970508);
        }
        return bi3.a.s(getContext(), 2130970509);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final android.graphics.RectF getCollapseButtonBounds() {
        int i;
        float f;
        float f2;
        int width;
        int i2 = 0;
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int height = getHeight();
        android.graphics.drawable.Drawable expandDrawable = getExpandDrawable();
        if (expandDrawable != null) {
            i = expandDrawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        int b = ((height - i) - t41.i.b(4.0f, getContext())) - getPaddingBottom();
        int i3 = this.t;
        float f3 = 0.0f;
        int i4 = this.u;
        if (z) {
            f2 = i4;
        } else {
            float width2 = getWidth();
            android.graphics.drawable.Drawable expandDrawable2 = getExpandDrawable();
            if (expandDrawable2 != null) {
                f = expandDrawable2.getIntrinsicWidth();
            } else {
                f = 0.0f;
            }
            f2 = (width2 - f) - i3;
        }
        float f4 = b;
        if (z) {
            android.graphics.drawable.Drawable expandDrawable3 = getExpandDrawable();
            if (expandDrawable3 != null) {
                i2 = expandDrawable3.getIntrinsicWidth();
            }
            width = i4 + i2;
        } else {
            width = getWidth() - i3;
        }
        float f5 = width;
        android.graphics.drawable.Drawable expandDrawable4 = getExpandDrawable();
        if (expandDrawable4 != null) {
            f3 = expandDrawable4.getIntrinsicHeight();
        }
        android.graphics.RectF rectF = this.q;
        rectF.set(f2, f4, f5, f3 + f4);
        return rectF;
    }

    private final android.graphics.drawable.Drawable getCollapseDrawable() {
        return (android.graphics.drawable.Drawable) this.k.getValue();
    }

    private final android.graphics.drawable.Drawable getExpandDrawable() {
        return (android.graphics.drawable.Drawable) this.l.getValue();
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
        android.graphics.RectF rectF = this.q;
        rectF.set(width, height, width2, height2);
        return rectF;
    }

    private final androidx.appcompat.widget.AppCompatTextView getShowMoreButton() {
        return (androidx.appcompat.widget.AppCompatTextView) this.m.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getTextColor() {
        com.truecaller.messaging.data.types.Message message;
        com.truecaller.messaging.data.types.Message message2;
        com.truecaller.messaging.data.types.Message message3 = this.j;
        if (message3 != null && a.bar.N(message3)) {
            return bi3.a.s(getContext(), 2130970528);
        }
        com.truecaller.messaging.data.types.Message message4 = this.j;
        if (message4 != null && a.bar.I(message4) && (message2 = this.j) != null && message2.k == 2) {
            return bi3.a.s(getContext(), 2130970525);
        }
        com.truecaller.messaging.data.types.Message message5 = this.j;
        if (message5 != null && a.bar.I(message5) && (((message = this.j) != null && message.k == 0) || (message != null && message.k == 1))) {
            return bi3.a.s(getContext(), 2130970526);
        }
        return bi3.a.s(getContext(), 2130970634);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setPaddingEnd(int i) {
        setPadding(getPaddingStart(), getPaddingTop(), i, getPaddingBottom());
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState getCurrentLayoutState() {
        return this.o;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle getCurrentLayoutStyle() {
        return this.n;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.messaging.data.types.Message getItem() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle, com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState, boolean z, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutState, "layoutState");
        this.n = layoutStyle;
        this.o = layoutState;
        int[] iArr = com.truecaller.messaging.conversation.bar.a;
        int i = iArr[layoutStyle.ordinal()];
        float f = this.s;
        int i2 = 3;
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new java.lang.RuntimeException();
            }
            setTextColor(i(true));
            setTextSize(0, f);
            setSingleLine(false);
            setEllipsize(null);
        } else {
            if (j()) {
                setTextColor(i(false));
                setEllipsize(android.text.TextUtils.TruncateAt.END);
                setSingleLine();
                setTextSize(0, (int) (12 * android.content.res.Resources.getSystem().getDisplayMetrics().scaledDensity));
            } else {
                setTextColor(i(true));
                setEllipsize(null);
                setSingleLine(false);
                setTextSize(0, f);
            }
            int q = bd.bar.q(12);
            com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle2 = this.n;
            com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle3 = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.EXPANDABLE;
            int i3 = this.t;
            if (layoutStyle2 == layoutStyle3) {
                setPaddingEnd(q + i3);
            } else {
                setPaddingEnd(i3);
            }
        }
        int i4 = iArr[this.n.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new java.lang.RuntimeException();
                }
                i2 = Integer.MAX_VALUE;
            }
            setMaxLines(i2);
            if (num != null) {
                setMaxLines(num.intValue());
            }
            if (z) {
                setTextColor(i(true));
                setTextSize(0, f);
                setSingleLine(false);
                setEllipsize(null);
                this.o = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED;
            }
            if (this.o == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED) {
                int minWidth = getMinWidth();
                int i5 = this.v;
                if (minWidth > i5) {
                    setMinWidth(i5);
                    requestLayout();
                    invalidate();
                }
            }
            if (this.n == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.SHOW_MORE) {
                int minWidth2 = getMinWidth();
                int paddingEnd = getPaddingEnd() + getPaddingStart() + getShowMoreButton().getMeasuredWidth();
                if (minWidth2 < paddingEnd) {
                    minWidth2 = paddingEnd;
                }
                setMinWidth(minWidth2);
                requestLayout();
            }
            invalidate();
        }
        if (j()) {
            i2 = 1;
            setMaxLines(i2);
            if (num != null) {
            }
            if (z) {
            }
            if (this.o == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED) {
            }
            if (this.n == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.SHOW_MORE) {
            }
            invalidate();
        }
        i2 = Integer.MAX_VALUE;
        setMaxLines(i2);
        if (num != null) {
        }
        if (z) {
        }
        if (this.o == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED) {
        }
        if (this.n == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.SHOW_MORE) {
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i(boolean z) {
        com.truecaller.messaging.data.types.Message message = this.j;
        if (message != null && a.bar.E(message) && z) {
            return bi3.a.s(getContext(), 2130970931);
        }
        com.truecaller.messaging.data.types.Message message2 = this.j;
        if (message2 != null && a.bar.E(message2)) {
            return bi3.a.s(getContext(), 2130970935);
        }
        return getTextColor();
    }

    public final boolean j() {
        if (this.o == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.COLLAPSED) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        if (getMaxLines() > 0 && getLayout().getLineCount() > getMaxLines() && this.n == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.SHOW_MORE && j()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.TextView*/.onAttachedToWindow();
        int b = t41.i.b(20.0f, getContext());
        com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle = this.n;
        com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle2 = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.EXPANDABLE;
        int i = this.t;
        if (layoutStyle == layoutStyle2) {
            setPaddingEnd(b + i);
        } else {
            setPaddingEnd(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super/*android.widget.TextView*/.onDraw(canvas);
        int i = com.truecaller.messaging.conversation.bar.a[this.n.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.RuntimeException();
                }
                return;
            } else {
                if (j() && k()) {
                    canvas.save();
                    android.graphics.RectF showMoreBounds = getShowMoreBounds();
                    canvas.translate(showMoreBounds.left, showMoreBounds.top);
                    getShowMoreButton().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        canvas.save();
        android.graphics.RectF collapseButtonBounds = getCollapseButtonBounds();
        android.graphics.Rect rect = this.r;
        collapseButtonBounds.round(rect);
        if (j()) {
            android.graphics.drawable.Drawable expandDrawable = getExpandDrawable();
            if (expandDrawable != null) {
                expandDrawable.setBounds(rect);
            }
            android.graphics.drawable.Drawable expandDrawable2 = getExpandDrawable();
            if (expandDrawable2 != null) {
                expandDrawable2.draw(canvas);
            }
        } else {
            android.graphics.drawable.Drawable collapseDrawable = getCollapseDrawable();
            if (collapseDrawable != null) {
                collapseDrawable.setBounds(rect);
            }
            android.graphics.drawable.Drawable collapseDrawable2 = getCollapseDrawable();
            if (collapseDrawable2 != null) {
                collapseDrawable2.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        int i = com.truecaller.messaging.conversation.bar.a[this.n.ordinal()];
        if (i != 1) {
            if (i == 2 && k() && getShowMoreBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.NORMAL;
                    com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED;
                    h(layoutStyle, layoutState, false, null);
                    kotlin.jvm.functions.Function1 function1 = this.p;
                    if (function1 != null) {
                        function1.invoke(layoutState);
                        return true;
                    }
                }
                return true;
            }
            return super/*android.widget.TextView*/.onTouchEvent(motionEvent);
        }
        android.graphics.RectF collapseButtonBounds = getCollapseButtonBounds();
        float b = t41.i.b(16.0f, getContext());
        collapseButtonBounds.left -= b;
        collapseButtonBounds.top -= b;
        collapseButtonBounds.right += b;
        collapseButtonBounds.bottom += b;
        if (collapseButtonBounds.contains(motionEvent.getX(), motionEvent.getY())) {
            if (motionEvent.getAction() == 1) {
                if (j()) {
                    com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle2 = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.EXPANDABLE;
                    com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState2 = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED;
                    h(layoutStyle2, layoutState2, false, null);
                    kotlin.jvm.functions.Function1 function12 = this.p;
                    if (function12 != null) {
                        function12.invoke(layoutState2);
                        return true;
                    }
                } else {
                    com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle3 = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.EXPANDABLE;
                    com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState3 = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.COLLAPSED;
                    h(layoutStyle3, layoutState3, false, null);
                    kotlin.jvm.functions.Function1 function13 = this.p;
                    if (function13 != null) {
                        function13.invoke(layoutState3);
                    }
                }
            }
            return true;
        }
        return super/*android.widget.TextView*/.onTouchEvent(motionEvent);
    }

    public final void setItem(@org.jetbrains.annotations.Nullable com.truecaller.messaging.data.types.Message message) {
        this.j = message;
    }

    public final void setOnResizeClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        this.p = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableEmojiTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableEmojiTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.k = kotlin.LazyKt.lazy(new o10.f(context, 2));
        this.l = kotlin.LazyKt.lazy(new o10.f(context, 3));
        this.m = kotlin.LazyKt.lazy(new ob2.baz(9, this, context));
        this.n = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.NORMAL;
        this.o = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED;
        this.q = new android.graphics.RectF();
        this.r = new android.graphics.Rect();
        this.s = getTextSize();
        this.t = getPaddingEnd();
        this.u = getPaddingStart();
        this.v = getWidth();
    }

    public /* synthetic */ ExpandableEmojiTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
