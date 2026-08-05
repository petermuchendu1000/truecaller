package com.truecaller.premium.data.component;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/data/component/BannerComponent;", "", "Lcom/truecaller/premium/data/component/banner/BannerSpec;", "", "componentType", "", "specs", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getComponentType", "()Ljava/lang/String;", "Ljava/util/List;", "getSpecs", "()Ljava/util/List;", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BannerComponent {
    public static final int $stable = 8;

    @bw.qux("component_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String componentType;

    @bw.qux("value")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.premium.data.component.banner.BannerSpec> specs;

    public BannerComponent(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.premium.data.component.banner.BannerSpec> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "componentType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "specs");
        this.componentType = str;
        this.specs = list;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getComponentType() {
        return this.componentType;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.truecaller.premium.data.component.banner.BannerSpec> getSpecs() {
        return this.specs;
    }
}
