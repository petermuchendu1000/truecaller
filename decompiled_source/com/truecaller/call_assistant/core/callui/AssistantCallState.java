package com.truecaller.call_assistant.core.callui;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "", "<init>", "()V", "None", "Screening", "Incoming", "Connecting", "PstnAnswerWhenDefaultDialer", "PstnAnswerNonDefaultDialer", "Ongoing", "Disconnected", "Error", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Connecting;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Disconnected;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Error;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Incoming;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$None;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Ongoing;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$PstnAnswerNonDefaultDialer;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$PstnAnswerWhenDefaultDialer;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Screening;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class AssistantCallState {
    public static final int $stable = 0;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Connecting;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Connecting extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.Connecting INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.Connecting();

        private Connecting() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Connecting);
        }

        public int hashCode() {
            return -706699909;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Connecting";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Disconnected;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Disconnected extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.Disconnected INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.Disconnected();

        private Disconnected() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Disconnected);
        }

        public int hashCode() {
            return 456730686;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Disconnected";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Error;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Error extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.Error INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.Error();

        private Error() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Error);
        }

        public int hashCode() {
            return -1251261083;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Error";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Incoming;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Incoming extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming();

        private Incoming() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming);
        }

        public int hashCode() {
            return -1600984151;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Incoming";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$None;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class None extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.None INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.None();

        private None() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.None);
        }

        public int hashCode() {
            return 1483922491;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "None";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Ongoing;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Ongoing extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.Ongoing INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.Ongoing();

        private Ongoing() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Ongoing);
        }

        public int hashCode() {
            return 289363864;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Ongoing";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$PstnAnswerNonDefaultDialer;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class PstnAnswerNonDefaultDialer extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerNonDefaultDialer INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerNonDefaultDialer();

        private PstnAnswerNonDefaultDialer() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerNonDefaultDialer);
        }

        public int hashCode() {
            return -1469629265;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "PstnAnswerNonDefaultDialer";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$PstnAnswerWhenDefaultDialer;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class PstnAnswerWhenDefaultDialer extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerWhenDefaultDialer INSTANCE = new com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerWhenDefaultDialer();

        private PstnAnswerWhenDefaultDialer() {
            super(null);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.PstnAnswerWhenDefaultDialer);
        }

        public int hashCode() {
            return -1524647002;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "PstnAnswerWhenDefaultDialer";
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/AssistantCallState$Screening;", "Lcom/truecaller/call_assistant/core/callui/AssistantCallState;", "pushTitle", "", "pushBody", "shouldStartChat", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPushTitle", "()Ljava/lang/String;", "getPushBody", "getShouldStartChat", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Screening extends com.truecaller.call_assistant.core.callui.AssistantCallState {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String pushBody;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String pushTitle;
        private final boolean shouldStartChat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Screening(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "pushTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "pushBody");
            this.pushTitle = str;
            this.pushBody = str2;
            this.shouldStartChat = z;
        }

        public static /* synthetic */ com.truecaller.call_assistant.core.callui.AssistantCallState.Screening copy$default(com.truecaller.call_assistant.core.callui.AssistantCallState.Screening screening, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = screening.pushTitle;
            }
            if ((i & 2) != 0) {
                str2 = screening.pushBody;
            }
            if ((i & 4) != 0) {
                z = screening.shouldStartChat;
            }
            return screening.copy(str, str2, z);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPushTitle() {
            return this.pushTitle;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPushBody() {
            return this.pushBody;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldStartChat() {
            return this.shouldStartChat;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.call_assistant.core.callui.AssistantCallState.Screening copy(@org.jetbrains.annotations.NotNull java.lang.String pushTitle, @org.jetbrains.annotations.NotNull java.lang.String pushBody, boolean shouldStartChat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushTitle, "pushTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushBody, "pushBody");
            return new com.truecaller.call_assistant.core.callui.AssistantCallState.Screening(pushTitle, pushBody, shouldStartChat);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.call_assistant.core.callui.AssistantCallState.Screening)) {
                return false;
            }
            com.truecaller.call_assistant.core.callui.AssistantCallState.Screening screening = (com.truecaller.call_assistant.core.callui.AssistantCallState.Screening) other;
            return kotlin.jvm.internal.Intrinsics.b(this.pushTitle, screening.pushTitle) && kotlin.jvm.internal.Intrinsics.b(this.pushBody, screening.pushBody) && this.shouldStartChat == screening.shouldStartChat;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPushBody() {
            return this.pushBody;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPushTitle() {
            return this.pushTitle;
        }

        public final boolean getShouldStartChat() {
            return this.shouldStartChat;
        }

        public int hashCode() {
            int i;
            int e = ax1.bar.e(this.pushTitle.hashCode() * 31, 31, this.pushBody);
            if (this.shouldStartChat) {
                i = 1231;
            } else {
                i = 1237;
            }
            return e + i;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.pushTitle;
            java.lang.String str2 = this.pushBody;
            return h8.s0.s(ro0.f.E("Screening(pushTitle=", str, ", pushBody=", str2, ", shouldStartChat="), this.shouldStartChat, ")");
        }
    }

    public /* synthetic */ AssistantCallState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssistantCallState() {
    }
}
