package com.truecaller.bizmon.callMeBack.data.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/data/models/CallMeBackResponse;", "", "phone", "", "title", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getBody", "setBody", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallMeBackResponse {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private java.lang.String body;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String phone;

    @org.jetbrains.annotations.NotNull
    private java.lang.String title;

    public CallMeBackResponse(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "body");
        this.phone = str;
        this.title = str2;
        this.body = str3;
    }

    public static /* synthetic */ com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse copy$default(com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse callMeBackResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = callMeBackResponse.phone;
        }
        if ((i & 2) != 0) {
            str2 = callMeBackResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = callMeBackResponse.body;
        }
        return callMeBackResponse.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPhone() {
        return this.phone;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse copy(@org.jetbrains.annotations.NotNull java.lang.String phone, @org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "phone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return new com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse(phone, title, body);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse)) {
            return false;
        }
        com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse callMeBackResponse = (com.truecaller.bizmon.callMeBack.data.models.CallMeBackResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.phone, callMeBackResponse.phone) && kotlin.jvm.internal.Intrinsics.b(this.title, callMeBackResponse.title) && kotlin.jvm.internal.Intrinsics.b(this.body, callMeBackResponse.body);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhone() {
        return this.phone;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.body.hashCode() + ax1.bar.e(this.phone.hashCode() * 31, 31, this.title);
    }

    public final void setBody(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.body = str;
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.body, ")", ro0.f.E("CallMeBackResponse(phone=", this.phone, ", title=", this.title, ", body="));
    }
}
