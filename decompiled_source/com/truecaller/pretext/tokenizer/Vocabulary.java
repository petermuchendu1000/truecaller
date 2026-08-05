package com.truecaller.pretext.tokenizer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/truecaller/pretext/tokenizer/Vocabulary;", "", "", "", "", "tokenToId", "<init>", "(Ljava/util/Map;)V", "token", "getId", "(Ljava/lang/String;)Ljava/lang/Integer;", "defaultId", "getIdOrDefault", "(Ljava/lang/String;I)I", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "getToken", "(I)Ljava/lang/String;", "", "contains", "(Ljava/lang/String;)Z", "", "tokenSet$lib_release", "()Ljava/util/Set;", "tokenSet", "Ljava/util/Map;", "idToToken", "getSize", "()I", "size", "Companion", "kg2/a", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Vocabulary {

    @org.jetbrains.annotations.NotNull
    public static final kg2.a Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, java.lang.String> idToToken;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Integer> tokenToId;

    public /* synthetic */ Vocabulary(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.pretext.tokenizer.Vocabulary fromBytes(@org.jetbrains.annotations.NotNull byte[] bArr) throws java.io.IOException {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "bytes");
        return kg2.a.a(new java.io.ByteArrayInputStream(bArr));
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.pretext.tokenizer.Vocabulary fromInputStream(@org.jetbrains.annotations.NotNull java.io.InputStream inputStream) throws java.io.IOException {
        Companion.getClass();
        return kg2.a.a(inputStream);
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.pretext.tokenizer.Vocabulary fromLines(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        Companion.getClass();
        return kg2.a.b(list);
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.pretext.tokenizer.Vocabulary fromMap(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Integer> map) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        return new com.truecaller.pretext.tokenizer.Vocabulary(new java.util.HashMap(map), null);
    }

    public final boolean contains(@org.jetbrains.annotations.NotNull java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return this.tokenToId.containsKey(token);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId(@org.jetbrains.annotations.NotNull java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return this.tokenToId.get(token);
    }

    public final int getIdOrDefault(@org.jetbrains.annotations.NotNull java.lang.String token, int defaultId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        java.lang.Integer num = this.tokenToId.get(token);
        if (num != null) {
            return num.intValue();
        }
        return defaultId;
    }

    public final int getSize() {
        return this.tokenToId.size();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToken(int id) {
        return this.idToToken.get(java.lang.Integer.valueOf(id));
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> tokenSet$lib_release() {
        return this.tokenToId.keySet();
    }

    private Vocabulary(java.util.Map<java.lang.String, java.lang.Integer> map) {
        this.tokenToId = map;
        af3.g gVar = new af3.g(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
            j03.f.p(gVar, java.lang.Integer.valueOf(entry.getValue().intValue()), entry.getKey());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "builder");
        this.idToToken = gVar.d();
    }
}
