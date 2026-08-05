package com.truecaller.ads.configmanagement.datastore;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/configmanagement/datastore/ConfigSetting;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "schema", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "value", "version", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getSchema", "()Ljava/lang/String;", "getType", "getValue", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ConfigSetting {
    public static final int $stable = 0;
    private final int id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String schema;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    private final int version;

    public ConfigSetting(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "schema");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "value");
        this.id = i;
        this.schema = str;
        this.type = str2;
        this.value = str3;
        this.version = i2;
    }

    public static /* synthetic */ com.truecaller.ads.configmanagement.datastore.ConfigSetting copy$default(com.truecaller.ads.configmanagement.datastore.ConfigSetting configSetting, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = configSetting.id;
        }
        if ((i3 & 2) != 0) {
            str = configSetting.schema;
        }
        if ((i3 & 4) != 0) {
            str2 = configSetting.type;
        }
        if ((i3 & 8) != 0) {
            str3 = configSetting.value;
        }
        if ((i3 & 16) != 0) {
            i2 = configSetting.version;
        }
        int i4 = i2;
        java.lang.String str4 = str2;
        return configSetting.copy(i, str, str4, str3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSchema() {
        return this.schema;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.datastore.ConfigSetting copy(int id, @org.jetbrains.annotations.NotNull java.lang.String schema, @org.jetbrains.annotations.NotNull java.lang.String type, @org.jetbrains.annotations.NotNull java.lang.String value, int version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schema, "schema");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.ads.configmanagement.datastore.ConfigSetting(id, schema, type, value, version);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.configmanagement.datastore.ConfigSetting)) {
            return false;
        }
        com.truecaller.ads.configmanagement.datastore.ConfigSetting configSetting = (com.truecaller.ads.configmanagement.datastore.ConfigSetting) other;
        return this.id == configSetting.id && kotlin.jvm.internal.Intrinsics.b(this.schema, configSetting.schema) && kotlin.jvm.internal.Intrinsics.b(this.type, configSetting.type) && kotlin.jvm.internal.Intrinsics.b(this.value, configSetting.value) && this.version == configSetting.version;
    }

    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSchema() {
        return this.schema;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.schema), 31, this.type), 31, this.value) + this.version;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        java.lang.String str = this.schema;
        java.lang.String str2 = this.type;
        java.lang.String str3 = this.value;
        int i2 = this.version;
        java.lang.StringBuilder r = qb.qux.r("ConfigSetting(id=", i, ", schema=", str, ", type=");
        bar.E(r, str2, ", value=", str3, ", version=");
        return bar.m(i2, ")", r);
    }
}
