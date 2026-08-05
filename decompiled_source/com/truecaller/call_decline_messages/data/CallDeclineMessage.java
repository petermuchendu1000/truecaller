package com.truecaller.call_decline_messages.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_decline_messages/data/CallDeclineMessage;", "Landroid/os/Parcelable;", "call-decline-messages_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallDeclineMessage implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_decline_messages.data.CallDeclineMessage> CREATOR = new java.lang.Object();
    public final java.lang.String a;
    public final java.lang.String b;
    public final com.truecaller.call_decline_messages.data.MessageType c;

    public CallDeclineMessage(java.lang.String str, java.lang.String str2, com.truecaller.call_decline_messages.data.MessageType messageType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        this.a = str;
        this.b = str2;
        this.c = messageType;
    }

    public static com.truecaller.call_decline_messages.data.CallDeclineMessage a(com.truecaller.call_decline_messages.data.CallDeclineMessage callDeclineMessage, java.lang.String str, com.truecaller.call_decline_messages.data.MessageType messageType, int i) {
        java.lang.String str2 = callDeclineMessage.a;
        if ((i & 2) != 0) {
            str = callDeclineMessage.b;
        }
        if ((i & 4) != 0) {
            messageType = callDeclineMessage.c;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        return new com.truecaller.call_decline_messages.data.CallDeclineMessage(str2, str, messageType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.call_decline_messages.data.CallDeclineMessage)) {
            return false;
        }
        com.truecaller.call_decline_messages.data.CallDeclineMessage callDeclineMessage = (com.truecaller.call_decline_messages.data.CallDeclineMessage) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, callDeclineMessage.a) && kotlin.jvm.internal.Intrinsics.b(this.b, callDeclineMessage.b) && this.c == callDeclineMessage.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("CallDeclineMessage(id=", this.a, ", text=", this.b, ", type=");
        E.append(this.c);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
