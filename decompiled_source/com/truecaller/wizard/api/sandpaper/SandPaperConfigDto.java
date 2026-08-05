package com.truecaller.wizard.api.sandpaper;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/truecaller/wizard/api/sandpaper/SandPaperConfigDto;", "", "Lcom/truecaller/wizard/api/sandpaper/SandPaperVariant;", "variant", "<init>", "(Lcom/truecaller/wizard/api/sandpaper/SandPaperVariant;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILcom/truecaller/wizard/api/sandpaper/SandPaperVariant;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$api", "(Lcom/truecaller/wizard/api/sandpaper/SandPaperConfigDto;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/truecaller/wizard/api/sandpaper/SandPaperVariant;", "copy", "(Lcom/truecaller/wizard/api/sandpaper/SandPaperVariant;)Lcom/truecaller/wizard/api/sandpaper/SandPaperConfigDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/wizard/api/sandpaper/SandPaperVariant;", "getVariant", "Companion", "i83/bar", "i83/baz", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SandPaperConfigDto {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.wizard.api.sandpaper.SandPaperVariant variant;

    @org.jetbrains.annotations.NotNull
    public static final i83.baz Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.k.b, new hl2.f(19))};

    public /* synthetic */ SandPaperConfigDto(int i, com.truecaller.wizard.api.sandpaper.SandPaperVariant sandPaperVariant, yg3.g1 g1Var) {
        if (1 == (i & 1)) {
            this.variant = sandPaperVariant;
        } else {
            yg3.w0.l(i, 1, i83.bar.a.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
        return com.truecaller.wizard.api.sandpaper.SandPaperVariant.Companion.serializer();
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer a() {
        return _childSerializers$_anonymous_();
    }

    public static /* synthetic */ com.truecaller.wizard.api.sandpaper.SandPaperConfigDto copy$default(com.truecaller.wizard.api.sandpaper.SandPaperConfigDto sandPaperConfigDto, com.truecaller.wizard.api.sandpaper.SandPaperVariant sandPaperVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sandPaperVariant = sandPaperConfigDto.variant;
        }
        return sandPaperConfigDto.copy(sandPaperVariant);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.wizard.api.sandpaper.SandPaperVariant getVariant() {
        return this.variant;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wizard.api.sandpaper.SandPaperConfigDto copy(@org.jetbrains.annotations.NotNull com.truecaller.wizard.api.sandpaper.SandPaperVariant variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "variant");
        return new com.truecaller.wizard.api.sandpaper.SandPaperConfigDto(variant);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.wizard.api.sandpaper.SandPaperConfigDto) && this.variant == ((com.truecaller.wizard.api.sandpaper.SandPaperConfigDto) other).variant;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wizard.api.sandpaper.SandPaperVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return this.variant.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "SandPaperConfigDto(variant=" + this.variant + ")";
    }

    public SandPaperConfigDto(@org.jetbrains.annotations.NotNull com.truecaller.wizard.api.sandpaper.SandPaperVariant sandPaperVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sandPaperVariant, "variant");
        this.variant = sandPaperVariant;
    }
}
