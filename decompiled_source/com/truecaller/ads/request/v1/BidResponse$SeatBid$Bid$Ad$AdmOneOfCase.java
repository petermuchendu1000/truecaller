package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$Ad$AdmOneOfCase {
    ADM_BANNER(3),
    ADM_NATIVE(4),
    ADM_SUGGESTED(5),
    ADM_NATIVE_IMAGE(6),
    ADM_VIDEO(7),
    ADM_NATIVE_VIDEO(8),
    ADM_CAROUSEL(9),
    ADM_BUBBLE(10),
    ADM_RAIL(11),
    ADM_ANIMATED_ICON(12),
    ADM_PREMIUM(13),
    ADM_VAST(14),
    ADM_FLOATER(15),
    ADM_BUBBLE_CAROUSEL(16),
    ADM_RAIL_MULTI_AD(17),
    ADM_GAM(18),
    ADMONEOF_NOT_SET(0);

    private final int value;

    BidResponse$SeatBid$Bid$Ad$AdmOneOfCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$Ad$AdmOneOfCase forNumber(int i) {
        if (i != 0) {
            switch (i) {
                case 3:
                    return ADM_BANNER;
                case 4:
                    return ADM_NATIVE;
                case 5:
                    return ADM_SUGGESTED;
                case 6:
                    return ADM_NATIVE_IMAGE;
                case 7:
                    return ADM_VIDEO;
                case 8:
                    return ADM_NATIVE_VIDEO;
                case 9:
                    return ADM_CAROUSEL;
                case 10:
                    return ADM_BUBBLE;
                case 11:
                    return ADM_RAIL;
                case 12:
                    return ADM_ANIMATED_ICON;
                case 13:
                    return ADM_PREMIUM;
                case 14:
                    return ADM_VAST;
                case 15:
                    return ADM_FLOATER;
                case 16:
                    return ADM_BUBBLE_CAROUSEL;
                case 17:
                    return ADM_RAIL_MULTI_AD;
                case 18:
                    return ADM_GAM;
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
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$Ad$AdmOneOfCase valueOf(int i) {
        return forNumber(i);
    }
}
