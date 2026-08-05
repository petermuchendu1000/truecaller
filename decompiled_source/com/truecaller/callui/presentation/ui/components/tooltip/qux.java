package com.truecaller.callui.presentation.ui.components.tooltip;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux implements yy0.baz {
    public final java.lang.String a;
    public final ap1.d b;
    public final com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type c;

    public qux(java.lang.String str, ap1.d dVar, com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "iconType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        this.a = str;
        this.b = dVar;
        this.c = type;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.callui.presentation.ui.components.tooltip.qux)) {
            return false;
        }
        com.truecaller.callui.presentation.ui.components.tooltip.qux quxVar = (com.truecaller.callui.presentation.ui.components.tooltip.qux) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, quxVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, quxVar.b) && this.c == quxVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Visible(text=" + this.a + ", iconType=" + this.b + ", type=" + this.c + ")";
    }
}
