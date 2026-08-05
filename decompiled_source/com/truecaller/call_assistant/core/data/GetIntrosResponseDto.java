package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/truecaller/call_assistant/core/data/GetIntrosResponseDto;", "", "success", "", "intros", "", "Lcom/truecaller/call_assistant/core/data/Intro;", "inputs", "Lcom/truecaller/call_assistant/core/data/Input;", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "getSuccess", "()Z", "getIntros", "()Ljava/util/List;", "getInputs", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class GetIntrosResponseDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.Input> inputs;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.Intro> intros;
    private final boolean success;

    public GetIntrosResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.Intro> list, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.Input> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "intros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "inputs");
        this.success = z;
        this.intros = list;
        this.inputs = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.data.GetIntrosResponseDto copy$default(com.truecaller.call_assistant.core.data.GetIntrosResponseDto getIntrosResponseDto, boolean z, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = getIntrosResponseDto.success;
        }
        if ((i & 2) != 0) {
            list = getIntrosResponseDto.intros;
        }
        if ((i & 4) != 0) {
            list2 = getIntrosResponseDto.inputs;
        }
        return getIntrosResponseDto.copy(z, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.Intro> component2() {
        return this.intros;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.Input> component3() {
        return this.inputs;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.GetIntrosResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.Intro> intros, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.Input> inputs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intros, "intros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "inputs");
        return new com.truecaller.call_assistant.core.data.GetIntrosResponseDto(success, intros, inputs);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.GetIntrosResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.GetIntrosResponseDto getIntrosResponseDto = (com.truecaller.call_assistant.core.data.GetIntrosResponseDto) other;
        return this.success == getIntrosResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.intros, getIntrosResponseDto.intros) && kotlin.jvm.internal.Intrinsics.b(this.inputs, getIntrosResponseDto.inputs);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.Input> getInputs() {
        return this.inputs;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.Intro> getIntros() {
        return this.intros;
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
        return this.inputs.hashCode() + uf.qux.g(i * 31, 31, this.intros);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        java.util.List<com.truecaller.call_assistant.core.data.Intro> list = this.intros;
        java.util.List<com.truecaller.call_assistant.core.data.Input> list2 = this.inputs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetIntrosResponseDto(success=");
        sb.append(z);
        sb.append(", intros=");
        sb.append(list);
        sb.append(", inputs=");
        return y.o.g(sb, list2, ")");
    }
}
