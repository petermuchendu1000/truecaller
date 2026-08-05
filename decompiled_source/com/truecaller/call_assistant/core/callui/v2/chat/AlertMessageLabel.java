package com.truecaller.call_assistant.core.callui.v2.chat;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageLabel;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AlertMessageLabel {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String text;

    public AlertMessageLabel(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.text = str;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel copy$default(com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel alertMessageLabel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = alertMessageLabel.text;
        }
        return alertMessageLabel.copy(str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel copy(@org.jetbrains.annotations.Nullable java.lang.String text) {
        return new com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel(text);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel) && kotlin.jvm.internal.Intrinsics.b(this.text, ((com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel) other).text);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        java.lang.String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("AlertMessageLabel(text=", this.text, ")");
    }
}
