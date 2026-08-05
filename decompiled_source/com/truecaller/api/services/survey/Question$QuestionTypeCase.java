package com.truecaller.api.services.survey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Question$QuestionTypeCase {
    BOOL(4),
    RATING(5),
    SINGLE_ANSWER(6),
    MULTI_ANSWER(7),
    FREE_TEXT(8),
    CONFIRMATION(9),
    DYNAMIC_SINGLE_ANSWER(10),
    SPAM_CATEGORIES(11),
    RATING_AND_REVIEW(12),
    QUESTIONTYPE_NOT_SET(0);

    private final int value;

    Question$QuestionTypeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.survey.Question$QuestionTypeCase forNumber(int i) {
        if (i != 0) {
            switch (i) {
                case 4:
                    return BOOL;
                case 5:
                    return RATING;
                case 6:
                    return SINGLE_ANSWER;
                case 7:
                    return MULTI_ANSWER;
                case 8:
                    return FREE_TEXT;
                case 9:
                    return CONFIRMATION;
                case 10:
                    return DYNAMIC_SINGLE_ANSWER;
                case 11:
                    return SPAM_CATEGORIES;
                case 12:
                    return RATING_AND_REVIEW;
                default:
                    return null;
            }
        }
        return QUESTIONTYPE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.survey.Question$QuestionTypeCase valueOf(int i) {
        return forNumber(i);
    }
}
