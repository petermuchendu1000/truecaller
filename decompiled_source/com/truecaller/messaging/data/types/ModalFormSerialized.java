package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/ModalFormSerialized;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ModalFormSerialized implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.ModalFormSerialized> CREATOR = new a11.bar(23);
    public final java.lang.String a;
    public final kotlin.Lazy b;

    public ModalFormSerialized(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "serialized");
        this.a = str;
        this.b = kotlin.LazyKt.lazy(new bf1.h(this, 28));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.messaging.data.types.ModalFormSerialized) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.messaging.data.types.ModalFormSerialized) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return bar.t("ModalFormSerialized(serialized=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
    }
}
