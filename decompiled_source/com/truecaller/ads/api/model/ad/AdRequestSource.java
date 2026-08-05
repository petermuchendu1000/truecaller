package com.truecaller.ads.api.model.ad;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00112\u00020\u0001:\f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "getId", "()I", "Unknown", "PostFetch", "PacsScreen", "FacsScreen", "DvScreen", "CallerIdScreen", "ClPromoScreen", "ListScreen", "BlockScreen", "IncomingCallNotification", "SearchScreen", "Companion", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$CallerIdScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$FacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$IncomingCallNotification;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$PostFetch;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$Unknown;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface AdRequestSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.ads.api.model.ad.AdRequestSource.Companion INSTANCE = com.truecaller.ads.api.model.ad.AdRequestSource.Companion.a;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "Block", "BlockUpdate", "BlockUpdateOop", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen$Block;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen$BlockUpdate;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen$BlockUpdateOop;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class BlockScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen$Block;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Block extends com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.Block b = new com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.Block();

            private Block() {
                super(17);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.Block);
            }

            public final int hashCode() {
                return 867265285;
            }

            public final java.lang.String toString() {
                return "Block";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen$BlockUpdate;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class BlockUpdate extends com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdate b = new com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdate();

            private BlockUpdate() {
                super(18);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdate);
            }

            public final int hashCode() {
                return -979797970;
            }

            public final java.lang.String toString() {
                return "BlockUpdate";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen$BlockUpdateOop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$BlockScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class BlockUpdateOop extends com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdateOop b = new com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdateOop();

            private BlockUpdateOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdateOop);
            }

            public final int hashCode() {
                return -563501182;
            }

            public final java.lang.String toString() {
                return "BlockUpdateOop";
            }
        }

        public BlockScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$CallerIdScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "CallerId", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$CallerIdScreen$CallerId;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class CallerIdScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$CallerIdScreen$CallerId;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$CallerIdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class CallerId extends com.truecaller.ads.api.model.ad.AdRequestSource.CallerIdScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.CallerIdScreen.CallerId a = new com.truecaller.ads.api.model.ad.AdRequestSource.CallerIdScreen.CallerId();

            private CallerId() {
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.CallerIdScreen.CallerId);
            }

            public final int hashCode() {
                return -1077169617;
            }

            public final java.lang.String toString() {
                return "CallerId";
            }
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId */
        public final int getA() {
            return 9;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "ClPromo", "FreqContact", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen$ClPromo;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen$FreqContact;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class ClPromoScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen$ClPromo;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class ClPromo extends com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.ClPromo b = new com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.ClPromo();

            private ClPromo() {
                super(11);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.ClPromo);
            }

            public final int hashCode() {
                return -1725146825;
            }

            public final java.lang.String toString() {
                return "ClPromo";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen$FreqContact;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ClPromoScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class FreqContact extends com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.FreqContact b = new com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.FreqContact();

            private FreqContact() {
                super(12);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.FreqContact);
            }

            public final int hashCode() {
                return 847327513;
            }

            public final java.lang.String toString() {
                return "FreqContact";
            }
        }

        public ClPromoScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$Companion;", "", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ com.truecaller.ads.api.model.ad.AdRequestSource.Companion a = new com.truecaller.ads.api.model.ad.AdRequestSource.Companion();
        public static final java.util.List b = kotlin.collections.y.j(new com.truecaller.ads.api.model.ad.AdRequestSource[]{com.truecaller.ads.api.model.ad.AdRequestSource.Unknown.a, com.truecaller.ads.api.model.ad.AdRequestSource.PostFetch.a, com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.Pacs.b, com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.PacsTop.b, com.truecaller.ads.api.model.ad.AdRequestSource.FacsScreen.Facs.a, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.Dv.b, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvBottom.b, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvHeader.b, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOop.b, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2WOop.b, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2POop.b, com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOverlay.b, com.truecaller.ads.api.model.ad.AdRequestSource.CallerIdScreen.CallerId.a, com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.CallLog.b, com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.ClPromo.b, com.truecaller.ads.api.model.ad.AdRequestSource.ClPromoScreen.FreqContact.b, com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Inbox.b, com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Contact.b, com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Anchor.b, com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Floater.b, com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.Block.b, com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdate.b, com.truecaller.ads.api.model.ad.AdRequestSource.BlockScreen.BlockUpdateOop.b, com.truecaller.ads.api.model.ad.AdRequestSource.IncomingCallNotification.a, com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchHistory.b, com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchResult.b});
        public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new bz0.e(9));
        public static final kotlin.Lazy d = kotlin.LazyKt.lazy(new bz0.e(10));

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "Dv", "DvBottom", "DvHeader", "DvOverlay", "DvOop", "DvC2WOop", "DvC2POop", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$Dv;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvBottom;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvC2POop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvHeader;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvOop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvOverlay;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class DvScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$Dv;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Dv extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.Dv b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.Dv();

            private Dv() {
                super(6);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.Dv);
            }

            public final int hashCode() {
                return 160905263;
            }

            public final java.lang.String toString() {
                return "Dv";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvBottom;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottom extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvBottom b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvBottom();

            private DvBottom() {
                super(7);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvBottom);
            }

            public final int hashCode() {
                return -964387014;
            }

            public final java.lang.String toString() {
                return "DvBottom";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvC2POop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvC2POop extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2POop b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2POop();

            private DvC2POop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2POop);
            }

            public final int hashCode() {
                return -993200674;
            }

            public final java.lang.String toString() {
                return "DvC2POop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvC2WOop extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2WOop b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2WOop();

            private DvC2WOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvC2WOop);
            }

            public final int hashCode() {
                return -992992137;
            }

            public final java.lang.String toString() {
                return "DvC2WOop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvHeader;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvHeader extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvHeader b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvHeader();

            private DvHeader() {
                super(8);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvHeader);
            }

            public final int hashCode() {
                return -802429028;
            }

            public final java.lang.String toString() {
                return "DvHeader";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvOop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvOop extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOop b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOop();

            private DvOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOop);
            }

            public final int hashCode() {
                return 345267169;
            }

            public final java.lang.String toString() {
                return "DvOop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen$DvOverlay;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvOverlay extends com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOverlay b = new com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOverlay();

            private DvOverlay() {
                super(22);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.DvScreen.DvOverlay);
            }

            public final int hashCode() {
                return -992091871;
            }

            public final java.lang.String toString() {
                return "DvOverlay";
            }
        }

        public DvScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$FacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "Facs", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$FacsScreen$Facs;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class FacsScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$FacsScreen$Facs;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$FacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Facs extends com.truecaller.ads.api.model.ad.AdRequestSource.FacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.FacsScreen.Facs a = new com.truecaller.ads.api.model.ad.AdRequestSource.FacsScreen.Facs();

            private Facs() {
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.FacsScreen.Facs);
            }

            public final int hashCode() {
                return -1623651313;
            }

            public final java.lang.String toString() {
                return "Facs";
            }
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId */
        public final int getA() {
            return 5;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$IncomingCallNotification;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class IncomingCallNotification implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public static final com.truecaller.ads.api.model.ad.AdRequestSource.IncomingCallNotification a = new com.truecaller.ads.api.model.ad.AdRequestSource.IncomingCallNotification();
        public static final int b = 19;

        private IncomingCallNotification() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.IncomingCallNotification);
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId */
        public final int getA() {
            return b;
        }

        public final int hashCode() {
            return 659499170;
        }

        public final java.lang.String toString() {
            return "IncomingCallNotification";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "CallLog", "Inbox", "Contact", "Anchor", "Floater", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Anchor;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$CallLog;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Contact;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Floater;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Inbox;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class ListScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Anchor;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Anchor extends com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Anchor b = new com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Anchor();

            private Anchor() {
                super(15);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Anchor);
            }

            public final int hashCode() {
                return 494120966;
            }

            public final java.lang.String toString() {
                return "Anchor";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$CallLog;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class CallLog extends com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.CallLog b = new com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.CallLog();

            private CallLog() {
                super(10);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.CallLog);
            }

            public final int hashCode() {
                return -450893611;
            }

            public final java.lang.String toString() {
                return "CallLog";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Contact;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Contact extends com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Contact b = new com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Contact();

            private Contact() {
                super(14);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Contact);
            }

            public final int hashCode() {
                return -47980305;
            }

            public final java.lang.String toString() {
                return "Contact";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Floater;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Floater extends com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Floater b = new com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Floater();

            private Floater() {
                super(16);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Floater);
            }

            public final int hashCode() {
                return -1765948200;
            }

            public final java.lang.String toString() {
                return "Floater";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen$Inbox;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Inbox extends com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Inbox b = new com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Inbox();

            private Inbox() {
                super(13);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.ListScreen.Inbox);
            }

            public final int hashCode() {
                return 1824442133;
            }

            public final java.lang.String toString() {
                return "Inbox";
            }
        }

        public ListScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "Pacs", "PacsTop", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen$Pacs;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen$PacsTop;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class PacsScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen$Pacs;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Pacs extends com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.Pacs b = new com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.Pacs();

            private Pacs() {
                super(3);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.Pacs);
            }

            public final int hashCode() {
                return 567262799;
            }

            public final java.lang.String toString() {
                return "Pacs";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen$PacsTop;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$PacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsTop extends com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.PacsTop b = new com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.PacsTop();

            private PacsTop() {
                super(4);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.PacsScreen.PacsTop);
            }

            public final int hashCode() {
                return -1370180474;
            }

            public final java.lang.String toString() {
                return "PacsTop";
            }
        }

        public PacsScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$PostFetch;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class PostFetch implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public static final com.truecaller.ads.api.model.ad.AdRequestSource.PostFetch a = new com.truecaller.ads.api.model.ad.AdRequestSource.PostFetch();
        public static final int b = 2;

        private PostFetch() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.PostFetch);
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId */
        public final int getA() {
            return b;
        }

        public final int hashCode() {
            return 722590823;
        }

        public final java.lang.String toString() {
            return "PostFetch";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "SearchHistory", "SearchResult", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen$SearchHistory;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen$SearchResult;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class SearchScreen implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen$SearchHistory;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class SearchHistory extends com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchHistory b = new com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchHistory();

            private SearchHistory() {
                super(20);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchHistory);
            }

            public final int hashCode() {
                return 722381477;
            }

            public final java.lang.String toString() {
                return "SearchHistory";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen$SearchResult;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource$SearchScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class SearchResult extends com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen {
            public static final com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchResult b = new com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchResult();

            private SearchResult() {
                super(21);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.SearchScreen.SearchResult);
            }

            public final int hashCode() {
                return -109741076;
            }

            public final java.lang.String toString() {
                return "SearchResult";
            }
        }

        public SearchScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdRequestSource$Unknown;", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Unknown implements com.truecaller.ads.api.model.ad.AdRequestSource {
        public static final com.truecaller.ads.api.model.ad.AdRequestSource.Unknown a = new com.truecaller.ads.api.model.ad.AdRequestSource.Unknown();
        public static final int b = 1;

        private Unknown() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdRequestSource.Unknown);
        }

        @Override // com.truecaller.ads.api.model.ad.AdRequestSource
        /* renamed from: getId */
        public final int getA() {
            return b;
        }

        public final int hashCode() {
            return 71392759;
        }

        public final java.lang.String toString() {
            return "Unknown";
        }
    }

    /* renamed from: getId */
    int getA();
}
