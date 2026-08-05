package com.truecaller.premium.data.component;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/truecaller/premium/data/component/ComponentDataResponse;", "ComponentData", "", "hash", "", "componentData", "<init>", "(ILjava/lang/Object;)V", "getHash", "()I", "getComponentData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lcom/truecaller/premium/data/component/ComponentDataResponse;", "equals", "", "other", "hashCode", "toString", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ComponentDataResponse<ComponentData> {
    public static final int $stable = 0;

    @bw.qux("data")
    @org.jetbrains.annotations.Nullable
    private final ComponentData componentData;

    @bw.qux("hash")
    private final int hash;

    public ComponentDataResponse(int i, @org.jetbrains.annotations.Nullable ComponentData componentdata) {
        this.hash = i;
        this.componentData = componentdata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.premium.data.component.ComponentDataResponse copy$default(com.truecaller.premium.data.component.ComponentDataResponse componentDataResponse, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            i = componentDataResponse.hash;
        }
        if ((i2 & 2) != 0) {
            obj = componentDataResponse.componentData;
        }
        return componentDataResponse.copy(i, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHash() {
        return this.hash;
    }

    @org.jetbrains.annotations.Nullable
    public final ComponentData component2() {
        return this.componentData;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.ComponentDataResponse<ComponentData> copy(int hash, @org.jetbrains.annotations.Nullable ComponentData componentData) {
        return new com.truecaller.premium.data.component.ComponentDataResponse<>(hash, componentData);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.component.ComponentDataResponse)) {
            return false;
        }
        com.truecaller.premium.data.component.ComponentDataResponse componentDataResponse = (com.truecaller.premium.data.component.ComponentDataResponse) other;
        return this.hash == componentDataResponse.hash && kotlin.jvm.internal.Intrinsics.b(this.componentData, componentDataResponse.componentData);
    }

    @org.jetbrains.annotations.Nullable
    public final ComponentData getComponentData() {
        return this.componentData;
    }

    public final int getHash() {
        return this.hash;
    }

    public int hashCode() {
        int i = this.hash * 31;
        ComponentData componentdata = this.componentData;
        return i + (componentdata == null ? 0 : componentdata.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ComponentDataResponse(hash=" + this.hash + ", componentData=" + this.componentData + ")";
    }
}
