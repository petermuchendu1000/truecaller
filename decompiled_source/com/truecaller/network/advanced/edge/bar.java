package com.truecaller.network.advanced.edge;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R@\u0010\f\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/truecaller/network/advanced/edge/bar;", "", "<init>", "()V", "", "", "Lcom/truecaller/network/advanced/edge/bar$bar;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "data", "", "b", "I", "()I", "setTimeToLive", "(I)V", "timeToLive", "bar", "network-advanced_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("data")
    @org.jetbrains.annotations.Nullable
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.truecaller.network.advanced.edge.bar.C0000bar>> data;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("ttl")
    private int timeToLive;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/truecaller/network/advanced/edge/bar$bar;", "", "<init>", "()V", "", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "(Ljava/util/List;)V", "edges", "network-advanced_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.truecaller.network.advanced.edge.bar$bar, reason: collision with other inner class name */
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class C0000bar {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("edges")
        @org.jetbrains.annotations.Nullable
        private java.util.List<java.lang.String> edges;

        public C0000bar() {
        }

        /* renamed from: a, reason: from getter */
        public final java.util.List getEdges() {
            return this.edges;
        }

        public final void b(java.util.ArrayList arrayList) {
            this.edges = arrayList;
        }

        public final java.lang.String toString() {
            return com.appsflyer.internal.e.k("Endpoint(edges=", ")", this.edges);
        }

        public C0000bar(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "host");
            this.edges = kotlin.collections.y.l(new java.lang.String[]{str});
        }
    }

    /* renamed from: a, reason: from getter */
    public final java.util.Map getData() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final int getTimeToLive() {
        return this.timeToLive;
    }

    public final void c(java.util.LinkedHashMap linkedHashMap) {
        this.data = linkedHashMap;
    }

    public final java.lang.String toString() {
        return "EdgeDto(data=" + this.data + ", timeToLive=" + this.timeToLive + ")";
    }
}
