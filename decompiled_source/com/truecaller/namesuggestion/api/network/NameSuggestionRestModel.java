package com.truecaller.namesuggestion.api.network;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/namesuggestion/api/network/NameSuggestionRestModel;", "", "<init>", "()V", "bar", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NameSuggestionRestModel {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\nR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/truecaller/namesuggestion/api/network/NameSuggestionRestModel$bar;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "phoneNumber", "e", "name", "", "c", "I", "d", "()I", "h", "(I)V", "type", "g", "source", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class bar {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("p")
        @org.jetbrains.annotations.Nullable
        private java.lang.String phoneNumber;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("n")
        @org.jetbrains.annotations.Nullable
        private java.lang.String name;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("t")
        private int type;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("s")
        private int source;

        /* renamed from: a, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: b, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: c, reason: from getter */
        public final int getSource() {
            return this.source;
        }

        /* renamed from: d, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final void e(java.lang.String str) {
            this.name = str;
        }

        public final void f(java.lang.String str) {
            this.phoneNumber = str;
        }

        public final void g(int i) {
            this.source = i;
        }

        public final void h(int i) {
            this.type = i;
        }
    }
}
