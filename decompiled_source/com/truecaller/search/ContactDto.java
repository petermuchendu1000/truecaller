package com.truecaller.search;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/search/ContactDto;", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, "", "Lcom/truecaller/search/ContactDto$Contact;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Contact", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ContactDto {

    @bw.qux(com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY)
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.search.ContactDto.Contact> data;

    @kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b^\b\u0086\b\u0018\u00002\u00020\u0001:\u001a\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001Bó\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0016\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0016\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0016¢\u0006\u0004\b2\u00103J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u0011\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016HÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016HÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016HÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0016HÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0016HÆ\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0016HÆ\u0003J\u0011\u0010t\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0016HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010*HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010,HÆ\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0002\u0010ZJ\u0010\u0010z\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010{\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0016HÆ\u0003J¸\u0003\u0010|\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00162\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00162\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00162\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00162\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010}J\u0013\u0010~\u001a\u00020\u00142\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0080\u0001\u001a\u00020.HÖ\u0001J\n\u0010\u0081\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010BR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010IR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010IR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010IR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010IR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010IR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010IR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u001a\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010[\u001a\u0004\bY\u0010ZR\u001a\u0010/\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\b/\u0010FR\u001e\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010I¨\u0006\u008f\u0001"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact;", "", "id", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "transliteratedName", "handle", "altName", "gender", "about", "image", "jobTitle", "companyName", "access", "imId", "score", "", "cacheTtl", "ns", "manualCallerIdPrompt", "", "phones", "", "Lcom/truecaller/search/ContactDto$Contact$PhoneNumber;", "addresses", "Lcom/truecaller/search/ContactDto$Contact$Address;", "internetAddresses", "Lcom/truecaller/search/ContactDto$Contact$InternetAddress;", "badges", "tags", "Lcom/truecaller/search/ContactDto$Contact$Tag;", "sources", "Lcom/truecaller/search/ContactDto$Contact$Source;", "searchWarnings", "Lcom/truecaller/search/ContactDto$Contact$SearchWarning;", "surveys", "Lcom/truecaller/search/ContactDto$Contact$Survey;", "businessProfile", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile;", "spamInfo", "Lcom/truecaller/search/ContactDto$Contact$SpamInfo;", "feedback", "Lcom/truecaller/search/ContactDto$Contact$Feedback;", "senderId", "Lcom/truecaller/search/ContactDto$Contact$SenderId;", "category", "", "isSuspectedFraud", "electedTags", "Lcom/truecaller/search/ContactDto$Contact$ElectedTag;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/truecaller/search/ContactDto$Contact$BusinessProfile;Lcom/truecaller/search/ContactDto$Contact$SpamInfo;Lcom/truecaller/search/ContactDto$Contact$Feedback;Lcom/truecaller/search/ContactDto$Contact$SenderId;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getTransliteratedName", "getHandle", "getAltName", "getGender", "getAbout", "getImage", "getJobTitle", "getCompanyName", "getAccess", "getImId", "getScore", "()Ljava/lang/Number;", "getCacheTtl", "getNs", "getManualCallerIdPrompt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhones", "()Ljava/util/List;", "getAddresses", "getInternetAddresses", "getBadges", "getTags", "getSources", "getSearchWarnings", "getSurveys", "getBusinessProfile", "()Lcom/truecaller/search/ContactDto$Contact$BusinessProfile;", "getSpamInfo", "()Lcom/truecaller/search/ContactDto$Contact$SpamInfo;", "getFeedback", "()Lcom/truecaller/search/ContactDto$Contact$Feedback;", "getSenderId", "()Lcom/truecaller/search/ContactDto$Contact$SenderId;", "getCategory", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getElectedTags", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/truecaller/search/ContactDto$Contact$BusinessProfile;Lcom/truecaller/search/ContactDto$Contact$SpamInfo;Lcom/truecaller/search/ContactDto$Contact$Feedback;Lcom/truecaller/search/ContactDto$Contact$SenderId;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/truecaller/search/ContactDto$Contact;", "equals", "other", "hashCode", "toString", "PhoneNumber", "Address", "InternetAddress", "Source", "Tag", "Note", "BusinessProfile", "SpamInfo", "SearchWarning", "Survey", "Feedback", "SenderId", "ElectedTag", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Contact {

        @bw.qux("about")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String about;

        @bw.qux("access")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String access;

        @bw.qux("addresses")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.Address> addresses;

        @bw.qux("altName")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String altName;

        @bw.qux("badges")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> badges;

        @bw.qux("businessProfile")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile;

        @bw.qux("cacheTtl")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Number cacheTtl;

        @bw.qux("category")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer category;

        @bw.qux("companyName")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String companyName;

        @bw.qux("electedTags")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> electedTags;

        @bw.qux("feedback")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.search.ContactDto.Contact.Feedback feedback;

        @bw.qux("gender")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String gender;

        @bw.qux("handle")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String handle;

        @bw.qux("id")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String id;

        @bw.qux("imId")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String imId;

        @bw.qux("image")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String image;

        @bw.qux("internetAddresses")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> internetAddresses;

        @bw.qux("isFraud")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSuspectedFraud;

        @bw.qux("jobTitle")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String jobTitle;

        @bw.qux("manualCallerIdPrompt")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean manualCallerIdPrompt;

        @bw.qux(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME)
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name;

        @bw.qux("ns")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Number ns;

        @bw.qux("phones")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> phones;

        @bw.qux("score")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Number score;

        @bw.qux("searchWarnings")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> searchWarnings;

        @bw.qux("senderId")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.search.ContactDto.Contact.SenderId senderId;

        @bw.qux("sources")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.Source> sources;

        @bw.qux("spamInfo")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo;

        @bw.qux("surveys")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.Survey> surveys;

        @bw.qux("tags")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.truecaller.search.ContactDto.Contact.Tag> tags;

        @bw.qux("transliteratedName")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String transliteratedName;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0004\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003Ju\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006*"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Address;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "", "street", "zipCode", "city", "area", "countryCode", "timeZone", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;)V", "getType", "()Ljava/lang/String;", "getStreet", "getZipCode", "getCity", "getArea", "getCountryCode", "getTimeZone", "getLatitude", "()Ljava/lang/Number;", "getLongitude", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Address {

            @bw.qux("area")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String area;

            @bw.qux("city")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String city;

            @bw.qux("countryCode")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String countryCode;

            @bw.qux("latitude")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Number latitude;

            @bw.qux("longitude")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Number longitude;

            @bw.qux("street")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String street;

            @bw.qux("timeZone")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String timeZone;

            @bw.qux(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE)
            @org.jetbrains.annotations.Nullable
            private final java.lang.String type;

            @bw.qux("zipCode")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String zipCode;

            public Address(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6, @org.jetbrains.annotations.Nullable java.lang.String str7, @org.jetbrains.annotations.Nullable java.lang.Number number, @org.jetbrains.annotations.Nullable java.lang.Number number2) {
                this.type = str;
                this.street = str2;
                this.zipCode = str3;
                this.city = str4;
                this.area = str5;
                this.countryCode = str6;
                this.timeZone = str7;
                this.latitude = number;
                this.longitude = number2;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.Address copy$default(com.truecaller.search.ContactDto.Contact.Address address, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Number number, java.lang.Number number2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = address.type;
                }
                if ((i & 2) != 0) {
                    str2 = address.street;
                }
                if ((i & 4) != 0) {
                    str3 = address.zipCode;
                }
                if ((i & 8) != 0) {
                    str4 = address.city;
                }
                if ((i & 16) != 0) {
                    str5 = address.area;
                }
                if ((i & 32) != 0) {
                    str6 = address.countryCode;
                }
                if ((i & 64) != 0) {
                    str7 = address.timeZone;
                }
                if ((i & com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE) != 0) {
                    number = address.latitude;
                }
                if ((i & 256) != 0) {
                    number2 = address.longitude;
                }
                java.lang.Number number3 = number;
                java.lang.Number number4 = number2;
                java.lang.String str8 = str6;
                java.lang.String str9 = str7;
                java.lang.String str10 = str5;
                java.lang.String str11 = str3;
                return address.copy(str, str2, str11, str4, str10, str8, str9, number3, number4);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getType() {
                return this.type;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.String getStreet() {
                return this.street;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getZipCode() {
                return this.zipCode;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.String getCity() {
                return this.city;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component5, reason: from getter */
            public final java.lang.String getArea() {
                return this.area;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component6, reason: from getter */
            public final java.lang.String getCountryCode() {
                return this.countryCode;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component7, reason: from getter */
            public final java.lang.String getTimeZone() {
                return this.timeZone;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component8, reason: from getter */
            public final java.lang.Number getLatitude() {
                return this.latitude;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component9, reason: from getter */
            public final java.lang.Number getLongitude() {
                return this.longitude;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.Address copy(@org.jetbrains.annotations.Nullable java.lang.String type, @org.jetbrains.annotations.Nullable java.lang.String street, @org.jetbrains.annotations.Nullable java.lang.String zipCode, @org.jetbrains.annotations.Nullable java.lang.String city, @org.jetbrains.annotations.Nullable java.lang.String area, @org.jetbrains.annotations.Nullable java.lang.String countryCode, @org.jetbrains.annotations.Nullable java.lang.String timeZone, @org.jetbrains.annotations.Nullable java.lang.Number latitude, @org.jetbrains.annotations.Nullable java.lang.Number longitude) {
                return new com.truecaller.search.ContactDto.Contact.Address(type, street, zipCode, city, area, countryCode, timeZone, latitude, longitude);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.Address)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.Address address = (com.truecaller.search.ContactDto.Contact.Address) other;
                return kotlin.jvm.internal.Intrinsics.b(this.type, address.type) && kotlin.jvm.internal.Intrinsics.b(this.street, address.street) && kotlin.jvm.internal.Intrinsics.b(this.zipCode, address.zipCode) && kotlin.jvm.internal.Intrinsics.b(this.city, address.city) && kotlin.jvm.internal.Intrinsics.b(this.area, address.area) && kotlin.jvm.internal.Intrinsics.b(this.countryCode, address.countryCode) && kotlin.jvm.internal.Intrinsics.b(this.timeZone, address.timeZone) && kotlin.jvm.internal.Intrinsics.b(this.latitude, address.latitude) && kotlin.jvm.internal.Intrinsics.b(this.longitude, address.longitude);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getArea() {
                return this.area;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCity() {
                return this.city;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCountryCode() {
                return this.countryCode;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Number getLatitude() {
                return this.latitude;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Number getLongitude() {
                return this.longitude;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getStreet() {
                return this.street;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getTimeZone() {
                return this.timeZone;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getType() {
                return this.type;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getZipCode() {
                return this.zipCode;
            }

            public int hashCode() {
                java.lang.String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.street;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.zipCode;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.String str4 = this.city;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                java.lang.String str5 = this.area;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                java.lang.String str6 = this.countryCode;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                java.lang.String str7 = this.timeZone;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                java.lang.Number number = this.latitude;
                int hashCode8 = (hashCode7 + (number == null ? 0 : number.hashCode())) * 31;
                java.lang.Number number2 = this.longitude;
                return hashCode8 + (number2 != null ? number2.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.type;
                java.lang.String str2 = this.street;
                java.lang.String str3 = this.zipCode;
                java.lang.String str4 = this.city;
                java.lang.String str5 = this.area;
                java.lang.String str6 = this.countryCode;
                java.lang.String str7 = this.timeZone;
                java.lang.Number number = this.latitude;
                java.lang.Number number2 = this.longitude;
                java.lang.StringBuilder E = ro0.f.E("Address(type=", str, ", street=", str2, ", zipCode=");
                bar.E(E, str3, ", city=", str4, ", area=");
                bar.E(E, str5, ", countryCode=", str6, ", timeZone=");
                E.append(str7);
                E.append(", latitude=");
                E.append(number);
                E.append(", longitude=");
                E.append(number2);
                E.append(")");
                return E.toString();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0007DEFGHIJBÇ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\nHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0019HÆ\u0003Jç\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006K"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile;", "", "companySize", "", "branch", "department", "swishNumber", "landLine", "backgroundColor", "imageUrls", "", "score", "openHours", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$OpenHours;", "mediaCallerIDs", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MediaCallerIDs;", "appStores", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$AppStores;", "brandedMedia", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$BrandedMedia;", "businessMessages", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$BusinessMessage;", "alternatePhoneNumbers", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$AlternatePhoneNumber;", "messageCta", "Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MessageCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MessageCta;)V", "getCompanySize", "()Ljava/lang/String;", "getBranch", "getDepartment", "getSwishNumber", "getLandLine", "getBackgroundColor", "getImageUrls", "()Ljava/util/List;", "getScore", "getOpenHours", "getMediaCallerIDs", "getAppStores", "getBrandedMedia", "getBusinessMessages", "getAlternatePhoneNumbers", "getMessageCta", "()Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MessageCta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "OpenHours", "MediaCallerIDs", "BusinessMessage", "AlternatePhoneNumber", "MessageCta", "AppStores", "BrandedMedia", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class BusinessProfile {

            @bw.qux("alternatePhones")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> alternatePhoneNumbers;

            @bw.qux("appStores")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> appStores;

            @bw.qux("backgroundColor")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String backgroundColor;

            @bw.qux("branch")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String branch;

            @bw.qux("brandedMedia")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> brandedMedia;

            @bw.qux("businessMessages")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> businessMessages;

            @bw.qux("companySize")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String companySize;

            @bw.qux("department")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String department;

            @bw.qux("imageUrls")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<java.lang.String> imageUrls;

            @bw.qux("landLine")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String landLine;

            @bw.qux("mediaCallerIDs")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> mediaCallerIDs;

            @bw.qux("messageCta")
            @org.jetbrains.annotations.Nullable
            private final com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta;

            @bw.qux("openHours")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> openHours;

            @bw.qux("score")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String score;

            @bw.qux("swishNumber")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String swishNumber;

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$AlternatePhoneNumber;", "", "number", "", "<init>", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class AlternatePhoneNumber {

                @bw.qux(com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse.OAUTH_SCOPE_PHONE)
                @org.jetbrains.annotations.Nullable
                private final java.lang.String number;

                public AlternatePhoneNumber(@org.jetbrains.annotations.Nullable java.lang.String str) {
                    this.number = str;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber alternatePhoneNumber, java.lang.String str, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = alternatePhoneNumber.number;
                    }
                    return alternatePhoneNumber.copy(str);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getNumber() {
                    return this.number;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber copy(@org.jetbrains.annotations.Nullable java.lang.String number) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber(number);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber) && kotlin.jvm.internal.Intrinsics.b(this.number, ((com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber) other).number);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getNumber() {
                    return this.number;
                }

                public int hashCode() {
                    java.lang.String str = this.number;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return bar.t("AlternatePhoneNumber(number=", this.number, ")");
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$AppStores;", "", "url", "", "linkType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getLinkType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class AppStores {

                @bw.qux("linkType")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String linkType;

                @bw.qux("url")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String url;

                public AppStores(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
                    this.url = str;
                    this.linkType = str2;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores appStores, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = appStores.url;
                    }
                    if ((i & 2) != 0) {
                        str2 = appStores.linkType;
                    }
                    return appStores.copy(str, str2);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getUrl() {
                    return this.url;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getLinkType() {
                    return this.linkType;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores copy(@org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String linkType) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores(url, linkType);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores appStores = (com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.url, appStores.url) && kotlin.jvm.internal.Intrinsics.b(this.linkType, appStores.linkType);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getLinkType() {
                    return this.linkType;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    java.lang.String str = this.url;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.linkType;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return y.o.e("AppStores(url=", this.url, ", linkType=", this.linkType, ")");
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$BrandedMedia;", "", "url", "", "mediaType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMediaType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class BrandedMedia {

                @bw.qux("mediaType")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String mediaType;

                @bw.qux("url")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String url;

                public BrandedMedia(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
                    this.url = str;
                    this.mediaType = str2;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia brandedMedia, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = brandedMedia.url;
                    }
                    if ((i & 2) != 0) {
                        str2 = brandedMedia.mediaType;
                    }
                    return brandedMedia.copy(str, str2);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getUrl() {
                    return this.url;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getMediaType() {
                    return this.mediaType;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia copy(@org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String mediaType) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia(url, mediaType);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia brandedMedia = (com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.url, brandedMedia.url) && kotlin.jvm.internal.Intrinsics.b(this.mediaType, brandedMedia.mediaType);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getMediaType() {
                    return this.mediaType;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    java.lang.String str = this.url;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.mediaType;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return y.o.e("BrandedMedia(url=", this.url, ", mediaType=", this.mediaType, ")");
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$BusinessMessage;", "", "text", "", "messageType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getMessageType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class BusinessMessage {

                @bw.qux("messageType")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String messageType;

                @bw.qux("text")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String text;

                public BusinessMessage(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
                    this.text = str;
                    this.messageType = str2;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage businessMessage, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = businessMessage.text;
                    }
                    if ((i & 2) != 0) {
                        str2 = businessMessage.messageType;
                    }
                    return businessMessage.copy(str, str2);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getText() {
                    return this.text;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getMessageType() {
                    return this.messageType;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage copy(@org.jetbrains.annotations.Nullable java.lang.String text, @org.jetbrains.annotations.Nullable java.lang.String messageType) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage(text, messageType);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage businessMessage = (com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.text, businessMessage.text) && kotlin.jvm.internal.Intrinsics.b(this.messageType, businessMessage.messageType);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getMessageType() {
                    return this.messageType;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getText() {
                    return this.text;
                }

                public int hashCode() {
                    java.lang.String str = this.text;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.messageType;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return y.o.e("BusinessMessage(text=", this.text, ", messageType=", this.messageType, ")");
                }
            }

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MediaCallerIDs;", "", "url", "", "mediaType", com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ORIENTATION, "ttl", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMediaType", "getOrientation", "getTtl", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MediaCallerIDs;", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class MediaCallerIDs {

                @bw.qux("id")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String id;

                @bw.qux("mediaType")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String mediaType;

                @bw.qux(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ORIENTATION)
                @org.jetbrains.annotations.Nullable
                private final java.lang.String orientation;

                @bw.qux("ttl")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Long ttl;

                @bw.qux("url")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String url;

                public MediaCallerIDs(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.String str4) {
                    this.url = str;
                    this.mediaType = str2;
                    this.orientation = str3;
                    this.ttl = l;
                    this.id = str4;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs mediaCallerIDs, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = mediaCallerIDs.url;
                    }
                    if ((i & 2) != 0) {
                        str2 = mediaCallerIDs.mediaType;
                    }
                    if ((i & 4) != 0) {
                        str3 = mediaCallerIDs.orientation;
                    }
                    if ((i & 8) != 0) {
                        l = mediaCallerIDs.ttl;
                    }
                    if ((i & 16) != 0) {
                        str4 = mediaCallerIDs.id;
                    }
                    java.lang.String str5 = str4;
                    java.lang.String str6 = str3;
                    return mediaCallerIDs.copy(str, str2, str6, l, str5);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getUrl() {
                    return this.url;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getMediaType() {
                    return this.mediaType;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component3, reason: from getter */
                public final java.lang.String getOrientation() {
                    return this.orientation;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component4, reason: from getter */
                public final java.lang.Long getTtl() {
                    return this.ttl;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component5, reason: from getter */
                public final java.lang.String getId() {
                    return this.id;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs copy(@org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String mediaType, @org.jetbrains.annotations.Nullable java.lang.String orientation, @org.jetbrains.annotations.Nullable java.lang.Long ttl, @org.jetbrains.annotations.Nullable java.lang.String id) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs(url, mediaType, orientation, ttl, id);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs mediaCallerIDs = (com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.url, mediaCallerIDs.url) && kotlin.jvm.internal.Intrinsics.b(this.mediaType, mediaCallerIDs.mediaType) && kotlin.jvm.internal.Intrinsics.b(this.orientation, mediaCallerIDs.orientation) && kotlin.jvm.internal.Intrinsics.b(this.ttl, mediaCallerIDs.ttl) && kotlin.jvm.internal.Intrinsics.b(this.id, mediaCallerIDs.id);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getId() {
                    return this.id;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getMediaType() {
                    return this.mediaType;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getOrientation() {
                    return this.orientation;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.Long getTtl() {
                    return this.ttl;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    java.lang.String str = this.url;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.mediaType;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    java.lang.String str3 = this.orientation;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    java.lang.Long l = this.ttl;
                    int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                    java.lang.String str4 = this.id;
                    return hashCode4 + (str4 != null ? str4.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    java.lang.String str = this.url;
                    java.lang.String str2 = this.mediaType;
                    java.lang.String str3 = this.orientation;
                    java.lang.Long l = this.ttl;
                    java.lang.String str4 = this.id;
                    java.lang.StringBuilder E = ro0.f.E("MediaCallerIDs(url=", str, ", mediaType=", str2, ", orientation=");
                    E.append(str3);
                    E.append(", ttl=");
                    E.append(l);
                    E.append(", id=");
                    return bar.v(str4, ")", E);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MessageCta;", "", "messagingHandle", "", "channelType", "channelTypeValue", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMessagingHandle", "()Ljava/lang/String;", "getChannelType", "getChannelTypeValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$MessageCta;", "equals", "", "other", "hashCode", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class MessageCta {

                @bw.qux("channelType")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String channelType;

                @bw.qux("channelTypeValue")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Integer channelTypeValue;

                @bw.qux("messagingHandle")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String messagingHandle;

                public MessageCta(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
                    this.messagingHandle = str;
                    this.channelType = str2;
                    this.channelTypeValue = num;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = messageCta.messagingHandle;
                    }
                    if ((i & 2) != 0) {
                        str2 = messageCta.channelType;
                    }
                    if ((i & 4) != 0) {
                        num = messageCta.channelTypeValue;
                    }
                    return messageCta.copy(str, str2, num);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getMessagingHandle() {
                    return this.messagingHandle;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getChannelType() {
                    return this.channelType;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component3, reason: from getter */
                public final java.lang.Integer getChannelTypeValue() {
                    return this.channelTypeValue;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta copy(@org.jetbrains.annotations.Nullable java.lang.String messagingHandle, @org.jetbrains.annotations.Nullable java.lang.String channelType, @org.jetbrains.annotations.Nullable java.lang.Integer channelTypeValue) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta(messagingHandle, channelType, channelTypeValue);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta = (com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.messagingHandle, messageCta.messagingHandle) && kotlin.jvm.internal.Intrinsics.b(this.channelType, messageCta.channelType) && kotlin.jvm.internal.Intrinsics.b(this.channelTypeValue, messageCta.channelTypeValue);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getChannelType() {
                    return this.channelType;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.Integer getChannelTypeValue() {
                    return this.channelTypeValue;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getMessagingHandle() {
                    return this.messagingHandle;
                }

                public int hashCode() {
                    java.lang.String str = this.messagingHandle;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.channelType;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    java.lang.Integer num = this.channelTypeValue;
                    return hashCode2 + (num != null ? num.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    java.lang.String str = this.messagingHandle;
                    java.lang.String str2 = this.channelType;
                    return com.appsflyer.internal.e.m(ro0.f.E("MessageCta(messagingHandle=", str, ", channelType=", str2, ", channelTypeValue="), this.channelTypeValue, ")");
                }
            }

            @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$BusinessProfile$OpenHours;", "", "weekdays", "", "", "opens", "", "closes", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getWeekdays", "()Ljava/util/List;", "getOpens", "()Ljava/lang/String;", "getCloses", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class OpenHours {

                @bw.qux("closes")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String closes;

                @bw.qux("opens")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String opens;

                @bw.qux("weekdays")
                @org.jetbrains.annotations.Nullable
                private final java.util.List<java.lang.Integer> weekdays;

                public OpenHours(@org.jetbrains.annotations.Nullable java.util.List<java.lang.Integer> list, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
                    this.weekdays = list;
                    this.opens = str;
                    this.closes = str2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours copy$default(com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours openHours, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        list = openHours.weekdays;
                    }
                    if ((i & 2) != 0) {
                        str = openHours.opens;
                    }
                    if ((i & 4) != 0) {
                        str2 = openHours.closes;
                    }
                    return openHours.copy(list, str, str2);
                }

                @org.jetbrains.annotations.Nullable
                public final java.util.List<java.lang.Integer> component1() {
                    return this.weekdays;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getOpens() {
                    return this.opens;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component3, reason: from getter */
                public final java.lang.String getCloses() {
                    return this.closes;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours copy(@org.jetbrains.annotations.Nullable java.util.List<java.lang.Integer> weekdays, @org.jetbrains.annotations.Nullable java.lang.String opens, @org.jetbrains.annotations.Nullable java.lang.String closes) {
                    return new com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours(weekdays, opens, closes);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours openHours = (com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.weekdays, openHours.weekdays) && kotlin.jvm.internal.Intrinsics.b(this.opens, openHours.opens) && kotlin.jvm.internal.Intrinsics.b(this.closes, openHours.closes);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getCloses() {
                    return this.closes;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getOpens() {
                    return this.opens;
                }

                @org.jetbrains.annotations.Nullable
                public final java.util.List<java.lang.Integer> getWeekdays() {
                    return this.weekdays;
                }

                public int hashCode() {
                    java.util.List<java.lang.Integer> list = this.weekdays;
                    int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                    java.lang.String str = this.opens;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    java.lang.String str2 = this.closes;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    java.util.List<java.lang.Integer> list = this.weekdays;
                    java.lang.String str = this.opens;
                    java.lang.String str2 = this.closes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenHours(weekdays=");
                    sb.append(list);
                    sb.append(", opens=");
                    sb.append(str);
                    sb.append(", closes=");
                    return bar.v(str2, ")", sb);
                }
            }

            public BusinessProfile(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, @org.jetbrains.annotations.Nullable java.lang.String str7, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> list2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> list3, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> list4, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> list5, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> list6, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> list7, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta) {
                this.companySize = str;
                this.branch = str2;
                this.department = str3;
                this.swishNumber = str4;
                this.landLine = str5;
                this.backgroundColor = str6;
                this.imageUrls = list;
                this.score = str7;
                this.openHours = list2;
                this.mediaCallerIDs = list3;
                this.appStores = list4;
                this.brandedMedia = list5;
                this.businessMessages = list6;
                this.alternatePhoneNumbers = list7;
                this.messageCta = messageCta;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCompanySize() {
                return this.companySize;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> component10() {
                return this.mediaCallerIDs;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> component11() {
                return this.appStores;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> component12() {
                return this.brandedMedia;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> component13() {
                return this.businessMessages;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> component14() {
                return this.alternatePhoneNumbers;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component15, reason: from getter */
            public final com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta getMessageCta() {
                return this.messageCta;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.String getBranch() {
                return this.branch;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getDepartment() {
                return this.department;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.String getSwishNumber() {
                return this.swishNumber;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component5, reason: from getter */
            public final java.lang.String getLandLine() {
                return this.landLine;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component6, reason: from getter */
            public final java.lang.String getBackgroundColor() {
                return this.backgroundColor;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.String> component7() {
                return this.imageUrls;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component8, reason: from getter */
            public final java.lang.String getScore() {
                return this.score;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> component9() {
                return this.openHours;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.BusinessProfile copy(@org.jetbrains.annotations.Nullable java.lang.String companySize, @org.jetbrains.annotations.Nullable java.lang.String branch, @org.jetbrains.annotations.Nullable java.lang.String department, @org.jetbrains.annotations.Nullable java.lang.String swishNumber, @org.jetbrains.annotations.Nullable java.lang.String landLine, @org.jetbrains.annotations.Nullable java.lang.String backgroundColor, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> imageUrls, @org.jetbrains.annotations.Nullable java.lang.String score, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> openHours, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> mediaCallerIDs, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> appStores, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> brandedMedia, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> businessMessages, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> alternatePhoneNumbers, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta) {
                return new com.truecaller.search.ContactDto.Contact.BusinessProfile(companySize, branch, department, swishNumber, landLine, backgroundColor, imageUrls, score, openHours, mediaCallerIDs, appStores, brandedMedia, businessMessages, alternatePhoneNumbers, messageCta);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile = (com.truecaller.search.ContactDto.Contact.BusinessProfile) other;
                return kotlin.jvm.internal.Intrinsics.b(this.companySize, businessProfile.companySize) && kotlin.jvm.internal.Intrinsics.b(this.branch, businessProfile.branch) && kotlin.jvm.internal.Intrinsics.b(this.department, businessProfile.department) && kotlin.jvm.internal.Intrinsics.b(this.swishNumber, businessProfile.swishNumber) && kotlin.jvm.internal.Intrinsics.b(this.landLine, businessProfile.landLine) && kotlin.jvm.internal.Intrinsics.b(this.backgroundColor, businessProfile.backgroundColor) && kotlin.jvm.internal.Intrinsics.b(this.imageUrls, businessProfile.imageUrls) && kotlin.jvm.internal.Intrinsics.b(this.score, businessProfile.score) && kotlin.jvm.internal.Intrinsics.b(this.openHours, businessProfile.openHours) && kotlin.jvm.internal.Intrinsics.b(this.mediaCallerIDs, businessProfile.mediaCallerIDs) && kotlin.jvm.internal.Intrinsics.b(this.appStores, businessProfile.appStores) && kotlin.jvm.internal.Intrinsics.b(this.brandedMedia, businessProfile.brandedMedia) && kotlin.jvm.internal.Intrinsics.b(this.businessMessages, businessProfile.businessMessages) && kotlin.jvm.internal.Intrinsics.b(this.alternatePhoneNumbers, businessProfile.alternatePhoneNumbers) && kotlin.jvm.internal.Intrinsics.b(this.messageCta, businessProfile.messageCta);
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> getAlternatePhoneNumbers() {
                return this.alternatePhoneNumbers;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> getAppStores() {
                return this.appStores;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getBackgroundColor() {
                return this.backgroundColor;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getBranch() {
                return this.branch;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> getBrandedMedia() {
                return this.brandedMedia;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> getBusinessMessages() {
                return this.businessMessages;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCompanySize() {
                return this.companySize;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getDepartment() {
                return this.department;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.String> getImageUrls() {
                return this.imageUrls;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getLandLine() {
                return this.landLine;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> getMediaCallerIDs() {
                return this.mediaCallerIDs;
            }

            @org.jetbrains.annotations.Nullable
            public final com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta getMessageCta() {
                return this.messageCta;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> getOpenHours() {
                return this.openHours;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getScore() {
                return this.score;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getSwishNumber() {
                return this.swishNumber;
            }

            public int hashCode() {
                java.lang.String str = this.companySize;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.branch;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.department;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.String str4 = this.swishNumber;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                java.lang.String str5 = this.landLine;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                java.lang.String str6 = this.backgroundColor;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                java.util.List<java.lang.String> list = this.imageUrls;
                int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
                java.lang.String str7 = this.score;
                int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> list2 = this.openHours;
                int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> list3 = this.mediaCallerIDs;
                int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> list4 = this.appStores;
                int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> list5 = this.brandedMedia;
                int hashCode12 = (hashCode11 + (list5 == null ? 0 : list5.hashCode())) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> list6 = this.businessMessages;
                int hashCode13 = (hashCode12 + (list6 == null ? 0 : list6.hashCode())) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> list7 = this.alternatePhoneNumbers;
                int hashCode14 = (hashCode13 + (list7 == null ? 0 : list7.hashCode())) * 31;
                com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta = this.messageCta;
                return hashCode14 + (messageCta != null ? messageCta.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.companySize;
                java.lang.String str2 = this.branch;
                java.lang.String str3 = this.department;
                java.lang.String str4 = this.swishNumber;
                java.lang.String str5 = this.landLine;
                java.lang.String str6 = this.backgroundColor;
                java.util.List<java.lang.String> list = this.imageUrls;
                java.lang.String str7 = this.score;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.OpenHours> list2 = this.openHours;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> list3 = this.mediaCallerIDs;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> list4 = this.appStores;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> list5 = this.brandedMedia;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> list6 = this.businessMessages;
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> list7 = this.alternatePhoneNumbers;
                com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta = this.messageCta;
                java.lang.StringBuilder E = ro0.f.E("BusinessProfile(companySize=", str, ", branch=", str2, ", department=");
                bar.E(E, str3, ", swishNumber=", str4, ", landLine=");
                bar.E(E, str5, ", backgroundColor=", str6, ", imageUrls=");
                os0.bar.B(", score=", str7, ", openHours=", E, list);
                com.ironsource.adqualitysdk.sdk.i.bar.y(E, list2, ", mediaCallerIDs=", list3, ", appStores=");
                com.ironsource.adqualitysdk.sdk.i.bar.y(E, list4, ", brandedMedia=", list5, ", businessMessages=");
                com.ironsource.adqualitysdk.sdk.i.bar.y(E, list6, ", alternatePhoneNumbers=", list7, ", messageCta=");
                E.append(messageCta);
                E.append(")");
                return E.toString();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$ElectedTag;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class ElectedTag {

            @bw.qux("value")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String value;

            public ElectedTag(@org.jetbrains.annotations.Nullable java.lang.String str) {
                this.value = str;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.ElectedTag copy$default(com.truecaller.search.ContactDto.Contact.ElectedTag electedTag, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = electedTag.value;
                }
                return electedTag.copy(str);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getValue() {
                return this.value;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.ElectedTag copy(@org.jetbrains.annotations.Nullable java.lang.String value) {
                return new com.truecaller.search.ContactDto.Contact.ElectedTag(value);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.truecaller.search.ContactDto.Contact.ElectedTag) && kotlin.jvm.internal.Intrinsics.b(this.value, ((com.truecaller.search.ContactDto.Contact.ElectedTag) other).value);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getValue() {
                return this.value;
            }

            public int hashCode() {
                java.lang.String str = this.value;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return bar.t("ElectedTag(value=", this.value, ")");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Feedback;", "", "Comments", "Reviews", "Lcom/truecaller/search/ContactDto$Contact$Feedback$Comments;", "Lcom/truecaller/search/ContactDto$Contact$Feedback$Reviews;", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public interface Feedback {

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Feedback$Comments;", "Lcom/truecaller/search/ContactDto$Contact$Feedback;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class Comments implements com.truecaller.search.ContactDto.Contact.Feedback {

                @bw.qux("count")
                private final int count;

                public Comments(int i) {
                    this.count = i;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.Feedback.Comments copy$default(com.truecaller.search.ContactDto.Contact.Feedback.Comments comments, int i, int i2, java.lang.Object obj) {
                    if ((i2 & 1) != 0) {
                        i = comments.count;
                    }
                    return comments.copy(i);
                }

                /* renamed from: component1, reason: from getter */
                public final int getCount() {
                    return this.count;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.Feedback.Comments copy(int count) {
                    return new com.truecaller.search.ContactDto.Contact.Feedback.Comments(count);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.truecaller.search.ContactDto.Contact.Feedback.Comments) && this.count == ((com.truecaller.search.ContactDto.Contact.Feedback.Comments) other).count;
                }

                public final int getCount() {
                    return this.count;
                }

                public int hashCode() {
                    return this.count;
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return y.o.d(this.count, "Comments(count=", ")");
                }
            }

            @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Feedback$Reviews;", "Lcom/truecaller/search/ContactDto$Contact$Feedback;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class Reviews implements com.truecaller.search.ContactDto.Contact.Feedback {

                @org.jetbrains.annotations.NotNull
                public static final com.truecaller.search.ContactDto.Contact.Feedback.Reviews INSTANCE = new com.truecaller.search.ContactDto.Contact.Feedback.Reviews();

                private Reviews() {
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    return this == other || (other instanceof com.truecaller.search.ContactDto.Contact.Feedback.Reviews);
                }

                public int hashCode() {
                    return -209307471;
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return "Reviews";
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$InternetAddress;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "", "id", "service", "caption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "getService", "getCaption", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class InternetAddress {

            @bw.qux("caption")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String caption;

            @bw.qux("id")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String id;

            @bw.qux("service")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String service;

            @bw.qux(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE)
            @org.jetbrains.annotations.Nullable
            private final java.lang.String type;

            public InternetAddress(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
                this.type = str;
                this.id = str2;
                this.service = str3;
                this.caption = str4;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.InternetAddress copy$default(com.truecaller.search.ContactDto.Contact.InternetAddress internetAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = internetAddress.type;
                }
                if ((i & 2) != 0) {
                    str2 = internetAddress.id;
                }
                if ((i & 4) != 0) {
                    str3 = internetAddress.service;
                }
                if ((i & 8) != 0) {
                    str4 = internetAddress.caption;
                }
                return internetAddress.copy(str, str2, str3, str4);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getType() {
                return this.type;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getService() {
                return this.service;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.String getCaption() {
                return this.caption;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.InternetAddress copy(@org.jetbrains.annotations.Nullable java.lang.String type, @org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String service, @org.jetbrains.annotations.Nullable java.lang.String caption) {
                return new com.truecaller.search.ContactDto.Contact.InternetAddress(type, id, service, caption);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.InternetAddress)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.InternetAddress internetAddress = (com.truecaller.search.ContactDto.Contact.InternetAddress) other;
                return kotlin.jvm.internal.Intrinsics.b(this.type, internetAddress.type) && kotlin.jvm.internal.Intrinsics.b(this.id, internetAddress.id) && kotlin.jvm.internal.Intrinsics.b(this.service, internetAddress.service) && kotlin.jvm.internal.Intrinsics.b(this.caption, internetAddress.caption);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCaption() {
                return this.caption;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getService() {
                return this.service;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getType() {
                return this.type;
            }

            public int hashCode() {
                java.lang.String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.id;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.service;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.String str4 = this.caption;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.type;
                java.lang.String str2 = this.id;
                return bar.x(ro0.f.E("InternetAddress(type=", str, ", id=", str2, ", service="), this.service, ", caption=", this.caption, ")");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Note;", "", "note", "", "<init>", "(Ljava/lang/String;)V", "getNote", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Note {

            @bw.qux("note")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String note;

            public Note(@org.jetbrains.annotations.Nullable java.lang.String str) {
                this.note = str;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.Note copy$default(com.truecaller.search.ContactDto.Contact.Note note, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = note.note;
                }
                return note.copy(str);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getNote() {
                return this.note;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.Note copy(@org.jetbrains.annotations.Nullable java.lang.String note) {
                return new com.truecaller.search.ContactDto.Contact.Note(note);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.truecaller.search.ContactDto.Contact.Note) && kotlin.jvm.internal.Intrinsics.b(this.note, ((com.truecaller.search.ContactDto.Contact.Note) other).note);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getNote() {
                return this.note;
            }

            public int hashCode() {
                java.lang.String str = this.note;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return bar.t("Note(note=", this.note, ")");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$PhoneNumber;", "", "id", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "e164Format", "nationalFormat", "dialingCode", "countryCode", "numberType", "carrier", "telType", "spamScore", "spamType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getE164Format", "getNationalFormat", "getDialingCode", "getCountryCode", "getNumberType", "getCarrier", "getTelType", "getSpamScore", "getSpamType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class PhoneNumber {

            @bw.qux("carrier")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String carrier;

            @bw.qux("countryCode")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String countryCode;

            @bw.qux("dialingCode")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String dialingCode;

            @bw.qux("e164Format")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String e164Format;

            @bw.qux("id")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String id;

            @bw.qux("nationalFormat")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String nationalFormat;

            @bw.qux("numberType")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String numberType;

            @bw.qux("spamScore")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String spamScore;

            @bw.qux("spamType")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String spamType;

            @bw.qux("telType")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String telType;

            @bw.qux(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE)
            @org.jetbrains.annotations.Nullable
            private final java.lang.String type;

            public PhoneNumber(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6, @org.jetbrains.annotations.Nullable java.lang.String str7, @org.jetbrains.annotations.Nullable java.lang.String str8, @org.jetbrains.annotations.Nullable java.lang.String str9, @org.jetbrains.annotations.Nullable java.lang.String str10, @org.jetbrains.annotations.Nullable java.lang.String str11) {
                this.id = str;
                this.type = str2;
                this.e164Format = str3;
                this.nationalFormat = str4;
                this.dialingCode = str5;
                this.countryCode = str6;
                this.numberType = str7;
                this.carrier = str8;
                this.telType = str9;
                this.spamScore = str10;
                this.spamType = str11;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.PhoneNumber copy$default(com.truecaller.search.ContactDto.Contact.PhoneNumber phoneNumber, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = phoneNumber.id;
                }
                if ((i & 2) != 0) {
                    str2 = phoneNumber.type;
                }
                if ((i & 4) != 0) {
                    str3 = phoneNumber.e164Format;
                }
                if ((i & 8) != 0) {
                    str4 = phoneNumber.nationalFormat;
                }
                if ((i & 16) != 0) {
                    str5 = phoneNumber.dialingCode;
                }
                if ((i & 32) != 0) {
                    str6 = phoneNumber.countryCode;
                }
                if ((i & 64) != 0) {
                    str7 = phoneNumber.numberType;
                }
                if ((i & com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE) != 0) {
                    str8 = phoneNumber.carrier;
                }
                if ((i & 256) != 0) {
                    str9 = phoneNumber.telType;
                }
                if ((i & 512) != 0) {
                    str10 = phoneNumber.spamScore;
                }
                if ((i & 1024) != 0) {
                    str11 = phoneNumber.spamType;
                }
                java.lang.String str12 = str10;
                java.lang.String str13 = str11;
                java.lang.String str14 = str8;
                java.lang.String str15 = str9;
                java.lang.String str16 = str6;
                java.lang.String str17 = str7;
                java.lang.String str18 = str5;
                java.lang.String str19 = str3;
                return phoneNumber.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component10, reason: from getter */
            public final java.lang.String getSpamScore() {
                return this.spamScore;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component11, reason: from getter */
            public final java.lang.String getSpamType() {
                return this.spamType;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.String getType() {
                return this.type;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getE164Format() {
                return this.e164Format;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.String getNationalFormat() {
                return this.nationalFormat;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component5, reason: from getter */
            public final java.lang.String getDialingCode() {
                return this.dialingCode;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component6, reason: from getter */
            public final java.lang.String getCountryCode() {
                return this.countryCode;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component7, reason: from getter */
            public final java.lang.String getNumberType() {
                return this.numberType;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component8, reason: from getter */
            public final java.lang.String getCarrier() {
                return this.carrier;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component9, reason: from getter */
            public final java.lang.String getTelType() {
                return this.telType;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.PhoneNumber copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String type, @org.jetbrains.annotations.Nullable java.lang.String e164Format, @org.jetbrains.annotations.Nullable java.lang.String nationalFormat, @org.jetbrains.annotations.Nullable java.lang.String dialingCode, @org.jetbrains.annotations.Nullable java.lang.String countryCode, @org.jetbrains.annotations.Nullable java.lang.String numberType, @org.jetbrains.annotations.Nullable java.lang.String carrier, @org.jetbrains.annotations.Nullable java.lang.String telType, @org.jetbrains.annotations.Nullable java.lang.String spamScore, @org.jetbrains.annotations.Nullable java.lang.String spamType) {
                return new com.truecaller.search.ContactDto.Contact.PhoneNumber(id, type, e164Format, nationalFormat, dialingCode, countryCode, numberType, carrier, telType, spamScore, spamType);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.PhoneNumber)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.PhoneNumber phoneNumber = (com.truecaller.search.ContactDto.Contact.PhoneNumber) other;
                return kotlin.jvm.internal.Intrinsics.b(this.id, phoneNumber.id) && kotlin.jvm.internal.Intrinsics.b(this.type, phoneNumber.type) && kotlin.jvm.internal.Intrinsics.b(this.e164Format, phoneNumber.e164Format) && kotlin.jvm.internal.Intrinsics.b(this.nationalFormat, phoneNumber.nationalFormat) && kotlin.jvm.internal.Intrinsics.b(this.dialingCode, phoneNumber.dialingCode) && kotlin.jvm.internal.Intrinsics.b(this.countryCode, phoneNumber.countryCode) && kotlin.jvm.internal.Intrinsics.b(this.numberType, phoneNumber.numberType) && kotlin.jvm.internal.Intrinsics.b(this.carrier, phoneNumber.carrier) && kotlin.jvm.internal.Intrinsics.b(this.telType, phoneNumber.telType) && kotlin.jvm.internal.Intrinsics.b(this.spamScore, phoneNumber.spamScore) && kotlin.jvm.internal.Intrinsics.b(this.spamType, phoneNumber.spamType);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCarrier() {
                return this.carrier;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCountryCode() {
                return this.countryCode;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getDialingCode() {
                return this.dialingCode;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getE164Format() {
                return this.e164Format;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getNationalFormat() {
                return this.nationalFormat;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getNumberType() {
                return this.numberType;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getSpamScore() {
                return this.spamScore;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getSpamType() {
                return this.spamType;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getTelType() {
                return this.telType;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getType() {
                return this.type;
            }

            public int hashCode() {
                java.lang.String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.type;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.e164Format;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.String str4 = this.nationalFormat;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                java.lang.String str5 = this.dialingCode;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                java.lang.String str6 = this.countryCode;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                java.lang.String str7 = this.numberType;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                java.lang.String str8 = this.carrier;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                java.lang.String str9 = this.telType;
                int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                java.lang.String str10 = this.spamScore;
                int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                java.lang.String str11 = this.spamType;
                return hashCode10 + (str11 != null ? str11.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.id;
                java.lang.String str2 = this.type;
                java.lang.String str3 = this.e164Format;
                java.lang.String str4 = this.nationalFormat;
                java.lang.String str5 = this.dialingCode;
                java.lang.String str6 = this.countryCode;
                java.lang.String str7 = this.numberType;
                java.lang.String str8 = this.carrier;
                java.lang.String str9 = this.telType;
                java.lang.String str10 = this.spamScore;
                java.lang.String str11 = this.spamType;
                java.lang.StringBuilder E = ro0.f.E("PhoneNumber(id=", str, ", type=", str2, ", e164Format=");
                bar.E(E, str3, ", nationalFormat=", str4, ", dialingCode=");
                bar.E(E, str5, ", countryCode=", str6, ", numberType=");
                bar.E(E, str7, ", carrier=", str8, ", telType=");
                bar.E(E, str9, ", spamScore=", str10, ", spamType=");
                return bar.v(str11, ")", E);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$SearchWarning;", "", "id", "", "features", "", "Lcom/truecaller/search/ContactDto$Contact$SearchWarning$Feature;", "ruleName", "ruleId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFeatures", "()Ljava/util/List;", "getRuleName", "getRuleId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Feature", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class SearchWarning {

            @bw.qux("features")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> features;

            @bw.qux("id")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String id;

            @bw.qux("ruleId")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String ruleId;

            @bw.qux("ruleName")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String ruleName;

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$SearchWarning$Feature;", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class Feature {

                @bw.qux(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME)
                @org.jetbrains.annotations.Nullable
                private final java.lang.String name;

                @bw.qux("value")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String value;

                public Feature(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
                    this.name = str;
                    this.value = str2;
                }

                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.SearchWarning.Feature copy$default(com.truecaller.search.ContactDto.Contact.SearchWarning.Feature feature, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = feature.name;
                    }
                    if ((i & 2) != 0) {
                        str2 = feature.value;
                    }
                    return feature.copy(str, str2);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.String getName() {
                    return this.name;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.String getValue() {
                    return this.value;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.SearchWarning.Feature copy(@org.jetbrains.annotations.Nullable java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String value) {
                    return new com.truecaller.search.ContactDto.Contact.SearchWarning.Feature(name, value);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.SearchWarning.Feature)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.SearchWarning.Feature feature = (com.truecaller.search.ContactDto.Contact.SearchWarning.Feature) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.name, feature.name) && kotlin.jvm.internal.Intrinsics.b(this.value, feature.value);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getName() {
                    return this.name;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    java.lang.String str = this.name;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.value;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return y.o.e("Feature(name=", this.name, ", value=", this.value, ")");
                }
            }

            public SearchWarning(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> list, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
                this.id = str;
                this.features = list;
                this.ruleName = str2;
                this.ruleId = str3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.SearchWarning copy$default(com.truecaller.search.ContactDto.Contact.SearchWarning searchWarning, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = searchWarning.id;
                }
                if ((i & 2) != 0) {
                    list = searchWarning.features;
                }
                if ((i & 4) != 0) {
                    str2 = searchWarning.ruleName;
                }
                if ((i & 8) != 0) {
                    str3 = searchWarning.ruleId;
                }
                return searchWarning.copy(str, list, str2, str3);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> component2() {
                return this.features;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getRuleName() {
                return this.ruleName;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.String getRuleId() {
                return this.ruleId;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.SearchWarning copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> features, @org.jetbrains.annotations.Nullable java.lang.String ruleName, @org.jetbrains.annotations.Nullable java.lang.String ruleId) {
                return new com.truecaller.search.ContactDto.Contact.SearchWarning(id, features, ruleName, ruleId);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.SearchWarning)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.SearchWarning searchWarning = (com.truecaller.search.ContactDto.Contact.SearchWarning) other;
                return kotlin.jvm.internal.Intrinsics.b(this.id, searchWarning.id) && kotlin.jvm.internal.Intrinsics.b(this.features, searchWarning.features) && kotlin.jvm.internal.Intrinsics.b(this.ruleName, searchWarning.ruleName) && kotlin.jvm.internal.Intrinsics.b(this.ruleId, searchWarning.ruleId);
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> getFeatures() {
                return this.features;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getRuleId() {
                return this.ruleId;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getRuleName() {
                return this.ruleName;
            }

            public int hashCode() {
                java.lang.String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> list = this.features;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                java.lang.String str2 = this.ruleName;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.ruleId;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.id;
                java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> list = this.features;
                return bar.x(com.appsflyer.internal.e.r("SearchWarning(id=", str, ", features=", list, ", ruleName="), this.ruleName, ", ruleId=", this.ruleId, ")");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0007\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\b\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$SenderId;", "", "spamScore", "", "fraudScore", "isNewSender", "", "isFraudExcluded", "isValidSpamScore", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSpamScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFraudScore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/truecaller/search/ContactDto$Contact$SenderId;", "equals", "other", "hashCode", "", "toString", "", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class SenderId {

            @bw.qux("fraudScore")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Float fraudScore;

            @bw.qux("isFraudExcluded")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Boolean isFraudExcluded;

            @bw.qux("isNewSender")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Boolean isNewSender;

            @bw.qux("isValidSpamScore")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Boolean isValidSpamScore;

            @bw.qux("spamScore")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Float spamScore;

            public SenderId(@org.jetbrains.annotations.Nullable java.lang.Float f, @org.jetbrains.annotations.Nullable java.lang.Float f2, @org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.lang.Boolean bool2, @org.jetbrains.annotations.Nullable java.lang.Boolean bool3) {
                this.spamScore = f;
                this.fraudScore = f2;
                this.isNewSender = bool;
                this.isFraudExcluded = bool2;
                this.isValidSpamScore = bool3;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.SenderId copy$default(com.truecaller.search.ContactDto.Contact.SenderId senderId, java.lang.Float f, java.lang.Float f2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    f = senderId.spamScore;
                }
                if ((i & 2) != 0) {
                    f2 = senderId.fraudScore;
                }
                if ((i & 4) != 0) {
                    bool = senderId.isNewSender;
                }
                if ((i & 8) != 0) {
                    bool2 = senderId.isFraudExcluded;
                }
                if ((i & 16) != 0) {
                    bool3 = senderId.isValidSpamScore;
                }
                java.lang.Boolean bool4 = bool3;
                java.lang.Boolean bool5 = bool;
                return senderId.copy(f, f2, bool5, bool2, bool4);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.Float getSpamScore() {
                return this.spamScore;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.Float getFraudScore() {
                return this.fraudScore;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.Boolean getIsNewSender() {
                return this.isNewSender;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.Boolean getIsFraudExcluded() {
                return this.isFraudExcluded;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component5, reason: from getter */
            public final java.lang.Boolean getIsValidSpamScore() {
                return this.isValidSpamScore;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.SenderId copy(@org.jetbrains.annotations.Nullable java.lang.Float spamScore, @org.jetbrains.annotations.Nullable java.lang.Float fraudScore, @org.jetbrains.annotations.Nullable java.lang.Boolean isNewSender, @org.jetbrains.annotations.Nullable java.lang.Boolean isFraudExcluded, @org.jetbrains.annotations.Nullable java.lang.Boolean isValidSpamScore) {
                return new com.truecaller.search.ContactDto.Contact.SenderId(spamScore, fraudScore, isNewSender, isFraudExcluded, isValidSpamScore);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.SenderId)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.SenderId senderId = (com.truecaller.search.ContactDto.Contact.SenderId) other;
                return kotlin.jvm.internal.Intrinsics.b(this.spamScore, senderId.spamScore) && kotlin.jvm.internal.Intrinsics.b(this.fraudScore, senderId.fraudScore) && kotlin.jvm.internal.Intrinsics.b(this.isNewSender, senderId.isNewSender) && kotlin.jvm.internal.Intrinsics.b(this.isFraudExcluded, senderId.isFraudExcluded) && kotlin.jvm.internal.Intrinsics.b(this.isValidSpamScore, senderId.isValidSpamScore);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Float getFraudScore() {
                return this.fraudScore;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Float getSpamScore() {
                return this.spamScore;
            }

            public int hashCode() {
                java.lang.Float f = this.spamScore;
                int hashCode = (f == null ? 0 : f.hashCode()) * 31;
                java.lang.Float f2 = this.fraudScore;
                int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
                java.lang.Boolean bool = this.isNewSender;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Boolean bool2 = this.isFraudExcluded;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                java.lang.Boolean bool3 = this.isValidSpamScore;
                return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Boolean isFraudExcluded() {
                return this.isFraudExcluded;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Boolean isNewSender() {
                return this.isNewSender;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Boolean isValidSpamScore() {
                return this.isValidSpamScore;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.Float f = this.spamScore;
                java.lang.Float f2 = this.fraudScore;
                java.lang.Boolean bool = this.isNewSender;
                java.lang.Boolean bool2 = this.isFraudExcluded;
                java.lang.Boolean bool3 = this.isValidSpamScore;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SenderId(spamScore=");
                sb.append(f);
                sb.append(", fraudScore=");
                sb.append(f2);
                sb.append(", isNewSender=");
                com.appsflyer.internal.e.z(sb, bool, ", isFraudExcluded=", bool2, ", isValidSpamScore=");
                sb.append(bool3);
                sb.append(")");
                return sb.toString();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Source;", "", "id", "", "url", "logo", "caption", "extra", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getUrl", "getLogo", "getCaption", "getExtra", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Source {

            @bw.qux("caption")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String caption;

            @bw.qux("extra")
            @org.jetbrains.annotations.Nullable
            private final java.util.Map<java.lang.String, java.lang.String> extra;

            @bw.qux("id")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String id;

            @bw.qux("logo")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String logo;

            @bw.qux("url")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String url;

            public Source(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> map) {
                this.id = str;
                this.url = str2;
                this.logo = str3;
                this.caption = str4;
                this.extra = map;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.Source copy$default(com.truecaller.search.ContactDto.Contact.Source source, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = source.id;
                }
                if ((i & 2) != 0) {
                    str2 = source.url;
                }
                if ((i & 4) != 0) {
                    str3 = source.logo;
                }
                if ((i & 8) != 0) {
                    str4 = source.caption;
                }
                if ((i & 16) != 0) {
                    map = source.extra;
                }
                java.util.Map map2 = map;
                java.lang.String str5 = str3;
                return source.copy(str, str2, str5, str4, map2);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.String getUrl() {
                return this.url;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getLogo() {
                return this.logo;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.String getCaption() {
                return this.caption;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.Map<java.lang.String, java.lang.String> component5() {
                return this.extra;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.Source copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String logo, @org.jetbrains.annotations.Nullable java.lang.String caption, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> extra) {
                return new com.truecaller.search.ContactDto.Contact.Source(id, url, logo, caption, extra);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.Source)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.Source source = (com.truecaller.search.ContactDto.Contact.Source) other;
                return kotlin.jvm.internal.Intrinsics.b(this.id, source.id) && kotlin.jvm.internal.Intrinsics.b(this.url, source.url) && kotlin.jvm.internal.Intrinsics.b(this.logo, source.logo) && kotlin.jvm.internal.Intrinsics.b(this.caption, source.caption) && kotlin.jvm.internal.Intrinsics.b(this.extra, source.extra);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCaption() {
                return this.caption;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.Map<java.lang.String, java.lang.String> getExtra() {
                return this.extra;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getLogo() {
                return this.logo;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getUrl() {
                return this.url;
            }

            public int hashCode() {
                java.lang.String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.url;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.logo;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.String str4 = this.caption;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                java.util.Map<java.lang.String, java.lang.String> map = this.extra;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.id;
                java.lang.String str2 = this.url;
                java.lang.String str3 = this.logo;
                java.lang.String str4 = this.caption;
                java.util.Map<java.lang.String, java.lang.String> map = this.extra;
                java.lang.StringBuilder E = ro0.f.E("Source(id=", str, ", url=", str2, ", logo=");
                bar.E(E, str3, ", caption=", str4, ", extra=");
                E.append(map);
                E.append(")");
                return E.toString();
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$SpamInfo;", "", "spamScore", "", "spamType", "", "spamStats", "Lcom/truecaller/search/ContactDto$Contact$SpamInfo$SpamStats;", "spamCategories", "", "", "spamVersion", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/truecaller/search/ContactDto$Contact$SpamInfo$SpamStats;Ljava/util/List;Ljava/lang/Integer;)V", "getSpamScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSpamType", "()Ljava/lang/String;", "getSpamStats", "()Lcom/truecaller/search/ContactDto$Contact$SpamInfo$SpamStats;", "getSpamCategories", "()Ljava/util/List;", "getSpamVersion", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/truecaller/search/ContactDto$Contact$SpamInfo$SpamStats;Ljava/util/List;Ljava/lang/Integer;)Lcom/truecaller/search/ContactDto$Contact$SpamInfo;", "equals", "", "other", "hashCode", "toString", "SpamStats", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class SpamInfo {

            @bw.qux("spamCategories")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<java.lang.Long> spamCategories;

            @bw.qux("spamScore")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Integer spamScore;

            @bw.qux("spamStats")
            @org.jetbrains.annotations.Nullable
            private final com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats;

            @bw.qux("spamType")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String spamType;

            @bw.qux("spamVersion")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Integer spamVersion;

            @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JD\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$SpamInfo$SpamStats;", "", "numReports60days", "", "numCalls60days", "numCalls60DaysPointerPosition", "numCallsHourly", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getNumReports60days", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumCalls60days", "getNumCalls60DaysPointerPosition", "getNumCallsHourly", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/truecaller/search/ContactDto$Contact$SpamInfo$SpamStats;", "equals", "", "other", "hashCode", "toString", "", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            /* loaded from: /home/user/tc_decoded/classes7.dex */
            public static final /* data */ class SpamStats {

                @bw.qux("numCalls60DaysPointerPosition")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Integer numCalls60DaysPointerPosition;

                @bw.qux("numCalls60days")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Integer numCalls60days;

                @bw.qux("numCallsHourly")
                @org.jetbrains.annotations.Nullable
                private final java.util.List<java.lang.Integer> numCallsHourly;

                @bw.qux("numReports60days")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Integer numReports60days;

                public SpamStats(@org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.Integer num2, @org.jetbrains.annotations.Nullable java.lang.Integer num3, @org.jetbrains.annotations.Nullable java.util.List<java.lang.Integer> list) {
                    this.numReports60days = num;
                    this.numCalls60days = num2;
                    this.numCalls60DaysPointerPosition = num3;
                    this.numCallsHourly = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats copy$default(com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.util.List list, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        num = spamStats.numReports60days;
                    }
                    if ((i & 2) != 0) {
                        num2 = spamStats.numCalls60days;
                    }
                    if ((i & 4) != 0) {
                        num3 = spamStats.numCalls60DaysPointerPosition;
                    }
                    if ((i & 8) != 0) {
                        list = spamStats.numCallsHourly;
                    }
                    return spamStats.copy(num, num2, num3, list);
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component1, reason: from getter */
                public final java.lang.Integer getNumReports60days() {
                    return this.numReports60days;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component2, reason: from getter */
                public final java.lang.Integer getNumCalls60days() {
                    return this.numCalls60days;
                }

                @org.jetbrains.annotations.Nullable
                /* renamed from: component3, reason: from getter */
                public final java.lang.Integer getNumCalls60DaysPointerPosition() {
                    return this.numCalls60DaysPointerPosition;
                }

                @org.jetbrains.annotations.Nullable
                public final java.util.List<java.lang.Integer> component4() {
                    return this.numCallsHourly;
                }

                @org.jetbrains.annotations.NotNull
                public final com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats copy(@org.jetbrains.annotations.Nullable java.lang.Integer numReports60days, @org.jetbrains.annotations.Nullable java.lang.Integer numCalls60days, @org.jetbrains.annotations.Nullable java.lang.Integer numCalls60DaysPointerPosition, @org.jetbrains.annotations.Nullable java.util.List<java.lang.Integer> numCallsHourly) {
                    return new com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats(numReports60days, numCalls60days, numCalls60DaysPointerPosition, numCallsHourly);
                }

                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats)) {
                        return false;
                    }
                    com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats = (com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats) other;
                    return kotlin.jvm.internal.Intrinsics.b(this.numReports60days, spamStats.numReports60days) && kotlin.jvm.internal.Intrinsics.b(this.numCalls60days, spamStats.numCalls60days) && kotlin.jvm.internal.Intrinsics.b(this.numCalls60DaysPointerPosition, spamStats.numCalls60DaysPointerPosition) && kotlin.jvm.internal.Intrinsics.b(this.numCallsHourly, spamStats.numCallsHourly);
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.Integer getNumCalls60DaysPointerPosition() {
                    return this.numCalls60DaysPointerPosition;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.Integer getNumCalls60days() {
                    return this.numCalls60days;
                }

                @org.jetbrains.annotations.Nullable
                public final java.util.List<java.lang.Integer> getNumCallsHourly() {
                    return this.numCallsHourly;
                }

                @org.jetbrains.annotations.Nullable
                public final java.lang.Integer getNumReports60days() {
                    return this.numReports60days;
                }

                public int hashCode() {
                    java.lang.Integer num = this.numReports60days;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    java.lang.Integer num2 = this.numCalls60days;
                    int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    java.lang.Integer num3 = this.numCalls60DaysPointerPosition;
                    int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    java.util.List<java.lang.Integer> list = this.numCallsHourly;
                    return hashCode3 + (list != null ? list.hashCode() : 0);
                }

                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return "SpamStats(numReports60days=" + this.numReports60days + ", numCalls60days=" + this.numCalls60days + ", numCalls60DaysPointerPosition=" + this.numCalls60DaysPointerPosition + ", numCallsHourly=" + this.numCallsHourly + ")";
                }
            }

            public SpamInfo(@org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats, @org.jetbrains.annotations.Nullable java.util.List<java.lang.Long> list, @org.jetbrains.annotations.Nullable java.lang.Integer num2) {
                this.spamScore = num;
                this.spamType = str;
                this.spamStats = spamStats;
                this.spamCategories = list;
                this.spamVersion = num2;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.SpamInfo copy$default(com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo, java.lang.Integer num, java.lang.String str, com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats, java.util.List list, java.lang.Integer num2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    num = spamInfo.spamScore;
                }
                if ((i & 2) != 0) {
                    str = spamInfo.spamType;
                }
                if ((i & 4) != 0) {
                    spamStats = spamInfo.spamStats;
                }
                if ((i & 8) != 0) {
                    list = spamInfo.spamCategories;
                }
                if ((i & 16) != 0) {
                    num2 = spamInfo.spamVersion;
                }
                java.lang.Integer num3 = num2;
                com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats2 = spamStats;
                return spamInfo.copy(num, str, spamStats2, list, num3);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.Integer getSpamScore() {
                return this.spamScore;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSpamType() {
                return this.spamType;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats getSpamStats() {
                return this.spamStats;
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.Long> component4() {
                return this.spamCategories;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component5, reason: from getter */
            public final java.lang.Integer getSpamVersion() {
                return this.spamVersion;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.SpamInfo copy(@org.jetbrains.annotations.Nullable java.lang.Integer spamScore, @org.jetbrains.annotations.Nullable java.lang.String spamType, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats, @org.jetbrains.annotations.Nullable java.util.List<java.lang.Long> spamCategories, @org.jetbrains.annotations.Nullable java.lang.Integer spamVersion) {
                return new com.truecaller.search.ContactDto.Contact.SpamInfo(spamScore, spamType, spamStats, spamCategories, spamVersion);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.SpamInfo)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo = (com.truecaller.search.ContactDto.Contact.SpamInfo) other;
                return kotlin.jvm.internal.Intrinsics.b(this.spamScore, spamInfo.spamScore) && kotlin.jvm.internal.Intrinsics.b(this.spamType, spamInfo.spamType) && kotlin.jvm.internal.Intrinsics.b(this.spamStats, spamInfo.spamStats) && kotlin.jvm.internal.Intrinsics.b(this.spamCategories, spamInfo.spamCategories) && kotlin.jvm.internal.Intrinsics.b(this.spamVersion, spamInfo.spamVersion);
            }

            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.Long> getSpamCategories() {
                return this.spamCategories;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getSpamScore() {
                return this.spamScore;
            }

            @org.jetbrains.annotations.Nullable
            public final com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats getSpamStats() {
                return this.spamStats;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getSpamType() {
                return this.spamType;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getSpamVersion() {
                return this.spamVersion;
            }

            public int hashCode() {
                java.lang.Integer num = this.spamScore;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                java.lang.String str = this.spamType;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats = this.spamStats;
                int hashCode3 = (hashCode2 + (spamStats == null ? 0 : spamStats.hashCode())) * 31;
                java.util.List<java.lang.Long> list = this.spamCategories;
                int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                java.lang.Integer num2 = this.spamVersion;
                return hashCode4 + (num2 != null ? num2.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.Integer num = this.spamScore;
                java.lang.String str = this.spamType;
                com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats = this.spamStats;
                java.util.List<java.lang.Long> list = this.spamCategories;
                java.lang.Integer num2 = this.spamVersion;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SpamInfo(spamScore=");
                sb.append(num);
                sb.append(", spamType=");
                sb.append(str);
                sb.append(", spamStats=");
                sb.append(spamStats);
                sb.append(", spamCategories=");
                sb.append(list);
                sb.append(", spamVersion=");
                return com.appsflyer.internal.e.m(sb, num2, ")");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Survey;", "", "id", "", "frequency", "", "passthroughData", "perNumberCooldown", "dynamicAccessKey", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFrequency", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPassthroughData", "getPerNumberCooldown", "getDynamicAccessKey", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/truecaller/search/ContactDto$Contact$Survey;", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Survey {

            @bw.qux("dynamicAccessKey")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String dynamicAccessKey;

            @bw.qux("frequency")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Long frequency;

            @bw.qux("id")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String id;

            @bw.qux("passthroughData")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String passthroughData;

            @bw.qux("perNumberCooldown")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Long perNumberCooldown;

            public Survey(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Long l2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
                this.id = str;
                this.frequency = l;
                this.passthroughData = str2;
                this.perNumberCooldown = l2;
                this.dynamicAccessKey = str3;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.Survey copy$default(com.truecaller.search.ContactDto.Contact.Survey survey, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Long l2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = survey.id;
                }
                if ((i & 2) != 0) {
                    l = survey.frequency;
                }
                if ((i & 4) != 0) {
                    str2 = survey.passthroughData;
                }
                if ((i & 8) != 0) {
                    l2 = survey.perNumberCooldown;
                }
                if ((i & 16) != 0) {
                    str3 = survey.dynamicAccessKey;
                }
                java.lang.String str4 = str3;
                java.lang.String str5 = str2;
                return survey.copy(str, l, str5, l2, str4);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component2, reason: from getter */
            public final java.lang.Long getFrequency() {
                return this.frequency;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component3, reason: from getter */
            public final java.lang.String getPassthroughData() {
                return this.passthroughData;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component4, reason: from getter */
            public final java.lang.Long getPerNumberCooldown() {
                return this.perNumberCooldown;
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component5, reason: from getter */
            public final java.lang.String getDynamicAccessKey() {
                return this.dynamicAccessKey;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.Survey copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.Long frequency, @org.jetbrains.annotations.Nullable java.lang.String passthroughData, @org.jetbrains.annotations.Nullable java.lang.Long perNumberCooldown, @org.jetbrains.annotations.Nullable java.lang.String dynamicAccessKey) {
                return new com.truecaller.search.ContactDto.Contact.Survey(id, frequency, passthroughData, perNumberCooldown, dynamicAccessKey);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.search.ContactDto.Contact.Survey)) {
                    return false;
                }
                com.truecaller.search.ContactDto.Contact.Survey survey = (com.truecaller.search.ContactDto.Contact.Survey) other;
                return kotlin.jvm.internal.Intrinsics.b(this.id, survey.id) && kotlin.jvm.internal.Intrinsics.b(this.frequency, survey.frequency) && kotlin.jvm.internal.Intrinsics.b(this.passthroughData, survey.passthroughData) && kotlin.jvm.internal.Intrinsics.b(this.perNumberCooldown, survey.perNumberCooldown) && kotlin.jvm.internal.Intrinsics.b(this.dynamicAccessKey, survey.dynamicAccessKey);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getDynamicAccessKey() {
                return this.dynamicAccessKey;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Long getFrequency() {
                return this.frequency;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getId() {
                return this.id;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getPassthroughData() {
                return this.passthroughData;
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Long getPerNumberCooldown() {
                return this.perNumberCooldown;
            }

            public int hashCode() {
                java.lang.String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.Long l = this.frequency;
                int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
                java.lang.String str2 = this.passthroughData;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.Long l2 = this.perNumberCooldown;
                int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
                java.lang.String str3 = this.dynamicAccessKey;
                return hashCode4 + (str3 != null ? str3.hashCode() : 0);
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                java.lang.String str = this.id;
                java.lang.Long l = this.frequency;
                java.lang.String str2 = this.passthroughData;
                java.lang.Long l2 = this.perNumberCooldown;
                java.lang.String str3 = this.dynamicAccessKey;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Survey(id=");
                sb.append(str);
                sb.append(", frequency=");
                sb.append(l);
                sb.append(", passthroughData=");
                sb.append(str2);
                sb.append(", perNumberCooldown=");
                sb.append(l2);
                sb.append(", dynamicAccessKey=");
                return bar.v(str3, ")", sb);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/search/ContactDto$Contact$Tag;", "", "tag", "", "<init>", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Tag {

            @bw.qux("tag")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String tag;

            public Tag(@org.jetbrains.annotations.Nullable java.lang.String str) {
                this.tag = str;
            }

            public static /* synthetic */ com.truecaller.search.ContactDto.Contact.Tag copy$default(com.truecaller.search.ContactDto.Contact.Tag tag, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = tag.tag;
                }
                return tag.copy(str);
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: component1, reason: from getter */
            public final java.lang.String getTag() {
                return this.tag;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.search.ContactDto.Contact.Tag copy(@org.jetbrains.annotations.Nullable java.lang.String tag) {
                return new com.truecaller.search.ContactDto.Contact.Tag(tag);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.truecaller.search.ContactDto.Contact.Tag) && kotlin.jvm.internal.Intrinsics.b(this.tag, ((com.truecaller.search.ContactDto.Contact.Tag) other).tag);
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getTag() {
                return this.tag;
            }

            public int hashCode() {
                java.lang.String str = this.tag;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return bar.t("Tag(tag=", this.tag, ")");
            }
        }

        public Contact(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6, @org.jetbrains.annotations.Nullable java.lang.String str7, @org.jetbrains.annotations.Nullable java.lang.String str8, @org.jetbrains.annotations.Nullable java.lang.String str9, @org.jetbrains.annotations.Nullable java.lang.String str10, @org.jetbrains.annotations.Nullable java.lang.String str11, @org.jetbrains.annotations.Nullable java.lang.String str12, @org.jetbrains.annotations.Nullable java.lang.Number number, @org.jetbrains.annotations.Nullable java.lang.Number number2, @org.jetbrains.annotations.Nullable java.lang.Number number3, @org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> list, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Address> list2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> list3, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list4, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Tag> list5, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Source> list6, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> list7, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Survey> list8, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.Feedback feedback, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.SenderId senderId, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.Boolean bool2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> list9) {
            this.id = str;
            this.name = str2;
            this.transliteratedName = str3;
            this.handle = str4;
            this.altName = str5;
            this.gender = str6;
            this.about = str7;
            this.image = str8;
            this.jobTitle = str9;
            this.companyName = str10;
            this.access = str11;
            this.imId = str12;
            this.score = number;
            this.cacheTtl = number2;
            this.ns = number3;
            this.manualCallerIdPrompt = bool;
            this.phones = list;
            this.addresses = list2;
            this.internetAddresses = list3;
            this.badges = list4;
            this.tags = list5;
            this.sources = list6;
            this.searchWarnings = list7;
            this.surveys = list8;
            this.businessProfile = businessProfile;
            this.spamInfo = spamInfo;
            this.feedback = feedback;
            this.senderId = senderId;
            this.category = num;
            this.isSuspectedFraud = bool2;
            this.electedTags = list9;
        }

        public static /* synthetic */ com.truecaller.search.ContactDto.Contact copy$default(com.truecaller.search.ContactDto.Contact contact, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Boolean bool, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.util.List list7, java.util.List list8, com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile, com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo, com.truecaller.search.ContactDto.Contact.Feedback feedback, com.truecaller.search.ContactDto.Contact.SenderId senderId, java.lang.Integer num, java.lang.Boolean bool2, java.util.List list9, int i, java.lang.Object obj) {
            java.util.List list10;
            java.lang.Boolean bool3;
            java.lang.String str13 = (i & 1) != 0 ? contact.id : str;
            java.lang.String str14 = (i & 2) != 0 ? contact.name : str2;
            java.lang.String str15 = (i & 4) != 0 ? contact.transliteratedName : str3;
            java.lang.String str16 = (i & 8) != 0 ? contact.handle : str4;
            java.lang.String str17 = (i & 16) != 0 ? contact.altName : str5;
            java.lang.String str18 = (i & 32) != 0 ? contact.gender : str6;
            java.lang.String str19 = (i & 64) != 0 ? contact.about : str7;
            java.lang.String str20 = (i & com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE) != 0 ? contact.image : str8;
            java.lang.String str21 = (i & 256) != 0 ? contact.jobTitle : str9;
            java.lang.String str22 = (i & 512) != 0 ? contact.companyName : str10;
            java.lang.String str23 = (i & 1024) != 0 ? contact.access : str11;
            java.lang.String str24 = (i & 2048) != 0 ? contact.imId : str12;
            java.lang.Number number4 = (i & 4096) != 0 ? contact.score : number;
            java.lang.Number number5 = (i & 8192) != 0 ? contact.cacheTtl : number2;
            java.lang.String str25 = str13;
            java.lang.Number number6 = (i & 16384) != 0 ? contact.ns : number3;
            java.lang.Boolean bool4 = (i & 32768) != 0 ? contact.manualCallerIdPrompt : bool;
            java.util.List list11 = (i & 65536) != 0 ? contact.phones : list;
            java.util.List list12 = (i & 131072) != 0 ? contact.addresses : list2;
            java.util.List list13 = (i & 262144) != 0 ? contact.internetAddresses : list3;
            java.util.List list14 = (i & 524288) != 0 ? contact.badges : list4;
            java.util.List list15 = (i & 1048576) != 0 ? contact.tags : list5;
            java.util.List list16 = (i & 2097152) != 0 ? contact.sources : list6;
            java.util.List list17 = (i & 4194304) != 0 ? contact.searchWarnings : list7;
            java.util.List list18 = (i & 8388608) != 0 ? contact.surveys : list8;
            com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile2 = (i & 16777216) != 0 ? contact.businessProfile : businessProfile;
            com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo2 = (i & 33554432) != 0 ? contact.spamInfo : spamInfo;
            com.truecaller.search.ContactDto.Contact.Feedback feedback2 = (i & 67108864) != 0 ? contact.feedback : feedback;
            com.truecaller.search.ContactDto.Contact.SenderId senderId2 = (i & 134217728) != 0 ? contact.senderId : senderId;
            java.lang.Integer num2 = (i & 268435456) != 0 ? contact.category : num;
            java.lang.Boolean bool5 = (i & 536870912) != 0 ? contact.isSuspectedFraud : bool2;
            if ((i & 1073741824) != 0) {
                bool3 = bool5;
                list10 = contact.electedTags;
            } else {
                list10 = list9;
                bool3 = bool5;
            }
            return contact.copy(str25, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, number4, number5, number6, bool4, list11, list12, list13, list14, list15, list16, list17, list18, businessProfile2, spamInfo2, feedback2, senderId2, num2, bool3, list10);
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component10, reason: from getter */
        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component11, reason: from getter */
        public final java.lang.String getAccess() {
            return this.access;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component12, reason: from getter */
        public final java.lang.String getImId() {
            return this.imId;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component13, reason: from getter */
        public final java.lang.Number getScore() {
            return this.score;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component14, reason: from getter */
        public final java.lang.Number getCacheTtl() {
            return this.cacheTtl;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component15, reason: from getter */
        public final java.lang.Number getNs() {
            return this.ns;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component16, reason: from getter */
        public final java.lang.Boolean getManualCallerIdPrompt() {
            return this.manualCallerIdPrompt;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> component17() {
            return this.phones;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Address> component18() {
            return this.addresses;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> component19() {
            return this.internetAddresses;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component20() {
            return this.badges;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Tag> component21() {
            return this.tags;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Source> component22() {
            return this.sources;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> component23() {
            return this.searchWarnings;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Survey> component24() {
            return this.surveys;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component25, reason: from getter */
        public final com.truecaller.search.ContactDto.Contact.BusinessProfile getBusinessProfile() {
            return this.businessProfile;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component26, reason: from getter */
        public final com.truecaller.search.ContactDto.Contact.SpamInfo getSpamInfo() {
            return this.spamInfo;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component27, reason: from getter */
        public final com.truecaller.search.ContactDto.Contact.Feedback getFeedback() {
            return this.feedback;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component28, reason: from getter */
        public final com.truecaller.search.ContactDto.Contact.SenderId getSenderId() {
            return this.senderId;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component29, reason: from getter */
        public final java.lang.Integer getCategory() {
            return this.category;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTransliteratedName() {
            return this.transliteratedName;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component30, reason: from getter */
        public final java.lang.Boolean getIsSuspectedFraud() {
            return this.isSuspectedFraud;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> component31() {
            return this.electedTags;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getHandle() {
            return this.handle;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAltName() {
            return this.altName;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component6, reason: from getter */
        public final java.lang.String getGender() {
            return this.gender;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAbout() {
            return this.about;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component8, reason: from getter */
        public final java.lang.String getImage() {
            return this.image;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component9, reason: from getter */
        public final java.lang.String getJobTitle() {
            return this.jobTitle;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.search.ContactDto.Contact copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String transliteratedName, @org.jetbrains.annotations.Nullable java.lang.String handle, @org.jetbrains.annotations.Nullable java.lang.String altName, @org.jetbrains.annotations.Nullable java.lang.String gender, @org.jetbrains.annotations.Nullable java.lang.String about, @org.jetbrains.annotations.Nullable java.lang.String image, @org.jetbrains.annotations.Nullable java.lang.String jobTitle, @org.jetbrains.annotations.Nullable java.lang.String companyName, @org.jetbrains.annotations.Nullable java.lang.String access, @org.jetbrains.annotations.Nullable java.lang.String imId, @org.jetbrains.annotations.Nullable java.lang.Number score, @org.jetbrains.annotations.Nullable java.lang.Number cacheTtl, @org.jetbrains.annotations.Nullable java.lang.Number ns, @org.jetbrains.annotations.Nullable java.lang.Boolean manualCallerIdPrompt, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> phones, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Address> addresses, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> internetAddresses, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> badges, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Tag> tags, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Source> sources, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> searchWarnings, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.Survey> surveys, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.Feedback feedback, @org.jetbrains.annotations.Nullable com.truecaller.search.ContactDto.Contact.SenderId senderId, @org.jetbrains.annotations.Nullable java.lang.Integer category, @org.jetbrains.annotations.Nullable java.lang.Boolean isSuspectedFraud, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> electedTags) {
            return new com.truecaller.search.ContactDto.Contact(id, name, transliteratedName, handle, altName, gender, about, image, jobTitle, companyName, access, imId, score, cacheTtl, ns, manualCallerIdPrompt, phones, addresses, internetAddresses, badges, tags, sources, searchWarnings, surveys, businessProfile, spamInfo, feedback, senderId, category, isSuspectedFraud, electedTags);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.search.ContactDto.Contact)) {
                return false;
            }
            com.truecaller.search.ContactDto.Contact contact = (com.truecaller.search.ContactDto.Contact) other;
            return kotlin.jvm.internal.Intrinsics.b(this.id, contact.id) && kotlin.jvm.internal.Intrinsics.b(this.name, contact.name) && kotlin.jvm.internal.Intrinsics.b(this.transliteratedName, contact.transliteratedName) && kotlin.jvm.internal.Intrinsics.b(this.handle, contact.handle) && kotlin.jvm.internal.Intrinsics.b(this.altName, contact.altName) && kotlin.jvm.internal.Intrinsics.b(this.gender, contact.gender) && kotlin.jvm.internal.Intrinsics.b(this.about, contact.about) && kotlin.jvm.internal.Intrinsics.b(this.image, contact.image) && kotlin.jvm.internal.Intrinsics.b(this.jobTitle, contact.jobTitle) && kotlin.jvm.internal.Intrinsics.b(this.companyName, contact.companyName) && kotlin.jvm.internal.Intrinsics.b(this.access, contact.access) && kotlin.jvm.internal.Intrinsics.b(this.imId, contact.imId) && kotlin.jvm.internal.Intrinsics.b(this.score, contact.score) && kotlin.jvm.internal.Intrinsics.b(this.cacheTtl, contact.cacheTtl) && kotlin.jvm.internal.Intrinsics.b(this.ns, contact.ns) && kotlin.jvm.internal.Intrinsics.b(this.manualCallerIdPrompt, contact.manualCallerIdPrompt) && kotlin.jvm.internal.Intrinsics.b(this.phones, contact.phones) && kotlin.jvm.internal.Intrinsics.b(this.addresses, contact.addresses) && kotlin.jvm.internal.Intrinsics.b(this.internetAddresses, contact.internetAddresses) && kotlin.jvm.internal.Intrinsics.b(this.badges, contact.badges) && kotlin.jvm.internal.Intrinsics.b(this.tags, contact.tags) && kotlin.jvm.internal.Intrinsics.b(this.sources, contact.sources) && kotlin.jvm.internal.Intrinsics.b(this.searchWarnings, contact.searchWarnings) && kotlin.jvm.internal.Intrinsics.b(this.surveys, contact.surveys) && kotlin.jvm.internal.Intrinsics.b(this.businessProfile, contact.businessProfile) && kotlin.jvm.internal.Intrinsics.b(this.spamInfo, contact.spamInfo) && kotlin.jvm.internal.Intrinsics.b(this.feedback, contact.feedback) && kotlin.jvm.internal.Intrinsics.b(this.senderId, contact.senderId) && kotlin.jvm.internal.Intrinsics.b(this.category, contact.category) && kotlin.jvm.internal.Intrinsics.b(this.isSuspectedFraud, contact.isSuspectedFraud) && kotlin.jvm.internal.Intrinsics.b(this.electedTags, contact.electedTags);
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAbout() {
            return this.about;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAccess() {
            return this.access;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Address> getAddresses() {
            return this.addresses;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAltName() {
            return this.altName;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getBadges() {
            return this.badges;
        }

        @org.jetbrains.annotations.Nullable
        public final com.truecaller.search.ContactDto.Contact.BusinessProfile getBusinessProfile() {
            return this.businessProfile;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Number getCacheTtl() {
            return this.cacheTtl;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getCategory() {
            return this.category;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> getElectedTags() {
            return this.electedTags;
        }

        @org.jetbrains.annotations.Nullable
        public final com.truecaller.search.ContactDto.Contact.Feedback getFeedback() {
            return this.feedback;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getGender() {
            return this.gender;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getHandle() {
            return this.handle;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getId() {
            return this.id;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImId() {
            return this.imId;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImage() {
            return this.image;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> getInternetAddresses() {
            return this.internetAddresses;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getJobTitle() {
            return this.jobTitle;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getManualCallerIdPrompt() {
            return this.manualCallerIdPrompt;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getName() {
            return this.name;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Number getNs() {
            return this.ns;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> getPhones() {
            return this.phones;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Number getScore() {
            return this.score;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> getSearchWarnings() {
            return this.searchWarnings;
        }

        @org.jetbrains.annotations.Nullable
        public final com.truecaller.search.ContactDto.Contact.SenderId getSenderId() {
            return this.senderId;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Source> getSources() {
            return this.sources;
        }

        @org.jetbrains.annotations.Nullable
        public final com.truecaller.search.ContactDto.Contact.SpamInfo getSpamInfo() {
            return this.spamInfo;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Survey> getSurveys() {
            return this.surveys;
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.truecaller.search.ContactDto.Contact.Tag> getTags() {
            return this.tags;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTransliteratedName() {
            return this.transliteratedName;
        }

        public int hashCode() {
            java.lang.String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.transliteratedName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.handle;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            java.lang.String str5 = this.altName;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.gender;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            java.lang.String str7 = this.about;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            java.lang.String str8 = this.image;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            java.lang.String str9 = this.jobTitle;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            java.lang.String str10 = this.companyName;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            java.lang.String str11 = this.access;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            java.lang.String str12 = this.imId;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            java.lang.Number number = this.score;
            int hashCode13 = (hashCode12 + (number == null ? 0 : number.hashCode())) * 31;
            java.lang.Number number2 = this.cacheTtl;
            int hashCode14 = (hashCode13 + (number2 == null ? 0 : number2.hashCode())) * 31;
            java.lang.Number number3 = this.ns;
            int hashCode15 = (hashCode14 + (number3 == null ? 0 : number3.hashCode())) * 31;
            java.lang.Boolean bool = this.manualCallerIdPrompt;
            int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> list = this.phones;
            int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.Address> list2 = this.addresses;
            int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> list3 = this.internetAddresses;
            int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
            java.util.List<java.lang.String> list4 = this.badges;
            int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.Tag> list5 = this.tags;
            int hashCode21 = (hashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.Source> list6 = this.sources;
            int hashCode22 = (hashCode21 + (list6 == null ? 0 : list6.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> list7 = this.searchWarnings;
            int hashCode23 = (hashCode22 + (list7 == null ? 0 : list7.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.Survey> list8 = this.surveys;
            int hashCode24 = (hashCode23 + (list8 == null ? 0 : list8.hashCode())) * 31;
            com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile = this.businessProfile;
            int hashCode25 = (hashCode24 + (businessProfile == null ? 0 : businessProfile.hashCode())) * 31;
            com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo = this.spamInfo;
            int hashCode26 = (hashCode25 + (spamInfo == null ? 0 : spamInfo.hashCode())) * 31;
            com.truecaller.search.ContactDto.Contact.Feedback feedback = this.feedback;
            int hashCode27 = (hashCode26 + (feedback == null ? 0 : feedback.hashCode())) * 31;
            com.truecaller.search.ContactDto.Contact.SenderId senderId = this.senderId;
            int hashCode28 = (hashCode27 + (senderId == null ? 0 : senderId.hashCode())) * 31;
            java.lang.Integer num = this.category;
            int hashCode29 = (hashCode28 + (num == null ? 0 : num.hashCode())) * 31;
            java.lang.Boolean bool2 = this.isSuspectedFraud;
            int hashCode30 = (hashCode29 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> list9 = this.electedTags;
            return hashCode30 + (list9 != null ? list9.hashCode() : 0);
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSuspectedFraud() {
            return this.isSuspectedFraud;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.transliteratedName;
            java.lang.String str4 = this.handle;
            java.lang.String str5 = this.altName;
            java.lang.String str6 = this.gender;
            java.lang.String str7 = this.about;
            java.lang.String str8 = this.image;
            java.lang.String str9 = this.jobTitle;
            java.lang.String str10 = this.companyName;
            java.lang.String str11 = this.access;
            java.lang.String str12 = this.imId;
            java.lang.Number number = this.score;
            java.lang.Number number2 = this.cacheTtl;
            java.lang.Number number3 = this.ns;
            java.lang.Boolean bool = this.manualCallerIdPrompt;
            java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> list = this.phones;
            java.util.List<com.truecaller.search.ContactDto.Contact.Address> list2 = this.addresses;
            java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> list3 = this.internetAddresses;
            java.util.List<java.lang.String> list4 = this.badges;
            java.util.List<com.truecaller.search.ContactDto.Contact.Tag> list5 = this.tags;
            java.util.List<com.truecaller.search.ContactDto.Contact.Source> list6 = this.sources;
            java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> list7 = this.searchWarnings;
            java.util.List<com.truecaller.search.ContactDto.Contact.Survey> list8 = this.surveys;
            com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile = this.businessProfile;
            com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo = this.spamInfo;
            com.truecaller.search.ContactDto.Contact.Feedback feedback = this.feedback;
            com.truecaller.search.ContactDto.Contact.SenderId senderId = this.senderId;
            java.lang.Integer num = this.category;
            java.lang.Boolean bool2 = this.isSuspectedFraud;
            java.util.List<com.truecaller.search.ContactDto.Contact.ElectedTag> list9 = this.electedTags;
            java.lang.StringBuilder E = ro0.f.E("Contact(id=", str, ", name=", str2, ", transliteratedName=");
            bar.E(E, str3, ", handle=", str4, ", altName=");
            bar.E(E, str5, ", gender=", str6, ", about=");
            bar.E(E, str7, ", image=", str8, ", jobTitle=");
            bar.E(E, str9, ", companyName=", str10, ", access=");
            bar.E(E, str11, ", imId=", str12, ", score=");
            E.append(number);
            E.append(", cacheTtl=");
            E.append(number2);
            E.append(", ns=");
            E.append(number3);
            E.append(", manualCallerIdPrompt=");
            E.append(bool);
            E.append(", phones=");
            com.ironsource.adqualitysdk.sdk.i.bar.y(E, list, ", addresses=", list2, ", internetAddresses=");
            com.ironsource.adqualitysdk.sdk.i.bar.y(E, list3, ", badges=", list4, ", tags=");
            com.ironsource.adqualitysdk.sdk.i.bar.y(E, list5, ", sources=", list6, ", searchWarnings=");
            com.ironsource.adqualitysdk.sdk.i.bar.y(E, list7, ", surveys=", list8, ", businessProfile=");
            E.append(businessProfile);
            E.append(", spamInfo=");
            E.append(spamInfo);
            E.append(", feedback=");
            E.append(feedback);
            E.append(", senderId=");
            E.append(senderId);
            E.append(", category=");
            E.append(num);
            E.append(", isSuspectedFraud=");
            E.append(bool2);
            E.append(", electedTags=");
            return y.o.g(E, list9, ")");
        }
    }

    public ContactDto(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.search.ContactDto.Contact> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY);
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.search.ContactDto copy$default(com.truecaller.search.ContactDto contactDto, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = contactDto.data;
        }
        return contactDto.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.search.ContactDto.Contact> component1() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.search.ContactDto copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.search.ContactDto.Contact> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY);
        return new com.truecaller.search.ContactDto(data);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.search.ContactDto) && kotlin.jvm.internal.Intrinsics.b(this.data, ((com.truecaller.search.ContactDto) other).data);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.search.ContactDto.Contact> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("ContactDto(data=", ")", this.data);
    }
}
