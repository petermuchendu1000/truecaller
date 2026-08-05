package com.truecaller.profile.api.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b\u0082\u0001\t\u0010\u000e\u0012\u0011\u0013\u000f\r\u0014\u0016¨\u0006\u0017"}, d2 = {"Lcom/truecaller/profile/api/model/ProfileSaveResult;", "", "", "code", "<init>", "(I)V", "I", "getCode", "()I", "", "success", "Z", "isInvalidProfile", "pg2/d0", "pg2/y", "pg2/c0", "pg2/x", "pg2/a0", "pg2/z", "pg2/b0", "pg2/e0", "UnprocessableEntity", "Lcom/truecaller/profile/api/model/ProfileSaveResult$UnprocessableEntity;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class ProfileSaveResult {
    private final int code;
    public final boolean isInvalidProfile;
    public final boolean success;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/truecaller/profile/api/model/ProfileSaveResult$UnprocessableEntity;", "Lcom/truecaller/profile/api/model/ProfileSaveResult;", "errors", "", "Lcom/truecaller/profile/api/model/ProfileSaveError;", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class UnprocessableEntity extends com.truecaller.profile.api.model.ProfileSaveResult {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.truecaller.profile.api.model.ProfileSaveError> errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnprocessableEntity(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.profile.api.model.ProfileSaveError> list) {
            super(422, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "errors");
            this.errors = list;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.truecaller.profile.api.model.ProfileSaveError> getErrors() {
            return this.errors;
        }
    }

    public /* synthetic */ ProfileSaveResult(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getCode() {
        return this.code;
    }

    private ProfileSaveResult(int i) {
        this.code = i;
        boolean z = true;
        this.success = 200 <= i && i < 300;
        if (i != 404 && i != 400 && i != 422) {
            z = false;
        }
        this.isInvalidProfile = z;
    }
}
