package com.truecaller.referrals.domain.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/referrals/domain/data/ReferralUrlImpl;", "Landroid/os/Parcelable;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ReferralUrlImpl implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.referrals.domain.data.ReferralUrlImpl> CREATOR = new om0.bar(7);
    public final java.lang.String a;
    public final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext b;
    public com.truecaller.referrals.api.data.ReferralUrl$Medium c;
    public final java.lang.Character d;

    public ReferralUrlImpl(java.lang.String str, com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext, com.truecaller.referrals.api.data.ReferralUrl$Medium referralUrl$Medium, java.lang.Character ch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "referralUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referralUrl$Medium, "medium");
        this.a = str;
        this.b = referralManager$ReferralLaunchContext;
        this.c = referralUrl$Medium;
        this.d = ch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String a(java.lang.String str) {
        char encodedChar;
        java.lang.String str2 = this.a;
        java.lang.String host = android.net.Uri.parse(str2).getHost();
        if (host != null && (host.equalsIgnoreCase("truecaller.com") || host.equalsIgnoreCase("trcllr.com"))) {
            com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = this.b;
            if (referralManager$ReferralLaunchContext != null) {
                char encodedChar2 = referralManager$ReferralLaunchContext.getEncodedChar();
                com.truecaller.referrals.api.data.ReferralUrl$Medium referralUrl$Medium = null;
                if (str != null) {
                    java.util.Iterator it = com.truecaller.referrals.api.data.ReferralUrl$Medium.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.referrals.api.data.ReferralUrl$Medium) next).getPackageName(), str)) {
                            referralUrl$Medium = next;
                            break;
                        }
                    }
                    referralUrl$Medium = referralUrl$Medium;
                }
                if (referralUrl$Medium != null) {
                    encodedChar = referralUrl$Medium.getEncodedChar();
                } else {
                    encodedChar = this.c.getEncodedChar();
                }
                java.lang.String str3 = "";
                java.lang.Object obj = this.d;
                if (obj == null) {
                    obj = "";
                }
                if (!kotlin.text.y.o(str2, "/", false)) {
                    str3 = "/";
                }
                return str2 + str3 + encodedChar2 + encodedChar + obj;
            }
            throw new java.lang.IllegalArgumentException(k9.d.q("Referral source should not be null. Url : ", str2).toString());
        }
        return str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.referrals.domain.data.ReferralUrlImpl)) {
            return false;
        }
        com.truecaller.referrals.domain.data.ReferralUrlImpl referralUrlImpl = (com.truecaller.referrals.domain.data.ReferralUrlImpl) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, referralUrlImpl.a) && this.b == referralUrlImpl.b && this.c == referralUrlImpl.c && kotlin.jvm.internal.Intrinsics.b(this.d, referralUrlImpl.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (referralManager$ReferralLaunchContext == null ? 0 : referralManager$ReferralLaunchContext.hashCode())) * 31)) * 31;
        java.lang.Character ch = this.d;
        return hashCode2 + (ch != null ? ch.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("referralUrl=" + this.a);
        com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = this.b;
        if (referralManager$ReferralLaunchContext != null) {
            arrayList.add("launchSource=" + referralManager$ReferralLaunchContext);
        }
        com.truecaller.referrals.api.data.ReferralUrl$Medium referralUrl$Medium = this.c;
        if (referralUrl$Medium != com.truecaller.referrals.api.data.ReferralUrl$Medium.OTHERS) {
            arrayList.add("medium=" + referralUrl$Medium);
        }
        java.lang.Character ch = this.d;
        if (ch != null) {
            arrayList.add("variantChar=" + ch);
        }
        return bar.t("ReferralUrl(", kotlin.collections.CollectionsKt.b0(arrayList, ", ", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = this.b;
        if (referralManager$ReferralLaunchContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(referralManager$ReferralLaunchContext.name());
        }
        parcel.writeString(this.c.name());
        java.lang.Character ch = this.d;
        if (ch == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(ch.charValue());
        }
    }
}
