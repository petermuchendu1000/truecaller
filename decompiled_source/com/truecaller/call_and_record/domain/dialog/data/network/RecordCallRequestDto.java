package com.truecaller.call_and_record.domain.dialog.data.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/call_and_record/domain/dialog/data/network/RecordCallRequestDto;", "", "numberTo", "", "numberFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumberTo", "()Ljava/lang/String;", "getNumberFrom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RecordCallRequestDto {

    @bw.qux("from")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String numberFrom;

    @bw.qux("number")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String numberTo;

    public RecordCallRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "numberTo");
        this.numberTo = str;
        this.numberFrom = str2;
    }

    public static /* synthetic */ com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto copy$default(com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto recordCallRequestDto, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = recordCallRequestDto.numberTo;
        }
        if ((i & 2) != 0) {
            str2 = recordCallRequestDto.numberFrom;
        }
        return recordCallRequestDto.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNumberTo() {
        return this.numberTo;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNumberFrom() {
        return this.numberFrom;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto copy(@org.jetbrains.annotations.NotNull java.lang.String numberTo, @org.jetbrains.annotations.Nullable java.lang.String numberFrom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(numberTo, "numberTo");
        return new com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto(numberTo, numberFrom);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto)) {
            return false;
        }
        com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto recordCallRequestDto = (com.truecaller.call_and_record.domain.dialog.data.network.RecordCallRequestDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.numberTo, recordCallRequestDto.numberTo) && kotlin.jvm.internal.Intrinsics.b(this.numberFrom, recordCallRequestDto.numberFrom);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNumberFrom() {
        return this.numberFrom;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumberTo() {
        return this.numberTo;
    }

    public int hashCode() {
        int hashCode = this.numberTo.hashCode() * 31;
        java.lang.String str = this.numberFrom;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("RecordCallRequestDto(numberTo=", this.numberTo, ", numberFrom=", this.numberFrom, ")");
    }
}
