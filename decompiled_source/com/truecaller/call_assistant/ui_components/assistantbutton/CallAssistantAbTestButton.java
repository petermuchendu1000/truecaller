package com.truecaller.call_assistant.ui_components.assistantbutton;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantAbTestButton extends android.widget.FrameLayout {
    public final android.widget.FrameLayout a;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/call_assistant/ui_components/assistantbutton/CallAssistantAbTestButton$bar;", "", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallAssistantAbTestButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final pt0.qux getCastedView() {
        android.view.ViewParent viewParent = this.a;
        if (viewParent != null) {
            return (pt0.qux) viewParent;
        }
        return null;
    }

    public final void a(boolean z, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("callerIdPopup", "callAnalyticsContext");
        pt0.qux castedView = getCastedView();
        if (castedView != null) {
            castedView.a(z, str, num, bool);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallAssistantAbTestButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAssistantAbTestButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        qo1.c cVar = (qo1.b) ((tx.w) ((com.truecaller.call_assistant.ui_components.assistantbutton.CallAssistantAbTestButton.bar) j71.g.E(com.truecaller.call_assistant.ui_components.assistantbutton.CallAssistantAbTestButton.bar.class, context.getApplicationContext()))).H.b.a.p8.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "callAssistantFeaturesInventory");
        if (cVar.b.a("featureAssistantAnimationButton", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            pt0.baz bazVar = new pt0.baz(context, attributeSet, i);
            this.a = bazVar;
            addView(bazVar);
        } else {
            pt0.d dVar = new pt0.d(context, attributeSet, i);
            this.a = dVar;
            addView(dVar);
        }
    }

    public /* synthetic */ CallAssistantAbTestButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
