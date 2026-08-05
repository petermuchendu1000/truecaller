package com.truecaller.api.services.bizsurvey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Question$QuestionTypeCase {
    RATING(4),
    SINGLE_ANSWER(5),
    MULTI_ANSWER(6),
    FREE_TEXT(7),
    SINGLE_ANSWER_LIST(8),
    QUESTIONTYPE_NOT_SET(0);

    private final int value;

    Question$QuestionTypeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.bizsurvey.Question$QuestionTypeCase forNumber(int i) {
        if (i != 0) {
            switch (i) {
                case 4:
                    return RATING;
                case 5:
                    return SINGLE_ANSWER;
                case 6:
                    return MULTI_ANSWER;
                case 7:
                    return FREE_TEXT;
                case 8:
                    return SINGLE_ANSWER_LIST;
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
    public static com.truecaller.api.services.bizsurvey.Question$QuestionTypeCase valueOf(int i) {
        return forNumber(i);
    }
}
