package com.truecaller.insights.database.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003Ji\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lcom/truecaller/insights/database/models/SenderBlockList;", "", "grammar", "", "senderList", "", "country", "blockedUpdatesCategoryList", "Lcom/truecaller/insights/database/models/BlockedCategoryList;", "blockedParserCategoryList", "blockedAllCategoryList", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGrammar", "()Ljava/lang/String;", "getSenderList", "()Ljava/util/List;", "getCountry", "getBlockedUpdatesCategoryList", "getBlockedParserCategoryList", "getBlockedAllCategoryList", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderBlockList {

    @bw.qux("all_blacklist")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> blockedAllCategoryList;

    @bw.qux("parser_blacklist")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> blockedParserCategoryList;

    @bw.qux("updates_blacklist")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> blockedUpdatesCategoryList;

    @bw.qux("country")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country;

    @bw.qux("grm")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String grammar;

    @bw.qux("blocked_senders")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> senderList;

    public SenderBlockList(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> list2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> list3, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list4) {
        this.grammar = str;
        this.senderList = list;
        this.country = str2;
        this.blockedUpdatesCategoryList = list2;
        this.blockedParserCategoryList = list3;
        this.blockedAllCategoryList = list4;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.SenderBlockList copy$default(com.truecaller.insights.database.models.SenderBlockList senderBlockList, java.lang.String str, java.util.List list, java.lang.String str2, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = senderBlockList.grammar;
        }
        if ((i & 2) != 0) {
            list = senderBlockList.senderList;
        }
        if ((i & 4) != 0) {
            str2 = senderBlockList.country;
        }
        if ((i & 8) != 0) {
            list2 = senderBlockList.blockedUpdatesCategoryList;
        }
        if ((i & 16) != 0) {
            list3 = senderBlockList.blockedParserCategoryList;
        }
        if ((i & 32) != 0) {
            list4 = senderBlockList.blockedAllCategoryList;
        }
        java.util.List list5 = list3;
        java.util.List list6 = list4;
        return senderBlockList.copy(str, list, str2, list2, list5, list6);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getGrammar() {
        return this.grammar;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return this.senderList;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> component4() {
        return this.blockedUpdatesCategoryList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> component5() {
        return this.blockedParserCategoryList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component6() {
        return this.blockedAllCategoryList;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.SenderBlockList copy(@org.jetbrains.annotations.Nullable java.lang.String grammar, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> senderList, @org.jetbrains.annotations.Nullable java.lang.String country, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> blockedUpdatesCategoryList, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> blockedParserCategoryList, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> blockedAllCategoryList) {
        return new com.truecaller.insights.database.models.SenderBlockList(grammar, senderList, country, blockedUpdatesCategoryList, blockedParserCategoryList, blockedAllCategoryList);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.SenderBlockList)) {
            return false;
        }
        com.truecaller.insights.database.models.SenderBlockList senderBlockList = (com.truecaller.insights.database.models.SenderBlockList) other;
        return kotlin.jvm.internal.Intrinsics.b(this.grammar, senderBlockList.grammar) && kotlin.jvm.internal.Intrinsics.b(this.senderList, senderBlockList.senderList) && kotlin.jvm.internal.Intrinsics.b(this.country, senderBlockList.country) && kotlin.jvm.internal.Intrinsics.b(this.blockedUpdatesCategoryList, senderBlockList.blockedUpdatesCategoryList) && kotlin.jvm.internal.Intrinsics.b(this.blockedParserCategoryList, senderBlockList.blockedParserCategoryList) && kotlin.jvm.internal.Intrinsics.b(this.blockedAllCategoryList, senderBlockList.blockedAllCategoryList);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getBlockedAllCategoryList() {
        return this.blockedAllCategoryList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> getBlockedParserCategoryList() {
        return this.blockedParserCategoryList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> getBlockedUpdatesCategoryList() {
        return this.blockedUpdatesCategoryList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return this.country;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGrammar() {
        return this.grammar;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getSenderList() {
        return this.senderList;
    }

    public int hashCode() {
        java.lang.String str = this.grammar;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.senderList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.String str2 = this.country;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> list2 = this.blockedUpdatesCategoryList;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> list3 = this.blockedParserCategoryList;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        java.util.List<java.lang.String> list4 = this.blockedAllCategoryList;
        return hashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.grammar;
        java.util.List<java.lang.String> list = this.senderList;
        java.lang.String str2 = this.country;
        java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> list2 = this.blockedUpdatesCategoryList;
        java.util.List<com.truecaller.insights.database.models.BlockedCategoryList> list3 = this.blockedParserCategoryList;
        java.util.List<java.lang.String> list4 = this.blockedAllCategoryList;
        java.lang.StringBuilder r = com.appsflyer.internal.e.r("SenderBlockList(grammar=", str, ", senderList=", list, ", country=");
        f63.qux.w(str2, ", blockedUpdatesCategoryList=", ", blockedParserCategoryList=", r, list2);
        r.append(list3);
        r.append(", blockedAllCategoryList=");
        r.append(list4);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ SenderBlockList(java.lang.String str, java.util.List list, java.lang.String str2, java.util.List list2, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4);
    }
}
