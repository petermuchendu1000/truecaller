package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i {
    public static final java.util.List f = kotlin.collections.y.j(new java.lang.String[]{"android.", "androidx.", "com.android.", "com.androidx.", "java.", "javax.", "kotlin.", "kotlinx.", "dalvik.", "libcore.", "com.google.android."});
    public final java.lang.String a;
    public final java.util.ArrayList b;
    public final java.lang.String c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;

    public i(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        final int i = 0;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.h
            public final /* synthetic */ com.truecaller.analytics.technical.anr.i b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.lang.Object obj;
                java.lang.Object obj2;
                java.lang.Object obj3;
                java.lang.Object obj4;
                java.lang.Object obj5;
                java.lang.Object obj6;
                switch (i) {
                    case 0:
                        com.truecaller.analytics.technical.anr.i iVar = this.b;
                        java.util.ArrayList arrayList2 = iVar.b;
                        java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            obj = null;
                            if (listIterator.hasPrevious()) {
                                obj2 = listIterator.previous();
                                java.lang.String className = ((java.lang.StackTraceElement) obj2).getClassName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                                if (kotlin.text.y.w(className, iVar.c, true)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) obj2;
                        if (stackTraceElement == null) {
                            java.util.ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    obj3 = listIterator2.previous();
                                    java.lang.String className2 = ((java.lang.StackTraceElement) obj3).getClassName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
                                    if (kotlin.text.StringsKt.N(className2, "truecaller", true)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) obj3;
                            if (stackTraceElement2 == null) {
                                java.util.ListIterator listIterator3 = arrayList2.listIterator(arrayList2.size());
                                while (listIterator3.hasPrevious()) {
                                    java.lang.Object previous = listIterator3.previous();
                                    java.lang.StackTraceElement stackTraceElement3 = (java.lang.StackTraceElement) previous;
                                    java.util.List<java.lang.String> list = com.truecaller.analytics.technical.anr.i.f;
                                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                                        for (java.lang.String str3 : list) {
                                            java.lang.String className3 = stackTraceElement3.getClassName();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className3, "getClassName(...)");
                                            if (kotlin.text.y.w(className3, str3, true)) {
                                                break;
                                            }
                                        }
                                    }
                                    obj = previous;
                                    return (java.lang.StackTraceElement) obj;
                                    break;
                                }
                                return (java.lang.StackTraceElement) obj;
                            }
                            return stackTraceElement2;
                        }
                        return stackTraceElement;
                    default:
                        com.truecaller.analytics.technical.anr.i iVar2 = this.b;
                        java.util.ArrayList arrayList3 = iVar2.b;
                        java.util.Iterator it = arrayList3.iterator();
                        while (true) {
                            obj4 = null;
                            if (it.hasNext()) {
                                obj5 = it.next();
                                java.lang.String className4 = ((java.lang.StackTraceElement) obj5).getClassName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className4, "getClassName(...)");
                                if (kotlin.text.y.w(className4, iVar2.c, true)) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        java.lang.StackTraceElement stackTraceElement4 = (java.lang.StackTraceElement) obj5;
                        if (stackTraceElement4 == null) {
                            java.util.Iterator it2 = arrayList3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj6 = it2.next();
                                    java.lang.String className5 = ((java.lang.StackTraceElement) obj6).getClassName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className5, "getClassName(...)");
                                    if (kotlin.text.StringsKt.N(className5, "truecaller", true)) {
                                    }
                                } else {
                                    obj6 = null;
                                }
                            }
                            java.lang.StackTraceElement stackTraceElement5 = (java.lang.StackTraceElement) obj6;
                            if (stackTraceElement5 == null) {
                                for (java.lang.Object obj7 : arrayList3) {
                                    java.lang.StackTraceElement stackTraceElement6 = (java.lang.StackTraceElement) obj7;
                                    java.util.List<java.lang.String> list2 = com.truecaller.analytics.technical.anr.i.f;
                                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                                        for (java.lang.String str4 : list2) {
                                            java.lang.String className6 = stackTraceElement6.getClassName();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className6, "getClassName(...)");
                                            if (kotlin.text.y.w(className6, str4, true)) {
                                                break;
                                            }
                                        }
                                    }
                                    obj4 = obj7;
                                    return (java.lang.StackTraceElement) obj4;
                                    break;
                                }
                                return (java.lang.StackTraceElement) obj4;
                            }
                            return stackTraceElement5;
                        }
                        return stackTraceElement4;
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.h
            public final /* synthetic */ com.truecaller.analytics.technical.anr.i b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                java.lang.Object obj;
                java.lang.Object obj2;
                java.lang.Object obj3;
                java.lang.Object obj4;
                java.lang.Object obj5;
                java.lang.Object obj6;
                switch (i2) {
                    case 0:
                        com.truecaller.analytics.technical.anr.i iVar = this.b;
                        java.util.ArrayList arrayList2 = iVar.b;
                        java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            obj = null;
                            if (listIterator.hasPrevious()) {
                                obj2 = listIterator.previous();
                                java.lang.String className = ((java.lang.StackTraceElement) obj2).getClassName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                                if (kotlin.text.y.w(className, iVar.c, true)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) obj2;
                        if (stackTraceElement == null) {
                            java.util.ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    obj3 = listIterator2.previous();
                                    java.lang.String className2 = ((java.lang.StackTraceElement) obj3).getClassName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
                                    if (kotlin.text.StringsKt.N(className2, "truecaller", true)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) obj3;
                            if (stackTraceElement2 == null) {
                                java.util.ListIterator listIterator3 = arrayList2.listIterator(arrayList2.size());
                                while (listIterator3.hasPrevious()) {
                                    java.lang.Object previous = listIterator3.previous();
                                    java.lang.StackTraceElement stackTraceElement3 = (java.lang.StackTraceElement) previous;
                                    java.util.List<java.lang.String> list = com.truecaller.analytics.technical.anr.i.f;
                                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                                        for (java.lang.String str3 : list) {
                                            java.lang.String className3 = stackTraceElement3.getClassName();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className3, "getClassName(...)");
                                            if (kotlin.text.y.w(className3, str3, true)) {
                                                break;
                                            }
                                        }
                                    }
                                    obj = previous;
                                    return (java.lang.StackTraceElement) obj;
                                    break;
                                }
                                return (java.lang.StackTraceElement) obj;
                            }
                            return stackTraceElement2;
                        }
                        return stackTraceElement;
                    default:
                        com.truecaller.analytics.technical.anr.i iVar2 = this.b;
                        java.util.ArrayList arrayList3 = iVar2.b;
                        java.util.Iterator it = arrayList3.iterator();
                        while (true) {
                            obj4 = null;
                            if (it.hasNext()) {
                                obj5 = it.next();
                                java.lang.String className4 = ((java.lang.StackTraceElement) obj5).getClassName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className4, "getClassName(...)");
                                if (kotlin.text.y.w(className4, iVar2.c, true)) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        java.lang.StackTraceElement stackTraceElement4 = (java.lang.StackTraceElement) obj5;
                        if (stackTraceElement4 == null) {
                            java.util.Iterator it2 = arrayList3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj6 = it2.next();
                                    java.lang.String className5 = ((java.lang.StackTraceElement) obj6).getClassName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className5, "getClassName(...)");
                                    if (kotlin.text.StringsKt.N(className5, "truecaller", true)) {
                                    }
                                } else {
                                    obj6 = null;
                                }
                            }
                            java.lang.StackTraceElement stackTraceElement5 = (java.lang.StackTraceElement) obj6;
                            if (stackTraceElement5 == null) {
                                for (java.lang.Object obj7 : arrayList3) {
                                    java.lang.StackTraceElement stackTraceElement6 = (java.lang.StackTraceElement) obj7;
                                    java.util.List<java.lang.String> list2 = com.truecaller.analytics.technical.anr.i.f;
                                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                                        for (java.lang.String str4 : list2) {
                                            java.lang.String className6 = stackTraceElement6.getClassName();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className6, "getClassName(...)");
                                            if (kotlin.text.y.w(className6, str4, true)) {
                                                break;
                                            }
                                        }
                                    }
                                    obj4 = obj7;
                                    return (java.lang.StackTraceElement) obj4;
                                    break;
                                }
                                return (java.lang.StackTraceElement) obj4;
                            }
                            return stackTraceElement5;
                        }
                        return stackTraceElement4;
                }
            }
        });
    }
}
