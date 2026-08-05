package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class bar extends android.view.animation.Animation {
    public final /* synthetic */ int a = 2;
    public final android.view.View b;

    public bar(android.view.View view) {
        this.b = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        switch (this.a) {
            case 0:
                com.truecaller.common.ui.PieChart pieChart = (com.truecaller.common.ui.PieChart) this.b;
                pieChart.setArcAngle(f * 360.0f);
                pieChart.invalidate();
                return;
            case 1:
                com.truecaller.common.ui.LineChart lineChart = (com.truecaller.common.ui.LineChart) this.b;
                lineChart.setProgress(lineChart.getWidth() * f);
                lineChart.invalidate();
                return;
            default:
                this.b.setAlpha((1 - f) * 0.5f);
                return;
        }
    }

    public bar(com.truecaller.common.ui.LineChart lineChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChart, "lineChart");
        this.b = lineChart;
    }

    public bar(com.truecaller.common.ui.PieChart pieChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pieChart, "pieChart");
        this.b = pieChart;
    }
}
