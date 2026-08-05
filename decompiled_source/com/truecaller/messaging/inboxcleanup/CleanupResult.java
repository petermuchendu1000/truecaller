package com.truecaller.messaging.inboxcleanup;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/messaging/inboxcleanup/CleanupResult;", "Landroid/os/Parcelable;", "Success", "GeneralError", "NoPermissionsError", "Lcom/truecaller/messaging/inboxcleanup/CleanupResult$GeneralError;", "Lcom/truecaller/messaging/inboxcleanup/CleanupResult$NoPermissionsError;", "Lcom/truecaller/messaging/inboxcleanup/CleanupResult$Success;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class CleanupResult implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/inboxcleanup/CleanupResult$GeneralError;", "Lcom/truecaller/messaging/inboxcleanup/CleanupResult;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class GeneralError extends com.truecaller.messaging.inboxcleanup.CleanupResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError> CREATOR = new java.lang.Object();
        public final boolean a;

        public GeneralError(boolean z) {
            this.a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError) && this.a == ((com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError) obj).a;
        }

        public final int hashCode() {
            return this.a ? 1231 : 1237;
        }

        public final java.lang.String toString() {
            return ro0.f.D("GeneralError(showReason=", ")", this.a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/inboxcleanup/CleanupResult$NoPermissionsError;", "Lcom/truecaller/messaging/inboxcleanup/CleanupResult;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class NoPermissionsError extends com.truecaller.messaging.inboxcleanup.CleanupResult {
        public static final com.truecaller.messaging.inboxcleanup.CleanupResult.NoPermissionsError a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.messaging.inboxcleanup.CleanupResult.NoPermissionsError> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/inboxcleanup/CleanupResult$Success;", "Lcom/truecaller/messaging/inboxcleanup/CleanupResult;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class Success extends com.truecaller.messaging.inboxcleanup.CleanupResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.messaging.inboxcleanup.CleanupResult.Success> CREATOR = new java.lang.Object();
        public final int a;
        public final int b;
        public final int c;

        public Success(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.messaging.inboxcleanup.CleanupResult.Success)) {
                return false;
            }
            com.truecaller.messaging.inboxcleanup.CleanupResult.Success success = (com.truecaller.messaging.inboxcleanup.CleanupResult.Success) obj;
            return this.a == success.a && this.b == success.b && this.c == success.c;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public final java.lang.String toString() {
            return bar.m(this.c, ")", z0.a0.e(this.a, this.b, "Success(otpCount=", ", promotionalCount=", ", spamCount="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }
}
