package com.truecaller.call_assistant.campaigns.data.db.banners;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/data/db/banners/DynamicRuleEntity;", "", "", "key", "operator", "Lcom/google/gson/o;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/o;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/google/gson/o;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/o;)Lcom/truecaller/call_assistant/campaigns/data/db/banners/DynamicRuleEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getOperator", "Lcom/google/gson/o;", "getValue", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DynamicRuleEntity {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String operator;

    @org.jetbrains.annotations.NotNull
    private final com.google.gson.o value;

    public DynamicRuleEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.google.gson.o oVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "operator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "value");
        this.key = str;
        this.operator = str2;
        this.value = oVar;
    }

    public static /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity copy$default(com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity dynamicRuleEntity, java.lang.String str, java.lang.String str2, com.google.gson.o oVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dynamicRuleEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = dynamicRuleEntity.operator;
        }
        if ((i & 4) != 0) {
            oVar = dynamicRuleEntity.value;
        }
        return dynamicRuleEntity.copy(str, str2, oVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOperator() {
        return this.operator;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.google.gson.o getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity copy(@org.jetbrains.annotations.NotNull java.lang.String key, @org.jetbrains.annotations.NotNull java.lang.String operator, @org.jetbrains.annotations.NotNull com.google.gson.o value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operator, "operator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity(key, operator, value);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity dynamicRuleEntity = (com.truecaller.call_assistant.campaigns.data.db.banners.DynamicRuleEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.key, dynamicRuleEntity.key) && kotlin.jvm.internal.Intrinsics.b(this.operator, dynamicRuleEntity.operator) && kotlin.jvm.internal.Intrinsics.b(this.value, dynamicRuleEntity.value);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperator() {
        return this.operator;
    }

    @org.jetbrains.annotations.NotNull
    public final com.google.gson.o getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ax1.bar.e(this.key.hashCode() * 31, 31, this.operator);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.key;
        java.lang.String str2 = this.operator;
        com.google.gson.o oVar = this.value;
        java.lang.StringBuilder E = ro0.f.E("DynamicRuleEntity(key=", str, ", operator=", str2, ", value=");
        E.append(oVar);
        E.append(")");
        return E.toString();
    }
}
