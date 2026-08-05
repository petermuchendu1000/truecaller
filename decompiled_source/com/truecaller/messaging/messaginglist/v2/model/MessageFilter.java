package com.truecaller.messaging.messaginglist.v2.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0005J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilter;", "Landroid/os/Parcelable;", "type", "Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;", "unreadCount", "", "isSelected", "", "<init>", "(Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;IZ)V", "getType", "()Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;", "getUnreadCount", "()I", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MessageFilter implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.messaginglist.v2.model.MessageFilter> CREATOR = new rz0.b0(12);
    private boolean isSelected;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType type;
    private final int unreadCount;

    public MessageFilter(@org.jetbrains.annotations.NotNull com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageFilterType, "type");
        this.type = messageFilterType;
        this.unreadCount = i;
        this.isSelected = z;
    }

    public static /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.MessageFilter copy$default(com.truecaller.messaging.messaginglist.v2.model.MessageFilter messageFilter, com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            messageFilterType = messageFilter.type;
        }
        if ((i2 & 2) != 0) {
            i = messageFilter.unreadCount;
        }
        if ((i2 & 4) != 0) {
            z = messageFilter.isSelected;
        }
        return messageFilter.copy(messageFilterType, i, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.messaginglist.v2.model.MessageFilter copy(@org.jetbrains.annotations.NotNull com.truecaller.messaging.messaginglist.v2.model.MessageFilterType type, int unreadCount, boolean isSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return new com.truecaller.messaging.messaginglist.v2.model.MessageFilter(type, unreadCount, isSelected);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.messaginglist.v2.model.MessageFilter)) {
            return false;
        }
        com.truecaller.messaging.messaginglist.v2.model.MessageFilter messageFilter = (com.truecaller.messaging.messaginglist.v2.model.MessageFilter) other;
        return this.type == messageFilter.type && this.unreadCount == messageFilter.unreadCount && this.isSelected == messageFilter.isSelected;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType getType() {
        return this.type;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.unreadCount) * 31) + (this.isSelected ? 1231 : 1237);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType = this.type;
        int i = this.unreadCount;
        boolean z = this.isSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageFilter(type=");
        sb.append(messageFilterType);
        sb.append(", unreadCount=");
        sb.append(i);
        sb.append(", isSelected=");
        return h8.s0.s(sb, z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.type.writeToParcel(dest, flags);
        dest.writeInt(this.unreadCount);
        dest.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ MessageFilter(com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(messageFilterType, i, (i2 & 4) != 0 ? false : z);
    }
}
