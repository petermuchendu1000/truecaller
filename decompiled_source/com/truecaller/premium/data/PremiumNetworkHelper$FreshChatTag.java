package com.truecaller.premium.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"com/truecaller/premium/data/PremiumNetworkHelper$FreshChatTag", "", "", "", "tags", "topic", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "Lcom/truecaller/premium/data/PremiumNetworkHelper$FreshChatTag;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/truecaller/premium/data/PremiumNetworkHelper$FreshChatTag;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTags", "Ljava/lang/String;", "getTopic", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PremiumNetworkHelper$FreshChatTag {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> tags;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String topic;

    public PremiumNetworkHelper$FreshChatTag(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.tags = list;
        this.topic = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag copy$default(com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag premiumNetworkHelper$FreshChatTag, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = premiumNetworkHelper$FreshChatTag.tags;
        }
        if ((i & 2) != 0) {
            str = premiumNetworkHelper$FreshChatTag.topic;
        }
        return premiumNetworkHelper$FreshChatTag.copy(list, str);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component1() {
        return this.tags;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTopic() {
        return this.topic;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag copy(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable java.lang.String topic) {
        return new com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag(tags, topic);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag)) {
            return false;
        }
        com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag premiumNetworkHelper$FreshChatTag = (com.truecaller.premium.data.PremiumNetworkHelper$FreshChatTag) other;
        return kotlin.jvm.internal.Intrinsics.b(this.tags, premiumNetworkHelper$FreshChatTag.tags) && kotlin.jvm.internal.Intrinsics.b(this.topic, premiumNetworkHelper$FreshChatTag.topic);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getTags() {
        return this.tags;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.tags;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.String str = this.topic;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "FreshChatTag(tags=" + this.tags + ", topic=" + this.topic + ")";
    }
}
