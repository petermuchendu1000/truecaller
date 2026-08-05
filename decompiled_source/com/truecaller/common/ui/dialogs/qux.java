package com.truecaller.common.ui.dialogs;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class qux {
    public static void a(androidx.fragment.app.g1 g1Var, java.lang.String str, int i, int i2, java.lang.Integer num, int i3, java.lang.Integer num2, boolean z, com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation buttonsOrientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g1Var, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog = new com.truecaller.common.ui.dialogs.TcSystemDialog();
        tcSystemDialog.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_TITLE", java.lang.Integer.valueOf(i)), new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_SUBTITLE", java.lang.Integer.valueOf(i2)), new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_ICON", num), new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_POSITIVE_TEXT", java.lang.Integer.valueOf(i3)), new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_NEGATIVE_TEXT", num2), new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_BUTTONS_ORIENTATION", java.lang.Integer.valueOf(buttonsOrientation.ordinal())), new kotlin.Pair("ARG_TC_SYSTEM_DIALOG_LINKIFY", java.lang.Boolean.valueOf(z))}));
        tcSystemDialog.show(g1Var, str);
    }

    public static /* synthetic */ void b(androidx.fragment.app.g1 g1Var, java.lang.String str, int i, int i2, java.lang.Integer num, int i3, java.lang.Integer num2, com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation buttonsOrientation, int i4) {
        if ((i4 & 16) != 0) {
            num = null;
        }
        if ((i4 & 64) != 0) {
            num2 = null;
        }
        if ((i4 & 256) != 0) {
            buttonsOrientation = com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation.HORIZONTAL;
        }
        a(g1Var, str, i, i2, num, i3, num2, false, buttonsOrientation);
    }
}
