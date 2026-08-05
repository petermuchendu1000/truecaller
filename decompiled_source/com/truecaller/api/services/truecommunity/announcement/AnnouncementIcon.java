package com.truecaller.api.services.truecommunity.announcement;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AnnouncementIcon implements com.google.protobuf.Internal.EnumLite {
    INFO(0),
    CELEBRATION(1),
    TRANSLATE(2),
    TIPS_AND_UPDATES(3),
    AUTO_AWESOME(4),
    FORUM(5),
    NOTIFICATIONS_ACTIVE(6),
    ANNOUNCEMENT(7),
    ROCKET_LAUNCH(8),
    PRIVACY_TIP(9),
    PEOPLE(10),
    EMOJI_PEOPLE(11),
    TUNE(12),
    INSERT_EMOTICON(13),
    SECURITY(14),
    UNRECOGNIZED(-1);

    public static final int ANNOUNCEMENT_VALUE = 7;
    public static final int AUTO_AWESOME_VALUE = 4;
    public static final int CELEBRATION_VALUE = 1;
    public static final int EMOJI_PEOPLE_VALUE = 11;
    public static final int FORUM_VALUE = 5;
    public static final int INFO_VALUE = 0;
    public static final int INSERT_EMOTICON_VALUE = 13;
    public static final int NOTIFICATIONS_ACTIVE_VALUE = 6;
    public static final int PEOPLE_VALUE = 10;
    public static final int PRIVACY_TIP_VALUE = 9;
    public static final int ROCKET_LAUNCH_VALUE = 8;
    public static final int SECURITY_VALUE = 14;
    public static final int TIPS_AND_UPDATES_VALUE = 3;
    public static final int TRANSLATE_VALUE = 2;
    public static final int TUNE_VALUE = 12;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.announcement.AnnouncementIcon> internalValueMap = new java.lang.Object();
    private final int value;

    AnnouncementIcon(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.announcement.AnnouncementIcon forNumber(int i) {
        switch (i) {
            case 0:
                return INFO;
            case 1:
                return CELEBRATION;
            case 2:
                return TRANSLATE;
            case 3:
                return TIPS_AND_UPDATES;
            case 4:
                return AUTO_AWESOME;
            case 5:
                return FORUM;
            case 6:
                return NOTIFICATIONS_ACTIVE;
            case 7:
                return ANNOUNCEMENT;
            case 8:
                return ROCKET_LAUNCH;
            case 9:
                return PRIVACY_TIP;
            case 10:
                return PEOPLE;
            case 11:
                return EMOJI_PEOPLE;
            case 12:
                return TUNE;
            case 13:
                return INSERT_EMOTICON;
            case 14:
                return SECURITY;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.announcement.AnnouncementIcon> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ef0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.announcement.AnnouncementIcon valueOf(int i) {
        return forNumber(i);
    }
}
