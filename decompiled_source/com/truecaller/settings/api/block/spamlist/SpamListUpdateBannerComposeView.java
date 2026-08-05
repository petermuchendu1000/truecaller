package com.truecaller.settings.api.block.spamlist;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SpamListUpdateBannerComposeView extends k4.bar {
    public static final /* synthetic */ int m = 0;
    public kotlin.jvm.functions.Function1 i;
    public kotlin.jvm.functions.Function0 j;
    public final ig3.h2 k;
    public final ig3.q1 l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerComposeView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(final int i, v2.n nVar) {
        int i2;
        boolean z;
        v2.h1 r;
        kotlin.jvm.functions.Function2 function2;
        nVar.b0(-1282662746);
        if (nVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            v2.t0 r2 = mf0.o.r(this.l, nVar, 0, 7);
            if (!((nq2.c) r2.getValue()).a && !((nq2.c) r2.getValue()).b) {
                r = nVar.r();
                if (r != null) {
                    final int i4 = 0;
                    function2 = new kotlin.jvm.functions.Function2(this, i, i4) { // from class: nq2.qux
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.truecaller.settings.api.block.spamlist.SpamListUpdateBannerComposeView b;

                        {
                            this.a = i4;
                            this.b = this;
                        }

                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            int i5 = this.a;
                            com.truecaller.settings.api.block.spamlist.SpamListUpdateBannerComposeView spamListUpdateBannerComposeView = this.b;
                            v2.n nVar2 = (v2.n) obj;
                            ((java.lang.Integer) obj2).getClass();
                            int i6 = com.truecaller.settings.api.block.spamlist.SpamListUpdateBannerComposeView.m;
                            switch (i5) {
                                case 0:
                                    spamListUpdateBannerComposeView.a(v2.f.D(1), nVar2);
                                    return kotlin.Unit.a;
                                default:
                                    spamListUpdateBannerComposeView.a(v2.f.D(1), nVar2);
                                    return kotlin.Unit.a;
                            }
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            yp.d0.o(false, d3.a.d(-290087934, new ji1.baz(27, this, r2), nVar), nVar, 48, 1);
        } else {
            nVar.S();
        }
        r = nVar.r();
        if (r != null) {
            final int i5 = 1;
            function2 = new kotlin.jvm.functions.Function2(this, i, i5) { // from class: nq2.qux
                public final /* synthetic */ int a;
                public final /* synthetic */ com.truecaller.settings.api.block.spamlist.SpamListUpdateBannerComposeView b;

                {
                    this.a = i5;
                    this.b = this;
                }

                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    int i52 = this.a;
                    com.truecaller.settings.api.block.spamlist.SpamListUpdateBannerComposeView spamListUpdateBannerComposeView = this.b;
                    v2.n nVar2 = (v2.n) obj;
                    ((java.lang.Integer) obj2).getClass();
                    int i6 = com.truecaller.settings.api.block.spamlist.SpamListUpdateBannerComposeView.m;
                    switch (i52) {
                        case 0:
                            spamListUpdateBannerComposeView.a(v2.f.D(1), nVar2);
                            return kotlin.Unit.a;
                        default:
                            spamListUpdateBannerComposeView.a(v2.f.D(1), nVar2);
                            return kotlin.Unit.a;
                    }
                }
            };
            r.d = function2;
        }
    }

    public void setBannerState(@org.jetbrains.annotations.NotNull nq2.c cVar) {
        ig3.h2 h2Var;
        java.lang.Object value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "spamProtectionUiState");
        do {
            h2Var = this.k;
            value = h2Var.getValue();
        } while (!h2Var.n(value, cVar));
    }

    public void setOnProtectionToggled(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onToggleProtection");
        this.i = function1;
    }

    public void setOnSyncSpamlistClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onUpdateClicked");
        this.j = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.i = new ms2.qux(25);
        this.j = new n10.b(9);
        ig3.h2 c = ig3.w1.c(new nq2.c(false, false, com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType.PACS));
        this.k = c;
        this.l = new ig3.q1(c);
        setViewCompositionStrategy(k4.r1.c);
    }

    public /* synthetic */ SpamListUpdateBannerComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
