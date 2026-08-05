package com.truecaller.profile.api.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/profile/api/model/ProfileError;", "", "fieldName", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ProfileError {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fieldName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    public ProfileError(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fieldName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
        this.fieldName = str;
        this.message = str2;
    }

    public static /* synthetic */ com.truecaller.profile.api.model.ProfileError copy$default(com.truecaller.profile.api.model.ProfileError profileError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = profileError.fieldName;
        }
        if ((i & 2) != 0) {
            str2 = profileError.message;
        }
        return profileError.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFieldName() {
        return this.fieldName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.api.model.ProfileError copy(@org.jetbrains.annotations.NotNull java.lang.String fieldName, @org.jetbrains.annotations.NotNull java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new com.truecaller.profile.api.model.ProfileError(fieldName, message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.profile.api.model.ProfileError)) {
            return false;
        }
        com.truecaller.profile.api.model.ProfileError profileError = (com.truecaller.profile.api.model.ProfileError) other;
        return kotlin.jvm.internal.Intrinsics.b(this.fieldName, profileError.fieldName) && kotlin.jvm.internal.Intrinsics.b(this.message, profileError.message);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFieldName() {
        return this.fieldName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.fieldName.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("ProfileError(fieldName=", this.fieldName, ", message=", this.message, ")");
    }
}
