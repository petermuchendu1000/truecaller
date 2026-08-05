package com.truecaller.settings.api.call_assistant;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class f {
    public static final oq2.bar a(com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting callAssistantScreeningSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callAssistantScreeningSetting, "<this>");
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.ScreenCalls.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023100, 2132023099, 2131232175, 2130970586);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.SendToVoicemail.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023102, 2132023101, 2131232181, 2130970594);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.PhonebookContacts.DoNotScreenCalls.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023098, 2132023097, 2131232152, 2130970588);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.ScreenCalls.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023118, 2132023117, 2131232151, 2130970585);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.RingPhone.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023116, 2132023115, 2131232175, 2130970586);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.TopSpammers.BlockCalls.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023113, 2132023112, 2131232150, 2130970589);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers.ScreenCalls.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023095, 2132023094, 2131232151, 2130970585);
        }
        if (kotlin.jvm.internal.Intrinsics.b(callAssistantScreeningSetting, com.truecaller.settings.api.call_assistant.CallAssistantScreeningSetting.NonPhonebookCallers.RingPhone.a)) {
            return new oq2.bar(callAssistantScreeningSetting, 2132023093, 2132023092, 2131232175, 2130970586);
        }
        throw new java.lang.RuntimeException();
    }
}
