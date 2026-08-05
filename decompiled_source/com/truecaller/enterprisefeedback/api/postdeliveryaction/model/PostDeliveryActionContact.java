package com.truecaller.enterprisefeedback.api.postdeliveryaction.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostDeliveryActionContact;", "", "contactId", "", "displayName", "", "businessPhoneNumber", "contactType", "Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostDeliveryActionContactType;", "screen", "Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostCallDeliveryActionScreen;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostDeliveryActionContactType;Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostCallDeliveryActionScreen;)V", "getContactId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDisplayName", "()Ljava/lang/String;", "getBusinessPhoneNumber", "getContactType", "()Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostDeliveryActionContactType;", "getScreen", "()Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostCallDeliveryActionScreen;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostDeliveryActionContactType;Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostCallDeliveryActionScreen;)Lcom/truecaller/enterprisefeedback/api/postdeliveryaction/model/PostDeliveryActionContact;", "equals", "", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PostDeliveryActionContact {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String businessPhoneNumber;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long contactId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContactType contactType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String displayName;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen screen;

    public PostDeliveryActionContact(@org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContactType postDeliveryActionContactType, @org.jetbrains.annotations.NotNull com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen postCallDeliveryActionScreen) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postDeliveryActionContactType, "contactType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postCallDeliveryActionScreen, "screen");
        this.contactId = l;
        this.displayName = str;
        this.businessPhoneNumber = str2;
        this.contactType = postDeliveryActionContactType;
        this.screen = postCallDeliveryActionScreen;
    }

    public static /* synthetic */ com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact copy$default(com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact postDeliveryActionContact, java.lang.Long l, java.lang.String str, java.lang.String str2, com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContactType postDeliveryActionContactType, com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen postCallDeliveryActionScreen, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = postDeliveryActionContact.contactId;
        }
        if ((i & 2) != 0) {
            str = postDeliveryActionContact.displayName;
        }
        if ((i & 4) != 0) {
            str2 = postDeliveryActionContact.businessPhoneNumber;
        }
        if ((i & 8) != 0) {
            postDeliveryActionContactType = postDeliveryActionContact.contactType;
        }
        if ((i & 16) != 0) {
            postCallDeliveryActionScreen = postDeliveryActionContact.screen;
        }
        com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen postCallDeliveryActionScreen2 = postCallDeliveryActionScreen;
        java.lang.String str3 = str2;
        return postDeliveryActionContact.copy(l, str, str3, postDeliveryActionContactType, postCallDeliveryActionScreen2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getContactId() {
        return this.contactId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContactType getContactType() {
        return this.contactType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen getScreen() {
        return this.screen;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact copy(@org.jetbrains.annotations.Nullable java.lang.Long contactId, @org.jetbrains.annotations.NotNull java.lang.String displayName, @org.jetbrains.annotations.Nullable java.lang.String businessPhoneNumber, @org.jetbrains.annotations.NotNull com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContactType contactType, @org.jetbrains.annotations.NotNull com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen screen) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactType, "contactType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screen, "screen");
        return new com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact(contactId, displayName, businessPhoneNumber, contactType, screen);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact)) {
            return false;
        }
        com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact postDeliveryActionContact = (com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContact) other;
        return kotlin.jvm.internal.Intrinsics.b(this.contactId, postDeliveryActionContact.contactId) && kotlin.jvm.internal.Intrinsics.b(this.displayName, postDeliveryActionContact.displayName) && kotlin.jvm.internal.Intrinsics.b(this.businessPhoneNumber, postDeliveryActionContact.businessPhoneNumber) && this.contactType == postDeliveryActionContact.contactType && this.screen == postDeliveryActionContact.screen;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getContactId() {
        return this.contactId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostDeliveryActionContactType getContactType() {
        return this.contactType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.enterprisefeedback.api.postdeliveryaction.model.PostCallDeliveryActionScreen getScreen() {
        return this.screen;
    }

    public int hashCode() {
        int hashCode;
        java.lang.Long l = this.contactId;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int e = ax1.bar.e(hashCode * 31, 31, this.displayName);
        java.lang.String str = this.businessPhoneNumber;
        if (str != null) {
            i = str.hashCode();
        }
        return this.screen.hashCode() + ((this.contactType.hashCode() + ((e + i) * 31)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "PostDeliveryActionContact(contactId=" + this.contactId + ", displayName=" + this.displayName + ", businessPhoneNumber=" + this.businessPhoneNumber + ", contactType=" + this.contactType + ", screen=" + this.screen + ")";
    }
}
