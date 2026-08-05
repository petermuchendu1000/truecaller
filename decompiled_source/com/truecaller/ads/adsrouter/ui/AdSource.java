package com.truecaller.ads.adsrouter.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/AdSource;", "Landroid/os/Parcelable;", "Network", "NetworkCache", "Offline", "House", "Lcom/truecaller/ads/adsrouter/ui/AdSource$House;", "Lcom/truecaller/ads/adsrouter/ui/AdSource$Network;", "Lcom/truecaller/ads/adsrouter/ui/AdSource$NetworkCache;", "Lcom/truecaller/ads/adsrouter/ui/AdSource$Offline;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class AdSource implements android.os.Parcelable {
    public final java.lang.String a;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/AdSource$House;", "Lcom/truecaller/ads/adsrouter/ui/AdSource;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class House extends com.truecaller.ads.adsrouter.ui.AdSource {
        public static final com.truecaller.ads.adsrouter.ui.AdSource.House b = new com.truecaller.ads.adsrouter.ui.AdSource("house");

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.AdSource.House> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/AdSource$Network;", "Lcom/truecaller/ads/adsrouter/ui/AdSource;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Network extends com.truecaller.ads.adsrouter.ui.AdSource {
        public static final com.truecaller.ads.adsrouter.ui.AdSource.Network b = new com.truecaller.ads.adsrouter.ui.AdSource("network");

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.AdSource.Network> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/AdSource$NetworkCache;", "Lcom/truecaller/ads/adsrouter/ui/AdSource;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class NetworkCache extends com.truecaller.ads.adsrouter.ui.AdSource {
        public static final com.truecaller.ads.adsrouter.ui.AdSource.NetworkCache b = new com.truecaller.ads.adsrouter.ui.AdSource("network_cache");

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.AdSource.NetworkCache> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/AdSource$Offline;", "Lcom/truecaller/ads/adsrouter/ui/AdSource;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Offline extends com.truecaller.ads.adsrouter.ui.AdSource {
        public static final com.truecaller.ads.adsrouter.ui.AdSource.Offline b = new com.truecaller.ads.adsrouter.ui.AdSource("offline");

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.AdSource.Offline> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public AdSource(java.lang.String str) {
        this.a = str;
    }
}
