package com.truecaller.insights.database;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/insights/database/InsightsDb_Impl;", "Lcom/truecaller/insights/database/InsightsDb;", "<init>", "()V", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsDb_Impl extends com.truecaller.insights.database.InsightsDb {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    public InsightsDb_Impl() {
        final int i = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i2 = 2;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i3 = 9;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i4 = 10;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i4) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i5 = 12;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i5) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i6 = 13;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i6) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i7 = 14;
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i7) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i8 = 15;
        this.h = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i8) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i9 = 16;
        this.i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i9) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i10 = 17;
        this.j = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i10) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i11 = 11;
        this.k = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i11) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i13 = 18;
        this.l = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i13) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i14 = 19;
        this.m = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i14) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i15 = 20;
        this.n = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i15) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i16 = 21;
        this.o = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i16) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i17 = 22;
        this.p = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i17) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i18 = 23;
        this.q = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i18) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i19 = 24;
        this.r = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i19) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i20 = 25;
        this.s = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i20) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i21 = 1;
        this.t = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i21) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i22 = 3;
        this.u = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i22) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i23 = 4;
        this.v = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i23) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i24 = 5;
        this.w = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i24) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i25 = 6;
        this.x = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i25) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i26 = 7;
        this.y = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i26) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
        final int i27 = 8;
        this.z = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: mu1.baz
            public final /* synthetic */ com.truecaller.insights.database.InsightsDb_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i27) {
                    case 0:
                        return new nu1.w0(this.b);
                    case 1:
                        return new nu1.r(this.b);
                    case 2:
                        return new nu1.d1(this.b);
                    case 3:
                        return new nu1.t(this.b);
                    case 4:
                        return new nu1.u(this.b);
                    case 5:
                        return new nu1.k(this.b);
                    case 6:
                        return new nu1.y(this.b);
                    case 7:
                        return new nu1.n(this.b);
                    case 8:
                        return new nu1.a0(this.b);
                    case 9:
                        return new nu1.i(this.b);
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        return new nu1.qux(this.b);
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        return new nu1.y0(this.b);
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        return new nu1.bar(this.b);
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        return new nu1.d(this.b);
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        return new nu1.h(this.b);
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        return new nu1.b(this.b);
                    case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                        return new nu1.c0(this.b);
                    case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                        return new nu1.b1(this.b);
                    case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new nu1.f1(0);
                    case 20:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this.b, "__db");
                        return new java.lang.Object();
                    case 21:
                        return new nu1.z0(this.b);
                    case 22:
                        return new nu1.d0(this.b);
                    case 23:
                        return new nu1.e1(this.b);
                    case 24:
                        return new nu1.w(this.b);
                    default:
                        return new nu1.v(this.b);
                }
            }
        });
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.bar b() {
        return (nu1.bar) this.e.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.qux c() {
        return (nu1.qux) this.d.getValue();
    }

    public final void clearAllTables() {
        performClear(true, new java.lang.String[]{"parsed_data_object_table", "sms_backup_table", "account_relation_model", "account_mapping_rule_model", "account_model_table", "link_prune_table", "states_table", "analytics_events", "analytics_property_maps", "action_state", "categorizer_probability", "sms_message_fts", "reclassified_message", "pdo_fts", "sender_info", "aggregate_analytics_events", "sender_resolution_table", "parser_analytics_events", "nudges", "token_metadata_object_table", "insights_user_feedback_table", "insights_sender_data_refresh_table", "insights_llm_patterns_table", "insights_llm_token_data_type_table", "llm_sender_patterns_refresh_table", "insights_llm_use_case_table", "insights_llm_pattern_action_table", "insights_llm_meta_data_table", "message_processed_meta_table"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        java.util.ArrayList k = nc0.k1.k("autoMigrationSpecs", map);
        k.add(new a11.i(76, 77, 23));
        k.add(new a11.i(77, 78, 24));
        k.add(new a11.i(78, 79, 25));
        return k;
    }

    public final androidx.room.m createInvalidationTracker() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("sms_message_fts", "sms_backup_table");
        linkedHashMap.put("pdo_fts", "parsed_data_object_table");
        return new androidx.room.m(this, linkedHashMap, new java.util.LinkedHashMap(), new java.lang.String[]{"parsed_data_object_table", "sms_backup_table", "account_model_table", "account_relation_model", "account_mapping_rule_model", "link_prune_table", "states_table", "analytics_events", "analytics_property_maps", "action_state", "categorizer_probability", "sms_message_fts", "reclassified_message", "pdo_fts", "sender_info", "aggregate_analytics_events", "sender_resolution_table", "parser_analytics_events", "nudges", "token_metadata_object_table", "insights_user_feedback_table", "insights_sender_data_refresh_table", "insights_llm_patterns_table", "insights_llm_token_data_type_table", "llm_sender_patterns_refresh_table", "insights_llm_use_case_table", "insights_llm_pattern_action_table", "insights_llm_meta_data_table", "message_processed_meta_table"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.a d() {
        return (nu1.a) this.f.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.b e() {
        return (nu1.b) this.i.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.d f() {
        return (nu1.d) this.g.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.h g() {
        return (nu1.h) this.h.getValue();
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        kotlin.reflect.KClass orCreateKotlinClass = l0Var.getOrCreateKotlinClass(nu1.w0.class);
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        linkedHashMap.put(orCreateKotlinClass, h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.d1.class, linkedHashMap, h0Var, nu1.i.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.qux.class, linkedHashMap, h0Var, nu1.bar.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.a.class, linkedHashMap, h0Var, nu1.d.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.h.class, linkedHashMap, h0Var, nu1.b.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.c0.class, linkedHashMap, h0Var, nu1.y0.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.b1.class, linkedHashMap, h0Var, nu1.f1.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.j.class, linkedHashMap, h0Var, nu1.z0.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.d0.class, linkedHashMap, h0Var, nu1.e1.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.w.class, linkedHashMap, h0Var, nu1.v.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.r.class, linkedHashMap, h0Var, nu1.t.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.u.class, linkedHashMap, h0Var, nu1.k.class), h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, nu1.y.class, linkedHashMap, h0Var, nu1.n.class), h0Var);
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(nu1.a0.class), h0Var);
        return linkedHashMap;
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.i h() {
        return (nu1.i) this.c.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.j i() {
        return (nu1.j) this.n.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.k j() {
        return (nu1.k) this.w.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.r k() {
        return (nu1.r) this.t.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.t l() {
        return (nu1.t) this.u.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.u m() {
        return (nu1.u) this.v.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.v n() {
        return (nu1.v) this.s.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.y o() {
        return (nu1.y) this.x.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.n p() {
        return (nu1.n) this.y.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.a0 q() {
        return (nu1.a0) this.z.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.c0 r() {
        return (nu1.c0) this.j.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.d0 s() {
        return (nu1.d0) this.p.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.w0 t() {
        return (nu1.w0) this.a.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.y0 u() {
        return (nu1.y0) this.k.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.z0 v() {
        return (nu1.z0) this.o.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.b1 w() {
        return (nu1.b1) this.l.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.d1 x() {
        return (nu1.d1) this.b.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.e1 y() {
        return (nu1.e1) this.q.getValue();
    }

    @Override // com.truecaller.insights.database.InsightsDb
    public final nu1.w z() {
        return (nu1.w) this.r.getValue();
    }
}
