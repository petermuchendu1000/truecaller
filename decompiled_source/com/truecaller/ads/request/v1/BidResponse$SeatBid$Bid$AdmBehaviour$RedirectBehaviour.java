package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$AdmBehaviour$RedirectBehaviour implements com.google.protobuf.Internal.EnumLite {
    InAppBrowser(0),
    InAppWebView(1),
    ExternalBrowser(2),
    Default(3),
    UNRECOGNIZED(-1);

    public static final int Default_VALUE = 3;
    public static final int ExternalBrowser_VALUE = 2;
    public static final int InAppBrowser_VALUE = 0;
    public static final int InAppWebView_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$RedirectBehaviour> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$AdmBehaviour$RedirectBehaviour(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$RedirectBehaviour forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Default;
                }
                return ExternalBrowser;
            }
            return InAppWebView;
        }
        return InAppBrowser;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$RedirectBehaviour> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.i2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$RedirectBehaviour valueOf(int i) {
        return forNumber(i);
    }
}
