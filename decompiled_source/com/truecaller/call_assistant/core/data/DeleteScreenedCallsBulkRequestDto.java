package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/truecaller/call_assistant/core/data/DeleteScreenedCallsBulkRequestDto;", "", "callIds", "", "", "<init>", "(Ljava/util/List;)V", "getCallIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DeleteScreenedCallsBulkRequestDto {
    public static final int $stable = 8;

    @bw.qux("callIds")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> callIds;

    public DeleteScreenedCallsBulkRequestDto(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "callIds");
        this.callIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.data.DeleteScreenedCallsBulkRequestDto copy$default(com.truecaller.call_assistant.core.data.DeleteScreenedCallsBulkRequestDto deleteScreenedCallsBulkRequestDto, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = deleteScreenedCallsBulkRequestDto.callIds;
        }
        return deleteScreenedCallsBulkRequestDto.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.callIds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.DeleteScreenedCallsBulkRequestDto copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> callIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callIds, "callIds");
        return new com.truecaller.call_assistant.core.data.DeleteScreenedCallsBulkRequestDto(callIds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.call_assistant.core.data.DeleteScreenedCallsBulkRequestDto) && kotlin.jvm.internal.Intrinsics.b(this.callIds, ((com.truecaller.call_assistant.core.data.DeleteScreenedCallsBulkRequestDto) other).callIds);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getCallIds() {
        return this.callIds;
    }

    public int hashCode() {
        return this.callIds.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("DeleteScreenedCallsBulkRequestDto(callIds=", ")", this.callIds);
    }
}
