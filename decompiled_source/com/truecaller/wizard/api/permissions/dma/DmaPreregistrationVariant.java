package com.truecaller.wizard.api.permissions.dma;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bw\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\u0082\u0001\u0005\f\u000e\r\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/truecaller/wizard/api/permissions/dma/DmaPreregistrationVariant;", "", "", "getShouldAskSmsPermission", "()Z", "shouldAskSmsPermission", "getShouldAskDmaRole", "shouldAskDmaRole", "getShouldShowLegacyTutorial", "shouldShowLegacyTutorial", "getShouldShowDmaDialog", "shouldShowDmaDialog", "g83/bar", "g83/qux", "g83/baz", "g83/a", "g83/b", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public interface DmaPreregistrationVariant {
    boolean getShouldAskDmaRole();

    boolean getShouldAskSmsPermission();

    boolean getShouldShowDmaDialog();

    boolean getShouldShowLegacyTutorial();
}
