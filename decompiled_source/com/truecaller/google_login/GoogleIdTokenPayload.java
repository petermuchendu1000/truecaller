package com.truecaller.google_login;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/truecaller/google_login/GoogleIdTokenPayload;", "", "sub", "", "email", "picture", "given_name", "family_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSub", "()Ljava/lang/String;", "getEmail", "getPicture", "getGiven_name", "getFamily_name", "google-login_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
final class GoogleIdTokenPayload {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String email;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String family_name;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String given_name;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String picture;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String sub;

    public GoogleIdTokenPayload() {
        this(null, null, null, null, null, 31, null);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFamily_name() {
        return this.family_name;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGiven_name() {
        return this.given_name;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPicture() {
        return this.picture;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSub() {
        return this.sub;
    }

    public GoogleIdTokenPayload(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        this.sub = str;
        this.email = str2;
        this.picture = str3;
        this.given_name = str4;
        this.family_name = str5;
    }

    public /* synthetic */ GoogleIdTokenPayload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
