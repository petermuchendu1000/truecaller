package com.truecaller.dialpad_view.keypad;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Dialpad extends jg1.d implements android.view.View.OnLongClickListener, android.view.View.OnTouchListener, bd3.qux {
    public yc3.d b;
    public final boolean c;
    public final android.graphics.Rect[] d;
    public jg1.b e;
    public tz1.bar f;
    public u03.f0 g;
    public jg1.a h;
    public eg1.bar i;
    public jg1.bar j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, tz1.bar] */
    public Dialpad(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = 0.0f;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.dialpad_view.R$styleable.a, 0, 0);
        this.a = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        if (!isInEditMode() && !this.c) {
            this.c = true;
            tx.w wVar = ((jg1.c) X3()).c;
            this.e = new a8.l((android.content.Context) wVar.b.a.L.get(), 4);
            this.f = new java.lang.Object();
            this.g = (u03.f0) wVar.q9.get();
        }
        this.d = new android.graphics.Rect[5];
    }

    public final java.lang.Object X3() {
        if (this.b == null) {
            this.b = new yc3.d(this);
        }
        return this.b.X3();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, int i2) {
        jg1.bar barVar = this.j;
        boolean z = false;
        if (barVar != null) {
            hg1.p pVar = (hg1.p) barVar;
            if (i != -4717) {
                if (i != -4716) {
                    if (i != -4714) {
                        if (i == -4712) {
                            z = pVar.D2(i2, null);
                        }
                        if (z) {
                            pVar.A.clear();
                        }
                    } else {
                        pVar.c2('+');
                    }
                } else if (pVar.d2(';')) {
                    pVar.c2(';');
                }
            } else if (pVar.d2(',')) {
                pVar.c2(',');
            }
            z = true;
            if (z) {
            }
        }
        return z;
    }

    public final void b(java.lang.CharSequence charSequence, com.truecaller.dialpad_view.keypad.DialpadKeyActionState dialpadKeyActionState) {
        jg1.a aVar = this.h;
        if (aVar != null) {
            char charAt = charSequence.charAt(0);
            hg1.p pVar = (hg1.p) aVar;
            java.util.HashSet hashSet = pVar.A;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialpadKeyActionState, "dialpadKeyState");
            int i = hg1.i.b[dialpadKeyActionState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        hashSet.remove(java.lang.Character.valueOf(charAt));
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                } else if (hashSet.remove(java.lang.Character.valueOf(charAt))) {
                    pVar.c2(charAt);
                }
            } else {
                hashSet.add(java.lang.Character.valueOf(charAt));
            }
            kotlin.Unit unit = kotlin.Unit.a;
        }
    }

    public final void c() {
        eg1.bar barVar = this.i;
        if (barVar != null) {
            androidx.localbroadcastmanager.content.bar barVar2 = barVar.d;
            if (barVar2 != null) {
                barVar2.sendMessageDelayed(android.os.Message.obtain((android.os.Handler) barVar2, 1), 20L);
            }
            kotlin.Unit unit = kotlin.Unit.a;
        }
    }

    @Override // jg1.d
    public int getColumnCount() {
        return 3;
    }

    @org.jetbrains.annotations.NotNull
    public final jg1.b getDialpadViewHelper() {
        jg1.b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.Intrinsics.n("dialpadViewHelper");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final tz1.bar getT9keyProvider() {
        tz1.bar barVar = this.f;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("t9keyProvider");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final u03.f0 getThemedResourceProvider() {
        u03.f0 f0Var = this.g;
        if (f0Var != null) {
            return f0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("themedResourceProvider");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        pz1.bar q = ((p7.bar) getT9keyProvider()).q();
        for (int i = 0; i < 12; i++) {
            char c = jg1.qux.a[i];
            java.lang.String str = (java.lang.String) ((sg.a) q.c).e(c);
            if (str == null) {
                str = null;
            }
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            java.lang.String valueOf = java.lang.String.valueOf(c);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "mainText");
            jg1.baz bazVar = new jg1.baz(context);
            if (valueOf.charAt(0) == '*') {
                android.content.Context context2 = bazVar.getContext();
                android.content.res.ColorStateList t = bi3.a.t(2130970934, context2);
                android.graphics.drawable.Drawable mutate = t41.i.d(2131232659, context2).mutate();
                mutate.setTintList(t);
                bazVar.j = mutate;
            } else if (valueOf.charAt(0) == '#') {
                android.content.Context context3 = bazVar.getContext();
                android.content.res.ColorStateList t2 = bi3.a.t(2130970934, context3);
                android.graphics.drawable.Drawable mutate2 = t41.i.d(2131232527, context3).mutate();
                mutate2.setTintList(t2);
                bazVar.j = mutate2;
            }
            bazVar.h = valueOf;
            bazVar.i = str;
            if ("+".equals(str)) {
                bazVar.b.setTextSize(t41.i.b(14.0f, bazVar.getContext()));
            }
            bazVar.setOnLongClickListener(this);
            bazVar.setOnTouchListener(this);
            bazVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            if (c == '1') {
                bazVar.setSecondaryImage(2131232529);
            }
            addView(bazVar, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x004f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof jg1.baz
            r1 = 0
            if (r0 == 0) goto L4f
            r0 = r5
            jg1.baz r0 = (jg1.baz) r0
            java.lang.CharSequence r0 = r0.getMainText()
            java.lang.String r0 = r0.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4f
            char r2 = r0.charAt(r1)
            r3 = 42
            if (r2 != r3) goto L2a
            r0 = -4717(0xffffffffffffed93, float:NaN)
            boolean r0 = r4.a(r0, r1)
            goto L50
        L2a:
            char r2 = r0.charAt(r1)
            r3 = 35
            if (r2 != r3) goto L39
            r0 = -4716(0xffffffffffffed94, float:NaN)
            boolean r0 = r4.a(r0, r1)
            goto L50
        L39:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L4f
            switch(r0) {
                case 0: goto L48;
                case 1: goto L41;
                case 2: goto L41;
                case 3: goto L41;
                case 4: goto L41;
                case 5: goto L41;
                case 6: goto L41;
                case 7: goto L41;
                case 8: goto L41;
                case 9: goto L41;
                default: goto L40;
            }     // Catch: java.lang.NumberFormatException -> L4f
        L40:
            goto L4f
        L41:
            r2 = -4712(0xffffffffffffed98, float:NaN)
            boolean r0 = r4.a(r2, r0)     // Catch: java.lang.NumberFormatException -> L4f
            goto L50
        L48:
            r2 = -4714(0xffffffffffffed96, float:NaN)
            boolean r0 = r4.a(r2, r0)     // Catch: java.lang.NumberFormatException -> L4f
            goto L50
        L4f:
            r0 = r1
        L50:
            if (r0 == 0) goto L55
            r5.setPressed(r1)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.dialpad_view.keypad.Dialpad.onLongClick(android.view.View):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        androidx.localbroadcastmanager.content.bar barVar;
        android.media.AudioManager audioManager;
        int ringerMode;
        int i;
        androidx.localbroadcastmanager.content.bar barVar2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (view instanceof jg1.baz) {
            jg1.baz bazVar = (jg1.baz) view;
            java.lang.CharSequence mainText = bazVar.getMainText();
            if (mainText.length() == 1) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int findPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (pointerId < 5) {
                    int action = motionEvent.getAction();
                    android.graphics.Rect[] rectArr = this.d;
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                if (action == 3) {
                                    c();
                                    return false;
                                }
                            } else {
                                android.graphics.Rect rect = rectArr[pointerId];
                                if (rect != null && !rect.contains(view.getLeft() + ((int) motionEvent.getX(findPointerIndex)), view.getTop() + ((int) motionEvent.getY(findPointerIndex)))) {
                                    c();
                                    b(bazVar.getMainText(), com.truecaller.dialpad_view.keypad.DialpadKeyActionState.CANCEL);
                                }
                            }
                        } else {
                            b(bazVar.getMainText(), com.truecaller.dialpad_view.keypad.DialpadKeyActionState.UP);
                            c();
                            return false;
                        }
                    } else {
                        eg1.bar barVar3 = this.i;
                        if (barVar3 != null) {
                            char charAt = mainText.charAt(0);
                            if (barVar3.b && (ringerMode = (audioManager = (android.media.AudioManager) barVar3.a.getSystemService("audio")).getRingerMode()) != 0 && ringerMode != 1 && !audioManager.isBluetoothA2dpOn()) {
                                sg.qux quxVar = eg1.bar.g;
                                if (charAt == 0) {
                                    if (quxVar.f) {
                                        i = quxVar.b[quxVar.d + 1];
                                        if (i != -1 && (barVar2 = barVar3.d) != null) {
                                            barVar2.removeMessages(1);
                                            android.os.Message.obtain(barVar2, 0, i, 2000).sendToTarget();
                                        }
                                    }
                                    i = -1;
                                    if (i != -1) {
                                        barVar2.removeMessages(1);
                                        android.os.Message.obtain(barVar2, 0, i, 2000).sendToTarget();
                                    }
                                } else {
                                    char[] cArr = quxVar.a;
                                    int i2 = quxVar.d;
                                    int t = le0.bar.t(charAt);
                                    while (true) {
                                        int i3 = t & i2;
                                        char c = cArr[i3];
                                        if (c == 0) {
                                            break;
                                        }
                                        if (charAt == c) {
                                            i = quxVar.b[i3];
                                            break;
                                        }
                                        t = i3 + 1;
                                    }
                                    i = -1;
                                    if (i != -1) {
                                    }
                                }
                            }
                            if ((z62.d.d(getDialpadViewHelper().a) & 1) != 0 && (barVar = barVar3.d) != null) {
                                android.os.Message.obtain(barVar, 2, 30, 0).sendToTarget();
                            }
                        }
                        rectArr[pointerId] = new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        b(bazVar.getMainText(), com.truecaller.dialpad_view.keypad.DialpadKeyActionState.DOWN);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void setActionsListener(@org.jetbrains.annotations.Nullable jg1.bar barVar) {
        this.j = barVar;
    }

    public final void setDialpadListener(@org.jetbrains.annotations.Nullable jg1.a aVar) {
        this.h = aVar;
    }

    public final void setDialpadViewHelper(@org.jetbrains.annotations.NotNull jg1.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.e = bVar;
    }

    public final void setFeedback(@org.jetbrains.annotations.Nullable eg1.bar barVar) {
        this.i = barVar;
    }

    public final void setT9keyProvider(@org.jetbrains.annotations.NotNull tz1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.f = barVar;
    }

    public final void setThemedResourceProvider(@org.jetbrains.annotations.NotNull u03.f0 f0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.g = f0Var;
    }
}
