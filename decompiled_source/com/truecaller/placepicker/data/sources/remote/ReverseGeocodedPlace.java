package com.truecaller.placepicker.data.sources.remote;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/truecaller/placepicker/data/sources/remote/ReverseGeocodedPlace;", "", "formatted_address", "", "place_id", "address_components", "", "Lcom/truecaller/placepicker/data/sources/remote/AddressComponent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFormatted_address", "()Ljava/lang/String;", "getPlace_id", "getAddress_components", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "placepicker_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ReverseGeocodedPlace {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> address_components;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String formatted_address;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String place_id;

    public ReverseGeocodedPlace(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "formatted_address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "place_id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "address_components");
        this.formatted_address = str;
        this.place_id = str2;
        this.address_components = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace copy$default(com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace reverseGeocodedPlace, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reverseGeocodedPlace.formatted_address;
        }
        if ((i & 2) != 0) {
            str2 = reverseGeocodedPlace.place_id;
        }
        if ((i & 4) != 0) {
            list = reverseGeocodedPlace.address_components;
        }
        return reverseGeocodedPlace.copy(str, str2, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFormatted_address() {
        return this.formatted_address;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlace_id() {
        return this.place_id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> component3() {
        return this.address_components;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace copy(@org.jetbrains.annotations.NotNull java.lang.String formatted_address, @org.jetbrains.annotations.NotNull java.lang.String place_id, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> address_components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatted_address, "formatted_address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place_id, "place_id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address_components, "address_components");
        return new com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace(formatted_address, place_id, address_components);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace)) {
            return false;
        }
        com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace reverseGeocodedPlace = (com.truecaller.placepicker.data.sources.remote.ReverseGeocodedPlace) other;
        return kotlin.jvm.internal.Intrinsics.b(this.formatted_address, reverseGeocodedPlace.formatted_address) && kotlin.jvm.internal.Intrinsics.b(this.place_id, reverseGeocodedPlace.place_id) && kotlin.jvm.internal.Intrinsics.b(this.address_components, reverseGeocodedPlace.address_components);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.placepicker.data.sources.remote.AddressComponent> getAddress_components() {
        return this.address_components;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormatted_address() {
        return this.formatted_address;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlace_id() {
        return this.place_id;
    }

    public int hashCode() {
        return this.address_components.hashCode() + ax1.bar.e(this.formatted_address.hashCode() * 31, 31, this.place_id);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.formatted_address;
        java.lang.String str2 = this.place_id;
        return y.o.g(ro0.f.E("ReverseGeocodedPlace(formatted_address=", str, ", place_id=", str2, ", address_components="), this.address_components, ")");
    }
}
