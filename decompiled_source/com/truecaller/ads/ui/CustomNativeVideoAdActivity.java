package com.truecaller.ads.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/ui/CustomNativeVideoAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomNativeVideoAdActivity extends androidx.appcompat.app.AppCompatActivity {
    public static u90.qux b0;
    public final kotlin.Lazy a0 = gj.m.J(this, 2131363251);

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        int i;
        int i2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        setContentView(2131558529);
        u90.qux quxVar = b0;
        if (quxVar == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Last holder not set");
            finish();
            return;
        }
        com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd = (com.google.android.gms.ads.nativead.NativeCustomFormatAd) quxVar.a;
        java.lang.String customFormatId = nativeCustomFormatAd.getCustomFormatId();
        com.truecaller.ads.CustomTemplate customTemplate = com.truecaller.ads.CustomTemplate.CLICK_TO_PLAY_VIDEO;
        if (jj3.bar.f(customFormatId, customTemplate.templateId)) {
            try {
                i = android.graphics.Color.parseColor(java.lang.String.valueOf(nativeCustomFormatAd.getText("CTAbuttoncolor")));
            } catch (java.lang.IllegalArgumentException e) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                i = -16777216;
            }
            try {
                i2 = android.graphics.Color.parseColor(java.lang.String.valueOf(nativeCustomFormatAd.getText("CTAbuttontextcolor")));
            } catch (java.lang.IllegalArgumentException e2) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
                i2 = -1;
            }
            java.lang.CharSequence text = nativeCustomFormatAd.getText("CTAtext");
            com.google.android.gms.ads.MediaContent mediaContent = nativeCustomFormatAd.getMediaContent();
            if (mediaContent != null) {
                kotlin.Lazy lazy = this.a0;
                com.truecaller.ads.ui.VideoFrame videoFrame = (com.truecaller.ads.ui.VideoFrame) lazy.getValue();
                android.content.Context context = ((com.truecaller.ads.ui.VideoFrame) lazy.getValue()).getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                com.google.android.gms.ads.nativead.MediaView mediaView = new com.google.android.gms.ads.nativead.MediaView(context);
                mediaView.setMediaContent(mediaContent);
                videoFrame.H(mediaView, mediaContent.getVideoController(), da0.h.a);
            }
            final int i3 = 0;
            findViewById(2131363050).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: da0.b
                public final /* synthetic */ com.truecaller.ads.ui.CustomNativeVideoAdActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.truecaller.ads.ui.CustomNativeVideoAdActivity, android.app.Activity] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i4 = i3;
                    ?? r0 = this.b;
                    switch (i4) {
                        case 0:
                            u90.qux quxVar2 = com.truecaller.ads.ui.CustomNativeVideoAdActivity.b0;
                            ((com.truecaller.ads.ui.VideoFrame) r0.a0.getValue()).removeAllViews();
                            r0.finish();
                            return;
                        default:
                            u90.qux quxVar3 = com.truecaller.ads.ui.CustomNativeVideoAdActivity.b0;
                            if (quxVar3 != null) {
                                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                                intent.setData(android.net.Uri.parse(java.lang.String.valueOf(((com.google.android.gms.ads.nativead.NativeCustomFormatAd) quxVar3.a).getText("ClickURL"))));
                                intent.addFlags(268435456);
                                r0.startActivity(intent);
                            }
                            ((com.truecaller.ads.ui.VideoFrame) r0.a0.getValue()).removeAllViews();
                            r0.finish();
                            return;
                    }
                }
            });
            androidx.appcompat.widget.AppCompatButton findViewById = findViewById(2131365369);
            final int i4 = 1;
            android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[0]}, new int[]{i});
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.i(findViewById, colorStateList);
            findViewById.setTextColor(i2);
            findViewById.setText(text);
            findViewById.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: da0.b
                public final /* synthetic */ com.truecaller.ads.ui.CustomNativeVideoAdActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.truecaller.ads.ui.CustomNativeVideoAdActivity, android.app.Activity] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i42 = i4;
                    ?? r0 = this.b;
                    switch (i42) {
                        case 0:
                            u90.qux quxVar2 = com.truecaller.ads.ui.CustomNativeVideoAdActivity.b0;
                            ((com.truecaller.ads.ui.VideoFrame) r0.a0.getValue()).removeAllViews();
                            r0.finish();
                            return;
                        default:
                            u90.qux quxVar3 = com.truecaller.ads.ui.CustomNativeVideoAdActivity.b0;
                            if (quxVar3 != null) {
                                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                                intent.setData(android.net.Uri.parse(java.lang.String.valueOf(((com.google.android.gms.ads.nativead.NativeCustomFormatAd) quxVar3.a).getText("ClickURL"))));
                                intent.addFlags(268435456);
                                r0.startActivity(intent);
                            }
                            ((com.truecaller.ads.ui.VideoFrame) r0.a0.getValue()).removeAllViews();
                            r0.finish();
                            return;
                    }
                }
            });
            return;
        }
        throw new java.lang.IllegalArgumentException(bar.t("Only ", customTemplate.templateId, " template supported"));
    }

    public final void onDestroy() {
        super.onDestroy();
        b0 = null;
        ((com.truecaller.ads.ui.VideoFrame) this.a0.getValue()).G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        if (z) {
            android.view.View decorView = getWindow().getDecorView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(1798);
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
        }
    }
}
