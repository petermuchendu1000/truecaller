package com.truecaller.messaging.conversation.draft;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/conversation/draft/SharedTextDraftsArguments;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SharedTextDraftsArguments implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.conversation.draft.SharedTextDraftsArguments> CREATOR = new y02.t(1);
    public final java.util.ArrayList a;
    public final boolean b;
    public final java.lang.String c;
    public final java.lang.String d;

    public SharedTextDraftsArguments(java.util.ArrayList arrayList, boolean z, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "drafts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "simToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.truecaller.messaging.conversation.draft.SharedTextDraftsArguments) {
                com.truecaller.messaging.conversation.draft.SharedTextDraftsArguments sharedTextDraftsArguments = (com.truecaller.messaging.conversation.draft.SharedTextDraftsArguments) obj;
                if (!this.a.equals(sharedTextDraftsArguments.a) || this.b != sharedTextDraftsArguments.b || !kotlin.jvm.internal.Intrinsics.b(this.c, sharedTextDraftsArguments.c) || !kotlin.jvm.internal.Intrinsics.b(this.d, sharedTextDraftsArguments.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.d.hashCode() + ax1.bar.e((hashCode + i) * 31, 31, this.c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedTextDraftsArguments(drafts=");
        sb.append(this.a);
        sb.append(", isIm=");
        sb.append(this.b);
        sb.append(", simToken=");
        return bar.x(sb, this.c, ", text=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.util.ArrayList arrayList = this.a;
        parcel.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) it.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
