package com.truecaller.adapter_delegates;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\r\u001a;\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Landroid/view/View;", "Ln00/h;", "receiver", "Landroidx/recyclerview/widget/k2;", "holder", "Lkotlin/Function0;", "", "action", "", "data", "", "setClickEventEmitter", "(Landroid/view/View;Ln00/h;Landroidx/recyclerview/widget/k2;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "(Landroid/view/View;Ln00/h;Landroidx/recyclerview/widget/k2;Ljava/lang/String;Ljava/lang/Object;)V", "dataHolder", "(Landroid/view/View;Ln00/h;Landroidx/recyclerview/widget/k2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "setLongClickEventEmitter", "adapter-delegates-lib_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ItemEventKt {
    public static final void setClickEventEmitter(@org.jetbrains.annotations.NotNull android.view.View view, @org.jetbrains.annotations.NotNull n00.h hVar, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.k2 k2Var, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.String> function0, @org.jetbrains.annotations.Nullable java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setClickEventEmitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "receiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "action");
        view.setOnClickListener(new n00.e(view, hVar, function0, k2Var, obj, 0));
    }

    public static /* synthetic */ void setClickEventEmitter$default(android.view.View view, n00.h hVar, androidx.recyclerview.widget.k2 k2Var, kotlin.jvm.functions.Function0 function0, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 8) != 0) {
            obj = null;
        }
        setClickEventEmitter(view, hVar, k2Var, (kotlin.jvm.functions.Function0<java.lang.String>) function0, obj);
    }

    public static final void setLongClickEventEmitter(@org.jetbrains.annotations.NotNull android.view.View view, @org.jetbrains.annotations.NotNull n00.h hVar, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.k2 k2Var, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setLongClickEventEmitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "receiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "action");
        view.setOnLongClickListener(new n00.f(view, hVar, k2Var, str, obj));
    }

    public static /* synthetic */ void setLongClickEventEmitter$default(android.view.View view, n00.h hVar, androidx.recyclerview.widget.k2 k2Var, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str = "ItemEvent.LONG_CLICKED";
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        setLongClickEventEmitter(view, hVar, k2Var, str, obj);
    }

    public static final void setClickEventEmitter(@org.jetbrains.annotations.NotNull android.view.View view, @org.jetbrains.annotations.NotNull n00.h hVar, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.k2 k2Var, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setClickEventEmitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "receiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "action");
        view.setOnClickListener(new n00.e(view, hVar, str, k2Var, obj, 1));
    }

    public static /* synthetic */ void setClickEventEmitter$default(android.view.View view, n00.h hVar, androidx.recyclerview.widget.k2 k2Var, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str = "ItemEvent.CLICKED";
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        setClickEventEmitter(view, hVar, k2Var, str, obj);
    }

    public static final void setClickEventEmitter(@org.jetbrains.annotations.NotNull android.view.View view, @org.jetbrains.annotations.NotNull n00.h hVar, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.k2 k2Var, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.lang.Object> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setClickEventEmitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "receiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "dataHolder");
        view.setOnClickListener(new n00.e(view, hVar, k2Var, str, function0));
    }

    public static /* synthetic */ void setClickEventEmitter$default(android.view.View view, n00.h hVar, androidx.recyclerview.widget.k2 k2Var, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "ItemEvent.CLICKED";
        }
        setClickEventEmitter(view, hVar, k2Var, str, (kotlin.jvm.functions.Function0<? extends java.lang.Object>) function0);
    }
}
