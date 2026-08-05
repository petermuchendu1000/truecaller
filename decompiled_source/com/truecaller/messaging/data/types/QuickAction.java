package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/messaging/data/types/QuickAction;", "Landroid/os/Parcelable;", "REPLY", "DeepLink", "ModalFormQuickAction", "Lcom/truecaller/messaging/data/types/QuickAction$DeepLink;", "Lcom/truecaller/messaging/data/types/QuickAction$ModalFormQuickAction;", "Lcom/truecaller/messaging/data/types/QuickAction$REPLY;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class QuickAction implements android.os.Parcelable {
    public final int a;
    public final java.lang.String b;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/QuickAction$DeepLink;", "Lcom/truecaller/messaging/data/types/QuickAction;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class DeepLink extends com.truecaller.messaging.data.types.QuickAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.QuickAction.DeepLink> CREATOR = new java.lang.Object();
        public final long c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final java.lang.String f;
        public final java.lang.String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLink(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(1, str3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawMessageId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "uri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "actionTag");
            this.c = j;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
        }

        @Override // com.truecaller.messaging.data.types.QuickAction
        /* renamed from: a, reason: from getter */
        public final java.lang.String getD() {
            return this.d;
        }

        @Override // com.truecaller.messaging.data.types.QuickAction
        /* renamed from: b, reason: from getter */
        public final java.lang.String getB() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.messaging.data.types.QuickAction.DeepLink)) {
                return false;
            }
            com.truecaller.messaging.data.types.QuickAction.DeepLink deepLink = (com.truecaller.messaging.data.types.QuickAction.DeepLink) obj;
            return this.c == deepLink.c && kotlin.jvm.internal.Intrinsics.b(this.d, deepLink.d) && kotlin.jvm.internal.Intrinsics.b(this.e, deepLink.e) && kotlin.jvm.internal.Intrinsics.b(this.f, deepLink.f) && kotlin.jvm.internal.Intrinsics.b(this.g, deepLink.g);
        }

        public final int hashCode() {
            long j = this.c;
            return this.g.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder p = com.appsflyer.internal.e.p("DeepLink(id=", this.c, ", rawMessageId=", this.d);
            bar.E(p, ", uri=", this.e, ", text=", this.f);
            return y.o.f(", actionTag=", this.g, ")", p);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeLong(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/QuickAction$ModalFormQuickAction;", "Lcom/truecaller/messaging/data/types/QuickAction;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ModalFormQuickAction extends com.truecaller.messaging.data.types.QuickAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.QuickAction.ModalFormQuickAction> CREATOR = new java.lang.Object();
        public final long c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final com.truecaller.messaging.data.types.ModalFormSerialized f;
        public final boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModalFormQuickAction(long j, java.lang.String str, java.lang.String str2, com.truecaller.messaging.data.types.ModalFormSerialized modalFormSerialized, boolean z) {
            super(2, str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawMessageId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modalFormSerialized, "modalFormSerialized");
            this.c = j;
            this.d = str;
            this.e = str2;
            this.f = modalFormSerialized;
            this.g = z;
        }

        @Override // com.truecaller.messaging.data.types.QuickAction
        /* renamed from: a, reason: from getter */
        public final java.lang.String getD() {
            return this.d;
        }

        @Override // com.truecaller.messaging.data.types.QuickAction
        /* renamed from: b, reason: from getter */
        public final java.lang.String getB() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.messaging.data.types.QuickAction.ModalFormQuickAction)) {
                return false;
            }
            com.truecaller.messaging.data.types.QuickAction.ModalFormQuickAction modalFormQuickAction = (com.truecaller.messaging.data.types.QuickAction.ModalFormQuickAction) obj;
            return this.c == modalFormQuickAction.c && kotlin.jvm.internal.Intrinsics.b(this.d, modalFormQuickAction.d) && kotlin.jvm.internal.Intrinsics.b(this.e, modalFormQuickAction.e) && kotlin.jvm.internal.Intrinsics.b(this.f, modalFormQuickAction.f) && this.g == modalFormQuickAction.g;
        }

        public final int hashCode() {
            int i;
            long j = this.c;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.d), 31, this.e), 31, this.f.a);
            if (this.g) {
                i = 1231;
            } else {
                i = 1237;
            }
            return e + i;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder p = com.appsflyer.internal.e.p("ModalFormQuickAction(id=", this.c, ", rawMessageId=", this.d);
            p.append(", text=");
            p.append(this.e);
            p.append(", modalFormSerialized=");
            p.append(this.f);
            return com.appsflyer.internal.e.n(p, ", oneTimeResponse=", this.g, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeLong(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            this.f.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public QuickAction(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: a */
    public abstract java.lang.String getD();

    /* renamed from: b, reason: from getter */
    public java.lang.String getB() {
        return this.b;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/QuickAction$REPLY;", "Lcom/truecaller/messaging/data/types/QuickAction;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class REPLY extends com.truecaller.messaging.data.types.QuickAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.QuickAction.REPLY> CREATOR = new java.lang.Object();
        public final long c;
        public final java.lang.String d;
        public final java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public REPLY(long j, java.lang.String str, java.lang.String str2) {
            super(0, str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawMessageId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "action");
            this.c = j;
            this.d = str;
            this.e = str2;
        }

        @Override // com.truecaller.messaging.data.types.QuickAction
        /* renamed from: a, reason: from getter */
        public final java.lang.String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.messaging.data.types.QuickAction.REPLY)) {
                return false;
            }
            com.truecaller.messaging.data.types.QuickAction.REPLY reply = (com.truecaller.messaging.data.types.QuickAction.REPLY) obj;
            return this.c == reply.c && kotlin.jvm.internal.Intrinsics.b(this.d, reply.d) && kotlin.jvm.internal.Intrinsics.b(this.e, reply.e);
        }

        public final int hashCode() {
            long j = this.c;
            return this.e.hashCode() + ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.d);
        }

        public final java.lang.String toString() {
            return y.o.f(", action=", this.e, ")", com.appsflyer.internal.e.p("REPLY(id=", this.c, ", rawMessageId=", this.d));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeLong(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        public /* synthetic */ REPLY(java.lang.String str, java.lang.String str2) {
            this(-1L, str, str2);
        }
    }
}
