package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class PacketVersionedV2 extends hi3.d {
    public static final bi3.y0 b;
    public static final hi3.a c;
    public static final hi3.c d;
    public static final hi3.b e;
    public java.util.List a;

    static {
        bi3.y0 k = bx.e1.k("{\"type\":\"record\",\"name\":\"PacketVersionedV2\",\"namespace\":\"com.truecaller.tracking.events\",\"fields\":[{\"name\":\"events\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EventRecordVersionedV2\",\"fields\":[{\"name\":\"schemaId\",\"type\":\"int\",\"doc\":\"the id of the schema associated with this lib version, fetched from schema-registry\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"type name of the event\"},{\"name\":\"header\",\"type\":\"bytes\",\"doc\":\"avro serialized version of ClientHeader\"},{\"name\":\"body\",\"type\":\"bytes\",\"doc\":\"here goes the avro encoded event\"},{\"name\":\"headerVersion\",\"type\":\"int\",\"doc\":\"event header version\",\"default\":2}]}}}]}");
        b = k;
        hi3.a aVar = new hi3.a();
        c = aVar;
        new fi3.qux(k, aVar);
        new fi3.bar(k, aVar);
        d = new pz1.bar(k, aVar);
        e = new hi3.b(k, k, aVar);
    }

    public final void b(int i, java.lang.Object obj) {
        if (i == 0) {
            this.a = (java.util.List) obj;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(bar.k(i, "Invalid index: "));
    }

    public final void d(di3.o oVar) {
        ci3.c cVar;
        com.truecaller.tracking.events.EventRecordVersionedV2 eventRecordVersionedV2;
        ci3.c cVar2;
        com.truecaller.tracking.events.EventRecordVersionedV2 eventRecordVersionedV22;
        bi3.j0[] Y = oVar.Y();
        bi3.y0 y0Var = b;
        if (Y == null) {
            long u = oVar.u();
            ci3.c cVar3 = this.a;
            if (cVar3 == null) {
                cVar3 = new ci3.c((int) u, y0Var.u("events").f);
                this.a = cVar3;
            } else {
                cVar3.clear();
            }
            if (cVar3 instanceof ci3.c) {
                cVar2 = cVar3;
            } else {
                cVar2 = null;
            }
            while (0 < u) {
                while (u != 0) {
                    if (cVar2 != null) {
                        eventRecordVersionedV22 = (com.truecaller.tracking.events.EventRecordVersionedV2) cVar2.peek();
                    } else {
                        eventRecordVersionedV22 = null;
                    }
                    if (eventRecordVersionedV22 == null) {
                        eventRecordVersionedV22 = new com.truecaller.tracking.events.EventRecordVersionedV2();
                    }
                    eventRecordVersionedV22.d(oVar);
                    cVar3.add(eventRecordVersionedV22);
                    u--;
                }
                u = oVar.k();
            }
            return;
        }
        if (Y[0].e == 0) {
            long u2 = oVar.u();
            ci3.c cVar4 = this.a;
            if (cVar4 == null) {
                cVar4 = new ci3.c((int) u2, y0Var.u("events").f);
                this.a = cVar4;
            } else {
                cVar4.clear();
            }
            if (cVar4 instanceof ci3.c) {
                cVar = cVar4;
            } else {
                cVar = null;
            }
            while (0 < u2) {
                while (u2 != 0) {
                    if (cVar != null) {
                        eventRecordVersionedV2 = (com.truecaller.tracking.events.EventRecordVersionedV2) cVar.peek();
                    } else {
                        eventRecordVersionedV2 = null;
                    }
                    if (eventRecordVersionedV2 == null) {
                        eventRecordVersionedV2 = new com.truecaller.tracking.events.EventRecordVersionedV2();
                    }
                    eventRecordVersionedV2.d(oVar);
                    cVar4.add(eventRecordVersionedV2);
                    u2--;
                }
                u2 = oVar.k();
            }
            return;
        }
        throw new java.io.IOException("Corrupt ResolvingDecoder.");
    }

    public final void e(di3.a aVar) {
        long size = this.a.size();
        aVar.b(size);
        java.util.Iterator it = this.a.iterator();
        long j = 0;
        while (it.hasNext()) {
            j++;
            ((com.truecaller.tracking.events.EventRecordVersionedV2) it.next()).e(aVar);
        }
        aVar.m();
        if (j == size) {
        } else {
            throw new java.util.ConcurrentModificationException(bar.n(j, ".", h0.b.T(size, "Array-size written was ", ", but element count was ")));
        }
    }

    public final hi3.a g() {
        return c;
    }

    public final java.lang.Object get(int i) {
        if (i == 0) {
            return this.a;
        }
        throw new java.lang.IndexOutOfBoundsException(bar.k(i, "Invalid index: "));
    }

    public final bi3.y0 getSchema() {
        return b;
    }

    public final void readExternal(java.io.ObjectInput objectInput) {
        e.j(this, hi3.a.w(objectInput));
    }

    public final void writeExternal(java.io.ObjectOutput objectOutput) {
        d.D(this, hi3.a.x(objectOutput));
    }
}
