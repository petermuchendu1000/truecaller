package com.truecaller.acs.ui.widgets.avatar;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class AvatarView extends tz.j {
    public static final /* synthetic */ int s = 0;
    public boolean n;
    public final kotlin.Lazy o;
    public final com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext p;
    public kotlin.jvm.functions.Function0 q;
    public fz.bar r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/acs/ui/widgets/avatar/AvatarView$AvatarContext;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FACS", "PACS", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class AvatarContext {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[] $VALUES;
        public static final com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext FACS = new com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext("FACS", 0, 0);
        public static final com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext PACS = new com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext("PACS", 1, 1);
        private final int value;

        private static final /* synthetic */ com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[] $values() {
            return new com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[]{FACS, PACS};
        }

        static {
            com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private AvatarContext(java.lang.String str, int i, int i2) {
            this.value = i2;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext valueOf(java.lang.String str) {
            return (com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext) java.lang.Enum.valueOf(com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext.class, str);
        }

        public static com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[] values() {
            return (com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.truecaller.acs.ui.widgets.avatar.baz getViewModel() {
        return (com.truecaller.acs.ui.widgets.avatar.baz) this.o.getValue();
    }

    public static void i(com.truecaller.acs.ui.widgets.avatar.AvatarView avatarView) {
        com.truecaller.data.entity.HistoryEvent historyEvent;
        com.truecaller.acs.ui.widgets.avatar.baz viewModel = avatarView.getViewModel();
        if (viewModel != null && (historyEvent = (com.truecaller.data.entity.HistoryEvent) ((ig3.h2) viewModel.b.a).getValue()) != null) {
            fg3.h0.J(androidx.lifecycle.g1.l(viewModel), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new te1.g(viewModel, historyEvent, (df3.bar) null, 19), 3);
        }
        kotlin.jvm.functions.Function0 function0 = avatarView.q;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean getIgnoreLogDismiss() {
        return this.n;
    }

    @org.jetbrains.annotations.NotNull
    public final fz.bar getNavigator() {
        fz.bar barVar = this.r;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("navigator");
        throw null;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAvatarClickCallback() {
        return this.q;
    }

    public final void l(boolean z) {
        com.truecaller.acs.ui.widgets.avatar.baz viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.q = z;
            ig3.w1.F(new androidx.room.o(25, (ig3.h2) viewModel.b.a, new td1.f(viewModel, (df3.bar) null, 8)), androidx.lifecycle.g1.l(viewModel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        com.truecaller.analytics.common.acs.AcsAnalyticsContext acsAnalyticsContext;
        super/*p23.b*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setAvatarXPresenter(new w31.c(new u03.g0(context), 0));
        setOnClickListener(new pn0.a(this, 26));
        com.truecaller.acs.ui.widgets.avatar.baz viewModel = getViewModel();
        df3.bar barVar = null;
        if (viewModel != null) {
            com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext avatarContext = this.p;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarContext, "avatarContext");
            a71.a aVar = viewModel.f;
            int i = com.truecaller.acs.ui.widgets.avatar.bar.a[avatarContext.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    acsAnalyticsContext = com.truecaller.analytics.common.acs.AcsAnalyticsContext.PACS;
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                acsAnalyticsContext = com.truecaller.analytics.common.acs.AcsAnalyticsContext.FACS;
            }
            aVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsAnalyticsContext, "analyticsContext");
            aVar.f = acsAnalyticsContext;
            ig3.w1.F(new androidx.room.o(25, (ig3.h2) viewModel.b.a, new td1.f(viewModel, (df3.bar) null, 8)), androidx.lifecycle.g1.l(viewModel));
        }
        gj.m.Y(this, new tz.g(this, barVar, 1));
        gj.m.Y(this, new tz.g(this, barVar, 0));
    }

    public final void setIgnoreLogDismiss(boolean z) {
        this.n = z;
    }

    public final void setNavigator(@org.jetbrains.annotations.NotNull fz.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.r = barVar;
    }

    public final void setOnAvatarClickCallback(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.q = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.o = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 7));
        com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext avatarContext = com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext.FACS;
        this.p = avatarContext;
        int[] iArr = com.truecaller.acs.R$styleable.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "AvatarView");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.p = ((com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[]) com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext.getEntries().toArray(new com.truecaller.acs.ui.widgets.avatar.AvatarView.AvatarContext[0]))[obtainStyledAttributes.getInt(0, avatarContext.getValue())];
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ AvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
