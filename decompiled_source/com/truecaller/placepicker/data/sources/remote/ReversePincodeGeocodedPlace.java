package com.truecaller.placepicker.data.sources.remote;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/placepicker/data/sources/remote/ReversePincodeGeocodedPlace;", "", "address_components", "", "Lcom/truecaller/placepicker/data/sources/remote/AddressComponent;", "formatted_address", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAddress_components", "()Ljava/util/List;", "getFormatted_address", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "placepicker_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ReversePincodeGeocodedPlace {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> address_components;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String formatted_address;

    public ReversePincodeGeocodedPlace(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> list, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "address_components");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "formatted_address");
        this.address_components = list;
        this.formatted_address = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace copy$default(com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace reversePincodeGeocodedPlace, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = reversePincodeGeocodedPlace.address_components;
        }
        if ((i & 2) != 0) {
            str = reversePincodeGeocodedPlace.formatted_address;
        }
        return reversePincodeGeocodedPlace.copy(list, str);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> component1() {
        return this.address_components;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormatted_address() {
        return this.formatted_address;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> address_components, @org.jetbrains.annotations.NotNull java.lang.String formatted_address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address_components, "address_components");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatted_address, "formatted_address");
        return new com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace(address_components, formatted_address);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace)) {
            return false;
        }
        com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace reversePincodeGeocodedPlace = (com.truecaller.placepicker.data.sources.remote.ReversePincodeGeocodedPlace) other;
        return kotlin.jvm.internal.Intrinsics.b(this.address_components, reversePincodeGeocodedPlace.address_components) && kotlin.jvm.internal.Intrinsics.b(this.formatted_address, reversePincodeGeocodedPlace.formatted_address);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> getAddress_components() {
        return this.address_components;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormatted_address() {
        return this.formatted_address;
    }

    public int hashCode() {
        return this.formatted_address.hashCode() + (this.address_components.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ReversePincodeGeocodedPlace(address_components=" + this.address_components + ", formatted_address=" + this.formatted_address + ")";
    }
}
