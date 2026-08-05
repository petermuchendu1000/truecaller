package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c {
    public final x42.a a;
    public final com.truecaller.push.i b;
    public final java.util.Set c;

    public c(x42.a aVar, com.truecaller.push.i iVar, com.google.common.collect.ImmutableSet immutableSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "mobileServicesAvailabilityProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "pushSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(immutableSet, "pushTokenProviders");
        this.a = aVar;
        this.b = iVar;
        this.c = immutableSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.truecaller.push.qux a() {
        java.lang.Object obj;
        java.lang.String str;
        com.truecaller.push.PushProviderService pushProviderService;
        x42.d dVar = (x42.d) kotlin.collections.CollectionsKt.W(this.a.a());
        if (dVar != null) {
            java.util.Iterator it = this.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    ((ci2.bar) obj).getClass();
                    if (x42.b.c.equals(dVar)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ci2.bar barVar = (ci2.bar) obj;
            if (barVar != null) {
                com.google.android.gms.tasks.Task e = ((com.google.firebase.messaging.FirebaseMessaging) barVar.a.e.getValue()).e();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getToken(...)");
                try {
                    com.google.android.gms.tasks.Tasks.await(e);
                } catch (java.lang.InterruptedException e2) {
                    e = com.google.android.gms.tasks.Tasks.forException(e2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "forException(...)");
                } catch (java.util.concurrent.ExecutionException e3) {
                    e = com.google.android.gms.tasks.Tasks.forException(e3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "forException(...)");
                }
                boolean isSuccessful = e.isSuccessful();
                if (isSuccessful) {
                    str = (java.lang.String) e.getResult();
                    com.truecaller.push.i iVar = this.b;
                    if (str == null) {
                        if (dVar instanceof x42.b) {
                            iVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "registrationId");
                            iVar.g0("gcmRegistrationId", str);
                        } else if (dVar instanceof x42.c) {
                            iVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
                            iVar.g0("hcmPushToken", str);
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else if (dVar instanceof x42.b) {
                        str = iVar.G("gcmRegistrationId");
                    } else if (dVar instanceof x42.c) {
                        str = iVar.G("hcmPushToken");
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                    if (str != null) {
                        if (dVar instanceof x42.b) {
                            pushProviderService = com.truecaller.push.PushProviderService.GMS;
                        } else if (dVar instanceof x42.c) {
                            pushProviderService = com.truecaller.push.PushProviderService.HMS;
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                        return new com.truecaller.push.qux(pushProviderService, str);
                    }
                } else if (isSuccessful) {
                    throw new java.lang.RuntimeException();
                }
            }
            str = null;
            com.truecaller.push.i iVar2 = this.b;
            if (str == null) {
            }
            if (str != null) {
            }
        }
        return null;
    }
}
