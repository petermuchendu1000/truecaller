package com.truecaller.messaging.conversation.draft;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/conversation/draft/DraftArguments;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class DraftArguments implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.conversation.draft.DraftArguments> CREATOR = new rz0.b0(29);
    public final com.truecaller.messaging.conversation.draft.DraftMode a;
    public final java.util.ArrayList b;
    public final java.util.List c;
    public final boolean d;
    public final java.lang.String e;
    public final boolean f;

    public DraftArguments(com.truecaller.messaging.conversation.draft.DraftMode draftMode, java.util.ArrayList arrayList, java.util.List list, boolean z, java.lang.String str, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draftMode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "drafts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "attachmentUris");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "simToken");
        this.a = draftMode;
        this.b = arrayList;
        this.c = list;
        this.d = z;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.truecaller.messaging.conversation.draft.DraftArguments) {
                com.truecaller.messaging.conversation.draft.DraftArguments draftArguments = (com.truecaller.messaging.conversation.draft.DraftArguments) obj;
                if (this.a != draftArguments.a || !this.b.equals(draftArguments.b) || !kotlin.jvm.internal.Intrinsics.b(this.c, draftArguments.c) || this.d != draftArguments.d || !kotlin.jvm.internal.Intrinsics.b(this.e, draftArguments.e) || this.f != draftArguments.f) {
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
        int g = uf.qux.g(d4.t.m(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        int i2 = 1237;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int e = ax1.bar.e((g + i) * 31, 31, this.e);
        if (this.f) {
            i2 = 1231;
        }
        return e + i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DraftArguments(mode=");
        sb.append(this.a);
        sb.append(", drafts=");
        sb.append(this.b);
        sb.append(", attachmentUris=");
        sb.append(this.c);
        sb.append(", isIm=");
        sb.append(this.d);
        sb.append(", simToken=");
        return ax1.bar.m(this.e, ", isShareIntent=", ")", sb, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a.name());
        java.util.ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) it.next(), i);
        }
        java.util.Iterator f = z0.a0.f(this.c, parcel);
        while (f.hasNext()) {
            ((com.truecaller.messaging.conversation.draft.DraftUri) f.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
