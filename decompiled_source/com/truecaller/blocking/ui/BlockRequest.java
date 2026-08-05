package com.truecaller.blocking.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest;", "Landroid/os/Parcelable;", "BlockPolicy", "SuggestedNameReplacePolicy", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BlockRequest implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest> CREATOR = new om0.bar(15);
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final java.util.List d;
    public final com.truecaller.data.entity.FeedbackSource e;
    public final java.lang.String f;
    public final java.util.List g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final boolean j;
    public final com.truecaller.blocking.api.model.WildCardType k;
    public final com.truecaller.data.entity.Contact l;
    public final boolean m;
    public final boolean n;
    public final java.lang.String o;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy;", "Landroid/os/Parcelable;", "Numbers", "NumbersAndNames", "ImId", "Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$ImId;", "Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$Numbers;", "Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$NumbersAndNames;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface BlockPolicy extends android.os.Parcelable {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$ImId;", "Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class ImId implements com.truecaller.blocking.ui.BlockRequest.BlockPolicy {

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId> CREATOR = new java.lang.Object();
            public final java.util.List a;

            public ImId(java.util.List list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "addressesAndSpamVersions");
                this.a = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final java.lang.String toString() {
                return com.appsflyer.internal.e.k("ImId(addressesAndSpamVersions=", ")", this.a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                java.util.Iterator f = z0.a0.f(this.a, parcel);
                while (f.hasNext()) {
                    parcel.writeSerializable((java.io.Serializable) f.next());
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$Numbers;", "Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class Numbers implements com.truecaller.blocking.ui.BlockRequest.BlockPolicy {

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers> CREATOR = new java.lang.Object();
            public final java.util.List a;

            public Numbers(java.util.List list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "addressesAndSpamVersions");
                this.a = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final java.lang.String toString() {
                return com.appsflyer.internal.e.k("Numbers(addressesAndSpamVersions=", ")", this.a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                java.util.Iterator f = z0.a0.f(this.a, parcel);
                while (f.hasNext()) {
                    parcel.writeSerializable((java.io.Serializable) f.next());
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$NumbersAndNames;", "Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy;", "Data", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class NumbersAndNames implements com.truecaller.blocking.ui.BlockRequest.BlockPolicy {

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames> CREATOR = new java.lang.Object();
            public final java.util.List a;

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$BlockPolicy$NumbersAndNames$Data;", "Landroid/os/Parcelable;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: /home/user/tc_decoded/classes5.dex */
            public static final /* data */ class Data implements android.os.Parcelable {

                @org.jetbrains.annotations.NotNull
                public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data> CREATOR = new java.lang.Object();
                public final kotlin.Pair a;
                public final com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy b;

                public Data(kotlin.Pair pair, com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy suggestedNameReplacePolicy) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedNameReplacePolicy, "suggestedNameReplacePolicy");
                    this.a = pair;
                    this.b = suggestedNameReplacePolicy;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data)) {
                        return false;
                    }
                    com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data data = (com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data) obj;
                    return kotlin.jvm.internal.Intrinsics.b(this.a, data.a) && kotlin.jvm.internal.Intrinsics.b(this.b, data.b);
                }

                public final int hashCode() {
                    kotlin.Pair pair = this.a;
                    return this.b.hashCode() + ((pair == null ? 0 : pair.hashCode()) * 31);
                }

                public final java.lang.String toString() {
                    return "Data(blockData=" + this.a + ", suggestedNameReplacePolicy=" + this.b + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(android.os.Parcel parcel, int i) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                    parcel.writeSerializable(this.a);
                    parcel.writeParcelable(this.b, i);
                }
            }

            public NumbersAndNames(java.util.List list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "addressesAndNames");
                this.a = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final java.lang.String toString() {
                return com.appsflyer.internal.e.k("NumbersAndNames(addressesAndNames=", ")", this.a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                java.util.Iterator f = z0.a0.f(this.a, parcel);
                while (f.hasNext()) {
                    ((com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data) f.next()).writeToParcel(parcel, i);
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy;", "Landroid/os/Parcelable;", "Never", "Always", "IfSuggestedNameExists", "Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy$Always;", "Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy$IfSuggestedNameExists;", "Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy$Never;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface SuggestedNameReplacePolicy extends android.os.Parcelable {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy$Always;", "Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final class Always implements com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy {
            public static final com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Always a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Always> CREATOR = new java.lang.Object();

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

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy$IfSuggestedNameExists;", "Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final /* data */ class IfSuggestedNameExists implements com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy {

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.IfSuggestedNameExists> CREATOR = new java.lang.Object();
            public final java.lang.String a;

            public IfSuggestedNameExists(java.lang.String str) {
                this.a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.IfSuggestedNameExists) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.IfSuggestedNameExists) obj).a);
            }

            public final int hashCode() {
                java.lang.String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final java.lang.String toString() {
                return bar.t("IfSuggestedNameExists(fallback=", this.a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
                parcel.writeString(this.a);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy$Never;", "Lcom/truecaller/blocking/ui/BlockRequest$SuggestedNameReplacePolicy;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: /home/user/tc_decoded/classes5.dex */
        public static final class Never implements com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy {
            public static final com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Never a = new java.lang.Object();

            @org.jetbrains.annotations.NotNull
            public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Never> CREATOR = new java.lang.Object();

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
    }

    public BlockRequest(java.lang.String str, boolean z, boolean z2, java.util.List list, com.truecaller.data.entity.FeedbackSource feedbackSource, java.lang.String str2, java.util.List list2, java.lang.String str3, java.lang.String str4, boolean z3, com.truecaller.blocking.api.model.WildCardType wildCardType, com.truecaller.data.entity.Contact contact, boolean z4, boolean z5, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "numbers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackSource, "feedbackSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "blockPolicies");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wildCardType, "wildCardType");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = feedbackSource;
        this.f = str2;
        this.g = list2;
        this.h = str3;
        this.i = str4;
        this.j = z3;
        this.k = wildCardType;
        this.l = contact;
        this.m = z4;
        this.n = z5;
        this.o = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blocking.ui.BlockRequest)) {
            return false;
        }
        com.truecaller.blocking.ui.BlockRequest blockRequest = (com.truecaller.blocking.ui.BlockRequest) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, blockRequest.a) && this.b == blockRequest.b && this.c == blockRequest.c && kotlin.jvm.internal.Intrinsics.b(this.d, blockRequest.d) && this.e == blockRequest.e && kotlin.jvm.internal.Intrinsics.b(this.f, blockRequest.f) && kotlin.jvm.internal.Intrinsics.b(this.g, blockRequest.g) && kotlin.jvm.internal.Intrinsics.b(this.h, blockRequest.h) && kotlin.jvm.internal.Intrinsics.b(this.i, blockRequest.i) && this.j == blockRequest.j && this.k == blockRequest.k && kotlin.jvm.internal.Intrinsics.b(this.l, blockRequest.l) && this.m == blockRequest.m && this.n == blockRequest.n && kotlin.jvm.internal.Intrinsics.b(this.o, blockRequest.o);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode;
        int i3;
        int hashCode2;
        int i4;
        int hashCode3 = this.a.hashCode() * 31;
        int i5 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i6 = (hashCode3 + i) * 31;
        if (this.c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int g = uf.qux.g(ax1.bar.e((this.e.hashCode() + uf.qux.g((i6 + i2) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        int i7 = 0;
        java.lang.String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e((g + hashCode) * 31, 31, this.i);
        if (this.j) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int hashCode4 = (this.k.hashCode() + ((e + i3) * 31)) * 31;
        com.truecaller.data.entity.Contact contact = this.l;
        if (contact == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = contact.hashCode();
        }
        int i8 = (hashCode4 + hashCode2) * 31;
        if (this.m) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i9 = (i8 + i4) * 31;
        if (this.n) {
            i5 = 1231;
        }
        int i11 = (i9 + i5) * 31;
        java.lang.String str2 = this.o;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i11 + i7;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder t = ax1.bar.t("BlockRequest(displayName=", this.a, ", hasName=", ", supportsNameSuggestion=", this.b);
        t.append(this.c);
        t.append(", numbers=");
        t.append(this.d);
        t.append(", feedbackSource=");
        t.append(this.e);
        t.append(", analyticsContext=");
        t.append(this.f);
        t.append(", blockPolicies=");
        os0.bar.B(", type=", this.h, ", source=", t, this.g);
        com.google.android.gms.internal.ads.yj.l(this.i, ", isShowingSpamCount=", ", wildCardType=", t, this.j);
        t.append(this.k);
        t.append(", contact=");
        t.append(this.l);
        t.append(", isFraudSender=");
        nc0.k1.p(t, this.m, ", isWhatsAppCall=", this.n, ", tcId=");
        return bar.v(this.o, ")", t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        java.util.Iterator f = z0.a0.f(this.d, parcel);
        while (f.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) f.next(), i);
        }
        parcel.writeString(this.e.name());
        parcel.writeString(this.f);
        java.util.Iterator f2 = z0.a0.f(this.g, parcel);
        while (f2.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) f2.next(), i);
        }
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeString(this.k.name());
        parcel.writeParcelable(this.l, i);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.o);
    }

    public /* synthetic */ BlockRequest(java.lang.String str, boolean z, boolean z2, java.util.List list, com.truecaller.data.entity.FeedbackSource feedbackSource, java.lang.String str2, java.util.List list2, java.lang.String str3, java.lang.String str4, boolean z3, com.truecaller.blocking.api.model.WildCardType wildCardType, com.truecaller.data.entity.Contact contact, boolean z4, boolean z5, java.lang.String str5, int i) {
        this(str, z, z2, list, feedbackSource, str2, list2, str3, str4, z3, wildCardType, (i & 2048) != 0 ? null : contact, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? false : z5, (i & 16384) != 0 ? null : str5);
    }
}
