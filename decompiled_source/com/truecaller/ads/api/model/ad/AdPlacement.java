package com.truecaller.ads.api.model.ad;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000f2\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "getId", "()I", "Unknown", "PacsScreen", "FacsScreen", "DvScreen", "CallerIdScreen", "ClPromoScreen", "ListScreen", "SearchScreen", "BlockScreen", "Companion", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$CallerIdScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$Unknown;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface AdPlacement {

    /* renamed from: Companion, reason: from kotlin metadata */
    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.ads.api.model.ad.AdPlacement.Companion INSTANCE = com.truecaller.ads.api.model.ad.AdPlacement.Companion.a;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "Block", "BlockUpdate", "BlockUpdateOop", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen$Block;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen$BlockUpdate;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen$BlockUpdateOop;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class BlockScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen$Block;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Block extends com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.Block b = new com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.Block();

            private Block() {
                super(17);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.Block);
            }

            public final int hashCode() {
                return -1924350432;
            }

            public final java.lang.String toString() {
                return "Block";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen$BlockUpdate;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class BlockUpdate extends com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdate b = new com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdate();

            private BlockUpdate() {
                super(18);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdate);
            }

            public final int hashCode() {
                return 2020789001;
            }

            public final java.lang.String toString() {
                return "BlockUpdate";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen$BlockUpdateOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$BlockScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class BlockUpdateOop extends com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdateOop b = new com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdateOop();

            private BlockUpdateOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdateOop);
            }

            public final int hashCode() {
                return -1231379769;
            }

            public final java.lang.String toString() {
                return "BlockUpdateOop";
            }
        }

        public BlockScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$CallerIdScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "CallerId", "Lcom/truecaller/ads/api/model/ad/AdPlacement$CallerIdScreen$CallerId;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class CallerIdScreen implements com.truecaller.ads.api.model.ad.AdPlacement {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$CallerIdScreen$CallerId;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$CallerIdScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class CallerId extends com.truecaller.ads.api.model.ad.AdPlacement.CallerIdScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.CallerIdScreen.CallerId a = new com.truecaller.ads.api.model.ad.AdPlacement.CallerIdScreen.CallerId();

            private CallerId() {
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.CallerIdScreen.CallerId);
            }

            public final int hashCode() {
                return 1923417354;
            }

            public final java.lang.String toString() {
                return "CallerId";
            }
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId */
        public final int getA() {
            return 9;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "ClPromo", "FreqContact", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen$ClPromo;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen$FreqContact;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class ClPromoScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen$ClPromo;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class ClPromo extends com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.ClPromo b = new com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.ClPromo();

            private ClPromo() {
                super(11);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.ClPromo);
            }

            public final int hashCode() {
                return 1080207058;
            }

            public final java.lang.String toString() {
                return "ClPromo";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen$FreqContact;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ClPromoScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class FreqContact extends com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.FreqContact b = new com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.FreqContact();

            private FreqContact() {
                super(12);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.FreqContact);
            }

            public final int hashCode() {
                return -1806616268;
            }

            public final java.lang.String toString() {
                return "FreqContact";
            }
        }

        public ClPromoScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$Companion;", "", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ com.truecaller.ads.api.model.ad.AdPlacement.Companion a = new com.truecaller.ads.api.model.ad.AdPlacement.Companion();
        public static final java.util.List b = kotlin.collections.y.j(new com.truecaller.ads.api.model.ad.AdPlacement[]{com.truecaller.ads.api.model.ad.AdPlacement.Unknown.a, com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.Pacs.b, com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsTop.b, com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2WOop.b, com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2POop.b, com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.Facs.b, com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2WOop.b, com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2POop.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.Dv.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvBottom.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvHeader.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOop.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2WOop.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2POop.b, com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOverlay.b, com.truecaller.ads.api.model.ad.AdPlacement.CallerIdScreen.CallerId.a, com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.CallLog.b, com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.ClPromo.b, com.truecaller.ads.api.model.ad.AdPlacement.ClPromoScreen.FreqContact.b, com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Inbox.b, com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Contact.b, com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Anchor.b, com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Floater.b, com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.Block.b, com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdate.b, com.truecaller.ads.api.model.ad.AdPlacement.BlockScreen.BlockUpdateOop.b, com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchHistory.b, com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchResult.b});
        public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new bz0.e(7));
        public static final kotlin.Lazy d = kotlin.LazyKt.lazy(new bz0.e(8));

        private Companion() {
        }

        public static com.truecaller.ads.api.model.ad.AdPlacement a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
            com.truecaller.ads.api.model.ad.AdPlacement adPlacement = (com.truecaller.ads.api.model.ad.AdPlacement) ((java.util.Map) c.getValue()).get(str);
            if (adPlacement == null) {
                return com.truecaller.ads.api.model.ad.AdPlacement.Unknown.a;
            }
            return adPlacement;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "Dv", "DvBottom", "DvHeader", "DvOverlay", "DvOop", "DvC2WOop", "DvC2POop", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$Dv;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvBottom;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvC2POop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvHeader;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvOverlay;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class DvScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$Dv;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Dv extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.Dv b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.Dv();

            private Dv() {
                super(6);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.Dv);
            }

            public final int hashCode() {
                return -1031160950;
            }

            public final java.lang.String toString() {
                return "Dv";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvBottom;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvBottom extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvBottom b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvBottom();

            private DvBottom() {
                super(7);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvBottom);
            }

            public final int hashCode() {
                return 538964565;
            }

            public final java.lang.String toString() {
                return "DvBottom";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvC2POop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvC2POop extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2POop b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2POop();

            private DvC2POop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2POop);
            }

            public final int hashCode() {
                return 510150905;
            }

            public final java.lang.String toString() {
                return "DvC2POop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvC2WOop extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2WOop b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2WOop();

            private DvC2WOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvC2WOop);
            }

            public final int hashCode() {
                return 510359442;
            }

            public final java.lang.String toString() {
                return "DvC2WOop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvHeader;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvHeader extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvHeader b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvHeader();

            private DvHeader() {
                super(8);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvHeader);
            }

            public final int hashCode() {
                return 700922551;
            }

            public final java.lang.String toString() {
                return "DvHeader";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvOop extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOop b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOop();

            private DvOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOop);
            }

            public final int hashCode() {
                return -1709680986;
            }

            public final java.lang.String toString() {
                return "DvOop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen$DvOverlay;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$DvScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class DvOverlay extends com.truecaller.ads.api.model.ad.AdPlacement.DvScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOverlay b = new com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOverlay();

            private DvOverlay() {
                super(22);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvOverlay);
            }

            public final int hashCode() {
                return -1632833178;
            }

            public final java.lang.String toString() {
                return "DvOverlay";
            }
        }

        public DvScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "Facs", "FacsC2WOop", "FacsC2POop", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen$Facs;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen$FacsC2POop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen$FacsC2WOop;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class FacsScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen$Facs;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Facs extends com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.Facs b = new com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.Facs();

            private Facs() {
                super(5);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.Facs);
            }

            public final int hashCode() {
                return -902534678;
            }

            public final java.lang.String toString() {
                return "Facs";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen$FacsC2POop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class FacsC2POop extends com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2POop b = new com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2POop();

            private FacsC2POop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2POop);
            }

            public final int hashCode() {
                return -1859211431;
            }

            public final java.lang.String toString() {
                return "FacsC2POop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen$FacsC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$FacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class FacsC2WOop extends com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2WOop b = new com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2WOop();

            private FacsC2WOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.FacsScreen.FacsC2WOop);
            }

            public final int hashCode() {
                return -1859002894;
            }

            public final java.lang.String toString() {
                return "FacsC2WOop";
            }
        }

        public FacsScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "CallLog", "Inbox", "Contact", "Anchor", "Floater", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Anchor;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$CallLog;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Contact;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Floater;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Inbox;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class ListScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Anchor;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Anchor extends com.truecaller.ads.api.model.ad.AdPlacement.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Anchor b = new com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Anchor();

            private Anchor() {
                super(15);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Anchor);
            }

            public final int hashCode() {
                return 1997472545;
            }

            public final java.lang.String toString() {
                return "Anchor";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$CallLog;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class CallLog extends com.truecaller.ads.api.model.ad.AdPlacement.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.CallLog b = new com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.CallLog();

            private CallLog() {
                super(10);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.CallLog);
            }

            public final int hashCode() {
                return -1091634918;
            }

            public final java.lang.String toString() {
                return "CallLog";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Contact;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Contact extends com.truecaller.ads.api.model.ad.AdPlacement.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Contact b = new com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Contact();

            private Contact() {
                super(14);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Contact);
            }

            public final int hashCode() {
                return -688721612;
            }

            public final java.lang.String toString() {
                return "Contact";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Floater;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Floater extends com.truecaller.ads.api.model.ad.AdPlacement.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Floater b = new com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Floater();

            private Floater() {
                super(16);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Floater);
            }

            public final int hashCode() {
                return 1888277789;
            }

            public final java.lang.String toString() {
                return "Floater";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen$Inbox;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$ListScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Inbox extends com.truecaller.ads.api.model.ad.AdPlacement.ListScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Inbox b = new com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Inbox();

            private Inbox() {
                super(13);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.ListScreen.Inbox);
            }

            public final int hashCode() {
                return -1590745958;
            }

            public final java.lang.String toString() {
                return "Inbox";
            }
        }

        public ListScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "Pacs", "PacsTop", "PacsC2WOop", "PacsC2POop", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$Pacs;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$PacsC2POop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$PacsC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$PacsTop;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class PacsScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$Pacs;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Pacs extends com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.Pacs b = new com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.Pacs();

            private Pacs() {
                super(3);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.Pacs);
            }

            public final int hashCode() {
                return 1288379434;
            }

            public final java.lang.String toString() {
                return "Pacs";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$PacsC2POop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsC2POop extends com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2POop b = new com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2POop();

            private PacsC2POop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2POop);
            }

            public final int hashCode() {
                return -1710837351;
            }

            public final java.lang.String toString() {
                return "PacsC2POop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$PacsC2WOop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsC2WOop extends com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2WOop b = new com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2WOop();

            private PacsC2WOop() {
                super(-1);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsC2WOop);
            }

            public final int hashCode() {
                return -1710628814;
            }

            public final java.lang.String toString() {
                return "PacsC2WOop";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen$PacsTop;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$PacsScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class PacsTop extends com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsTop b = new com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsTop();

            private PacsTop() {
                super(4);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.PacsTop);
            }

            public final int hashCode() {
                return -2010921781;
            }

            public final java.lang.String toString() {
                return "PacsTop";
            }
        }

        public PacsScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "SearchHistory", "SearchResult", "Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen$SearchHistory;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen$SearchResult;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static abstract class SearchScreen implements com.truecaller.ads.api.model.ad.AdPlacement {
        public final int a;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen$SearchHistory;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class SearchHistory extends com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchHistory b = new com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchHistory();

            private SearchHistory() {
                super(20);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchHistory);
            }

            public final int hashCode() {
                return 54502890;
            }

            public final java.lang.String toString() {
                return "SearchHistory";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen$SearchResult;", "Lcom/truecaller/ads/api/model/ad/AdPlacement$SearchScreen;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class SearchResult extends com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen {
            public static final com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchResult b = new com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchResult();

            private SearchResult() {
                super(21);
            }

            public final boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.SearchScreen.SearchResult);
            }

            public final int hashCode() {
                return 1531282439;
            }

            public final java.lang.String toString() {
                return "SearchResult";
            }
        }

        public SearchScreen(int i) {
            this.a = i;
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId, reason: from getter */
        public final int getA() {
            return this.a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdPlacement$Unknown;", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "<init>", "()V", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Unknown implements com.truecaller.ads.api.model.ad.AdPlacement {
        public static final com.truecaller.ads.api.model.ad.AdPlacement.Unknown a = new com.truecaller.ads.api.model.ad.AdPlacement.Unknown();
        public static final int b = 1;

        private Unknown() {
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.ads.api.model.ad.AdPlacement.Unknown);
        }

        @Override // com.truecaller.ads.api.model.ad.AdPlacement
        /* renamed from: getId */
        public final int getA() {
            return b;
        }

        public final int hashCode() {
            return 1671022290;
        }

        public final java.lang.String toString() {
            return "Unknown";
        }
    }

    /* renamed from: getId */
    int getA();
}
