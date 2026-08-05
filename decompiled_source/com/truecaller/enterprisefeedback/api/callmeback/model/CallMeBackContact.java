package com.truecaller.enterprisefeedback.api.callmeback.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JD\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006\""}, d2 = {"Lcom/truecaller/enterprisefeedback/api/callmeback/model/CallMeBackContact;", "", "contactId", "", "displayName", "", "businessPhoneNumber", "contactType", "Lcom/truecaller/enterprisefeedback/api/callmeback/model/CallMeBackContactType;", "isFromCmbNotificationClick", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/enterprisefeedback/api/callmeback/model/CallMeBackContactType;Z)V", "getContactId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDisplayName", "()Ljava/lang/String;", "getBusinessPhoneNumber", "getContactType", "()Lcom/truecaller/enterprisefeedback/api/callmeback/model/CallMeBackContactType;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/enterprisefeedback/api/callmeback/model/CallMeBackContactType;Z)Lcom/truecaller/enterprisefeedback/api/callmeback/model/CallMeBackContact;", "equals", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CallMeBackContact {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String businessPhoneNumber;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long contactId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType contactType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String displayName;
    private final boolean isFromCmbNotificationClick;

    public CallMeBackContact(@org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType callMeBackContactType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callMeBackContactType, "contactType");
        this.contactId = l;
        this.displayName = str;
        this.businessPhoneNumber = str2;
        this.contactType = callMeBackContactType;
        this.isFromCmbNotificationClick = z;
    }

    public static /* synthetic */ com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact copy$default(com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact callMeBackContact, java.lang.Long l, java.lang.String str, java.lang.String str2, com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType callMeBackContactType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = callMeBackContact.contactId;
        }
        if ((i & 2) != 0) {
            str = callMeBackContact.displayName;
        }
        if ((i & 4) != 0) {
            str2 = callMeBackContact.businessPhoneNumber;
        }
        if ((i & 8) != 0) {
            callMeBackContactType = callMeBackContact.contactType;
        }
        if ((i & 16) != 0) {
            z = callMeBackContact.isFromCmbNotificationClick;
        }
        boolean z2 = z;
        java.lang.String str3 = str2;
        return callMeBackContact.copy(l, str, str3, callMeBackContactType, z2);
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
    public final com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType getContactType() {
        return this.contactType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFromCmbNotificationClick() {
        return this.isFromCmbNotificationClick;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact copy(@org.jetbrains.annotations.Nullable java.lang.Long contactId, @org.jetbrains.annotations.NotNull java.lang.String displayName, @org.jetbrains.annotations.Nullable java.lang.String businessPhoneNumber, @org.jetbrains.annotations.NotNull com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType contactType, boolean isFromCmbNotificationClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactType, "contactType");
        return new com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact(contactId, displayName, businessPhoneNumber, contactType, isFromCmbNotificationClick);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact)) {
            return false;
        }
        com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact callMeBackContact = (com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContact) other;
        return kotlin.jvm.internal.Intrinsics.b(this.contactId, callMeBackContact.contactId) && kotlin.jvm.internal.Intrinsics.b(this.displayName, callMeBackContact.displayName) && kotlin.jvm.internal.Intrinsics.b(this.businessPhoneNumber, callMeBackContact.businessPhoneNumber) && this.contactType == callMeBackContact.contactType && this.isFromCmbNotificationClick == callMeBackContact.isFromCmbNotificationClick;
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
    public final com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType getContactType() {
        return this.contactType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        int hashCode;
        int i;
        java.lang.Long l = this.contactId;
        int i2 = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int e = ax1.bar.e(hashCode * 31, 31, this.displayName);
        java.lang.String str = this.businessPhoneNumber;
        if (str != null) {
            i2 = str.hashCode();
        }
        int hashCode2 = (this.contactType.hashCode() + ((e + i2) * 31)) * 31;
        if (this.isFromCmbNotificationClick) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode2 + i;
    }

    public final boolean isFromCmbNotificationClick() {
        return this.isFromCmbNotificationClick;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.Long l = this.contactId;
        java.lang.String str = this.displayName;
        java.lang.String str2 = this.businessPhoneNumber;
        com.truecaller.enterprisefeedback.api.callmeback.model.CallMeBackContactType callMeBackContactType = this.contactType;
        boolean z = this.isFromCmbNotificationClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallMeBackContact(contactId=");
        sb.append(l);
        sb.append(", displayName=");
        sb.append(str);
        sb.append(", businessPhoneNumber=");
        sb.append(str2);
        sb.append(", contactType=");
        sb.append(callMeBackContactType);
        sb.append(", isFromCmbNotificationClick=");
        return h8.s0.s(sb, z, ")");
    }
}
