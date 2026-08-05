package com.truecaller.bizmon.callSurvey.mvp.question.freetext;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizFreeTextQuestionView extends android.widget.FrameLayout implements uh0.baz, android.text.TextWatcher, bd3.qux {
    public static final /* synthetic */ int f = 0;
    public yc3.d a;
    public boolean b;
    public kh0.c c;
    public uh0.bar d;
    public final fi0.o e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizFreeTextQuestionView(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        uh0.bar presenter = getPresenter();
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        r20.a aVar = (r20.a) presenter;
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "text");
        aVar.c2(valueOf);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.o getBinding() {
        return this.e;
    }

    @org.jetbrains.annotations.NotNull
    public final uh0.bar getPresenter() {
        uh0.bar barVar = this.d;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((r20.a) getPresenter()).u0(this);
        final fi0.o oVar = this.e;
        oVar.c.addTextChangedListener(this);
        final int i = 0;
        oVar.c.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: uh0.qux
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                int i3 = i;
                java.lang.String str = "";
                java.lang.String str2 = null;
                p83.e eVar = oVar;
                y93.f fVar = this;
                switch (i3) {
                    case 0:
                        com.truecaller.bizmon.callSurvey.mvp.question.freetext.BizFreeTextQuestionView bizFreeTextQuestionView = (com.truecaller.bizmon.callSurvey.mvp.question.freetext.BizFreeTextQuestionView) fVar;
                        fi0.o oVar2 = (fi0.o) eVar;
                        int i4 = com.truecaller.bizmon.callSurvey.mvp.question.freetext.BizFreeTextQuestionView.f;
                        if (i2 != 6) {
                            return false;
                        }
                        ((r20.a) bizFreeTextQuestionView.getPresenter()).e2(oVar2.c.getText().toString());
                        return true;
                    case 1:
                        y93.a aVar = (y93.a) fVar;
                        p83.d dVar = (p83.d) eVar;
                        kotlin.reflect.KProperty[] kPropertyArr = y93.a.u;
                        if (i2 == 0 || i2 == 6) {
                            y93.m e5 = aVar.e5();
                            android.text.Editable text = dVar.f.getText();
                            if (text != null) {
                                str2 = text.toString();
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                            e5.d2(str);
                        }
                        return false;
                    default:
                        y93.f fVar2 = fVar;
                        p83.e eVar2 = eVar;
                        kotlin.reflect.KProperty[] kPropertyArr2 = y93.f.u;
                        if (i2 == 0 || i2 == 6) {
                            y93.m e52 = fVar2.e5();
                            android.text.Editable text2 = eVar2.j.getText();
                            if (text2 != null) {
                                str2 = text2.toString();
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                            e52.d2(str);
                        }
                        return false;
                }
            }
        });
        oVar.b.setOnClickListener(new ty1.bar(3, this, oVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((r20.a) getPresenter()).m1();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull uh0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.d = barVar;
    }

    public /* synthetic */ BizFreeTextQuestionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizFreeTextQuestionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.d = new r20.a((kotlin.coroutines.CoroutineContext) ((tx.d0) ((uh0.a) X3())).c.V1.get());
        }
        android.view.LayoutInflater.from(context).inflate(2131559934, this);
        int i = 2131362566;
        android.widget.Button button = (android.widget.Button) df0.qux.o(2131362566, this);
        if (button != null) {
            i = 2131363712;
            android.widget.EditText editText = (android.widget.EditText) df0.qux.o(2131363712, this);
            if (editText != null) {
                i = 2131364826;
                com.airbnb.lottie.LottieAnimationView o = df0.qux.o(2131364826, this);
                if (o != null) {
                    i = 2131367231;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367231, this);
                    if (textView != null) {
                        fi0.o oVar = new fi0.o(this, button, editText, o, textView);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oVar, "inflate(...)");
                        this.e = oVar;
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
