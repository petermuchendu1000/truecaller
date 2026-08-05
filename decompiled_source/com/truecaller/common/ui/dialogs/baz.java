package com.truecaller.common.ui.dialogs;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class baz {
    public static void a(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, boolean z, com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle buttonStyle, com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle buttonStyle2, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "positiveButtonText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonStyle, "positiveButtonStyle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonStyle2, "negativeButtonStyle");
        androidx.lifecycle.o1 o1Var = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(e41.e.class), new d.k(appCompatActivity, 5), new d.k(appCompatActivity, 4), new d.k(appCompatActivity, 6));
        ((e41.e) o1Var.getValue()).o().k(e41.b.b);
        ((e41.e) o1Var.getValue()).o().e(appCompatActivity, new com.truecaller.common.ui.dialogs.bar(function0, function1, function12, o1Var));
        com.truecaller.common.ui.dialogs.ConfirmationDialog confirmationDialog = new com.truecaller.common.ui.dialogs.ConfirmationDialog();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("title", str);
        bundle.putCharSequence("subtitle", charSequence);
        bundle.putString("positive_button_text", str2);
        bundle.putString("negative_button_text", str3);
        bundle.putString("checkbox_text", str4);
        bundle.putSerializable("positive_button_style", buttonStyle);
        bundle.putSerializable("negative_button_style", buttonStyle2);
        confirmationDialog.setArguments(bundle);
        confirmationDialog.setCancelable(z);
        if (z2) {
            androidx.fragment.app.g1 supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.f(0, confirmationDialog, (java.lang.String) null, 1);
            j.m(true, true);
            return;
        }
        confirmationDialog.show(appCompatActivity.getSupportFragmentManager(), (java.lang.String) null);
    }

    public static /* synthetic */ void b(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, boolean z, com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle buttonStyle, com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle buttonStyle2, int i) {
        kotlin.jvm.functions.Function0 function02;
        boolean z2;
        com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle buttonStyle3;
        com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle buttonStyle4;
        if ((i & com.ctc.wstx.cfg.OutputConfigFlags.CFG_AUTOMATIC_END_ELEMENTS) != 0) {
            function02 = null;
        } else {
            function02 = function0;
        }
        boolean z3 = true;
        if ((i & 512) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 1024) != 0) {
            buttonStyle3 = com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle.DEFAULT;
        } else {
            buttonStyle3 = buttonStyle;
        }
        if ((i & 2048) != 0) {
            buttonStyle4 = com.truecaller.common.ui.dialogs.ConfirmationDialog.ButtonStyle.DEFAULT;
        } else {
            buttonStyle4 = buttonStyle2;
        }
        if ((i & 4096) != 0) {
            z3 = false;
        }
        a(appCompatActivity, str, charSequence, str2, str3, null, function1, function02, null, z2, buttonStyle3, buttonStyle4, z3);
    }
}
