package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e implements com.truecaller.ui.c0 {
    public final /* synthetic */ int a = 0;
    public final qc3.bar b;
    public final java.lang.Object c;

    public e(qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "referralManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "growthMarketUtils");
        this.b = barVar;
        this.c = barVar2;
    }

    @Override // com.truecaller.ui.c0
    public final void a(android.net.Uri uri, android.os.Bundle bundle) {
        int i = this.a;
        java.lang.String str = null;
        qc3.bar barVar = this.b;
        java.lang.Object obj = this.c;
        switch (i) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "extras");
                if (bundle.getBoolean("is_dial_pad_auto_open") && !((cg1.qux) barVar.get()).a()) {
                    android.content.Context context = (android.content.Context) obj;
                    int i2 = com.truecaller.dialer.ui.DialerActivity.h0;
                    context.startActivity(b91.c.l(context, (java.lang.String) null, com.truecaller.common_call_log.data.FilterType.NONE, "dialpadShortcut"));
                    bundle.putBoolean("is_dial_pad_auto_open", false);
                    return;
                }
                return;
            default:
                qc3.bar barVar2 = (qc3.bar) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "extras");
                kj2.baz bazVar = (kj2.baz) barVar.get();
                if (bazVar != null) {
                    java.lang.String string = bundle.getString("c");
                    if (string != null) {
                        bazVar.i2(string);
                        return;
                    }
                    if (uri != null) {
                        str = uri.toString();
                    }
                    bazVar.F3(str);
                    if (bundle.getString("LAUNCH_MODE") != null) {
                        java.lang.String string2 = bundle.getString("LAUNCH_MODE");
                        if (string2 != null) {
                            char c = 65535;
                            switch (string2.hashCode()) {
                                case 887528847:
                                    if (string2.equals("MODE_REFERRAL_GRANTED_VIEW")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 1251073302:
                                    if (string2.equals("MODE_REFERRAL_ON_BOARDING")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1886261286:
                                    if (string2.equals("MODE_REFER_MORE_FRIENDS")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 2003878147:
                                    if (string2.equals("MODE_SHOW_REFERRAL")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    java.lang.String string3 = bundle.getString("REFERRAL_GRANTED_MESSAGE");
                                    com.truecaller.log.AssertionUtil.isNotNull(string3, new java.lang.String[0]);
                                    bazVar.t2(string3);
                                    break;
                                case 1:
                                    bazVar.A1();
                                    break;
                                case 2:
                                    bazVar.A1();
                                    break;
                                case 3:
                                    bazVar.H1(com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.PUSH_NOTIFICATION);
                                    break;
                            }
                        }
                        if (((dj2.j) barVar2.get()).b() && !((dj2.j) barVar2.get()).a()) {
                            bazVar.o1(com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.BOTTOM_BAR);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("referralManager is null - cant process referral");
                return;
        }
    }

    public e(android.content.Context context, qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "defaultDialerPermissionHelper");
        this.c = context;
        this.b = barVar;
    }
}
