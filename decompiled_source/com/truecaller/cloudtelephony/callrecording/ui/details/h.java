package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.truecaller.common.cloudtelephony.ui.EmojiFeedBackDialog.Selection.values().length];
        try {
            iArr[com.truecaller.common.cloudtelephony.ui.EmojiFeedBackDialog.Selection.NEGATIVE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.common.cloudtelephony.ui.EmojiFeedBackDialog.Selection.NEUTRAL.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.common.cloudtelephony.ui.EmojiFeedBackDialog.Selection.POSITIVE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.values().length];
        try {
            iArr2[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.RECORDING.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.TRANSCRIPTION.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.SUMMARY.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
