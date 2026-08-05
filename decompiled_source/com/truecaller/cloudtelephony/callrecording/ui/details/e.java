package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity a;

    public e(com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity) {
        this.a = callRecordingDetailsActivity;
    }

    public final java.lang.Object invoke() {
        android.view.LayoutInflater layoutInflater = this.a.getLayoutInflater();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        androidx.constraintlayout.widget.ConstraintLayout inflate = layoutInflater.inflate(2131558451, (android.view.ViewGroup) null, false);
        int i = 2131362352;
        if (df0.qux.o(2131362352, inflate) != null) {
            i = 2131362354;
            androidx.appcompat.widget.LinearLayoutCompat o = df0.qux.o(2131362354, inflate);
            if (o != null) {
                d91.w wVar = new d91.w(o, 7);
                i = 2131362358;
                com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = (com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView) df0.qux.o(2131362358, inflate);
                if (callRecordingAudioPlayerView != null) {
                    i = 2131362992;
                    com.google.android.material.chip.ChipGroup o2 = df0.qux.o(2131362992, inflate);
                    if (o2 != null) {
                        int i2 = 2131366717;
                        if (df0.qux.o(2131366717, o2) != null) {
                            i2 = 2131367138;
                            if (df0.qux.o(2131367138, o2) != null) {
                                o61.bar barVar = new o61.bar(o2, 1);
                                i = 2131364005;
                                androidx.fragment.app.FragmentContainerView o3 = df0.qux.o(2131364005, inflate);
                                if (o3 != null) {
                                    i = 2131366560;
                                    android.view.View o4 = df0.qux.o(2131366560, inflate);
                                    if (o4 != null) {
                                        i = 2131366683;
                                        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366683, inflate);
                                        if (textView != null) {
                                            i = 2131367108;
                                            com.google.android.material.appbar.MaterialToolbar o5 = df0.qux.o(2131367108, inflate);
                                            if (o5 != null) {
                                                int i3 = 2131362381;
                                                com.truecaller.common.ui.avatar.AvatarXView o6 = df0.qux.o(2131362381, o5);
                                                if (o6 != null) {
                                                    i3 = 2131362773;
                                                    if (df0.qux.o(2131362773, o5) != null) {
                                                        i3 = 2131363581;
                                                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131363581, o5);
                                                        if (textView2 != null) {
                                                            i3 = 2131365414;
                                                            android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131365414, o5);
                                                            if (textView3 != null) {
                                                                d41.a aVar = new d41.a(o5, o6, textView2, textView3, 22);
                                                                i = 2131367418;
                                                                androidx.viewpager2.widget.ViewPager2 o7 = df0.qux.o(2131367418, inflate);
                                                                if (o7 != null) {
                                                                    return new uz0.bar(inflate, wVar, callRecordingAudioPlayerView, barVar, o3, o4, textView, aVar, o7);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o5.getResources().getResourceName(i3)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o2.getResources().getResourceName(i2)));
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
