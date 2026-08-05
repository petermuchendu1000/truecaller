package com.truecaller.premium.data.component;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/truecaller/premium/data/component/GeneralConfigComponent;", "Spec", "", "", "componentType", "", "specs", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/truecaller/premium/data/component/GeneralConfigComponent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getComponentType", "Ljava/util/List;", "getSpecs", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class GeneralConfigComponent<Spec> {
    public static final int $stable = 8;

    @bw.qux("component_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String componentType;

    @bw.qux("value")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<Spec> specs;

    /* JADX WARN: Multi-variable type inference failed */
    public GeneralConfigComponent(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<? extends Spec> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "componentType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "specs");
        this.componentType = str;
        this.specs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.premium.data.component.GeneralConfigComponent copy$default(com.truecaller.premium.data.component.GeneralConfigComponent generalConfigComponent, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = generalConfigComponent.componentType;
        }
        if ((i & 2) != 0) {
            list = generalConfigComponent.specs;
        }
        return generalConfigComponent.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getComponentType() {
        return this.componentType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<Spec> component2() {
        return this.specs;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.GeneralConfigComponent<Spec> copy(@org.jetbrains.annotations.NotNull java.lang.String componentType, @org.jetbrains.annotations.NotNull java.util.List<? extends Spec> specs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "componentType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specs, "specs");
        return new com.truecaller.premium.data.component.GeneralConfigComponent<>(componentType, specs);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.component.GeneralConfigComponent)) {
            return false;
        }
        com.truecaller.premium.data.component.GeneralConfigComponent generalConfigComponent = (com.truecaller.premium.data.component.GeneralConfigComponent) other;
        return kotlin.jvm.internal.Intrinsics.b(this.componentType, generalConfigComponent.componentType) && kotlin.jvm.internal.Intrinsics.b(this.specs, generalConfigComponent.specs);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getComponentType() {
        return this.componentType;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<Spec> getSpecs() {
        return this.specs;
    }

    public int hashCode() {
        return this.specs.hashCode() + (this.componentType.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("GeneralConfigComponent(componentType=", this.componentType, ", specs=", this.specs, ")");
    }
}
