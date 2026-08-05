package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/ConversationPDO;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ConversationPDO implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.ConversationPDO> CREATOR = new a11.bar(14);
    public final long a;
    public final long b;
    public final com.truecaller.data.entity.InsightsPdo c;
    public final com.truecaller.messaging.data.types.Conversation d;
    public final com.truecaller.messaging.data.types.Message e;

    public ConversationPDO(long j, long j2, com.truecaller.data.entity.InsightsPdo insightsPdo, com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.data.types.Message message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsPdo, "insightsPdo");
        this.a = j;
        this.b = j2;
        this.c = insightsPdo;
        this.d = conversation;
        this.e = message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.data.types.ConversationPDO)) {
            return false;
        }
        com.truecaller.messaging.data.types.ConversationPDO conversationPDO = (com.truecaller.messaging.data.types.ConversationPDO) obj;
        return this.a == conversationPDO.a && this.b == conversationPDO.b && kotlin.jvm.internal.Intrinsics.b(this.c, conversationPDO.c) && kotlin.jvm.internal.Intrinsics.b(this.d, conversationPDO.d) && kotlin.jvm.internal.Intrinsics.b(this.e, conversationPDO.e);
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31;
        int i = 0;
        com.truecaller.messaging.data.types.Conversation conversation = this.d;
        if (conversation == null) {
            hashCode = 0;
        } else {
            hashCode = conversation.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        com.truecaller.messaging.data.types.Message message = this.e;
        if (message != null) {
            i = message.hashCode();
        }
        return i2 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder T = h0.b.T(this.a, "ConversationPDO(conversationId=", ", messageId=");
        T.append(this.b);
        T.append(", insightsPdo=");
        T.append(this.c);
        T.append(", conversation=");
        T.append(this.d);
        T.append(", message=");
        T.append(this.e);
        T.append(")");
        return T.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
