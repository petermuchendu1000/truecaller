package com.truecaller.common.network.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020RR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bM¨\u0006S"}, d2 = {"Lcom/truecaller/common/network/util/KnownEndpoints;", "", "key", "", "euHost", "nonEuHost", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "SEARCH", "CONTACTREQUEST", "PREMIUM", "CONTACT", "NOTIFICATION", "BATCHLOG", "PHONEBOOK", "TAGGING", "FILTER", "EDGE", "FEEDBACK", "API", "ADS_CAMPAIGN", "USERAPPS", "REFERRAL", "PROFILE", "LEADGEN", "BACKUP", "PUSHID", "IMAGES", "USERARCHIVE", "ACCOUNT", "ACCOUNT_ONBOARDING", "OPTOUT", "PRESENCE_GRPC", "PUSH_CALLER_ID_GRPC", "PROFILE_VIEW", "SPAM_URL", "MESSENGER", "MESSENGER_PREVIEW", "TRUE_HELPER", "CLIENT_SEARCH", "LAST_ACTIVITY", "VOIP", "ADS_ROUTER", "ADS_CONFIG_ENGINE", "ADS_AUCTION_ENGINE", "ADS_RULES", "DEVICE_SAFETY", "SEARCH_WARNINGS_GRPC", "INSIGHTS_LLM_PATTERNS_GRPC", "COMMENTS_GRPC", "INSIGHT_CATEGORIZER", "INSIGHT_FEATURE_REGISTRY", "MESSAGING_URL_INSPECTION", "ADS_LOGGER", "SDK_OAUTH_ACCOUNT", "VIDEO_CALLER_ID", "SURVEYS_GRPC", "CONTACT_REQUEST_GRPC", "ENTERPRISE_FEEDBACK_GRPC", "ENTERPRISE_BIZNUMBERS_GRPC", "ENTERPRISE_USER_FEEDBACK_GRPC", "CLOUD_TELEPHONY", "TELECOM_OPERATOR_DATA", "CONTACT_LIST_GRPC", "EMAIL_VERIFICATION_GRPC", "PROMO_CODE_GRPC", "RECOMMENDED_CONTACTS_GRPC", "FEATURE_FLAGS", "INSURANCE", "NATIONAL_ID_VERIFICATION", "SCAM_FEED", "FAMILY_GROUP", "FAMILY_PROTECTION_CONFIG", "FAMILY_PROTECTION_REMOTE_REJECT", "PREMIUM_CLIENT_RULES", "ENTERPRISE_BIFROST", "url", "Lokhttp3/HttpUrl;", "getHost", "domain", "Lcom/truecaller/common/network/KnownDomain;", "common-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class KnownEndpoints {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.network.util.KnownEndpoints[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String euHost;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String nonEuHost;
    public static final com.truecaller.common.network.util.KnownEndpoints SEARCH = new com.truecaller.common.network.util.KnownEndpoints("SEARCH", 0, "search5", "search5-eu", "search5-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints CONTACTREQUEST = new com.truecaller.common.network.util.KnownEndpoints("CONTACTREQUEST", 1, "contact-request", "contact-request-eu", "contact-request-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PREMIUM = new com.truecaller.common.network.util.KnownEndpoints("PREMIUM", 2, "premium", "premium-eu", "premium-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints CONTACT = new com.truecaller.common.network.util.KnownEndpoints("CONTACT", 3, "contact-upload4", "contact-upload4-eu", "contact-upload4-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints NOTIFICATION = new com.truecaller.common.network.util.KnownEndpoints("NOTIFICATION", 4, "notifications5", "notifications5-eu", "notifications5-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints BATCHLOG = new com.truecaller.common.network.util.KnownEndpoints("BATCHLOG", 5, "batchlogging4", "batchlogging4-eu", "batchlogging4-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PHONEBOOK = new com.truecaller.common.network.util.KnownEndpoints("PHONEBOOK", 6, "phonebook5", "phonebook5-eu", "phonebook5-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints TAGGING = new com.truecaller.common.network.util.KnownEndpoints("TAGGING", 7, "tagging5", "tagging5-eu", "tagging5-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints FILTER = new com.truecaller.common.network.util.KnownEndpoints("FILTER", 8, "filter-store4", "filter-store4-eu", "filter-store4-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints EDGE = new com.truecaller.common.network.util.KnownEndpoints("EDGE", 9, "edge-locations5", "endpoints-eu", "endpoints-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints FEEDBACK = new com.truecaller.common.network.util.KnownEndpoints("FEEDBACK", 10, "feedback", "feedback-eu", "feedback-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints API = new com.truecaller.common.network.util.KnownEndpoints("API", 11, "api4", "api4-eu", "api4-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ADS_CAMPAIGN = new com.truecaller.common.network.util.KnownEndpoints("ADS_CAMPAIGN", 12, "ads-segment", "ads-segment-profile-eu", "ads-segment-profile-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints USERAPPS = new com.truecaller.common.network.util.KnownEndpoints("USERAPPS", 13, "userapps", "userapps-eu", "userapps-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints REFERRAL = new com.truecaller.common.network.util.KnownEndpoints("REFERRAL", 14, "referrals", "referrals-eu", "referrals-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PROFILE = new com.truecaller.common.network.util.KnownEndpoints("PROFILE", 15, "profile4", "profile4-eu", "profile4-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints LEADGEN = new com.truecaller.common.network.util.KnownEndpoints("LEADGEN", 16, "leadgen", "leadgen-eu", "leadgen-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints BACKUP = new com.truecaller.common.network.util.KnownEndpoints("BACKUP", 17, "backup", "backup-eu", "backup-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PUSHID = new com.truecaller.common.network.util.KnownEndpoints("PUSHID", 18, "pushid", "pushid-eu", "pushid-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints IMAGES = new com.truecaller.common.network.util.KnownEndpoints("IMAGES", 19, "images", "images-eu", "images-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints USERARCHIVE = new com.truecaller.common.network.util.KnownEndpoints("USERARCHIVE", 20, "user-archive", "user-archive-eu", "user-archive-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ACCOUNT = new com.truecaller.common.network.util.KnownEndpoints("ACCOUNT", 21, "account", "account-eu", "account-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ACCOUNT_ONBOARDING = new com.truecaller.common.network.util.KnownEndpoints("ACCOUNT_ONBOARDING", 22, "account-onboarding", "account-onboarding-eu", "account-onboarding-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints OPTOUT = new com.truecaller.common.network.util.KnownEndpoints("OPTOUT", 23, "opt-out", "opt-out-eu", "opt-out-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PRESENCE_GRPC = new com.truecaller.common.network.util.KnownEndpoints("PRESENCE_GRPC", 24, "presence-grpc", "presence-grpc-eu", "presence-grpc-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PUSH_CALLER_ID_GRPC = new com.truecaller.common.network.util.KnownEndpoints("PUSH_CALLER_ID_GRPC", 25, "push-callerid", "push-callerid-eu", "push-callerid-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PROFILE_VIEW = new com.truecaller.common.network.util.KnownEndpoints("PROFILE_VIEW", 26, "profile-view", "profile-view-eu", "profile-view-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints SPAM_URL = new com.truecaller.common.network.util.KnownEndpoints("SPAM_URL", 27, "link-reports", "link-reports-eu", "link-reports-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints MESSENGER = new com.truecaller.common.network.util.KnownEndpoints("MESSENGER", 28, "messenger", "messenger-eu", "messenger-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints MESSENGER_PREVIEW = new com.truecaller.common.network.util.KnownEndpoints("MESSENGER_PREVIEW", 29, "messenger-previews", "messenger-previews-eu", "messenger-previews-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints TRUE_HELPER = new com.truecaller.common.network.util.KnownEndpoints("TRUE_HELPER", 30, "truehelper", "truehelper-eu", "truehelper-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints CLIENT_SEARCH = new com.truecaller.common.network.util.KnownEndpoints("CLIENT_SEARCH", 31, "client-search", "client-search-eu", "client-search-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints LAST_ACTIVITY = new com.truecaller.common.network.util.KnownEndpoints("LAST_ACTIVITY", 32, "lastactivity", "lastactivity-eu", "lastactivity-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints VOIP = new com.truecaller.common.network.util.KnownEndpoints("VOIP", 33, "voip", "voip-eu", "voip-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ADS_ROUTER = new com.truecaller.common.network.util.KnownEndpoints("ADS_ROUTER", 34, "ads-router", "ads-router-eu", "ads-router-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ADS_CONFIG_ENGINE = new com.truecaller.common.network.util.KnownEndpoints("ADS_CONFIG_ENGINE", 35, "ads-config-engine", "ads-config-engine-eu", "ads-config-engine-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ADS_AUCTION_ENGINE = new com.truecaller.common.network.util.KnownEndpoints("ADS_AUCTION_ENGINE", 36, "ads-auction-engine", "ads-auction-engine-eu", "ads-auction-engine-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ADS_RULES = new com.truecaller.common.network.util.KnownEndpoints("ADS_RULES", 37, "ads-rules", "placement-rules-eu", "placement-rules-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints DEVICE_SAFETY = new com.truecaller.common.network.util.KnownEndpoints("DEVICE_SAFETY", 38, "device-safety", "device-safety-eu", "device-safety-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints SEARCH_WARNINGS_GRPC = new com.truecaller.common.network.util.KnownEndpoints("SEARCH_WARNINGS_GRPC", 39, "search-warnings", "search-warnings-eu", "search-warnings-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints INSIGHTS_LLM_PATTERNS_GRPC = new com.truecaller.common.network.util.KnownEndpoints("INSIGHTS_LLM_PATTERNS_GRPC", 40, "message-classifier-patterns", "message-classifier-patterns-eu", "message-classifier-patterns-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints COMMENTS_GRPC = new com.truecaller.common.network.util.KnownEndpoints("COMMENTS_GRPC", 41, "comments", "comments-eu", "comments-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints INSIGHT_CATEGORIZER = new com.truecaller.common.network.util.KnownEndpoints("INSIGHT_CATEGORIZER", 42, "insights-categorizer", "insights-categorizer-eu", "insights-categorizer-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints INSIGHT_FEATURE_REGISTRY = new com.truecaller.common.network.util.KnownEndpoints("INSIGHT_FEATURE_REGISTRY", 43, "insights-registry", "insights-registry-eu", "insights-registry-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints MESSAGING_URL_INSPECTION = new com.truecaller.common.network.util.KnownEndpoints("MESSAGING_URL_INSPECTION", 44, "url-inspection", "url-inspection-eu", "url-inspection-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ADS_LOGGER = new com.truecaller.common.network.util.KnownEndpoints("ADS_LOGGER", 45, "ads-logger", "pixel", "pixel-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints SDK_OAUTH_ACCOUNT = new com.truecaller.common.network.util.KnownEndpoints("SDK_OAUTH_ACCOUNT", 46, "oauth-account", "oauth-account-eu", "oauth-account-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints VIDEO_CALLER_ID = new com.truecaller.common.network.util.KnownEndpoints("VIDEO_CALLER_ID", 47, "video-callerid", "video-callerid-eu", "video-callerid-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints SURVEYS_GRPC = new com.truecaller.common.network.util.KnownEndpoints("SURVEYS_GRPC", 48, "survey", "survey-eu", "survey-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints CONTACT_REQUEST_GRPC = new com.truecaller.common.network.util.KnownEndpoints("CONTACT_REQUEST_GRPC", 49, "contact-request-stateless", "contact-request-stateless-eu", "contact-request-stateless-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ENTERPRISE_FEEDBACK_GRPC = new com.truecaller.common.network.util.KnownEndpoints("ENTERPRISE_FEEDBACK_GRPC", 50, "enterprise-feedback", "enterprise-feedback-eu", "enterprise-feedback-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ENTERPRISE_BIZNUMBERS_GRPC = new com.truecaller.common.network.util.KnownEndpoints("ENTERPRISE_BIZNUMBERS_GRPC", 51, "enterprise-biznumbers", "enterprise-biznumbers-eu", "enterprise-biznumbers-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ENTERPRISE_USER_FEEDBACK_GRPC = new com.truecaller.common.network.util.KnownEndpoints("ENTERPRISE_USER_FEEDBACK_GRPC", 52, "enterprise-userfeedback", "enterprise-userfeedback-eu", "enterprise-userfeedback-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints CLOUD_TELEPHONY = new com.truecaller.common.network.util.KnownEndpoints("CLOUD_TELEPHONY", 53, "cloud-telephony", "cloud-telephony-eu", "cloud-telephony-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints TELECOM_OPERATOR_DATA = new com.truecaller.common.network.util.KnownEndpoints("TELECOM_OPERATOR_DATA", 54, "telecom-operator-data", "telecom-operator-data-eu", "telecom-operator-data-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints CONTACT_LIST_GRPC = new com.truecaller.common.network.util.KnownEndpoints("CONTACT_LIST_GRPC", 55, "contact-lists", "contact-lists-eu", "contact-lists-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints EMAIL_VERIFICATION_GRPC = new com.truecaller.common.network.util.KnownEndpoints("EMAIL_VERIFICATION_GRPC", 56, "email-verification", "email-verification-eu", "email-verification-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PROMO_CODE_GRPC = new com.truecaller.common.network.util.KnownEndpoints("PROMO_CODE_GRPC", 57, "promo", "promo-eu", "promo-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints RECOMMENDED_CONTACTS_GRPC = new com.truecaller.common.network.util.KnownEndpoints("RECOMMENDED_CONTACTS_GRPC", 58, "recommended-contacts", "recommended-contacts-eu", "recommended-contacts-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints FEATURE_FLAGS = new com.truecaller.common.network.util.KnownEndpoints("FEATURE_FLAGS", 59, "feature-flags", "feature-flags-eu", "feature-flags-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints INSURANCE = new com.truecaller.common.network.util.KnownEndpoints("INSURANCE", 60, "insurance", "insurance-eu", "insurance-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints NATIONAL_ID_VERIFICATION = new com.truecaller.common.network.util.KnownEndpoints("NATIONAL_ID_VERIFICATION", 61, "nationalidverification", "nationalidverification-eu", "nationalidverification-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints SCAM_FEED = new com.truecaller.common.network.util.KnownEndpoints("SCAM_FEED", 62, "true-community", "true-community-eu", "true-community-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints FAMILY_GROUP = new com.truecaller.common.network.util.KnownEndpoints("FAMILY_GROUP", 63, "familygroup", "familygroup-eu", "familygroup-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints FAMILY_PROTECTION_CONFIG = new com.truecaller.common.network.util.KnownEndpoints("FAMILY_PROTECTION_CONFIG", 64, "family-protection-config", "family-protection-config-eu", "family-protection-config-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints FAMILY_PROTECTION_REMOTE_REJECT = new com.truecaller.common.network.util.KnownEndpoints("FAMILY_PROTECTION_REMOTE_REJECT", 65, "family-protection-live-notifications", "family-protection-live-notifications-eu", "family-protection-live-notifications-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints PREMIUM_CLIENT_RULES = new com.truecaller.common.network.util.KnownEndpoints("PREMIUM_CLIENT_RULES", 66, "premium-client-rules", "premium-client-rules-eu", "premium-client-rules-noneu");
    public static final com.truecaller.common.network.util.KnownEndpoints ENTERPRISE_BIFROST = new com.truecaller.common.network.util.KnownEndpoints("ENTERPRISE_BIFROST", 67, "enterprise-bifrost", "enterprise-bifrost-eu", "enterprise-bifrost-noneu");

    private static final /* synthetic */ com.truecaller.common.network.util.KnownEndpoints[] $values() {
        return new com.truecaller.common.network.util.KnownEndpoints[]{SEARCH, CONTACTREQUEST, PREMIUM, CONTACT, NOTIFICATION, BATCHLOG, PHONEBOOK, TAGGING, FILTER, EDGE, FEEDBACK, API, ADS_CAMPAIGN, USERAPPS, REFERRAL, PROFILE, LEADGEN, BACKUP, PUSHID, IMAGES, USERARCHIVE, ACCOUNT, ACCOUNT_ONBOARDING, OPTOUT, PRESENCE_GRPC, PUSH_CALLER_ID_GRPC, PROFILE_VIEW, SPAM_URL, MESSENGER, MESSENGER_PREVIEW, TRUE_HELPER, CLIENT_SEARCH, LAST_ACTIVITY, VOIP, ADS_ROUTER, ADS_CONFIG_ENGINE, ADS_AUCTION_ENGINE, ADS_RULES, DEVICE_SAFETY, SEARCH_WARNINGS_GRPC, INSIGHTS_LLM_PATTERNS_GRPC, COMMENTS_GRPC, INSIGHT_CATEGORIZER, INSIGHT_FEATURE_REGISTRY, MESSAGING_URL_INSPECTION, ADS_LOGGER, SDK_OAUTH_ACCOUNT, VIDEO_CALLER_ID, SURVEYS_GRPC, CONTACT_REQUEST_GRPC, ENTERPRISE_FEEDBACK_GRPC, ENTERPRISE_BIZNUMBERS_GRPC, ENTERPRISE_USER_FEEDBACK_GRPC, CLOUD_TELEPHONY, TELECOM_OPERATOR_DATA, CONTACT_LIST_GRPC, EMAIL_VERIFICATION_GRPC, PROMO_CODE_GRPC, RECOMMENDED_CONTACTS_GRPC, FEATURE_FLAGS, INSURANCE, NATIONAL_ID_VERIFICATION, SCAM_FEED, FAMILY_GROUP, FAMILY_PROTECTION_CONFIG, FAMILY_PROTECTION_REMOTE_REJECT, PREMIUM_CLIENT_RULES, ENTERPRISE_BIFROST};
    }

    static {
        com.truecaller.common.network.util.KnownEndpoints[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private KnownEndpoints(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.key = str2;
        this.euHost = str3;
        this.nonEuHost = str4;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.network.util.KnownEndpoints valueOf(java.lang.String str) {
        return (com.truecaller.common.network.util.KnownEndpoints) java.lang.Enum.valueOf(com.truecaller.common.network.util.KnownEndpoints.class, str);
    }

    public static com.truecaller.common.network.util.KnownEndpoints[] values() {
        return (com.truecaller.common.network.util.KnownEndpoints[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHost(@org.jetbrains.annotations.NotNull com.truecaller.common.network.KnownDomain domain) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        int i = p31.qux.a[domain.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = this.nonEuHost;
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            str = this.euHost;
        }
        return h0.b.Q(str, ".truecaller.com");
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl url() {
        okhttp3.HttpUrl.Builder builder = new okhttp3.HttpUrl.Builder();
        builder.g("https");
        builder.d(this.key + ".truecaller.com");
        return builder.b();
    }
}
