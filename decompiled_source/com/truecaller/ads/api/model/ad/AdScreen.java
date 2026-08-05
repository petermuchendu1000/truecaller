package com.truecaller.ads.api.model.ad;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen;", "", "Unknown", "Pacs", "Facs", "Dv", "CallerId", "CallLog", "Companion", "Lcom/truecaller/ads/api/model/ad/AdScreen$CallLog;", "Lcom/truecaller/ads/api/model/ad/AdScreen$CallerId;", "Lcom/truecaller/ads/api/model/ad/AdScreen$Dv;", "Lcom/truecaller/ads/api/model/ad/AdScreen$Facs;", "Lcom/truecaller/ads/api/model/ad/AdScreen$Pacs;", "Lcom/truecaller/ads/api/model/ad/AdScreen$Unknown;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface AdScreen {

    /* renamed from: Companion, reason: from kotlin metadata */
    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.ads.api.model.ad.AdScreen.Companion INSTANCE = com.truecaller.ads.api.model.ad.AdScreen.Companion.a;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$CallLog;", "Lcom/truecaller/ads/api/model/ad/AdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class CallLog implements com.truecaller.ads.api.model.ad.AdScreen {
        public static final com.truecaller.ads.api.model.ad.AdScreen.CallLog a = new com.truecaller.ads.api.model.ad.AdScreen.CallLog();

        private CallLog() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdScreen.CallLog);
        }

        public final int hashCode() {
            return 1883699539;
        }

        public final java.lang.String toString() {
            return "CallLog";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$CallerId;", "Lcom/truecaller/ads/api/model/ad/AdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class CallerId implements com.truecaller.ads.api.model.ad.AdScreen {
        public static final com.truecaller.ads.api.model.ad.AdScreen.CallerId a = new com.truecaller.ads.api.model.ad.AdScreen.CallerId();

        private CallerId() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdScreen.CallerId);
        }

        public final int hashCode() {
            return -1734109607;
        }

        public final java.lang.String toString() {
            return "CallerId";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$Companion;", "", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ com.truecaller.ads.api.model.ad.AdScreen.Companion a = new com.truecaller.ads.api.model.ad.AdScreen.Companion();
        public static final java.util.List b = kotlin.collections.y.j(new com.truecaller.ads.api.model.ad.AdScreen[]{com.truecaller.ads.api.model.ad.AdScreen.Unknown.a, com.truecaller.ads.api.model.ad.AdScreen.Pacs.a, com.truecaller.ads.api.model.ad.AdScreen.Facs.a, com.truecaller.ads.api.model.ad.AdScreen.Dv.a, com.truecaller.ads.api.model.ad.AdScreen.CallerId.a, com.truecaller.ads.api.model.ad.AdScreen.CallLog.a});
        public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new bz0.e(11));

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$Dv;", "Lcom/truecaller/ads/api/model/ad/AdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Dv implements com.truecaller.ads.api.model.ad.AdScreen {
        public static final com.truecaller.ads.api.model.ad.AdScreen.Dv a = new com.truecaller.ads.api.model.ad.AdScreen.Dv();

        private Dv() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdScreen.Dv);
        }

        public final int hashCode() {
            return 1246389029;
        }

        public final java.lang.String toString() {
            return "Dv";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$Facs;", "Lcom/truecaller/ads/api/model/ad/AdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Facs implements com.truecaller.ads.api.model.ad.AdScreen {
        public static final com.truecaller.ads.api.model.ad.AdScreen.Facs a = new com.truecaller.ads.api.model.ad.AdScreen.Facs();

        private Facs() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdScreen.Facs);
        }

        public final int hashCode() {
            return -515976130;
        }

        public final java.lang.String toString() {
            return "Facs";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$Pacs;", "Lcom/truecaller/ads/api/model/ad/AdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Pacs implements com.truecaller.ads.api.model.ad.AdScreen {
        public static final com.truecaller.ads.api.model.ad.AdScreen.Pacs a = new com.truecaller.ads.api.model.ad.AdScreen.Pacs();

        private Pacs() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdScreen.Pacs);
        }

        public final int hashCode() {
            return -515678220;
        }

        public final java.lang.String toString() {
            return "Pacs";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdScreen$Unknown;", "Lcom/truecaller/ads/api/model/ad/AdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Unknown implements com.truecaller.ads.api.model.ad.AdScreen {
        public static final com.truecaller.ads.api.model.ad.AdScreen.Unknown a = new com.truecaller.ads.api.model.ad.AdScreen.Unknown();

        private Unknown() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdScreen.Unknown);
        }

        public final int hashCode() {
            return 1050245527;
        }

        public final java.lang.String toString() {
            return "Unknown";
        }
    }
}
