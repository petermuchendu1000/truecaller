package com.truecaller.common.ui.listitem;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class ListItemX extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public java.lang.String v;
    public boolean w;
    public final d41.qux x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/common/ui/listitem/ListItemX$Action;", "", "drawableResId", "", "<init>", "(Ljava/lang/String;II)V", "getDrawableResId", "()I", "CALL", "MESSAGE", "INFO", "FLASH", "SIM_ONE", "SIM_TWO", "PROFILE", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final class Action {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.common.ui.listitem.ListItemX.Action[] $VALUES;
        private final int drawableResId;
        public static final com.truecaller.common.ui.listitem.ListItemX.Action CALL = new com.truecaller.common.ui.listitem.ListItemX.Action("CALL", 0, 2131233333);
        public static final com.truecaller.common.ui.listitem.ListItemX.Action MESSAGE = new com.truecaller.common.ui.listitem.ListItemX.Action("MESSAGE", 1, 2131233363);
        public static final com.truecaller.common.ui.listitem.ListItemX.Action INFO = new com.truecaller.common.ui.listitem.ListItemX.Action("INFO", 2, 2131233361);
        public static final com.truecaller.common.ui.listitem.ListItemX.Action FLASH = new com.truecaller.common.ui.listitem.ListItemX.Action("FLASH", 3, 2131233359);
        public static final com.truecaller.common.ui.listitem.ListItemX.Action SIM_ONE = new com.truecaller.common.ui.listitem.ListItemX.Action("SIM_ONE", 4, 2131233350);
        public static final com.truecaller.common.ui.listitem.ListItemX.Action SIM_TWO = new com.truecaller.common.ui.listitem.ListItemX.Action("SIM_TWO", 5, 2131233352);
        public static final com.truecaller.common.ui.listitem.ListItemX.Action PROFILE = new com.truecaller.common.ui.listitem.ListItemX.Action("PROFILE", 6, 2131232076);

        private static final /* synthetic */ com.truecaller.common.ui.listitem.ListItemX.Action[] $values() {
            return new com.truecaller.common.ui.listitem.ListItemX.Action[]{CALL, MESSAGE, INFO, FLASH, SIM_ONE, SIM_TWO, PROFILE};
        }

        static {
            com.truecaller.common.ui.listitem.ListItemX.Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private Action(java.lang.String str, int i, int i2) {
            this.drawableResId = i2;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.common.ui.listitem.ListItemX.Action valueOf(java.lang.String str) {
            return (com.truecaller.common.ui.listitem.ListItemX.Action) java.lang.Enum.valueOf(com.truecaller.common.ui.listitem.ListItemX.Action.class, str);
        }

        public static com.truecaller.common.ui.listitem.ListItemX.Action[] values() {
            return (com.truecaller.common.ui.listitem.ListItemX.Action[]) $VALUES.clone();
        }

        public final int getDrawableResId() {
            return this.drawableResId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/common/ui/listitem/ListItemX$SubtitleColor;", "", "textColorAttr", "", "textColorBoldAttr", "iconColorAttr", "iconColorBoldAttr", "<init>", "(Ljava/lang/String;IIIII)V", "getTextColorAttr", "()I", "getTextColorBoldAttr", "getIconColorAttr", "getIconColorBoldAttr", "DEFAULT", "BLUE", "RED", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final class SubtitleColor {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.common.ui.listitem.ListItemX.SubtitleColor[] $VALUES;
        private final int iconColorAttr;
        private final int iconColorBoldAttr;
        private final int textColorAttr;
        private final int textColorBoldAttr;
        public static final com.truecaller.common.ui.listitem.ListItemX.SubtitleColor DEFAULT = new com.truecaller.common.ui.listitem.ListItemX.SubtitleColor("DEFAULT", 0, 2130970935, 2130970931, 2130970936, 2130970935);
        public static final com.truecaller.common.ui.listitem.ListItemX.SubtitleColor BLUE = new com.truecaller.common.ui.listitem.ListItemX.SubtitleColor("BLUE", 1, 2130970634, 2130970634, 2130970634, 2130970634);
        public static final com.truecaller.common.ui.listitem.ListItemX.SubtitleColor RED = new com.truecaller.common.ui.listitem.ListItemX.SubtitleColor("RED", 2, 2130970571, 2130970571, 2130970571, 2130970571);

        private static final /* synthetic */ com.truecaller.common.ui.listitem.ListItemX.SubtitleColor[] $values() {
            return new com.truecaller.common.ui.listitem.ListItemX.SubtitleColor[]{DEFAULT, BLUE, RED};
        }

        static {
            com.truecaller.common.ui.listitem.ListItemX.SubtitleColor[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private SubtitleColor(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
            this.textColorAttr = i2;
            this.textColorBoldAttr = i3;
            this.iconColorAttr = i4;
            this.iconColorBoldAttr = i5;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.common.ui.listitem.ListItemX.SubtitleColor valueOf(java.lang.String str) {
            return (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) java.lang.Enum.valueOf(com.truecaller.common.ui.listitem.ListItemX.SubtitleColor.class, str);
        }

        public static com.truecaller.common.ui.listitem.ListItemX.SubtitleColor[] values() {
            return (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor[]) $VALUES.clone();
        }

        public final int getIconColorAttr() {
            return this.iconColorAttr;
        }

        public final int getIconColorBoldAttr() {
            return this.iconColorBoldAttr;
        }

        public final int getTextColorAttr() {
            return this.textColorAttr;
        }

        public final int getTextColorBoldAttr() {
            return this.textColorBoldAttr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void H(com.truecaller.common.ui.listitem.ListItemX listItemX, com.truecaller.common.ui.listitem.ListItemX.Action action) {
        int i;
        if (action != null) {
            listItemX.getClass();
            i = action.getDrawableResId();
        } else {
            i = 0;
        }
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = listItemX.x.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "actionMain");
        listItemX.G(appCompatImageView, i, 0, null);
    }

    public static /* synthetic */ void J(com.truecaller.common.ui.listitem.ListItemX listItemX, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        listItemX.I(i, z);
    }

    public static void K(com.truecaller.common.ui.listitem.ListItemX listItemX, java.lang.CharSequence charSequence, com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor2, int i, int i2, boolean z, java.lang.Integer num, java.util.List list, int i3) {
        boolean z2;
        int F;
        int F2;
        java.lang.String str;
        if ((i3 & 2) != 0) {
            subtitleColor = com.truecaller.common.ui.listitem.ListItemX.SubtitleColor.DEFAULT;
        }
        if ((i3 & 4) != 0) {
            drawable = null;
        }
        if ((i3 & 8) != 0) {
            drawable2 = null;
        }
        if ((i3 & 16) != 0) {
            subtitleColor2 = subtitleColor;
        }
        if ((i3 & 64) != 0) {
            i = 0;
        }
        if ((i3 & com.ctc.wstx.cfg.OutputConfigFlags.CFG_AUTOMATIC_END_ELEMENTS) != 0) {
            i2 = 0;
        }
        if ((i3 & 256) != 0) {
            z = false;
        }
        if ((i3 & 512) != 0) {
            num = null;
        }
        if ((i3 & 2048) != 0) {
            list = null;
        }
        listItemX.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitleColor, "color");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitleColor2, "firstIconColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitleColor, "secondIconColor");
        com.truecaller.android.truemoji.widget.EmojiTextView emojiTextView = listItemX.x.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emojiTextView, "subtitle");
        if (charSequence.length() <= 0 && drawable == null && drawable2 == null && ((str = listItemX.v) == null || str.length() == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        gj.m.k0(emojiTextView, z2);
        emojiTextView.setTextColor(listItemX.U(subtitleColor, z));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emojiTextView, "subtitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emojiTextView, "<this>");
        if (num != null) {
            emojiTextView.setTypeface(android.graphics.Typeface.create(emojiTextView.getResources().getString(num.intValue()), 0));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emojiTextView, "subtitle");
        fj.a.h(emojiTextView, z);
        android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder().append(charSequence);
        kotlin.jvm.internal.Intrinsics.d(append);
        int brandColorBlue = listItemX.getBrandColorBlue();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = emojiTextView.getPaint().getFontMetricsInt();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "getFontMetricsInt(...)");
        i41.b bVar = new i41.b(append, brandColorBlue, fontMetricsInt);
        bVar.d = drawable;
        bVar.e = drawable2;
        if (z) {
            F = listItemX.F(subtitleColor2.getIconColorBoldAttr());
        } else if (!z) {
            F = listItemX.F(subtitleColor2.getIconColorAttr());
        } else {
            throw new java.lang.RuntimeException();
        }
        bVar.f = java.lang.Integer.valueOf(F);
        if (z) {
            F2 = listItemX.F(subtitleColor.getIconColorBoldAttr());
        } else if (!z) {
            F2 = listItemX.F(subtitleColor.getIconColorAttr());
        } else {
            throw new java.lang.RuntimeException();
        }
        bVar.g = java.lang.Integer.valueOf(F2);
        bVar.h = i;
        bVar.i = i2;
        if (list == null) {
            list = kotlin.collections.h0.a;
        }
        bVar.j = list;
        emojiTextView.setText(bVar.a());
        listItemX.N(listItemX.v, subtitleColor, z);
    }

    public static /* synthetic */ void Q(com.truecaller.common.ui.listitem.ListItemX listItemX, java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        listItemX.P(i, i2, charSequence);
    }

    private final int getBrandColorBlue() {
        return ((java.lang.Number) this.u.getValue()).intValue();
    }

    private final android.graphics.drawable.Drawable getTrueBadgeDrawable() {
        return (android.graphics.drawable.Drawable) this.s.getValue();
    }

    private final android.graphics.drawable.Drawable getVerifiedCheckDrawable() {
        return (android.graphics.drawable.Drawable) this.t.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int F(int i) {
        return bi3.a.s(getContext(), i);
    }

    public final void G(android.widget.ImageView imageView, int i, int i2, kotlin.jvm.functions.Function1 function1) {
        boolean z;
        boolean z2 = false;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(imageView, z);
        imageView.setImageResource(i);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
        aq2.g gVar = null;
        if (i2 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            bi3.a.C(imageView, F(i2));
        }
        if (function1 != null) {
            gVar = new aq2.g(11, function1);
        }
        imageView.setOnClickListener(gVar);
        if (function1 != null) {
            z2 = true;
        }
        imageView.setClickable(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(int i, boolean z) {
        z31.baz bazVar;
        if (z) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bazVar = new z31.baz(context, 6128);
            if (i == 0) {
                bazVar.d.b = true;
                bazVar.invalidateSelf();
            } else {
                bazVar.a(i);
            }
        } else {
            bazVar = null;
        }
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.x.b;
        gj.m.k0(appCompatImageView, z);
        appCompatImageView.setImageDrawable(bazVar);
        appCompatImageView.setOnClickListener(null);
        appCompatImageView.setClickable(false);
        appCompatImageView.setBackground(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(android.graphics.drawable.Drawable drawable, java.lang.Integer num) {
        if (num != null && drawable != null) {
            drawable.setTint(bi3.a.s(getContext(), num.intValue()));
        }
        com.truecaller.android.truemoji.widget.EmojiTextView emojiTextView = this.x.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emojiTextView, "subtitle");
        ge0.i.S(emojiTextView, drawable, (android.graphics.drawable.Drawable) null, 14);
    }

    public final void N(java.lang.String str, com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor, boolean z) {
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitleColor, "color");
        this.v = str;
        d41.qux quxVar = this.x;
        com.truecaller.android.truemoji.widget.EmojiTextView emojiTextView = quxVar.f;
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = quxVar.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emojiTextView, "subtitle");
        com.truecaller.android.truemoji.widget.EmojiTextView emojiTextView2 = quxVar.f;
        java.lang.CharSequence text = emojiTextView2.getText();
        boolean z3 = false;
        if ((text != null && text.length() != 0) || (str != null && str.length() != 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        gj.m.k0(emojiTextView, z2);
        appCompatTextView.setTextColor(U(subtitleColor, z));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "timestamp");
        fj.a.h(appCompatTextView, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "timestamp");
        if (str == null || str.length() == 0) {
            z3 = true;
        }
        gj.m.k0(appCompatTextView, !z3);
        java.lang.CharSequence text2 = emojiTextView2.getText();
        if (text2 != null && text2.length() != 0 && this.w) {
            str = k9.d.q(" · ", str);
        }
        appCompatTextView.setText(str);
    }

    public final void P(int i, int i2, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "title");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = this.x.h;
        appCompatTextView.setText(fj.a.t(getBrandColorBlue(), i, i2, charSequence));
        appCompatTextView.setTypeface(android.graphics.Typeface.create("sans-serif-medium", 0));
    }

    public final void R(android.graphics.drawable.Drawable drawable, java.lang.Integer num) {
        boolean z;
        d41.qux quxVar = this.x;
        quxVar.i.setImageDrawable(drawable);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = quxVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "titleExtraIcon");
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(appCompatImageView, z);
        if (num != null) {
            appCompatImageView.getLayoutParams().width = num.intValue();
        }
    }

    public final void S(boolean z) {
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = this.x.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "title");
        android.graphics.drawable.Drawable trueBadgeDrawable = getTrueBadgeDrawable();
        if (!z) {
            trueBadgeDrawable = null;
        }
        ge0.i.S(appCompatTextView, (android.graphics.drawable.Drawable) null, trueBadgeDrawable, 11);
    }

    public final void T() {
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = this.x.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "title");
        ge0.i.S(appCompatTextView, (android.graphics.drawable.Drawable) null, getVerifiedCheckDrawable(), 11);
    }

    public final int U(com.truecaller.common.ui.listitem.ListItemX.SubtitleColor subtitleColor, boolean z) {
        if (z) {
            return F(subtitleColor.getTextColorBoldAttr());
        }
        if (!z) {
            return F(subtitleColor.getTextColorAttr());
        }
        throw new java.lang.RuntimeException();
    }

    @org.jetbrains.annotations.NotNull
    public final d41.qux getLxBinding() {
        return this.x;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getSubTitle() {
        return this.x.f.getText();
    }

    @org.jetbrains.annotations.NotNull
    public final android.graphics.Paint.FontMetricsInt getSubtitleFontMetrics() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.x.f.getPaint().getFontMetricsInt();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "getFontMetricsInt(...)");
        return fontMetricsInt;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getTitle() {
        return this.x.h.getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        setBackgroundResource(2131231290);
        setPaddingRelative(0, 0, getResources().getDimensionPixelSize(2131165973), 0);
    }

    public final void setActionButtonEnabled(boolean z) {
        this.x.b.setEnabled(z);
    }

    public final void setAvailabilityPresenter(@org.jetbrains.annotations.NotNull hg2.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "presenter");
        this.x.d.setPresenter(barVar);
    }

    public final void setAvatarPresenter(@org.jetbrains.annotations.NotNull w31.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "presenter");
        d41.qux quxVar = this.x;
        quxVar.e.setVisibility(0);
        quxVar.e.setPresenter(cVar);
    }

    public final void setOnAvatarClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        this.x.e.setOnClickListener(new aq2.g(10, function1));
    }

    public final void setOnAvatarLongClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        this.x.e.setOnLongClickListener(new aw2.c(function1, 5));
    }

    public final void setShowTimeStampDivider(boolean z) {
        this.w = z;
    }

    public final void setSubTitlePrefix(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "prefix");
        android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder().append((java.lang.CharSequence) str).append(getSubTitle());
        kotlin.jvm.internal.Intrinsics.d(append);
        K(this, append, null, null, null, null, 0, 0, false, null, null, 4094);
    }

    public final void setTitleIcon(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = this.x.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "title");
        ge0.i.S(appCompatTextView, (android.graphics.drawable.Drawable) null, drawable, 11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAvailabilityPresenter(@org.jetbrains.annotations.NotNull hg2.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "presenter");
        this.x.d.setPresenter(quxVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        setClickable(true);
        setFocusable(true);
        setClipChildren(false);
        this.s = kotlin.LazyKt.lazy(new be.x(context, 19));
        this.t = kotlin.LazyKt.lazy(new be.x(context, 20));
        this.u = kotlin.LazyKt.lazy(new h40.b(this, 26));
        this.w = true;
        android.view.LayoutInflater.from(context).inflate(2131560003, (android.view.ViewGroup) this);
        int i2 = 2131362025;
        androidx.appcompat.widget.AppCompatImageView o = df0.qux.o(2131362025, this);
        if (o != null) {
            i2 = 2131362063;
            androidx.appcompat.widget.AppCompatImageView o2 = df0.qux.o(2131362063, this);
            if (o2 != null) {
                i2 = 2131362374;
                com.truecaller.presence.ui.AvailabilityXView o3 = df0.qux.o(2131362374, this);
                if (o3 != null) {
                    i2 = 2131362381;
                    com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.common.ui.avatar.AvatarXView) df0.qux.o(2131362381, this);
                    if (avatarXView != null) {
                        i2 = 2131366692;
                        com.truecaller.android.truemoji.widget.EmojiTextView o4 = df0.qux.o(2131366692, this);
                        if (o4 != null) {
                            i2 = 2131367012;
                            androidx.appcompat.widget.AppCompatTextView o5 = df0.qux.o(2131367012, this);
                            if (o5 != null) {
                                i2 = 2131367033;
                                androidx.appcompat.widget.AppCompatTextView o6 = df0.qux.o(2131367033, this);
                                if (o6 != null) {
                                    i2 = 2131367053;
                                    androidx.appcompat.widget.AppCompatImageView o7 = df0.qux.o(2131367053, this);
                                    if (o7 != null) {
                                        d41.qux quxVar = new d41.qux(this, o, o2, o3, avatarXView, o4, o5, o6, o7);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quxVar, "inflate(...)");
                                        this.x = quxVar;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ ListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
