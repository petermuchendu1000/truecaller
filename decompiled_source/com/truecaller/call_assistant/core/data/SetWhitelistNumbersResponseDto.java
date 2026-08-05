package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/call_assistant/core/data/SetWhitelistNumbersResponseDto;", "", "added", "", "rejected", "<init>", "(II)V", "getAdded", "()I", "getRejected", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class SetWhitelistNumbersResponseDto {
    public static final int $stable = 0;
    private final int added;
    private final int rejected;

    public SetWhitelistNumbersResponseDto(int i, int i2) {
        this.added = i;
        this.rejected = i2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto copy$default(com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto setWhitelistNumbersResponseDto, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = setWhitelistNumbersResponseDto.added;
        }
        if ((i3 & 2) != 0) {
            i2 = setWhitelistNumbersResponseDto.rejected;
        }
        return setWhitelistNumbersResponseDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAdded() {
        return this.added;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRejected() {
        return this.rejected;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto copy(int added, int rejected) {
        return new com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto(added, rejected);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto setWhitelistNumbersResponseDto = (com.truecaller.call_assistant.core.data.SetWhitelistNumbersResponseDto) other;
        return this.added == setWhitelistNumbersResponseDto.added && this.rejected == setWhitelistNumbersResponseDto.rejected;
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRejected() {
        return this.rejected;
    }

    public int hashCode() {
        return (this.added * 31) + this.rejected;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h0.b.P(this.added, this.rejected, "SetWhitelistNumbersResponseDto(added=", ", rejected=", ")");
    }
}
