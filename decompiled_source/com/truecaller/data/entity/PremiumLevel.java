package com.truecaller.data.entity;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum PremiumLevel {
    NONE("None"),
    REGULAR("Regular"),
    GOLD("Gold");

    private final java.lang.String level;

    PremiumLevel(java.lang.String str) {
        this.level = str;
    }

    @androidx.annotation.NonNull
    public static com.truecaller.data.entity.PremiumLevel fromRemote(@androidx.annotation.NonNull java.lang.String str) {
        for (com.truecaller.data.entity.PremiumLevel premiumLevel : values()) {
            if (jj3.bar.f(str, premiumLevel.level)) {
                return premiumLevel;
            }
        }
        return NONE;
    }

    @androidx.annotation.NonNull
    public java.lang.String getLevel() {
        return this.level;
    }
}
