package com.truecaller.google_login;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/google_login/GoogleProfileData;", "", "idToken", "", "id", "firstName", "lastName", "email", "photoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdToken", "()Ljava/lang/String;", "getId", "getFirstName", "getLastName", "getEmail", "getPhotoUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "google-login_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class GoogleProfileData {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String email;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstName;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String idToken;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastName;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String photoUrl;

    public GoogleProfileData(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "idToken");
        this.idToken = str;
        this.id = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.email = str5;
        this.photoUrl = str6;
    }

    public static /* synthetic */ com.truecaller.google_login.GoogleProfileData copy$default(com.truecaller.google_login.GoogleProfileData googleProfileData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = googleProfileData.idToken;
        }
        if ((i & 2) != 0) {
            str2 = googleProfileData.id;
        }
        if ((i & 4) != 0) {
            str3 = googleProfileData.firstName;
        }
        if ((i & 8) != 0) {
            str4 = googleProfileData.lastName;
        }
        if ((i & 16) != 0) {
            str5 = googleProfileData.email;
        }
        if ((i & 32) != 0) {
            str6 = googleProfileData.photoUrl;
        }
        java.lang.String str7 = str5;
        java.lang.String str8 = str6;
        return googleProfileData.copy(str, str2, str3, str4, str7, str8);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIdToken() {
        return this.idToken;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPhotoUrl() {
        return this.photoUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.google_login.GoogleProfileData copy(@org.jetbrains.annotations.NotNull java.lang.String idToken, @org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String firstName, @org.jetbrains.annotations.Nullable java.lang.String lastName, @org.jetbrains.annotations.Nullable java.lang.String email, @org.jetbrains.annotations.Nullable java.lang.String photoUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idToken, "idToken");
        return new com.truecaller.google_login.GoogleProfileData(idToken, id, firstName, lastName, email, photoUrl);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.google_login.GoogleProfileData)) {
            return false;
        }
        com.truecaller.google_login.GoogleProfileData googleProfileData = (com.truecaller.google_login.GoogleProfileData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.idToken, googleProfileData.idToken) && kotlin.jvm.internal.Intrinsics.b(this.id, googleProfileData.id) && kotlin.jvm.internal.Intrinsics.b(this.firstName, googleProfileData.firstName) && kotlin.jvm.internal.Intrinsics.b(this.lastName, googleProfileData.lastName) && kotlin.jvm.internal.Intrinsics.b(this.email, googleProfileData.email) && kotlin.jvm.internal.Intrinsics.b(this.photoUrl, googleProfileData.photoUrl);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdToken() {
        return this.idToken;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        int hashCode = this.idToken.hashCode() * 31;
        java.lang.String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.lastName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.email;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.photoUrl;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.idToken;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.firstName;
        java.lang.String str4 = this.lastName;
        java.lang.String str5 = this.email;
        java.lang.String str6 = this.photoUrl;
        java.lang.StringBuilder E = ro0.f.E("GoogleProfileData(idToken=", str, ", id=", str2, ", firstName=");
        bar.E(E, str3, ", lastName=", str4, ", email=");
        return bar.x(E, str5, ", photoUrl=", str6, ")");
    }

    public /* synthetic */ GoogleProfileData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
