package com.truecaller.messaging.conversation.voice_notes;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RecordFloatingActionButton extends com.google.android.material.floatingactionbutton.FloatingActionButton implements android.view.View.OnTouchListener {
    public boolean q;
    public com.truecaller.messaging.conversation.voice_notes.RecordView r;
    public float s;
    public final int t;
    public final android.view.GestureDetector u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordFloatingActionButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setClip(android.view.View view) {
        if (view.getParent() != null) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            if (view.getParent() instanceof android.view.View) {
                java.lang.Object parent = view.getParent();
                kotlin.jvm.internal.Intrinsics.e(parent, "null cannot be cast to non-null type android.view.View");
                setClip((android.view.View) parent);
            }
        }
    }

    public final android.animation.AnimatorSet g(float f) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(this, "scaleY", f), android.animation.ObjectAnimator.ofFloat(this, "scaleX", f));
        animatorSet.start();
        return animatorSet;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.conversation.voice_notes.RecordView getRecordView() {
        com.truecaller.messaging.conversation.voice_notes.RecordView recordView = this.r;
        if (recordView != null) {
            return recordView;
        }
        kotlin.jvm.internal.Intrinsics.n("recordView");
        throw null;
    }

    public final boolean getRecordingEnabled() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClip(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (this.q && !this.u.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && motionEvent.getRawX() - this.s > this.t) {
                    com.truecaller.messaging.conversation.voice_notes.RecordView recordView = getRecordView();
                    kotlin.jvm.internal.Intrinsics.e(view, "null cannot be cast to non-null type com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton");
                    recordView.g((com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton) view, motionEvent);
                }
            } else {
                com.truecaller.messaging.conversation.voice_notes.RecordView recordView2 = getRecordView();
                kotlin.jvm.internal.Intrinsics.e(view, "null cannot be cast to non-null type com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton");
                recordView2.h((com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton) view);
            }
        }
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.widget.ImageButton*/.onWindowFocusChanged(z);
        if (this.r != null && !z) {
            getRecordView().i(this);
        }
    }

    public final void setRecordView(@org.jetbrains.annotations.NotNull com.truecaller.messaging.conversation.voice_notes.RecordView recordView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordView, "<set-?>");
        this.r = recordView;
    }

    public final void setRecordingEnabled(boolean z) {
        this.q = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecordFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.t = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.u = new android.view.GestureDetector(context, (android.view.GestureDetector.OnGestureListener) new i13.qux(this, 7));
        setOnTouchListener(this);
    }

    public /* synthetic */ RecordFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
