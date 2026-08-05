package com.truecaller.bottombar;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BottomBarView extends uq.b implements nk0.c {
    public static final /* synthetic */ int j = 0;
    public ah.f g;
    public int h;
    public final android.util.SparseArray i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/bottombar/BottomBarView$BottomBarMenuItemId;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "CALLS", "MESSAGES", "BLOCKING", "FAMILY_PROTECTION_CONFIG", "PREMIUM", "ASSISTANT", "VOICEMAIL", "INVITE", "SCAM_FEED", "bottom-bar-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class BottomBarMenuItemId {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId[] $VALUES;
        private final int id;
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId CALLS = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("CALLS", 0, 2131361816);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId MESSAGES = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("MESSAGES", 1, 2131361819);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId BLOCKING = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("BLOCKING", 2, 2131361815);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId FAMILY_PROTECTION_CONFIG = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("FAMILY_PROTECTION_CONFIG", 3, 2131361817);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId PREMIUM = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("PREMIUM", 4, 2131361820);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId ASSISTANT = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("ASSISTANT", 5, 2131361814);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId VOICEMAIL = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("VOICEMAIL", 6, 2131361822);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId INVITE = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("INVITE", 7, 2131361818);
        public static final com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId SCAM_FEED = new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId("SCAM_FEED", 8, 2131361821);

        private static final /* synthetic */ com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId[] $values() {
            return new com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId[]{CALLS, MESSAGES, BLOCKING, FAMILY_PROTECTION_CONFIG, PREMIUM, ASSISTANT, VOICEMAIL, INVITE, SCAM_FEED};
        }

        static {
            com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private BottomBarMenuItemId(java.lang.String str, int i, int i2) {
            this.id = i2;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId valueOf(java.lang.String str) {
            return (com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId) java.lang.Enum.valueOf(com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId.class, str);
        }

        public static com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId[] values() {
            return (com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomBarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(qk.b1 b1Var, int i) {
        boolean z;
        android.view.ViewGroup viewGroup;
        uq.baz bazVar = ((com.google.android.material.navigation.a) this).b;
        rq.bar barVar = (rq.bar) ((mr.b) bazVar).s.get(i);
        int i2 = 0;
        if (b1Var.equals(nk0.bar.k)) {
            if (barVar != null) {
                mr.b.e(i);
                mr.b.e(i);
                android.view.ViewGroup[] viewGroupArr = ((mr.b) bazVar).f;
                if (viewGroupArr != null) {
                    int length = viewGroupArr.length;
                    while (i2 < length) {
                        viewGroup = viewGroupArr[i2];
                        if (viewGroup.getId() == i) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                viewGroup = null;
                if (viewGroup != null) {
                    android.widget.ImageView imageView = ((mr.qux) viewGroup).n;
                    if (((mr.qux) viewGroup).F != null) {
                        if (imageView != null) {
                            viewGroup.setClipChildren(true);
                            viewGroup.setClipToPadding(true);
                            rq.bar barVar2 = ((mr.qux) viewGroup).F;
                            if (barVar2 != null) {
                                if (barVar2.d() != null) {
                                    barVar2.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(barVar2);
                                }
                            }
                        }
                        ((mr.qux) viewGroup).F = null;
                    }
                }
                ((mr.b) bazVar).s.put(i, null);
                return;
            }
            return;
        }
        if (b1Var.equals(nk0.bar.j)) {
            if (barVar == null) {
                barVar = a(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "getOrCreateBadge(...)");
            }
            barVar.j(true);
            rq.baz bazVar2 = barVar.e;
            com.google.android.material.badge.BadgeState.State state = bazVar2.b;
            if (state.k != -1) {
                bazVar2.a.k = -1;
                state.k = -1;
                if (!bazVar2.a()) {
                    barVar.c.e = true;
                    barVar.h();
                    barVar.l();
                    barVar.invalidateSelf();
                }
            }
            barVar.i(bi3.a.s(getContext(), 2130970571));
            return;
        }
        if (b1Var instanceof nk0.a) {
            if (barVar == null) {
                barVar = a(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "getOrCreateBadge(...)");
            }
            rq.baz bazVar3 = barVar.e;
            int i3 = ((nk0.a) b1Var).j;
            if (i3 > 0) {
                z = true;
            } else {
                z = false;
            }
            barVar.j(z);
            int max = java.lang.Math.max(0, i3);
            com.google.android.material.badge.BadgeState.State state2 = bazVar3.b;
            com.google.android.material.badge.BadgeState.State state3 = bazVar3.a;
            if (state2.k != max) {
                state3.k = max;
                state2.k = max;
                if (!bazVar3.a()) {
                    barVar.c.e = true;
                    barVar.h();
                    barVar.l();
                    barVar.invalidateSelf();
                }
            }
            barVar.i(bi3.a.s(getContext(), 2130970634));
            if (i3 > 9) {
                if (i3 <= 99) {
                    i2 = bd.bar.q(2);
                } else {
                    i2 = bd.bar.q(4);
                }
            }
            state3.y = java.lang.Integer.valueOf(i2);
            bazVar3.b.y = java.lang.Integer.valueOf(i2);
            barVar.l();
            return;
        }
        if (b1Var instanceof nk0.b) {
            if (barVar == null) {
                barVar = a(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "getOrCreateBadge(...)");
            }
            barVar.j(true);
            rq.baz bazVar4 = barVar.e;
            com.google.android.material.badge.BadgeState.State state4 = bazVar4.b;
            if (state4.k != -1) {
                bazVar4.a.k = -1;
                state4.k = -1;
                if (!bazVar4.a()) {
                    barVar.c.e = true;
                    barVar.h();
                    barVar.l();
                    barVar.invalidateSelf();
                }
            }
            barVar.i(bi3.a.s(getContext(), 2130970571));
            return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // nk0.c
    @org.jetbrains.annotations.NotNull
    public com.truecaller.bottombar.BottomBarButtonType getCurrentButton() {
        return qk3.p.x(getSelectedItemId());
    }

    @org.jetbrains.annotations.NotNull
    public com.truecaller.bottombar.BottomBarView getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BottomBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [jr.k, java.lang.Object] */
    public BottomBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        ms.qux j2 = jr.i.j(getContext(), attributeSet, com.google.android.material.R.styleable.e, i, 2132084179, new int[0]);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) j2.c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        j2.A();
        jr.i.d(this, (jr.k) new java.lang.Object());
        this.h = -1;
        this.i = new android.util.SparseArray();
        setOnItemSelectedListener(new nk0.qux(this));
        setOnItemReselectedListener(new nk0.qux(this));
    }
}
