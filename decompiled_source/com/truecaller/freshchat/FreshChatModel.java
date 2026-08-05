package com.truecaller.freshchat;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/freshchat/FreshChatModel;", "", "id", "", "key", "domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKey", "getDomain", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class FreshChatModel {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    public FreshChatModel(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "domain");
        this.id = str;
        this.key = str2;
        this.domain = str3;
    }

    public static /* synthetic */ com.truecaller.freshchat.FreshChatModel copy$default(com.truecaller.freshchat.FreshChatModel freshChatModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = freshChatModel.id;
        }
        if ((i & 2) != 0) {
            str2 = freshChatModel.key;
        }
        if ((i & 4) != 0) {
            str3 = freshChatModel.domain;
        }
        return freshChatModel.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.freshchat.FreshChatModel copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String key, @org.jetbrains.annotations.NotNull java.lang.String domain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        return new com.truecaller.freshchat.FreshChatModel(id, key, domain);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.freshchat.FreshChatModel)) {
            return false;
        }
        com.truecaller.freshchat.FreshChatModel freshChatModel = (com.truecaller.freshchat.FreshChatModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, freshChatModel.id) && kotlin.jvm.internal.Intrinsics.b(this.key, freshChatModel.key) && kotlin.jvm.internal.Intrinsics.b(this.domain, freshChatModel.domain);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.domain.hashCode() + ax1.bar.e(this.id.hashCode() * 31, 31, this.key);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.domain, ")", ro0.f.E("FreshChatModel(id=", this.id, ", key=", this.key, ", domain="));
    }
}
