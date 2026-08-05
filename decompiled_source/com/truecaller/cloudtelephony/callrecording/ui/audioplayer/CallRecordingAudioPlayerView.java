package com.truecaller.cloudtelephony.callrecording.ui.audioplayer;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingAudioPlayerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int H = 0;
    public kotlin.jvm.functions.Function1 A;
    public kotlin.jvm.functions.Function0 B;
    public androidx.media3.exoplayer.ExoPlayer C;
    public final androidx.lifecycle.i0 D;
    public final b01.c E;
    public final b01.b F;
    public final b01.b G;
    public final do1.b s;
    public final java.lang.StringBuilder t;
    public final java.util.Formatter u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public kotlin.jvm.functions.Function0 y;
    public kotlin.jvm.functions.Function1 z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallRecordingAudioPlayerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final java.lang.String F(com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView, long j) {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = callRecordingAudioPlayerView.C;
        if (exoPlayer != null) {
            java.lang.String v = k9.e0.v(callRecordingAudioPlayerView.t, callRecordingAudioPlayerView.u, java.lang.Math.abs(java.lang.Math.max(exoPlayer.getDuration() - j, 0L)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v, "getStringForTime(...)");
            return v;
        }
        kotlin.jvm.internal.Intrinsics.n("exoPlayer");
        throw null;
    }

    public static final void H(com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView) {
        callRecordingAudioPlayerView.setIconContentDescription(2132017602);
        callRecordingAudioPlayerView.setMediaPlayerIcon(2131233523);
    }

    public static final void I(com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView) {
        callRecordingAudioPlayerView.setIconContentDescription(2132017603);
        callRecordingAudioPlayerView.setMediaPlayerIcon(2131233535);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getAudioPlayerRemainingTime() {
        return (android.widget.TextView) this.v.getValue();
    }

    private final android.view.View getPosition() {
        java.lang.Object value = this.x.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final qb.b0 getTimeBar() {
        java.lang.Object value = this.w.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (qb.b0) value;
    }

    private final void setIconContentDescription(int i) {
        do1.b bVar = this.s;
        ((android.widget.ImageView) bVar.g).setContentDescription(((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) bVar.c).getContext().getString(i));
    }

    private final void setMediaPlayerIcon(int i) {
        do1.b bVar = this.s;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bVar.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        gj.m.f0(progressBar);
        android.widget.ImageView imageView = (android.widget.ImageView) bVar.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "playPauseIcon");
        gj.m.j0(imageView);
        imageView.setImageDrawable(((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) bVar.c).getContext().getDrawable(i));
    }

    public final void J(boolean z, final b01.a aVar) {
        do1.b bVar = this.s;
        android.widget.ImageView imageView = (android.widget.ImageView) bVar.f;
        android.widget.ImageView imageView2 = (android.widget.ImageView) bVar.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "forwardIcon");
        gj.m.k0(imageView, true);
        android.widget.ImageView imageView3 = (android.widget.ImageView) bVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView3, "rewindIcon");
        gj.m.k0(imageView3, true);
        if (z) {
            final int i = 0;
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: b01.qux
                /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i2 = i;
                    ?? r5 = this;
                    b01.a aVar2 = aVar;
                    switch (i2) {
                        case 0:
                            if (aVar2 != null) {
                                int i3 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                                aVar2.o0();
                            }
                            androidx.media3.exoplayer.ExoPlayer exoPlayer = r5.C;
                            if (exoPlayer != null) {
                                exoPlayer.seekTo(exoPlayer.getCurrentPosition() + 15000);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                throw null;
                            }
                        case 1:
                            if (aVar2 != null) {
                                int i4 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                                aVar2.p0();
                            }
                            androidx.media3.exoplayer.ExoPlayer exoPlayer2 = r5.C;
                            if (exoPlayer2 != null) {
                                exoPlayer2.seekTo(exoPlayer2.getCurrentPosition() - 15000);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                throw null;
                            }
                        case 2:
                            int i5 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            if (aVar2 != null) {
                                aVar2.o0();
                            }
                            android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                            return;
                        default:
                            int i6 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            if (aVar2 != null) {
                                aVar2.p0();
                            }
                            android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                            return;
                    }
                }
            });
            final int i2 = 1;
            imageView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: b01.qux
                /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i22 = i2;
                    ?? r5 = this;
                    b01.a aVar2 = aVar;
                    switch (i22) {
                        case 0:
                            if (aVar2 != null) {
                                int i3 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                                aVar2.o0();
                            }
                            androidx.media3.exoplayer.ExoPlayer exoPlayer = r5.C;
                            if (exoPlayer != null) {
                                exoPlayer.seekTo(exoPlayer.getCurrentPosition() + 15000);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                throw null;
                            }
                        case 1:
                            if (aVar2 != null) {
                                int i4 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                                aVar2.p0();
                            }
                            androidx.media3.exoplayer.ExoPlayer exoPlayer2 = r5.C;
                            if (exoPlayer2 != null) {
                                exoPlayer2.seekTo(exoPlayer2.getCurrentPosition() - 15000);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                throw null;
                            }
                        case 2:
                            int i5 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            if (aVar2 != null) {
                                aVar2.o0();
                            }
                            android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                            return;
                        default:
                            int i6 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            if (aVar2 != null) {
                                aVar2.p0();
                            }
                            android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                            return;
                    }
                }
            });
            return;
        }
        final int i3 = 2;
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: b01.qux
            /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i3;
                ?? r5 = this;
                b01.a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        if (aVar2 != null) {
                            int i32 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            aVar2.o0();
                        }
                        androidx.media3.exoplayer.ExoPlayer exoPlayer = r5.C;
                        if (exoPlayer != null) {
                            exoPlayer.seekTo(exoPlayer.getCurrentPosition() + 15000);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                            throw null;
                        }
                    case 1:
                        if (aVar2 != null) {
                            int i4 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            aVar2.p0();
                        }
                        androidx.media3.exoplayer.ExoPlayer exoPlayer2 = r5.C;
                        if (exoPlayer2 != null) {
                            exoPlayer2.seekTo(exoPlayer2.getCurrentPosition() - 15000);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                            throw null;
                        }
                    case 2:
                        int i5 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                        if (aVar2 != null) {
                            aVar2.o0();
                        }
                        android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                        return;
                    default:
                        int i6 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                        if (aVar2 != null) {
                            aVar2.p0();
                        }
                        android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                        return;
                }
            }
        });
        final int i4 = 3;
        imageView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: b01.qux
            /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i4;
                ?? r5 = this;
                b01.a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        if (aVar2 != null) {
                            int i32 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            aVar2.o0();
                        }
                        androidx.media3.exoplayer.ExoPlayer exoPlayer = r5.C;
                        if (exoPlayer != null) {
                            exoPlayer.seekTo(exoPlayer.getCurrentPosition() + 15000);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                            throw null;
                        }
                    case 1:
                        if (aVar2 != null) {
                            int i42 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                            aVar2.p0();
                        }
                        androidx.media3.exoplayer.ExoPlayer exoPlayer2 = r5.C;
                        if (exoPlayer2 != null) {
                            exoPlayer2.seekTo(exoPlayer2.getCurrentPosition() - 15000);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                            throw null;
                        }
                    case 2:
                        int i5 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                        if (aVar2 != null) {
                            aVar2.o0();
                        }
                        android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                        return;
                    default:
                        int i6 = com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView.H;
                        if (aVar2 != null) {
                            aVar2.p0();
                        }
                        android.widget.Toast.makeText(r5.getContext(), r5.getContext().getString(2132017566), 0).show();
                        return;
                }
            }
        });
    }

    public final void K() {
        androidx.media3.ui.DefaultTimeBar timeBar = getTimeBar();
        timeBar.getClass();
        b01.c cVar = this.E;
        com.google.common.base.Preconditions.checkNotNull(cVar);
        timeBar.x.add(cVar);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null) {
            exoPlayer.addListener(this.F);
        } else {
            kotlin.jvm.internal.Intrinsics.n("exoPlayer");
            throw null;
        }
    }

    public final void L() {
        getTimeBar().x.remove(this.E);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.F);
        } else {
            kotlin.jvm.internal.Intrinsics.n("exoPlayer");
            throw null;
        }
    }

    public final void M(boolean z) {
        do1.b bVar = this.s;
        if (z) {
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bVar.h;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            gj.m.j0(progressBar);
            android.widget.ImageView imageView = (android.widget.ImageView) bVar.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "playPauseIcon");
            gj.m.h0(imageView);
            return;
        }
        android.widget.ProgressBar progressBar2 = (android.widget.ProgressBar) bVar.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
        gj.m.f0(progressBar2);
        android.widget.ImageView imageView2 = (android.widget.ImageView) bVar.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView2, "playPauseIcon");
        gj.m.j0(imageView2);
    }

    public final void N(boolean z) {
        if (z) {
            gj.m.j0(getPosition());
            android.widget.TextView audioPlayerRemainingTime = getAudioPlayerRemainingTime();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(audioPlayerRemainingTime, "<get-audioPlayerRemainingTime>(...)");
            gj.m.j0(audioPlayerRemainingTime);
            return;
        }
        gj.m.h0(getPosition());
        android.widget.TextView audioPlayerRemainingTime2 = getAudioPlayerRemainingTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(audioPlayerRemainingTime2, "<get-audioPlayerRemainingTime>(...)");
        gj.m.h0(audioPlayerRemainingTime2);
    }

    @org.jetbrains.annotations.NotNull
    public final android.view.View getPlayPauseIcon() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.s.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "playPauseIcon");
        return imageView;
    }

    public final void setContextMenuIconMenuCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "callback");
        android.widget.ImageView imageView = (android.widget.ImageView) this.s.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "contextMenuIcon");
        gj.m.j0(imageView);
        this.B = function0;
    }

    public final void setOnDurationReadyCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "callback");
        this.y = function0;
    }

    public final void setOnPlayAndPauseClickedCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "callback");
        this.z = function1;
    }

    public final void setOnPlaybackSpeedCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "callback");
        android.widget.TextView textView = (android.widget.TextView) this.s.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "playbackSpeed");
        gj.m.j0(textView);
        this.A = function1;
    }

    public final void setPlayer(@org.jetbrains.annotations.NotNull androidx.media3.exoplayer.ExoPlayer exoPlayer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        this.C = exoPlayer;
        this.s.b.setPlayer(exoPlayer);
        exoPlayer.addListener(this.F);
        exoPlayer.addListener(this.G);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallRecordingAudioPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CallRecordingAudioPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        final int i2 = 1;
        yy.qux.F(from, true).inflate(2131558836, (android.view.ViewGroup) this);
        int i3 = 2131363181;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131363181, this);
        if (imageView != null) {
            i3 = 2131364003;
            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364003, this);
            if (imageView2 != null) {
                i3 = 2131365747;
                android.widget.ImageView imageView3 = (android.widget.ImageView) df0.qux.o(2131365747, this);
                if (imageView3 != null) {
                    i3 = 2131365750;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365750, this);
                    if (textView != null) {
                        i3 = 2131365752;
                        androidx.media3.ui.PlayerControlView o = df0.qux.o(2131365752, this);
                        if (o != null) {
                            i3 = 2131365848;
                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) df0.qux.o(2131365848, this);
                            if (progressBar != null) {
                                i3 = 2131366165;
                                android.widget.ImageView imageView4 = (android.widget.ImageView) df0.qux.o(2131366165, this);
                                if (imageView4 != null) {
                                    do1.b bVar = new do1.b(this, imageView, imageView2, imageView3, textView, o, progressBar, imageView4);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                    this.s = bVar;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    this.t = sb;
                                    this.u = new java.util.Formatter(sb, java.util.Locale.getDefault());
                                    final int i4 = 0;
                                    this.v = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: b01.bar
                                        public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView b;

                                        {
                                            this.b = this;
                                        }

                                        public final java.lang.Object invoke() {
                                            int i5 = i4;
                                            com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = this.b;
                                            switch (i5) {
                                                case 0:
                                                    return (android.widget.TextView) ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131366040);
                                                case 1:
                                                    return ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131363760);
                                                default:
                                                    return ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131363758);
                                            }
                                        }
                                    });
                                    this.w = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: b01.bar
                                        public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView b;

                                        {
                                            this.b = this;
                                        }

                                        public final java.lang.Object invoke() {
                                            int i5 = i2;
                                            com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = this.b;
                                            switch (i5) {
                                                case 0:
                                                    return (android.widget.TextView) ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131366040);
                                                case 1:
                                                    return ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131363760);
                                                default:
                                                    return ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131363758);
                                            }
                                        }
                                    });
                                    final int i5 = 2;
                                    this.x = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: b01.bar
                                        public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView b;

                                        {
                                            this.b = this;
                                        }

                                        public final java.lang.Object invoke() {
                                            int i52 = i5;
                                            com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = this.b;
                                            switch (i52) {
                                                case 0:
                                                    return (android.widget.TextView) ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131366040);
                                                case 1:
                                                    return ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131363760);
                                                default:
                                                    return ((com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) callRecordingAudioPlayerView.s.c).findViewById(2131363758);
                                            }
                                        }
                                    });
                                    android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener(this) { // from class: b01.baz
                                        public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            switch (i4) {
                                                case 0:
                                                    com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = this.b;
                                                    androidx.media3.exoplayer.ExoPlayer exoPlayer = callRecordingAudioPlayerView.C;
                                                    if (exoPlayer != null) {
                                                        if (exoPlayer.isPlaying()) {
                                                            exoPlayer.pause();
                                                        } else if (exoPlayer.getPlaybackState() == 4) {
                                                            exoPlayer.seekToDefaultPosition();
                                                            exoPlayer.play();
                                                        } else {
                                                            exoPlayer.play();
                                                        }
                                                        kotlin.jvm.functions.Function1 function1 = callRecordingAudioPlayerView.z;
                                                        if (function1 != null) {
                                                            function1.invoke(java.lang.Boolean.valueOf(exoPlayer.isPlaying()));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                                    throw null;
                                                case 1:
                                                    kotlin.jvm.functions.Function0 function0 = this.b.B;
                                                    if (function0 != null) {
                                                        function0.invoke();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView2 = this.b;
                                                    java.lang.String obj = ((android.widget.TextView) callRecordingAudioPlayerView2.s.e).getText().toString();
                                                    kotlin.jvm.functions.Function1 function12 = callRecordingAudioPlayerView2.A;
                                                    if (function12 != null) {
                                                        function12.invoke(obj);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    };
                                    this.D = new androidx.lifecycle.i0(this, 2);
                                    b01.c cVar = new b01.c(this);
                                    this.E = cVar;
                                    this.F = new b01.b(this, 0);
                                    this.G = new b01.b(this, 1);
                                    int[] iArr = com.truecaller.cloudtelephony.callrecording.R$styleable.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "CallRecordingAudioPlayerView");
                                    android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                                    if (obtainStyledAttributes.getBoolean(0, false)) {
                                        setPadding(bd.bar.q(12), bd.bar.q(14), bd.bar.q(12), bd.bar.q(10));
                                        setBackground(context.getDrawable(2131231410));
                                    }
                                    obtainStyledAttributes.recycle();
                                    setLayoutTransition(new android.animation.LayoutTransition());
                                    androidx.media3.ui.DefaultTimeBar timeBar = getTimeBar();
                                    timeBar.getClass();
                                    com.google.common.base.Preconditions.checkNotNull(cVar);
                                    timeBar.x.add(cVar);
                                    getPlayPauseIcon().setOnClickListener(onClickListener);
                                    imageView.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: b01.baz
                                        public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            switch (i2) {
                                                case 0:
                                                    com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = this.b;
                                                    androidx.media3.exoplayer.ExoPlayer exoPlayer = callRecordingAudioPlayerView.C;
                                                    if (exoPlayer != null) {
                                                        if (exoPlayer.isPlaying()) {
                                                            exoPlayer.pause();
                                                        } else if (exoPlayer.getPlaybackState() == 4) {
                                                            exoPlayer.seekToDefaultPosition();
                                                            exoPlayer.play();
                                                        } else {
                                                            exoPlayer.play();
                                                        }
                                                        kotlin.jvm.functions.Function1 function1 = callRecordingAudioPlayerView.z;
                                                        if (function1 != null) {
                                                            function1.invoke(java.lang.Boolean.valueOf(exoPlayer.isPlaying()));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                                    throw null;
                                                case 1:
                                                    kotlin.jvm.functions.Function0 function0 = this.b.B;
                                                    if (function0 != null) {
                                                        function0.invoke();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView2 = this.b;
                                                    java.lang.String obj = ((android.widget.TextView) callRecordingAudioPlayerView2.s.e).getText().toString();
                                                    kotlin.jvm.functions.Function1 function12 = callRecordingAudioPlayerView2.A;
                                                    if (function12 != null) {
                                                        function12.invoke(obj);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    textView.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: b01.baz
                                        public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            switch (i5) {
                                                case 0:
                                                    com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = this.b;
                                                    androidx.media3.exoplayer.ExoPlayer exoPlayer = callRecordingAudioPlayerView.C;
                                                    if (exoPlayer != null) {
                                                        if (exoPlayer.isPlaying()) {
                                                            exoPlayer.pause();
                                                        } else if (exoPlayer.getPlaybackState() == 4) {
                                                            exoPlayer.seekToDefaultPosition();
                                                            exoPlayer.play();
                                                        } else {
                                                            exoPlayer.play();
                                                        }
                                                        kotlin.jvm.functions.Function1 function1 = callRecordingAudioPlayerView.z;
                                                        if (function1 != null) {
                                                            function1.invoke(java.lang.Boolean.valueOf(exoPlayer.isPlaying()));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                                                    throw null;
                                                case 1:
                                                    kotlin.jvm.functions.Function0 function0 = this.b.B;
                                                    if (function0 != null) {
                                                        function0.invoke();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView2 = this.b;
                                                    java.lang.String obj = ((android.widget.TextView) callRecordingAudioPlayerView2.s.e).getText().toString();
                                                    kotlin.jvm.functions.Function1 function12 = callRecordingAudioPlayerView2.A;
                                                    if (function12 != null) {
                                                        function12.invoke(obj);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }

    public /* synthetic */ CallRecordingAudioPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
