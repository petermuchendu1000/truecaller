package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/call_assistant/core/data/DemoCallResponseDto;", "", "success", "", "fromPhoneNumber", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getFromPhoneNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DemoCallResponseDto {
    public static final int $stable = 0;

    @bw.qux("from")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fromPhoneNumber;
    private final boolean success;

    public DemoCallResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fromPhoneNumber");
        this.success = z;
        this.fromPhoneNumber = str;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.DemoCallResponseDto copy$default(com.truecaller.call_assistant.core.data.DemoCallResponseDto demoCallResponseDto, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = demoCallResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = demoCallResponseDto.fromPhoneNumber;
        }
        return demoCallResponseDto.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.DemoCallResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String fromPhoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromPhoneNumber, "fromPhoneNumber");
        return new com.truecaller.call_assistant.core.data.DemoCallResponseDto(success, fromPhoneNumber);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.DemoCallResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.DemoCallResponseDto demoCallResponseDto = (com.truecaller.call_assistant.core.data.DemoCallResponseDto) other;
        return this.success == demoCallResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.fromPhoneNumber, demoCallResponseDto.fromPhoneNumber);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.fromPhoneNumber.hashCode() + (i * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.s("DemoCallResponseDto(success=", this.success, ", fromPhoneNumber=", this.fromPhoneNumber, ")");
    }
}
