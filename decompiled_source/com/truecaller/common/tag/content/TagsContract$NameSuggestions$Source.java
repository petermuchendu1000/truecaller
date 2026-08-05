package com.truecaller.common.tag.content;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public enum TagsContract$NameSuggestions$Source {
    MOBILE_CLIENT(1),
    SURVEY(7),
    CONTACT_EDITOR(10);

    private final int value;

    TagsContract$NameSuggestions$Source(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
