package com.truecaller.contact.entity.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"Lcom/truecaller/contact/entity/model/ElectedTagEntity;", "Lf61/bar;", "Landroid/os/Parcelable;", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "primaryFields", "", "value", "<init>", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;Ljava/lang/String;)Lcom/truecaller/contact/entity/model/ElectedTagEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "getPrimaryFields", "Ljava/lang/String;", "getValue", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ElectedTagEntity implements f61.bar, android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contact.entity.model.ElectedTagEntity> CREATOR = new f22.bar(8);

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String value;

    public ElectedTagEntity(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.primaryFields = dataEntityPrimaryFields;
        this.value = str;
    }

    public static /* synthetic */ com.truecaller.contact.entity.model.ElectedTagEntity copy$default(com.truecaller.contact.entity.model.ElectedTagEntity electedTagEntity, com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dataEntityPrimaryFields = electedTagEntity.primaryFields;
        }
        if ((i & 2) != 0) {
            str = electedTagEntity.value;
        }
        return electedTagEntity.copy(dataEntityPrimaryFields, str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.contact.entity.model.ElectedTagEntity copy(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields, @org.jetbrains.annotations.Nullable java.lang.String value) {
        return new com.truecaller.contact.entity.model.ElectedTagEntity(primaryFields, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.contact.entity.model.ElectedTagEntity)) {
            return false;
        }
        com.truecaller.contact.entity.model.ElectedTagEntity electedTagEntity = (com.truecaller.contact.entity.model.ElectedTagEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.primaryFields, electedTagEntity.primaryFields) && kotlin.jvm.internal.Intrinsics.b(this.value, electedTagEntity.value);
    }

    @Override // f61.bar
    @org.jetbrains.annotations.Nullable
    public com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
        int hashCode = (dataEntityPrimaryFields == null ? 0 : dataEntityPrimaryFields.hashCode()) * 31;
        java.lang.String str = this.value;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ElectedTagEntity(primaryFields=" + this.primaryFields + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
        if (dataEntityPrimaryFields == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dataEntityPrimaryFields.writeToParcel(dest, flags);
        }
        dest.writeString(this.value);
    }

    public /* synthetic */ ElectedTagEntity(com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dataEntityPrimaryFields, str);
    }
}
