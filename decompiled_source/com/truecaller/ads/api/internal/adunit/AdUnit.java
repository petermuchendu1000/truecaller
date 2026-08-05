package com.truecaller.ads.api.internal.adunit;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000f2\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit;", "", "defaultValue", "", "getDefaultValue", "()Ljava/lang/String;", "Unknown", "PacsScreen", "Pacs", "PacsTop", "CallLogScreen", "ClPromo", "DvScreen", "Dv", "DvBottom", "Companion", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$CallLogScreen;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvScreen;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsScreen;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Unknown;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface AdUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.ads.api.internal.adunit.AdUnit.Companion INSTANCE = com.truecaller.ads.api.internal.adunit.AdUnit.Companion.a;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$CallLogScreen;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface CallLogScreen extends com.truecaller.ads.api.internal.adunit.AdUnit {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$CallLogScreen;", "ClPromoPrimary", "ClPromoSecondary", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo$ClPromoPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo$ClPromoSecondary;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class ClPromo implements com.truecaller.ads.api.internal.adunit.AdUnit.CallLogScreen {
        public final java.lang.String a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo$ClPromoPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class ClPromoPrimary extends com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoPrimary b = new com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoPrimary();

            private ClPromoPrimary() {
                super("/43067329/DL_CLP_1");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoPrimary);
            }

            public final int hashCode() {
                return -817354981;
            }

            public final java.lang.String toString() {
                return "ClPromoPrimary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo$ClPromoSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$ClPromo;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class ClPromoSecondary extends com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoSecondary b = new com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoSecondary();

            private ClPromoSecondary() {
                super("/43067329/DL_CLP_2");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoSecondary);
            }

            public final int hashCode() {
                return 1525524557;
            }

            public final java.lang.String toString() {
                return "ClPromoSecondary";
            }
        }

        public ClPromo(java.lang.String str) {
            this.a = str;
        }

        @Override // com.truecaller.ads.api.internal.adunit.AdUnit
        /* renamed from: getDefaultValue, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Companion;", "", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ com.truecaller.ads.api.internal.adunit.AdUnit.Companion a = new com.truecaller.ads.api.internal.adunit.AdUnit.Companion();
        public static final java.util.List b = kotlin.collections.y.j(new com.truecaller.ads.api.internal.adunit.AdUnit[]{com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsPrimary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsSecondary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsTertiary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuaternary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuinary.b, com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopPrimary.b, com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopSecondary.b, com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopTertiary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvPrimary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSecondary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvTertiary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuaternary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuinary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSenary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSeptenary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvOctonary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvNonary.b, com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvDenary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomPrimary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSecondary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomTertiary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuaternary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuinary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSenary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSeptenary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomOctonary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomNonary.b, com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomDenary.b, com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoPrimary.b, com.truecaller.ads.api.internal.adunit.AdUnit.ClPromo.ClPromoSecondary.b});
        public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new s20.bar(0));

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvScreen;", "DvPrimary", "DvSecondary", "DvTertiary", "DvQuaternary", "DvQuinary", "DvSenary", "DvSeptenary", "DvOctonary", "DvNonary", "DvDenary", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvDenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvNonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvOctonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvQuaternary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvQuinary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvSenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvSeptenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvTertiary;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class Dv implements com.truecaller.ads.api.internal.adunit.AdUnit.DvScreen {
        public final java.lang.String a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvDenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvDenary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvDenary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvDenary();

            private DvDenary() {
                super("/43067329/A*DV_ATF_9*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvDenary);
            }

            public final int hashCode() {
                return -1634124910;
            }

            public final java.lang.String toString() {
                return "DvDenary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvNonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvNonary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvNonary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvNonary();

            private DvNonary() {
                super("/43067329/A*DV_ATF_8*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvNonary);
            }

            public final int hashCode() {
                return -1338598190;
            }

            public final java.lang.String toString() {
                return "DvNonary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvOctonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvOctonary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvOctonary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvOctonary();

            private DvOctonary() {
                super("/43067329/A*DV_ATF_7*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvOctonary);
            }

            public final int hashCode() {
                return 1964594592;
            }

            public final java.lang.String toString() {
                return "DvOctonary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvPrimary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvPrimary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvPrimary();

            private DvPrimary() {
                super("/43067329/DL_DV_ATF_1");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvPrimary);
            }

            public final int hashCode() {
                return -985219957;
            }

            public final java.lang.String toString() {
                return "DvPrimary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvQuaternary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvQuaternary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuaternary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuaternary();

            private DvQuaternary() {
                super("/43067329/A*DV_ATF_3*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuaternary);
            }

            public final int hashCode() {
                return 769115733;
            }

            public final java.lang.String toString() {
                return "DvQuaternary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvQuinary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvQuinary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuinary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuinary();

            private DvQuinary() {
                super("/43067329/A*DV_ATF_4*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvQuinary);
            }

            public final int hashCode() {
                return -11799032;
            }

            public final java.lang.String toString() {
                return "DvQuinary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvSecondary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSecondary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSecondary();

            private DvSecondary() {
                super("/43067329/A*DV_ATF_1*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSecondary);
            }

            public final int hashCode() {
                return -878927427;
            }

            public final java.lang.String toString() {
                return "DvSecondary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvSenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvSenary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSenary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSenary();

            private DvSenary() {
                super("/43067329/A*DV_ATF_5*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSenary);
            }

            public final int hashCode() {
                return -1204687645;
            }

            public final java.lang.String toString() {
                return "DvSenary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvSeptenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvSeptenary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSeptenary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSeptenary();

            private DvSeptenary() {
                super("/43067329/A*DV_ATF_6*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvSeptenary);
            }

            public final int hashCode() {
                return -2091149486;
            }

            public final java.lang.String toString() {
                return "DvSeptenary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv$DvTertiary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvTertiary extends com.truecaller.ads.api.internal.adunit.AdUnit.Dv {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvTertiary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvTertiary();

            private DvTertiary() {
                super("/43067329/A*DV_ATF_2*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Dv.DvTertiary);
            }

            public final int hashCode() {
                return -484037911;
            }

            public final java.lang.String toString() {
                return "DvTertiary";
            }
        }

        public Dv(java.lang.String str) {
            this.a = str;
        }

        @Override // com.truecaller.ads.api.internal.adunit.AdUnit
        /* renamed from: getDefaultValue, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvScreen;", "DvBottomPrimary", "DvBottomSecondary", "DvBottomTertiary", "DvBottomQuaternary", "DvBottomQuinary", "DvBottomSenary", "DvBottomSeptenary", "DvBottomOctonary", "DvBottomNonary", "DvBottomDenary", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomDenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomNonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomOctonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomQuaternary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomQuinary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomSenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomSeptenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomTertiary;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class DvBottom implements com.truecaller.ads.api.internal.adunit.AdUnit.DvScreen {
        public final java.lang.String a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomDenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomDenary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomDenary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomDenary();

            private DvBottomDenary() {
                super("/43067329/A*DV_BTF_MultiAds_9*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomDenary);
            }

            public final int hashCode() {
                return 1361528178;
            }

            public final java.lang.String toString() {
                return "DvBottomDenary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomNonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomNonary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomNonary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomNonary();

            private DvBottomNonary() {
                super("/43067329/A*DV_BTF_MultiAds_8*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomNonary);
            }

            public final int hashCode() {
                return 1657054898;
            }

            public final java.lang.String toString() {
                return "DvBottomNonary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomOctonary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomOctonary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomOctonary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomOctonary();

            private DvBottomOctonary() {
                super("/43067329/A*DV_BTF_MultiAds_7*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomOctonary);
            }

            public final int hashCode() {
                return -1135843456;
            }

            public final java.lang.String toString() {
                return "DvBottomOctonary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomPrimary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomPrimary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomPrimary();

            private DvBottomPrimary() {
                super("/43067329/DL_DvB_1");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomPrimary);
            }

            public final int hashCode() {
                return 1685712555;
            }

            public final java.lang.String toString() {
                return "DvBottomPrimary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomQuaternary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomQuaternary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuaternary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuaternary();

            private DvBottomQuaternary() {
                super("/43067329/A*DV_BTF_MultiAds_3*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuaternary);
            }

            public final int hashCode() {
                return 1955455029;
            }

            public final java.lang.String toString() {
                return "DvBottomQuaternary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomQuinary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomQuinary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuinary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuinary();

            private DvBottomQuinary() {
                super("/43067329/A*DV_BTF_MultiAds_4*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomQuinary);
            }

            public final int hashCode() {
                return -1635833816;
            }

            public final java.lang.String toString() {
                return "DvBottomQuinary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomSecondary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSecondary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSecondary();

            private DvBottomSecondary() {
                super("/43067329/A*DV_BTF_MultiAds_1*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSecondary);
            }

            public final int hashCode() {
                return 1791740893;
            }

            public final java.lang.String toString() {
                return "DvBottomSecondary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomSenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomSenary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSenary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSenary();

            private DvBottomSenary() {
                super("/43067329/A*DV_BTF_MultiAds_5*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSenary);
            }

            public final int hashCode() {
                return 1790965443;
            }

            public final java.lang.String toString() {
                return "DvBottomSenary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomSeptenary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomSeptenary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSeptenary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSeptenary();

            private DvBottomSeptenary() {
                super("/43067329/A*DV_BTF_MultiAds_6*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomSeptenary);
            }

            public final int hashCode() {
                return 579518834;
            }

            public final java.lang.String toString() {
                return "DvBottomSeptenary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom$DvBottomTertiary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottomTertiary extends com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomTertiary b = new com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomTertiary();

            private DvBottomTertiary() {
                super("/43067329/A*DV_BTF_MultiAds_2*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.DvBottom.DvBottomTertiary);
            }

            public final int hashCode() {
                return 710491337;
            }

            public final java.lang.String toString() {
                return "DvBottomTertiary";
            }
        }

        public DvBottom(java.lang.String str) {
            this.a = str;
        }

        @Override // com.truecaller.ads.api.internal.adunit.AdUnit
        /* renamed from: getDefaultValue, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvScreen;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Dv;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$DvBottom;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface DvScreen extends com.truecaller.ads.api.internal.adunit.AdUnit {
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsScreen;", "PacsPrimary", "PacsSecondary", "PacsTertiary", "PacsQuaternary", "PacsQuinary", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsQuaternary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsQuinary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsTertiary;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class Pacs implements com.truecaller.ads.api.internal.adunit.AdUnit.PacsScreen {
        public final java.lang.String a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsPrimary extends com.truecaller.ads.api.internal.adunit.AdUnit.Pacs {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsPrimary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsPrimary();

            private PacsPrimary() {
                super("/43067329/DL_ACS_Bottom");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsPrimary);
            }

            public final int hashCode() {
                return -488887637;
            }

            public final java.lang.String toString() {
                return "PacsPrimary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsQuaternary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsQuaternary extends com.truecaller.ads.api.internal.adunit.AdUnit.Pacs {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuaternary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuaternary();

            private PacsQuaternary() {
                super("/43067329/A*ACS_Bottom_Carousel_3*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuaternary);
            }

            public final int hashCode() {
                return -567139275;
            }

            public final java.lang.String toString() {
                return "PacsQuaternary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsQuinary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsQuinary extends com.truecaller.ads.api.internal.adunit.AdUnit.Pacs {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuinary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuinary();

            private PacsQuinary() {
                super("/43067329/A*ACS_Bottom_Carousel_4*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsQuinary);
            }

            public final int hashCode() {
                return 484533288;
            }

            public final java.lang.String toString() {
                return "PacsQuinary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsSecondary extends com.truecaller.ads.api.internal.adunit.AdUnit.Pacs {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsSecondary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsSecondary();

            private PacsSecondary() {
                super("/43067329/A*ACS_Bottom_Carousel*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsSecondary);
            }

            public final int hashCode() {
                return -644937763;
            }

            public final java.lang.String toString() {
                return "PacsSecondary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs$PacsTertiary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsTertiary extends com.truecaller.ads.api.internal.adunit.AdUnit.Pacs {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsTertiary b = new com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsTertiary();

            private PacsTertiary() {
                super("/43067329/A*ACS_Bottom_Carousel_2*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Pacs.PacsTertiary);
            }

            public final int hashCode() {
                return 2017362121;
            }

            public final java.lang.String toString() {
                return "PacsTertiary";
            }
        }

        public Pacs(java.lang.String str) {
            this.a = str;
        }

        @Override // com.truecaller.ads.api.internal.adunit.AdUnit
        /* renamed from: getDefaultValue, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsScreen;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$Pacs;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface PacsScreen extends com.truecaller.ads.api.internal.adunit.AdUnit {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsScreen;", "PacsTopPrimary", "PacsTopSecondary", "PacsTopTertiary", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop$PacsTopPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop$PacsTopSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop$PacsTopTertiary;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class PacsTop implements com.truecaller.ads.api.internal.adunit.AdUnit.PacsScreen {
        public final java.lang.String a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop$PacsTopPrimary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsTopPrimary extends com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopPrimary b = new com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopPrimary();

            private PacsTopPrimary() {
                super("/43067329/DL_PacsTop_1");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopPrimary);
            }

            public final int hashCode() {
                return 202451711;
            }

            public final java.lang.String toString() {
                return "PacsTopPrimary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop$PacsTopSecondary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsTopSecondary extends com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopSecondary b = new com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopSecondary();

            private PacsTopSecondary() {
                super("/43067329/A*ACS_Top_2*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopSecondary);
            }

            public final int hashCode() {
                return -1987755215;
            }

            public final java.lang.String toString() {
                return "PacsTopSecondary";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop$PacsTopTertiary;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit$PacsTop;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsTopTertiary extends com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop {
            public static final com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopTertiary b = new com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopTertiary();

            private PacsTopTertiary() {
                super("/43067329/A*ACS_Top_3*Unified*GPS");
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.PacsTop.PacsTopTertiary);
            }

            public final int hashCode() {
                return 1974045429;
            }

            public final java.lang.String toString() {
                return "PacsTopTertiary";
            }
        }

        public PacsTop(java.lang.String str) {
            this.a = str;
        }

        @Override // com.truecaller.ads.api.internal.adunit.AdUnit
        /* renamed from: getDefaultValue, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/internal/adunit/AdUnit$Unknown;", "Lcom/truecaller/ads/api/internal/adunit/AdUnit;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Unknown implements com.truecaller.ads.api.internal.adunit.AdUnit {
        public static final com.truecaller.ads.api.internal.adunit.AdUnit.Unknown a = new com.truecaller.ads.api.internal.adunit.AdUnit.Unknown();
        public static final java.lang.String b = "/43067329/A*Dummy*AdUnit";

        private Unknown() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.internal.adunit.AdUnit.Unknown);
        }

        @Override // com.truecaller.ads.api.internal.adunit.AdUnit
        /* renamed from: getDefaultValue */
        public final java.lang.String getA() {
            return b;
        }

        public final int hashCode() {
            return -195726349;
        }

        public final java.lang.String toString() {
            return "Unknown";
        }
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: getDefaultValue */
    java.lang.String getA();
}
