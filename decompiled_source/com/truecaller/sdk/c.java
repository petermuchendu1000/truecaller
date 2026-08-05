package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity b;

    public /* synthetic */ c(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    public final java.lang.Object invoke() {
        int i = this.a;
        int i2 = 2131367355;
        int i3 = 2131366817;
        int i4 = 2131364943;
        int i5 = 2131363184;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
        switch (i) {
            case 0:
                android.view.LayoutInflater layoutInflater = ((com.truecaller.sdk.BottomSheetConfirmProfileActivity) appCompatActivity).getLayoutInflater();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                androidx.coordinatorlayout.widget.CoordinatorLayout inflate = layoutInflater.inflate(2131558458, (android.view.ViewGroup) null, false);
                android.view.View o = df0.qux.o(2131363110, inflate);
                if (o != null) {
                    int i6 = 2131362428;
                    android.widget.Space space = (android.widget.Space) df0.qux.o(2131362428, o);
                    if (space != null) {
                        i6 = 2131363101;
                        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131363101, o);
                        if (textView != null) {
                            i6 = 2131363102;
                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) df0.qux.o(2131363102, o);
                            if (progressBar != null) {
                                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131363184, o);
                                if (textView2 != null) {
                                    i5 = 2131363227;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) df0.qux.o(2131363227, o);
                                    if (linearLayout != null) {
                                        i5 = 2131363626;
                                        android.view.View o2 = df0.qux.o(2131363626, o);
                                        if (o2 != null) {
                                            i5 = 2131363778;
                                            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131363778, o);
                                            if (imageView != null) {
                                                i5 = 2131364653;
                                                android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131364653, o);
                                                if (textView3 != null) {
                                                    i5 = 2131364654;
                                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) df0.qux.o(2131364654, o);
                                                    if (linearLayout2 != null) {
                                                        i5 = 2131364655;
                                                        android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131364655, o);
                                                        if (textView4 != null) {
                                                            i5 = 2131364660;
                                                            android.widget.TextView textView5 = (android.widget.TextView) df0.qux.o(2131364660, o);
                                                            if (textView5 != null) {
                                                                i5 = 2131364661;
                                                                android.widget.TextView textView6 = (android.widget.TextView) df0.qux.o(2131364661, o);
                                                                if (textView6 != null) {
                                                                    i5 = 2131364847;
                                                                    androidx.appcompat.widget.AppCompatImageView o3 = df0.qux.o(2131364847, o);
                                                                    if (o3 != null) {
                                                                        android.widget.TextView textView7 = (android.widget.TextView) df0.qux.o(2131364943, o);
                                                                        if (textView7 != null) {
                                                                            i4 = 2131364944;
                                                                            android.view.View o4 = df0.qux.o(2131364944, o);
                                                                            if (o4 != null) {
                                                                                i4 = 2131365022;
                                                                                android.widget.TextView textView8 = (android.widget.TextView) df0.qux.o(2131365022, o);
                                                                                if (textView8 != null) {
                                                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) o;
                                                                                    android.widget.TextView textView9 = (android.widget.TextView) df0.qux.o(2131366817, o);
                                                                                    if (textView9 != null) {
                                                                                        android.widget.TextView textView10 = (android.widget.TextView) df0.qux.o(2131367355, o);
                                                                                        if (textView10 != null) {
                                                                                            return new mo2.baz(inflate, new mo2.b(linearLayout3, space, textView, progressBar, textView2, linearLayout, o2, imageView, textView3, linearLayout2, textView4, textView5, textView6, o3, textView7, o4, textView8, linearLayout3, textView9, textView10));
                                                                                        }
                                                                                    } else {
                                                                                        i2 = 2131366817;
                                                                                    }
                                                                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o.getResources().getResourceName(i2)));
                                                                                }
                                                                            }
                                                                        }
                                                                        i2 = i4;
                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o.getResources().getResourceName(i2)));
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
                                i2 = i5;
                                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o.getResources().getResourceName(i2)));
                            }
                        }
                    }
                    i2 = i6;
                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o.getResources().getResourceName(i2)));
                }
                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(2131363110)));
            default:
                android.view.LayoutInflater layoutInflater2 = ((com.truecaller.sdk.FullScreenConfirmActivity) appCompatActivity).getLayoutInflater();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater2, "getLayoutInflater(...)");
                androidx.constraintlayout.widget.ConstraintLayout inflate2 = layoutInflater2.inflate(2131558459, (android.view.ViewGroup) null, false);
                int i7 = 2131363146;
                androidx.constraintlayout.widget.Group o5 = df0.qux.o(2131363146, inflate2);
                if (o5 != null) {
                    i7 = 2131363980;
                    androidx.constraintlayout.widget.ConstraintLayout o6 = df0.qux.o(2131363980, inflate2);
                    if (o6 != null) {
                        androidx.appcompat.widget.AppCompatTextView o7 = df0.qux.o(2131363103, o6);
                        if (o7 != null) {
                            androidx.appcompat.widget.AppCompatTextView o8 = df0.qux.o(2131363184, o6);
                            if (o8 != null) {
                                androidx.appcompat.widget.AppCompatTextView o9 = df0.qux.o(2131364943, o6);
                                if (o9 != null) {
                                    i4 = 2131365841;
                                    android.view.View o10 = df0.qux.o(2131365841, o6);
                                    if (o10 != null) {
                                        d91.n0 n0Var = new d91.n0(o6, o7, o8, o9, o10, 11);
                                        int i8 = 2131365647;
                                        androidx.appcompat.widget.AppCompatTextView o11 = df0.qux.o(2131365647, inflate2);
                                        if (o11 != null) {
                                            i8 = 2131365649;
                                            androidx.appcompat.widget.AppCompatTextView o12 = df0.qux.o(2131365649, inflate2);
                                            if (o12 != null) {
                                                i8 = 2131365848;
                                                android.widget.ProgressBar progressBar2 = (android.widget.ProgressBar) df0.qux.o(2131365848, inflate2);
                                                if (progressBar2 != null) {
                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate2;
                                                    androidx.appcompat.widget.AppCompatTextView o14 = df0.qux.o(2131366817, inflate2);
                                                    if (o14 != null) {
                                                        i3 = 2131367123;
                                                        android.view.View o15 = df0.qux.o(2131367123, inflate2);
                                                        if (o15 != null) {
                                                            i3 = 2131367354;
                                                            androidx.constraintlayout.widget.ConstraintLayout o16 = df0.qux.o(2131367354, inflate2);
                                                            if (o16 != null) {
                                                                int i9 = 2131363066;
                                                                android.view.View o17 = df0.qux.o(2131363066, o16);
                                                                if (o17 != null) {
                                                                    i9 = 2131363515;
                                                                    if (df0.qux.o(2131363515, o16) != null) {
                                                                        i9 = 2131363784;
                                                                        androidx.appcompat.widget.AppCompatImageView o18 = df0.qux.o(2131363784, o16);
                                                                        if (o18 != null) {
                                                                            i9 = 2131365645;
                                                                            androidx.appcompat.widget.AppCompatImageView o19 = df0.qux.o(2131365645, o16);
                                                                            if (o19 != null) {
                                                                                i9 = 2131365836;
                                                                                com.truecaller.common.ui.avatar.AvatarXView o20 = df0.qux.o(2131365836, o16);
                                                                                if (o20 != null) {
                                                                                    i9 = 2131365838;
                                                                                    androidx.recyclerview.widget.RecyclerView o21 = df0.qux.o(2131365838, o16);
                                                                                    if (o21 != null) {
                                                                                        androidx.appcompat.widget.AppCompatTextView o22 = df0.qux.o(2131367355, o16);
                                                                                        if (o22 != null) {
                                                                                            i2 = 2131367356;
                                                                                            androidx.appcompat.widget.AppCompatTextView o23 = df0.qux.o(2131367356, o16);
                                                                                            if (o23 != null) {
                                                                                                return new mo2.qux(constraintLayout, o5, n0Var, o11, o12, progressBar2, o14, o15, new do1.b(o16, o17, o18, o19, o20, o21, o22, o23));
                                                                                            }
                                                                                        }
                                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o16.getResources().getResourceName(i2)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i2 = i9;
                                                                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o16.getResources().getResourceName(i2)));
                                                            }
                                                        }
                                                    }
                                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                                                }
                                            }
                                        }
                                        i3 = i8;
                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                                    }
                                }
                            } else {
                                i4 = 2131363184;
                            }
                        } else {
                            i4 = 2131363103;
                        }
                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o6.getResources().getResourceName(i4)));
                    }
                }
                i3 = i7;
                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        }
    }
}
