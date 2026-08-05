package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class ClientHeaderV2 extends hi3.d {
    public static final bi3.y0 i;
    public static final hi3.a j;
    public static final hi3.c k;
    public static final hi3.b l;
    public long a;
    public long b;
    public java.lang.CharSequence c;
    public com.truecaller.tracking.events.App d;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public qx2.sl g;
    public java.lang.Integer h;

    static {
        bi3.y0 k2 = bx.e1.k("{\"type\":\"record\",\"name\":\"ClientHeaderV2\",\"namespace\":\"com.truecaller.tracking.events\",\"doc\":\"Includes device and application-related details, such as app version, operating system, and session identifiers.\",\"fields\":[{\"name\":\"sequenceNumber\",\"type\":\"long\",\"doc\":\"This field uniquely identifies an event on the device by assigning it\\na sequential number. Each event is given a distinct number in the\\norder it is generated on the device.\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"This field captures the epoch timestamp representing the exact time\\nwhen this event was recorded by the Truecaller system.\"},{\"name\":\"clientId\",\"type\":\"string\",\"doc\":\"This field represents a unique identifier for the app on a specific\\nuser-device combination. On Android devices, it is derived from the\\nANDROID_ID, ensuring uniqueness for each app instance per user and\\ndevice.\"},{\"name\":\"app\",\"type\":{\"type\":\"record\",\"name\":\"App\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"This field specifies the name of the Truecaller application from which\\nthe event originated. It helps to identify the app's context in case\\nthere are multiple versions or platforms.\"},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"This field provides information about the specific version of the\\nTruecaller app being used at the time of the event. It typically\\nfollows a standard versioning format, such as \\\"v1.0.0.\\\"\"},{\"name\":\"buildName\",\"type\":\"string\",\"doc\":\"This field indicates the source or platform from which the Truecaller\\napp was built or distributed.\"},{\"name\":\"storeVersion\",\"type\":[\"null\",\"string\"],\"doc\":\"This field reflects the version of the app available on the store\\nwhere the Truecaller app was downloaded. It shows whether the app is\\nup-to-date with the store version. If this information is unavailable,\\nthe value will be null.\",\"default\":null}]},\"doc\":\"This field specifies the details of app that logged the event.\"},{\"name\":\"connection\",\"type\":\"string\",\"doc\":\"This field identifies the type of network connection the user is\\nutilizing, such as Wi-Fi, 4G, or 5G, at the time of the event.\"},{\"name\":\"operator\",\"type\":\"string\",\"doc\":\"This field provides the name of the user's network operator or service\\nprovider, which is based on the connection type.\"},{\"name\":\"webHeader\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"WebHeader\",\"fields\":[{\"name\":\"userAgent\",\"type\":\"string\",\"doc\":\"user agent string sent by web client\"}]}],\"doc\":\"This field includes a web header, if available, related to the event.\\nIf no header information is present, the value will be null.\",\"default\":null},{\"name\":\"timeZoneOffset\",\"type\":[\"null\",\"int\"],\"doc\":\"This field records the user's time zone offset relative to UTC,\\nallowing for precise localization of event timing. If no data is\\navailable, the value will be null.\",\"default\":null}]}");
        i = k2;
        hi3.a aVar = new hi3.a();
        j = aVar;
        new fi3.qux(k2, aVar);
        new fi3.bar(k2, aVar);
        k = new pz1.bar(k2, aVar);
        l = new hi3.b(k2, k2, aVar);
    }

    public final void b(int i2, java.lang.Object obj) {
        switch (i2) {
            case 0:
                this.a = ((java.lang.Long) obj).longValue();
                return;
            case 1:
                this.b = ((java.lang.Long) obj).longValue();
                return;
            case 2:
                this.c = (java.lang.CharSequence) obj;
                return;
            case 3:
                this.d = (com.truecaller.tracking.events.App) obj;
                return;
            case 4:
                this.e = (java.lang.CharSequence) obj;
                return;
            case 5:
                this.f = (java.lang.CharSequence) obj;
                return;
            case 6:
                this.g = (qx2.sl) obj;
                return;
            case 7:
                this.h = (java.lang.Integer) obj;
                return;
            default:
                throw new java.lang.IndexOutOfBoundsException(bar.k(i2, "Invalid index: "));
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, qx2.sl] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, qx2.sl] */
    public final void d(di3.o oVar) {
        ii3.h hVar;
        ii3.h hVar2;
        ii3.h hVar3;
        ii3.h hVar4;
        ii3.h hVar5;
        ii3.h hVar6;
        bi3.j0[] Y = oVar.Y();
        if (Y == null) {
            this.a = oVar.D();
            this.b = oVar.D();
            ii3.h hVar7 = this.c;
            if (hVar7 instanceof ii3.h) {
                hVar4 = hVar7;
            } else {
                hVar4 = null;
            }
            this.c = oVar.G(hVar4);
            if (this.d == null) {
                this.d = new com.truecaller.tracking.events.App();
            }
            this.d.d(oVar);
            ii3.h hVar8 = this.e;
            if (hVar8 instanceof ii3.h) {
                hVar5 = hVar8;
            } else {
                hVar5 = null;
            }
            this.e = oVar.G(hVar5);
            ii3.h hVar9 = this.f;
            if (hVar9 instanceof ii3.h) {
                hVar6 = hVar9;
            } else {
                hVar6 = null;
            }
            this.f = oVar.G(hVar6);
            if (oVar.B() != 1) {
                oVar.F();
                this.g = null;
            } else {
                if (this.g == null) {
                    this.g = new java.lang.Object();
                }
                this.g.d(oVar);
            }
            if (oVar.B() != 1) {
                oVar.F();
                this.h = null;
                return;
            } else {
                this.h = java.lang.Integer.valueOf(oVar.C());
                return;
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            switch (Y[i2].e) {
                case 0:
                    this.a = oVar.D();
                    break;
                case 1:
                    this.b = oVar.D();
                    break;
                case 2:
                    ii3.h hVar10 = this.c;
                    if (hVar10 instanceof ii3.h) {
                        hVar = hVar10;
                    } else {
                        hVar = null;
                    }
                    this.c = oVar.G(hVar);
                    break;
                case 3:
                    if (this.d == null) {
                        this.d = new com.truecaller.tracking.events.App();
                    }
                    this.d.d(oVar);
                    break;
                case 4:
                    ii3.h hVar11 = this.e;
                    if (hVar11 instanceof ii3.h) {
                        hVar2 = hVar11;
                    } else {
                        hVar2 = null;
                    }
                    this.e = oVar.G(hVar2);
                    break;
                case 5:
                    ii3.h hVar12 = this.f;
                    if (hVar12 instanceof ii3.h) {
                        hVar3 = hVar12;
                    } else {
                        hVar3 = null;
                    }
                    this.f = oVar.G(hVar3);
                    break;
                case 6:
                    if (oVar.B() != 1) {
                        oVar.F();
                        this.g = null;
                        break;
                    } else {
                        if (this.g == null) {
                            this.g = new java.lang.Object();
                        }
                        this.g.d(oVar);
                        break;
                    }
                case 7:
                    if (oVar.B() != 1) {
                        oVar.F();
                        this.h = null;
                        break;
                    } else {
                        this.h = java.lang.Integer.valueOf(oVar.C());
                        break;
                    }
                default:
                    throw new java.io.IOException("Corrupt ResolvingDecoder.");
            }
        }
    }

    public final void e(di3.a aVar) {
        aVar.j(this.a);
        aVar.j(this.b);
        aVar.k(this.c);
        this.d.e(aVar);
        aVar.k(this.e);
        aVar.k(this.f);
        if (this.g == null) {
            aVar.i(0);
        } else {
            aVar.i(1);
            aVar.k(this.g.a);
        }
        if (this.h == null) {
            aVar.i(0);
        } else {
            aVar.i(1);
            aVar.i(this.h.intValue());
        }
    }

    public final hi3.a g() {
        return j;
    }

    public final java.lang.Object get(int i2) {
        switch (i2) {
            case 0:
                return java.lang.Long.valueOf(this.a);
            case 1:
                return java.lang.Long.valueOf(this.b);
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return this.h;
            default:
                throw new java.lang.IndexOutOfBoundsException(bar.k(i2, "Invalid index: "));
        }
    }

    public final bi3.y0 getSchema() {
        return i;
    }

    public final void readExternal(java.io.ObjectInput objectInput) {
        l.j(this, hi3.a.w(objectInput));
    }

    public final void writeExternal(java.io.ObjectOutput objectOutput) {
        k.D(this, hi3.a.x(objectOutput));
    }
}
