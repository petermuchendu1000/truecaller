package com.truecaller.bizmon.callMeBack.db.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J \u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0016HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-¨\u0006B"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/db/entity/BizCallMeBackRecord;", "", "requestId", "", "cmbId", "businessNumber", "receiverNumber", "callId", "slots", "", "Lcom/truecaller/bizmon/callMeBack/db/entity/BizSlot;", "scheduledSlot", "Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;", "dayTimeSlot", "Lcom/truecaller/bizmon/callMeBack/db/entity/BizDayTimeSlot;", "expiry", "", "operationalTimeSlots", "Lcom/truecaller/bizmon/callMeBack/db/entity/BizOperationalTimeSlot;", "secondaryCta", "Lcom/truecaller/bizmon/callMeBack/db/entity/BizSecondaryCta;", "maxSlotDays", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;Lcom/truecaller/bizmon/callMeBack/db/entity/BizDayTimeSlot;JLjava/util/List;Lcom/truecaller/bizmon/callMeBack/db/entity/BizSecondaryCta;Ljava/lang/Integer;)V", "getRequestId", "()Ljava/lang/String;", "getCmbId", "getBusinessNumber", "getReceiverNumber", "getCallId", "getSlots", "()Ljava/util/List;", "getScheduledSlot", "()Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;", "setScheduledSlot", "(Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;)V", "getDayTimeSlot", "()Lcom/truecaller/bizmon/callMeBack/db/entity/BizDayTimeSlot;", "getExpiry", "()J", "getOperationalTimeSlots", "getSecondaryCta", "()Lcom/truecaller/bizmon/callMeBack/db/entity/BizSecondaryCta;", "getMaxSlotDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;Lcom/truecaller/bizmon/callMeBack/db/entity/BizDayTimeSlot;JLjava/util/List;Lcom/truecaller/bizmon/callMeBack/db/entity/BizSecondaryCta;Ljava/lang/Integer;)Lcom/truecaller/bizmon/callMeBack/db/entity/BizCallMeBackRecord;", "equals", "", "other", "hashCode", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizCallMeBackRecord {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String businessNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String callId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String cmbId;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot dayTimeSlot;
    private final long expiry;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer maxSlotDays;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> operationalTimeSlots;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String receiverNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    @org.jetbrains.annotations.Nullable
    private com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot scheduledSlot;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta secondaryCta;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> slots;

    public BizCallMeBackRecord(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> list, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot, long j, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> list2, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta bizSecondaryCta, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "cmbId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "businessNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "callId");
        this.requestId = str;
        this.cmbId = str2;
        this.businessNumber = str3;
        this.receiverNumber = str4;
        this.callId = str5;
        this.slots = list;
        this.scheduledSlot = bizScheduledSlot;
        this.dayTimeSlot = bizDayTimeSlot;
        this.expiry = j;
        this.operationalTimeSlots = list2;
        this.secondaryCta = bizSecondaryCta;
        this.maxSlotDays = num;
    }

    public static /* synthetic */ com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord copy$default(com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord bizCallMeBackRecord, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot, com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot, long j, java.util.List list2, com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta bizSecondaryCta, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bizCallMeBackRecord.requestId;
        }
        return bizCallMeBackRecord.copy(str, (i & 2) != 0 ? bizCallMeBackRecord.cmbId : str2, (i & 4) != 0 ? bizCallMeBackRecord.businessNumber : str3, (i & 8) != 0 ? bizCallMeBackRecord.receiverNumber : str4, (i & 16) != 0 ? bizCallMeBackRecord.callId : str5, (i & 32) != 0 ? bizCallMeBackRecord.slots : list, (i & 64) != 0 ? bizCallMeBackRecord.scheduledSlot : bizScheduledSlot, (i & 128) != 0 ? bizCallMeBackRecord.dayTimeSlot : bizDayTimeSlot, (i & 256) != 0 ? bizCallMeBackRecord.expiry : j, (i & 512) != 0 ? bizCallMeBackRecord.operationalTimeSlots : list2, (i & 1024) != 0 ? bizCallMeBackRecord.secondaryCta : bizSecondaryCta, (i & 2048) != 0 ? bizCallMeBackRecord.maxSlotDays : num);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> component10() {
        return this.operationalTimeSlots;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component11, reason: from getter */
    public final com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta getSecondaryCta() {
        return this.secondaryCta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component12, reason: from getter */
    public final java.lang.Integer getMaxSlotDays() {
        return this.maxSlotDays;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCmbId() {
        return this.cmbId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBusinessNumber() {
        return this.businessNumber;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getReceiverNumber() {
        return this.receiverNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> component6() {
        return this.slots;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component7, reason: from getter */
    public final com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot getScheduledSlot() {
        return this.scheduledSlot;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component8, reason: from getter */
    public final com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot getDayTimeSlot() {
        return this.dayTimeSlot;
    }

    /* renamed from: component9, reason: from getter */
    public final long getExpiry() {
        return this.expiry;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord copy(@org.jetbrains.annotations.NotNull java.lang.String requestId, @org.jetbrains.annotations.NotNull java.lang.String cmbId, @org.jetbrains.annotations.NotNull java.lang.String businessNumber, @org.jetbrains.annotations.Nullable java.lang.String receiverNumber, @org.jetbrains.annotations.NotNull java.lang.String callId, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> slots, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot scheduledSlot, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot dayTimeSlot, long expiry, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> operationalTimeSlots, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta secondaryCta, @org.jetbrains.annotations.Nullable java.lang.Integer maxSlotDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cmbId, "cmbId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessNumber, "businessNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        return new com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord(requestId, cmbId, businessNumber, receiverNumber, callId, slots, scheduledSlot, dayTimeSlot, expiry, operationalTimeSlots, secondaryCta, maxSlotDays);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord)) {
            return false;
        }
        com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord bizCallMeBackRecord = (com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord) other;
        return kotlin.jvm.internal.Intrinsics.b(this.requestId, bizCallMeBackRecord.requestId) && kotlin.jvm.internal.Intrinsics.b(this.cmbId, bizCallMeBackRecord.cmbId) && kotlin.jvm.internal.Intrinsics.b(this.businessNumber, bizCallMeBackRecord.businessNumber) && kotlin.jvm.internal.Intrinsics.b(this.receiverNumber, bizCallMeBackRecord.receiverNumber) && kotlin.jvm.internal.Intrinsics.b(this.callId, bizCallMeBackRecord.callId) && kotlin.jvm.internal.Intrinsics.b(this.slots, bizCallMeBackRecord.slots) && kotlin.jvm.internal.Intrinsics.b(this.scheduledSlot, bizCallMeBackRecord.scheduledSlot) && kotlin.jvm.internal.Intrinsics.b(this.dayTimeSlot, bizCallMeBackRecord.dayTimeSlot) && this.expiry == bizCallMeBackRecord.expiry && kotlin.jvm.internal.Intrinsics.b(this.operationalTimeSlots, bizCallMeBackRecord.operationalTimeSlots) && kotlin.jvm.internal.Intrinsics.b(this.secondaryCta, bizCallMeBackRecord.secondaryCta) && kotlin.jvm.internal.Intrinsics.b(this.maxSlotDays, bizCallMeBackRecord.maxSlotDays);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBusinessNumber() {
        return this.businessNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCmbId() {
        return this.cmbId;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot getDayTimeSlot() {
        return this.dayTimeSlot;
    }

    public final long getExpiry() {
        return this.expiry;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMaxSlotDays() {
        return this.maxSlotDays;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> getOperationalTimeSlots() {
        return this.operationalTimeSlots;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReceiverNumber() {
        return this.receiverNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot getScheduledSlot() {
        return this.scheduledSlot;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta getSecondaryCta() {
        return this.secondaryCta;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> getSlots() {
        return this.slots;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int e = ax1.bar.e(ax1.bar.e(this.requestId.hashCode() * 31, 31, this.cmbId), 31, this.businessNumber);
        java.lang.String str = this.receiverNumber;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e2 = ax1.bar.e((e + hashCode) * 31, 31, this.callId);
        java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> list = this.slots;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i2 = (e2 + hashCode2) * 31;
        com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot = this.scheduledSlot;
        if (bizScheduledSlot == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bizScheduledSlot.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot = this.dayTimeSlot;
        if (bizDayTimeSlot == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bizDayTimeSlot.hashCode();
        }
        long j = this.expiry;
        int i4 = (((i3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> list2 = this.operationalTimeSlots;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta bizSecondaryCta = this.secondaryCta;
        if (bizSecondaryCta == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bizSecondaryCta.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        java.lang.Integer num = this.maxSlotDays;
        if (num != null) {
            i = num.hashCode();
        }
        return i6 + i;
    }

    public final void setScheduledSlot(@org.jetbrains.annotations.Nullable com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot) {
        this.scheduledSlot = bizScheduledSlot;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.requestId;
        java.lang.String str2 = this.cmbId;
        java.lang.String str3 = this.businessNumber;
        java.lang.String str4 = this.receiverNumber;
        java.lang.String str5 = this.callId;
        java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizSlot> list = this.slots;
        com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot = this.scheduledSlot;
        com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot = this.dayTimeSlot;
        long j = this.expiry;
        java.util.List<com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot> list2 = this.operationalTimeSlots;
        com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta bizSecondaryCta = this.secondaryCta;
        java.lang.Integer num = this.maxSlotDays;
        java.lang.StringBuilder E = ro0.f.E("BizCallMeBackRecord(requestId=", str, ", cmbId=", str2, ", businessNumber=");
        bar.E(E, str3, ", receiverNumber=", str4, ", callId=");
        f63.qux.w(str5, ", slots=", ", scheduledSlot=", E, list);
        E.append(bizScheduledSlot);
        E.append(", dayTimeSlot=");
        E.append(bizDayTimeSlot);
        E.append(", expiry=");
        E.append(j);
        E.append(", operationalTimeSlots=");
        E.append(list2);
        E.append(", secondaryCta=");
        E.append(bizSecondaryCta);
        E.append(", maxSlotDays=");
        E.append(num);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ BizCallMeBackRecord(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot, com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot, long j, java.util.List list2, com.truecaller.bizmon.callMeBack.db.entity.BizSecondaryCta bizSecondaryCta, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bizScheduledSlot, (i & 128) != 0 ? null : bizDayTimeSlot, (i & 256) != 0 ? 0L : j, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : bizSecondaryCta, (i & 2048) != 0 ? null : num);
    }
}
