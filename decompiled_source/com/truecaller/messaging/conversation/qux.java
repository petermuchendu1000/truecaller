package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux extends androidx.recyclerview.widget.k2 implements com.truecaller.messaging.conversation.baz, android.view.ViewTreeObserver.OnPreDrawListener {
    public java.lang.String A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final int F;
    public final int G;
    public final kotlin.Lazy H;
    public final w31.c I;
    public java.lang.String J;
    public final int K;
    public final float L;
    public final int M;
    public final int N;
    public float O;
    public final kotlin.Lazy P;
    public final kotlin.Lazy Q;
    public android.animation.ValueAnimator R;
    public final kotlin.Lazy S;
    public boolean T;
    public android.text.SpannableStringBuilder U;
    public final u6.i V;
    public final android.app.Activity W;
    public fg3.o1 X;
    public java.lang.Object Y;
    public h12.bar Z;
    public final t02.h b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final androidx.appcompat.widget.AppCompatTextView y;
    public java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(android.view.View view, t02.h hVar) {
        super(view);
        android.app.Activity activity;
        android.content.ContextWrapper contextWrapper;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "itemView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "listener");
        this.b = hVar;
        this.c = gj.m.I(2131363172, view);
        this.d = gj.m.I(2131363167, view);
        this.e = gj.m.I(2131363165, view);
        this.f = gj.m.I(2131366374, view);
        this.g = gj.m.I(2131366373, view);
        this.h = gj.m.I(2131362702, view);
        this.i = gj.m.I(2131364002, view);
        this.j = gj.m.I(2131365328, view);
        this.k = gj.m.I(2131367563, view);
        this.l = gj.m.I(2131362093, view);
        this.m = gj.m.I(2131365985, view);
        this.n = gj.m.I(2131362880, view);
        this.o = gj.m.I(2131366886, view);
        this.p = gj.m.I(2131362515, view);
        this.q = gj.m.I(2131362516, view);
        this.r = gj.m.I(2131364965, view);
        this.s = gj.m.I(2131367016, view);
        this.t = gj.m.I(2131364021, view);
        this.u = gj.m.I(2131366904, view);
        this.v = gj.m.I(2131365923, view);
        this.w = gj.m.I(2131367322, view);
        this.x = gj.m.I(2131362347, view);
        this.y = new androidx.appcompat.widget.AppCompatTextView(new android.view.ContextThemeWrapper(view.getContext(), 2132084712));
        this.B = true;
        this.C = true;
        this.F = bi3.a.s(view.getContext(), 2130970607);
        this.G = view.getContext().getColor(2131101944);
        this.H = kotlin.LazyKt.lazy(new o00.qux(view, 6));
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.I = new w31.c(new u03.g0(context), 0);
        this.K = view.getResources().getDimensionPixelOffset(2131166426);
        this.L = view.getResources().getDimension(2131166699);
        this.M = view.getResources().getDimensionPixelSize(2131166764);
        int q = bd.bar.q(8);
        view.getContext().getResources().getDimensionPixelSize(2131166698);
        this.N = (((q * 2) + t41.i.e(14.0f, view.getContext())) * 2) + bd.bar.q(20) + q;
        this.P = kotlin.LazyKt.lazy(new p02.i4(view, this));
        this.Q = kotlin.LazyKt.lazy(new p02.i4(this, view));
        this.S = kotlin.LazyKt.lazy(new o00.qux(view, 7));
        u6.i iVar = new u6.i(view.getContext(), new android.view.GestureDetector.SimpleOnGestureListener());
        ((android.view.GestureDetector) iVar.a).setOnDoubleTapListener(new p02.o4(this));
        this.V = iVar;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "<this>");
        while (!(context2 instanceof android.app.Activity)) {
            if (context2 instanceof android.content.ContextWrapper) {
                contextWrapper = (android.content.ContextWrapper) context2;
            } else {
                contextWrapper = null;
            }
            if (contextWrapper == null || (context2 = contextWrapper.getBaseContext()) == null) {
                activity = null;
                break;
            }
        }
        activity = (android.app.Activity) context2;
        this.W = activity;
        com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.common.ui.avatar.AvatarXView) this.g.getValue();
        if (avatarXView != null) {
            avatarXView.setPresenter(this.I);
        }
        com.truecaller.android.truemoji.widget.EmojiTextView y = y();
        if (y != null) {
            y.setMovementMethod((i13.a) this.P.getValue());
        }
        android.widget.TextView textView = (android.widget.TextView) this.u.getValue();
        if (textView != null) {
            android.content.Context context3 = view.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textView.setText(ak.r0.j(2132017849, context3));
        }
        view.addOnAttachStateChangeListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n(this, 4));
    }

    public static void L(androidx.appcompat.widget.AppCompatImageView appCompatImageView) {
        appCompatImageView.setBackground(appCompatImageView.getContext().getDrawable(2131234491));
        appCompatImageView.setBackgroundTintList(bi3.a.t(2130970767, appCompatImageView.getContext()));
        appCompatImageView.setImageTintList(bi3.a.t(2130970549, appCompatImageView.getContext()));
    }

    public static void X(android.view.View view, boolean z) {
        int i;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static void a0(android.view.View view, boolean z) {
        X(view.findViewById(2131367569), z);
        X(view.findViewById(2131363586), z);
        boolean z2 = !z;
        X(view.findViewById(2131367570), z2);
        X(view.findViewById(2131366652), z2);
    }

    public static final void n(com.truecaller.messaging.conversation.qux quxVar, boolean z, android.view.View view) {
        int i;
        quxVar.getClass();
        android.view.View findViewById = view.findViewById(2131363586);
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        findViewById.setVisibility(i);
        X(view.findViewById(2131363582), !z);
    }

    public static java.lang.String p(java.lang.String str) {
        if (!kotlin.text.y.w(str, "https://", true) && !kotlin.text.y.w(str, "http://", false)) {
            return "http://".concat(str);
        }
        return str;
    }

    public final android.widget.LinearLayout A() {
        return (android.widget.LinearLayout) this.m.getValue();
    }

    public final void B(int i, android.widget.TextView textView, java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        int T = kotlin.text.StringsKt.T(0, textView.getText().toString(), str, true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(T);
        if (T == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            spannableString.setSpan(new android.text.style.BackgroundColorSpan(i), intValue, str.length() + intValue, 33);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.G), intValue, str.length() + intValue, 33);
            textView.setText(spannableString);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.truecaller.messaging.conversation.ExpandableEmojiTextView, android.view.View] */
    public final void C() {
        com.truecaller.android.truemoji.widget.EmojiTextView y = y();
        if (y != null && (y instanceof com.truecaller.messaging.conversation.ExpandableEmojiTextView)) {
            ?? r0 = (com.truecaller.messaging.conversation.ExpandableEmojiTextView) y;
            if (r0.j() && r0.getCurrentLayoutStyle() == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.EXPANDABLE) {
                r0.setTag(java.lang.Long.valueOf(getItemId()));
                com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle = r0.n;
                com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState = com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED;
                r0.h(layoutStyle, layoutState, false, Integer.MAX_VALUE);
                kotlin.jvm.functions.Function1 function1 = r0.p;
                if (function1 != null) {
                    function1.invoke(layoutState);
                    return;
                }
                return;
            }
            int adapterPosition = getAdapterPosition();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(adapterPosition);
            if (adapterPosition == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                ((t02.qux) this.b).v(valueOf.intValue());
            }
        }
    }

    public final void D(int i) {
        com.truecaller.messaging.data.types.Message message;
        java.lang.String imId;
        int adapterPosition = getAdapterPosition();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(adapterPosition);
        com.truecaller.messaging.data.types.Mention mention = null;
        if (adapterPosition == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            t02.qux quxVar = (t02.qux) this.b;
            c22.qux item = quxVar.e.getItem(intValue);
            if (item instanceof com.truecaller.messaging.data.types.Message) {
                message = (com.truecaller.messaging.data.types.Message) item;
            } else {
                message = null;
            }
            if (message != null) {
                com.truecaller.messaging.data.types.Mention[] mentionArr = message.p;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mentionArr, "mentions");
                int length = mentionArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    com.truecaller.messaging.data.types.Mention mention2 = mentionArr[i2];
                    if (mention2.getOffset() == i + 1) {
                        mention = mention2;
                        break;
                    }
                    i2++;
                }
                if (mention != null && (imId = mention.getImId()) != null) {
                    quxVar.f.i0(imId);
                }
            }
        }
    }

    public final java.util.ArrayList E() {
        android.view.ViewGroup viewGroup;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup w = w();
        if (w != null) {
            kotlin.collections.m0 it = uf3.p.l(0, w.getChildCount()).iterator();
            while (((uf3.h) it).c) {
                java.lang.Object tag = w.getChildAt(it.nextInt()).getTag();
                kotlin.jvm.internal.Intrinsics.e(tag, "null cannot be cast to non-null type com.truecaller.messaging.conversation.viewcache.ViewHolder");
                arrayList.add((v12.b) tag);
            }
            w.removeAllViews();
        }
        android.view.ViewGroup z = z();
        if (z != null && (viewGroup = (android.view.ViewGroup) z.findViewById(2131366515)) != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
            java.lang.Object tag2 = viewGroup.getTag();
            if (tag2 != null && (tag2 instanceof java.util.List)) {
                list = (java.util.List) tag2;
            } else {
                list = kotlin.collections.h0.a;
            }
            arrayList.addAll(list);
            viewGroup.setTag(null);
        }
        return arrayList;
    }

    public final void F() {
        zx1.bar barVar;
        this.T = false;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.l.getValue();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        G(0.0f);
        com.truecaller.android.truemoji.widget.EmojiTextView y = y();
        if (y != null) {
            y.setTextIsSelectable(false);
            y.setCustomSelectionActionModeCallback((android.view.ActionMode.Callback) null);
        }
        com.truecaller.android.truemoji.widget.EmojiTextView y2 = y();
        if (y2 != null) {
            y2.setOnTouchListener(null);
        }
        com.truecaller.android.truemoji.widget.EmojiTextView y3 = y();
        if (y3 != null) {
            if (this.U == null || (barVar = (zx1.bar) this.Q.getValue()) == null) {
                barVar = (i13.a) this.P.getValue();
            }
            y3.setMovementMethod(barVar);
        }
    }

    public final void G(float f) {
        float f2;
        java.lang.Object obj;
        float f3;
        float f4;
        java.lang.Object obj2;
        android.animation.ValueAnimator valueAnimator = this.R;
        java.lang.Float f5 = null;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            f2 = ((java.lang.Float) animatedValue).floatValue();
        } else {
            this.R = null;
            f2 = f;
        }
        boolean z = false;
        if (getItemViewType() == 2131367518) {
            kotlin.Lazy lazy = this.S;
            float floatValue = ((java.lang.Number) lazy.getValue()).floatValue() * f2;
            android.view.View view = ((androidx.recyclerview.widget.k2) this).itemView;
            kotlin.jvm.internal.Intrinsics.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            int childCount = ((android.view.ViewGroup) view).getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View view2 = ((androidx.recyclerview.widget.k2) this).itemView;
                kotlin.jvm.internal.Intrinsics.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.View childAt = ((android.view.ViewGroup) view2).getChildAt(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt.getId() != 2131362880 && childAt.getId() != 2131362093 && childAt.getId() != 2131365985) {
                    childAt.setTranslationX(floatValue);
                }
            }
            android.widget.LinearLayout A = A();
            if (A != null) {
                if (f == 0.0f) {
                    android.widget.LinearLayout A2 = A();
                    if (A2 != null) {
                        obj2 = A2.getTag();
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof java.lang.Float) {
                        f5 = (java.lang.Float) obj2;
                    }
                    if (f5 != null) {
                        f4 = f5.floatValue();
                    } else {
                        f4 = 0.0f;
                    }
                } else {
                    float floatValue2 = ((java.lang.Number) lazy.getValue()).floatValue() * f2;
                    android.widget.LinearLayout A3 = A();
                    if (A3 != null) {
                        obj = A3.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof java.lang.Float) {
                        f5 = (java.lang.Float) obj;
                    }
                    if (f5 != null) {
                        f3 = f5.floatValue();
                    } else {
                        f3 = 0.0f;
                    }
                    f4 = floatValue2 + f3;
                }
                A.setTranslationX(f4);
            }
        }
        kotlin.Lazy lazy2 = this.n;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) lazy2.getValue();
        if (f2 > 0.0f) {
            z = true;
        }
        X(checkBox, z);
        android.widget.CheckBox checkBox2 = (android.widget.CheckBox) lazy2.getValue();
        if (checkBox2 != null) {
            checkBox2.setAlpha(f2);
        }
        android.view.View view3 = (android.view.View) this.i.getValue();
        if (view3 != null) {
            view3.setAlpha(1.0f - f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(android.view.View view, p02.b bVar) {
        int i;
        com.truecaller.ui.view.TintedTextView findViewById;
        int i2;
        androidx.appcompat.widget.AppCompatImageView findViewById2 = view.findViewById(2131364521);
        boolean z = bVar.o;
        boolean z2 = bVar.m;
        boolean z3 = bVar.l;
        com.truecaller.messaging.data.types.Entity entity = bVar.d;
        com.truecaller.messaging.conversation.AttachmentType attachmentType = bVar.b;
        int i3 = 0;
        if (z) {
            findViewById2.setImageResource(2131232187);
            view.setOnClickListener(null);
        } else {
            int i4 = 1;
            if (bVar.p) {
                if (bVar.n) {
                    i2 = 2131232188;
                } else {
                    i2 = 2131232186;
                }
                findViewById2.setImageResource(i2);
                view.setOnClickListener(new p02.g4(this, bVar, i4));
            } else {
                if (attachmentType == com.truecaller.messaging.conversation.AttachmentType.VCARD) {
                    kotlin.jvm.internal.Intrinsics.e(entity, "null cannot be cast to non-null type com.truecaller.messaging.data.types.VCardEntity");
                    com.truecaller.messaging.data.types.VCardEntity vCardEntity = (com.truecaller.messaging.data.types.VCardEntity) entity;
                    int i5 = vCardEntity.x;
                    android.net.Uri uri = vCardEntity.y;
                    androidx.appcompat.widget.AppCompatImageView findViewById3 = view.findViewById(2131364521);
                    if (uri != null) {
                        android.net.Uri uri2 = android.net.Uri.EMPTY;
                        if (!kotlin.jvm.internal.Intrinsics.b(uri, uri2)) {
                            kotlin.jvm.internal.Intrinsics.d(findViewById3);
                            if (uri != null) {
                                uri2 = uri;
                            }
                            kotlin.jvm.internal.Intrinsics.d(uri2);
                            findViewById3.setImageDrawable((android.graphics.drawable.Drawable) null);
                            findViewById3.clearColorFilter();
                            findViewById3.setBackground(null);
                            findViewById3.setBackgroundTintList(null);
                            findViewById3.setImageTintList(null);
                            findViewById3.invalidate();
                            com.bumptech.glide.baz.e(((androidx.recyclerview.widget.k2) this).itemView.getContext()).o(uri2).f().i(wf.g.e).j(2131232190).P(findViewById3);
                            if (!z3 && !bVar.I) {
                                findViewById = view.findViewById(2131366227);
                                if (findViewById != null) {
                                    X(findViewById, true);
                                    X(view.findViewById(2131363542), true);
                                    java.lang.CharSequence quantityText = ((androidx.recyclerview.widget.k2) this).itemView.getResources().getQuantityText(2131886092, i5);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quantityText, "getQuantityText(...)");
                                    android.graphics.drawable.Drawable drawable = ((androidx.recyclerview.widget.k2) this).itemView.getContext().getDrawable(2131233376);
                                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                                    kotlin.jvm.internal.Intrinsics.d(drawable);
                                    android.graphics.drawable.Drawable mutate = drawable.mutate();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
                                    bi3.a.n(mutate, spannableStringBuilder, java.lang.Integer.valueOf(bi3.a.s(((androidx.recyclerview.widget.k2) this).itemView.getContext(), 2130970634)), (android.graphics.Paint.FontMetricsInt) null, true);
                                    spannableStringBuilder.append((java.lang.CharSequence) "  ");
                                    spannableStringBuilder.append(quantityText);
                                    spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(16, true), 0, spannableStringBuilder.length(), 33);
                                    findViewById.setText(spannableStringBuilder);
                                }
                                if (uri != null || kotlin.jvm.internal.Intrinsics.b(uri, android.net.Uri.EMPTY)) {
                                    kotlin.jvm.internal.Intrinsics.d(findViewById3);
                                    L(findViewById3);
                                }
                            }
                        }
                    }
                    if (i5 > 1) {
                        i = 2131232191;
                    } else {
                        i = attachmentType.icon;
                    }
                    findViewById3.setImageResource(i);
                    if (!z3) {
                        findViewById = view.findViewById(2131366227);
                        if (findViewById != null) {
                        }
                        if (uri != null) {
                        }
                        kotlin.jvm.internal.Intrinsics.d(findViewById3);
                        L(findViewById3);
                    }
                } else {
                    androidx.appcompat.widget.AppCompatImageView findViewById4 = view.findViewById(2131364521);
                    if (!z3) {
                        com.truecaller.ui.view.TintedTextView findViewById5 = view.findViewById(2131366227);
                        if (findViewById5 != null && gj.m.H(findViewById5)) {
                            findViewById5.setVisibility(8);
                            X(view.findViewById(2131363542), false);
                        }
                        kotlin.jvm.internal.Intrinsics.d(findViewById4);
                        L(findViewById4);
                    }
                    findViewById4.setImageResource(attachmentType.icon);
                }
                view.setOnClickListener(new p02.g4(this, bVar, 2));
            }
        }
        if (z2) {
            i3 = 4;
        }
        findViewById2.setVisibility(i3);
        android.view.View findViewById6 = view.findViewById(2131362349);
        if (findViewById6 != null) {
            X(findViewById6, z2);
        }
    }

    public final void I(android.view.View view, p02.b bVar) {
        android.view.View findViewById = view.findViewById(2131363165);
        if (findViewById != null) {
            android.content.res.Resources resources = ((androidx.recyclerview.widget.k2) this).itemView.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            findViewById.setBackground(new op0.bar(resources, bVar.s, bVar.u, bVar.J));
        }
    }

    public final void J() {
        android.view.ViewGroup x = x();
        if (x != null) {
            x.setBackgroundColor(((androidx.recyclerview.widget.k2) this).itemView.getContext().getColor(android.R.color.transparent));
        }
        android.view.ViewGroup x2 = x();
        if (x2 != null) {
            x2.setPaddingRelative(0, 0, 0, 0);
        }
        android.view.ViewGroup z = z();
        if (z != null) {
            z.setBackgroundColor(((androidx.recyclerview.widget.k2) this).itemView.getContext().getColor(android.R.color.transparent));
        }
        android.view.ViewGroup z2 = z();
        if (z2 != null) {
            z2.setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(java.lang.String str, boolean z, boolean z2, boolean z3, com.truecaller.messaging.conversation.GoogleAttribution googleAttribution, com.truecaller.messaging.data.types.Mention[] mentionArr, android.text.SpannableStringBuilder spannableStringBuilder, boolean z4) {
        android.text.SpannableStringBuilder spannableStringBuilder2;
        com.truecaller.android.truemoji.widget.EmojiTextView y;
        android.view.ViewGroup z5;
        com.truecaller.android.truemoji.widget.EmojiTextView y2;
        com.truecaller.android.truemoji.widget.EmojiTextView y3;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "contents");
        fg3.o1 o1Var = this.X;
        if (o1Var != null) {
            o1Var.cancel((java.util.concurrent.CancellationException) null);
        }
        this.X = null;
        java.lang.Object obj = new java.lang.Object();
        this.Y = obj;
        com.truecaller.android.truemoji.widget.EmojiTextView y4 = y();
        if (y4 != null) {
            if (!z) {
                y4.setText(str);
            } else if (z4) {
                android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder(str);
                spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(bi3.a.s(y4.getContext(), 2130970936)), 0, str.length(), 0);
                y4.setText(spannableStringBuilder3);
            } else {
                int bindingAdapterPosition = getBindingAdapterPosition();
                android.content.Context context = y4.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                a23.f fVar = new a23.f(this, obj, bindingAdapterPosition, y4, z2, googleAttribution);
                spannableStringBuilder2 = spannableStringBuilder;
                this.X = this.b.c(context, str, spannableStringBuilder2, googleAttribution, mentionArr, fVar);
                y = y();
                if (y != null && (viewTreeObserver2 = y.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnPreDrawListener(this);
                }
                if (z3 && (y3 = y()) != null && (viewTreeObserver = y3.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(this);
                }
                this.U = spannableStringBuilder2;
                if (spannableStringBuilder2 != null && (y2 = y()) != null) {
                    y2.setMovementMethod((zx1.bar) this.Q.getValue());
                }
                z5 = z();
                if (z5 == null) {
                    Q(new p02.e4(this, 10), z5);
                    return;
                }
                return;
            }
        }
        spannableStringBuilder2 = spannableStringBuilder;
        y = y();
        if (y != null) {
            viewTreeObserver2.removeOnPreDrawListener(this);
        }
        if (z3) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        this.U = spannableStringBuilder2;
        if (spannableStringBuilder2 != null) {
            y2.setMovementMethod((zx1.bar) this.Q.getValue());
        }
        z5 = z();
        if (z5 == null) {
        }
    }

    public final void M(int i, boolean z, boolean z2) {
        android.widget.TextView textView;
        int i2;
        int i3;
        android.view.ViewGroup w = w();
        if ((w == null || (textView = (android.widget.TextView) w.findViewById(2131367414)) == null) && (textView = (android.widget.TextView) ((androidx.recyclerview.widget.k2) this).itemView.findViewById(2131367414)) == null) {
            return;
        }
        X(textView, z);
        textView.setTextColor(i);
        if (z2) {
            i2 = 2131231840;
        } else {
            i2 = 0;
        }
        textView.setBackgroundResource(i2);
        lf.bar.z(textView, android.content.res.ColorStateList.valueOf(i));
        int paddingLeft = textView.getPaddingLeft();
        int paddingTop = textView.getPaddingTop();
        int paddingRight = textView.getPaddingRight();
        android.content.res.Resources resources = textView.getResources();
        if (z2) {
            i3 = 2131166764;
        } else {
            i3 = 2131166749;
        }
        textView.setPadding(paddingLeft, paddingTop, paddingRight, (int) resources.getDimension(i3));
    }

    public final void N(float f) {
        this.O = f;
        androidx.constraintlayout.widget.Guideline findViewById = ((androidx.recyclerview.widget.k2) this).itemView.findViewById(2131364375);
        if (findViewById != null) {
            findViewById.setGuidelinePercent(f);
        }
        androidx.constraintlayout.widget.Guideline findViewById2 = ((androidx.recyclerview.widget.k2) this).itemView.findViewById(2131364376);
        if (findViewById2 != null) {
            findViewById2.setGuidelinePercent(1 - f);
        }
    }

    public final void O(android.view.View view, android.net.Uri uri, int i, int i2, p02.b bVar, boolean z) {
        java.lang.Object gradientTransformation;
        int max;
        wf.g gVar;
        android.widget.ImageView.ScaleType scaleType;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131364553);
        int color = view.getResources().getColor(2131100993);
        kotlin.jvm.internal.Intrinsics.d(imageView);
        imageView.setVisibility(0);
        if (z) {
            if (bVar.S) {
                scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = android.widget.ImageView.ScaleType.FIT_XY;
            }
            imageView.setScaleType(scaleType);
        }
        imageView.getLayoutParams().height = i2;
        imageView.requestLayout();
        android.content.Context context = imageView.getContext();
        if (bVar.z) {
            gradientTransformation = new com.truecaller.glide.transform.TintTransformation(color);
        } else {
            gradientTransformation = new com.truecaller.glide.transform.GradientTransformation();
        }
        java.util.List c = kotlin.collections.x.c(gradientTransformation);
        if (!bVar.p && !bVar.o && !bVar.n && !bVar.m) {
            max = i2;
        } else {
            max = java.lang.Math.max(i2, this.N);
        }
        kotlin.jvm.internal.Intrinsics.d(context);
        com.bumptech.glide.g q = com.bumptech.glide.baz.b(context).c(context).o(uri).s(new p02.s4(context, bVar.s, bVar.g, bVar.t, i, i2, bVar.K)).q(i, max);
        com.truecaller.messaging.data.types.Entity entity = bVar.d;
        if (entity != null && entity.getC()) {
            gVar = wf.g.d;
        } else {
            gVar = wf.g.e;
        }
        q.i(gVar).D(new uf.e(c), true).P(imageView);
        imageView.setTag(uri);
        b0();
    }

    public final void P(boolean z, boolean z2) {
        int i;
        X((android.widget.TextView) this.o.getValue(), z);
        if (z2) {
            i = ((java.lang.Number) this.H.getValue()).intValue();
        } else {
            i = 0;
        }
        this.D = i;
        ((androidx.recyclerview.widget.k2) this).itemView.setBackgroundColor(k6.a.g(this.E, i));
    }

    public final void Q(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        view.setOnClickListener(new o10.qux(9, this, function1));
    }

    public final void R(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        view.setOnLongClickListener(new c73.r(5, this, function1));
    }

    public final void S(android.view.View view, p02.b bVar) {
        int i;
        android.graphics.drawable.Drawable drawable;
        int i2;
        android.view.View findViewById = view.findViewById(2131365014);
        boolean z = bVar.m;
        boolean z2 = bVar.l;
        com.truecaller.messaging.data.types.Entity entity = bVar.d;
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        android.view.View findViewById2 = view.findViewById(2131364584);
        if (bVar.o) {
            i3 = 0;
        }
        findViewById2.setVisibility(i3);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(2131361981);
        ((android.widget.TextView) view.findViewById(2131366652)).setText(bVar.y);
        if (bVar.p) {
            if (entity != null && entity.getV() && z2) {
                drawable = view.getContext().getDrawable(2131231627);
            } else if (entity != null && entity.getV() && !z2) {
                drawable = view.getContext().getDrawable(2131231624);
            } else {
                drawable = view.getContext().getDrawable(2131231623);
            }
            imageButton.setBackground(drawable);
            if (bVar.n) {
                i2 = 2131232188;
            } else {
                i2 = 2131232186;
            }
            imageButton.setImageResource(i2);
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new p02.g4(this, bVar, 12));
            return;
        }
        imageButton.setVisibility(4);
        imageButton.setOnClickListener(null);
    }

    public final void T(boolean z) {
        com.truecaller.messaging.conversation.MessageSnippetView messageSnippetView;
        android.view.ViewGroup w = w();
        if ((w == null || (messageSnippetView = (com.truecaller.messaging.conversation.MessageSnippetView) w.findViewById(2131367422)) == null) && (messageSnippetView = (com.truecaller.messaging.conversation.MessageSnippetView) ((androidx.recyclerview.widget.k2) this).itemView.findViewById(2131367422)) == null) {
            return;
        }
        X(messageSnippetView, z);
        messageSnippetView.setDismissActionVisible(false);
    }

    public final void U(com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle, com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState, com.truecaller.messaging.data.types.Message message, boolean z, boolean z2) {
        boolean z3;
        boolean q = this.b.q(message);
        android.widget.TextView textView = (android.widget.TextView) this.u.getValue();
        if (layoutStyle != com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle.NORMAL && q && ((layoutState == com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState.EXPANDED || z) && z2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        X(textView, z3);
    }

    public final void V(boolean z) {
        X((com.truecaller.android.truemoji.widget.EmojiTextView) this.f.getValue(), z);
        X((com.truecaller.common.ui.avatar.AvatarXView) this.g.getValue(), z);
    }

    public final void W(p02.b bVar, boolean z) {
        int i = bVar.q;
        int i2 = bVar.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "params");
        android.widget.TextView textView = (android.widget.TextView) this.s.getValue();
        if (textView != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "getFontMetricsInt(...)");
            textView.setText(u(bVar, fontMetricsInt, z));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
            textView.setTextColor(i2);
            android.graphics.drawable.Drawable drawable = textView.getCompoundDrawablesRelative()[0];
            if (drawable != null) {
                drawable.setTint(i2);
            }
        }
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = this.y;
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = appCompatTextView.getPaint().getFontMetricsInt();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fontMetricsInt2, "getFontMetricsInt(...)");
        appCompatTextView.setText(u(bVar, fontMetricsInt2, true));
        appCompatTextView.setTextColor(i2);
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final void Y(int i, java.lang.String str) {
        android.widget.TextView textView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "word");
        com.truecaller.android.truemoji.widget.EmojiTextView y = y();
        if (y != null) {
            B(i, y, str);
        }
        android.view.ViewGroup w = w();
        if (w != null && (textView = (android.widget.TextView) w.findViewById(2131367033)) != null) {
            B(i, textView, str);
        }
    }

    public final void Z(p02.b bVar, final com.truecaller.insights.feedbackrevamp.FeedbackCardType feedbackCardType, final t02.g gVar) {
        java.util.List list;
        final boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackCardType, "feedbackCardType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "actionListener");
        android.view.ViewGroup z2 = z();
        if (z2 != null) {
            final s12.qux quxVar = (s12.qux) bVar.a.a.a(106);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quxVar, "acquireFeedbackRevampCardViewHolder(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackCardType, "feedbackCardType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "listener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "attachmentParams");
            final com.truecaller.messaging.data.types.Message message = bVar.c;
            if (message != null) {
                d91.d dVar = quxVar.b;
                int i = s12.baz.a[feedbackCardType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ((android.widget.TextView) dVar.d).setText(2132021794);
                                ((android.widget.TextView) dVar.f).setText(2132019079);
                                ((android.widget.TextView) dVar.g).setText(2132021930);
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            ((android.widget.TextView) dVar.d).setText(2132021794);
                            ((android.widget.TextView) dVar.f).setText(2132021929);
                            ((android.widget.TextView) dVar.g).setText(2132021325);
                        }
                    } else {
                        ((android.widget.TextView) dVar.d).setText(2132021795);
                        ((android.widget.TextView) dVar.f).setText(2132019079);
                        ((android.widget.TextView) dVar.g).setText(2132021931);
                    }
                } else {
                    ((android.widget.TextView) dVar.d).setText(2132021795);
                    ((android.widget.TextView) dVar.f).setText(2132023476);
                    ((android.widget.TextView) dVar.g).setText(2132021325);
                }
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = dVar.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                gj.m.j0(constraintLayout);
                if (message.k == 2) {
                    z = true;
                } else {
                    z = false;
                }
                final int i2 = 0;
                ((android.widget.TextView) dVar.f).setOnClickListener(new android.view.View.OnClickListener(gVar, message, quxVar, feedbackCardType, z, i2) { // from class: s12.bar
                    public final /* synthetic */ int a;
                    public final /* synthetic */ t02.g b;
                    public final /* synthetic */ com.truecaller.messaging.data.types.Message c;
                    public final /* synthetic */ com.truecaller.insights.feedbackrevamp.FeedbackCardType d;
                    public final /* synthetic */ boolean e;

                    {
                        this.a = i2;
                        this.d = feedbackCardType;
                        this.e = z;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.truecaller.insights.feedbackrevamp.RevampFeedbackType revampFeedbackType;
                        com.truecaller.insights.feedbackrevamp.RevampFeedbackType revampFeedbackType2;
                        switch (this.a) {
                            case 0:
                                t02.g gVar2 = this.b;
                                if (gVar2 != null) {
                                    int i3 = s12.baz.a[this.d.ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 != 3) {
                                                if (i3 == 4) {
                                                    revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.PROMOTION_TO_PROMOTION;
                                                } else {
                                                    throw new java.lang.RuntimeException();
                                                }
                                            } else {
                                                revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_PROMOTION_TO_PROMOTION;
                                            }
                                        } else {
                                            revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.SPAM_TO_SPAM;
                                        }
                                    } else {
                                        revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_SPAM_TO_SPAM;
                                    }
                                    gVar2.M0(this.c, revampFeedbackType, this.e);
                                    return;
                                }
                                return;
                            default:
                                t02.g gVar3 = this.b;
                                if (gVar3 != null) {
                                    int i4 = s12.baz.a[this.d.ordinal()];
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            if (i4 != 3) {
                                                if (i4 == 4) {
                                                    revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.PROMOTION_TO_NOT_PROMOTION;
                                                } else {
                                                    throw new java.lang.RuntimeException();
                                                }
                                            } else {
                                                revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_PROMOTION_TO_NOT_PROMOTION;
                                            }
                                        } else {
                                            revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.SPAM_TO_NOT_SPAM;
                                        }
                                    } else {
                                        revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_SPAM_TO_NOT_SPAM;
                                    }
                                    gVar3.M0(this.c, revampFeedbackType2, this.e);
                                    return;
                                }
                                return;
                        }
                    }
                });
                final int i3 = 1;
                ((android.widget.TextView) dVar.g).setOnClickListener(new android.view.View.OnClickListener(gVar, message, quxVar, feedbackCardType, z, i3) { // from class: s12.bar
                    public final /* synthetic */ int a;
                    public final /* synthetic */ t02.g b;
                    public final /* synthetic */ com.truecaller.messaging.data.types.Message c;
                    public final /* synthetic */ com.truecaller.insights.feedbackrevamp.FeedbackCardType d;
                    public final /* synthetic */ boolean e;

                    {
                        this.a = i3;
                        this.d = feedbackCardType;
                        this.e = z;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.truecaller.insights.feedbackrevamp.RevampFeedbackType revampFeedbackType;
                        com.truecaller.insights.feedbackrevamp.RevampFeedbackType revampFeedbackType2;
                        switch (this.a) {
                            case 0:
                                t02.g gVar2 = this.b;
                                if (gVar2 != null) {
                                    int i33 = s12.baz.a[this.d.ordinal()];
                                    if (i33 != 1) {
                                        if (i33 != 2) {
                                            if (i33 != 3) {
                                                if (i33 == 4) {
                                                    revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.PROMOTION_TO_PROMOTION;
                                                } else {
                                                    throw new java.lang.RuntimeException();
                                                }
                                            } else {
                                                revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_PROMOTION_TO_PROMOTION;
                                            }
                                        } else {
                                            revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.SPAM_TO_SPAM;
                                        }
                                    } else {
                                        revampFeedbackType = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_SPAM_TO_SPAM;
                                    }
                                    gVar2.M0(this.c, revampFeedbackType, this.e);
                                    return;
                                }
                                return;
                            default:
                                t02.g gVar3 = this.b;
                                if (gVar3 != null) {
                                    int i4 = s12.baz.a[this.d.ordinal()];
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            if (i4 != 3) {
                                                if (i4 == 4) {
                                                    revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.PROMOTION_TO_NOT_PROMOTION;
                                                } else {
                                                    throw new java.lang.RuntimeException();
                                                }
                                            } else {
                                                revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_PROMOTION_TO_NOT_PROMOTION;
                                            }
                                        } else {
                                            revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.SPAM_TO_NOT_SPAM;
                                        }
                                    } else {
                                        revampFeedbackType2 = com.truecaller.insights.feedbackrevamp.RevampFeedbackType.NOT_SPAM_TO_NOT_SPAM;
                                    }
                                    gVar3.M0(this.c, revampFeedbackType2, this.e);
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((android.widget.ImageView) dVar.e).setOnClickListener(new lq1.a(gVar, message, z, 1));
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) z2.findViewById(2131366515);
            if (viewGroup != null) {
                viewGroup.addView(quxVar.a);
                X(viewGroup, true);
                java.lang.Object tag = viewGroup.getTag();
                if (tag != null && (tag instanceof java.util.List)) {
                    list = (java.util.List) tag;
                } else {
                    list = kotlin.collections.h0.a;
                }
                java.util.ArrayList I0 = kotlin.collections.CollectionsKt.I0(list);
                I0.add(quxVar);
                viewGroup.setTag(I0);
            }
        }
    }

    public final void b0() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup x = x();
        d6.a aVar = null;
        if (x != null) {
            layoutParams = x.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof d6.a) {
            aVar = (d6.a) layoutParams;
        }
        if (aVar != null) {
            ((android.view.ViewGroup.MarginLayoutParams) aVar).width = this.b.l(this.O);
            android.view.ViewGroup x2 = x();
            if (x2 != null) {
                x2.setLayoutParams(aVar);
            }
        }
    }

    public final void c0(com.truecaller.messaging.data.types.Message message) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.LinearLayout A = A();
        if (A != null) {
            android.widget.LinearLayout A2 = A();
            if (A2 != null) {
                layoutParams = A2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            d6.a aVar = (d6.a) layoutParams;
            aVar.k = 2131363165;
            if (a.bar.I(message)) {
                aVar.r = 2131363165;
            } else {
                aVar.p = 2131363165;
            }
            A.setLayoutParams(aVar);
        }
        if (!this.T || !a.bar.E(message)) {
            boolean E = a.bar.E(message);
            float f = this.L;
            if (!E || ((androidx.recyclerview.widget.k2) this).itemView.getResources().getConfiguration().getLayoutDirection() != 1) {
                if (a.bar.E(message)) {
                    f = -f;
                } else if (!a.bar.I(message)) {
                    f = 0.0f;
                }
            }
            android.widget.LinearLayout A3 = A();
            if (A3 != null) {
                A3.setTranslationX(f);
            }
            android.widget.LinearLayout A4 = A();
            if (A4 != null) {
                A4.setTag(java.lang.Float.valueOf(f));
            }
        }
    }

    public final void o(p02.b bVar, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "params");
        android.view.View view = (android.view.View) this.x.getValue();
        android.view.ViewGroup z = z();
        boolean z2 = false;
        if (z != null && gj.m.H(z)) {
            z2 = true;
        }
        X(view, z2);
        android.view.View view2 = bVar.a.a(bVar.l).a;
        t(view2, bVar, i, i2);
        H(view2, bVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.truecaller.android.truemoji.widget.EmojiTextView y = y();
        if (y != null) {
            y.getLayout();
            return true;
        }
        return true;
    }

    public final void q(android.net.Uri uri, int i, int i2, p02.b bVar, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "image");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "params");
        android.view.View view = bVar.a.b(bVar.l).a;
        I(view, bVar);
        android.view.View findViewById = view.findViewById(2131363586);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        gj.m.h0(findViewById);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        s(view);
        view.setOnClickListener(new p02.g4(this, bVar, 4));
        R(new p02.e4(this, 6), view);
        O(view, uri, i, i2, bVar, z);
        S(view, bVar);
    }

    public final void r(android.net.Uri uri, int i, int i2, p02.b bVar, boolean z) {
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "videoFrame");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "params");
        android.view.View view = bVar.a.b(bVar.l).a;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131363586);
        X(textView, true);
        textView.setTextColor(bVar.x);
        textView.setText(bVar.w);
        int i5 = 0;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(bVar.v, 0, 0, 0);
        I(view, bVar);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        s(view);
        R(new p02.e4(this, 4), view);
        O(view, uri, i, i2, bVar, z);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(2131361981);
        boolean z2 = bVar.o;
        boolean z3 = bVar.m;
        boolean z4 = bVar.D;
        if (z2) {
            imageButton.setImageResource(2131232187);
            view.setOnClickListener(null);
        } else if (bVar.p) {
            if (bVar.n) {
                i4 = 2131232188;
            } else {
                i4 = 2131232186;
            }
            imageButton.setImageResource(i4);
            imageButton.setOnClickListener(new p02.g4(this, bVar, 7));
            view.setOnClickListener(new p02.g4(this, bVar, 8));
        } else if (z4) {
            if (bVar.E) {
                i3 = 2131232444;
            } else {
                i3 = 0;
            }
            imageButton.setImageResource(i3);
            imageButton.setOnClickListener(new p02.g4(this, bVar, 9));
            view.setOnClickListener(null);
        } else {
            imageButton.setImageResource(2131232983);
            imageButton.setOnClickListener(new p02.g4(this, bVar, 10));
            view.setOnClickListener(new p02.g4(this, bVar, 11));
        }
        ((android.widget.TextView) view.findViewById(2131366652)).setText(bVar.y);
        if (!z3) {
            imageButton.setVisibility(0);
        } else {
            imageButton.setVisibility(4);
            imageButton.setOnClickListener(null);
        }
        com.truecaller.ui.components.CyclicProgressBar findViewById = view.findViewById(2131365014);
        if (!z3 && !z4) {
            i5 = 4;
        }
        findViewById.setVisibility(i5);
    }

    public final void s(android.view.View view) {
        android.view.ViewGroup w = w();
        if (w != null) {
            w.addView(view);
            if (w.getChildCount() > 1) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = this.K;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void t(android.view.View view, p02.b bVar, int i, int i2) {
        java.lang.String str;
        int i3;
        I(view, bVar);
        androidx.appcompat.widget.AppCompatImageView findViewById = view.findViewById(2131364521);
        com.truecaller.messaging.conversation.AttachmentType attachmentType = bVar.b;
        java.lang.String str2 = bVar.A;
        java.lang.String str3 = bVar.B;
        java.lang.String str4 = bVar.C;
        findViewById.setImageResource(attachmentType.icon);
        if (p02.m4.c[attachmentType.ordinal()] == 1) {
            com.truecaller.messaging.data.types.Entity entity = bVar.d;
            kotlin.jvm.internal.Intrinsics.e(entity, "null cannot be cast to non-null type com.truecaller.messaging.data.types.VCardEntity");
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            str3 = lf.bar.x((com.truecaller.messaging.data.types.VCardEntity) entity, context);
        } else {
            if (str3 == null || str3.length() == 0) {
                str3 = view.getContext().getString(attachmentType.title);
            }
            kotlin.jvm.internal.Intrinsics.d(str3);
        }
        android.view.View findViewById2 = view.findViewById(2131367033);
        kotlin.jvm.internal.Intrinsics.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) findViewById2).setText(str3);
        if (bVar.l) {
            android.view.View findViewById3 = view.findViewById(2131367033);
            kotlin.jvm.internal.Intrinsics.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) findViewById3).setTextColor(i2);
            findViewById.setBackground(findViewById.getContext().getDrawable(2131234491));
            findViewById.setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[0]}, new int[]{bVar.h}));
            findViewById.setBackgroundTintList(android.content.res.ColorStateList.valueOf(bVar.i));
        }
        view.setOnClickListener(new p02.g4(this, bVar, 3));
        R(new p02.e4(this, 5), view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131366486);
        int i4 = 8;
        if (textView != null) {
            if (!jj3.bar.i(str4) && attachmentType != com.truecaller.messaging.conversation.AttachmentType.VCARD) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView.setVisibility(i3);
            textView.setText(str4);
            textView.setTextColor(i);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131367300);
        if (textView2 != null) {
            if (!jj3.bar.i(str2)) {
                i4 = 0;
            }
            textView2.setVisibility(i4);
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.ENGLISH;
                str = nc0.k1.i(locale, "ENGLISH", str2, locale, "toUpperCase(...)");
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(i);
            if (!jj3.bar.i(str4) && attachmentType != com.truecaller.messaging.conversation.AttachmentType.VCARD) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 2131233442, 0);
            } else {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (textView != null && gj.m.H(textView)) {
                textView2.setPaddingRelative(0, 0, 0, 0);
            } else {
                textView2.setPaddingRelative(0, 0, textView2.getContext().getResources().getDimensionPixelSize(2131166427), 0);
            }
        }
        s(view);
    }

    public final android.text.SpannableStringBuilder u(p02.b bVar, android.graphics.Paint.FontMetricsInt fontMetricsInt, boolean z) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        boolean z2 = bVar.M;
        int i = bVar.H;
        int i2 = bVar.G;
        int i3 = bVar.r;
        int i4 = bVar.f;
        int i5 = bVar.e;
        if (z2) {
            android.graphics.drawable.Drawable u = bi3.a.u(2130970762, ((androidx.recyclerview.widget.k2) this).itemView.getContext());
            if (u != null) {
                bi3.a.o(u, spannableStringBuilder, (java.lang.Integer) null, fontMetricsInt, 10);
            }
            spannableStringBuilder.append((java.lang.CharSequence) " ");
        }
        if (bVar.P && bVar.Q) {
            int s = bi3.a.s(((androidx.recyclerview.widget.k2) this).itemView.getContext(), 2130970936);
            android.graphics.drawable.Drawable drawable = ((androidx.recyclerview.widget.k2) this).itemView.getContext().getDrawable(2131232670);
            if (drawable != null) {
                bi3.a.o(drawable, spannableStringBuilder, java.lang.Integer.valueOf(s), (android.graphics.Paint.FontMetricsInt) null, 12);
            }
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) ((androidx.recyclerview.widget.k2) this).itemView.getContext().getString(2132017829));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(s), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) " • ");
        } else if (bVar.N) {
            android.graphics.drawable.Drawable drawable2 = ((androidx.recyclerview.widget.k2) this).itemView.getContext().getDrawable(i4);
            if (drawable2 != null) {
                bi3.a.o(drawable2, spannableStringBuilder, (java.lang.Integer) null, (android.graphics.Paint.FontMetricsInt) null, 14);
            }
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append((java.lang.CharSequence) ((androidx.recyclerview.widget.k2) this).itemView.getContext().getString(2132017857));
            spannableStringBuilder.append((java.lang.CharSequence) " • ");
        } else if (bVar.O) {
            int s2 = bi3.a.s(((androidx.recyclerview.widget.k2) this).itemView.getContext(), 2130970515);
            android.graphics.drawable.Drawable drawable3 = ((androidx.recyclerview.widget.k2) this).itemView.getContext().getDrawable(i4);
            if (drawable3 != null) {
                bi3.a.o(drawable3, spannableStringBuilder, java.lang.Integer.valueOf(s2), (android.graphics.Paint.FontMetricsInt) null, 12);
            }
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append((java.lang.CharSequence) ((androidx.recyclerview.widget.k2) this).itemView.getContext().getString(2132017857));
            spannableStringBuilder.append((java.lang.CharSequence) " • ");
        }
        if (z) {
            if (i3 > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) ((androidx.recyclerview.widget.k2) this).itemView.getContext().getString(i3)).append((java.lang.CharSequence) " • ");
            }
            if (i2 > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) ((androidx.recyclerview.widget.k2) this).itemView.getContext().getString(i2));
                if (i > 0) {
                    spannableStringBuilder.append((java.lang.CharSequence) " ");
                    spannableStringBuilder.append((java.lang.CharSequence) ((androidx.recyclerview.widget.k2) this).itemView.getContext().getString(i));
                }
                if (i5 > 0) {
                    spannableStringBuilder.append((java.lang.CharSequence) " ");
                    android.graphics.drawable.Drawable drawable4 = ((androidx.recyclerview.widget.k2) this).itemView.getContext().getDrawable(i5);
                    if (drawable4 != null) {
                        bi3.a.o(drawable4, spannableStringBuilder, java.lang.Integer.valueOf(bVar.k), (android.graphics.Paint.FontMetricsInt) null, 4);
                    }
                } else {
                    spannableStringBuilder.append((java.lang.CharSequence) " ");
                }
                spannableStringBuilder.append((java.lang.CharSequence) "• ");
            }
        } else if (i5 > 0) {
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            android.graphics.drawable.Drawable drawable5 = ((androidx.recyclerview.widget.k2) this).itemView.getContext().getDrawable(i5);
            if (drawable5 != null) {
                bi3.a.o(drawable5, spannableStringBuilder, (java.lang.Integer) null, (android.graphics.Paint.FontMetricsInt) null, 6);
            }
        }
        spannableStringBuilder.append((java.lang.CharSequence) bVar.j);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.truecaller.messaging.conversation.ExpandableEmojiTextView, android.view.View] */
    public final void v(com.truecaller.messaging.data.types.Message message, com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutStyle layoutStyle, com.truecaller.messaging.conversation.ExpandableEmojiTextView.LayoutState layoutState, java.lang.Integer num, boolean z) {
        java.lang.Long l;
        long j = message.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutState, "layoutState");
        com.truecaller.android.truemoji.widget.EmojiTextView y = y();
        if (y != null && (y instanceof com.truecaller.messaging.conversation.ExpandableEmojiTextView)) {
            ?? r7 = (com.truecaller.messaging.conversation.ExpandableEmojiTextView) y;
            if (kotlin.jvm.internal.Intrinsics.b(r7.getTag(), java.lang.Long.valueOf(j))) {
                return;
            }
            r7.setItem(message);
            t02.h hVar = this.b;
            boolean z2 = false;
            if ((hVar instanceof t02.c) && (l = ((t02.c) hVar).a.l()) != null && l.longValue() == j) {
                z2 = true;
            }
            boolean z3 = z2;
            r7.h(layoutStyle, layoutState, z3, num);
            U(layoutStyle, layoutState, message, z3, z);
            r7.setOnResizeClickListener(new com.truecaller.search.global.c0(5, this, message, layoutStyle, y, z));
        }
    }

    public final android.view.ViewGroup w() {
        return (android.view.ViewGroup) this.k.getValue();
    }

    public final android.view.ViewGroup x() {
        return (android.view.ViewGroup) this.e.getValue();
    }

    public final com.truecaller.android.truemoji.widget.EmojiTextView y() {
        return (com.truecaller.android.truemoji.widget.EmojiTextView) this.c.getValue();
    }

    public final android.view.ViewGroup z() {
        return (android.view.ViewGroup) this.d.getValue();
    }
}
