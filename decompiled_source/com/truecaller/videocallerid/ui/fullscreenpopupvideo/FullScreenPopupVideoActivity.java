package com.truecaller.videocallerid.ui.fullscreenpopupvideo;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/FullScreenPopupVideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ak/e1", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FullScreenPopupVideoActivity extends com.truecaller.videocallerid.ui.fullscreenpopupvideo.Hilt_FullScreenPopupVideoActivity {
    public static final /* synthetic */ int f0 = 0;
    public final kotlin.Lazy d0;
    public final kotlin.Lazy e0;

    public FullScreenPopupVideoActivity() {
        final int i = 0;
        this.d0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: l23.bar
            public final /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.FullScreenPopupVideoActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.videocallerid.ui.fullscreenpopupvideo.FullScreenPopupVideoActivity.f0;
                        return android.view.animation.AnimationUtils.loadAnimation(appCompatActivity, 2130772076);
                    default:
                        int i4 = com.truecaller.videocallerid.ui.fullscreenpopupvideo.FullScreenPopupVideoActivity.f0;
                        return android.view.animation.AnimationUtils.loadAnimation(appCompatActivity, 2130772077);
                }
            }
        });
        final int i2 = 1;
        this.e0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: l23.bar
            public final /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.FullScreenPopupVideoActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.videocallerid.ui.fullscreenpopupvideo.FullScreenPopupVideoActivity.f0;
                        return android.view.animation.AnimationUtils.loadAnimation(appCompatActivity, 2130772076);
                    default:
                        int i4 = com.truecaller.videocallerid.ui.fullscreenpopupvideo.FullScreenPopupVideoActivity.f0;
                        return android.view.animation.AnimationUtils.loadAnimation(appCompatActivity, 2130772077);
                }
            }
        });
    }

    public final void finish() {
        android.view.View view;
        android.view.View view2;
        android.view.animation.Animation animation = (android.view.animation.Animation) this.e0.getValue();
        animation.setFillAfter(true);
        animation.setAnimationListener(new l23.baz(this, 0));
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(android.R.id.content);
        if (F != null && (view2 = F.getView()) != null) {
            view = view2.findViewById(2131364253);
        } else {
            view = null;
        }
        if (view != null) {
            view.startAnimation(animation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.videocallerid.ui.fullscreenpopupvideo.Hilt_FullScreenPopupVideoActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
        l23.b.k.getClass();
        j.g(android.R.id.content, new l23.b(), (java.lang.String) null);
        j.l();
    }

    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        finish();
    }

    public final void onStart() {
        android.view.View view;
        android.view.View view2;
        super.onStart();
        kotlin.Lazy lazy = this.d0;
        if (!((android.view.animation.Animation) lazy.getValue()).hasStarted()) {
            androidx.fragment.app.Fragment F = getSupportFragmentManager().F(android.R.id.content);
            if (F != null && (view2 = F.getView()) != null) {
                view = view2.findViewById(2131364253);
            } else {
                view = null;
            }
            if (view != null) {
                view.startAnimation((android.view.animation.Animation) lazy.getValue());
            }
        }
    }
}
