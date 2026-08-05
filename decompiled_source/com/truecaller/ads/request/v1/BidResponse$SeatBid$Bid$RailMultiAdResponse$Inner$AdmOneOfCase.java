package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$RailMultiAdResponse$Inner$AdmOneOfCase {
    ADM_BANNER(3),
    ADM_NATIVE(4),
    ADM_NATIVE_IMAGE(5),
    ADM_VIDEO(6),
    ADM_NATIVE_VIDEO(7),
    ADM_ANIMATED_ICON(8),
    ADM_VAST(9),
    ADMONEOF_NOT_SET(0);

    private final int value;

    BidResponse$SeatBid$Bid$RailMultiAdResponse$Inner$AdmOneOfCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$RailMultiAdResponse$Inner$AdmOneOfCase forNumber(int i) {
        if (i != 0) {
            switch (i) {
                case 3:
                    return ADM_BANNER;
                case 4:
                    return ADM_NATIVE;
                case 5:
                    return ADM_NATIVE_IMAGE;
                case 6:
                    return ADM_VIDEO;
                case 7:
                    return ADM_NATIVE_VIDEO;
                case 8:
                    return ADM_ANIMATED_ICON;
                case 9:
                    return ADM_VAST;
                default:
                    return null;
            }
        }
        return ADMONEOF_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$RailMultiAdResponse$Inner$AdmOneOfCase valueOf(int i) {
        return forNumber(i);
    }
}
