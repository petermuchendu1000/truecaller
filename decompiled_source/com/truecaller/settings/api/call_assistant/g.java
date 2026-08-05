package com.truecaller.settings.api.call_assistant;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g {
    public final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts a;
    public final com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;

    public g(com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts phonebookContacts, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers topSpammers, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7) {
        this.a = phonebookContacts;
        this.b = topSpammers;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = i;
        this.j = i2;
        this.k = z7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.settings.api.call_assistant.g)) {
            return false;
        }
        com.truecaller.settings.api.call_assistant.g gVar = (com.truecaller.settings.api.call_assistant.g) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, gVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts phonebookContacts = this.a;
        if (phonebookContacts == null) {
            hashCode = 0;
        } else {
            hashCode = phonebookContacts.hashCode();
        }
        int i8 = hashCode * 31;
        com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers topSpammers = this.b;
        if (topSpammers != null) {
            i7 = topSpammers.hashCode();
        }
        int i9 = (i8 + i7) * 31;
        int i10 = 1237;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i11 = (i9 + i) * 31;
        if (this.d) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i12 = (i11 + i2) * 31;
        if (this.e) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i14 = (i12 + i3) * 31;
        if (this.f) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i15 = (i14 + i4) * 31;
        if (this.g) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i16 = (i15 + i5) * 31;
        if (this.h) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i17 = (((((i16 + i6) * 31) + this.i) * 31) + this.j) * 31;
        if (this.k) {
            i10 = 1231;
        }
        return i17 + i10;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInfoResponse(phoneBookCallersSettings=");
        sb.append(this.a);
        sb.append(", topSpammers=");
        sb.append(this.b);
        sb.append(", isVoicemailChecked=");
        nc0.k1.p(sb, this.c, ", useCustomIntro=", this.d, ", assistantTranscriptionEnabled=");
        nc0.k1.p(sb, this.e, ", hasUserCustomVoice=", this.f, ", handleMissedCallsFromUnknownNumbers=");
        nc0.k1.p(sb, this.g, ", handleMissedCallsFromContacts=", this.h, ", customVoiceCreationAttempts=");
        os0.bar.A(this.i, this.j, ", customVoiceCreationLimit=", ", dialOnlyBusyCodeToActivate=", sb);
        return h8.s0.s(sb, this.k, ")");
    }
}
