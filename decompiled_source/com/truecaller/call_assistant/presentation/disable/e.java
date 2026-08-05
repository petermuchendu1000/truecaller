package com.truecaller.call_assistant.presentation.disable;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e implements ig3.j {
    public final /* synthetic */ ig3.j a;

    public e(ig3.j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        com.truecaller.call_assistant.presentation.disable.d dVar;
        int i;
        java.lang.Object obj2;
        if (barVar instanceof com.truecaller.call_assistant.presentation.disable.d) {
            dVar = (com.truecaller.call_assistant.presentation.disable.d) barVar;
            int i2 = dVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.y = i2 - Integer.MIN_VALUE;
                java.lang.Object obj3 = dVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = dVar.y;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj3);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj3);
                    int i3 = com.truecaller.call_assistant.presentation.disable.h.a[((com.truecaller.call_assistant.api.internal.disable.AssistantDeactivationStep) obj).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    obj2 = ns0.qux.a;
                                } else {
                                    throw new java.lang.RuntimeException();
                                }
                            } else {
                                obj2 = ns0.baz.a;
                            }
                        } else {
                            obj2 = ns0.a.a;
                        }
                    } else {
                        obj2 = ns0.bar.a;
                    }
                    dVar.y = 1;
                    if (this.a.emit(obj2, dVar) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            }
        }
        dVar = new com.truecaller.call_assistant.presentation.disable.d(this, barVar);
        java.lang.Object obj32 = dVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = dVar.y;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }
}
