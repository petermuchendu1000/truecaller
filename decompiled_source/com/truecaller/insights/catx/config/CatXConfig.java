package com.truecaller.insights.catx.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006%"}, d2 = {"Lcom/truecaller/insights/catx/config/CatXConfig;", "", "Lcom/truecaller/insights/catx/config/SenderMeta;", "senderMeta", "Lcom/truecaller/insights/catx/config/ThresholdData;", "thresholdData", "Lat1/e;", "Lcom/truecaller/data/entity/Contact;", "contact", "<init>", "(Lcom/truecaller/insights/catx/config/SenderMeta;Lcom/truecaller/insights/catx/config/ThresholdData;Lat1/e;)V", "component1", "()Lcom/truecaller/insights/catx/config/SenderMeta;", "component2", "()Lcom/truecaller/insights/catx/config/ThresholdData;", "component3", "()Lat1/e;", "copy", "(Lcom/truecaller/insights/catx/config/SenderMeta;Lcom/truecaller/insights/catx/config/ThresholdData;Lat1/e;)Lcom/truecaller/insights/catx/config/CatXConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/insights/catx/config/SenderMeta;", "getSenderMeta", "Lcom/truecaller/insights/catx/config/ThresholdData;", "getThresholdData", "Lat1/e;", "getContact", "Companion", "ls1/bar", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CatXConfig {

    @org.jetbrains.annotations.NotNull
    public static final ls1.bar Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final com.truecaller.insights.catx.config.CatXConfig DEFAULT = new com.truecaller.insights.catx.config.CatXConfig(null, null, null, 7, null);

    @org.jetbrains.annotations.NotNull
    private final at1.e contact;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.catx.config.SenderMeta senderMeta;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.catx.config.ThresholdData thresholdData;

    public CatXConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.truecaller.insights.catx.config.CatXConfig copy$default(com.truecaller.insights.catx.config.CatXConfig catXConfig, com.truecaller.insights.catx.config.SenderMeta senderMeta, com.truecaller.insights.catx.config.ThresholdData thresholdData, at1.e eVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            senderMeta = catXConfig.senderMeta;
        }
        if ((i & 2) != 0) {
            thresholdData = catXConfig.thresholdData;
        }
        if ((i & 4) != 0) {
            eVar = catXConfig.contact;
        }
        return catXConfig.copy(senderMeta, thresholdData, eVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.insights.catx.config.SenderMeta getSenderMeta() {
        return this.senderMeta;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.insights.catx.config.ThresholdData getThresholdData() {
        return this.thresholdData;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final at1.e getContact() {
        return this.contact;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.catx.config.CatXConfig copy(@org.jetbrains.annotations.NotNull com.truecaller.insights.catx.config.SenderMeta senderMeta, @org.jetbrains.annotations.NotNull com.truecaller.insights.catx.config.ThresholdData thresholdData, @org.jetbrains.annotations.NotNull at1.e contact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderMeta, "senderMeta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdData, "thresholdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        return new com.truecaller.insights.catx.config.CatXConfig(senderMeta, thresholdData, contact);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.catx.config.CatXConfig)) {
            return false;
        }
        com.truecaller.insights.catx.config.CatXConfig catXConfig = (com.truecaller.insights.catx.config.CatXConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.senderMeta, catXConfig.senderMeta) && kotlin.jvm.internal.Intrinsics.b(this.thresholdData, catXConfig.thresholdData) && kotlin.jvm.internal.Intrinsics.b(this.contact, catXConfig.contact);
    }

    @org.jetbrains.annotations.NotNull
    public final at1.e getContact() {
        return this.contact;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.catx.config.SenderMeta getSenderMeta() {
        return this.senderMeta;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.catx.config.ThresholdData getThresholdData() {
        return this.thresholdData;
    }

    public int hashCode() {
        return this.contact.hashCode() + ((this.thresholdData.hashCode() + (this.senderMeta.hashCode() * 31)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CatXConfig(senderMeta=" + this.senderMeta + ", thresholdData=" + this.thresholdData + ", contact=" + this.contact + ")";
    }

    public CatXConfig(@org.jetbrains.annotations.NotNull com.truecaller.insights.catx.config.SenderMeta senderMeta, @org.jetbrains.annotations.NotNull com.truecaller.insights.catx.config.ThresholdData thresholdData, @org.jetbrains.annotations.NotNull at1.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderMeta, "senderMeta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdData, "thresholdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "contact");
        this.senderMeta = senderMeta;
        this.thresholdData = thresholdData;
        this.contact = eVar;
    }

    public /* synthetic */ CatXConfig(com.truecaller.insights.catx.config.SenderMeta senderMeta, com.truecaller.insights.catx.config.ThresholdData thresholdData, at1.e eVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.truecaller.insights.catx.config.SenderMeta(0.0f, 0.0f, false, false, false, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null) : senderMeta, (i & 2) != 0 ? new com.truecaller.insights.catx.config.ThresholdData(0.0f, 0.0f, 0.0f, 0.0f, false, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, 0L, 0L, 0, 0, 1048575, (kotlin.jvm.internal.DefaultConstructorMarker) null) : thresholdData, (i & 4) != 0 ? at1.b.a : eVar);
    }
}
