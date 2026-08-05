package com.truecaller.contactrequest.persistence;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/truecaller/contactrequest/persistence/ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel", "", "Companion", "t71/k", "Entry", "Type", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public interface ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONTACT_REQUEST_ENTRIES_KEY = "contact_request_entries_key";

    @org.jetbrains.annotations.NotNull
    public static final t71.k Companion = t71.k.a;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "contact_request_sp";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/contactrequest/persistence/ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "REJECTED", "SENT", "RECEIVED", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class Type {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type[] $VALUES;
        public static final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type ACCEPTED = new com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type("ACCEPTED", 0);
        public static final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type REJECTED = new com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type("REJECTED", 1);
        public static final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type SENT = new com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type("SENT", 2);
        public static final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type RECEIVED = new com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type("RECEIVED", 3);

        private static final /* synthetic */ com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type[] $values() {
            return new com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type[]{ACCEPTED, REJECTED, SENT, RECEIVED};
        }

        static {
            com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private Type(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type valueOf(java.lang.String str) {
            return (com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type) java.lang.Enum.valueOf(com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type.class, str);
        }

        public static com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type[] values() {
            return (com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type[]) $VALUES.clone();
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006&"}, d2 = {"Lcom/truecaller/contactrequest/persistence/ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel$Entry;", "", "type", "Lcom/truecaller/contactrequest/persistence/ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel$Type;", "tcId", "", "name", "phoneNumber", "requestId", "lastTimeUpdated", "", "isSentByUser", "", "<init>", "(Lcom/truecaller/contactrequest/persistence/ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "getType", "()Lcom/truecaller/contactrequest/persistence/ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel$Type;", "getTcId", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getRequestId", "getLastTimeUpdated", "()J", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class Entry {
        public static final int $stable = 0;

        @bw.qux("g")
        private final boolean isSentByUser;

        @bw.qux("f")
        private final long lastTimeUpdated;

        @bw.qux("c")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name;

        @bw.qux("d")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String phoneNumber;

        @bw.qux("e")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String requestId;

        @bw.qux("b")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String tcId;

        @bw.qux("a")
        @org.jetbrains.annotations.NotNull
        private final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type type;

        public Entry(@org.jetbrains.annotations.NotNull com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type type, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, long j, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "requestId");
            this.type = type;
            this.tcId = str;
            this.name = str2;
            this.phoneNumber = str3;
            this.requestId = str4;
            this.lastTimeUpdated = j;
            this.isSentByUser = z;
        }

        public static /* synthetic */ com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry copy$default(com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry entry, com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                type = entry.type;
            }
            if ((i & 2) != 0) {
                str = entry.tcId;
            }
            if ((i & 4) != 0) {
                str2 = entry.name;
            }
            if ((i & 8) != 0) {
                str3 = entry.phoneNumber;
            }
            if ((i & 16) != 0) {
                str4 = entry.requestId;
            }
            if ((i & 32) != 0) {
                j = entry.lastTimeUpdated;
            }
            if ((i & 64) != 0) {
                z = entry.isSentByUser;
            }
            boolean z2 = z;
            long j2 = j;
            java.lang.String str5 = str4;
            java.lang.String str6 = str2;
            return entry.copy(type, str, str6, str3, str5, j2, z2);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type getType() {
            return this.type;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTcId() {
            return this.tcId;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component6, reason: from getter */
        public final long getLastTimeUpdated() {
            return this.lastTimeUpdated;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSentByUser() {
            return this.isSentByUser;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry copy(@org.jetbrains.annotations.NotNull com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type type, @org.jetbrains.annotations.Nullable java.lang.String tcId, @org.jetbrains.annotations.Nullable java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull java.lang.String requestId, long lastTimeUpdated, boolean isSentByUser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
            return new com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry(type, tcId, name, phoneNumber, requestId, lastTimeUpdated, isSentByUser);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry)) {
                return false;
            }
            com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry entry = (com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry) other;
            return this.type == entry.type && kotlin.jvm.internal.Intrinsics.b(this.tcId, entry.tcId) && kotlin.jvm.internal.Intrinsics.b(this.name, entry.name) && kotlin.jvm.internal.Intrinsics.b(this.phoneNumber, entry.phoneNumber) && kotlin.jvm.internal.Intrinsics.b(this.requestId, entry.requestId) && this.lastTimeUpdated == entry.lastTimeUpdated && this.isSentByUser == entry.isSentByUser;
        }

        public final long getLastTimeUpdated() {
            return this.lastTimeUpdated;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getName() {
            return this.name;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTcId() {
            return this.tcId;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i;
            int hashCode3 = this.type.hashCode() * 31;
            java.lang.String str = this.tcId;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (hashCode3 + hashCode) * 31;
            java.lang.String str2 = this.name;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i4 = (i3 + hashCode2) * 31;
            java.lang.String str3 = this.phoneNumber;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            int e = ax1.bar.e((i4 + i2) * 31, 31, this.requestId);
            long j = this.lastTimeUpdated;
            int i5 = (e + ((int) (j ^ (j >>> 32)))) * 31;
            if (this.isSentByUser) {
                i = 1231;
            } else {
                i = 1237;
            }
            return i5 + i;
        }

        public final boolean isSentByUser() {
            return this.isSentByUser;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type type = this.type;
            java.lang.String str = this.tcId;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.phoneNumber;
            java.lang.String str4 = this.requestId;
            long j = this.lastTimeUpdated;
            boolean z = this.isSentByUser;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Entry(type=");
            sb.append(type);
            sb.append(", tcId=");
            sb.append(str);
            sb.append(", name=");
            bar.E(sb, str2, ", phoneNumber=", str3, ", requestId=");
            com.appsflyer.internal.e.y(sb, j, str4, ", lastTimeUpdated=");
            return com.appsflyer.internal.e.n(sb, ", isSentByUser=", z, ")");
        }

        public /* synthetic */ Entry(com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? t.c.p("toString(...)") : str4, (i & 32) != 0 ? java.lang.System.currentTimeMillis() : j, (i & 64) != 0 ? false : z);
        }
    }
}
