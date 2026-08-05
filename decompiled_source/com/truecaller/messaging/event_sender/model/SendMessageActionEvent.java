package com.truecaller.messaging.event_sender.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/truecaller/messaging/event_sender/model/SendMessageActionEvent;", "Lcom/truecaller/messaging/event_sender/model/Event;", "actionTag", "", "rawMessageId", "inputPeer", "Lcom/truecaller/messaging/event_sender/model/InputPeer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/messaging/event_sender/model/InputPeer;)V", "getActionTag", "()Ljava/lang/String;", "getRawMessageId", "getInputPeer", "()Lcom/truecaller/messaging/event_sender/model/InputPeer;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "messaging-event-sender_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SendMessageActionEvent extends com.truecaller.messaging.event_sender.model.Event {

    @bw.qux("actionTag")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionTag;

    @bw.qux("inputPeer")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.messaging.event_sender.model.InputPeer inputPeer;

    @bw.qux("rawMessageId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rawMessageId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageActionEvent(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable com.truecaller.messaging.event_sender.model.InputPeer inputPeer) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "actionTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "rawMessageId");
        this.actionTag = str;
        this.rawMessageId = str2;
        this.inputPeer = inputPeer;
    }

    public static /* synthetic */ com.truecaller.messaging.event_sender.model.SendMessageActionEvent copy$default(com.truecaller.messaging.event_sender.model.SendMessageActionEvent sendMessageActionEvent, java.lang.String str, java.lang.String str2, com.truecaller.messaging.event_sender.model.InputPeer inputPeer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sendMessageActionEvent.actionTag;
        }
        if ((i & 2) != 0) {
            str2 = sendMessageActionEvent.rawMessageId;
        }
        if ((i & 4) != 0) {
            inputPeer = sendMessageActionEvent.inputPeer;
        }
        return sendMessageActionEvent.copy(str, str2, inputPeer);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActionTag() {
        return this.actionTag;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawMessageId() {
        return this.rawMessageId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.messaging.event_sender.model.InputPeer getInputPeer() {
        return this.inputPeer;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.event_sender.model.SendMessageActionEvent copy(@org.jetbrains.annotations.NotNull java.lang.String actionTag, @org.jetbrains.annotations.NotNull java.lang.String rawMessageId, @org.jetbrains.annotations.Nullable com.truecaller.messaging.event_sender.model.InputPeer inputPeer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionTag, "actionTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawMessageId, "rawMessageId");
        return new com.truecaller.messaging.event_sender.model.SendMessageActionEvent(actionTag, rawMessageId, inputPeer);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.event_sender.model.SendMessageActionEvent)) {
            return false;
        }
        com.truecaller.messaging.event_sender.model.SendMessageActionEvent sendMessageActionEvent = (com.truecaller.messaging.event_sender.model.SendMessageActionEvent) other;
        return kotlin.jvm.internal.Intrinsics.b(this.actionTag, sendMessageActionEvent.actionTag) && kotlin.jvm.internal.Intrinsics.b(this.rawMessageId, sendMessageActionEvent.rawMessageId) && kotlin.jvm.internal.Intrinsics.b(this.inputPeer, sendMessageActionEvent.inputPeer);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionTag() {
        return this.actionTag;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.messaging.event_sender.model.InputPeer getInputPeer() {
        return this.inputPeer;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRawMessageId() {
        return this.rawMessageId;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.actionTag.hashCode() * 31, 31, this.rawMessageId);
        com.truecaller.messaging.event_sender.model.InputPeer inputPeer = this.inputPeer;
        if (inputPeer == null) {
            hashCode = 0;
        } else {
            hashCode = inputPeer.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.actionTag;
        java.lang.String str2 = this.rawMessageId;
        com.truecaller.messaging.event_sender.model.InputPeer inputPeer = this.inputPeer;
        java.lang.StringBuilder E = ro0.f.E("SendMessageActionEvent(actionTag=", str, ", rawMessageId=", str2, ", inputPeer=");
        E.append(inputPeer);
        E.append(")");
        return E.toString();
    }
}
