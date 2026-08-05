package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/truecaller/call_assistant/core/data/EnableServiceResponseDto;", "", "success", "", "fromNumbers", "", "", "<init>", "(ZLjava/util/List;)V", "getSuccess", "()Z", "getFromNumbers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class EnableServiceResponseDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> fromNumbers;
    private final boolean success;

    public EnableServiceResponseDto(boolean z, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        this.success = z;
        this.fromNumbers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.data.EnableServiceResponseDto copy$default(com.truecaller.call_assistant.core.data.EnableServiceResponseDto enableServiceResponseDto, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = enableServiceResponseDto.success;
        }
        if ((i & 2) != 0) {
            list = enableServiceResponseDto.fromNumbers;
        }
        return enableServiceResponseDto.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return this.fromNumbers;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.EnableServiceResponseDto copy(boolean success, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> fromNumbers) {
        return new com.truecaller.call_assistant.core.data.EnableServiceResponseDto(success, fromNumbers);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.EnableServiceResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.EnableServiceResponseDto enableServiceResponseDto = (com.truecaller.call_assistant.core.data.EnableServiceResponseDto) other;
        return this.success == enableServiceResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.fromNumbers, enableServiceResponseDto.fromNumbers);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getFromNumbers() {
        return this.fromNumbers;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = i * 31;
        java.util.List<java.lang.String> list = this.fromNumbers;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return i2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "EnableServiceResponseDto(success=" + this.success + ", fromNumbers=" + this.fromNumbers + ")";
    }

    public /* synthetic */ EnableServiceResponseDto(boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : list);
    }
}
