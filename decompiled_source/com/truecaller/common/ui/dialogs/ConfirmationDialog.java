package com.truecaller.common.ui.dialogs;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/truecaller/common/ui/dialogs/ConfirmationDialog;", "Li/x;", "<init>", "()V", "com/truecaller/common/ui/dialogs/baz", "ButtonStyle", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ConfirmationDialog extends i.x {
    public final androidx.lifecycle.o1 c = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(e41.e.class), new e41.qux(this, 0), new e41.qux(this, 2), new e41.qux(this, 1));
    public final kotlin.Lazy d = gj.m.K(this, 2131367033);
    public final kotlin.Lazy e = gj.m.K(this, 2131366692);
    public final kotlin.Lazy f = gj.m.K(this, 2131365457);
    public final kotlin.Lazy g = gj.m.K(this, 2131365456);
    public final kotlin.Lazy h = gj.m.K(this, 2131365458);
    public final kotlin.Lazy i = gj.m.K(this, 2131365758);
    public final kotlin.Lazy j = gj.m.K(this, 2131362893);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/common/ui/dialogs/ConfirmationDialog$ButtonStyle;", "", "color", "", "<init>", "(Ljava/lang/String;II)V", "getColor", "()I", "DEFAULT", "ALERT", "BRAND_BLUE", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final class ButtonStyle {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle[] $VALUES;
        private final int color;
        public static final com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle DEFAULT = new com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle("DEFAULT", 0, 2130970935);
        public static final com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle ALERT = new com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle("ALERT", 1, 2130970571);
        public static final com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle BRAND_BLUE = new com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle("BRAND_BLUE", 2, 2130970634);

        private static final /* synthetic */ com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle[] $values() {
            return new com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle[]{DEFAULT, ALERT, BRAND_BLUE};
        }

        static {
            com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private ButtonStyle(java.lang.String str, int i, int i2) {
            this.color = i2;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle valueOf(java.lang.String str) {
            return (com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle) java.lang.Enum.valueOf(com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle.class, str);
        }

        public static com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle[] values() {
            return (com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle[]) $VALUES.clone();
        }

        public final int getColor() {
            return this.color;
        }
    }

    public final void onCreate(android.os.Bundle bundle) {
        super/*androidx.fragment.app.t*/.onCreate(bundle);
        setStyle(0, 2132083479);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return yy.qux.F(layoutInflater, true).inflate(2131559919, viewGroup, false);
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super/*androidx.fragment.app.t*/.onDismiss(dialogInterface);
        androidx.lifecycle.o1 o1Var = this.c;
        if (kotlin.jvm.internal.Intrinsics.b(((e41.e) o1Var.getValue()).o().d(), e41.b.b)) {
            ((e41.e) o1Var.getValue()).o().k(e41.a.a);
        }
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        java.io.Serializable serializable;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        java.io.Serializable serializable2;
        java.lang.CharSequence charSequence;
        boolean z2;
        java.lang.CharSequence charSequence2;
        java.lang.String str4;
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        java.lang.Object value = this.i.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        android.widget.Button button = (android.widget.Button) value;
        android.os.Bundle arguments = getArguments();
        java.lang.String str5 = "";
        if (arguments == null || (str = arguments.getString("positive_button_text")) == null) {
            str = "";
        }
        button.setText(str);
        android.content.Context context = button.getContext();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (serializable = arguments2.getSerializable("positive_button_style")) == null) {
            serializable = com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.e(serializable, "null cannot be cast to non-null type com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle");
        button.setTextColor(bi3.a.s(context, ((com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle) serializable).getColor()));
        java.lang.Object value2 = this.f.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        boolean z3 = true;
        gj.m.k0((android.view.View) value2, true);
        final int i = 0;
        button.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: e41.baz
            public final /* synthetic */ com.truecaller.common.ui.dialogs.ConfirmationDialog b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                boolean z4;
                switch (i) {
                    case 0:
                        com.truecaller.common.ui.dialogs.ConfirmationDialog confirmationDialog = this.b;
                        androidx.lifecycle.q0 o = ((e41.e) confirmationDialog.c.getValue()).o();
                        kotlin.Lazy lazy = confirmationDialog.j;
                        java.lang.Object value3 = lazy.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        if (gj.m.H((android.widget.CheckBox) value3)) {
                            java.lang.Object value4 = lazy.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            if (((android.widget.CheckBox) value4).isChecked()) {
                                z4 = true;
                                o.k(new e41.c(z4));
                                confirmationDialog.dismiss();
                                confirmationDialog.dismissAllowingStateLoss();
                                return;
                            }
                        }
                        z4 = false;
                        o.k(new e41.c(z4));
                        confirmationDialog.dismiss();
                        confirmationDialog.dismissAllowingStateLoss();
                        return;
                    default:
                        com.truecaller.common.ui.dialogs.ConfirmationDialog confirmationDialog2 = this.b;
                        ((e41.e) confirmationDialog2.c.getValue()).o().k(e41.b.a);
                        confirmationDialog2.dismiss();
                        confirmationDialog2.dismissAllowingStateLoss();
                        return;
                }
            }
        });
        java.lang.Object value3 = this.g.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        android.widget.Button button2 = (android.widget.Button) value3;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str6 = null;
        if (arguments3 != null) {
            str2 = arguments3.getString("negative_button_text");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("negative_button_text");
        } else {
            str3 = null;
        }
        button2.setText(str3);
        android.content.Context context2 = button2.getContext();
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 == null || (serializable2 = arguments5.getSerializable("negative_button_style")) == null) {
            serializable2 = com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.e(serializable2, "null cannot be cast to non-null type com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle");
        button2.setTextColor(bi3.a.s(context2, ((com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle) serializable2).getColor()));
        gj.m.k0(button2, z);
        java.lang.Object value4 = this.h.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        gj.m.k0((android.view.View) value4, z);
        final int i2 = 1;
        button2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: e41.baz
            public final /* synthetic */ com.truecaller.common.ui.dialogs.ConfirmationDialog b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                boolean z4;
                switch (i2) {
                    case 0:
                        com.truecaller.common.ui.dialogs.ConfirmationDialog confirmationDialog = this.b;
                        androidx.lifecycle.q0 o = ((e41.e) confirmationDialog.c.getValue()).o();
                        kotlin.Lazy lazy = confirmationDialog.j;
                        java.lang.Object value32 = lazy.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value32, "getValue(...)");
                        if (gj.m.H((android.widget.CheckBox) value32)) {
                            java.lang.Object value42 = lazy.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value42, "getValue(...)");
                            if (((android.widget.CheckBox) value42).isChecked()) {
                                z4 = true;
                                o.k(new e41.c(z4));
                                confirmationDialog.dismiss();
                                confirmationDialog.dismissAllowingStateLoss();
                                return;
                            }
                        }
                        z4 = false;
                        o.k(new e41.c(z4));
                        confirmationDialog.dismiss();
                        confirmationDialog.dismissAllowingStateLoss();
                        return;
                    default:
                        com.truecaller.common.ui.dialogs.ConfirmationDialog confirmationDialog2 = this.b;
                        ((e41.e) confirmationDialog2.c.getValue()).o().k(e41.b.a);
                        confirmationDialog2.dismiss();
                        confirmationDialog2.dismissAllowingStateLoss();
                        return;
                }
            }
        });
        java.lang.Object value5 = this.d.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value5;
        android.os.Bundle arguments6 = getArguments();
        if (arguments6 != null && (string = arguments6.getString("title")) != null) {
            str5 = string;
        }
        textView.setText(str5);
        java.lang.Object value6 = this.e.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        android.widget.TextView textView2 = (android.widget.TextView) value6;
        android.os.Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            charSequence = arguments7.getCharSequence("subtitle");
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        gj.m.k0(textView2, z2);
        android.os.Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            charSequence2 = arguments8.getCharSequence("subtitle");
        } else {
            charSequence2 = null;
        }
        textView2.setText(charSequence2);
        java.lang.Object value7 = this.j.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) value7;
        android.os.Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            str4 = arguments9.getString("checkbox_text");
        } else {
            str4 = null;
        }
        if (str4 == null) {
            z3 = false;
        }
        gj.m.k0(checkBox, z3);
        android.os.Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            str6 = arguments10.getString("checkbox_text");
        }
        checkBox.setText(str6);
    }
}
