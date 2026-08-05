package com.truecaller.messaging.conversation.draft;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/conversation/draft/DraftUri;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class DraftUri implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.conversation.draft.DraftUri> CREATOR = new y02.t(0);
    public final android.net.Uri a;
    public final com.truecaller.messaging.conversation.draft.UriTypeHint b;
    public final boolean c;

    public DraftUri(android.net.Uri uri, com.truecaller.messaging.conversation.draft.UriTypeHint uriTypeHint, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uriTypeHint, "typeHint");
        this.a = uri;
        this.b = uriTypeHint;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.conversation.draft.DraftUri)) {
            return false;
        }
        com.truecaller.messaging.conversation.draft.DraftUri draftUri = (com.truecaller.messaging.conversation.draft.DraftUri) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, draftUri.a) && this.b == draftUri.b && this.c == draftUri.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DraftUri(uri=");
        sb.append(this.a);
        sb.append(", typeHint=");
        sb.append(this.b);
        sb.append(", isTemporary=");
        return h8.s0.s(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
    }
}
