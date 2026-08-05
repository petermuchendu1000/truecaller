package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/UpdateProfileRequestDto;", "", "firstName", "", "lastName", "personalData", "Lcom/truecaller/profile/impl/remote/model/UpdateProfileRequestPersonalData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/profile/impl/remote/model/UpdateProfileRequestPersonalData;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getPersonalData", "()Lcom/truecaller/profile/impl/remote/model/UpdateProfileRequestPersonalData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class UpdateProfileRequestDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastName;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData personalData;

    public UpdateProfileRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData updateProfileRequestPersonalData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateProfileRequestPersonalData, "personalData");
        this.firstName = str;
        this.lastName = str2;
        this.personalData = updateProfileRequestPersonalData;
    }

    public static /* synthetic */ com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto copy$default(com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto, java.lang.String str, java.lang.String str2, com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData updateProfileRequestPersonalData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileRequestDto.firstName;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileRequestDto.lastName;
        }
        if ((i & 4) != 0) {
            updateProfileRequestPersonalData = updateProfileRequestDto.personalData;
        }
        return updateProfileRequestDto.copy(str, str2, updateProfileRequestPersonalData);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData getPersonalData() {
        return this.personalData;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto copy(@org.jetbrains.annotations.NotNull java.lang.String firstName, @org.jetbrains.annotations.NotNull java.lang.String lastName, @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData personalData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalData, "personalData");
        return new com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto(firstName, lastName, personalData);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto)) {
            return false;
        }
        com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto = (com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.firstName, updateProfileRequestDto.firstName) && kotlin.jvm.internal.Intrinsics.b(this.lastName, updateProfileRequestDto.lastName) && kotlin.jvm.internal.Intrinsics.b(this.personalData, updateProfileRequestDto.personalData);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData getPersonalData() {
        return this.personalData;
    }

    public int hashCode() {
        return this.personalData.hashCode() + ax1.bar.e(this.firstName.hashCode() * 31, 31, this.lastName);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.firstName;
        java.lang.String str2 = this.lastName;
        com.truecaller.profile.impl.remote.model.UpdateProfileRequestPersonalData updateProfileRequestPersonalData = this.personalData;
        java.lang.StringBuilder E = ro0.f.E("UpdateProfileRequestDto(firstName=", str, ", lastName=", str2, ", personalData=");
        E.append(updateProfileRequestPersonalData);
        E.append(")");
        return E.toString();
    }
}
