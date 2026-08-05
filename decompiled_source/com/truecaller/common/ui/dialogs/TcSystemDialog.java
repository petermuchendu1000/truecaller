package com.truecaller.common.ui.dialogs;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/truecaller/common/ui/dialogs/TcSystemDialog;", "Li/x;", "<init>", "()V", "e41/v", "ButtonsOrientation", "com/truecaller/common/ui/dialogs/qux", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TcSystemDialog extends i.x {
    public e41.v c;
    public boolean d = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/common/ui/dialogs/TcSystemDialog$ButtonsOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public static final class ButtonsOrientation {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation[] $VALUES;
        public static final com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation VERTICAL = new com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation("VERTICAL", 0);
        public static final com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation HORIZONTAL = new com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation("HORIZONTAL", 1);

        private static final /* synthetic */ com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation[] $values() {
            return new com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation[]{VERTICAL, HORIZONTAL};
        }

        static {
            com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private ButtonsOrientation(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation valueOf(java.lang.String str) {
            return (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) java.lang.Enum.valueOf(com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation.class, str);
        }

        public static com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation[] values() {
            return (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
    
        if (r2 > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a8, code lost:
    
        if (r1 > 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.lang.Integer num;
        int i;
        java.lang.Integer num2;
        java.lang.Integer num3;
        android.os.Bundle arguments;
        e41.v vVar;
        int i2;
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        final int i3 = 1;
        final int i4 = 0;
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(layoutInflater, true).inflate(2131559995, (android.view.ViewGroup) null, false);
        int i5 = 2131364471;
        androidx.constraintlayout.widget.Group o = df0.qux.o(2131364471, inflate);
        if (o != null) {
            i5 = 2131364521;
            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364521, inflate);
            if (imageView != null) {
                i5 = 2131365459;
                android.widget.Button button = (android.widget.Button) df0.qux.o(2131365459, inflate);
                if (button != null) {
                    i5 = 2131365460;
                    android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131365460, inflate);
                    if (button2 != null) {
                        i5 = 2131365759;
                        android.widget.Button button3 = (android.widget.Button) df0.qux.o(2131365759, inflate);
                        if (button3 != null) {
                            i5 = 2131365760;
                            android.widget.Button button4 = (android.widget.Button) df0.qux.o(2131365760, inflate);
                            if (button4 != null) {
                                i5 = 2131366692;
                                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366692, inflate);
                                if (textView != null) {
                                    i5 = 2131367033;
                                    android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, inflate);
                                    if (textView2 != null) {
                                        i5 = 2131367378;
                                        androidx.constraintlayout.widget.Group o2 = df0.qux.o(2131367378, inflate);
                                        if (o2 != null) {
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(new d41.baz(constraintLayout, o, imageView, button, button2, button3, button4, textView, textView2, o2), "inflate(...)");
                                            android.os.Bundle arguments2 = getArguments();
                                            if (arguments2 == null || (str = arguments2.getString("ARG_TC_SYSTEM_DIALOG_TITLE_STRING")) == null) {
                                                android.os.Bundle arguments3 = getArguments();
                                                if (arguments3 != null) {
                                                    str = requireContext.getString(arguments3.getInt("ARG_TC_SYSTEM_DIALOG_TITLE"));
                                                } else {
                                                    str = null;
                                                }
                                            }
                                            textView2.setText(str);
                                            android.os.Bundle arguments4 = getArguments();
                                            if (arguments4 == null || (str2 = arguments4.getString("ARG_TC_SYSTEM_DIALOG_SUBTITLE_STRING")) == null) {
                                                android.os.Bundle arguments5 = getArguments();
                                                if (arguments5 != null) {
                                                    str2 = requireContext.getString(arguments5.getInt("ARG_TC_SYSTEM_DIALOG_SUBTITLE"));
                                                } else {
                                                    str2 = null;
                                                }
                                            }
                                            android.os.Bundle arguments6 = getArguments();
                                            if (arguments6 != null) {
                                                bool = java.lang.Boolean.valueOf(arguments6.getBoolean("ARG_TC_SYSTEM_DIALOG_LINKIFY"));
                                            } else {
                                                bool = null;
                                            }
                                            if (kotlin.jvm.internal.Intrinsics.b(bool, java.lang.Boolean.TRUE) && str2 != null) {
                                                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                                                textView.setText(a0.q.e(str2));
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "subtitle");
                                                com.truecaller.ui.a2 a2Var = new com.truecaller.ui.a2(this, 9);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2Var, "onClick");
                                                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                                                ge0.i.L(textView, new cz0.d(6, a2Var));
                                            } else if (str2 != null) {
                                                textView.setText(str2);
                                            }
                                            android.os.Bundle arguments7 = getArguments();
                                            if (arguments7 != null) {
                                                int i6 = arguments7.getInt("ARG_TC_SYSTEM_DIALOG_ICON", -1);
                                                num = java.lang.Integer.valueOf(i6);
                                            }
                                            num = null;
                                            if (num != null) {
                                                imageView.setImageResource(num.intValue());
                                            }
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "icon");
                                            if (num != null) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            imageView.setVisibility(i);
                                            i.e create = new dr.baz(requireContext).n(constraintLayout).create();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                                            android.graphics.drawable.Drawable w = yb0.i.w(2131231201, requireContext);
                                            android.view.Window window = create.getWindow();
                                            if (window != null) {
                                                window.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(w, bd.bar.q(14)));
                                            }
                                            android.os.Bundle arguments8 = getArguments();
                                            if (arguments8 != null) {
                                                int i7 = arguments8.getInt("ARG_TC_SYSTEM_DIALOG_POSITIVE_TEXT", -1);
                                                num2 = java.lang.Integer.valueOf(i7);
                                            }
                                            num2 = null;
                                            if (num2 != null) {
                                                int intValue = num2.intValue();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button4, "positiveButtonVertical");
                                                button4.setText(requireContext().getString(intValue));
                                                button4.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: e41.u
                                                    public final /* synthetic */ com.truecaller.common.ui.dialogs.TcSystemDialog b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(android.view.View view) {
                                                        switch (i3) {
                                                            case 0:
                                                                com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog = this.b;
                                                                tcSystemDialog.d = false;
                                                                tcSystemDialog.dismiss();
                                                                e41.v vVar2 = tcSystemDialog.c;
                                                                if (vVar2 != null) {
                                                                    vVar2.e2(this);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.Intrinsics.n("listener");
                                                                    throw null;
                                                                }
                                                            default:
                                                                com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog2 = this.b;
                                                                tcSystemDialog2.d = false;
                                                                tcSystemDialog2.dismiss();
                                                                e41.v vVar3 = tcSystemDialog2.c;
                                                                if (vVar3 != null) {
                                                                    vVar3.f3(this);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.Intrinsics.n("listener");
                                                                    throw null;
                                                                }
                                                        }
                                                    }
                                                });
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button3, "positiveButtonHorizontal");
                                                button3.setText(requireContext().getString(intValue));
                                                button3.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: e41.u
                                                    public final /* synthetic */ com.truecaller.common.ui.dialogs.TcSystemDialog b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(android.view.View view) {
                                                        switch (i3) {
                                                            case 0:
                                                                com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog = this.b;
                                                                tcSystemDialog.d = false;
                                                                tcSystemDialog.dismiss();
                                                                e41.v vVar2 = tcSystemDialog.c;
                                                                if (vVar2 != null) {
                                                                    vVar2.e2(this);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.Intrinsics.n("listener");
                                                                    throw null;
                                                                }
                                                            default:
                                                                com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog2 = this.b;
                                                                tcSystemDialog2.d = false;
                                                                tcSystemDialog2.dismiss();
                                                                e41.v vVar3 = tcSystemDialog2.c;
                                                                if (vVar3 != null) {
                                                                    vVar3.f3(this);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.Intrinsics.n("listener");
                                                                    throw null;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                            android.os.Bundle arguments9 = getArguments();
                                            if (arguments9 != null) {
                                                int i8 = arguments9.getInt("ARG_TC_SYSTEM_DIALOG_NEGATIVE_TEXT", -1);
                                                java.lang.Integer valueOf = java.lang.Integer.valueOf(i8);
                                                if (i8 > 0) {
                                                    num3 = valueOf;
                                                    if (num3 != null) {
                                                        int intValue2 = num3.intValue();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button2, "negativeButtonVertical");
                                                        button2.setText(requireContext().getString(intValue2));
                                                        button2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: e41.u
                                                            public final /* synthetic */ com.truecaller.common.ui.dialogs.TcSystemDialog b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(android.view.View view) {
                                                                switch (i4) {
                                                                    case 0:
                                                                        com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog = this.b;
                                                                        tcSystemDialog.d = false;
                                                                        tcSystemDialog.dismiss();
                                                                        e41.v vVar2 = tcSystemDialog.c;
                                                                        if (vVar2 != null) {
                                                                            vVar2.e2(this);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.Intrinsics.n("listener");
                                                                            throw null;
                                                                        }
                                                                    default:
                                                                        com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog2 = this.b;
                                                                        tcSystemDialog2.d = false;
                                                                        tcSystemDialog2.dismiss();
                                                                        e41.v vVar3 = tcSystemDialog2.c;
                                                                        if (vVar3 != null) {
                                                                            vVar3.f3(this);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.Intrinsics.n("listener");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button, "negativeButtonHorizontal");
                                                        button.setText(requireContext().getString(intValue2));
                                                        button.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: e41.u
                                                            public final /* synthetic */ com.truecaller.common.ui.dialogs.TcSystemDialog b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(android.view.View view) {
                                                                switch (i4) {
                                                                    case 0:
                                                                        com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog = this.b;
                                                                        tcSystemDialog.d = false;
                                                                        tcSystemDialog.dismiss();
                                                                        e41.v vVar2 = tcSystemDialog.c;
                                                                        if (vVar2 != null) {
                                                                            vVar2.e2(this);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.Intrinsics.n("listener");
                                                                            throw null;
                                                                        }
                                                                    default:
                                                                        com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog2 = this.b;
                                                                        tcSystemDialog2.d = false;
                                                                        tcSystemDialog2.dismiss();
                                                                        e41.v vVar3 = tcSystemDialog2.c;
                                                                        if (vVar3 != null) {
                                                                            vVar3.f3(this);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.Intrinsics.n("listener");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                    }
                                                    arguments = getArguments();
                                                    if (arguments != null) {
                                                        int i9 = arguments.getInt("ARG_TC_SYSTEM_DIALOG_BUTTONS_ORIENTATION");
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o2, "verticalButtonsGroup");
                                                        if (i9 == com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation.VERTICAL.ordinal()) {
                                                            i2 = 0;
                                                        } else {
                                                            i2 = 8;
                                                        }
                                                        o2.setVisibility(i2);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o, "horizontalButtonsGroup");
                                                        if (i9 != com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation.HORIZONTAL.ordinal()) {
                                                            i4 = 8;
                                                        }
                                                        o.setVisibility(i4);
                                                    }
                                                    if (!(getContext() instanceof e41.v)) {
                                                        androidx.fragment.app.FragmentActivity activity = getActivity();
                                                        kotlin.jvm.internal.Intrinsics.e(activity, "null cannot be cast to non-null type com.truecaller.common.ui.dialogs.TcSystemDialog.Listener");
                                                        vVar = (e41.v) activity;
                                                    } else if (getParentFragment() instanceof e41.v) {
                                                        e41.v parentFragment = getParentFragment();
                                                        kotlin.jvm.internal.Intrinsics.e(parentFragment, "null cannot be cast to non-null type com.truecaller.common.ui.dialogs.TcSystemDialog.Listener");
                                                        vVar = parentFragment;
                                                    } else {
                                                        throw new java.lang.IllegalStateException(getContext() + " or " + getParentFragment() + " should implement " + e41.v.class.getSimpleName());
                                                    }
                                                    this.c = vVar;
                                                    return create;
                                                }
                                            }
                                            num3 = null;
                                            if (num3 != null) {
                                            }
                                            arguments = getArguments();
                                            if (arguments != null) {
                                            }
                                            if (!(getContext() instanceof e41.v)) {
                                            }
                                            this.c = vVar;
                                            return create;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super/*androidx.fragment.app.t*/.onDismiss(dialogInterface);
        if (this.d) {
            e41.v vVar = this.c;
            if (vVar != null) {
                vVar.L3(this);
            } else {
                kotlin.jvm.internal.Intrinsics.n("listener");
                throw null;
            }
        }
    }
}
