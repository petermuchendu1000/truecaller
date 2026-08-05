package com.truecaller.search;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class KeyedContactDto {
    public java.util.List<com.truecaller.search.KeyedContactDto.KeyedContact> data = new java.util.ArrayList();

    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static class KeyedContact {
        public java.lang.String key;
        public com.truecaller.search.ContactDto.Contact value;

        public java.lang.String toString() {
            return "KeyedContact{value=" + this.value + '}';
        }
    }

    public java.lang.String toString() {
        return wi0.bar.t(new java.lang.StringBuilder("KeyedContactDto{data="), this.data, '}');
    }
}
