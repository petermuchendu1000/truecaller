package com.truecaller.wizard.countries;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/wizard/countries/WizardCountryData;", "Landroid/os/Parcelable;", "Country", "NoCountry", "Lcom/truecaller/wizard/countries/WizardCountryData$Country;", "Lcom/truecaller/wizard/countries/WizardCountryData$NoCountry;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface WizardCountryData extends android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/countries/WizardCountryData$Country;", "Lcom/truecaller/wizard/countries/WizardCountryData;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Country implements com.truecaller.wizard.countries.WizardCountryData {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.wizard.countries.WizardCountryData.Country> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        public Country(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.data.country.CountryListDto$bar, java.lang.Object] */
        public final com.truecaller.data.country.CountryListDto.bar a() {
            ?? obj = new java.lang.Object();
            ((com.truecaller.data.country.CountryListDto.bar) obj).a = this.a;
            ((com.truecaller.data.country.CountryListDto.bar) obj).b = this.b;
            ((com.truecaller.data.country.CountryListDto.bar) obj).c = this.c;
            ((com.truecaller.data.country.CountryListDto.bar) obj).d = this.d;
            return obj;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.wizard.countries.WizardCountryData.Country)) {
                return false;
            }
            com.truecaller.wizard.countries.WizardCountryData.Country country = (com.truecaller.wizard.countries.WizardCountryData.Country) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, country.a) && kotlin.jvm.internal.Intrinsics.b(this.b, country.b) && kotlin.jvm.internal.Intrinsics.b(this.c, country.c) && kotlin.jvm.internal.Intrinsics.b(this.d, country.d);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("Country(id=", this.a, ", name=", this.b, ", iso="), this.c, ", code=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/countries/WizardCountryData$NoCountry;", "Lcom/truecaller/wizard/countries/WizardCountryData;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final class NoCountry implements com.truecaller.wizard.countries.WizardCountryData {
        public static final com.truecaller.wizard.countries.WizardCountryData.NoCountry a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.wizard.countries.WizardCountryData.NoCountry> CREATOR = new java.lang.Object();

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
}
