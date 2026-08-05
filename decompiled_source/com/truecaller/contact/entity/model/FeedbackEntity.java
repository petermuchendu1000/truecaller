package com.truecaller.contact.entity.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\n\u000bB\u0013\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/contact/entity/model/FeedbackEntity;", "Lf61/bar;", "Landroid/os/Parcelable;", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "primaryFields", "<init>", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;)V", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "getPrimaryFields", "()Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "CommentsEntity", "ReviewsEntity", "Lcom/truecaller/contact/entity/model/FeedbackEntity$CommentsEntity;", "Lcom/truecaller/contact/entity/model/FeedbackEntity$ReviewsEntity;", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class FeedbackEntity implements f61.bar, android.os.Parcelable {

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/truecaller/contact/entity/model/FeedbackEntity$ReviewsEntity;", "Lcom/truecaller/contact/entity/model/FeedbackEntity;", "primaryFields", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "<init>", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;)V", "getPrimaryFields", "()Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class ReviewsEntity extends com.truecaller.contact.entity.model.FeedbackEntity {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.Nullable
        private final com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ReviewsEntity() {
            this(r0, 1, r0);
            com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = null;
        }

        public static /* synthetic */ com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity copy$default(com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity reviewsEntity, com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dataEntityPrimaryFields = reviewsEntity.primaryFields;
            }
            return reviewsEntity.copy(dataEntityPrimaryFields);
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
            return this.primaryFields;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity copy(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields) {
            return new com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity(primaryFields);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity) && kotlin.jvm.internal.Intrinsics.b(this.primaryFields, ((com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity) other).primaryFields);
        }

        @Override // com.truecaller.contact.entity.model.FeedbackEntity, f61.bar
        @org.jetbrains.annotations.Nullable
        public com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
            return this.primaryFields;
        }

        public int hashCode() {
            com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
            if (dataEntityPrimaryFields == null) {
                return 0;
            }
            return dataEntityPrimaryFields.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "ReviewsEntity(primaryFields=" + this.primaryFields + ")";
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
        }

        public ReviewsEntity(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields) {
            super(dataEntityPrimaryFields, null);
            this.primaryFields = dataEntityPrimaryFields;
        }

        public /* synthetic */ ReviewsEntity(com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : dataEntityPrimaryFields);
        }
    }

    public /* synthetic */ FeedbackEntity(com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dataEntityPrimaryFields);
    }

    @Override // f61.bar
    @org.jetbrains.annotations.Nullable
    public com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
        return this.primaryFields;
    }

    private FeedbackEntity(com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields) {
        this.primaryFields = dataEntityPrimaryFields;
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/contact/entity/model/FeedbackEntity$CommentsEntity;", "Lcom/truecaller/contact/entity/model/FeedbackEntity;", "primaryFields", "Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "count", "", "<init>", "(Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;I)V", "getPrimaryFields", "()Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "getCount", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class CommentsEntity extends com.truecaller.contact.entity.model.FeedbackEntity {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity> CREATOR = new java.lang.Object();
        private final int count;

        @org.jetbrains.annotations.Nullable
        private final com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields;

        public CommentsEntity(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, int i) {
            super(dataEntityPrimaryFields, null);
            this.primaryFields = dataEntityPrimaryFields;
            this.count = i;
        }

        public static /* synthetic */ com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity copy$default(com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity commentsEntity, com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                dataEntityPrimaryFields = commentsEntity.primaryFields;
            }
            if ((i2 & 2) != 0) {
                i = commentsEntity.count;
            }
            return commentsEntity.copy(dataEntityPrimaryFields, i);
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
            return this.primaryFields;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity copy(@org.jetbrains.annotations.Nullable com.truecaller.contact.entity.model.DataEntityPrimaryFields primaryFields, int count) {
            return new com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity(primaryFields, count);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity)) {
                return false;
            }
            com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity commentsEntity = (com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity) other;
            return kotlin.jvm.internal.Intrinsics.b(this.primaryFields, commentsEntity.primaryFields) && this.count == commentsEntity.count;
        }

        public final int getCount() {
            return this.count;
        }

        @Override // com.truecaller.contact.entity.model.FeedbackEntity, f61.bar
        @org.jetbrains.annotations.Nullable
        public com.truecaller.contact.entity.model.DataEntityPrimaryFields getPrimaryFields() {
            return this.primaryFields;
        }

        public int hashCode() {
            com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = this.primaryFields;
            return ((dataEntityPrimaryFields == null ? 0 : dataEntityPrimaryFields.hashCode()) * 31) + this.count;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "CommentsEntity(primaryFields=" + this.primaryFields + ", count=" + this.count + ")";
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
            dest.writeInt(this.count);
        }

        public /* synthetic */ CommentsEntity(com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : dataEntityPrimaryFields, i);
        }
    }
}
