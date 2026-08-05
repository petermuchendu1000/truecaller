package com.truecaller.contact.entity.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lcom/truecaller/contact/entity/model/BusinessProfileStyleEntity;", "Lf61/bar;", "Landroid/os/Parcelable;", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "primaryFields", "", "backgroundColor", "", "imageUrls", "<init>", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;Ljava/lang/String;Ljava/util/List;)Lcom/truecaller/contact/entity/model/BusinessProfileStyleEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "getPrimaryFields", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getImageUrls", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BusinessProfileStyleEntity implements f61.bar, android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contact.entity.model.BusinessProfileStyleEntity> CREATOR = new f22.bar(4);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String backgroundColor;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> imageUrls;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields;

    public BusinessProfileStyleEntity(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "imageUrls");
        this.primaryFields = dataEntityPrimaryFields;
        this.backgroundColor = str;
        this.imageUrls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.contact.entity.model.BusinessProfileStyleEntity copy$default(com.truecaller.contact.entity.model.BusinessProfileStyleEntity businessProfileStyleEntity, com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dataEntityPrimaryFields = businessProfileStyleEntity.primaryFields;
        }
        if ((i & 2) != 0) {
            str = businessProfileStyleEntity.backgroundColor;
        }
        if ((i & 4) != 0) {
            list = businessProfileStyleEntity.imageUrls;
        }
        return businessProfileStyleEntity.copy(dataEntityPrimaryFields, str, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return this.imageUrls;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.contact.entity.model.BusinessProfileStyleEntity copy(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields, @org.jetbrains.annotations.Nullable java.lang.String backgroundColor, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> imageUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        return new com.truecaller.contact.entity.model.BusinessProfileStyleEntity(primaryFields, backgroundColor, imageUrls);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.contact.entity.model.BusinessProfileStyleEntity)) {
            return false;
        }
        com.truecaller.contact.entity.model.BusinessProfileStyleEntity businessProfileStyleEntity = (com.truecaller.contact.entity.model.BusinessProfileStyleEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.primaryFields, businessProfileStyleEntity.primaryFields) && kotlin.jvm.internal.Intrinsics.b(this.backgroundColor, businessProfileStyleEntity.backgroundColor) && kotlin.jvm.internal.Intrinsics.b(this.imageUrls, businessProfileStyleEntity.imageUrls);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getImageUrls() {
        return this.imageUrls;
    }

    @Override // f61.bar
    @org.jetbrains.annotations.Nullable
    public com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    public int hashCode() {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
        int hashCode = (dataEntityPrimaryFields == null ? 0 : dataEntityPrimaryFields.hashCode()) * 31;
        java.lang.String str = this.backgroundColor;
        return this.imageUrls.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
        java.lang.String str = this.backgroundColor;
        java.util.List<java.lang.String> list = this.imageUrls;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessProfileStyleEntity(primaryFields=");
        sb.append(dataEntityPrimaryFields);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", imageUrls=");
        return y.o.g(sb, list, ")");
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
        dest.writeString(this.backgroundColor);
        dest.writeStringList(this.imageUrls);
    }
}
