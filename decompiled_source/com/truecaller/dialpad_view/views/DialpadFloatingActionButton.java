package com.truecaller.dialpad_view.views;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DialpadFloatingActionButton extends com.google.android.material.floatingactionbutton.FloatingActionButton {
    public static final /* synthetic */ int s = 0;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadFloatingActionButton(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final long getAnimationDuration() {
        return ((java.lang.Number) this.q.getValue()).longValue();
    }

    private final android.util.SparseArray<android.graphics.drawable.Drawable> getDrawables() {
        return (android.util.SparseArray) this.r.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialpadFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.truecaller.dialpad_view.data.DialpadState dialpadState = com.truecaller.dialpad_view.data.DialpadState.DIALPAD_DOWN;
        final int i2 = 0;
        this.q = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: lg1.bar
            public final /* synthetic */ com.truecaller.dialpad_view.views.DialpadFloatingActionButton b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i3 = i2;
                com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.dialpad_view.views.DialpadFloatingActionButton.s;
                        return java.lang.Long.valueOf(floatingActionButton.getResources().getInteger(android.R.integer.config_shortAnimTime));
                    default:
                        int i5 = com.truecaller.dialpad_view.views.DialpadFloatingActionButton.s;
                        android.util.SparseArray sparseArray = new android.util.SparseArray(2);
                        com.truecaller.dialpad_view.data.DialpadState dialpadState2 = com.truecaller.dialpad_view.data.DialpadState.DIALPAD_DOWN;
                        int drawable = dialpadState2.getDrawable();
                        android.content.Context context2 = floatingActionButton.getContext();
                        int drawable2 = dialpadState2.getDrawable();
                        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
                        sparseArray.put(drawable, bi3.a.x(context2, drawable2, 2130970634, mode));
                        com.truecaller.dialpad_view.data.DialpadState dialpadState3 = com.truecaller.dialpad_view.data.DialpadState.NUMBER_ENTERED;
                        sparseArray.put(dialpadState3.getDrawable(), bi3.a.x(floatingActionButton.getContext(), dialpadState3.getDrawable(), 2130970569, mode));
                        return sparseArray;
                }
            }
        });
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(2);
        com.truecaller.dialpad_view.data.DialpadState dialpadState2 = com.truecaller.dialpad_view.data.DialpadState.DIALPAD_DOWN;
        sparseIntArray.put(dialpadState2.getColorAttr(), bi3.a.s(getContext(), dialpadState2.getColorAttr()));
        com.truecaller.dialpad_view.data.DialpadState dialpadState3 = com.truecaller.dialpad_view.data.DialpadState.NUMBER_ENTERED;
        sparseIntArray.put(dialpadState3.getColorAttr(), bi3.a.s(getContext(), dialpadState3.getColorAttr()));
        final int i3 = 1;
        this.r = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: lg1.bar
            public final /* synthetic */ com.truecaller.dialpad_view.views.DialpadFloatingActionButton b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i33 = i3;
                com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.b;
                switch (i33) {
                    case 0:
                        int i4 = com.truecaller.dialpad_view.views.DialpadFloatingActionButton.s;
                        return java.lang.Long.valueOf(floatingActionButton.getResources().getInteger(android.R.integer.config_shortAnimTime));
                    default:
                        int i5 = com.truecaller.dialpad_view.views.DialpadFloatingActionButton.s;
                        android.util.SparseArray sparseArray = new android.util.SparseArray(2);
                        com.truecaller.dialpad_view.data.DialpadState dialpadState22 = com.truecaller.dialpad_view.data.DialpadState.DIALPAD_DOWN;
                        int drawable = dialpadState22.getDrawable();
                        android.content.Context context2 = floatingActionButton.getContext();
                        int drawable2 = dialpadState22.getDrawable();
                        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
                        sparseArray.put(drawable, bi3.a.x(context2, drawable2, 2130970634, mode));
                        com.truecaller.dialpad_view.data.DialpadState dialpadState32 = com.truecaller.dialpad_view.data.DialpadState.NUMBER_ENTERED;
                        sparseArray.put(dialpadState32.getDrawable(), bi3.a.x(floatingActionButton.getContext(), dialpadState32.getDrawable(), 2130970569, mode));
                        return sparseArray;
                }
            }
        });
        setBackgroundTintList(android.content.res.ColorStateList.valueOf(sparseIntArray.get(dialpadState2.getColorAttr())));
        setImageTintList(android.content.res.ColorStateList.valueOf(-1));
    }
}
