package com.truecaller.premium.data.familysharing;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/truecaller/premium/data/familysharing/FamilyMemberResponse;", "", "members", "", "Lcom/truecaller/premium/data/familysharing/FamilyMember;", "activeMembers", "", "numberOfEditsAllowed", "numberOfEditsLeft", "currentUserTcId", "", "<init>", "(Ljava/util/List;IIILjava/lang/String;)V", "getMembers", "()Ljava/util/List;", "getActiveMembers", "()I", "getNumberOfEditsAllowed", "getNumberOfEditsLeft", "getCurrentUserTcId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class FamilyMemberResponse {
    public static final int $stable = 8;
    private final int activeMembers;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String currentUserTcId;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.premium.data.familysharing.FamilyMember> members;
    private final int numberOfEditsAllowed;
    private final int numberOfEditsLeft;

    public FamilyMemberResponse(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.premium.data.familysharing.FamilyMember> list, int i, int i2, int i3, @org.jetbrains.annotations.Nullable java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "members");
        this.members = list;
        this.activeMembers = i;
        this.numberOfEditsAllowed = i2;
        this.numberOfEditsLeft = i3;
        this.currentUserTcId = str;
    }

    public static /* synthetic */ com.truecaller.premium.data.familysharing.FamilyMemberResponse copy$default(com.truecaller.premium.data.familysharing.FamilyMemberResponse familyMemberResponse, java.util.List list, int i, int i2, int i3, java.lang.String str, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            list = familyMemberResponse.members;
        }
        if ((i4 & 2) != 0) {
            i = familyMemberResponse.activeMembers;
        }
        if ((i4 & 4) != 0) {
            i2 = familyMemberResponse.numberOfEditsAllowed;
        }
        if ((i4 & 8) != 0) {
            i3 = familyMemberResponse.numberOfEditsLeft;
        }
        if ((i4 & 16) != 0) {
            str = familyMemberResponse.currentUserTcId;
        }
        java.lang.String str2 = str;
        int i5 = i2;
        return familyMemberResponse.copy(list, i, i5, i3, str2);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.premium.data.familysharing.FamilyMember> component1() {
        return this.members;
    }

    /* renamed from: component2, reason: from getter */
    public final int getActiveMembers() {
        return this.activeMembers;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumberOfEditsAllowed() {
        return this.numberOfEditsAllowed;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNumberOfEditsLeft() {
        return this.numberOfEditsLeft;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCurrentUserTcId() {
        return this.currentUserTcId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.familysharing.FamilyMemberResponse copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.premium.data.familysharing.FamilyMember> members, int activeMembers, int numberOfEditsAllowed, int numberOfEditsLeft, @org.jetbrains.annotations.Nullable java.lang.String currentUserTcId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(members, "members");
        return new com.truecaller.premium.data.familysharing.FamilyMemberResponse(members, activeMembers, numberOfEditsAllowed, numberOfEditsLeft, currentUserTcId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.familysharing.FamilyMemberResponse)) {
            return false;
        }
        com.truecaller.premium.data.familysharing.FamilyMemberResponse familyMemberResponse = (com.truecaller.premium.data.familysharing.FamilyMemberResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.members, familyMemberResponse.members) && this.activeMembers == familyMemberResponse.activeMembers && this.numberOfEditsAllowed == familyMemberResponse.numberOfEditsAllowed && this.numberOfEditsLeft == familyMemberResponse.numberOfEditsLeft && kotlin.jvm.internal.Intrinsics.b(this.currentUserTcId, familyMemberResponse.currentUserTcId);
    }

    public final int getActiveMembers() {
        return this.activeMembers;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCurrentUserTcId() {
        return this.currentUserTcId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.premium.data.familysharing.FamilyMember> getMembers() {
        return this.members;
    }

    public final int getNumberOfEditsAllowed() {
        return this.numberOfEditsAllowed;
    }

    public final int getNumberOfEditsLeft() {
        return this.numberOfEditsLeft;
    }

    public int hashCode() {
        int hashCode = ((((((this.members.hashCode() * 31) + this.activeMembers) * 31) + this.numberOfEditsAllowed) * 31) + this.numberOfEditsLeft) * 31;
        java.lang.String str = this.currentUserTcId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<com.truecaller.premium.data.familysharing.FamilyMember> list = this.members;
        int i = this.activeMembers;
        int i2 = this.numberOfEditsAllowed;
        int i3 = this.numberOfEditsLeft;
        java.lang.String str = this.currentUserTcId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FamilyMemberResponse(members=");
        sb.append(list);
        sb.append(", activeMembers=");
        sb.append(i);
        sb.append(", numberOfEditsAllowed=");
        os0.bar.A(i2, i3, ", numberOfEditsLeft=", ", currentUserTcId=", sb);
        return bar.v(str, ")", sb);
    }
}
