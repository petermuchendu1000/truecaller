package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class EventRecordVersionedV2 extends hi3.d {
    public static final bi3.y0 f;
    public static final hi3.a g;
    public static final hi3.c h;
    public static final hi3.b i;
    public int a;
    public java.lang.CharSequence b;
    public java.nio.ByteBuffer c;
    public java.nio.ByteBuffer d;
    public int e;

    static {
        bi3.y0 k = bx.e1.k("{\"type\":\"record\",\"name\":\"EventRecordVersionedV2\",\"namespace\":\"com.truecaller.tracking.events\",\"fields\":[{\"name\":\"schemaId\",\"type\":\"int\",\"doc\":\"the id of the schema associated with this lib version, fetched from schema-registry\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"type name of the event\"},{\"name\":\"header\",\"type\":\"bytes\",\"doc\":\"avro serialized version of ClientHeader\"},{\"name\":\"body\",\"type\":\"bytes\",\"doc\":\"here goes the avro encoded event\"},{\"name\":\"headerVersion\",\"type\":\"int\",\"doc\":\"event header version\",\"default\":2}]}");
        f = k;
        hi3.a aVar = new hi3.a();
        g = aVar;
        new fi3.qux(k, aVar);
        new fi3.bar(k, aVar);
        h = new pz1.bar(k, aVar);
        i = new hi3.b(k, k, aVar);
    }

    public final void b(int i2, java.lang.Object obj) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            this.e = ((java.lang.Integer) obj).intValue();
                            return;
                        }
                        throw new java.lang.IndexOutOfBoundsException(bar.k(i2, "Invalid index: "));
                    }
                    this.d = (java.nio.ByteBuffer) obj;
                    return;
                }
                this.c = (java.nio.ByteBuffer) obj;
                return;
            }
            this.b = (java.lang.CharSequence) obj;
            return;
        }
        this.a = ((java.lang.Integer) obj).intValue();
    }

    public final void d(di3.o oVar) {
        ii3.h hVar;
        bi3.j0[] Y = oVar.Y();
        ii3.h hVar2 = null;
        if (Y == null) {
            this.a = oVar.C();
            java.lang.CharSequence charSequence = this.b;
            if (charSequence instanceof ii3.h) {
                hVar2 = (ii3.h) charSequence;
            }
            this.b = oVar.G(hVar2);
            this.c = oVar.w(this.c);
            this.d = oVar.w(this.d);
            this.e = oVar.C();
            return;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = Y[i2].e;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                this.e = oVar.C();
                            } else {
                                throw new java.io.IOException("Corrupt ResolvingDecoder.");
                            }
                        } else {
                            this.d = oVar.w(this.d);
                        }
                    } else {
                        this.c = oVar.w(this.c);
                    }
                } else {
                    ii3.h hVar3 = this.b;
                    if (hVar3 instanceof ii3.h) {
                        hVar = hVar3;
                    } else {
                        hVar = null;
                    }
                    this.b = oVar.G(hVar);
                }
            } else {
                this.a = oVar.C();
            }
        }
    }

    public final void e(di3.a aVar) {
        aVar.i(this.a);
        aVar.k(this.b);
        aVar.d(this.c);
        aVar.d(this.d);
        aVar.i(this.e);
    }

    public final hi3.a g() {
        return g;
    }

    public final java.lang.Object get(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return java.lang.Integer.valueOf(this.e);
                        }
                        throw new java.lang.IndexOutOfBoundsException(bar.k(i2, "Invalid index: "));
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return java.lang.Integer.valueOf(this.a);
    }

    public final bi3.y0 getSchema() {
        return f;
    }

    public final void readExternal(java.io.ObjectInput objectInput) {
        i.j(this, hi3.a.w(objectInput));
    }

    public final void writeExternal(java.io.ObjectOutput objectOutput) {
        h.D(this, hi3.a.x(objectOutput));
    }
}
