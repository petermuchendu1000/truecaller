package com.truecaller.ads.domain.execution.auction.serverauction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ads/domain/execution/auction/serverauction/ServerAuctionErrorCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "UNAUTHORIZED", "TIMEOUT", "NETWORK_ERROR", "UNKNOWN", "NO_AUCTION_DECISION", "NO_AVAILABLE_BIDS", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ServerAuctionErrorCode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode[] $VALUES;
    private final int code;
    public static final com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode UNAUTHORIZED = new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode("UNAUTHORIZED", 0, 0);
    public static final com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode TIMEOUT = new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode("TIMEOUT", 1, 1);
    public static final com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode NETWORK_ERROR = new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode("NETWORK_ERROR", 2, 2);
    public static final com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode UNKNOWN = new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode("UNKNOWN", 3, 3);
    public static final com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode NO_AUCTION_DECISION = new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode("NO_AUCTION_DECISION", 4, 4);
    public static final com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode NO_AVAILABLE_BIDS = new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode("NO_AVAILABLE_BIDS", 5, 6);

    private static final /* synthetic */ com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode[] $values() {
        return new com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode[]{UNAUTHORIZED, TIMEOUT, NETWORK_ERROR, UNKNOWN, NO_AUCTION_DECISION, NO_AVAILABLE_BIDS};
    }

    static {
        com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ServerAuctionErrorCode(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode valueOf(java.lang.String str) {
        return (com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode) java.lang.Enum.valueOf(com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode.class, str);
    }

    public static com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode[] values() {
        return (com.truecaller.ads.domain.execution.auction.serverauction.ServerAuctionErrorCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
