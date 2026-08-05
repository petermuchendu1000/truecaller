package com.truecaller.contact.entity.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010J\u001a\u0010 \u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u001a¨\u0006&"}, d2 = {"Lcom/truecaller/contact/entity/model/TagEntity;", "Lf61/bar;", "Landroid/os/Parcelable;", "Lq81/a;", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "primaryFields", "", "tagId", "<init>", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;Ljava/lang/String;)V", "other", "", "mergeEquals", "(Lq81/a;)Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;Ljava/lang/String;)Lcom/truecaller/contact/entity/model/TagEntity;", "toString", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "getPrimaryFields", "Ljava/lang/String;", "getTagId", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class TagEntity implements f61.bar, android.os.Parcelable, q81.a {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contact.entity.model.TagEntity> CREATOR = new f22.bar(15);

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String tagId;

    public TagEntity(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.primaryFields = dataEntityPrimaryFields;
        this.tagId = str;
    }

    public static /* synthetic */ com.truecaller.contact.entity.model.TagEntity copy$default(com.truecaller.contact.entity.model.TagEntity tagEntity, com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dataEntityPrimaryFields = tagEntity.primaryFields;
        }
        if ((i & 2) != 0) {
            str = tagEntity.tagId;
        }
        return tagEntity.copy(dataEntityPrimaryFields, str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTagId() {
        return this.tagId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.contact.entity.model.TagEntity copy(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields, @org.jetbrains.annotations.Nullable java.lang.String tagId) {
        return new com.truecaller.contact.entity.model.TagEntity(primaryFields, tagId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.contact.entity.model.TagEntity)) {
            return false;
        }
        com.truecaller.contact.entity.model.TagEntity tagEntity = (com.truecaller.contact.entity.model.TagEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.primaryFields, tagEntity.primaryFields) && kotlin.jvm.internal.Intrinsics.b(this.tagId, tagEntity.tagId);
    }

    @Override // f61.bar
    @org.jetbrains.annotations.Nullable
    public com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTagId() {
        return this.tagId;
    }

    public int hashCode() {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
        int hashCode = (dataEntityPrimaryFields == null ? 0 : dataEntityPrimaryFields.hashCode()) * 31;
        java.lang.String str = this.tagId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public boolean mergeEquals(@org.jetbrains.annotations.NotNull q81.a other) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof com.truecaller.contact.entity.model.TagEntity)) {
            return false;
        }
        com.truecaller.contact.entity.model.TagEntity tagEntity = (com.truecaller.contact.entity.model.TagEntity) other;
        if (kotlin.jvm.internal.Intrinsics.b(this.tagId, tagEntity.tagId)) {
            com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields = getPrimaryFields();
            java.lang.Integer num2 = null;
            if (primaryFields != null) {
                num = primaryFields.e;
            } else {
                num = null;
            }
            com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields2 = tagEntity.getPrimaryFields();
            if (primaryFields2 != null) {
                num2 = primaryFields2.e;
            }
            if (kotlin.jvm.internal.Intrinsics.b(num, num2)) {
                return true;
            }
        }
        return false;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "TagEntity(primaryFields=" + this.primaryFields + ", tagId=" + this.tagId + ")";
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
        dest.writeString(this.tagId);
    }

    public /* synthetic */ TagEntity(com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dataEntityPrimaryFields, str);
    }
}
