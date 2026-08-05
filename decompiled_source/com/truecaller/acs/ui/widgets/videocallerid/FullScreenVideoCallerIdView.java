package com.truecaller.acs.ui.widgets.videocallerid;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FullScreenVideoCallerIdView extends com.truecaller.videocallerid.ui.videoplayer.FullScreenVideoPlayerView {
    public final kotlin.Lazy l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenVideoCallerIdView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void g(com.truecaller.acs.ui.widgets.videocallerid.FullScreenVideoCallerIdView fullScreenVideoCallerIdView, fg3.e0 e0Var) {
        b00.a viewModel = fullScreenVideoCallerIdView.getViewModel();
        if (viewModel != null) {
            b00.c cVar = viewModel.k;
            df3.bar barVar = null;
            if (cVar != null) {
                ig3.h2 h2Var = cVar.b;
                if (h2Var != null) {
                    ig3.w1.F(new androidx.room.o(25, h2Var, new b00.b(fullScreenVideoCallerIdView, barVar, 1)), e0Var);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("viewObject");
            throw null;
        }
    }

    private final b00.a getViewModel() {
        return (b00.a) this.l.getValue();
    }

    public static final void h(com.truecaller.acs.ui.widgets.videocallerid.FullScreenVideoCallerIdView fullScreenVideoCallerIdView, fg3.e0 e0Var) {
        b00.a viewModel = fullScreenVideoCallerIdView.getViewModel();
        if (viewModel != null) {
            b00.c cVar = viewModel.k;
            df3.bar barVar = null;
            if (cVar != null) {
                ig3.h2 h2Var = cVar.a;
                if (h2Var != null) {
                    ig3.w1.F(new androidx.room.o(25, h2Var, new b00.b(fullScreenVideoCallerIdView, barVar, 2)), e0Var);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("viewObject");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        java.lang.Object obj;
        super/*p23.b*/.onAttachedToWindow();
        b00.a viewModel = getViewModel();
        df3.bar barVar = null;
        if (viewModel != null) {
            ig3.f2 playingState = getPlayingState();
            ig3.f2 audioStateFlow = getAudioStateFlow();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playingState, "playingState");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStateFlow, "audioState");
            viewModel.k = new b00.c();
            viewModel.j = playingState;
            ig3.n1 a = viewModel.e.a();
            q23.m mVar = (q23.m) playingState.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "<this>");
            if (kotlin.jvm.internal.Intrinsics.b(mVar, q23.i.a)) {
                obj = c00.bar.a;
            } else {
                boolean b = kotlin.jvm.internal.Intrinsics.b(mVar, q23.g.a);
                c00.a aVar = c00.a.a;
                if (!b && !kotlin.jvm.internal.Intrinsics.b(mVar, q23.l.a)) {
                    if (mVar instanceof q23.k) {
                        obj = c00.qux.a;
                    } else if (!kotlin.jvm.internal.Intrinsics.b(mVar, q23.j.a) && !(mVar instanceof q23.h)) {
                        throw new java.lang.RuntimeException();
                    }
                }
                obj = aVar;
            }
            a.e(obj);
            ig3.w1.F(new androidx.room.o(25, audioStateFlow, new b00.baz(viewModel, barVar, 0)), androidx.lifecycle.g1.l(viewModel));
            ig3.w1.F(new androidx.room.o(25, ((zz.bar) viewModel.g.b).a, new b00.baz(viewModel, barVar, 1)), androidx.lifecycle.g1.l(viewModel));
            ig3.w1.F(new androidx.room.o(25, new a61.b((ig3.h2) viewModel.c.a, viewModel.d.a, new b00.qux(3, 0, null), 4), new b00.baz(viewModel, barVar, 2)), androidx.lifecycle.g1.l(viewModel));
            ig3.f2 f2Var = viewModel.j;
            if (f2Var != null) {
                ig3.w1.F(new androidx.room.o(25, f2Var, new b00.baz(viewModel, barVar, 3)), androidx.lifecycle.g1.l(viewModel));
            } else {
                kotlin.jvm.internal.Intrinsics.n("playingState");
                throw null;
            }
        }
        gj.m.Y(this, new b00.b(this, barVar, 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenVideoCallerIdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenVideoCallerIdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.l = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 1));
    }

    public /* synthetic */ FullScreenVideoCallerIdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
