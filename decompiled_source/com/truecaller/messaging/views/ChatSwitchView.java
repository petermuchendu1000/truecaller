package com.truecaller.messaging.views;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ChatSwitchView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ kotlin.reflect.KProperty[] z = {kotlin.jvm.internal.k0.a.mutableProperty1(new kotlin.jvm.internal.t("selected", 0, "getSelected()Lcom/truecaller/messaging/views/Switch;", com.truecaller.messaging.views.ChatSwitchView.class))};
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public kotlin.jvm.functions.Function1 w;
    public p02.p0 x;
    public final com.truecaller.editprofile.impl.ui.legacy.o y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatSwitchView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void F(com.truecaller.messaging.views.ChatSwitchView chatSwitchView, android.view.View view) {
        com.truecaller.messaging.views.Switch r0;
        kotlin.jvm.internal.Intrinsics.d(view);
        java.lang.Object tag = chatSwitchView.getSmsSwitch().getTag();
        if (tag instanceof com.truecaller.messaging.views.Switch) {
            r0 = (com.truecaller.messaging.views.Switch) tag;
        } else {
            r0 = null;
        }
        if (r0 == null) {
            r0 = com.truecaller.messaging.views.Switch.SMS;
        }
        chatSwitchView.L(view, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(com.truecaller.messaging.views.ChatSwitchView chatSwitchView, com.truecaller.messaging.views.Switch r4) {
        int i = v42.baz.a[r4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        chatSwitchView.getChatSwitch().setSelected(false);
                        chatSwitchView.getSmsSwitch().setSelected(false);
                        chatSwitchView.getUrgentMessageSwitch().setSelected(true);
                        return;
                    }
                    throw new java.lang.RuntimeException();
                }
                chatSwitchView.getChatSwitch().setSelected(false);
                chatSwitchView.getSmsSwitch().setSelected(true);
                chatSwitchView.getUrgentMessageSwitch().setSelected(false);
                chatSwitchView.Q();
                return;
            }
            chatSwitchView.getChatSwitch().setSelected(false);
            chatSwitchView.getSmsSwitch().setSelected(true);
            chatSwitchView.getUrgentMessageSwitch().setSelected(false);
            chatSwitchView.getSmsSwitch().setImageResource(2131234360);
            com.truecaller.messaging.views.TransportSwitchView smsSwitch = chatSwitchView.getSmsSwitch();
            java.lang.String string = chatSwitchView.getResources().getString(2132019100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            smsSwitch.setText(string);
            chatSwitchView.getSmsSwitch().setTag(com.truecaller.messaging.views.Switch.SMS);
            return;
        }
        chatSwitchView.getChatSwitch().setSelected(true);
        chatSwitchView.getSmsSwitch().setSelected(false);
        chatSwitchView.getUrgentMessageSwitch().setSelected(false);
    }

    private final com.truecaller.messaging.views.TransportSwitchView getChatSwitch() {
        return (com.truecaller.messaging.views.TransportSwitchView) this.s.getValue();
    }

    private final com.truecaller.messaging.views.TransportSwitchView getSmsSwitch() {
        return (com.truecaller.messaging.views.TransportSwitchView) this.t.getValue();
    }

    private final android.view.View getUrgentMessageBadge() {
        return (android.view.View) this.v.getValue();
    }

    private final com.truecaller.messaging.views.TransportSwitchView getUrgentMessageSwitch() {
        return (com.truecaller.messaging.views.TransportSwitchView) this.u.getValue();
    }

    public final void H() {
        com.google.android.material.floatingactionbutton.FloatingActionButton chatSwitch = getChatSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(chatSwitch, "<get-chatSwitch>(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatSwitch, "<this>");
        chatSwitch.setActivated(false);
        chatSwitch.setAlpha(0.5f);
    }

    public final void I() {
        com.google.android.material.floatingactionbutton.FloatingActionButton smsSwitch = getSmsSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(smsSwitch, "<get-smsSwitch>(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsSwitch, "<this>");
        smsSwitch.setActivated(false);
        smsSwitch.setAlpha(0.5f);
    }

    public final void J() {
        com.google.android.material.floatingactionbutton.FloatingActionButton smsSwitch = getSmsSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(smsSwitch, "<get-smsSwitch>(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsSwitch, "<this>");
        smsSwitch.setActivated(false);
        smsSwitch.setAlpha(0.5f);
    }

    public final void K() {
        com.google.android.material.floatingactionbutton.FloatingActionButton chatSwitch = getChatSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(chatSwitch, "<get-chatSwitch>(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatSwitch, "<this>");
        chatSwitch.setActivated(true);
        chatSwitch.setAlpha(1.0f);
    }

    public final void L(android.view.View view, com.truecaller.messaging.views.Switch r2) {
        if (!view.isActivated()) {
            p02.p0 p0Var = this.x;
            if (p0Var != null) {
                p0Var.invoke(r2);
                return;
            }
            return;
        }
        setSelected(r2);
        kotlin.jvm.functions.Function1 function1 = this.w;
        if (function1 != null) {
            function1.invoke(getSelected());
        }
    }

    public final void M() {
        final int i = 0;
        getChatSwitch().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: v42.bar
            public final /* synthetic */ com.truecaller.messaging.views.ChatSwitchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                com.truecaller.messaging.views.ChatSwitchView chatSwitchView = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.messaging.views.ChatSwitchView.z;
                        kotlin.jvm.internal.Intrinsics.d(view);
                        chatSwitchView.L(view, com.truecaller.messaging.views.Switch.CHAT);
                        return;
                    case 1:
                        com.truecaller.messaging.views.ChatSwitchView.F(chatSwitchView, view);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.messaging.views.ChatSwitchView.z;
                        kotlin.jvm.internal.Intrinsics.d(view);
                        chatSwitchView.L(view, com.truecaller.messaging.views.Switch.URGENT_MESSAGE);
                        return;
                }
            }
        });
        final int i2 = 1;
        getSmsSwitch().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: v42.bar
            public final /* synthetic */ com.truecaller.messaging.views.ChatSwitchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                com.truecaller.messaging.views.ChatSwitchView chatSwitchView = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.messaging.views.ChatSwitchView.z;
                        kotlin.jvm.internal.Intrinsics.d(view);
                        chatSwitchView.L(view, com.truecaller.messaging.views.Switch.CHAT);
                        return;
                    case 1:
                        com.truecaller.messaging.views.ChatSwitchView.F(chatSwitchView, view);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.messaging.views.ChatSwitchView.z;
                        kotlin.jvm.internal.Intrinsics.d(view);
                        chatSwitchView.L(view, com.truecaller.messaging.views.Switch.URGENT_MESSAGE);
                        return;
                }
            }
        });
        final int i3 = 2;
        getUrgentMessageSwitch().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: v42.bar
            public final /* synthetic */ com.truecaller.messaging.views.ChatSwitchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i3;
                com.truecaller.messaging.views.ChatSwitchView chatSwitchView = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.messaging.views.ChatSwitchView.z;
                        kotlin.jvm.internal.Intrinsics.d(view);
                        chatSwitchView.L(view, com.truecaller.messaging.views.Switch.CHAT);
                        return;
                    case 1:
                        com.truecaller.messaging.views.ChatSwitchView.F(chatSwitchView, view);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.messaging.views.ChatSwitchView.z;
                        kotlin.jvm.internal.Intrinsics.d(view);
                        chatSwitchView.L(view, com.truecaller.messaging.views.Switch.URGENT_MESSAGE);
                        return;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N() {
        getChatSwitch().setBackgroundTintList(g6.b.e(android.R.color.transparent, getContext()));
        getSmsSwitch().setBackgroundTintList(g6.b.e(android.R.color.transparent, getContext()));
    }

    public final void O(boolean z2) {
        android.view.View urgentMessageBadge = getUrgentMessageBadge();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(urgentMessageBadge, "<get-urgentMessageBadge>(...)");
        gj.m.k0(urgentMessageBadge, z2);
    }

    public final void P(boolean z2) {
        com.google.android.material.floatingactionbutton.FloatingActionButton urgentMessageSwitch = getUrgentMessageSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(urgentMessageSwitch, "<get-urgentMessageSwitch>(...)");
        gj.m.k0(urgentMessageSwitch, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        getSmsSwitch().setImageResource(2131234359);
        com.truecaller.messaging.views.TransportSwitchView smsSwitch = getSmsSwitch();
        java.lang.String string = getResources().getString(2132019099);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        smsSwitch.setText(string);
        getSmsSwitch().setTag(com.truecaller.messaging.views.Switch.MMS);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.views.Switch getSelected() {
        return (com.truecaller.messaging.views.Switch) this.y.getValue(this, z[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.ViewGroup*/.onFinishInflate();
        M();
    }

    public final void setChatSwitchVisible(boolean z2) {
        com.google.android.material.floatingactionbutton.FloatingActionButton chatSwitch = getChatSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(chatSwitch, "<get-chatSwitch>(...)");
        gj.m.k0(chatSwitch, z2);
    }

    public final void setSelected(@org.jetbrains.annotations.NotNull com.truecaller.messaging.views.Switch r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<set-?>");
        this.y.setValue(this, z[0], r3);
    }

    public final void setSmsSwitchVisible(boolean z2) {
        com.google.android.material.floatingactionbutton.FloatingActionButton smsSwitch = getSmsSwitch();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(smsSwitch, "<get-smsSwitch>(...)");
        gj.m.k0(smsSwitch, z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131362876, this);
        this.t = gj.m.I(2131366520, this);
        this.u = gj.m.I(2131367347, this);
        this.v = gj.m.I(2131367346, this);
        this.y = new com.truecaller.editprofile.impl.ui.legacy.o(15, com.truecaller.messaging.views.Switch.SMS, this);
        li.qux.u(context, "from(...)", true).inflate(2131560059, (android.view.ViewGroup) this, true);
        getChatSwitch().setActivated(true);
        getSmsSwitch().setActivated(true);
        getUrgentMessageSwitch().setActivated(true);
    }

    public /* synthetic */ ChatSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
