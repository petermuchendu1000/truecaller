package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class App extends hi3.d {
    public static final bi3.y0 e;
    public static final hi3.a f;
    public static final hi3.c g;
    public static final hi3.b h;
    public java.lang.CharSequence a;
    public java.lang.CharSequence b;
    public java.lang.CharSequence c;
    public java.lang.CharSequence d;

    static {
        bi3.y0 k = bx.e1.k("{\"type\":\"record\",\"name\":\"App\",\"namespace\":\"com.truecaller.tracking.events\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"This field specifies the name of the Truecaller application from which\\nthe event originated. It helps to identify the app's context in case\\nthere are multiple versions or platforms.\"},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"This field provides information about the specific version of the\\nTruecaller app being used at the time of the event. It typically\\nfollows a standard versioning format, such as \\\"v1.0.0.\\\"\"},{\"name\":\"buildName\",\"type\":\"string\",\"doc\":\"This field indicates the source or platform from which the Truecaller\\napp was built or distributed.\"},{\"name\":\"storeVersion\",\"type\":[\"null\",\"string\"],\"doc\":\"This field reflects the version of the app available on the store\\nwhere the Truecaller app was downloaded. It shows whether the app is\\nup-to-date with the store version. If this information is unavailable,\\nthe value will be null.\",\"default\":null}]}");
        e = k;
        hi3.a aVar = new hi3.a();
        f = aVar;
        new fi3.qux(k, aVar);
        new fi3.bar(k, aVar);
        g = new pz1.bar(k, aVar);
        h = new hi3.b(k, k, aVar);
    }

    public final void b(int i, java.lang.Object obj) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.d = (java.lang.CharSequence) obj;
                        return;
                    }
                    throw new java.lang.IndexOutOfBoundsException(bar.k(i, "Invalid index: "));
                }
                this.c = (java.lang.CharSequence) obj;
                return;
            }
            this.b = (java.lang.CharSequence) obj;
            return;
        }
        this.a = (java.lang.CharSequence) obj;
    }

    public final void d(di3.o oVar) {
        ii3.h hVar;
        ii3.h hVar2;
        ii3.h hVar3;
        ii3.h hVar4;
        ii3.h hVar5;
        ii3.h hVar6;
        ii3.h hVar7;
        bi3.j0[] Y = oVar.Y();
        ii3.h hVar8 = null;
        if (Y == null) {
            ii3.h hVar9 = this.a;
            if (hVar9 instanceof ii3.h) {
                hVar5 = hVar9;
            } else {
                hVar5 = null;
            }
            this.a = oVar.G(hVar5);
            ii3.h hVar10 = this.b;
            if (hVar10 instanceof ii3.h) {
                hVar6 = hVar10;
            } else {
                hVar6 = null;
            }
            this.b = oVar.G(hVar6);
            ii3.h hVar11 = this.c;
            if (hVar11 instanceof ii3.h) {
                hVar7 = hVar11;
            } else {
                hVar7 = null;
            }
            this.c = oVar.G(hVar7);
            if (oVar.B() != 1) {
                oVar.F();
                this.d = null;
                return;
            } else {
                java.lang.CharSequence charSequence = this.d;
                if (charSequence instanceof ii3.h) {
                    hVar8 = (ii3.h) charSequence;
                }
                this.d = oVar.G(hVar8);
                return;
            }
        }
        for (int i = 0; i < 4; i++) {
            int i2 = Y[i].e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (oVar.B() != 1) {
                                oVar.F();
                                this.d = null;
                            } else {
                                ii3.h hVar12 = this.d;
                                if (hVar12 instanceof ii3.h) {
                                    hVar4 = hVar12;
                                } else {
                                    hVar4 = null;
                                }
                                this.d = oVar.G(hVar4);
                            }
                        } else {
                            throw new java.io.IOException("Corrupt ResolvingDecoder.");
                        }
                    } else {
                        ii3.h hVar13 = this.c;
                        if (hVar13 instanceof ii3.h) {
                            hVar3 = hVar13;
                        } else {
                            hVar3 = null;
                        }
                        this.c = oVar.G(hVar3);
                    }
                } else {
                    ii3.h hVar14 = this.b;
                    if (hVar14 instanceof ii3.h) {
                        hVar2 = hVar14;
                    } else {
                        hVar2 = null;
                    }
                    this.b = oVar.G(hVar2);
                }
            } else {
                ii3.h hVar15 = this.a;
                if (hVar15 instanceof ii3.h) {
                    hVar = hVar15;
                } else {
                    hVar = null;
                }
                this.a = oVar.G(hVar);
            }
        }
    }

    public final void e(di3.a aVar) {
        aVar.k(this.a);
        aVar.k(this.b);
        aVar.k(this.c);
        if (this.d == null) {
            aVar.i(0);
        } else {
            aVar.i(1);
            aVar.k(this.d);
        }
    }

    public final hi3.a g() {
        return f;
    }

    public final java.lang.Object get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.d;
                    }
                    throw new java.lang.IndexOutOfBoundsException(bar.k(i, "Invalid index: "));
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    public final bi3.y0 getSchema() {
        return e;
    }

    public final void readExternal(java.io.ObjectInput objectInput) {
        h.j(this, hi3.a.w(objectInput));
    }

    public final void writeExternal(java.io.ObjectOutput objectOutput) {
        g.D(this, hi3.a.x(objectOutput));
    }
}
