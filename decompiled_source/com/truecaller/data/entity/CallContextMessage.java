package com.truecaller.data.entity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/data/entity/CallContextMessage;", "Landroid/os/Parcelable;", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CallContextMessage implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.CallContextMessage> CREATOR = new om0.bar(8);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final com.truecaller.data.entity.FeatureType d;
    public final com.truecaller.data.entity.MessageType e;
    public final java.lang.String f;
    public final boolean g;

    public CallContextMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.data.entity.FeatureType featureType, com.truecaller.data.entity.MessageType messageType, java.lang.String str4, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureType, "featureType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = featureType;
        this.e = messageType;
        this.f = str4;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.data.entity.CallContextMessage)) {
            return false;
        }
        com.truecaller.data.entity.CallContextMessage callContextMessage = (com.truecaller.data.entity.CallContextMessage) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, callContextMessage.a) && kotlin.jvm.internal.Intrinsics.b(this.b, callContextMessage.b) && kotlin.jvm.internal.Intrinsics.b(this.c, callContextMessage.c) && this.d == callContextMessage.d && kotlin.jvm.internal.Intrinsics.b(this.e, callContextMessage.e) && kotlin.jvm.internal.Intrinsics.b(this.f, callContextMessage.f) && this.g == callContextMessage.g;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        java.lang.String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("CallContextMessage(id=", this.a, ", number=", this.b, ", message=");
        E.append(this.c);
        E.append(", featureType=");
        E.append(this.d);
        E.append(", messageType=");
        E.append(this.e);
        E.append(", analyticsContext=");
        E.append(this.f);
        E.append(", isShown=");
        return h8.s0.s(E, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
