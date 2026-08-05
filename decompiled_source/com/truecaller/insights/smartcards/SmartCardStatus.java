package com.truecaller.insights.smartcards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b7\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:¨\u0006;"}, d2 = {"Lcom/truecaller/insights/smartcards/SmartCardStatus;", "", "", "key", "", "label", "color", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "I", "getLabel", "()I", "getColor", "Companion", "ex1/h0", "DeliveryConfirmed", "DeliveryPacked", "DeliveryShipped", "DeliveryArrivingSoon", "DeliveryArrivingToday", "DeliveryArrivingTomorrow", "DeliveryArrivingEarly", "DeliveryDelayInArrival", "DeliveryDelivered", "DeliveryCancelled", "DeliveryReturnPickup", "DeliveryReturnFailed", "DeliveryExchange", "DeliveryPickupComplete", "DeliveryReadyForPickup", "DeliveryNotDelivered", "BillPaid", "BillRecharged", "BillOverdue", "BillDue", "BillDueToday", "Travelled", "TravelConfirmed", "TravelCancelled", "TravelRescheduled", "TravelDelayed", "TravelGateChange", "TravelGateInfo", "OtpDelivery", "UpdateChequeStatus", "UpdateTransactionSuccess", "UpdateTransactionPending", "UpdateTransactionProcessing", "UpdatePaymentReceived", "UpdateTransactionFailed", "UpdateLoanApproved", "UpdateLoanDue", "UpdateLoanOverdue", "UpdateLoanClosed", "UpdateBeneficiaryCredited", "UpdateTransactionTransfer", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmartCardStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.smartcards.SmartCardStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ex1.h0 Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.smartcards.SmartCardStatus> map;
    private final int color;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    private final int label;
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryConfirmed = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryConfirmed", 0, "Confirmed", 2132020349, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryPacked = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryPacked", 1, "Packed", 2132020356, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryShipped = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryShipped", 2, "Shipped", 2132020361, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryArrivingSoon = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryArrivingSoon", 3, "Arriving soon", 2132020345, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryArrivingToday = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryArrivingToday", 4, "Arriving today", 2132020346, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryArrivingTomorrow = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryArrivingTomorrow", 5, "Arriving tomorrow", 2132020347, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryArrivingEarly = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryArrivingEarly", 6, "Arriving early", 2132020344, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryDelayInArrival = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryDelayInArrival", 7, "Delay in arrival", 2132020350, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryDelivered = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryDelivered", 8, "Delivered", 2132020351, 2130970321);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryCancelled = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryCancelled", 9, "Cancelled", 2132020348, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryReturnPickup = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryReturnPickup", 10, "Return pickup", 2132020360, 2130970318);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryReturnFailed = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryReturnFailed", 11, "Return failed", 2132020359, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryExchange = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryExchange", 12, "Exchange", 2132020352, 2130970318);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryPickupComplete = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryPickupComplete", 13, "Pickup complete", 2132020357, 2130970321);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryReadyForPickup = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryReadyForPickup", 14, "Ready for pickup", 2132020358, 2130970318);
    public static final com.truecaller.insights.smartcards.SmartCardStatus DeliveryNotDelivered = new com.truecaller.insights.smartcards.SmartCardStatus("DeliveryNotDelivered", 15, "Not delivered", 2132020355, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus BillPaid = new com.truecaller.insights.smartcards.SmartCardStatus("BillPaid", 16, "Paid", 2132019587, 2130970321);
    public static final com.truecaller.insights.smartcards.SmartCardStatus BillRecharged = new com.truecaller.insights.smartcards.SmartCardStatus("BillRecharged", 17, "Recharged", 2132019588, 2130970321);
    public static final com.truecaller.insights.smartcards.SmartCardStatus BillOverdue = new com.truecaller.insights.smartcards.SmartCardStatus("BillOverdue", 18, "Overdue", 2132019586, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus BillDue = new com.truecaller.insights.smartcards.SmartCardStatus("BillDue", 19, "Due", 2132019578, 2130970318);
    public static final com.truecaller.insights.smartcards.SmartCardStatus BillDueToday = new com.truecaller.insights.smartcards.SmartCardStatus("BillDueToday", 20, "Due today", 2132019579, 2130970318);
    public static final com.truecaller.insights.smartcards.SmartCardStatus Travelled = new com.truecaller.insights.smartcards.SmartCardStatus("Travelled", 21, "Travelled", 2132023551, 2130970321);
    public static final com.truecaller.insights.smartcards.SmartCardStatus TravelConfirmed = new com.truecaller.insights.smartcards.SmartCardStatus("TravelConfirmed", 22, "Confirmed", 2132023520, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus TravelCancelled = new com.truecaller.insights.smartcards.SmartCardStatus("TravelCancelled", 23, "Cancelled", 2132023516, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus TravelRescheduled = new com.truecaller.insights.smartcards.SmartCardStatus("TravelRescheduled", 24, "Rescheduled", 2132023538, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus TravelDelayed = new com.truecaller.insights.smartcards.SmartCardStatus("TravelDelayed", 25, "Delayed", 2132023523, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus TravelGateChange = new com.truecaller.insights.smartcards.SmartCardStatus("TravelGateChange", 26, "Gate change", 2132023524, 2130970319);
    public static final com.truecaller.insights.smartcards.SmartCardStatus TravelGateInfo = new com.truecaller.insights.smartcards.SmartCardStatus("TravelGateInfo", 27, "Gate information", 2132023525, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus OtpDelivery = new com.truecaller.insights.smartcards.SmartCardStatus("OtpDelivery", 28, "Delivery", 2132022318, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateChequeStatus = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateChequeStatus", 29, "Cheque status", 2132023597, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateTransactionSuccess = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateTransactionSuccess", 30, "Success", 2132023611, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateTransactionPending = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateTransactionPending", 31, "Pending", 2132023609, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateTransactionProcessing = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateTransactionProcessing", 32, "Processing", 2132023610, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdatePaymentReceived = new com.truecaller.insights.smartcards.SmartCardStatus("UpdatePaymentReceived", 33, "Payment received", 2132023607, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateTransactionFailed = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateTransactionFailed", 34, "Failed", 2132023608, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateLoanApproved = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateLoanApproved", 35, "Approved", 2132023598, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateLoanDue = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateLoanDue", 36, "Due", 2132023600, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateLoanOverdue = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateLoanOverdue", 37, "Overdue", 2132023601, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateLoanClosed = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateLoanClosed", 38, "Closed", 2132023599, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateBeneficiaryCredited = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateBeneficiaryCredited", 39, "Beneficiary credited", 2132023596, 2130970320);
    public static final com.truecaller.insights.smartcards.SmartCardStatus UpdateTransactionTransfer = new com.truecaller.insights.smartcards.SmartCardStatus("UpdateTransactionTransfer", 40, "Transfer", 2132023612, 2130970320);

    private static final /* synthetic */ com.truecaller.insights.smartcards.SmartCardStatus[] $values() {
        return new com.truecaller.insights.smartcards.SmartCardStatus[]{DeliveryConfirmed, DeliveryPacked, DeliveryShipped, DeliveryArrivingSoon, DeliveryArrivingToday, DeliveryArrivingTomorrow, DeliveryArrivingEarly, DeliveryDelayInArrival, DeliveryDelivered, DeliveryCancelled, DeliveryReturnPickup, DeliveryReturnFailed, DeliveryExchange, DeliveryPickupComplete, DeliveryReadyForPickup, DeliveryNotDelivered, BillPaid, BillRecharged, BillOverdue, BillDue, BillDueToday, Travelled, TravelConfirmed, TravelCancelled, TravelRescheduled, TravelDelayed, TravelGateChange, TravelGateInfo, OtpDelivery, UpdateChequeStatus, UpdateTransactionSuccess, UpdateTransactionPending, UpdateTransactionProcessing, UpdatePaymentReceived, UpdateTransactionFailed, UpdateLoanApproved, UpdateLoanDue, UpdateLoanOverdue, UpdateLoanClosed, UpdateBeneficiaryCredited, UpdateTransactionTransfer};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ex1.h0, java.lang.Object] */
    static {
        com.truecaller.insights.smartcards.SmartCardStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.smartcards.SmartCardStatus[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (com.truecaller.insights.smartcards.SmartCardStatus smartCardStatus : values) {
            java.lang.String str = smartCardStatus.key;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            linkedHashMap.put(ax1.bar.r(locale, "ENGLISH", str, locale, "toLowerCase(...)"), smartCardStatus);
        }
        map = linkedHashMap;
    }

    private SmartCardStatus(java.lang.String str, int i, java.lang.String str2, int i2, int i3) {
        this.key = str2;
        this.label = i2;
        this.color = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.smartcards.SmartCardStatus valueOf(java.lang.String str) {
        return (com.truecaller.insights.smartcards.SmartCardStatus) java.lang.Enum.valueOf(com.truecaller.insights.smartcards.SmartCardStatus.class, str);
    }

    public static com.truecaller.insights.smartcards.SmartCardStatus[] values() {
        return (com.truecaller.insights.smartcards.SmartCardStatus[]) $VALUES.clone();
    }

    public final int getColor() {
        return this.color;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    public final int getLabel() {
        return this.label;
    }
}
