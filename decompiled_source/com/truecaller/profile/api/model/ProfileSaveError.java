package com.truecaller.profile.api.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/truecaller/profile/api/model/ProfileSaveError;", "", "fieldName", "", "errorType", "", "details", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getErrorType", "()I", "getDetails", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ProfileSaveError {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String details;
    private final int errorType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fieldName;

    public ProfileSaveError(@org.jetbrains.annotations.NotNull java.lang.String str, int i, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fieldName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "details");
        this.fieldName = str;
        this.errorType = i;
        this.details = str2;
    }

    public static /* synthetic */ com.truecaller.profile.api.model.ProfileSaveError copy$default(com.truecaller.profile.api.model.ProfileSaveError profileSaveError, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = profileSaveError.fieldName;
        }
        if ((i2 & 2) != 0) {
            i = profileSaveError.errorType;
        }
        if ((i2 & 4) != 0) {
            str2 = profileSaveError.details;
        }
        return profileSaveError.copy(str, i, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFieldName() {
        return this.fieldName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getErrorType() {
        return this.errorType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDetails() {
        return this.details;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.api.model.ProfileSaveError copy(@org.jetbrains.annotations.NotNull java.lang.String fieldName, int errorType, @org.jetbrains.annotations.NotNull java.lang.String details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        return new com.truecaller.profile.api.model.ProfileSaveError(fieldName, errorType, details);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.profile.api.model.ProfileSaveError)) {
            return false;
        }
        com.truecaller.profile.api.model.ProfileSaveError profileSaveError = (com.truecaller.profile.api.model.ProfileSaveError) other;
        return kotlin.jvm.internal.Intrinsics.b(this.fieldName, profileSaveError.fieldName) && this.errorType == profileSaveError.errorType && kotlin.jvm.internal.Intrinsics.b(this.details, profileSaveError.details);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDetails() {
        return this.details;
    }

    public final int getErrorType() {
        return this.errorType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFieldName() {
        return this.fieldName;
    }

    public int hashCode() {
        return this.details.hashCode() + (((this.fieldName.hashCode() * 31) + this.errorType) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.fieldName;
        return bar.v(this.details, ")", bar.z("ProfileSaveError(fieldName=", this.errorType, str, ", errorType=", ", details="));
    }
}
