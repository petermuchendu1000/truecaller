package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/ProfileSaveErrorResponse;", "", "", "Lcom/truecaller/profile/api/model/ProfileSaveError;", "errors", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/truecaller/profile/impl/remote/model/ProfileSaveErrorResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getErrors", "Companion", "wg2/g", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ProfileSaveErrorResponse {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final wg2.g Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final com.google.gson.Gson gson = new com.google.gson.Gson();
    private static final java.lang.reflect.Type type = new com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse.bar().getType();

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.profile.api.model.ProfileSaveError> errors;

    @kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/truecaller/profile/impl/remote/model/ProfileSaveErrorResponse$bar", "Lhw/bar;", "Lcom/truecaller/profile/impl/remote/model/ProfileSaveErrorResponse;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final class bar extends hw.bar<com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse> {
    }

    public ProfileSaveErrorResponse(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.profile.api.model.ProfileSaveError> list) {
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse copy$default(com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse profileSaveErrorResponse, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = profileSaveErrorResponse.errors;
        }
        return profileSaveErrorResponse.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.profile.api.model.ProfileSaveError> component1() {
        return this.errors;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse copy(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.profile.api.model.ProfileSaveError> errors) {
        return new com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse(errors);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse) && kotlin.jvm.internal.Intrinsics.b(this.errors, ((com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse) other).errors);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.profile.api.model.ProfileSaveError> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        java.util.List<com.truecaller.profile.api.model.ProfileSaveError> list = this.errors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("ProfileSaveErrorResponse(errors=", ")", this.errors);
    }
}
