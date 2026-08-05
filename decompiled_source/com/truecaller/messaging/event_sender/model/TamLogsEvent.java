package com.truecaller.messaging.event_sender.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006$"}, d2 = {"Lcom/truecaller/messaging/event_sender/model/TamLogsEvent;", "Lcom/truecaller/messaging/event_sender/model/Event;", "permissions", "", "settingsFlags", "apiLevel", "appVersion", "", "deviceManufacturer", "deviceModel", "rom", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPermissions", "()I", "getSettingsFlags", "getApiLevel", "getAppVersion", "()Ljava/lang/String;", "getDeviceManufacturer", "getDeviceModel", "getRom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "messaging-event-sender_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class TamLogsEvent extends com.truecaller.messaging.event_sender.model.Event {

    @bw.qux("apiLevel")
    private final int apiLevel;

    @bw.qux("appVersion")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String appVersion;

    @bw.qux("deviceManufacturer")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String deviceManufacturer;

    @bw.qux("deviceModel")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String deviceModel;

    @bw.qux("permissions")
    private final int permissions;

    @bw.qux("rom")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rom;

    @bw.qux("settingsFlags")
    private final int settingsFlags;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TamLogsEvent(int i, int i2, int i3, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "deviceManufacturer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "deviceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "rom");
        this.permissions = i;
        this.settingsFlags = i2;
        this.apiLevel = i3;
        this.appVersion = str;
        this.deviceManufacturer = str2;
        this.deviceModel = str3;
        this.rom = str4;
    }

    public static /* synthetic */ com.truecaller.messaging.event_sender.model.TamLogsEvent copy$default(com.truecaller.messaging.event_sender.model.TamLogsEvent tamLogsEvent, int i, int i2, int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = tamLogsEvent.permissions;
        }
        if ((i4 & 2) != 0) {
            i2 = tamLogsEvent.settingsFlags;
        }
        if ((i4 & 4) != 0) {
            i3 = tamLogsEvent.apiLevel;
        }
        if ((i4 & 8) != 0) {
            str = tamLogsEvent.appVersion;
        }
        if ((i4 & 16) != 0) {
            str2 = tamLogsEvent.deviceManufacturer;
        }
        if ((i4 & 32) != 0) {
            str3 = tamLogsEvent.deviceModel;
        }
        if ((i4 & 64) != 0) {
            str4 = tamLogsEvent.rom;
        }
        java.lang.String str5 = str3;
        java.lang.String str6 = str4;
        java.lang.String str7 = str2;
        int i5 = i3;
        return tamLogsEvent.copy(i, i2, i5, str, str7, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPermissions() {
        return this.permissions;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSettingsFlags() {
        return this.settingsFlags;
    }

    /* renamed from: component3, reason: from getter */
    public final int getApiLevel() {
        return this.apiLevel;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.lang.String getRom() {
        return this.rom;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.event_sender.model.TamLogsEvent copy(int permissions, int settingsFlags, int apiLevel, @org.jetbrains.annotations.NotNull java.lang.String appVersion, @org.jetbrains.annotations.NotNull java.lang.String deviceManufacturer, @org.jetbrains.annotations.NotNull java.lang.String deviceModel, @org.jetbrains.annotations.NotNull java.lang.String rom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rom, "rom");
        return new com.truecaller.messaging.event_sender.model.TamLogsEvent(permissions, settingsFlags, apiLevel, appVersion, deviceManufacturer, deviceModel, rom);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.event_sender.model.TamLogsEvent)) {
            return false;
        }
        com.truecaller.messaging.event_sender.model.TamLogsEvent tamLogsEvent = (com.truecaller.messaging.event_sender.model.TamLogsEvent) other;
        return this.permissions == tamLogsEvent.permissions && this.settingsFlags == tamLogsEvent.settingsFlags && this.apiLevel == tamLogsEvent.apiLevel && kotlin.jvm.internal.Intrinsics.b(this.appVersion, tamLogsEvent.appVersion) && kotlin.jvm.internal.Intrinsics.b(this.deviceManufacturer, tamLogsEvent.deviceManufacturer) && kotlin.jvm.internal.Intrinsics.b(this.deviceModel, tamLogsEvent.deviceModel) && kotlin.jvm.internal.Intrinsics.b(this.rom, tamLogsEvent.rom);
    }

    public final int getApiLevel() {
        return this.apiLevel;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    public final int getPermissions() {
        return this.permissions;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRom() {
        return this.rom;
    }

    public final int getSettingsFlags() {
        return this.settingsFlags;
    }

    public int hashCode() {
        return this.rom.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(((((this.permissions * 31) + this.settingsFlags) * 31) + this.apiLevel) * 31, 31, this.appVersion), 31, this.deviceManufacturer), 31, this.deviceModel);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.permissions;
        int i2 = this.settingsFlags;
        int i3 = this.apiLevel;
        java.lang.String str = this.appVersion;
        java.lang.String str2 = this.deviceManufacturer;
        java.lang.String str3 = this.deviceModel;
        java.lang.String str4 = this.rom;
        java.lang.StringBuilder e = z0.a0.e(i, i2, "TamLogsEvent(permissions=", ", settingsFlags=", ", apiLevel=");
        uf.qux.q(i3, ", appVersion=", str, ", deviceManufacturer=", e);
        bar.E(e, str2, ", deviceModel=", str3, ", rom=");
        return bar.v(str4, ")", e);
    }
}
