package com.truecaller.suspension.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/truecaller/suspension/data/UnSuspendAccountErrorResponseDto;", "Lxv2/a;", "", "status", "<init>", "(I)V", "I", "getStatus", "()I", "account-suspension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UnSuspendAccountErrorResponseDto extends xv2.a {
    private final int status;

    public UnSuspendAccountErrorResponseDto(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }
}
