package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, com.truecaller.cloudtelephony.callrecording.ui.details.n nVar, df3.bar barVar) {
        super(2, barVar);
        this.x = i;
        this.z = nVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(0, this.z, barVar);
            case 1:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(1, this.z, barVar);
            case 2:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(2, this.z, barVar);
            case 3:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(3, this.z, barVar);
            case 4:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(4, this.z, barVar);
            case 5:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(5, this.z, barVar);
            default:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.i(6, this.z, barVar);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        int i2 = 0;
        df3.bar barVar = null;
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.z;
        int i3 = 1;
        switch (i) {
            case 0:
                kotlin.Unit unit = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    s01.h hVar = nVar.p;
                    this.y = 1;
                    java.io.File[] listFiles = hVar.d().listFiles();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listFiles, "listFiles(...)");
                    int length = listFiles.length;
                    while (i2 < length) {
                        listFiles[i2].delete();
                        i2++;
                    }
                    if (kotlin.Unit.a == unit) {
                        return unit;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (nVar.t != null) {
                        bd3.qux quxVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                        if (quxVar != null) {
                            android.widget.Toast.makeText((android.content.Context) quxVar, 2132020797, 1).show();
                        }
                        return kotlin.Unit.a;
                    }
                    rz0.x xVar = nVar.i;
                    com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor feedBackFor = nVar.s;
                    if (feedBackFor != null) {
                        com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor V = ap1.d.V(feedBackFor);
                        this.y = 1;
                        if (xVar.f(V, this) == barVar2) {
                            return barVar2;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("feedBackFor");
                        throw null;
                    }
                }
                com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                if (gVar != null) {
                    ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar).v0();
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar3 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.cloudtelephony.callrecording.ui.details.n.c2(nVar, this) == barVar3) {
                        return barVar3;
                    }
                }
                kotlin.coroutines.CoroutineContext coroutineContext = nVar.d;
                com.truecaller.cloudtelephony.callrecording.ui.details.i iVar = new com.truecaller.cloudtelephony.callrecording.ui.details.i(i3, nVar, barVar);
                this.y = 2;
                if (fg3.h0.W(coroutineContext, iVar, this) == barVar3) {
                    return barVar3;
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar4 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.cloudtelephony.callrecording.ui.details.n.c2(nVar, this) == barVar4) {
                        return barVar4;
                    }
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar5 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.cloudtelephony.callrecording.ui.details.n.c2(nVar, this) == barVar5) {
                        return barVar5;
                    }
                }
                return kotlin.Unit.a;
            case 5:
                ef3.bar barVar6 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    qz0.bar barVar7 = nVar.h;
                    java.lang.String str = nVar.j.a;
                    int i11 = nVar.v;
                    qz0.qux quxVar2 = (qz0.qux) barVar7;
                    quxVar2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
                    quxVar2.a(qz0.qux.c(i11), "RecordingShared", str);
                    z42.bar.M(new v03.qux("CTRecordingShared", quxVar2.d()), quxVar2.b, quxVar2.d);
                    s01.h hVar2 = nVar.p;
                    com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording = nVar.j;
                    boolean d = nVar.e.d();
                    this.y = 1;
                    obj = hVar2.b(callRecording, d, this);
                    if (obj == barVar6) {
                        return barVar6;
                    }
                }
                kotlin.coroutines.CoroutineContext coroutineContext2 = nVar.d;
                com.truecaller.cloudtelephony.callrecording.ui.details.k kVar = new com.truecaller.cloudtelephony.callrecording.ui.details.k((android.content.Intent) obj, nVar, barVar, i2);
                this.y = 2;
                if (fg3.h0.W(coroutineContext2, kVar, this) == barVar6) {
                    return barVar6;
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar8 = ef3.bar.a;
                int i12 = this.y;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    qz0.bar barVar9 = nVar.h;
                    java.lang.String str2 = nVar.j.a;
                    int i13 = nVar.v;
                    qz0.qux quxVar3 = (qz0.qux) barVar9;
                    quxVar3.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "callId");
                    quxVar3.a(qz0.qux.c(i13), "TranscriptionShared", str2);
                    z42.bar.M(new v03.qux("CTTranscriptionShared", quxVar3.d()), quxVar3.b, quxVar3.d);
                    s01.h hVar3 = nVar.p;
                    com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording2 = nVar.j;
                    this.y = 1;
                    obj = hVar3.c(callRecording2);
                    if (obj == barVar8) {
                        return barVar8;
                    }
                }
                kotlin.coroutines.CoroutineContext coroutineContext3 = nVar.d;
                com.truecaller.cloudtelephony.callrecording.ui.details.k kVar2 = new com.truecaller.cloudtelephony.callrecording.ui.details.k((android.content.Intent) obj, nVar, barVar, i3);
                this.y = 2;
                if (fg3.h0.W(coroutineContext3, kVar2, this) == barVar8) {
                    return barVar8;
                }
                return kotlin.Unit.a;
        }
    }
}
