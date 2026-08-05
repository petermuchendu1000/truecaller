package com.truecaller.forcedupdate.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/forcedupdate/ui/a;", "Le41/r;", "<init>", "()V", "bar", "forced-update-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a extends e41.r {
    public k0.h l;
    public mp1.bar m;
    public qo1.v n;
    public nc0.bar o;
    public com.truecaller.forcedupdate.UpdateType p;
    public com.truecaller.forcedupdate.ui.f q;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/forcedupdate/ui/a$bar;", "", "forced-update-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    public final java.lang.Integer V4() {
        return 2131232663;
    }

    public final java.lang.String Y4() {
        return null;
    }

    public final java.lang.String Z4() {
        java.lang.String str;
        com.truecaller.forcedupdate.UpdateType updateType = this.p;
        if (updateType != null) {
            int action = updateType.getAction();
            android.content.Context context = getContext();
            if (context != null) {
                str = context.getString(action);
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            return "";
        }
        return "";
    }

    public final java.lang.String a5() {
        java.lang.String str;
        com.truecaller.forcedupdate.UpdateType updateType = this.p;
        if (updateType != null) {
            int description = updateType.getDescription();
            android.content.Context context = getContext();
            if (context != null) {
                str = context.getString(description);
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            return "";
        }
        return "";
    }

    public final java.lang.String b5() {
        java.lang.String str;
        com.truecaller.forcedupdate.UpdateType updateType = this.p;
        if (updateType != null) {
            int title = updateType.getTitle();
            android.content.Context context = getContext();
            if (context != null) {
                str = context.getString(title);
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            return "";
        }
        return "";
    }

    public final void c5() {
    }

    public final void d5() {
        try {
            if (this.p == com.truecaller.forcedupdate.UpdateType.DISCONTINUED) {
                android.content.Context context = getContext();
                if (context != null) {
                    if (this.l != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new android.content.Intent("android.intent.action.UNINSTALL_PACKAGE", android.net.Uri.fromParts("package", context.getPackageName(), null)));
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("appUpdateActionHelper");
                        throw null;
                    }
                }
            } else {
                android.content.Context context2 = getContext();
                if (context2 != null) {
                    k0.h hVar = this.l;
                    if (hVar != null) {
                        mp1.bar barVar = this.m;
                        if (barVar != null) {
                            hVar.B(context2, barVar.a.G("forcedUpdate_link"), "forcedUpdate");
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("forceUpdateManager");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("appUpdateActionHelper");
                        throw null;
                    }
                }
            }
        } catch (android.content.ActivityNotFoundException e) {
            o82.a.C(e);
        }
        com.truecaller.forcedupdate.ui.f fVar = this.q;
        if (fVar != null) {
            fVar.H2();
        }
        dismissAllowingStateLoss();
    }

    public final void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super/*androidx.fragment.app.t*/.onAttach(context);
        if (getParentFragment() instanceof com.truecaller.forcedupdate.ui.f) {
            com.truecaller.forcedupdate.ui.f parentFragment = getParentFragment();
            kotlin.jvm.internal.Intrinsics.e(parentFragment, "null cannot be cast to non-null type com.truecaller.forcedupdate.ui.ForcedUpdateListener");
            this.q = parentFragment;
        }
        android.content.Context applicationContext = requireContext().getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        tx.w wVar = (com.truecaller.forcedupdate.ui.a.bar) f40.d0.z(applicationContext, com.truecaller.forcedupdate.ui.a.bar.class);
        k0.h hVar = new k0.h((x42.bar) wVar.H.b.F3.get());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.l = hVar;
        mp1.bar barVar = (mp1.bar) wVar.G0.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.m = barVar;
        qo1.v vVar = (qo1.v) wVar.d5.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.n = vVar;
        nc0.bar barVar2 = (nc0.bar) wVar.Y.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "<set-?>");
        this.o = barVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.forcedupdate.UpdateType updateType;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        super.onCreate(bundle);
        qo1.v vVar = this.n;
        if (vVar != null) {
            if (!vVar.b.a("featureForcedUpdateDialog", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                dismissAllowingStateLoss();
                return;
            }
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("argForcedUpdateType");
            } else {
                str = null;
            }
            com.truecaller.forcedupdate.UpdateType.Companion.getClass();
            if (str == null) {
                updateType = com.truecaller.forcedupdate.UpdateType.NONE;
            } else {
                try {
                    updateType = com.truecaller.forcedupdate.UpdateType.valueOf(str);
                } catch (java.lang.IllegalArgumentException unused) {
                    updateType = com.truecaller.forcedupdate.UpdateType.NONE;
                }
            }
            this.p = updateType;
            if (updateType == com.truecaller.forcedupdate.UpdateType.NONE) {
                com.truecaller.log.AssertionUtil.report("Update type not specified");
                dismissAllowingStateLoss();
                return;
            }
            if (updateType == null) {
                i = -1;
            } else {
                i = com.truecaller.forcedupdate.ui.b.a[updateType.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        str2 = "LegacyAppDiscontinued";
                    }
                } else {
                    str2 = "LegacyHardUpgrade";
                }
                if (str2 == null) {
                    nc0.bar barVar = this.o;
                    if (barVar != null) {
                        android.os.Bundle arguments2 = getArguments();
                        if (arguments2 == null || (str3 = arguments2.getString("argContext")) == null) {
                            str3 = "n/a";
                        }
                        bd.bar.u(barVar, str2, str3);
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("analytics");
                    throw null;
                }
                return;
            }
            str2 = null;
            if (str2 == null) {
            }
        } else {
            kotlin.jvm.internal.Intrinsics.n("userGrowthFeaturesInventory");
            throw null;
        }
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super/*androidx.fragment.app.t*/.onDismiss(dialogInterface);
        com.truecaller.forcedupdate.ui.f fVar = this.q;
        if (fVar != null) {
            fVar.H2();
        }
    }
}
