package com.truecaller.swish.ui.input;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/swish/ui/input/SwishInputActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lgw2/qux;", "<init>", "()V", "swish-integration_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SwishInputActivity extends com.truecaller.swish.ui.input.Hilt_SwishInputActivity implements gw2.qux {
    public static final /* synthetic */ int g0 = 0;
    public gw2.a d0;
    public cw2.bar e0;
    public final w31.c f0 = new w31.c(new u03.g0(this), 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.swish.ui.input.Hilt_SwishInputActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        setTheme(2132083917);
        super.onCreate(bundle);
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558505, (android.view.ViewGroup) null, false);
        int i = 2131362239;
        android.widget.EditText editText = (android.widget.EditText) df0.qux.o(2131362239, inflate);
        if (editText != null) {
            i = 2131363131;
            com.truecaller.common.ui.avatar.AvatarXView o = df0.qux.o(2131363131, inflate);
            if (o != null) {
                i = 2131363232;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131363232, inflate);
                if (textView != null) {
                    i = 2131365317;
                    android.widget.EditText editText2 = (android.widget.EditText) df0.qux.o(2131365317, inflate);
                    if (editText2 != null) {
                        i = 2131365421;
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131365421, inflate);
                        if (textView2 != null) {
                            i = 2131365540;
                            android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131365540, inflate);
                            if (textView3 != null) {
                                i = 2131366350;
                                android.widget.Button button = (android.widget.Button) df0.qux.o(2131366350, inflate);
                                if (button != null) {
                                    i = 2131366351;
                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131366351, inflate);
                                    if (frameLayout != null) {
                                        i = 2131367108;
                                        androidx.appcompat.widget.Toolbar o2 = df0.qux.o(2131367108, inflate);
                                        if (o2 != null) {
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                            cw2.bar barVar = new cw2.bar(constraintLayout, editText, o, textView, editText2, textView2, textView3, button, frameLayout, o2);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                                            this.e0 = barVar;
                                            setContentView(constraintLayout);
                                            cw2.bar barVar2 = this.e0;
                                            if (barVar2 != null) {
                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = barVar2.e;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                                                ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                                cw2.bar barVar3 = this.e0;
                                                if (barVar3 != null) {
                                                    setSupportActionBar((androidx.appcompat.widget.Toolbar) barVar3.k);
                                                    i.baz supportActionBar = getSupportActionBar();
                                                    if (supportActionBar != null) {
                                                        supportActionBar.p(true);
                                                    }
                                                    i.baz supportActionBar2 = getSupportActionBar();
                                                    if (supportActionBar2 != null) {
                                                        supportActionBar2.v(2131232077);
                                                    }
                                                    t0().u0(this);
                                                    android.content.Intent intent = getIntent();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                                                    android.os.Parcelable parcelable = (android.os.Parcelable) g6.b.g(intent, "payee_data", com.truecaller.swish.model.SwishPayeeData.class);
                                                    if (parcelable != null) {
                                                        com.truecaller.swish.model.SwishPayeeData swishPayeeData = (com.truecaller.swish.model.SwishPayeeData) parcelable;
                                                        com.truecaller.swish.model.SwishNumber swishNumber = swishPayeeData.d;
                                                        cw2.bar barVar4 = this.e0;
                                                        if (barVar4 != null) {
                                                            barVar4.f.setPresenter(this.f0);
                                                            gw2.a t0 = t0();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swishPayeeData, "payeeData");
                                                            java.lang.String str = swishNumber.a;
                                                            java.lang.String d = ((bw2.qux) t0.b).d(str);
                                                            if (d == null) {
                                                                "Unable to parse normalized number for Swish ".concat(str);
                                                                gw2.qux quxVar = (gw2.qux) t0.a;
                                                                if (quxVar != null) {
                                                                    quxVar.finish();
                                                                }
                                                            } else {
                                                                t0.e = d;
                                                                java.lang.String str2 = swishPayeeData.b;
                                                                if (str2 == null || kotlin.text.StringsKt.X(str2)) {
                                                                    str2 = null;
                                                                }
                                                                if (str2 != null) {
                                                                    str = str2;
                                                                }
                                                                java.lang.String str3 = swishNumber.b;
                                                                if (!swishPayeeData.c) {
                                                                    str3 = null;
                                                                }
                                                                if (str3 == null) {
                                                                    str3 = "";
                                                                }
                                                                gw2.qux quxVar2 = (gw2.qux) t0.a;
                                                                if (quxVar2 != null) {
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
                                                                    cw2.bar barVar5 = ((com.truecaller.swish.ui.input.SwishInputActivity) quxVar2).e0;
                                                                    if (barVar5 != null) {
                                                                        barVar5.h.setText(str);
                                                                    } else {
                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                }
                                                                gw2.qux quxVar3 = (gw2.qux) t0.a;
                                                                if (quxVar3 != null) {
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "number");
                                                                    cw2.bar barVar6 = ((com.truecaller.swish.ui.input.SwishInputActivity) quxVar3).e0;
                                                                    if (barVar6 != null) {
                                                                        ((android.widget.TextView) barVar6.i).setText(str3);
                                                                    } else {
                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                }
                                                                gw2.qux quxVar4 = (gw2.qux) t0.a;
                                                                if (quxVar4 != null) {
                                                                    com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = swishPayeeData.a;
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarXConfig");
                                                                    ((com.truecaller.swish.ui.input.SwishInputActivity) quxVar4).f0.C2(avatarXConfig, false);
                                                                }
                                                            }
                                                            cw2.bar barVar7 = this.e0;
                                                            if (barVar7 != null) {
                                                                android.widget.EditText editText3 = (android.widget.EditText) barVar7.c;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText3, "amountEditText");
                                                                editText3.addTextChangedListener(new com.truecaller.common.ui.d(this, 7));
                                                                cw2.bar barVar8 = this.e0;
                                                                if (barVar8 != null) {
                                                                    ((android.widget.EditText) barVar8.c).setFilters(new android.text.InputFilter[]{new android.text.InputFilter() { // from class: gw2.bar
                                                                        @Override // android.text.InputFilter
                                                                        public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i2, int i3, android.text.Spanned spanned, int i4, int i5) {
                                                                            java.lang.Double c2;
                                                                            int i6;
                                                                            boolean z;
                                                                            int i7 = com.truecaller.swish.ui.input.SwishInputActivity.g0;
                                                                            gw2.a t02 = com.truecaller.swish.ui.input.SwishInputActivity.this.t0();
                                                                            kotlin.jvm.internal.Intrinsics.d(charSequence);
                                                                            kotlin.jvm.internal.Intrinsics.d(spanned);
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "source");
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanned, "dest");
                                                                            java.lang.String obj = charSequence.subSequence(i2, i3).toString();
                                                                            java.lang.String obj2 = spanned.subSequence(i4, i5).toString();
                                                                            java.lang.String q = h8.s0.q(spanned.subSequence(0, i4).toString(), obj, spanned.subSequence(i5, spanned.length()).toString());
                                                                            if (t02.f.f(q) && (c2 = gw2.a.c2(q)) != null && c2.doubleValue() >= 0.0d && c2.doubleValue() <= 150000.0d) {
                                                                                gw2.qux quxVar5 = (gw2.qux) t02.a;
                                                                                boolean z2 = true;
                                                                                if (quxVar5 != null) {
                                                                                    if (c2.doubleValue() >= 1.0d) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    cw2.bar barVar9 = ((com.truecaller.swish.ui.input.SwishInputActivity) quxVar5).e0;
                                                                                    if (barVar9 != null) {
                                                                                        ((android.widget.Button) barVar9.b).setEnabled(z);
                                                                                    } else {
                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                gw2.qux quxVar6 = (gw2.qux) t02.a;
                                                                                if (quxVar6 != null) {
                                                                                    if (q.length() <= 0) {
                                                                                        z2 = false;
                                                                                    }
                                                                                    cw2.bar barVar10 = ((com.truecaller.swish.ui.input.SwishInputActivity) quxVar6).e0;
                                                                                    if (barVar10 != null) {
                                                                                        android.widget.TextView textView4 = barVar10.g;
                                                                                        if (z2) {
                                                                                            i6 = 0;
                                                                                        } else {
                                                                                            i6 = 8;
                                                                                        }
                                                                                        textView4.setVisibility(i6);
                                                                                    } else {
                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                if (!kotlin.text.StringsKt.N(obj, ".", false)) {
                                                                                    return null;
                                                                                }
                                                                                return kotlin.text.y.s(obj, ".", ",", false);
                                                                            }
                                                                            return obj2;
                                                                        }
                                                                    }});
                                                                    cw2.bar barVar9 = this.e0;
                                                                    if (barVar9 != null) {
                                                                        ((android.widget.Button) barVar9.b).setOnClickListener(new gr2.bar(this, 1));
                                                                        cw2.bar barVar10 = this.e0;
                                                                        if (barVar10 != null) {
                                                                            ((android.widget.EditText) barVar10.c).requestFocus();
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    throw new java.lang.IllegalArgumentException("Missing extras!");
                                                }
                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.truecaller.swish.ui.input.Hilt_SwishInputActivity
    public final void onDestroy() {
        t0().a = null;
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final gw2.a t0() {
        gw2.a aVar = this.d0;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
