package com.truecaller.call_assistant.core.onboarding;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult;", "Landroid/os/Parcelable;", "<init>", "()V", "NextStep", "DemoCall", "Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult$DemoCall;", "Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult$NextStep;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class LegacyOnboardingStepResult implements android.os.Parcelable {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult$DemoCall;", "Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class DemoCall extends com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.DemoCall> CREATOR = new java.lang.Object();
        public final java.lang.String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DemoCall(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContextForDemoCall");
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.DemoCall) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.DemoCall) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("DemoCall(analyticsContextForDemoCall=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult$NextStep;", "Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStepResult;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class NextStep extends com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.NextStep> CREATOR = new java.lang.Object();
        public final java.lang.String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NextStep(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContextForNextStep");
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.NextStep) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.NextStep) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("NextStep(analyticsContextForNextStep=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
        }
    }

    public /* synthetic */ LegacyOnboardingStepResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LegacyOnboardingStepResult() {
    }
}
