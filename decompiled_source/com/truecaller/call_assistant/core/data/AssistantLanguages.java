package com.truecaller.call_assistant.core.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantLanguages;", "Landroid/os/Parcelable;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantLanguages implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.core.data.AssistantLanguages> CREATOR = new vp0.bar(1);
    public final java.util.List a;
    public final com.truecaller.call_assistant.core.data.AssistantLanguage b;
    public final com.truecaller.call_assistant.core.data.AssistantLanguage c;
    public final com.truecaller.call_assistant.core.data.AssistantLanguage d;

    public AssistantLanguages(java.util.List list, com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage, com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage2, com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "languages");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantLanguage, "primary");
        this.a = list;
        this.b = assistantLanguage;
        this.c = assistantLanguage2;
        this.d = assistantLanguage3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.call_assistant.core.data.AssistantLanguages)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantLanguages assistantLanguages = (com.truecaller.call_assistant.core.data.AssistantLanguages) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, assistantLanguages.a) && kotlin.jvm.internal.Intrinsics.b(this.b, assistantLanguages.b) && kotlin.jvm.internal.Intrinsics.b(this.c, assistantLanguages.c) && kotlin.jvm.internal.Intrinsics.b(this.d, assistantLanguages.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage = this.c;
        int hashCode2 = (hashCode + (assistantLanguage == null ? 0 : assistantLanguage.hashCode())) * 31;
        com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage2 = this.d;
        return hashCode2 + (assistantLanguage2 != null ? assistantLanguage2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AssistantLanguages(languages=" + this.a + ", primary=" + this.b + ", secondary1=" + this.c + ", secondary2=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.util.Iterator f = z0.a0.f(this.a, parcel);
        while (f.hasNext()) {
            ((com.truecaller.call_assistant.core.data.AssistantLanguage) f.next()).writeToParcel(parcel, i);
        }
        this.b.writeToParcel(parcel, i);
        com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage = this.c;
        if (assistantLanguage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assistantLanguage.writeToParcel(parcel, i);
        }
        com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage2 = this.d;
        if (assistantLanguage2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assistantLanguage2.writeToParcel(parcel, i);
        }
    }
}
