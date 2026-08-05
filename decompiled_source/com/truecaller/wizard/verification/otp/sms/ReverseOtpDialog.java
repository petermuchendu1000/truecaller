package com.truecaller.wizard.verification.otp.sms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog;", "Li/x;", "<init>", "()V", "State", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@kotlin.a
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReverseOtpDialog extends i.x {
    public com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State c;
    public q93.b d;
    public android.view.View e;
    public android.widget.TextView f;
    public android.widget.TextView g;
    public android.widget.ImageView h;
    public android.widget.ProgressBar i;
    public android.widget.Button j;
    public android.widget.Button k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State;", "Landroid/os/Parcelable;", "Loading", "Success", "WhatsAppMessageNotSent", "PhoneNumberHint", "Error", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$Error;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$Loading;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$PhoneNumberHint;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$Success;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$WhatsAppMessageNotSent;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface State extends android.os.Parcelable {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$Error;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Error implements com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State {

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Error> CREATOR = new java.lang.Object();
            public final java.lang.String a;
            public final java.lang.String b;
            public final java.lang.String c;

            public Error(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "action");
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeString(this.a);
                parcel.writeString(this.b);
                parcel.writeString(this.c);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$Loading;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Loading implements com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State {
            public static final com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Loading a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Loading> CREATOR = new java.lang.Object();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$PhoneNumberHint;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class PhoneNumberHint implements com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State {

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.PhoneNumberHint> CREATOR = new java.lang.Object();
            public final java.lang.String a;

            public PhoneNumberHint(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
                this.a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeString(this.a);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$Success;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class Success implements com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State {
            public static final com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Success a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Success> CREATOR = new java.lang.Object();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State$WhatsAppMessageNotSent;", "Lcom/truecaller/wizard/verification/otp/sms/ReverseOtpDialog$State;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final class WhatsAppMessageNotSent implements com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State {
            public static final com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.WhatsAppMessageNotSent a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.WhatsAppMessageNotSent> CREATOR = new java.lang.Object();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeInt(1);
            }
        }
    }

    public ReverseOtpDialog() {
        final int i = 0;
        this.l = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: q93.baz
            public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.b;
                switch (i2) {
                    case 0:
                        int s = bi3.a.s(reverseOtpDialog.requireContext(), 2130970471);
                        android.graphics.drawable.Drawable mutate = t41.i.d(2131234503, reverseOtpDialog.requireContext()).mutate();
                        mutate.setTint(s);
                        return mutate;
                    default:
                        return java.lang.Integer.valueOf(reverseOtpDialog.getResources().getDimensionPixelSize(2131166826));
                }
            }
        });
        final int i2 = 1;
        this.m = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: q93.baz
            public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.b;
                switch (i22) {
                    case 0:
                        int s = bi3.a.s(reverseOtpDialog.requireContext(), 2130970471);
                        android.graphics.drawable.Drawable mutate = t41.i.d(2131234503, reverseOtpDialog.requireContext()).mutate();
                        mutate.setTint(s);
                        return mutate;
                    default:
                        return java.lang.Integer.valueOf(reverseOtpDialog.getResources().getDimensionPixelSize(2131166826));
                }
            }
        });
    }

    public final void S4() {
        com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State state;
        if (getContext() != null && (state = this.c) != null) {
            boolean equals = state.equals(com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Loading.a);
            kotlin.Lazy lazy = this.m;
            if (equals) {
                android.widget.ProgressBar progressBar = this.i;
                if (progressBar != null) {
                    gj.m.j0(progressBar);
                }
                android.widget.Button button = this.j;
                if (button != null) {
                    gj.m.f0(button);
                }
                android.widget.Button button2 = this.k;
                if (button2 != null) {
                    gj.m.f0(button2);
                }
                android.widget.ImageView imageView = this.h;
                if (imageView != null) {
                    gj.m.f0(imageView);
                }
                android.widget.TextView textView = this.f;
                if (textView != null) {
                    textView.setText(2132018850);
                }
                android.widget.TextView textView2 = this.g;
                if (textView2 != null) {
                    textView2.setText(2132018849);
                }
                android.view.View view = this.e;
                if (view != null) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((java.lang.Number) lazy.getValue()).intValue());
                    return;
                }
                return;
            }
            boolean equals2 = state.equals(com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Success.a);
            kotlin.Lazy lazy2 = this.l;
            if (equals2) {
                android.widget.ProgressBar progressBar2 = this.i;
                if (progressBar2 != null) {
                    gj.m.f0(progressBar2);
                }
                android.widget.Button button3 = this.j;
                if (button3 != null) {
                    gj.m.f0(button3);
                }
                android.widget.Button button4 = this.k;
                if (button4 != null) {
                    gj.m.f0(button4);
                }
                android.widget.ImageView imageView2 = this.h;
                if (imageView2 != null) {
                    gj.m.j0(imageView2);
                }
                android.widget.ImageView imageView3 = this.h;
                if (imageView3 != null) {
                    imageView3.setImageDrawable((android.graphics.drawable.Drawable) lazy2.getValue());
                }
                android.widget.TextView textView3 = this.f;
                if (textView3 != null) {
                    textView3.setText(2132018856);
                }
                android.widget.TextView textView4 = this.g;
                if (textView4 != null) {
                    textView4.setText(2132018849);
                }
                android.view.View view2 = this.e;
                if (view2 != null) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), ((java.lang.Number) lazy.getValue()).intValue());
                    return;
                }
                return;
            }
            final int i = 0;
            if (state.equals(com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.WhatsAppMessageNotSent.a)) {
                android.widget.ProgressBar progressBar3 = this.i;
                if (progressBar3 != null) {
                    gj.m.f0(progressBar3);
                }
                android.widget.Button button5 = this.j;
                if (button5 != null) {
                    gj.m.j0(button5);
                }
                android.widget.Button button6 = this.j;
                if (button6 != null) {
                    button6.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: q93.a
                        public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view3) {
                            switch (i) {
                                case 0:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.b;
                                    q93.b bVar = reverseOtpDialog.d;
                                    if (bVar != null) {
                                        com.truecaller.wizard.verification.s1 d5 = ((com.truecaller.wizard.verification.l0) bVar).d5();
                                        d5.n.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppMessageNotSent, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.ClickedPositive);
                                        d5.C2();
                                    }
                                    reverseOtpDialog.dismissAllowingStateLoss();
                                    return;
                                case 1:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog2 = this.b;
                                    q93.b bVar2 = reverseOtpDialog2.d;
                                    if (bVar2 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar2).d5().p2();
                                    }
                                    reverseOtpDialog2.dismissAllowingStateLoss();
                                    return;
                                case 2:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog3 = this.b;
                                    q93.b bVar3 = reverseOtpDialog3.d;
                                    if (bVar3 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar3).d5().n2();
                                    }
                                    reverseOtpDialog3.dismissAllowingStateLoss();
                                    return;
                                default:
                                    this.b.dismissAllowingStateLoss();
                                    return;
                            }
                        }
                    });
                }
                android.widget.Button button7 = this.j;
                if (button7 != null) {
                    button7.setText(2132018861);
                }
                android.widget.Button button8 = this.k;
                if (button8 != null) {
                    gj.m.f0(button8);
                }
                android.widget.ImageView imageView4 = this.h;
                if (imageView4 != null) {
                    gj.m.f0(imageView4);
                }
                android.widget.TextView textView5 = this.f;
                if (textView5 != null) {
                    textView5.setText(2132018860);
                }
                android.widget.TextView textView6 = this.g;
                if (textView6 != null) {
                    textView6.setText(2132018859);
                }
                android.view.View view3 = this.e;
                if (view3 != null) {
                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), 0);
                    return;
                }
                return;
            }
            if (state instanceof com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.PhoneNumberHint) {
                android.widget.ProgressBar progressBar4 = this.i;
                if (progressBar4 != null) {
                    gj.m.f0(progressBar4);
                }
                android.widget.Button button9 = this.j;
                if (button9 != null) {
                    gj.m.j0(button9);
                }
                android.widget.Button button10 = this.j;
                if (button10 != null) {
                    button10.setText(2132019023);
                }
                android.widget.Button button11 = this.j;
                final int i2 = 1;
                if (button11 != null) {
                    button11.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: q93.a
                        public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view32) {
                            switch (i2) {
                                case 0:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.b;
                                    q93.b bVar = reverseOtpDialog.d;
                                    if (bVar != null) {
                                        com.truecaller.wizard.verification.s1 d5 = ((com.truecaller.wizard.verification.l0) bVar).d5();
                                        d5.n.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppMessageNotSent, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.ClickedPositive);
                                        d5.C2();
                                    }
                                    reverseOtpDialog.dismissAllowingStateLoss();
                                    return;
                                case 1:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog2 = this.b;
                                    q93.b bVar2 = reverseOtpDialog2.d;
                                    if (bVar2 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar2).d5().p2();
                                    }
                                    reverseOtpDialog2.dismissAllowingStateLoss();
                                    return;
                                case 2:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog3 = this.b;
                                    q93.b bVar3 = reverseOtpDialog3.d;
                                    if (bVar3 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar3).d5().n2();
                                    }
                                    reverseOtpDialog3.dismissAllowingStateLoss();
                                    return;
                                default:
                                    this.b.dismissAllowingStateLoss();
                                    return;
                            }
                        }
                    });
                }
                android.widget.Button button12 = this.k;
                if (button12 != null) {
                    gj.m.j0(button12);
                }
                android.widget.Button button13 = this.k;
                if (button13 != null) {
                    button13.setText(2132019018);
                }
                android.widget.Button button14 = this.k;
                if (button14 != null) {
                    final int i3 = 2;
                    button14.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: q93.a
                        public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view32) {
                            switch (i3) {
                                case 0:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.b;
                                    q93.b bVar = reverseOtpDialog.d;
                                    if (bVar != null) {
                                        com.truecaller.wizard.verification.s1 d5 = ((com.truecaller.wizard.verification.l0) bVar).d5();
                                        d5.n.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppMessageNotSent, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.ClickedPositive);
                                        d5.C2();
                                    }
                                    reverseOtpDialog.dismissAllowingStateLoss();
                                    return;
                                case 1:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog2 = this.b;
                                    q93.b bVar2 = reverseOtpDialog2.d;
                                    if (bVar2 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar2).d5().p2();
                                    }
                                    reverseOtpDialog2.dismissAllowingStateLoss();
                                    return;
                                case 2:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog3 = this.b;
                                    q93.b bVar3 = reverseOtpDialog3.d;
                                    if (bVar3 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar3).d5().n2();
                                    }
                                    reverseOtpDialog3.dismissAllowingStateLoss();
                                    return;
                                default:
                                    this.b.dismissAllowingStateLoss();
                                    return;
                            }
                        }
                    });
                }
                android.widget.ImageView imageView5 = this.h;
                if (imageView5 != null) {
                    gj.m.j0(imageView5);
                }
                android.widget.ImageView imageView6 = this.h;
                if (imageView6 != null) {
                    imageView6.setImageDrawable((android.graphics.drawable.Drawable) lazy2.getValue());
                }
                android.widget.TextView textView7 = this.f;
                if (textView7 != null) {
                    textView7.setText(getString(2132018855, new java.lang.Object[]{((com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.PhoneNumberHint) state).a}));
                }
                android.widget.TextView textView8 = this.g;
                if (textView8 != null) {
                    textView8.setText(2132018854);
                }
                android.view.View view4 = this.e;
                if (view4 != null) {
                    view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), 0);
                    return;
                }
                return;
            }
            if (state instanceof com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Error) {
                android.widget.ProgressBar progressBar5 = this.i;
                if (progressBar5 != null) {
                    gj.m.f0(progressBar5);
                }
                android.widget.Button button15 = this.j;
                if (button15 != null) {
                    gj.m.j0(button15);
                }
                android.widget.Button button16 = this.j;
                if (button16 != null) {
                    final int i4 = 3;
                    button16.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: q93.a
                        public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view32) {
                            switch (i4) {
                                case 0:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.b;
                                    q93.b bVar = reverseOtpDialog.d;
                                    if (bVar != null) {
                                        com.truecaller.wizard.verification.s1 d5 = ((com.truecaller.wizard.verification.l0) bVar).d5();
                                        d5.n.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppMessageNotSent, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.ClickedPositive);
                                        d5.C2();
                                    }
                                    reverseOtpDialog.dismissAllowingStateLoss();
                                    return;
                                case 1:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog2 = this.b;
                                    q93.b bVar2 = reverseOtpDialog2.d;
                                    if (bVar2 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar2).d5().p2();
                                    }
                                    reverseOtpDialog2.dismissAllowingStateLoss();
                                    return;
                                case 2:
                                    com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog3 = this.b;
                                    q93.b bVar3 = reverseOtpDialog3.d;
                                    if (bVar3 != null) {
                                        ((com.truecaller.wizard.verification.l0) bVar3).d5().n2();
                                    }
                                    reverseOtpDialog3.dismissAllowingStateLoss();
                                    return;
                                default:
                                    this.b.dismissAllowingStateLoss();
                                    return;
                            }
                        }
                    });
                }
                android.widget.Button button17 = this.j;
                if (button17 != null) {
                    button17.setText(((com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Error) state).c);
                }
                android.widget.Button button18 = this.k;
                if (button18 != null) {
                    gj.m.f0(button18);
                }
                android.widget.ImageView imageView7 = this.h;
                if (imageView7 != null) {
                    gj.m.j0(imageView7);
                }
                android.widget.ImageView imageView8 = this.h;
                if (imageView8 != null) {
                    imageView8.setImageResource(2131234515);
                }
                android.widget.TextView textView9 = this.f;
                if (textView9 != null) {
                    textView9.setText(((com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Error) state).a);
                }
                android.widget.TextView textView10 = this.g;
                if (textView10 != null) {
                    textView10.setText(((com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Error) state).b);
                }
                android.view.View view5 = this.e;
                if (view5 != null) {
                    view5.setPadding(view5.getPaddingLeft(), view5.getPaddingTop(), view5.getPaddingRight(), 0);
                    return;
                }
                return;
            }
            throw new java.lang.RuntimeException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttach(android.content.Context context) {
        q93.b bVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super/*androidx.fragment.app.t*/.onAttach(context);
        q93.b parentFragment = getParentFragment();
        if (parentFragment instanceof q93.b) {
            bVar = parentFragment;
        } else if (context instanceof q93.b) {
            bVar = (q93.b) context;
        } else {
            throw new java.lang.IllegalStateException(context + " or parent fragment must implement " + q93.b.class.getName());
        }
        this.d = bVar;
    }

    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State state;
        super/*androidx.fragment.app.t*/.onCreate(bundle);
        if (bundle == null || (state = (com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State) ((android.os.Parcelable) t80.g.q(bundle, "state", com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.class))) == null) {
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                state = (com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State) ((android.os.Parcelable) t80.g.q(arguments, "state", com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.class));
            } else {
                state = null;
            }
        }
        this.c = state;
    }

    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        i.d dVar = new i.d(requireActivity(), 2132083437);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(2131559051, (android.view.ViewGroup) null);
        this.e = inflate.findViewById(2131363145);
        this.f = (android.widget.TextView) inflate.findViewById(2131367033);
        this.g = (android.widget.TextView) inflate.findViewById(2131366839);
        this.h = (android.widget.ImageView) inflate.findViewById(2131364521);
        this.i = (android.widget.ProgressBar) inflate.findViewById(2131365848);
        i.d view = dVar.setView(inflate);
        final int i = 0;
        final int i2 = 1;
        i.e create = view.b(false).setPositiveButton(2132019051, new android.content.DialogInterface.OnClickListener(this) { // from class: q93.qux
            public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                switch (i) {
                    case 0:
                        this.b.dismissAllowingStateLoss();
                        return;
                    default:
                        this.b.dismissAllowingStateLoss();
                        return;
                }
            }
        }).setNegativeButton(2132019018, new android.content.DialogInterface.OnClickListener(this) { // from class: q93.qux
            public final /* synthetic */ com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                switch (i2) {
                    case 0:
                        this.b.dismissAllowingStateLoss();
                        return;
                    default:
                        this.b.dismissAllowingStateLoss();
                        return;
                }
            }
        }).create();
        android.view.Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(yb0.i.w(2131234500, requireContext()));
        }
        create.setCanceledOnTouchOutside(false);
        create.setOnShowListener(new com.truecaller.wizard.verification.u(this, create));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "also(...)");
        return create;
    }

    public final void onDetach() {
        super/*androidx.fragment.app.t*/.onDetach();
        this.d = null;
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super/*androidx.fragment.app.t*/.onDismiss(dialogInterface);
        com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State state = this.c;
        if (!(state instanceof com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.Error) && !(state instanceof com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State.PhoneNumberHint)) {
            z = false;
        } else {
            z = true;
        }
        q93.b bVar = this.d;
        if (bVar != null) {
            com.truecaller.wizard.verification.l0 l0Var = (com.truecaller.wizard.verification.l0) bVar;
            l0Var.n = null;
            l0Var.d5().u2(z);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.fragment.app.t*/.onSaveInstanceState(bundle);
        bundle.putParcelable("state", this.c);
    }
}
