package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/ProfileResponseDto;", "", "userId", "", "firstName", "", "lastName", "personalData", "Lcom/truecaller/profile/impl/remote/model/PersonalDataResponse;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/truecaller/profile/impl/remote/model/PersonalDataResponse;)V", "getUserId", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "getPersonalData", "()Lcom/truecaller/profile/impl/remote/model/PersonalDataResponse;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ProfileResponseDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstName;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastName;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.profile.impl.remote.model.PersonalDataResponse personalData;
    private final long userId;

    public ProfileResponseDto(long j, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.PersonalDataResponse personalDataResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalDataResponse, "personalData");
        this.userId = j;
        this.firstName = str;
        this.lastName = str2;
        this.personalData = personalDataResponse;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.PersonalDataResponse getPersonalData() {
        return this.personalData;
    }

    public final long getUserId() {
        return this.userId;
    }
}
