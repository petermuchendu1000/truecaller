package com.truecaller.sdk.oAuth.networking.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/ScopeInfo;", "Landroid/os/Parcelable;", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "", "title", "description", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V", "getName", "()Ljava/lang/String;", "getTitle", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getChildren", "()Ljava/util/ArrayList;", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ScopeInfo implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.sdk.oAuth.networking.data.ScopeInfo> CREATOR = new rz0.b0(25);
    private boolean checked;

    @org.jetbrains.annotations.Nullable
    private final java.util.ArrayList<java.lang.String> children;

    @org.jetbrains.annotations.NotNull
    private java.lang.String description;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    public ScopeInfo() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.ScopeInfo copy$default(com.truecaller.sdk.oAuth.networking.data.ScopeInfo scopeInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = scopeInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = scopeInfo.title;
        }
        if ((i & 4) != 0) {
            str3 = scopeInfo.description;
        }
        if ((i & 8) != 0) {
            arrayList = scopeInfo.children;
        }
        if ((i & 16) != 0) {
            z = scopeInfo.checked;
        }
        boolean z2 = z;
        java.lang.String str4 = str3;
        return scopeInfo.copy(str, str2, str4, arrayList, z2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<java.lang.String> component4() {
        return this.children;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.ScopeInfo copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String description, @org.jetbrains.annotations.Nullable java.util.ArrayList<java.lang.String> children, boolean checked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        return new com.truecaller.sdk.oAuth.networking.data.ScopeInfo(name, title, description, children, checked);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.ScopeInfo)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.ScopeInfo scopeInfo = (com.truecaller.sdk.oAuth.networking.data.ScopeInfo) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, scopeInfo.name) && kotlin.jvm.internal.Intrinsics.b(this.title, scopeInfo.title) && kotlin.jvm.internal.Intrinsics.b(this.description, scopeInfo.description) && kotlin.jvm.internal.Intrinsics.b(this.children, scopeInfo.children) && this.checked == scopeInfo.checked;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<java.lang.String> getChildren() {
        return this.children;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return this.description;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int e = ax1.bar.e(ax1.bar.e(this.name.hashCode() * 31, 31, this.title), 31, this.description);
        java.util.ArrayList<java.lang.String> arrayList = this.children;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        if (this.checked) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setDescription(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.description;
        java.util.ArrayList<java.lang.String> arrayList = this.children;
        boolean z = this.checked;
        java.lang.StringBuilder E = ro0.f.E("ScopeInfo(name=", str, ", title=", str2, ", description=");
        E.append(str3);
        E.append(", children=");
        E.append(arrayList);
        E.append(", checked=");
        return h8.s0.s(E, z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeStringList(this.children);
        dest.writeInt(this.checked ? 1 : 0);
    }

    public ScopeInfo(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.util.ArrayList<java.lang.String> arrayList, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "description");
        this.name = str;
        this.title = str2;
        this.description = str3;
        this.children = arrayList;
        this.checked = z;
    }

    public /* synthetic */ ScopeInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new java.util.ArrayList() : arrayList, (i & 16) != 0 ? true : z);
    }
}
