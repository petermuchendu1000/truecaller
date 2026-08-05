package com.truecaller.placepicker.data.sources.remote;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/truecaller/placepicker/data/sources/remote/AddressComponent;", "", "types", "", "", "long_name", "short_name", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getTypes", "()Ljava/util/List;", "getLong_name", "()Ljava/lang/String;", "getShort_name", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "placepicker_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AddressComponent {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String long_name;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String short_name;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> types;

    public AddressComponent(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "types");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "long_name");
        this.types = list;
        this.long_name = str;
        this.short_name = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.placepicker.data.sources.remote.AddressComponent copy$default(com.truecaller.placepicker.data.sources.remote.AddressComponent addressComponent, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = addressComponent.types;
        }
        if ((i & 2) != 0) {
            str = addressComponent.long_name;
        }
        if ((i & 4) != 0) {
            str2 = addressComponent.short_name;
        }
        return addressComponent.copy(list, str, str2);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.types;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLong_name() {
        return this.long_name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getShort_name() {
        return this.short_name;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.placepicker.data.sources.remote.AddressComponent copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> types, @org.jetbrains.annotations.NotNull java.lang.String long_name, @org.jetbrains.annotations.Nullable java.lang.String short_name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(long_name, "long_name");
        return new com.truecaller.placepicker.data.sources.remote.AddressComponent(types, long_name, short_name);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.placepicker.data.sources.remote.AddressComponent)) {
            return false;
        }
        com.truecaller.placepicker.data.sources.remote.AddressComponent addressComponent = (com.truecaller.placepicker.data.sources.remote.AddressComponent) other;
        return kotlin.jvm.internal.Intrinsics.b(this.types, addressComponent.types) && kotlin.jvm.internal.Intrinsics.b(this.long_name, addressComponent.long_name) && kotlin.jvm.internal.Intrinsics.b(this.short_name, addressComponent.short_name);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLong_name() {
        return this.long_name;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShort_name() {
        return this.short_name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.types.hashCode() * 31, 31, this.long_name);
        java.lang.String str = this.short_name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.String> list = this.types;
        java.lang.String str = this.long_name;
        java.lang.String str2 = this.short_name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressComponent(types=");
        sb.append(list);
        sb.append(", long_name=");
        sb.append(str);
        sb.append(", short_name=");
        return bar.v(str2, ")", sb);
    }
}
