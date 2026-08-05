package com.truecaller.call_assistant.core.callui.ui.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/ui/qa/AssistantCallUIQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantCallUIQaActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int f0 = 0;
    public rn0.bar a0;
    public d91.e b0;
    public final java.lang.String c0 = "+46761234567";
    public final java.lang.String d0 = "https://storage.googleapis.com/tc-images-eu/myview/1/e9118ec2a5b4fdf1ab572ab98362bd74/3";
    public final java.lang.String e0 = "https://storage.googleapis.com/tc-search-context-eu/message-icon/ic_context_fraud_p.png";

    public static com.truecaller.call_assistant.core.data.ScreenedCall s0(java.lang.String str) {
        java.util.Date time = java.util.Calendar.getInstance().getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        return new com.truecaller.call_assistant.core.data.ScreenedCall("", "", str, time, 0, "en", "ongoing", null, false, null, null, null, null, h0Var, h0Var, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        rn0.b0 b0Var = (rn0.b0) mk.m.w(this).a;
        this.a0 = (rn0.bar) b0Var.C.get();
        u03.c c0 = ((tx.w) b0Var.a).c0();
        es.baz.k(c0);
        if (!c0.v()) {
            finish();
            return;
        }
        yy.qux.C(this, 2);
        android.view.View inflate = getLayoutInflater().inflate(2131558440, (android.view.ViewGroup) null, false);
        int i = 2131362671;
        android.widget.Button button = (android.widget.Button) df0.qux.o(2131362671, inflate);
        if (button != null) {
            i = 2131365947;
            androidx.appcompat.widget.AppCompatRadioButton o = df0.qux.o(2131365947, inflate);
            if (o != null) {
                i = 2131365948;
                if (df0.qux.o(2131365948, inflate) != null) {
                    i = 2131365949;
                    androidx.appcompat.widget.AppCompatRadioButton o2 = df0.qux.o(2131365949, inflate);
                    if (o2 != null) {
                        i = 2131365950;
                        androidx.appcompat.widget.AppCompatRadioButton o3 = df0.qux.o(2131365950, inflate);
                        if (o3 != null) {
                            i = 2131365954;
                            androidx.appcompat.widget.AppCompatRadioButton o4 = df0.qux.o(2131365954, inflate);
                            if (o4 != null) {
                                i = 2131365955;
                                if (df0.qux.o(2131365955, inflate) != null) {
                                    i = 2131366747;
                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o5 = df0.qux.o(2131366747, inflate);
                                    if (o5 != null) {
                                        i = 2131366749;
                                        if (((android.widget.ScrollView) df0.qux.o(2131366749, inflate)) != null) {
                                            i = 2131366750;
                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o6 = df0.qux.o(2131366750, inflate);
                                            if (o6 != null) {
                                                i = 2131366751;
                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o7 = df0.qux.o(2131366751, inflate);
                                                if (o7 != null) {
                                                    i = 2131366752;
                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o8 = df0.qux.o(2131366752, inflate);
                                                    if (o8 != null) {
                                                        i = 2131366753;
                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o9 = df0.qux.o(2131366753, inflate);
                                                        if (o9 != null) {
                                                            i = 2131366754;
                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o11 = df0.qux.o(2131366754, inflate);
                                                            if (o11 != null) {
                                                                i = 2131366755;
                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o12 = df0.qux.o(2131366755, inflate);
                                                                if (o12 != null) {
                                                                    i = 2131366756;
                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o13 = df0.qux.o(2131366756, inflate);
                                                                    if (o13 != null) {
                                                                        i = 2131366757;
                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o14 = df0.qux.o(2131366757, inflate);
                                                                        if (o14 != null) {
                                                                            i = 2131366758;
                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o15 = df0.qux.o(2131366758, inflate);
                                                                            if (o15 != null) {
                                                                                i = 2131366759;
                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o16 = df0.qux.o(2131366759, inflate);
                                                                                if (o16 != null) {
                                                                                    i = 2131366761;
                                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o17 = df0.qux.o(2131366761, inflate);
                                                                                    if (o17 != null) {
                                                                                        i = 2131366763;
                                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o18 = df0.qux.o(2131366763, inflate);
                                                                                        if (o18 != null) {
                                                                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                                                                                            d91.e eVar = new d91.e(linearLayout, button, o, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18);
                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
                                                                                            this.b0 = eVar;
                                                                                            setContentView(linearLayout);
                                                                                            d91.e eVar2 = this.b0;
                                                                                            if (eVar2 != null) {
                                                                                                ((android.widget.Button) eVar2.c).setOnClickListener(new uo1.bar(this, 28));
                                                                                                return;
                                                                                            } else {
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
                                                        }
                                                    }
                                                }
                                            }
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

    public final void t0(com.truecaller.call_assistant.core.data.ScreenedCall screenedCall, rn0.r rVar) {
        java.lang.Object obj;
        rn0.bar barVar = this.a0;
        if (barVar != null) {
            d91.e eVar = this.b0;
            if (eVar != null) {
                if (eVar.f.isChecked()) {
                    obj = com.truecaller.call_assistant.core.callui.AssistantCallState.Ongoing.INSTANCE;
                } else {
                    obj = com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming.INSTANCE;
                }
                com.truecaller.call_assistant.core.callui.c cVar = (com.truecaller.call_assistant.core.callui.c) barVar;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "callState");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "debugCallInfo");
                ig3.h2 h2Var = cVar.O;
                h2Var.getClass();
                h2Var.p((java.lang.Object) null, screenedCall);
                lu0.baz bazVar = cVar.e;
                bazVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "debugCallInfo");
                ig3.h2 h2Var2 = bazVar.h;
                h2Var2.getClass();
                h2Var2.p((java.lang.Object) null, rVar);
                cVar.N.o(obj);
                le2.v vVar = cVar.w;
                ((android.content.Context) vVar.b).startActivity(vVar.f(false));
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("callManager");
        throw null;
    }
}
