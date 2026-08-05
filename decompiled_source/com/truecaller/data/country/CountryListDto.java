package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class CountryListDto {

    @androidx.annotation.Nullable
    @bw.qux("COUNTRY_LIST")
    public com.truecaller.data.country.CountryListDto.baz countryList;

    @androidx.annotation.Nullable
    @bw.qux("COUNTRY_LIST_CHECKSUM")
    public java.lang.String countryListChecksum;

    @androidx.annotation.Nullable
    @bw.qux("SUGGESTED_COUNTRIES")
    public com.truecaller.data.country.CountryListDto.baz suggestedCountryList;

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static class bar {

        @androidx.annotation.Nullable
        @bw.qux("CID")
        public java.lang.String a;

        @androidx.annotation.Nullable
        @bw.qux("CN")
        public java.lang.String b;

        @androidx.annotation.Nullable
        @bw.qux("CCN")
        public java.lang.String c;

        @androidx.annotation.Nullable
        @bw.qux("CC")
        public java.lang.String d;

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.truecaller.data.country.CountryListDto.bar barVar = (com.truecaller.data.country.CountryListDto.bar) obj;
                if (java.util.Objects.equals(this.a, barVar.a) && java.util.Objects.equals(this.b, barVar.b) && java.util.Objects.equals(this.c, barVar.c) && java.util.Objects.equals(this.d, barVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.a, this.b, this.c, this.d);
        }
    }

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static class baz {

        @androidx.annotation.Nullable
        @bw.qux("COUNTRY_SUGGESTION")
        public com.truecaller.data.country.CountryListDto.bar a;

        @androidx.annotation.Nullable
        @bw.qux("C")
        public java.util.List<com.truecaller.data.country.CountryListDto.bar> b;
    }
}
