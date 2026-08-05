package com.truecaller.ads.postclickexperience.deeplink;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\u001c\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010 H\u0002J\u0013\u0010%\u001a\u0004\u0018\u00010#*\u00020\u0018H\u0000¢\u0006\u0002\b&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/truecaller/ads/postclickexperience/deeplink/PostClickExperienceDeeplink;", "", "<init>", "()V", "EXTRA_INPUT_DATA", "", "EXTRA_CREATIVE_ID", "EXTRA_PARAMS", "EXTRA_TYPE", "PATH_DEEPLINK_LEADGEN_OFFLINE", "PATH_DEEPLINK_UNIFIED_LEADGEN_ONLINE", "PATH_DEEPLINK_ARTICLE_PAGE_OFFLINE", "PATH_DEEPLINK_ARTICLE_PAGE_ONLINE", "PATH_DEEPLINK_HTML_PAGE_ONLINE", "PATH_DEEPLINK_NATIVE_VIDEO_PORTRAIT", "PATH_DEEPLINK_NATIVE_VIDEO_BANNER", "PARAM_DEEPLINK_CREATIVE_ID", "MACRO_AUTO_CTE", "MACRO_AUTO_CTE_VALUE", "postClickExperienceOnlineDeepLinks", "", "getPostClickExperienceOnlineDeepLinks", "()Ljava/util/List;", "createDeeplink", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "createDeeplinkHtmlPage", "createDeeplinkNativeVideoScreen", "getType", "Lcom/truecaller/ads/postclickexperience/type/PostClickExperienceType;", "deepLink", "getInputData", "Lcom/truecaller/ads/postclickexperience/common/ui/PostClickExperienceInput;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "inputData", "inputData$ads_legacy_googlePlayRelease", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostClickExperienceDeeplink {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_CREATIVE_ID = "extraCreativeId";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_INPUT_DATA = "extraInputData";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_PARAMS = "extraParams";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_TYPE = "extraPostClickExperienceType";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MACRO_AUTO_CTE = "**auto_cte**";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MACRO_AUTO_CTE_VALUE = "true";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PARAM_DEEPLINK_CREATIVE_ID = "creativeId";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_ARTICLE_PAGE_OFFLINE = "article_page";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_LEADGEN_OFFLINE = "offline_leadgen";

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink INSTANCE = new com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_UNIFIED_LEADGEN_ONLINE = "online_leadgen";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_ARTICLE_PAGE_ONLINE = "online_article_page";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_HTML_PAGE_ONLINE = "html_page";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_NATIVE_VIDEO_PORTRAIT = "ads/native_portrait_video";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_DEEPLINK_NATIVE_VIDEO_BANNER = "ads/native_banner_video";

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> postClickExperienceOnlineDeepLinks = kotlin.collections.y.j(new java.lang.String[]{PATH_DEEPLINK_UNIFIED_LEADGEN_ONLINE, PATH_DEEPLINK_ARTICLE_PAGE_ONLINE, PATH_DEEPLINK_HTML_PAGE_ONLINE, PATH_DEEPLINK_NATIVE_VIDEO_PORTRAIT, PATH_DEEPLINK_NATIVE_VIDEO_BANNER});
    public static final int $stable = 8;

    private PostClickExperienceDeeplink() {
    }

    @com.airbnb.deeplinkdispatch.DeepLink({"truecaller://offline_leadgen/{creativeId}", "truecaller://online_leadgen/{creativeId}", "truecaller://article_page/{creativeId}", "truecaller://online_article_page/{creativeId}"})
    @org.jetbrains.annotations.Nullable
    public static final android.content.Intent createDeeplink(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        java.lang.String uri;
        com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink postClickExperienceDeeplink;
        com.truecaller.ads.postclickexperience.type.PostClickExperienceType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        android.net.Uri parse = android.net.Uri.parse(extras.getString("deep_link_uri"));
        if (parse != null && (uri = parse.toString()) != null && (type = (postClickExperienceDeeplink = INSTANCE).getType(uri)) != null) {
            com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput inputData = postClickExperienceDeeplink.getInputData(extras, type);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceActivity.class);
            intent.putExtra(EXTRA_INPUT_DATA, inputData);
            intent.putExtra(EXTRA_TYPE, type.name());
            intent.addFlags(268435456);
            return intent;
        }
        return null;
    }

    @com.airbnb.deeplinkdispatch.DeepLink({"truecaller://html_page/{creativeId}"})
    @org.jetbrains.annotations.Nullable
    public static final android.content.Intent createDeeplinkHtmlPage(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        java.lang.String uri;
        com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink postClickExperienceDeeplink;
        com.truecaller.ads.postclickexperience.type.PostClickExperienceType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        android.net.Uri parse = android.net.Uri.parse(extras.getString("deep_link_uri"));
        if (parse != null && (uri = parse.toString()) != null && (type = (postClickExperienceDeeplink = INSTANCE).getType(uri)) != null) {
            com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput inputData = postClickExperienceDeeplink.getInputData(extras, type);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.ads.postclickexperience.type.htmlpage.HtmlPageActivity.class);
            intent.putExtra(EXTRA_INPUT_DATA, inputData);
            intent.putExtra(EXTRA_TYPE, type.name());
            return intent;
        }
        return null;
    }

    @com.airbnb.deeplinkdispatch.DeepLink({"truecaller://ads/native_portrait_video/{creativeId}", "truecaller://ads/native_banner_video/{creativeId}"})
    @org.jetbrains.annotations.Nullable
    public static final android.content.Intent createDeeplinkNativeVideoScreen(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        java.lang.String uri;
        com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink postClickExperienceDeeplink;
        com.truecaller.ads.postclickexperience.type.PostClickExperienceType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        android.net.Uri parse = android.net.Uri.parse(extras.getString("deep_link_uri"));
        if (parse != null && (uri = parse.toString()) != null && (type = (postClickExperienceDeeplink = INSTANCE).getType(uri)) != null) {
            com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput inputData = postClickExperienceDeeplink.getInputData(extras, type);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.ads.postclickexperience.type.nativevideo.NativeVideoActivity.class);
            intent.putExtra(EXTRA_INPUT_DATA, inputData);
            intent.putExtra(EXTRA_TYPE, type.name());
            return intent;
        }
        return null;
    }

    private final com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput getInputData(android.os.Bundle extras, com.truecaller.ads.postclickexperience.type.PostClickExperienceType type) {
        java.lang.String string = extras.getString("campaignId");
        java.lang.String string2 = extras.getString(PARAM_DEEPLINK_CREATIVE_ID);
        java.lang.String string3 = extras.getString("placement");
        java.lang.String string4 = extras.getString("render_id");
        if (string4 == null) {
            string4 = t.c.p("toString(...)");
        }
        java.lang.String str = string4;
        java.lang.String string5 = extras.getString("autoCTE", "false");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(es.baz.o(es.baz.F(extras)));
        hashMap.remove("deep_link_uri");
        hashMap.remove(PARAM_DEEPLINK_CREATIVE_ID);
        boolean N = kotlin.collections.CollectionsKt.N(kotlin.collections.y.j(new com.truecaller.ads.postclickexperience.type.PostClickExperienceType[]{com.truecaller.ads.postclickexperience.type.PostClickExperienceType.OFFLINE_LEADGEN, com.truecaller.ads.postclickexperience.type.PostClickExperienceType.OFFLINE_ARTICLE_PAGE}), type);
        java.lang.String string6 = extras.getString("displayInfo");
        if (string2 != null) {
            if (N && string == null) {
                return null;
            }
            return new com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput(string, string2, string3, str, hashMap, N, string6, java.lang.Boolean.parseBoolean(string5));
        }
        return null;
    }

    private final com.truecaller.ads.postclickexperience.type.PostClickExperienceType getType(java.lang.String deepLink) {
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_ARTICLE_PAGE_ONLINE, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.ONLINE_ARTICLE_PAGE;
        }
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_ARTICLE_PAGE_OFFLINE, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.OFFLINE_ARTICLE_PAGE;
        }
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_LEADGEN_OFFLINE, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.OFFLINE_LEADGEN;
        }
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_UNIFIED_LEADGEN_ONLINE, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.ONLINE_LEADGEN;
        }
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_HTML_PAGE_ONLINE, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.ONLINE_HTML_PAGE;
        }
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_NATIVE_VIDEO_BANNER, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.ONLINE_NATIVE_PORTRAIT_VIDEO_WITH_IMAGE;
        }
        if (kotlin.text.StringsKt.N(deepLink, PATH_DEEPLINK_NATIVE_VIDEO_PORTRAIT, false)) {
            return com.truecaller.ads.postclickexperience.type.PostClickExperienceType.ONLINE_NATIVE_PORTRAIT_VIDEO;
        }
        return null;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPostClickExperienceOnlineDeepLinks() {
        return postClickExperienceOnlineDeepLinks;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput inputData$ads_legacy_googlePlayRelease(@org.jetbrains.annotations.NotNull android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            return (com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput) ((android.os.Parcelable) t80.g.q(extras, EXTRA_INPUT_DATA, com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput.class));
        }
        return null;
    }
}
