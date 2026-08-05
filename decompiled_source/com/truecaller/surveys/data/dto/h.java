package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class h {
    public static final boolean a(com.truecaller.api.services.survey.PhonebookStatus phonebookStatus) {
        int i = du2.a.b[phonebookStatus.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            throw new java.lang.RuntimeException();
        }
        return false;
    }

    public static final boolean b(com.truecaller.api.services.survey.PhonebookStatus phonebookStatus) {
        int i = du2.a.b[phonebookStatus.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return true;
            }
            throw new java.lang.RuntimeException();
        }
        return false;
    }

    public static final com.truecaller.surveys.data.dto.ChoiceDto c(bf0.m0 m0Var) {
        int d = m0Var.d();
        java.lang.String e = m0Var.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getText(...)");
        return new com.truecaller.surveys.data.dto.ChoiceDto(d, e, java.lang.Integer.valueOf(m0Var.c()));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x04a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0025. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0486  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.truecaller.surveys.data.dto.SurveyDto d(bf0.u3 u3Var) {
        int i;
        com.truecaller.surveys.data.dto.SurveyFlowDto generic;
        com.truecaller.surveys.data.dto.SurveyFlowDto nameSuggestion;
        com.truecaller.surveys.data.dto.SurveyFlowDto bizmon;
        com.truecaller.surveys.data.dto.SurveyFlowDto nameQualityFeedback;
        com.truecaller.surveys.data.dto.SurveyFlowDto positiveResponseNameSuggestion;
        com.truecaller.surveys.data.dto.SurveyFlowDto generic2;
        com.truecaller.surveys.data.dto.SurveyFlowDto nameSuggestion2;
        int i2;
        com.truecaller.surveys.data.dto.QuestionDto binary;
        com.truecaller.surveys.data.dto.QuestionDto singleChoice;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u3Var, "<this>");
        java.lang.String u = u3Var.u();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(u, "getId(...)");
        com.truecaller.api.services.survey.Survey.FlowCase t = u3Var.t();
        if (t == null) {
            i = -1;
        } else {
            i = du2.a.a[t.ordinal()];
        }
        switch (i) {
            case -1:
            case 19:
            case 20:
                throw new java.lang.IllegalArgumentException("Unexpected flow " + u3Var.t());
            case 0:
            default:
                throw new java.lang.RuntimeException();
            case 1:
                boolean f = u3Var.c().f();
                boolean d = u3Var.c().d();
                boolean e = u3Var.c().e();
                com.truecaller.api.services.survey.PhonebookStatus c = u3Var.c().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getPhonebookStatus(...)");
                boolean a = a(c);
                com.truecaller.api.services.survey.PhonebookStatus c2 = u3Var.c().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c2, "getPhonebookStatus(...)");
                generic = new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic(f, d, e, a, b(c2));
                bizmon = generic;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v, "getQuestionsList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(v, 10));
                for (bf0.z2 z2Var : v) {
                    kotlin.jvm.internal.Intrinsics.d(z2Var);
                    com.truecaller.api.services.survey.Question.QuestionTypeCase h = z2Var.h();
                    if (h == null) {
                        i2 = -1;
                    } else {
                        i2 = du2.a.c[h.ordinal()];
                    }
                    switch (i2) {
                        case -1:
                        case 9:
                        case 10:
                            throw new java.lang.IllegalArgumentException("Unexpected question " + z2Var.h());
                        case 0:
                        default:
                            throw new java.lang.RuntimeException();
                        case 1:
                            int g = z2Var.g();
                            java.lang.String f2 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f2, "getHeaderMessage(...)");
                            java.lang.String message = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
                            bf0.m0 d2 = z2Var.b().d();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "getTrue(...)");
                            com.truecaller.surveys.data.dto.ChoiceDto c3 = c(d2);
                            bf0.m0 c4 = z2Var.b().c();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c4, "getFalse(...)");
                            binary = new com.truecaller.surveys.data.dto.QuestionDto.Binary(g, f2, message, c3, c(c4));
                            singleChoice = binary;
                            arrayList.add(singleChoice);
                        case 2:
                            int g2 = z2Var.g();
                            java.lang.String f3 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f3, "getHeaderMessage(...)");
                            java.lang.String message2 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message2, "getMessage(...)");
                            com.google.protobuf.Internal.ProtobufList<bf0.m0> b = z2Var.k().b();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getChoicesList(...)");
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(b, 10));
                            for (bf0.m0 m0Var : b) {
                                kotlin.jvm.internal.Intrinsics.d(m0Var);
                                arrayList2.add(c(m0Var));
                            }
                            singleChoice = new com.truecaller.surveys.data.dto.QuestionDto.SingleChoice(g2, f3, message2, arrayList2);
                            arrayList.add(singleChoice);
                        case 3:
                            int g3 = z2Var.g();
                            java.lang.String f4 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f4, "getHeaderMessage(...)");
                            java.lang.String message3 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message3, "getMessage(...)");
                            java.lang.String e2 = z2Var.e().e();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "getHintLabel(...)");
                            java.lang.String b2 = z2Var.e().b();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b2, "getButtonLabel(...)");
                            binary = new com.truecaller.surveys.data.dto.QuestionDto.FreeText(g3, f4, message3, e2, b2, java.lang.Integer.valueOf(z2Var.e().d()));
                            singleChoice = binary;
                            arrayList.add(singleChoice);
                        case 4:
                            int g4 = z2Var.g();
                            java.lang.String f5 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f5, "getHeaderMessage(...)");
                            java.lang.String message4 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message4, "getMessage(...)");
                            java.lang.String b3 = z2Var.c().b();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b3, "getButtonLabel(...)");
                            bf0.m0 c5 = z2Var.c().c();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c5, "getChoice(...)");
                            singleChoice = new com.truecaller.surveys.data.dto.QuestionDto.Confirmation(g4, f5, message4, b3, c(c5));
                            arrayList.add(singleChoice);
                        case 5:
                            int g5 = z2Var.g();
                            java.lang.String f6 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f6, "getHeaderMessage(...)");
                            java.lang.String message5 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message5, "getMessage(...)");
                            com.google.protobuf.Internal.ProtobufList<bf0.m0> b4 = z2Var.i().b();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b4, "getChoicesList(...)");
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(b4, 10));
                            for (bf0.m0 m0Var2 : b4) {
                                kotlin.jvm.internal.Intrinsics.d(m0Var2);
                                arrayList3.add(c(m0Var2));
                            }
                            singleChoice = new com.truecaller.surveys.data.dto.QuestionDto.Rating(g5, f6, message5, arrayList3);
                            arrayList.add(singleChoice);
                        case 6:
                            int g6 = z2Var.g();
                            java.lang.String f7 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f7, "getHeaderMessage(...)");
                            java.lang.String message6 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message6, "getMessage(...)");
                            bf0.m0 c6 = z2Var.d().c();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c6, "getNoneOfTheAbove(...)");
                            singleChoice = new com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice(g6, f7, message6, c(c6));
                            arrayList.add(singleChoice);
                        case 7:
                            int g7 = z2Var.g();
                            java.lang.String f8 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f8, "getHeaderMessage(...)");
                            java.lang.String message7 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message7, "getMessage(...)");
                            singleChoice = new com.truecaller.surveys.data.dto.QuestionDto.SpamCategories(g7, f8, message7);
                            arrayList.add(singleChoice);
                        case 8:
                            int g8 = z2Var.g();
                            java.lang.String f9 = z2Var.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f9, "getHeaderMessage(...)");
                            java.lang.String message8 = z2Var.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message8, "getMessage(...)");
                            java.lang.String b5 = z2Var.j().b();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b5, "getButtonLabel(...)");
                            java.lang.String e3 = z2Var.j().e();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e3, "getReviewHintLabel(...)");
                            singleChoice = new com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview(g8, f9, message8, b5, e3, java.lang.Integer.valueOf(z2Var.j().d()));
                            arrayList.add(singleChoice);
                    }
                }
                com.google.protobuf.Internal.IntList n = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList, (java.util.List) n, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 2:
                boolean f10 = u3Var.e().f();
                boolean d3 = u3Var.e().d();
                boolean e4 = u3Var.e().e();
                com.truecaller.api.services.survey.PhonebookStatus c7 = u3Var.e().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c7, "getPhonebookStatus(...)");
                boolean a2 = a(c7);
                com.truecaller.api.services.survey.PhonebookStatus c8 = u3Var.e().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c8, "getPhonebookStatus(...)");
                nameSuggestion = new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion(f10, d3, e4, a2, b(c8));
                bizmon = nameSuggestion;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v2 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2, "getQuestionsList(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.z.q(v2, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n2 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n2, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList4, (java.util.List) n2, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 3:
                boolean f11 = u3Var.b().f();
                boolean d4 = u3Var.b().d();
                boolean e5 = u3Var.b().e();
                com.truecaller.api.services.survey.PhonebookStatus c9 = u3Var.b().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c9, "getPhonebookStatus(...)");
                boolean a3 = a(c9);
                com.truecaller.api.services.survey.PhonebookStatus c10 = u3Var.b().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c10, "getPhonebookStatus(...)");
                bizmon = new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon(f11, d4, e5, a3, b(c10));
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v22 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v22, "getQuestionsList(...)");
                java.util.ArrayList arrayList42 = new java.util.ArrayList(kotlin.collections.z.q(v22, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n22 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n22, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList42, (java.util.List) n22, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 4:
                boolean f12 = u3Var.d().f();
                boolean d5 = u3Var.d().d();
                boolean e6 = u3Var.d().e();
                com.truecaller.api.services.survey.PhonebookStatus c11 = u3Var.d().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c11, "getPhonebookStatus(...)");
                boolean a4 = a(c11);
                com.truecaller.api.services.survey.PhonebookStatus c12 = u3Var.d().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c12, "getPhonebookStatus(...)");
                nameQualityFeedback = new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback(f12, d5, e6, a4, b(c12));
                bizmon = nameQualityFeedback;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v222, "getQuestionsList(...)");
                java.util.ArrayList arrayList422 = new java.util.ArrayList(kotlin.collections.z.q(v222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList422, (java.util.List) n222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 5:
                boolean f14 = u3Var.f().f();
                boolean d6 = u3Var.f().d();
                boolean e7 = u3Var.f().e();
                com.truecaller.api.services.survey.PhonebookStatus c14 = u3Var.f().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c14, "getPhonebookStatus(...)");
                boolean a5 = a(c14);
                com.truecaller.api.services.survey.PhonebookStatus c15 = u3Var.f().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c15, "getPhonebookStatus(...)");
                positiveResponseNameSuggestion = new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion(f14, d6, e7, a5, b(c15));
                bizmon = positiveResponseNameSuggestion;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v2222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2222, "getQuestionsList(...)");
                java.util.ArrayList arrayList4222 = new java.util.ArrayList(kotlin.collections.z.q(v2222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n2222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n2222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList4222, (java.util.List) n2222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 6:
                boolean f15 = u3Var.p().f();
                boolean d7 = u3Var.p().d();
                boolean e8 = u3Var.p().e();
                com.truecaller.api.services.survey.PhonebookStatus c16 = u3Var.p().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c16, "getPhonebookStatus(...)");
                boolean a6 = a(c16);
                com.truecaller.api.services.survey.PhonebookStatus c17 = u3Var.p().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c17, "getPhonebookStatus(...)");
                generic2 = new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic(f15, d7, e8, a6, b(c17));
                bizmon = generic2;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v22222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v22222, "getQuestionsList(...)");
                java.util.ArrayList arrayList42222 = new java.util.ArrayList(kotlin.collections.z.q(v22222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n22222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n22222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList42222, (java.util.List) n22222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 7:
                boolean f16 = u3Var.r().f();
                boolean d8 = u3Var.r().d();
                boolean e9 = u3Var.r().e();
                com.truecaller.api.services.survey.PhonebookStatus c18 = u3Var.r().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c18, "getPhonebookStatus(...)");
                boolean a7 = a(c18);
                com.truecaller.api.services.survey.PhonebookStatus c19 = u3Var.r().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c19, "getPhonebookStatus(...)");
                nameSuggestion2 = new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion(f16, d8, e9, a7, b(c19));
                bizmon = nameSuggestion2;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList422222 = new java.util.ArrayList(kotlin.collections.z.q(v222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList422222, (java.util.List) n222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 8:
                boolean f17 = u3Var.q().f();
                boolean d9 = u3Var.q().d();
                boolean e10 = u3Var.q().e();
                com.truecaller.api.services.survey.PhonebookStatus c20 = u3Var.q().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c20, "getPhonebookStatus(...)");
                boolean a8 = a(c20);
                com.truecaller.api.services.survey.PhonebookStatus c21 = u3Var.q().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c21, "getPhonebookStatus(...)");
                generic = new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback(f17, d9, e10, a8, b(c21));
                bizmon = generic;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v2222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList4222222 = new java.util.ArrayList(kotlin.collections.z.q(v2222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n2222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n2222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList4222222, (java.util.List) n2222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 9:
                com.truecaller.api.services.survey.PhonebookStatus c22 = u3Var.x().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c22, "getPhonebookStatus(...)");
                boolean a9 = a(c22);
                com.truecaller.api.services.survey.PhonebookStatus c23 = u3Var.x().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c23, "getPhonebookStatus(...)");
                bizmon = new com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile(a9, b(c23));
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v22222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v22222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList42222222 = new java.util.ArrayList(kotlin.collections.z.q(v22222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n22222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n22222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList42222222, (java.util.List) n22222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 10:
                boolean f18 = u3Var.s().f();
                boolean d10 = u3Var.s().d();
                boolean e11 = u3Var.s().e();
                com.truecaller.api.services.survey.PhonebookStatus c24 = u3Var.s().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c24, "getPhonebookStatus(...)");
                boolean a10 = a(c24);
                com.truecaller.api.services.survey.PhonebookStatus c25 = u3Var.s().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c25, "getPhonebookStatus(...)");
                nameSuggestion = new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion(f18, d10, e11, a10, b(c25));
                bizmon = nameSuggestion;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList422222222 = new java.util.ArrayList(kotlin.collections.z.q(v222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList422222222, (java.util.List) n222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 11:
                boolean f19 = u3Var.i().f();
                boolean d11 = u3Var.i().d();
                boolean e12 = u3Var.i().e();
                com.truecaller.api.services.survey.PhonebookStatus c26 = u3Var.i().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c26, "getPhonebookStatus(...)");
                boolean a11 = a(c26);
                com.truecaller.api.services.survey.PhonebookStatus c27 = u3Var.i().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c27, "getPhonebookStatus(...)");
                bizmon = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey(f19, d11, e12, a11, b(c27));
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v2222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList4222222222 = new java.util.ArrayList(kotlin.collections.z.q(v2222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n2222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n2222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList4222222222, (java.util.List) n2222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 12:
                boolean f20 = u3Var.j().f();
                boolean d12 = u3Var.j().d();
                boolean e14 = u3Var.j().e();
                com.truecaller.api.services.survey.PhonebookStatus c28 = u3Var.j().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c28, "getPhonebookStatus(...)");
                boolean a12 = a(c28);
                com.truecaller.api.services.survey.PhonebookStatus c29 = u3Var.j().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c29, "getPhonebookStatus(...)");
                nameQualityFeedback = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback(f20, d12, e14, a12, b(c29));
                bizmon = nameQualityFeedback;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v22222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v22222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList42222222222 = new java.util.ArrayList(kotlin.collections.z.q(v22222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n22222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n22222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList42222222222, (java.util.List) n22222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 13:
                boolean f21 = u3Var.h().f();
                boolean d14 = u3Var.h().d();
                boolean e15 = u3Var.h().e();
                com.truecaller.api.services.survey.PhonebookStatus c30 = u3Var.h().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c30, "getPhonebookStatus(...)");
                boolean a14 = a(c30);
                com.truecaller.api.services.survey.PhonebookStatus c31 = u3Var.h().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c31, "getPhonebookStatus(...)");
                positiveResponseNameSuggestion = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment(f21, d14, e15, a14, b(c31));
                bizmon = positiveResponseNameSuggestion;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v222222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v222222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList422222222222 = new java.util.ArrayList(kotlin.collections.z.q(v222222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n222222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n222222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList422222222222, (java.util.List) n222222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 14:
                boolean f22 = u3Var.m().f();
                boolean d15 = u3Var.m().d();
                boolean e16 = u3Var.m().e();
                com.truecaller.api.services.survey.PhonebookStatus c32 = u3Var.m().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c32, "getPhonebookStatus(...)");
                boolean a15 = a(c32);
                com.truecaller.api.services.survey.PhonebookStatus c34 = u3Var.m().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c34, "getPhonebookStatus(...)");
                generic2 = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment(f22, d15, e16, a15, b(c34));
                bizmon = generic2;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v2222222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2222222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList4222222222222 = new java.util.ArrayList(kotlin.collections.z.q(v2222222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n2222222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n2222222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList4222222222222, (java.util.List) n2222222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 15:
                boolean f24 = u3Var.l().f();
                boolean d16 = u3Var.l().d();
                boolean e17 = u3Var.l().e();
                com.truecaller.api.services.survey.PhonebookStatus c35 = u3Var.l().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c35, "getPhonebookStatus(...)");
                boolean a16 = a(c35);
                com.truecaller.api.services.survey.PhonebookStatus c36 = u3Var.l().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c36, "getPhonebookStatus(...)");
                nameSuggestion2 = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories(f24, d16, e17, a16, b(c36));
                bizmon = nameSuggestion2;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v22222222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v22222222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList42222222222222 = new java.util.ArrayList(kotlin.collections.z.q(v22222222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n22222222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n22222222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList42222222222222, (java.util.List) n22222222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 16:
                boolean f25 = u3Var.k().f();
                boolean d17 = u3Var.k().d();
                boolean e18 = u3Var.k().e();
                com.truecaller.api.services.survey.PhonebookStatus c37 = u3Var.k().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c37, "getPhonebookStatus(...)");
                boolean a17 = a(c37);
                com.truecaller.api.services.survey.PhonebookStatus c38 = u3Var.k().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c38, "getPhonebookStatus(...)");
                generic = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion(f25, d17, e18, a17, b(c38));
                bizmon = generic;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v222222222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v222222222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList422222222222222 = new java.util.ArrayList(kotlin.collections.z.q(v222222222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n222222222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n222222222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList422222222222222, (java.util.List) n222222222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 17:
                boolean f26 = u3Var.g().f();
                boolean d18 = u3Var.g().d();
                boolean e19 = u3Var.g().e();
                com.truecaller.api.services.survey.PhonebookStatus c39 = u3Var.g().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c39, "getPhonebookStatus(...)");
                boolean a18 = a(c39);
                com.truecaller.api.services.survey.PhonebookStatus c40 = u3Var.g().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c40, "getPhonebookStatus(...)");
                nameSuggestion = new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments(f26, d18, e19, a18, b(c40));
                bizmon = nameSuggestion;
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v2222222222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2222222222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList4222222222222222 = new java.util.ArrayList(kotlin.collections.z.q(v2222222222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n2222222222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n2222222222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList4222222222222222, (java.util.List) n2222222222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            case 18:
                boolean f27 = u3Var.w().f();
                boolean d19 = u3Var.w().d();
                boolean e20 = u3Var.w().e();
                com.truecaller.api.services.survey.PhonebookStatus c41 = u3Var.w().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c41, "getPhonebookStatus(...)");
                boolean a19 = a(c41);
                com.truecaller.api.services.survey.PhonebookStatus c42 = u3Var.w().c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c42, "getPhonebookStatus(...)");
                bizmon = new com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews(f27, d19, e20, a19, b(c42));
                com.google.protobuf.Internal.ProtobufList<bf0.z2> v22222222222222222 = u3Var.v();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v22222222222222222, "getQuestionsList(...)");
                java.util.ArrayList arrayList42222222222222222 = new java.util.ArrayList(kotlin.collections.z.q(v22222222222222222, 10));
                while (r4.hasNext()) {
                }
                com.google.protobuf.Internal.IntList n22222222222222222 = u3Var.n();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n22222222222222222, "getBottomSheetQuestionsIdsList(...)");
                return new com.truecaller.surveys.data.dto.SurveyDto(u, bizmon, (java.util.List) arrayList42222222222222222, (java.util.List) n22222222222222222, 0L, u3Var.o(), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }
}
