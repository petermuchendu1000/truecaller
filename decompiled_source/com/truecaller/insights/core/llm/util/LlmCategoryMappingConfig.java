package com.truecaller.insights.core.llm.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016¨\u0006("}, d2 = {"Lcom/truecaller/insights/core/llm/util/LlmCategoryMappingConfig;", "", "", "", "llmToPdoCategoryMapping", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/util/Map;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$core_googlePlayRelease", "(Lcom/truecaller/insights/core/llm/util/LlmCategoryMappingConfig;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/truecaller/insights/core/llm/util/LlmCategoryMappingConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getLlmToPdoCategoryMapping", "getLlmToPdoCategoryMapping$annotations", "()V", "Companion", "xt1/qux", "xt1/a", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class LlmCategoryMappingConfig {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> llmToPdoCategoryMapping;

    @org.jetbrains.annotations.NotNull
    public static final xt1.a Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.k.b, new xn2.k2(9))};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LlmCategoryMappingConfig() {
        this(r0, 1, (kotlin.jvm.internal.DefaultConstructorMarker) r0);
        java.util.Map map = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
        yg3.l1 l1Var = yg3.l1.a;
        return new yg3.b0(l1Var, l1Var, 1);
    }

    public static final /* synthetic */ kotlin.Lazy[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig copy$default(com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig llmCategoryMappingConfig, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = llmCategoryMappingConfig.llmToPdoCategoryMapping;
        }
        return llmCategoryMappingConfig.copy(map);
    }

    public static /* synthetic */ void getLlmToPdoCategoryMapping$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_googlePlayRelease(com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer>[] lazyArr = $childSerializers;
        if (output.q(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.b(self.llmToPdoCategoryMapping, kotlin.collections.r0.f())) {
            output.e(serialDesc, 0, (kotlinx.serialization.KSerializer) lazyArr[0].getValue(), self.llmToPdoCategoryMapping);
        }
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> component1() {
        return this.llmToPdoCategoryMapping;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig copy(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> llmToPdoCategoryMapping) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(llmToPdoCategoryMapping, "llmToPdoCategoryMapping");
        return new com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig(llmToPdoCategoryMapping);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig) && kotlin.jvm.internal.Intrinsics.b(this.llmToPdoCategoryMapping, ((com.truecaller.insights.core.llm.util.LlmCategoryMappingConfig) other).llmToPdoCategoryMapping);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> getLlmToPdoCategoryMapping() {
        return this.llmToPdoCategoryMapping;
    }

    public int hashCode() {
        return this.llmToPdoCategoryMapping.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "LlmCategoryMappingConfig(llmToPdoCategoryMapping=" + this.llmToPdoCategoryMapping + ")";
    }

    public /* synthetic */ LlmCategoryMappingConfig(int i, java.util.Map map, yg3.g1 g1Var) {
        if ((i & 1) == 0) {
            this.llmToPdoCategoryMapping = kotlin.collections.r0.f();
        } else {
            this.llmToPdoCategoryMapping = map;
        }
    }

    public LlmCategoryMappingConfig(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "llmToPdoCategoryMapping");
        this.llmToPdoCategoryMapping = map;
    }

    public /* synthetic */ LlmCategoryMappingConfig(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.r0.f() : map);
    }
}
