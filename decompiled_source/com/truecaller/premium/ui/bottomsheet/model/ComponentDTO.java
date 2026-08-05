package com.truecaller.premium.ui.bottomsheet.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/ui/bottomsheet/model/ComponentDTO;", "", "attributes", "Lcom/truecaller/premium/ui/bottomsheet/model/AttributesDTO;", "componentData", "Lcom/truecaller/premium/ui/bottomsheet/model/ComponentDataDTO;", "<init>", "(Lcom/truecaller/premium/ui/bottomsheet/model/AttributesDTO;Lcom/truecaller/premium/ui/bottomsheet/model/ComponentDataDTO;)V", "getAttributes", "()Lcom/truecaller/premium/ui/bottomsheet/model/AttributesDTO;", "getComponentData", "()Lcom/truecaller/premium/ui/bottomsheet/model/ComponentDataDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ComponentDTO {
    public static final int $stable = 8;

    @bw.qux("attributes")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.premium.ui.bottomsheet.model.AttributesDTO attributes;

    @bw.qux("data")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.premium.ui.bottomsheet.model.ComponentDataDTO componentData;

    public ComponentDTO(@org.jetbrains.annotations.NotNull com.truecaller.premium.ui.bottomsheet.model.AttributesDTO attributesDTO, @org.jetbrains.annotations.NotNull com.truecaller.premium.ui.bottomsheet.model.ComponentDataDTO componentDataDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributesDTO, "attributes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentDataDTO, "componentData");
        this.attributes = attributesDTO;
        this.componentData = componentDataDTO;
    }

    public static /* synthetic */ com.truecaller.premium.ui.bottomsheet.model.ComponentDTO copy$default(com.truecaller.premium.ui.bottomsheet.model.ComponentDTO componentDTO, com.truecaller.premium.ui.bottomsheet.model.AttributesDTO attributesDTO, com.truecaller.premium.ui.bottomsheet.model.ComponentDataDTO componentDataDTO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            attributesDTO = componentDTO.attributes;
        }
        if ((i & 2) != 0) {
            componentDataDTO = componentDTO.componentData;
        }
        return componentDTO.copy(attributesDTO, componentDataDTO);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.premium.ui.bottomsheet.model.AttributesDTO getAttributes() {
        return this.attributes;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.premium.ui.bottomsheet.model.ComponentDataDTO getComponentData() {
        return this.componentData;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.ui.bottomsheet.model.ComponentDTO copy(@org.jetbrains.annotations.NotNull com.truecaller.premium.ui.bottomsheet.model.AttributesDTO attributes, @org.jetbrains.annotations.NotNull com.truecaller.premium.ui.bottomsheet.model.ComponentDataDTO componentData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentData, "componentData");
        return new com.truecaller.premium.ui.bottomsheet.model.ComponentDTO(attributes, componentData);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.ui.bottomsheet.model.ComponentDTO)) {
            return false;
        }
        com.truecaller.premium.ui.bottomsheet.model.ComponentDTO componentDTO = (com.truecaller.premium.ui.bottomsheet.model.ComponentDTO) other;
        return kotlin.jvm.internal.Intrinsics.b(this.attributes, componentDTO.attributes) && kotlin.jvm.internal.Intrinsics.b(this.componentData, componentDTO.componentData);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.ui.bottomsheet.model.AttributesDTO getAttributes() {
        return this.attributes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.ui.bottomsheet.model.ComponentDataDTO getComponentData() {
        return this.componentData;
    }

    public int hashCode() {
        return this.componentData.hashCode() + (this.attributes.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ComponentDTO(attributes=" + this.attributes + ", componentData=" + this.componentData + ")";
    }
}
