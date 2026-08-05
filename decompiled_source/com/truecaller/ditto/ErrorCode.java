package com.truecaller.ditto;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum ErrorCode {
    ERROR_100("EC_100 : token pattern not followed"),
    ERROR_200("EC_200 : No proper value before the delimiter"),
    ERROR_201("EC_201 : No proper value before the delimiter"),
    ERROR_202("EC_202 : No proper value before the delimiter"),
    ERROR_203("EC_203 : No proper value for the token"),
    ERROR_204("EC_204 : No proper value for the token"),
    ERROR_205("EC_205 : No proper value for the token"),
    ERROR_206("EC_206 : No proper value for the token"),
    ERROR_207("EC_207 : No proper value for the token"),
    ERROR_208("EC_208 : No proper value for the token"),
    ERROR_209("EC_209 : No proper value for the token"),
    ERROR_210("EC_210 : No proper value for the token"),
    ERROR_211("EC_211 : No proper value for the token"),
    ERROR_300("EC_300 : SIOOB exception"),
    ERROR_400("EC_400 : AIOOB exception"),
    ERROR_500("EC_500 : Null pointer exception"),
    ERROR_600("EC_600 : Pattern not present in the trie");

    private final java.lang.String errorMessage;

    ErrorCode(java.lang.String str) {
        this.errorMessage = str;
    }

    public java.lang.String getMessage() {
        return this.errorMessage;
    }
}
