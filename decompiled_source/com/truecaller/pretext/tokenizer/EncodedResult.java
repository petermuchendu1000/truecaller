package com.truecaller.pretext.tokenizer;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0011\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/truecaller/pretext/tokenizer/EncodedResult;", "", "inputIds", "", "attentionMask", "segmentIds", "<init>", "([I[I[I)V", "getInputIds", "()[I", "getAttentionMask", "getSegmentIds", "copy", "tokenCount", "", "getTokenCount", "()I", "inputIdsBuffer", "Ljava/nio/ByteBuffer;", "attentionMaskBuffer", "segmentIdsBuffer", "toInputBuffers", "", "()[Ljava/nio/ByteBuffer;", "toByteBuffer", "array", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class EncodedResult {

    @org.jetbrains.annotations.NotNull
    private final int[] attentionMask;

    @org.jetbrains.annotations.NotNull
    private final int[] inputIds;

    @org.jetbrains.annotations.Nullable
    private final int[] segmentIds;

    public EncodedResult(@org.jetbrains.annotations.NotNull int[] iArr, @org.jetbrains.annotations.NotNull int[] iArr2, @org.jetbrains.annotations.Nullable int[] iArr3) {
        int[] iArr4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "inputIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr2, "attentionMask");
        int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.inputIds = copyOf;
        int[] copyOf2 = java.util.Arrays.copyOf(iArr2, iArr2.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        this.attentionMask = copyOf2;
        if (iArr3 != null) {
            iArr4 = java.util.Arrays.copyOf(iArr3, iArr3.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr4, "copyOf(...)");
        } else {
            iArr4 = null;
        }
        this.segmentIds = iArr4;
    }

    public static /* synthetic */ com.truecaller.pretext.tokenizer.EncodedResult copy$default(com.truecaller.pretext.tokenizer.EncodedResult encodedResult, int[] iArr, int[] iArr2, int[] iArr3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iArr = encodedResult.inputIds;
        }
        if ((i & 2) != 0) {
            iArr2 = encodedResult.attentionMask;
        }
        if ((i & 4) != 0) {
            iArr3 = encodedResult.segmentIds;
        }
        return encodedResult.copy(iArr, iArr2, iArr3);
    }

    private final java.nio.ByteBuffer toByteBuffer(int[] array) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(array.length * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.asIntBuffer().put(array);
        return allocateDirect;
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.ByteBuffer attentionMaskBuffer() {
        return toByteBuffer(this.attentionMask);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.pretext.tokenizer.EncodedResult copy(@org.jetbrains.annotations.NotNull int[] inputIds, @org.jetbrains.annotations.NotNull int[] attentionMask, @org.jetbrains.annotations.Nullable int[] segmentIds) {
        int[] iArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputIds, "inputIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attentionMask, "attentionMask");
        int[] copyOf = java.util.Arrays.copyOf(inputIds, inputIds.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int[] copyOf2 = java.util.Arrays.copyOf(attentionMask, attentionMask.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        if (segmentIds != null) {
            iArr = java.util.Arrays.copyOf(segmentIds, segmentIds.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "copyOf(...)");
        } else {
            iArr = null;
        }
        return new com.truecaller.pretext.tokenizer.EncodedResult(copyOf, copyOf2, iArr);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        int[] iArr;
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.pretext.tokenizer.EncodedResult)) {
            return false;
        }
        com.truecaller.pretext.tokenizer.EncodedResult encodedResult = (com.truecaller.pretext.tokenizer.EncodedResult) other;
        if (!java.util.Arrays.equals(this.inputIds, encodedResult.inputIds) || !java.util.Arrays.equals(this.attentionMask, encodedResult.attentionMask)) {
            return false;
        }
        int[] iArr2 = this.segmentIds;
        if (iArr2 == null && encodedResult.segmentIds == null) {
            return true;
        }
        if (iArr2 == null || (iArr = encodedResult.segmentIds) == null) {
            return false;
        }
        return java.util.Arrays.equals(iArr2, iArr);
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getAttentionMask() {
        return this.attentionMask;
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getInputIds() {
        return this.inputIds;
    }

    @org.jetbrains.annotations.Nullable
    public final int[] getSegmentIds() {
        return this.segmentIds;
    }

    public final int getTokenCount() {
        int i = 0;
        for (int i2 : this.attentionMask) {
            if (i2 == 1) {
                i++;
            }
        }
        return i;
    }

    public int hashCode() {
        int i;
        int hashCode = (java.util.Arrays.hashCode(this.attentionMask) + (java.util.Arrays.hashCode(this.inputIds) * 31)) * 31;
        int[] iArr = this.segmentIds;
        if (iArr != null) {
            i = java.util.Arrays.hashCode(iArr);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.ByteBuffer inputIdsBuffer() {
        return toByteBuffer(this.inputIds);
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.ByteBuffer segmentIdsBuffer() {
        int[] iArr = this.segmentIds;
        if (iArr != null) {
            return toByteBuffer(iArr);
        }
        throw new java.lang.IllegalStateException("segmentIds is null — not available for INPUT_IDS_ONLY layout");
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.ByteBuffer[] toInputBuffers() {
        if (this.segmentIds != null) {
            return new java.nio.ByteBuffer[]{inputIdsBuffer(), attentionMaskBuffer(), segmentIdsBuffer()};
        }
        return new java.nio.ByteBuffer[]{inputIdsBuffer()};
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h0.b.P(getTokenCount(), this.inputIds.length, "EncodedResult(tokenCount=", ", seqLen=", ")");
    }
}
