package com.truecaller.analytics.technical;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0003J3\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0%2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lcom/truecaller/analytics/technical/AppStartTracker;", "Led0/baz;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityCreate", "(Landroid/app/Activity;)V", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onBroadcastReceive", "(Landroid/content/BroadcastReceiver;Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/app/Service;", "service", "onServiceCreate", "(Landroid/app/Service;)V", "enableTracking", "", "componentType", "", "component", "componentExtra", "logAppStart", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "", "Led0/bar;", "appStarts", "saveAppStarts", "(Landroid/content/Context;Ljava/util/List;)V", "Ljava/io/File;", "getAppStartsFile", "(Landroid/content/Context;)Ljava/io/File;", "", "getAppStarts", "(Landroid/content/Context;)[Led0/bar;", "", "hasLogged", "Z", "isEnabled", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AppStartTracker implements ed0.baz {
    private static boolean hasLogged;
    private static boolean isEnabled;

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.analytics.technical.AppStartTracker INSTANCE = new com.truecaller.analytics.technical.AppStartTracker();
    public static final int $stable = 8;

    private AppStartTracker() {
    }

    public static final void enableTracking() {
        isEnabled = true;
    }

    private final java.io.File getAppStartsFile(android.content.Context context) {
        android.os.Environment.getDataDirectory();
        return new java.io.File(context.getFilesDir(), "app_starts.bin");
    }

    private final void logAppStart(android.content.Context context, java.lang.String componentType, java.lang.Object component, java.lang.String componentExtra) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hasLogged = true;
        int myPid = android.os.Process.myPid();
        long b = elapsedRealtime - dl.m.b();
        java.lang.String name = component.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        ed0.bar barVar = new ed0.bar(myPid, b, currentTimeMillis, componentType, name, componentExtra);
        fg3.h0.J(fg3.f1.a, fg3.r0.b, (fg3.f0) null, new c73.c(currentTimeMillis, context, barVar, (df3.bar) null, 2), 2);
    }

    public static /* synthetic */ void logAppStart$default(com.truecaller.analytics.technical.AppStartTracker appStartTracker, android.content.Context context, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        appStartTracker.logAppStart(context, str, obj, str2);
    }

    public static final void onActivityCreate(@org.jetbrains.annotations.NotNull android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (!hasLogged && isEnabled) {
            com.truecaller.analytics.technical.AppStartTracker appStartTracker = INSTANCE;
            android.content.Context applicationContext = activity.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            logAppStart$default(appStartTracker, applicationContext, "Activity", activity, null, 8, null);
        }
    }

    public static final void onBroadcastReceive(@org.jetbrains.annotations.NotNull android.content.BroadcastReceiver receiver, @org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.Nullable android.content.Intent intent) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "receiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!hasLogged && isEnabled) {
            com.truecaller.analytics.technical.AppStartTracker appStartTracker = INSTANCE;
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            appStartTracker.logAppStart(applicationContext, "BroadcastReceiver", receiver, str);
        }
    }

    public static final void onServiceCreate(@org.jetbrains.annotations.NotNull android.app.Service service) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "service");
        if (!hasLogged && isEnabled) {
            com.truecaller.analytics.technical.AppStartTracker appStartTracker = INSTANCE;
            android.content.Context applicationContext = service.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            logAppStart$default(appStartTracker, applicationContext, "Service", service, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAppStarts(android.content.Context context, java.util.List<ed0.bar> appStarts) {
        try {
            synchronized (this) {
                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(INSTANCE.getAppStartsFile(context)));
                try {
                    dataOutputStream.writeInt(appStarts.size());
                    java.util.Iterator<T> it = appStarts.iterator();
                    while (it.hasNext()) {
                        ed0.qux.a(dataOutputStream, (ed0.bar) it.next());
                    }
                    kotlin.Unit unit = kotlin.Unit.a;
                    dataOutputStream.close();
                } finally {
                }
            }
        } catch (java.io.IOException unused) {
        }
    }

    @Override // ed0.baz
    @org.jetbrains.annotations.NotNull
    public ed0.bar[] getAppStarts(@org.jetbrains.annotations.NotNull android.content.Context context) {
        ed0.bar[] barVarArr;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            synchronized (this) {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(INSTANCE.getAppStartsFile(context)));
                try {
                    int d = uf3.p.d(dataInputStream.readInt(), 0, 1000);
                    barVarArr = new ed0.bar[d];
                    for (int i = 0; i < d; i++) {
                        int i2 = ed0.qux.b;
                        int readInt = dataInputStream.readInt();
                        long readLong = dataInputStream.readLong();
                        long readLong2 = dataInputStream.readLong();
                        java.lang.String readUTF = dataInputStream.readUTF();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readUTF, "readUTF(...)");
                        java.lang.String readUTF2 = dataInputStream.readUTF();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readUTF2, "readUTF(...)");
                        if (dataInputStream.readBoolean()) {
                            str = dataInputStream.readUTF();
                        } else {
                            str = null;
                        }
                        barVarArr[i] = new ed0.bar(readInt, readLong, readLong2, readUTF, readUTF2, str);
                    }
                    dataInputStream.close();
                } finally {
                }
            }
            return barVarArr;
        } catch (java.io.IOException unused) {
            return new ed0.bar[0];
        }
    }
}
