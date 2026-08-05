package com.truecaller.messaging.event_sender.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/messaging/event_sender/model/InputPeer;", "", "group", "Lcom/truecaller/messaging/event_sender/model/Group;", "user", "Lcom/truecaller/messaging/event_sender/model/User;", "<init>", "(Lcom/truecaller/messaging/event_sender/model/Group;Lcom/truecaller/messaging/event_sender/model/User;)V", "getGroup", "()Lcom/truecaller/messaging/event_sender/model/Group;", "getUser", "()Lcom/truecaller/messaging/event_sender/model/User;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-event-sender_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InputPeer {

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.messaging.event_sender.model.Group group;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.messaging.event_sender.model.User user;

    /* JADX WARN: Multi-variable type inference failed */
    public InputPeer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.truecaller.messaging.event_sender.model.InputPeer copy$default(com.truecaller.messaging.event_sender.model.InputPeer inputPeer, com.truecaller.messaging.event_sender.model.Group group, com.truecaller.messaging.event_sender.model.User user, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            group = inputPeer.group;
        }
        if ((i & 2) != 0) {
            user = inputPeer.user;
        }
        return inputPeer.copy(group, user);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.messaging.event_sender.model.Group getGroup() {
        return this.group;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.messaging.event_sender.model.User getUser() {
        return this.user;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.event_sender.model.InputPeer copy(@org.jetbrains.annotations.Nullable com.truecaller.messaging.event_sender.model.Group group, @org.jetbrains.annotations.Nullable com.truecaller.messaging.event_sender.model.User user) {
        return new com.truecaller.messaging.event_sender.model.InputPeer(group, user);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.event_sender.model.InputPeer)) {
            return false;
        }
        com.truecaller.messaging.event_sender.model.InputPeer inputPeer = (com.truecaller.messaging.event_sender.model.InputPeer) other;
        return kotlin.jvm.internal.Intrinsics.b(this.group, inputPeer.group) && kotlin.jvm.internal.Intrinsics.b(this.user, inputPeer.user);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.messaging.event_sender.model.Group getGroup() {
        return this.group;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.messaging.event_sender.model.User getUser() {
        return this.user;
    }

    public int hashCode() {
        com.truecaller.messaging.event_sender.model.Group group = this.group;
        int hashCode = (group == null ? 0 : group.hashCode()) * 31;
        com.truecaller.messaging.event_sender.model.User user = this.user;
        return hashCode + (user != null ? user.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "InputPeer(group=" + this.group + ", user=" + this.user + ")";
    }

    public InputPeer(@org.jetbrains.annotations.Nullable com.truecaller.messaging.event_sender.model.Group group, @org.jetbrains.annotations.Nullable com.truecaller.messaging.event_sender.model.User user) {
        this.group = group;
        this.user = user;
    }

    public /* synthetic */ InputPeer(com.truecaller.messaging.event_sender.model.Group group, com.truecaller.messaging.event_sender.model.User user, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : group, (i & 2) != 0 ? null : user);
    }
}
