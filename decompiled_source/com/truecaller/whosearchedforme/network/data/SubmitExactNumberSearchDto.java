package com.truecaller.whosearchedforme.network.data;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/truecaller/whosearchedforme/network/data/SubmitExactNumberSearchDto;", "", "phoneNumber", "", "isPhoneBookContact", "", "<init>", "(JZ)V", "getPhoneNumber", "()J", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "whosearchedforme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SubmitExactNumberSearchDto {

    @bw.qux("isPhoneBookContact")
    private final boolean isPhoneBookContact;

    @bw.qux("phoneNumber")
    private final long phoneNumber;

    public SubmitExactNumberSearchDto(long j, boolean z) {
        this.phoneNumber = j;
        this.isPhoneBookContact = z;
    }

    public static /* synthetic */ com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto copy$default(com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto submitExactNumberSearchDto, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = submitExactNumberSearchDto.phoneNumber;
        }
        if ((i & 2) != 0) {
            z = submitExactNumberSearchDto.isPhoneBookContact;
        }
        return submitExactNumberSearchDto.copy(j, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPhoneBookContact() {
        return this.isPhoneBookContact;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto copy(long phoneNumber, boolean isPhoneBookContact) {
        return new com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto(phoneNumber, isPhoneBookContact);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto)) {
            return false;
        }
        com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto submitExactNumberSearchDto = (com.truecaller.whosearchedforme.network.data.SubmitExactNumberSearchDto) other;
        return this.phoneNumber == submitExactNumberSearchDto.phoneNumber && this.isPhoneBookContact == submitExactNumberSearchDto.isPhoneBookContact;
    }

    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int i;
        long j = this.phoneNumber;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        if (this.isPhoneBookContact) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    public final boolean isPhoneBookContact() {
        return this.isPhoneBookContact;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "SubmitExactNumberSearchDto(phoneNumber=" + this.phoneNumber + ", isPhoneBookContact=" + this.isPhoneBookContact + ")";
    }
}
