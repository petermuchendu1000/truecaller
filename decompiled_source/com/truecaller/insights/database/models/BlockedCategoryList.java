package com.truecaller.insights.database.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/database/models/BlockedCategoryList;", "", "category", "", "senderList", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getSenderList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class BlockedCategoryList {

    @bw.qux("category")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String category;

    @bw.qux("senders")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> senderList;

    public BlockedCategoryList(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        this.category = str;
        this.senderList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.database.models.BlockedCategoryList copy$default(com.truecaller.insights.database.models.BlockedCategoryList blockedCategoryList, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = blockedCategoryList.category;
        }
        if ((i & 2) != 0) {
            list = blockedCategoryList.senderList;
        }
        return blockedCategoryList.copy(str, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return this.senderList;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.BlockedCategoryList copy(@org.jetbrains.annotations.Nullable java.lang.String category, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> senderList) {
        return new com.truecaller.insights.database.models.BlockedCategoryList(category, senderList);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.BlockedCategoryList)) {
            return false;
        }
        com.truecaller.insights.database.models.BlockedCategoryList blockedCategoryList = (com.truecaller.insights.database.models.BlockedCategoryList) other;
        return kotlin.jvm.internal.Intrinsics.b(this.category, blockedCategoryList.category) && kotlin.jvm.internal.Intrinsics.b(this.senderList, blockedCategoryList.senderList);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getSenderList() {
        return this.senderList;
    }

    public int hashCode() {
        java.lang.String str = this.category;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.senderList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("BlockedCategoryList(category=", this.category, ", senderList=", this.senderList, ")");
    }
}
