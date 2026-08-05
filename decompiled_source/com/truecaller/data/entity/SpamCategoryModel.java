package com.truecaller.data.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lcom/truecaller/data/entity/SpamCategoryModel;", "Landroid/os/Parcelable;", "", "id", "", "label", "iconUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/truecaller/data/entity/SpamCategoryModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getLabel", "getIconUrl", "CREATOR", "q81/g", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SpamCategoryModel implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final q81.g CREATOR = new java.lang.Object();

    @org.jetbrains.annotations.Nullable
    private final java.lang.String iconUrl;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String label;

    public SpamCategoryModel(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "label");
        this.id = j;
        this.label = str;
        this.iconUrl = str2;
    }

    public static /* synthetic */ com.truecaller.data.entity.SpamCategoryModel copy$default(com.truecaller.data.entity.SpamCategoryModel spamCategoryModel, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = spamCategoryModel.id;
        }
        if ((i & 2) != 0) {
            str = spamCategoryModel.label;
        }
        if ((i & 4) != 0) {
            str2 = spamCategoryModel.iconUrl;
        }
        return spamCategoryModel.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.data.entity.SpamCategoryModel copy(long id, @org.jetbrains.annotations.NotNull java.lang.String label, @org.jetbrains.annotations.Nullable java.lang.String iconUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "label");
        return new com.truecaller.data.entity.SpamCategoryModel(id, label, iconUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.data.entity.SpamCategoryModel)) {
            return false;
        }
        com.truecaller.data.entity.SpamCategoryModel spamCategoryModel = (com.truecaller.data.entity.SpamCategoryModel) other;
        return this.id == spamCategoryModel.id && kotlin.jvm.internal.Intrinsics.b(this.label, spamCategoryModel.label) && kotlin.jvm.internal.Intrinsics.b(this.iconUrl, spamCategoryModel.iconUrl);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode;
        long j = this.id;
        int e = ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.label);
        java.lang.String str = this.iconUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.f(", iconUrl=", this.iconUrl, ")", com.appsflyer.internal.e.p("SpamCategoryModel(id=", this.id, ", label=", this.label));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.label);
        parcel.writeString(this.iconUrl);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpamCategoryModel(@org.jetbrains.annotations.NotNull android.os.Parcel parcel) {
        this(r0, r2, parcel.readString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        long readLong = parcel.readLong();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            return;
        }
        throw new java.lang.IllegalStateException("Spam category can't be read by from Parcel");
    }
}
