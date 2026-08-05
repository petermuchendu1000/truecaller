package com.truecaller.messaging.conversation.voice_notes;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RecordView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int q = 0;
    public w12.b a;
    public long b;
    public float c;
    public float d;
    public long e;
    public android.media.MediaRecorder f;
    public boolean g;
    public boolean h;
    public final java.lang.String i;
    public final int j;
    public final android.os.Handler k;
    public v6.g l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final p.f1 p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/messaging/conversation/voice_notes/RecordView$RecordState;", "", "icon", "", "color", "<init>", "(Ljava/lang/String;III)V", "getIcon", "()I", "getColor", "RECORD", "DELETE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class RecordState {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState[] $VALUES;
        private final int color;
        private final int icon;
        public static final com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState RECORD = new com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState("RECORD", 0, 2131232866, 2130970634);
        public static final com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState DELETE = new com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState("DELETE", 1, 2131233356, 2130970571);

        private static final /* synthetic */ com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState[] $values() {
            return new com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState[]{RECORD, DELETE};
        }

        static {
            com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private RecordState(java.lang.String str, int i, int i2, int i3) {
            this.icon = i2;
            this.color = i3;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState valueOf(java.lang.String str) {
            return (com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState.class, str);
        }

        public static com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState[] values() {
            return (com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState[]) $VALUES.clone();
        }

        public final int getColor() {
            return this.color;
        }

        public final int getIcon() {
            return this.icon;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(com.truecaller.messaging.conversation.voice_notes.RecordView recordView, com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton, int i) {
        if (i == 800) {
            recordView.j();
            or2.z0 z0Var = recordView.a;
            if (z0Var != null) {
                z0Var.w(recordView.i);
            }
            gj.m.k0(recordView, false);
            android.widget.TextView tvSlideToCancel = recordView.getTvSlideToCancel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tvSlideToCancel, "<get-tvSlideToCancel>(...)");
            recordView.d(recordFloatingActionButton, tvSlideToCancel, recordView.c);
        }
    }

    private final android.view.View getGuidelineThreshold() {
        return (android.view.View) this.m.getValue();
    }

    private final android.widget.TextView getTvSlideToCancel() {
        return (android.widget.TextView) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.truecaller.messaging.conversation.voice_notes.RecorderVisualizerView getVisualizerView() {
        return (com.truecaller.messaging.conversation.voice_notes.RecorderVisualizerView) this.o.getValue();
    }

    public final void b(com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordFloatingActionButton, "recordBtn");
        if (this.g) {
            gj.m.k0(this, false);
            android.widget.TextView tvSlideToCancel = getTvSlideToCancel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tvSlideToCancel, "<get-tvSlideToCancel>(...)");
            d(recordFloatingActionButton, tvSlideToCancel, this.c);
            j();
            com.bumptech.glide.qux.K(new java.io.File(this.i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton, android.widget.TextView textView, float f) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(recordFloatingActionButton.getX(), f);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ao.c(recordFloatingActionButton, 13));
        recordFloatingActionButton.g(1.0f);
        ofFloat.setDuration(0L);
        ofFloat.start();
        gj.m.j0(textView);
        k(recordFloatingActionButton, com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState.RECORD);
    }

    public final void e(java.lang.Exception exc) {
        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(exc);
        this.g = false;
        or2.z0 z0Var = this.a;
        if (z0Var != null) {
            p02.i1 i1Var = (p02.i1) ((p02.s0) z0Var.a).j;
            p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
            if (j1Var != null) {
                p02.s0 s0Var = (p02.s0) j1Var;
                s0Var.L0.e();
                s0Var.L0.setVisible(false);
            }
            i1Var.T2();
        }
        com.bumptech.glide.qux.K(new java.io.File(this.i));
        this.k.removeCallbacks(this.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(final com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton) {
        com.truecaller.data.entity.messaging.Participant participant;
        com.truecaller.data.entity.messaging.Participant[] participantArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordFloatingActionButton, "recordButton");
        com.truecaller.messaging.conversation.voice_notes.RecorderVisualizerView visualizerView = getVisualizerView();
        visualizerView.a.clear();
        visualizerView.invalidate();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.l = l6.bar.f(ak.r0.z(context));
        android.media.MediaRecorder mediaRecorder = new android.media.MediaRecorder();
        mediaRecorder.reset();
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setMaxDuration((int) this.b);
        mediaRecorder.setOutputFile(this.i);
        mediaRecorder.setOnInfoListener(new android.media.MediaRecorder.OnInfoListener() { // from class: w12.a
            @Override // android.media.MediaRecorder.OnInfoListener
            public final void onInfo(android.media.MediaRecorder mediaRecorder2, int i, int i2) {
                com.truecaller.messaging.conversation.voice_notes.RecordView.a(com.truecaller.messaging.conversation.voice_notes.RecordView.this, recordFloatingActionButton, i);
            }
        });
        try {
            mediaRecorder.prepare();
            mediaRecorder.start();
            this.g = true;
        } catch (java.io.IOException e) {
            e(e);
            android.media.MediaRecorder mediaRecorder2 = this.f;
            if (mediaRecorder2 != null) {
                mediaRecorder2.release();
            }
        } catch (java.lang.IllegalStateException e2) {
            e(e2);
            android.media.MediaRecorder mediaRecorder3 = this.f;
            if (mediaRecorder3 != null) {
                mediaRecorder3.release();
            }
        }
        this.f = mediaRecorder;
        this.k.post(this.p);
        recordFloatingActionButton.g(2.0f);
        this.c = recordFloatingActionButton.getX();
        gj.m.j0(this);
        this.e = java.lang.System.currentTimeMillis();
        or2.z0 z0Var = this.a;
        if (z0Var != null) {
            p02.s0 s0Var = (p02.s0) z0Var.a;
            s0Var.k.x2();
            p02.i1 i1Var = (p02.i1) s0Var.j;
            i1Var.I.i("Initiate");
            i1Var.E.c = true;
            i1Var.U2(true);
            com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState recordState = i1Var.e0;
            com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState recordState2 = com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState.RECORD;
            if (recordState != recordState2) {
                i1Var.e0 = recordState2;
                p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                if (j1Var != null) {
                    ((p02.s0) j1Var).L0.g();
                }
                com.truecaller.messaging.data.types.Draft draft = i1Var.V;
                if (draft != null && (participantArr = draft.e) != null) {
                    participant = (com.truecaller.data.entity.messaging.Participant) kotlin.collections.v.E(participantArr);
                } else {
                    participant = null;
                }
                if (i1Var.f0 == null && participant != null) {
                    i1Var.f0 = i1Var.J.e(participant, i1Var.d, com.truecaller.api.services.messenger.v1.models.input.InputUserTypingKind.VOICE_RECORDING);
                }
            }
            s0Var.L0.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordFloatingActionButton, "recordButton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.g) {
            boolean a = mz1.bar.a();
            int i = this.j;
            if (a) {
                if (motionEvent.getRawX() <= this.c || motionEvent.getRawX() > i - (recordFloatingActionButton.getWidth() / 2)) {
                    return;
                }
            } else if (motionEvent.getRawX() >= this.c || motionEvent.getRawX() < i - (recordFloatingActionButton.getWidth() / 2)) {
                return;
            }
            recordFloatingActionButton.animate().x(motionEvent.getRawX()).setDuration(0L).start();
            if (this.d == 0.0f) {
                this.d = this.c;
            }
            if (!mz1.bar.a() ? !(motionEvent.getRawX() >= this.d || motionEvent.getRawX() > getGuidelineThreshold().getX()) : !(motionEvent.getRawX() <= this.d || motionEvent.getRawX() < getGuidelineThreshold().getX() || getGuidelineThreshold().getX() == 0.0f)) {
                com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState recordState = com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState.DELETE;
                k(recordFloatingActionButton, recordState);
                getTvSlideToCancel().setVisibility(4);
                or2.z0 z0Var = this.a;
                if (z0Var != null) {
                    p02.i1 i1Var = (p02.i1) ((p02.s0) z0Var.a).j;
                    if (i1Var.e0 != recordState) {
                        i1Var.e0 = recordState;
                        p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                        if (j1Var != null) {
                            ((p02.s0) j1Var).L0.f();
                        }
                    }
                }
                this.h = true;
            } else if (!mz1.bar.a() ? !(motionEvent.getRawX() <= this.d || motionEvent.getRawX() <= getGuidelineThreshold().getX()) : !(motionEvent.getRawX() >= this.d || motionEvent.getRawX() >= getGuidelineThreshold().getX())) {
                com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState recordState2 = com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState.RECORD;
                k(recordFloatingActionButton, recordState2);
                getTvSlideToCancel().setVisibility(0);
                or2.z0 z0Var2 = this.a;
                if (z0Var2 != null) {
                    p02.i1 i1Var2 = (p02.i1) ((p02.s0) z0Var2.a).j;
                    if (i1Var2.e0 != recordState2) {
                        i1Var2.e0 = recordState2;
                        p02.j1 j1Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                        if (j1Var2 != null) {
                            ((p02.s0) j1Var2).L0.g();
                        }
                    }
                }
                this.h = false;
            }
            this.d = motionEvent.getRawX();
        }
    }

    public final long getMaxDurationMs() {
        return this.b;
    }

    @org.jetbrains.annotations.Nullable
    public final w12.b getRecordListener() {
        return this.a;
    }

    public final void h(com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordFloatingActionButton, "recordButton");
        if (!this.g) {
            return;
        }
        gj.m.k0(this, false);
        android.widget.TextView tvSlideToCancel = getTvSlideToCancel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tvSlideToCancel, "<get-tvSlideToCancel>(...)");
        d(recordFloatingActionButton, tvSlideToCancel, this.c);
        new android.os.Handler().postDelayed(new rr1.b0(this, 24), 300L);
    }

    public final void i(com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordFloatingActionButton, "recordBtn");
        if (this.g) {
            or2.z0 z0Var = this.a;
            if (z0Var != null) {
                z0Var.v();
            }
            gj.m.k0(this, false);
            android.widget.TextView tvSlideToCancel = getTvSlideToCancel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tvSlideToCancel, "<get-tvSlideToCancel>(...)");
            d(recordFloatingActionButton, tvSlideToCancel, this.c);
            j();
            com.bumptech.glide.qux.K(new java.io.File(this.i));
        }
    }

    public final void j() {
        v6.g gVar;
        this.k.removeCallbacks(this.p);
        this.h = false;
        try {
            android.media.MediaRecorder mediaRecorder = this.f;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            this.g = false;
            gVar = this.l;
        } catch (java.lang.RuntimeException e) {
            e(e);
        }
        if (gVar != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            android.media.AudioManager z = ak.r0.z(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z, "audioManager");
            m03.n.x(z, (android.media.AudioFocusRequest) gVar.a);
            android.media.MediaRecorder mediaRecorder2 = this.f;
            if (mediaRecorder2 != null) {
                mediaRecorder2.release();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("audioFocusHandler");
        throw null;
    }

    public final void k(com.truecaller.messaging.conversation.voice_notes.RecordFloatingActionButton recordFloatingActionButton, com.truecaller.messaging.conversation.voice_notes.RecordView.RecordState recordState) {
        recordFloatingActionButton.setBackgroundTintList(bi3.a.t(recordState.getColor(), getContext()));
        android.content.res.Resources resources = getContext().getResources();
        int icon = recordState.getIcon();
        android.content.res.Resources.Theme theme = getContext().getTheme();
        java.lang.ThreadLocal threadLocal = i6.h.a;
        android.graphics.drawable.Drawable drawable = resources.getDrawable(icon, theme);
        java.util.Objects.requireNonNull(drawable);
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        mutate.setTint(getResources().getColor(2131101909));
        recordFloatingActionButton.setImageDrawable(mutate);
    }

    public final void setMaxDurationMs(long j) {
        this.b = j;
    }

    public final void setRecordListener(@org.jetbrains.annotations.Nullable w12.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.i = context.getCacheDir() + "/voice-note" + java.lang.System.currentTimeMillis() + ".aac";
        this.j = getResources().getDisplayMetrics().widthPixels / 2;
        this.k = new android.os.Handler();
        this.m = gj.m.I(2131364377, this);
        this.n = gj.m.I(2131367219, this);
        this.o = gj.m.I(2131367567, this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131561073, this);
        android.widget.TextView tvSlideToCancel = getTvSlideToCancel();
        r6.baz bazVar = t41.i.a;
        android.content.res.ColorStateList t = bi3.a.t(2130970936, context);
        android.graphics.drawable.Drawable mutate = t41.i.d(2131234288, context).mutate();
        mutate.setTintList(t);
        tvSlideToCancel.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        com.truecaller.messaging.conversation.voice_notes.RecorderVisualizerView visualizerView = getVisualizerView();
        visualizerView.a.clear();
        visualizerView.invalidate();
        gj.m.k0(this, false);
        this.p = new p.f1(this, 10);
    }

    public /* synthetic */ RecordView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
