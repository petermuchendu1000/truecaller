package com.truecaller.messaging.urgent;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/urgent/UrgentConversation;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class UrgentConversation implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.urgent.UrgentConversation> CREATOR = new om0.bar(4);
    public final com.truecaller.messaging.data.types.Conversation a;
    public final int b;
    public final long c;

    public UrgentConversation(com.truecaller.messaging.data.types.Conversation conversation, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.a = conversation;
        this.b = i;
        this.c = j;
    }

    public static com.truecaller.messaging.urgent.UrgentConversation a(com.truecaller.messaging.urgent.UrgentConversation urgentConversation, int i, long j) {
        com.truecaller.messaging.data.types.Conversation conversation = urgentConversation.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
        return new com.truecaller.messaging.urgent.UrgentConversation(conversation, i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.urgent.UrgentConversation)) {
            return false;
        }
        com.truecaller.messaging.urgent.UrgentConversation urgentConversation = (com.truecaller.messaging.urgent.UrgentConversation) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, urgentConversation.a) && this.b == urgentConversation.b && this.c == urgentConversation.c;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UrgentConversation(conversation=");
        sb.append(this.a);
        sb.append(", unreadCount=");
        sb.append(this.b);
        sb.append(", openElapsedRealtime=");
        return bar.n(this.c, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }
}
