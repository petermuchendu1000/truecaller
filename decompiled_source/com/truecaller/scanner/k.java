package com.truecaller.scanner;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k {
    public static final java.util.regex.Pattern b = android.util.Patterns.PHONE;
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("([\\da-zA-Z-._]+@[a-zA-Z\\d]{3,})(?![\\w\\d.])", 2);
    public static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("[0-9]");
    public final java.util.ArrayList a;

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.vision.text.Line, java.lang.Object] */
    public k(com.google.android.gms.vision.text.TextBlock textBlock) {
        java.util.ArrayList arrayList;
        com.google.android.gms.internal.vision.zzah[] zzahVarArr = textBlock.a;
        if (zzahVarArr.length == 0) {
            arrayList = new java.util.ArrayList(0);
        } else {
            if (textBlock.b == null) {
                textBlock.b = new java.util.ArrayList(zzahVarArr.length);
                for (com.google.android.gms.internal.vision.zzah zzahVar : zzahVarArr) {
                    java.util.ArrayList arrayList2 = textBlock.b;
                    ?? obj = new java.lang.Object();
                    ((com.google.android.gms.vision.text.Line) obj).a = zzahVar;
                    arrayList2.add(obj);
                }
            }
            arrayList = textBlock.b;
        }
        this.a = arrayList;
    }

    public static java.util.ArrayList a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.regex.Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            java.lang.String group = matcher.group();
            int i = 0;
            while (d.matcher(group).find()) {
                i++;
            }
            if (i > 7) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }
}
