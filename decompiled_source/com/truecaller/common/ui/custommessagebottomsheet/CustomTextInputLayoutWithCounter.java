package com.truecaller.common.ui.custommessagebottomsheet;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CustomTextInputLayoutWithCounter extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int A = 0;
    public yc3.d s;
    public final boolean t;
    public final kotlin.Lazy u;
    public c41.d v;
    public int w;
    public boolean x;
    public c41.e y;
    public u03.f0 z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTextInputLayoutWithCounter(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void F(com.truecaller.common.ui.custommessagebottomsheet.CustomTextInputLayoutWithCounter customTextInputLayoutWithCounter) {
        c41.e eVar = customTextInputLayoutWithCounter.y;
        c41.e eVar2 = c41.e.a;
        if (eVar == eVar2) {
            return;
        }
        int s = bi3.a.s(customTextInputLayoutWithCounter.getThemeResourceProvider().a, 2130970634);
        d41.b binding = customTextInputLayoutWithCounter.getBinding();
        binding.b.setBoxStrokeColor(s);
        binding.b.setHintTextColor(android.content.res.ColorStateList.valueOf(s));
        binding.c.setTextColor(s);
        customTextInputLayoutWithCounter.y = eVar2;
    }

    private final d41.b getBinding() {
        return (d41.b) this.u.getValue();
    }

    private final int getMessageLength() {
        java.lang.String message = getMessage();
        if (message != null) {
            return message.length();
        }
        return 0;
    }

    public final void G() {
        d41.b binding = getBinding();
        android.widget.TextView textView = binding.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "txtCounter");
        gj.m.i0(textView, this.x);
        int i = 0;
        if (this.x) {
            android.widget.EditText editText = getBinding().b.getEditText();
            if (editText != null) {
                editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.w)});
            }
            android.widget.EditText editText2 = getBinding().b.getEditText();
            if (editText2 != null) {
                editText2.setMaxLines(3);
            }
        }
        android.widget.EditText editText3 = binding.b.getEditText();
        if (editText3 != null) {
            editText3.addTextChangedListener(new c41.f(i, this, binding));
        }
    }

    public final void H() {
        getBinding().b.requestFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I() {
        getBinding().c.setText(getResources().getString(2132020324, java.lang.Integer.valueOf(getMessageLength()), java.lang.Integer.valueOf(this.w)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    public final boolean getApplyMaximumLength() {
        return this.x;
    }

    @org.jetbrains.annotations.Nullable
    public final c41.d getCustomTextInputLayoutCallback() {
        return this.v;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        android.text.Editable editable;
        android.widget.EditText editText = getBinding().b.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        return java.lang.String.valueOf(editable);
    }

    public final int getMessageMaximumLength() {
        return this.w;
    }

    @org.jetbrains.annotations.NotNull
    public final u03.f0 getThemeResourceProvider() {
        u03.f0 f0Var = this.z;
        if (f0Var != null) {
            return f0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("themeResourceProvider");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        I();
        G();
        android.widget.EditText editText = getBinding().b.getEditText();
        if (editText != null) {
            final int i = 0;
            editText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: c41.c
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                    f32.e eVar;
                    int i3 = i;
                    java.lang.String str = null;
                    y83.d dVar = this;
                    switch (i3) {
                        case 0:
                            com.truecaller.common.ui.custommessagebottomsheet.CustomTextInputLayoutWithCounter customTextInputLayoutWithCounter = (com.truecaller.common.ui.custommessagebottomsheet.CustomTextInputLayoutWithCounter) dVar;
                            if (i2 == 6) {
                                af.a aVar = customTextInputLayoutWithCounter.v;
                                if (aVar == null) {
                                    return true;
                                }
                                java.lang.String message = customTextInputLayoutWithCounter.getMessage();
                                ab1.qux quxVar = ((c41.qux) aVar.b).c;
                                if (quxVar == null || message == null) {
                                    return true;
                                }
                                fg3.h0.J(quxVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new yn2.t(quxVar, message, (df3.bar) null, 21), 3);
                                return true;
                            }
                            int i4 = com.truecaller.common.ui.custommessagebottomsheet.CustomTextInputLayoutWithCounter.A;
                            return false;
                        case 1:
                            com.truecaller.namesuggestion.impl.ui.c cVar = (com.truecaller.namesuggestion.impl.ui.c) dVar;
                            b91.a aVar2 = com.truecaller.namesuggestion.impl.ui.c.r;
                            if (i2 == 6) {
                                androidx.lifecycle.d0 viewLifecycleOwner = cVar.getViewLifecycleOwner();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.namesuggestion.impl.ui.b(cVar, (df3.bar) null, 1), 3);
                            }
                            return false;
                        case 2:
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = (com.truecaller.search.global.GlobalSearchResultActivity) dVar;
                            if (i2 == 3) {
                                com.truecaller.search.global.h0 h0Var = globalSearchResultActivity.n0;
                                com.truecaller.log.AssertionUtil.isNotNull(((com.truecaller.sdk.bar) h0Var).a, new java.lang.String[0]);
                                com.truecaller.log.AssertionUtil.isNotNull(h0Var.X, new java.lang.String[0]);
                                if (jj3.bar.i(h0Var.e0)) {
                                    com.truecaller.search.global.m mVar = (com.truecaller.search.global.i0) ((com.truecaller.sdk.bar) h0Var).a;
                                    if (mVar == null) {
                                        return true;
                                    }
                                    java.lang.String h = h0Var.i.h(2132018925, new java.lang.Object[0]);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "message");
                                    android.widget.Toast.makeText(mVar.getContext(), h, 0).show();
                                    return true;
                                }
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = h0Var.X;
                                if (globalSearchResultActivity2 != null) {
                                    globalSearchResultActivity2.w0();
                                }
                                if (!((qo1.k) h0Var.L.get()).e() || !h0Var.f2()) {
                                    return true;
                                }
                                h0Var.y2(0L, true);
                                return true;
                            }
                            int i5 = com.truecaller.search.global.GlobalSearchResultActivity.D0;
                            return false;
                        case 3:
                            f32.e eVar2 = (f32.e) dVar;
                            if (i2 == 6) {
                                f32.s U4 = eVar2.U4();
                                java.lang.String obj = textView.getText().toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "text");
                                if ((U4.t instanceof f32.o) && !U4.s.d2() && (eVar = (f32.e) ((com.truecaller.sdk.bar) U4).a) != null) {
                                    if (!U4.j2(obj)) {
                                        eVar.c5(2132018255);
                                    } else {
                                        t41.t tVar = U4.i;
                                        com.truecaller.data.entity.messaging.Participant a = com.truecaller.data.entity.messaging.Participant.a(obj, tVar, ((t41.e0) tVar).c());
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "buildFromAddress(...)");
                                        U4.n2((java.lang.Long) null, kotlin.collections.x.c(a), (java.lang.Integer) null);
                                    }
                                }
                            }
                            return false;
                        case 4:
                            r12.g gVar = (r12.g) dVar;
                            if (i2 == 3) {
                                r12.m a6 = gVar.a6();
                                java.lang.CharSequence text = textView.getText();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                                java.lang.String obj2 = kotlin.text.StringsKt.u0(text).toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "string");
                                r12.g gVar2 = (r12.j) ((com.truecaller.sdk.bar) a6).a;
                                if (gVar2 != null) {
                                    android.widget.EditText editText2 = (android.widget.EditText) gVar2.j.getValue();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "<get-txtSearch>(...)");
                                    gj.m.t0(0L, editText2, false);
                                }
                                if (obj2.length() != 0) {
                                    a6.t = obj2;
                                    fg3.h0.J(a6, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q8.n(a6, obj2, (df3.bar) null, 16), 3);
                                }
                            }
                            return false;
                        default:
                            y83.d dVar2 = dVar;
                            y00.bar barVar = y83.d.t;
                            if (i2 == 0 || i2 == 6) {
                                y83.x e5 = dVar2.e5();
                                android.text.Editable text2 = dVar2.d5().f.getText();
                                if (text2 != null) {
                                    str = text2.toString();
                                }
                                if (str == null) {
                                    str = "";
                                }
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
                                e5.B.e(str);
                            }
                            return false;
                    }
                }
            });
        }
    }

    public final void setApplyMaximumLength(boolean z) {
        this.x = z;
        if (!z) {
            G();
        }
    }

    public final void setCustomTextInputLayoutCallback(@org.jetbrains.annotations.Nullable c41.d dVar) {
        if (dVar != null) {
            ((af.a) dVar).j(getMessage());
        }
        this.v = dVar;
    }

    public final void setHint(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "hint");
        getBinding().b.setHint(str);
    }

    public final void setMessageMaximumLength(int i) {
        this.w = i;
        I();
    }

    public final void setPlaceholder(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placeholder");
        getBinding().b.setPlaceholderText(str);
        getBinding().b.setPlaceholderTextColor(android.content.res.ColorStateList.valueOf(bi3.a.s(getThemeResourceProvider().a, 2130970936)));
    }

    public final void setTextMessage(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        android.widget.EditText editText = getBinding().b.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        android.widget.EditText editText2 = getBinding().b.getEditText();
        if (editText2 != null) {
            editText2.setSelection(str.length());
        }
    }

    public final void setThemeResourceProvider(@org.jetbrains.annotations.NotNull u03.f0 f0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.z = f0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTextInputLayoutWithCounter(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomTextInputLayoutWithCounter(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomTextInputLayoutWithCounter(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            this.z = (u03.f0) ((c41.g) X3()).c.q9.get();
        }
        this.u = kotlin.LazyKt.lazy(new c41.bar(this, 1));
        this.w = getResources().getInteger(2131427335);
        this.x = true;
        this.y = c41.e.a;
        android.view.LayoutInflater.from(context).inflate(2131561001, (android.view.ViewGroup) this, true);
    }
}
