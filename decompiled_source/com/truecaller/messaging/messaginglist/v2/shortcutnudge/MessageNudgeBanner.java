package com.truecaller.messaging.messaginglist.v2.shortcutnudge;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/shortcutnudge/MessageNudgeBanner;", "", "", "analyticContext", "Lv2/t0;", "", "dialogState", "delayedClose", "<init>", "(Ljava/lang/String;Lv2/t0;Lv2/t0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lv2/t0;", "component3", "copy", "(Ljava/lang/String;Lv2/t0;Lv2/t0;)Lcom/truecaller/messaging/messaginglist/v2/shortcutnudge/MessageNudgeBanner;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAnalyticContext", "setAnalyticContext", "(Ljava/lang/String;)V", "Lv2/t0;", "getDialogState", "getDelayedClose", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MessageNudgeBanner {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private java.lang.String analyticContext;

    @org.jetbrains.annotations.NotNull
    private final v2.t0 delayedClose;

    @org.jetbrains.annotations.NotNull
    private final v2.t0 dialogState;

    public MessageNudgeBanner(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull v2.t0 t0Var, @org.jetbrains.annotations.NotNull v2.t0 t0Var2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t0Var, "dialogState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t0Var2, "delayedClose");
        this.analyticContext = str;
        this.dialogState = t0Var;
        this.delayedClose = t0Var2;
    }

    public static /* synthetic */ com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner copy$default(com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner messageNudgeBanner, java.lang.String str, v2.t0 t0Var, v2.t0 t0Var2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = messageNudgeBanner.analyticContext;
        }
        if ((i & 2) != 0) {
            t0Var = messageNudgeBanner.dialogState;
        }
        if ((i & 4) != 0) {
            t0Var2 = messageNudgeBanner.delayedClose;
        }
        return messageNudgeBanner.copy(str, t0Var, t0Var2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAnalyticContext() {
        return this.analyticContext;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final v2.t0 getDialogState() {
        return this.dialogState;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final v2.t0 getDelayedClose() {
        return this.delayedClose;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner copy(@org.jetbrains.annotations.NotNull java.lang.String analyticContext, @org.jetbrains.annotations.NotNull v2.t0 dialogState, @org.jetbrains.annotations.NotNull v2.t0 delayedClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticContext, "analyticContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogState, "dialogState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayedClose, "delayedClose");
        return new com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner(analyticContext, dialogState, delayedClose);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner)) {
            return false;
        }
        com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner messageNudgeBanner = (com.truecaller.messaging.messaginglist.v2.shortcutnudge.MessageNudgeBanner) other;
        return kotlin.jvm.internal.Intrinsics.b(this.analyticContext, messageNudgeBanner.analyticContext) && kotlin.jvm.internal.Intrinsics.b(this.dialogState, messageNudgeBanner.dialogState) && kotlin.jvm.internal.Intrinsics.b(this.delayedClose, messageNudgeBanner.delayedClose);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticContext() {
        return this.analyticContext;
    }

    @org.jetbrains.annotations.NotNull
    public final v2.t0 getDelayedClose() {
        return this.delayedClose;
    }

    @org.jetbrains.annotations.NotNull
    public final v2.t0 getDialogState() {
        return this.dialogState;
    }

    public int hashCode() {
        return this.delayedClose.hashCode() + ((this.dialogState.hashCode() + (this.analyticContext.hashCode() * 31)) * 31);
    }

    public final void setAnalyticContext(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.analyticContext = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "MessageNudgeBanner(analyticContext=" + this.analyticContext + ", dialogState=" + this.dialogState + ", delayedClose=" + this.delayedClose + ")";
    }
}
