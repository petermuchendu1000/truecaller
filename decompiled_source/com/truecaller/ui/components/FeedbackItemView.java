package com.truecaller.ui.components;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class FeedbackItemView extends ey2.n implements android.view.View.OnClickListener {
    public static final /* synthetic */ int r = 0;
    public x42.bar c;
    public nc0.bar d;
    public javax.inject.Provider e;
    public com.truecaller.ui.components.bar f;
    public android.widget.ImageView g;
    public android.widget.TextView h;
    public android.widget.Button i;
    public android.widget.Button j;
    public android.widget.Button k;
    public boolean l;
    public float m;
    public boolean n;
    public ey2.i o;
    public boolean p;
    public int q;

    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public enum DisplaySource {
        BLOCKED_CALL,
        GLOBAL_SEARCH_HISTORY,
        OTHER;

        public java.lang.String asAnalyticsContext() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return "undefined";
                }
                return "searchHistory";
            }
            return "callBlocked";
        }

        public com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState getInitialFeedbackState() {
            return com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.QUESTION_ENJOYING_BLOCKED;
        }

        public com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState getInitialInviteState() {
            return com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.QUESTION_INVITE_FRIENDS;
        }

        public com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState getInitialShareState() {
            if (this == BLOCKED_CALL) {
                return com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.QUESTION_SHARE_BLOCKED;
            }
            return com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.QUESTION_SHARE;
        }

        public boolean shouldShowFeedback(android.content.Context context) {
            int i = com.truecaller.ui.components.FeedbackItemView.r;
            if (z62.d.g("GOOGLE_REVIEW_DONE") || z62.d.g("FEEDBACK_SENT") || ((x42.bar) ((com.truecaller.ui.components.FeedbackItemView.bar) f40.d0.z(context.getApplicationContext(), com.truecaller.ui.components.FeedbackItemView.bar.class)).H.b.F3.get()).b() == null || z62.d.h(2L, "FEEDBACK_DISMISSED_COUNT") || this != BLOCKED_CALL || z62.d.e("blockCallCounter").longValue() != 1) {
                return false;
            }
            return true;
        }

        public boolean shouldShowInviteFriends() {
            if (z62.d.e("INVITE_PEOPLE_FIRST_CHECKED").longValue() == 0) {
                z62.d.o("INVITE_PEOPLE_FIRST_CHECKED");
            }
            if (this == GLOBAL_SEARCH_HISTORY && z62.d.h(3L, "counterFacebookInvite") && z62.d.b(86400000L, "INVITE_LAST_ASKED") && z62.d.b(1209600000L, "INVITE_LAST_DISMISSED")) {
                return true;
            }
            return false;
        }

        public boolean shouldShowShare() {
            if (z62.d.g("FEEDBACK_LIKES_TRUECALLER") && !z62.d.h(2L, "FEEDBACK_DISMISSED_COUNT") && !z62.d.g("HAS_SHARED") && z62.d.b(604800000L, "GOOGLE_REVIEW_ASK_TIMESTAMP")) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface bar {
    }

    public FeedbackItemView(android.content.Context context) {
        super(context);
        if (!isInEditMode()) {
            a();
        }
        d(null, 0);
    }

    private void setIconDrawable(@androidx.annotation.NonNull com.truecaller.ui.components.bar barVar) {
        this.g.setImageDrawable(bi3.a.x(getContext(), barVar.e.getIconId(), 2130971058, android.graphics.PorterDuff.Mode.SRC_IN));
    }

    public final void b() {
        int i = 1;
        this.n = true;
        this.f.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.DUMMY_FINAL;
        int i2 = 2;
        if (!this.l) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) i.c0.w(getChildAt(i3), "alpha", new float[]{1.0f, 0.0f}).b;
                objectAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                objectAnimator.setDuration(200L);
                animatorSet.play(objectAnimator);
            }
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int height = getHeight();
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            valueAnimator.setFloatValues(1.0f, 0.0f);
            valueAnimator.setDuration(200L);
            valueAnimator.setStartDelay(200L);
            valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            valueAnimator.addUpdateListener(new ey2.f(this, layoutParams, height));
            animatorSet.play(valueAnimator);
            animatorSet.addListener(new ey2.h(this, i));
            animatorSet.start();
            return;
        }
        android.animation.ObjectAnimator objectAnimator2 = (android.animation.ObjectAnimator) i.c0.w(this, "alpha", new float[]{1.0f, 0.0f}).b;
        objectAnimator2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        objectAnimator2.setDuration(200L);
        objectAnimator2.addListener(new ey2.h(this, i2));
        objectAnimator2.start();
    }

    public final void c() {
        int i;
        android.content.Context context = getContext();
        com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState feedbackItemView$FeedbackItem$FeedbackItemState = this.f.e;
        b();
        if (feedbackItemView$FeedbackItem$FeedbackItemState.isInviteState()) {
            z62.d.o("INVITE_LAST_DISMISSED");
            return;
        }
        z62.d.o("FEEDBACK_LAST_DISMISSED");
        z62.d.k("FEEDBACK_DISMISSED_COUNT", z62.d.e("FEEDBACK_DISMISSED_COUNT").longValue() + 1);
        if (z62.d.h(2L, "FEEDBACK_DISMISSED_COUNT")) {
            if (feedbackItemView$FeedbackItem$FeedbackItemState.isShareState()) {
                i = 2132018006;
            } else {
                i = 2132017969;
            }
            android.widget.Toast.makeText(context, i, 0).show();
        }
    }

    public final void d(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.c, i, 0);
        try {
            this.q = obtainStyledAttributes.getDimensionPixelSize(0, t41.i.b(32.0f, getContext()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void e() {
        java.lang.String string;
        com.truecaller.ui.components.bar barVar = this.f;
        if (barVar.e == com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_YES) {
            barVar.e();
            this.k.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            setMinimumHeight(0);
            android.widget.TextView textView = this.h;
            com.truecaller.ui.components.bar barVar2 = this.f;
            android.content.Context context = getContext();
            int messageId = barVar2.e.getMessageId();
            if (messageId == -1) {
                string = "";
            } else {
                string = context.getString(messageId);
            }
            textView.setText(string);
            setIconDrawable(this.f);
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) i.c0.w(this.g, "rotation", new float[]{0.0f, 360.0f}).b;
            objectAnimator.setInterpolator(new android.view.animation.OvershootInterpolator(1.5f));
            objectAnimator.setStartDelay(500L);
            objectAnimator.setDuration(500L);
            objectAnimator.start();
            postDelayed(new ea.i(this, 7), 2000L);
        }
    }

    public final void f(com.truecaller.ui.components.bar barVar) {
        java.lang.String string;
        if (this.f == barVar) {
            return;
        }
        this.f = barVar;
        if (barVar.e.shouldClose()) {
            setVisibility(8);
            return;
        }
        android.view.LayoutInflater.from(getContext()).inflate(2131561023, (android.view.ViewGroup) this, true);
        setBackgroundColor(bi3.a.s(getContext(), 2130971039));
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        }
        setMinimumHeight(t41.i.b(96.0f, getContext()));
        this.m = t41.i.b(8.0f, getContext());
        android.widget.Button button = (android.widget.Button) findViewById(2131363870);
        this.i = button;
        button.setOnClickListener(this);
        android.widget.Button button2 = (android.widget.Button) findViewById(2131363871);
        this.j = button2;
        button2.setOnClickListener(this);
        android.widget.Button button3 = (android.widget.Button) findViewById(2131363869);
        this.k = button3;
        button3.setOnClickListener(this);
        this.g = (android.widget.ImageView) findViewById(2131363882);
        this.h = (android.widget.TextView) findViewById(2131363885);
        android.content.Context context = getContext();
        int messageId = barVar.e.getMessageId();
        if (messageId == -1) {
            string = "";
        } else {
            string = context.getString(messageId);
        }
        this.h.setText(string);
        if (barVar.e.getIconId() != -1) {
            setIconDrawable(barVar);
        }
        android.widget.Button button4 = this.k;
        int dismissId = barVar.e.getDismissId();
        if (dismissId == -1) {
            button4.setVisibility(4);
        } else {
            button4.setText(dismissId);
        }
        android.widget.Button button5 = this.i;
        int negativeId = barVar.e.getNegativeId();
        if (negativeId == -1) {
            button5.setVisibility(4);
        } else {
            button5.setText(negativeId);
        }
        android.widget.Button button6 = this.j;
        int positiveId = barVar.e.getPositiveId();
        if (positiveId == -1) {
            button6.setVisibility(4);
        } else {
            button6.setText(positiveId);
        }
        setPadding(getPaddingLeft(), getPaddingTop(), this.q, getPaddingBottom());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        if (!this.n) {
            android.content.Context context = getContext();
            int id = view.getId();
            if (id == 2131363869) {
                c();
                return;
            }
            if (id == 2131363870) {
                ey2.i iVar = this.o;
                if (iVar != null) {
                    com.truecaller.ui.FeedbackDialogActivity feedbackDialogActivity = (com.truecaller.ui.FeedbackDialogActivity) iVar;
                    if (this.f.f == com.truecaller.ui.components.FeedbackItemView.DisplaySource.BLOCKED_CALL) {
                        nc0.u1.m(feedbackDialogActivity.f0, "rateUs", "negativeButton");
                    }
                }
                com.truecaller.ui.components.bar barVar = this.f;
                int ordinal = barVar.e.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 6) {
                                if (ordinal != 12) {
                                    if (ordinal == 8 || ordinal == 9) {
                                        barVar.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.SHARE_NO;
                                    }
                                } else {
                                    barVar.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.INVITE_NO;
                                }
                            } else {
                                barVar.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_YES_THANKS;
                            }
                        } else {
                            barVar.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.FEEDBACK_NO;
                        }
                    } else {
                        barVar.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_NO;
                    }
                } else {
                    barVar.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.QUESTION_GIVE_FEEDBACK;
                }
            } else if (id == 2131363871) {
                ey2.i iVar2 = this.o;
                if (iVar2 != null) {
                    com.truecaller.ui.FeedbackDialogActivity feedbackDialogActivity2 = (com.truecaller.ui.FeedbackDialogActivity) iVar2;
                    if (this.f.f == com.truecaller.ui.components.FeedbackItemView.DisplaySource.BLOCKED_CALL) {
                        nc0.u1.m(feedbackDialogActivity2.f0, "rateUs", "positiveButton");
                    }
                }
                this.f.e();
                com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState feedbackItemView$FeedbackItem$FeedbackItemState = this.f.e;
                if (feedbackItemView$FeedbackItem$FeedbackItemState == com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.QUESTION_RATE || feedbackItemView$FeedbackItem$FeedbackItemState == com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_YES) {
                    z62.d.m("FEEDBACK_LIKES_TRUECALLER", true);
                }
            } else {
                return;
            }
            com.truecaller.ui.components.bar barVar2 = this.f;
            android.content.Context context2 = getContext();
            int messageId = barVar2.e.getMessageId();
            if (messageId == -1) {
                string = "";
            } else {
                string = context2.getString(messageId);
            }
            int iconId = this.f.e.getIconId();
            if (!jj3.bar.h(string) && iconId >= 0) {
                android.graphics.drawable.Drawable x = bi3.a.x(getContext(), this.f.e.getIconId(), 2130971058, android.graphics.PorterDuff.Mode.SRC_IN);
                this.n = true;
                android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) i.c0.w(this.h, "alpha", new float[]{1.0f, 0.0f}).b;
                objectAnimator.setDuration(100L);
                objectAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                objectAnimator.start();
                android.animation.ObjectAnimator objectAnimator2 = (android.animation.ObjectAnimator) i.c0.w(this.g, "alpha", new float[]{1.0f, 0.0f}).b;
                objectAnimator2.setDuration(100L);
                objectAnimator2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                objectAnimator2.addListener(new ey2.g(this, string, x));
                objectAnimator2.start();
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
                animatorSet.addListener(new ey2.h(this, 0));
                android.animation.ObjectAnimator objectAnimator3 = (android.animation.ObjectAnimator) i.c0.w(this.h, "translationX", new float[]{-this.m, 0.0f}).b;
                objectAnimator3.setStartDelay(100L);
                objectAnimator3.setDuration(100L);
                android.animation.ObjectAnimator objectAnimator4 = (android.animation.ObjectAnimator) i.c0.w(this.h, "alpha", new float[]{0.0f, 1.0f}).b;
                objectAnimator4.setStartDelay(100L);
                objectAnimator4.setDuration(100L);
                android.animation.ObjectAnimator objectAnimator5 = (android.animation.ObjectAnimator) i.c0.w(this.g, "translationX", new float[]{-this.m, 0.0f}).b;
                objectAnimator5.setStartDelay(100L);
                objectAnimator5.setDuration(100L);
                android.animation.ObjectAnimator objectAnimator6 = (android.animation.ObjectAnimator) i.c0.w(this.g, "alpha", new float[]{0.0f, 1.0f}).b;
                objectAnimator6.setStartDelay(100L);
                objectAnimator6.setDuration(100L);
                animatorSet.play(objectAnimator3);
                animatorSet.play(objectAnimator4);
                animatorSet.play(objectAnimator5);
                animatorSet.play(objectAnimator6);
                animatorSet.start();
            }
            if (this.f.e.shouldGiveFeedback()) {
                this.d.d(p22.bar.A(this.f.f.asAnalyticsContext(), com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.FEEDBACK));
                int i = com.truecaller.ui.FeedbackFormActivity.k0;
                context.startActivity(ue0.i.F(context));
            } else if (this.f.e.shouldRate()) {
                this.d.d(p22.bar.A(this.f.f.asAnalyticsContext(), com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.RATE));
                java.lang.String b = this.c.b();
                if (b != null) {
                    t41.p.n(context, b);
                }
                ey2.i iVar3 = this.o;
                if (iVar3 != null) {
                    ((com.truecaller.ui.FeedbackDialogActivity) iVar3).d0 = this;
                } else {
                    this.f.e = com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.DUMMY_FINAL;
                }
                z62.d.m("GOOGLE_REVIEW_DONE", true);
                z62.d.k("FEEDBACK_DISMISSED_COUNT", 0L);
            } else if (this.f.e.shouldShare()) {
                this.d.d(p22.bar.A(this.f.f.asAnalyticsContext(), com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.SHARE));
                t41.p.t(context, context.getString(2132018164), context.getString(2132018985), context.getString(2132018984), (android.net.Uri) null);
                this.p = true;
            } else if (this.f.e.shouldInvite()) {
                this.d.d(p22.bar.A(this.f.f.asAnalyticsContext(), com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.INVITE));
                kj2.baz bazVar = (kj2.baz) this.e.get();
                if (bazVar != null) {
                    bazVar.H1(com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.SEARCH_SCREEN_PROMO);
                }
            }
            if (this.f.e.shouldClose()) {
                com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState feedbackItemView$FeedbackItem$FeedbackItemState2 = this.f.e;
                if (feedbackItemView$FeedbackItem$FeedbackItemState2 != com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.RATE_NO && feedbackItemView$FeedbackItem$FeedbackItemState2 != com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.FEEDBACK_NO && feedbackItemView$FeedbackItem$FeedbackItemState2 != com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.SHARE_NO && feedbackItemView$FeedbackItem$FeedbackItemState2 != com.truecaller.ui.components.FeedbackItemView$FeedbackItem$FeedbackItemState.INVITE_NO) {
                    b();
                } else {
                    c();
                }
            }
        }
    }

    public void setDialogStyle(boolean z) {
        this.l = z;
    }

    public void setFeedbackItemListener(ey2.i iVar) {
        this.o = iVar;
    }

    public FeedbackItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            a();
        }
        d(attributeSet, 0);
    }

    public FeedbackItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            a();
        }
        d(attributeSet, i);
    }
}
