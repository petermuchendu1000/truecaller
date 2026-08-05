package com.truecaller.bizmon.businessWidgetView;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB7\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0006\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig;", "Landroid/os/Parcelable;", "contact", "Lcom/truecaller/data/entity/Contact;", "normalizedNumber", "", "isPacs", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "rejected", "<init>", "(Lcom/truecaller/data/entity/Contact;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getContact", "()Lcom/truecaller/data/entity/Contact;", "getNormalizedNumber", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRejected", "BizViewAcsConfig", "BizViewDetailsViewConfig", "BizViewDetailsViewBottomSheetConfig", "BizViewDetailsNotificationViewConfig", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewAcsConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewDetailsNotificationViewConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewDetailsViewBottomSheetConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewDetailsViewConfig;", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class BizMultiViewConfig implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.data.entity.Contact contact;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean isPacs;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String normalizedNumber;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean rejected;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer type;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewAcsConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig;", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class BizViewAcsConfig extends com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig> CREATOR = new java.lang.Object();
        public final com.truecaller.data.entity.Contact a;
        public final java.lang.String b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BizViewAcsConfig(com.truecaller.data.entity.Contact contact, java.lang.String str, boolean z, int i, boolean z2, boolean z3) {
            super(contact, str, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z2), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "normalizedNumber");
            this.a = contact;
            this.b = str;
            this.c = z;
            this.d = i;
            this.e = z2;
            this.f = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig)) {
                return false;
            }
            com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, bizViewAcsConfig.a) && kotlin.jvm.internal.Intrinsics.b(this.b, bizViewAcsConfig.b) && this.c == bizViewAcsConfig.c && this.d == bizViewAcsConfig.d && this.e == bizViewAcsConfig.e && this.f == bizViewAcsConfig.f;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final com.truecaller.data.entity.Contact getContact() {
            return this.a;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final java.lang.String getNormalizedNumber() {
            return this.b;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final java.lang.Boolean getRejected() {
            return java.lang.Boolean.valueOf(this.e);
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final java.lang.Integer getType() {
            return java.lang.Integer.valueOf(this.d);
        }

        public final int hashCode() {
            int i;
            int i2;
            int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
            int i3 = 1237;
            if (this.c) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i4 = (((e + i) * 31) + this.d) * 31;
            if (this.e) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            int i5 = (i4 + i2) * 31;
            if (this.f) {
                i3 = 1231;
            }
            return i5 + i3;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        /* renamed from: isPacs */
        public final java.lang.Boolean getIsPacs() {
            return java.lang.Boolean.valueOf(this.c);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BizViewAcsConfig(contact=");
            sb.append(this.a);
            sb.append(", normalizedNumber=");
            sb.append(this.b);
            sb.append(", isPacs=");
            com.google.android.gms.internal.ads.yj.h(this.d, ", type=", ", rejected=", sb, this.c);
            return ax1.bar.q(sb, this.e, ", isNeoAcs=", this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeParcelable(this.a, i);
            parcel.writeString(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewDetailsNotificationViewConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig;", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class BizViewDetailsNotificationViewConfig extends com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsNotificationViewConfig> CREATOR = new java.lang.Object();
        public final com.truecaller.data.entity.Contact a;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BizViewDetailsNotificationViewConfig(com.truecaller.data.entity.Contact contact, java.lang.String str) {
            super(contact, str, null, null, null, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "normalizedNumber");
            this.a = contact;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsNotificationViewConfig)) {
                return false;
            }
            com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsNotificationViewConfig bizViewDetailsNotificationViewConfig = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsNotificationViewConfig) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, bizViewDetailsNotificationViewConfig.a) && kotlin.jvm.internal.Intrinsics.b(this.b, bizViewDetailsNotificationViewConfig.b);
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final com.truecaller.data.entity.Contact getContact() {
            return this.a;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final java.lang.String getNormalizedNumber() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final java.lang.String toString() {
            return "BizViewDetailsNotificationViewConfig(contact=" + this.a + ", normalizedNumber=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeParcelable(this.a, i);
            parcel.writeString(this.b);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewDetailsViewBottomSheetConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig;", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class BizViewDetailsViewBottomSheetConfig extends com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewBottomSheetConfig> CREATOR = new java.lang.Object();
        public final com.truecaller.data.entity.Contact a;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BizViewDetailsViewBottomSheetConfig(com.truecaller.data.entity.Contact contact, java.lang.String str) {
            super(contact, str, null, null, null, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "normalizedNumber");
            this.a = contact;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewBottomSheetConfig)) {
                return false;
            }
            com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewBottomSheetConfig bizViewDetailsViewBottomSheetConfig = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewBottomSheetConfig) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, bizViewDetailsViewBottomSheetConfig.a) && kotlin.jvm.internal.Intrinsics.b(this.b, bizViewDetailsViewBottomSheetConfig.b);
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final com.truecaller.data.entity.Contact getContact() {
            return this.a;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final java.lang.String getNormalizedNumber() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final java.lang.String toString() {
            return "BizViewDetailsViewBottomSheetConfig(contact=" + this.a + ", normalizedNumber=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeParcelable(this.a, i);
            parcel.writeString(this.b);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig$BizViewDetailsViewConfig;", "Lcom/truecaller/bizmon/businessWidgetView/BizMultiViewConfig;", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class BizViewDetailsViewConfig extends com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewConfig> CREATOR = new java.lang.Object();
        public final com.truecaller.data.entity.Contact a;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BizViewDetailsViewConfig(com.truecaller.data.entity.Contact contact, java.lang.String str) {
            super(contact, str, null, null, null, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "normalizedNumber");
            this.a = contact;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewConfig)) {
                return false;
            }
            com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewConfig bizViewDetailsViewConfig = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewDetailsViewConfig) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, bizViewDetailsViewConfig.a) && kotlin.jvm.internal.Intrinsics.b(this.b, bizViewDetailsViewConfig.b);
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final com.truecaller.data.entity.Contact getContact() {
            return this.a;
        }

        @Override // com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig
        public final java.lang.String getNormalizedNumber() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final java.lang.String toString() {
            return "BizViewDetailsViewConfig(contact=" + this.a + ", normalizedNumber=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeParcelable(this.a, i);
            parcel.writeString(this.b);
        }
    }

    public /* synthetic */ BizMultiViewConfig(com.truecaller.data.entity.Contact contact, java.lang.String str, java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(contact, str, bool, num, bool2);
    }

    @org.jetbrains.annotations.NotNull
    public com.truecaller.data.entity.Contact getContact() {
        return this.contact;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getNormalizedNumber() {
        return this.normalizedNumber;
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Boolean getRejected() {
        return this.rejected;
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getType() {
        return this.type;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: isPacs, reason: from getter */
    public java.lang.Boolean getIsPacs() {
        return this.isPacs;
    }

    private BizMultiViewConfig(com.truecaller.data.entity.Contact contact, java.lang.String str, java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2) {
        this.contact = contact;
        this.normalizedNumber = str;
        this.isPacs = bool;
        this.type = num;
        this.rejected = bool2;
    }
}
