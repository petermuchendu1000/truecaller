package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/truecaller/ads/mediation/model/rtb/App;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "bundle", "name", "storeUrl", "publisher", "Lcom/truecaller/ads/mediation/model/rtb/Publisher;", "ext", "Lcom/truecaller/ads/mediation/model/rtb/AppExt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/ads/mediation/model/rtb/Publisher;Lcom/truecaller/ads/mediation/model/rtb/AppExt;)V", "getId", "()Ljava/lang/String;", "getBundle", "getName", "getStoreUrl", "getPublisher", "()Lcom/truecaller/ads/mediation/model/rtb/Publisher;", "getExt", "()Lcom/truecaller/ads/mediation/model/rtb/AppExt;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class App {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String bundle;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.mediation.model.rtb.AppExt ext;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.mediation.model.rtb.Publisher publisher;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String storeUrl;

    public App(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.rtb.Publisher publisher, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.rtb.AppExt appExt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "bundle");
        this.id = str;
        this.bundle = str2;
        this.name = str3;
        this.storeUrl = str4;
        this.publisher = publisher;
        this.ext = appExt;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.App copy$default(com.truecaller.ads.mediation.model.rtb.App app, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.truecaller.ads.mediation.model.rtb.Publisher publisher, com.truecaller.ads.mediation.model.rtb.AppExt appExt, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = app.id;
        }
        if ((i & 2) != 0) {
            str2 = app.bundle;
        }
        if ((i & 4) != 0) {
            str3 = app.name;
        }
        if ((i & 8) != 0) {
            str4 = app.storeUrl;
        }
        if ((i & 16) != 0) {
            publisher = app.publisher;
        }
        if ((i & 32) != 0) {
            appExt = app.ext;
        }
        com.truecaller.ads.mediation.model.rtb.Publisher publisher2 = publisher;
        com.truecaller.ads.mediation.model.rtb.AppExt appExt2 = appExt;
        return app.copy(str, str2, str3, str4, publisher2, appExt2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBundle() {
        return this.bundle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.Publisher getPublisher() {
        return this.publisher;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.AppExt getExt() {
        return this.ext;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.App copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String bundle, @org.jetbrains.annotations.Nullable java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String storeUrl, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.rtb.Publisher publisher, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.rtb.AppExt ext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new com.truecaller.ads.mediation.model.rtb.App(id, bundle, name, storeUrl, publisher, ext);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.App)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.App app = (com.truecaller.ads.mediation.model.rtb.App) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, app.id) && kotlin.jvm.internal.Intrinsics.b(this.bundle, app.bundle) && kotlin.jvm.internal.Intrinsics.b(this.name, app.name) && kotlin.jvm.internal.Intrinsics.b(this.storeUrl, app.storeUrl) && kotlin.jvm.internal.Intrinsics.b(this.publisher, app.publisher) && kotlin.jvm.internal.Intrinsics.b(this.ext, app.ext);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBundle() {
        return this.bundle;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.mediation.model.rtb.AppExt getExt() {
        return this.ext;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.mediation.model.rtb.Publisher getPublisher() {
        return this.publisher;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        java.lang.String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(hashCode * 31, 31, this.bundle);
        java.lang.String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        java.lang.String str3 = this.storeUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        com.truecaller.ads.mediation.model.rtb.Publisher publisher = this.publisher;
        if (publisher == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = publisher.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        com.truecaller.ads.mediation.model.rtb.AppExt appExt = this.ext;
        if (appExt != null) {
            i = appExt.hashCode();
        }
        return i4 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.bundle;
        java.lang.String str3 = this.name;
        java.lang.String str4 = this.storeUrl;
        com.truecaller.ads.mediation.model.rtb.Publisher publisher = this.publisher;
        com.truecaller.ads.mediation.model.rtb.AppExt appExt = this.ext;
        java.lang.StringBuilder E = ro0.f.E("App(id=", str, ", bundle=", str2, ", name=");
        bar.E(E, str3, ", storeUrl=", str4, ", publisher=");
        E.append(publisher);
        E.append(", ext=");
        E.append(appExt);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ App(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.truecaller.ads.mediation.model.rtb.Publisher publisher, com.truecaller.ads.mediation.model.rtb.AppExt appExt, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : publisher, (i & 32) != 0 ? null : appExt);
    }
}
