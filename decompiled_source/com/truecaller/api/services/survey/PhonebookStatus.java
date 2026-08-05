package com.truecaller.api.services.survey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum PhonebookStatus implements com.google.protobuf.Internal.EnumLite {
    BOTH(0),
    SHOW_IF_IN_PHONEBOOK(1),
    SHOW_IF_NOT_IN_PHONEBOOK(2),
    UNRECOGNIZED(-1);

    public static final int BOTH_VALUE = 0;
    public static final int SHOW_IF_IN_PHONEBOOK_VALUE = 1;
    public static final int SHOW_IF_NOT_IN_PHONEBOOK_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.survey.PhonebookStatus> internalValueMap = new java.lang.Object();
    private final int value;

    PhonebookStatus(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.survey.PhonebookStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SHOW_IF_NOT_IN_PHONEBOOK;
            }
            return SHOW_IF_IN_PHONEBOOK;
        }
        return BOTH;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.survey.PhonebookStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return bf0.d2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.survey.PhonebookStatus valueOf(int i) {
        return forNumber(i);
    }
}
