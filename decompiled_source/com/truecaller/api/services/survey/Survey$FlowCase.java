package com.truecaller.api.services.survey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Survey$FlowCase {
    ACS_GENERIC(3),
    ACS_NAME_SUGGESTION(4),
    REPORT_PROFILE(5),
    ACS_BIZMON(6),
    DETAILS_VIEW(8),
    DETAILS_VIEW_NAME_SUGGESTION(9),
    ACS_NAME_QUALITY_FEEDBACK(10),
    DETAILS_VIEW_NAME_QUALITY_FEEDBACK(11),
    ACS_POSITIVE_RESPONSE_NAME_SUGGESTION(13),
    DETAILS_VIEW_POSITIVE_RESPONSE_NAME_SUGGESTION(14),
    MESSAGE_ID_GENERIC(15),
    BLOCK_SPAM_CATEGORIES(16),
    BLOCK_NAME_SUGGESTION(17),
    BLOCK_COMMENTS(18),
    BLOCK_DYNAMIC_NAME_SURVEY(19),
    BLOCK_NAME_QUALITY_FEEDBACK(20),
    BLOCK_DYNAMIC_COMMENT(21),
    BLOCK_TOP_COMMENT(22),
    RATINGS_AND_REVIEWS(23),
    FLOW_NOT_SET(0);

    private final int value;

    Survey$FlowCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.survey.Survey$FlowCase forNumber(int i) {
        switch (i) {
            case 0:
                return FLOW_NOT_SET;
            case 1:
            case 2:
            case 7:
            case 12:
            default:
                return null;
            case 3:
                return ACS_GENERIC;
            case 4:
                return ACS_NAME_SUGGESTION;
            case 5:
                return REPORT_PROFILE;
            case 6:
                return ACS_BIZMON;
            case 8:
                return DETAILS_VIEW;
            case 9:
                return DETAILS_VIEW_NAME_SUGGESTION;
            case 10:
                return ACS_NAME_QUALITY_FEEDBACK;
            case 11:
                return DETAILS_VIEW_NAME_QUALITY_FEEDBACK;
            case 13:
                return ACS_POSITIVE_RESPONSE_NAME_SUGGESTION;
            case 14:
                return DETAILS_VIEW_POSITIVE_RESPONSE_NAME_SUGGESTION;
            case 15:
                return MESSAGE_ID_GENERIC;
            case 16:
                return BLOCK_SPAM_CATEGORIES;
            case 17:
                return BLOCK_NAME_SUGGESTION;
            case 18:
                return BLOCK_COMMENTS;
            case 19:
                return BLOCK_DYNAMIC_NAME_SURVEY;
            case 20:
                return BLOCK_NAME_QUALITY_FEEDBACK;
            case 21:
                return BLOCK_DYNAMIC_COMMENT;
            case 22:
                return BLOCK_TOP_COMMENT;
            case 23:
                return RATINGS_AND_REVIEWS;
        }
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.survey.Survey$FlowCase valueOf(int i) {
        return forNumber(i);
    }
}
