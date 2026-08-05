package com.truecaller.messaging.newconversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ForwardListItemX extends com.truecaller.common.ui.listitem.ListItemX {
    public final com.truecaller.messaging.views.ChatSwitchView z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForwardListItemX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.views.ChatSwitchView getChatSwitchView() {
        return this.z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForwardListItemX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, com.truecaller.messaging.views.ChatSwitchView, android.view.View] */
    public ForwardListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        ?? chatSwitchView = new com.truecaller.messaging.views.ChatSwitchView(context, null, 0, 6, null);
        this.z = chatSwitchView;
        chatSwitchView.setId(android.view.View.generateViewId());
        chatSwitchView.setVisibility(8);
        chatSwitchView.M();
        chatSwitchView.N();
        chatSwitchView.setMaxWidth(t41.i.b(80.0f, getContext()));
        addView(chatSwitchView);
        d6.j jVar = new d6.j();
        jVar.e(this);
        jVar.g(chatSwitchView.getId(), 7, getId(), 7);
        jVar.g(chatSwitchView.getId(), 3, 2131362381, 3);
        jVar.g(chatSwitchView.getId(), 4, 2131362381, 4);
        jVar.g(2131367033, 7, chatSwitchView.getId(), 6);
        jVar.b(this);
    }

    public /* synthetic */ ForwardListItemX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
