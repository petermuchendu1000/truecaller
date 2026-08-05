package com.truecaller.call_assistant.core.customgreeting.customize;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/core/customgreeting/customize/CustomGreetingEditInputValue;", "Landroid/os/Parcelable;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CustomGreetingEditInputValue implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.core.customgreeting.customize.CustomGreetingEditInputValue> CREATOR = new om0.bar(3);
    public final com.truecaller.call_assistant.core.data.Input a;
    public final java.lang.String b;

    public CustomGreetingEditInputValue(com.truecaller.call_assistant.core.data.Input input, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "currentValue");
        this.a = input;
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
        if (!(obj instanceof com.truecaller.call_assistant.core.customgreeting.customize.CustomGreetingEditInputValue)) {
            return false;
        }
        com.truecaller.call_assistant.core.customgreeting.customize.CustomGreetingEditInputValue customGreetingEditInputValue = (com.truecaller.call_assistant.core.customgreeting.customize.CustomGreetingEditInputValue) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, customGreetingEditInputValue.a) && kotlin.jvm.internal.Intrinsics.b(this.b, customGreetingEditInputValue.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "CustomGreetingEditInputValue(input=" + this.a + ", currentValue=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }
}
