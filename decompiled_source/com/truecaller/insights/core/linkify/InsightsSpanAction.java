package com.truecaller.insights.core.linkify;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB5\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u0082\u0001\n\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "Landroid/os/Parcelable;", "actionName", "", "actionIcon", "sender", "", "category", "analyticsContext", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionName", "()I", "getActionIcon", "getSender", "()Ljava/lang/String;", "getCategory", "getAnalyticsContext", "OpenAction", "MessageAction", "ComposeAction", "CallAction", "EventAction", "ProfileAction", "SaveContactAction", "PayAction", "DeeplinkAction", "CopyAction", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$CallAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$ComposeAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$CopyAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$DeeplinkAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$EventAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$MessageAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$OpenAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$PayAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$ProfileAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction$SaveContactAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class InsightsSpanAction implements android.os.Parcelable {
    private final int actionIcon;
    private final int actionName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsContext;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sender;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$CallAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class CallAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(2132023405, 2131233292, str2, str3, str4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction callAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.CallAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, callAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, callAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, callAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, callAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("CallAction(number=", this.a, ", sender=", this.b, ", category="), this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$ComposeAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ComposeAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposeAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(2132023406, 2131233294, str2, str3, str4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "email");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction composeAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.ComposeAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, composeAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, composeAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, composeAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, composeAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("ComposeAction(email=", this.a, ", sender=", this.b, ", category="), this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$CopyAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class CopyAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super(2132023407, 2131233293, str3, str4, str5, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "tokenType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction copyAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.CopyAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, copyAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, copyAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, copyAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, copyAction.d) && kotlin.jvm.internal.Intrinsics.b(this.e, copyAction.e);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.e;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.c;
        }

        public final int hashCode() {
            return this.e.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder E = ro0.f.E("CopyAction(text=", this.a, ", tokenType=", this.b, ", sender=");
            bar.E(E, this.c, ", category=", this.d, ", analyticsContext=");
            return bar.v(this.e, ")", E);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$DeeplinkAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class DeeplinkAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeeplinkAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(2132023410, 2131233298, str2, str3, str4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "link");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction deeplinkAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.DeeplinkAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, deeplinkAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, deeplinkAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, deeplinkAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, deeplinkAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("DeeplinkAction(link=", this.a, ", sender=", this.b, ", category="), this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$EventAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class EventAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction> CREATOR = new java.lang.Object();
        public final java.util.Date a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventAction(java.util.Date date, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(2132023408, 2131233295, str, str2, str3, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "analyticsContext");
            this.a = date;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction eventAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.EventAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, eventAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, eventAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, eventAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, eventAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EventAction(date=");
            sb.append(this.a);
            sb.append(", sender=");
            sb.append(this.b);
            sb.append(", category=");
            return bar.x(sb, this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeSerializable(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$MessageAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class MessageAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(2132023409, 2131233297, str2, str3, str4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction messageAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.MessageAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, messageAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, messageAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, messageAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, messageAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("MessageAction(number=", this.a, ", sender=", this.b, ", category="), this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$OpenAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class OpenAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final com.truecaller.insights.core.linkify.UrlType b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final java.lang.String e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public OpenAction(java.lang.String str, com.truecaller.insights.core.linkify.UrlType urlType, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(r3, r0, str2, str3, str4, null);
            int i;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlType, "urlType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            com.truecaller.insights.core.linkify.UrlType urlType2 = com.truecaller.insights.core.linkify.UrlType.MAPS;
            if (urlType == urlType2) {
                i = 2132023411;
            } else {
                i = 2132023410;
            }
            int i3 = i;
            if (urlType == urlType2) {
                i2 = 2131233296;
            } else {
                i2 = 2131233298;
            }
            this.a = str;
            this.b = urlType;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction openAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, openAction.a) && this.b == openAction.b && kotlin.jvm.internal.Intrinsics.b(this.c, openAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, openAction.d) && kotlin.jvm.internal.Intrinsics.b(this.e, openAction.e);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.e;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.c;
        }

        public final int hashCode() {
            return this.e.hashCode() + ax1.bar.e(ax1.bar.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenAction(url=");
            sb.append(this.a);
            sb.append(", urlType=");
            sb.append(this.b);
            sb.append(", sender=");
            bar.E(sb, this.c, ", category=", this.d, ", analyticsContext=");
            return bar.v(this.e, ")", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$PayAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class PayAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(2132023412, 2131233299, str2, str3, str4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "upiId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction payAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.PayAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, payAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, payAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, payAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, payAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("PayAction(upiId=", this.a, ", sender=", this.b, ", category="), this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$ProfileAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ProfileAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProfileAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(2132023410, 2131233300, str2, str3, str4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "profileId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction profileAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.ProfileAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, profileAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, profileAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, profileAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, profileAction.d);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.c;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("ProfileAction(profileId=", this.a, ", sender=", this.b, ", category="), this.c, ", analyticsContext=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/linkify/InsightsSpanAction$SaveContactAction;", "Lcom/truecaller/insights/core/linkify/InsightsSpanAction;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class SaveContactAction extends com.truecaller.insights.core.linkify.InsightsSpanAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveContactAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super(2132023413, 2131233301, str3, str4, str5, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "category");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "analyticsContext");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction)) {
                return false;
            }
            com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction saveContactAction = (com.truecaller.insights.core.linkify.InsightsSpanAction.SaveContactAction) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, saveContactAction.a) && kotlin.jvm.internal.Intrinsics.b(this.b, saveContactAction.b) && kotlin.jvm.internal.Intrinsics.b(this.c, saveContactAction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, saveContactAction.d) && kotlin.jvm.internal.Intrinsics.b(this.e, saveContactAction.e);
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getAnalyticsContext() {
            return this.e;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getCategory() {
            return this.d;
        }

        @Override // com.truecaller.insights.core.linkify.InsightsSpanAction
        public final java.lang.String getSender() {
            return this.c;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            java.lang.String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            java.lang.String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return this.e.hashCode() + ax1.bar.e(ax1.bar.e((i2 + i) * 31, 31, this.c), 31, this.d);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder E = ro0.f.E("SaveContactAction(number=", this.a, ", email=", this.b, ", sender=");
            bar.E(E, this.c, ", category=", this.d, ", analyticsContext=");
            return bar.v(this.e, ")", E);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    public /* synthetic */ InsightsSpanAction(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3);
    }

    public int getActionIcon() {
        return this.actionIcon;
    }

    public int getActionName() {
        return this.actionName;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getAnalyticsContext() {
        return this.analyticsContext;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getSender() {
        return this.sender;
    }

    private InsightsSpanAction(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.actionName = i;
        this.actionIcon = i2;
        this.sender = str;
        this.category = str2;
        this.analyticsContext = str3;
    }
}
