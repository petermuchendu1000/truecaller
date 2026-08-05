package com.truecaller.ads.caching.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/truecaller/ads/caching/model/Conditions;", "", "property", "", "Lcom/truecaller/ads/caching/model/Property;", "actions", "Lcom/truecaller/ads/caching/model/Actions;", "<init>", "(Ljava/util/List;Lcom/truecaller/ads/caching/model/Actions;)V", "getProperty", "()Ljava/util/List;", "getActions", "()Lcom/truecaller/ads/caching/model/Actions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Conditions {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.caching.model.Actions actions;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.caching.model.Property> property;

    public Conditions(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Property> list, @org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.Actions actions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "property");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "actions");
        this.property = list;
        this.actions = actions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.caching.model.Conditions copy$default(com.truecaller.ads.caching.model.Conditions conditions, java.util.List list, com.truecaller.ads.caching.model.Actions actions, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = conditions.property;
        }
        if ((i & 2) != 0) {
            actions = conditions.actions;
        }
        return conditions.copy(list, actions);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Property> component1() {
        return this.property;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.caching.model.Actions getActions() {
        return this.actions;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.Conditions copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Property> property, @org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.Actions actions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "actions");
        return new com.truecaller.ads.caching.model.Conditions(property, actions);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.caching.model.Conditions)) {
            return false;
        }
        com.truecaller.ads.caching.model.Conditions conditions = (com.truecaller.ads.caching.model.Conditions) other;
        return kotlin.jvm.internal.Intrinsics.b(this.property, conditions.property) && kotlin.jvm.internal.Intrinsics.b(this.actions, conditions.actions);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.Actions getActions() {
        return this.actions;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Property> getProperty() {
        return this.property;
    }

    public int hashCode() {
        return this.actions.hashCode() + (this.property.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "Conditions(property=" + this.property + ", actions=" + this.actions + ")";
    }

    public Conditions(java.util.List list, com.truecaller.ads.caching.model.Actions actions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.h0.a : list, actions);
    }
}
