package com.truecaller.search;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux {
    public static final java.util.Set d = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH, com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NSN_MATCH, com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.EXACT_MATCH));
    public final com.google.i18n.phonenumbers.PhoneNumberUtil a;
    public final qo1.r b;
    public final com.google.gson.Gson c;

    public qux(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, qo1.r rVar, com.google.gson.Gson gson) {
        this.a = phoneNumberUtil;
        this.b = rVar;
        this.c = gson;
    }

    public static void a(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList) {
        if (!jj3.bar.i(str)) {
            arrayList.add(android.content.ContentProviderOperation.newDelete(h81.c.d()).withSelection("search_query = ? AND contact_source = ?", new java.lang.String[]{str, java.lang.String.valueOf(4)}).build());
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            arrayList.add(android.content.ContentProviderOperation.newInsert(h81.c.d()).withValue("tc_id", uuid).withValue("contact_search_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).withValue("search_query", str).withValue("contact_default_number", str2).withValue("contact_source", 4).build());
            if (!jj3.bar.i(str2)) {
                arrayList.add(android.content.ContentProviderOperation.newInsert(h81.c.a()).withValueBackReference("data_raw_contact_id", arrayList.size() - 1).withValue("tc_id", uuid).withValue("data_type", 4).withValue("data1", str2).withValue("data9", str).withValue("data4", 2).build());
            }
        }
    }

    public static void c(java.util.ArrayList arrayList, jp2.f fVar, java.util.List list, int i, java.lang.String str, com.truecaller.search.baz bazVar) {
        java.util.Iterator it;
        android.content.ContentValues contentValues;
        android.content.ContentValues contentValues2;
        java.util.stream.Stream stream;
        java.util.stream.Stream map;
        java.lang.Object collect;
        java.util.stream.Stream stream2;
        java.util.stream.Stream filter;
        java.util.stream.Stream map2;
        java.util.stream.Stream filter2;
        java.util.stream.Stream stream3;
        java.util.stream.Stream map3;
        java.lang.Object collect2;
        java.util.stream.Stream stream4;
        java.util.stream.Stream map4;
        java.lang.Object collect3;
        java.util.stream.Stream stream5;
        java.util.stream.Stream map5;
        java.lang.Object collect4;
        java.lang.String e164Format;
        java.lang.String telType;
        if (list == null) {
            return;
        }
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            java.lang.Object next = it3.next();
            com.truecaller.search.qux quxVar = bazVar.a;
            if (next instanceof com.truecaller.search.ContactDto.Contact.PhoneNumber) {
                com.truecaller.search.ContactDto.Contact.PhoneNumber phoneNumber = (com.truecaller.search.ContactDto.Contact.PhoneNumber) next;
                quxVar.getClass();
                android.content.ContentValues contentValues3 = new android.content.ContentValues();
                it = it3;
                contentValues3.put("data_type", (java.lang.Integer) 4);
                java.lang.String str2 = fVar.a;
                if (!d.contains(quxVar.a.isNumberMatch(str2, phoneNumber.getE164Format()))) {
                    str2 = null;
                }
                f(contentValues3, "data9", str2);
                if ("senderId".equals(phoneNumber.getType())) {
                    e164Format = phoneNumber.getId();
                } else {
                    e164Format = phoneNumber.getE164Format();
                }
                f(contentValues3, "data1", e164Format);
                f(contentValues3, "data2", phoneNumber.getNationalFormat());
                f(contentValues3, "data6", phoneNumber.getDialingCode());
                f(contentValues3, "data7", phoneNumber.getCountryCode());
                f(contentValues3, "data8", phoneNumber.getNumberType());
                f(contentValues3, "data10", phoneNumber.getCarrier());
                if (jj3.bar.i(phoneNumber.getTelType())) {
                    telType = java.lang.String.valueOf(-1);
                } else {
                    telType = phoneNumber.getTelType();
                }
                f(contentValues3, "data4", telType);
                f(contentValues3, "data3", phoneNumber.getSpamScore());
                f(contentValues3, "data11", phoneNumber.getSpamType());
                contentValues = contentValues3;
            } else {
                it = it3;
                if (next instanceof com.truecaller.search.ContactDto.Contact.Address) {
                    com.truecaller.search.ContactDto.Contact.Address address = (com.truecaller.search.ContactDto.Contact.Address) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 1);
                    f(contentValues2, "data1", address.getStreet());
                    f(contentValues2, "data2", address.getZipCode());
                    f(contentValues2, "data3", address.getCity());
                    f(contentValues2, "data8", address.getArea());
                    f(contentValues2, "data4", address.getCountryCode());
                    f(contentValues2, "data7", address.getTimeZone());
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.InternetAddress) {
                    com.truecaller.search.ContactDto.Contact.InternetAddress internetAddress = (com.truecaller.search.ContactDto.Contact.InternetAddress) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 3);
                    f(contentValues2, "data1", internetAddress.getId());
                    f(contentValues2, "data2", internetAddress.getService());
                    f(contentValues2, "data3", internetAddress.getCaption());
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.Source) {
                    com.truecaller.search.ContactDto.Contact.Source source = (com.truecaller.search.ContactDto.Contact.Source) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 5);
                    f(contentValues2, "data1", source.getId());
                    f(contentValues2, "data2", source.getUrl());
                    f(contentValues2, "data3", source.getLogo());
                    f(contentValues2, "data4", source.getCaption());
                    if (source.getExtra() != null) {
                        f(contentValues2, "data5", new com.google.gson.Gson().toJson(source.getExtra()));
                    }
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.Tag) {
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 6);
                    contentValues2.put("data1", ((com.truecaller.search.ContactDto.Contact.Tag) next).getTag());
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.BusinessProfile) {
                    com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile = (com.truecaller.search.ContactDto.Contact.BusinessProfile) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 9);
                    if (businessProfile.getMediaCallerIDs() != null) {
                        stream5 = businessProfile.getMediaCallerIDs().stream();
                        map5 = stream5.map(new bi3.a0(16));
                        collect4 = map5.collect(to1.a.o());
                        contentValues2.put("data8", g61.bar.d((java.util.List) collect4));
                    }
                    if (businessProfile.getAppStores() != null) {
                        stream4 = businessProfile.getAppStores().stream();
                        map4 = stream4.map(new bi3.a0(12));
                        collect3 = map4.collect(to1.a.o());
                        contentValues2.put("data9", g61.bar.b((java.util.List) collect3));
                    }
                    if (businessProfile.getBrandedMedia() != null) {
                        stream3 = businessProfile.getBrandedMedia().stream();
                        map3 = stream3.map(new bi3.a0(14));
                        collect2 = map3.collect(to1.a.o());
                        contentValues2.put("data10", g61.bar.c((java.util.List) collect2));
                    }
                    if (businessProfile.getBusinessMessages() != null) {
                        stream2 = businessProfile.getBusinessMessages().stream();
                        filter = stream2.filter(new al.b(2));
                        map2 = filter.map(new bi3.a0(13));
                        filter2 = map2.filter(new al.b(3));
                        contentValues2.put("data11", (java.lang.String) kg3.baz.b(s42.p.k(filter2)));
                    }
                    if (businessProfile.getAlternatePhoneNumbers() != null) {
                        stream = businessProfile.getAlternatePhoneNumbers().stream();
                        map = stream.map(new bi3.a0(15));
                        collect = map.collect(to1.a.o());
                        contentValues2.put("data7", g61.bar.a((java.util.List) collect));
                    }
                    com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta = businessProfile.getMessageCta();
                    if (messageCta != null && messageCta.getMessagingHandle() != null && messageCta.getChannelType() != null && messageCta.getChannelTypeValue() != null) {
                        contentValues2.put("data6", g61.bar.e(new com.truecaller.contact.entity.model.BusinessProfileEntity.MessageCta(messageCta.getMessagingHandle(), messageCta.getChannelType(), messageCta.getChannelTypeValue().intValue())));
                    }
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.SpamInfo) {
                    com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo = (com.truecaller.search.ContactDto.Contact.SpamInfo) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 12);
                    com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats = spamInfo.getSpamStats();
                    if (spamStats != null) {
                        contentValues2.put("data1", spamStats.getNumReports60days());
                        contentValues2.put("data2", spamStats.getNumCalls60days());
                        contentValues2.put("data3", spamStats.getNumCalls60DaysPointerPosition());
                        contentValues2.put("data4", spamStats.getNumCallsHourly() != null ? bf0.s2.X(spamStats.getNumCallsHourly()) : null);
                        contentValues2.put("data5", spamInfo.getSpamVersion());
                    }
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.SearchWarning) {
                    com.truecaller.search.ContactDto.Contact.SearchWarning searchWarning = (com.truecaller.search.ContactDto.Contact.SearchWarning) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 13);
                    f(contentValues2, "data1", searchWarning.getId());
                    java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> features = searchWarning.getFeatures();
                    f(contentValues2, "data2", (features == null || features.isEmpty()) ? null : quxVar.c.toJson(features));
                    f(contentValues2, "data3", searchWarning.getRuleName());
                    f(contentValues2, "data4", searchWarning.getRuleId());
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.Survey) {
                    com.truecaller.search.ContactDto.Contact.Survey survey = (com.truecaller.search.ContactDto.Contact.Survey) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 14);
                    f(contentValues2, "data1", survey.getId());
                    contentValues2.put("data2", survey.getFrequency());
                    f(contentValues2, "data3", survey.getPassthroughData());
                    contentValues2.put("data4", survey.getPerNumberCooldown());
                    f(contentValues2, "data5", survey.getDynamicAccessKey());
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.Feedback) {
                    com.truecaller.search.ContactDto.Contact.Feedback feedback = (com.truecaller.search.ContactDto.Contact.Feedback) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 15);
                    if (feedback instanceof com.truecaller.search.ContactDto.Contact.Feedback.Comments) {
                        contentValues2.put("data1", "comments");
                        contentValues2.put("data2", java.lang.Integer.valueOf(((com.truecaller.search.ContactDto.Contact.Feedback.Comments) feedback).getCount()));
                    } else if (feedback instanceof com.truecaller.search.ContactDto.Contact.Feedback.Reviews) {
                        contentValues2.put("data1", "reviews");
                    } else {
                        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Unknown feedback type: ".concat(feedback.getClass().getName()));
                    }
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.SenderId) {
                    com.truecaller.search.ContactDto.Contact.SenderId senderId = (com.truecaller.search.ContactDto.Contact.SenderId) next;
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 16);
                    contentValues2.put("data1", senderId.getSpamScore());
                    contentValues2.put("data2", senderId.getFraudScore());
                    contentValues2.put("data3", senderId.isNewSender());
                    contentValues2.put("data4", senderId.isFraudExcluded());
                    contentValues2.put("data5", senderId.isValidSpamScore());
                } else if (next instanceof com.truecaller.search.ContactDto.Contact.ElectedTag) {
                    quxVar.getClass();
                    contentValues2 = new android.content.ContentValues();
                    contentValues2.put("data_type", (java.lang.Integer) 17);
                    contentValues2.put("data1", ((com.truecaller.search.ContactDto.Contact.ElectedTag) next).getValue());
                } else {
                    com.truecaller.log.AssertionUtil.AlwaysFatal.fail(new java.lang.String[]{"Unhandled type: ".concat(next.getClass().getName())});
                    contentValues = null;
                }
                contentValues = contentValues2;
            }
            if (contentValues != null) {
                arrayList.add(android.content.ContentProviderOperation.newInsert(h81.c.a()).withValues(contentValues).withValue("tc_id", str).withValueBackReference("data_raw_contact_id", i).build());
            }
            it3 = it;
        }
    }

    public static void d(r11.bar barVar, java.util.ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            try {
                android.content.ContentResolver contentResolver = barVar.getContentResolver();
                try {
                    android.net.Uri uri = h81.e.a;
                    contentResolver.applyBatch("com.truecaller", arrayList);
                } catch (android.os.RemoteException e) {
                    e = e;
                    o82.a.C(e);
                }
            } catch (android.content.OperationApplicationException | android.os.RemoteException e2) {
                e = e2;
            }
        }
    }

    public static java.lang.String e(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.truecaller.search.ContactDto.Contact.PhoneNumber phoneNumber = (com.truecaller.search.ContactDto.Contact.PhoneNumber) it.next();
                if (jj3.bar.j(phoneNumber.getE164Format())) {
                    return phoneNumber.getE164Format();
                }
                if (jj3.bar.j(phoneNumber.getNationalFormat())) {
                    return phoneNumber.getNationalFormat();
                }
            }
            return null;
        }
        return null;
    }

    public static void f(android.content.ContentValues contentValues, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            contentValues.put(str, str2);
        }
    }

    public final void b(java.util.ArrayList arrayList, com.truecaller.search.ContactDto.Contact contact, jp2.f fVar) {
        boolean z;
        boolean z2;
        java.util.List list;
        java.util.ArrayList arrayList2;
        jp2.f fVar2;
        java.util.List list2;
        java.util.ArrayList arrayList3;
        jp2.f fVar3;
        java.util.List list3;
        java.util.ArrayList arrayList4;
        jp2.f fVar4;
        android.content.ContentProviderOperation.Builder newInsert = android.content.ContentProviderOperation.newInsert(h81.c.d());
        android.content.ContentValues contentValues = new android.content.ContentValues();
        f(contentValues, "tc_id", contact.getId());
        if (contact.getName() != null) {
            contentValues.put("contact_name", new java.lang.String(contact.getName().replace("\u0000", "").getBytes(), java.nio.charset.StandardCharsets.UTF_8));
        }
        f(contentValues, "contact_transliterated_name", contact.getTransliteratedName());
        f(contentValues, "contact_handle", contact.getHandle());
        f(contentValues, "contact_alt_name", contact.getAltName());
        f(contentValues, "contact_gender", contact.getGender());
        f(contentValues, "contact_about", contact.getAbout());
        f(contentValues, "contact_image_url", contact.getImage());
        f(contentValues, "contact_job_title", contact.getJobTitle());
        f(contentValues, "contact_company", contact.getCompanyName());
        f(contentValues, "contact_access", contact.getAccess());
        f(contentValues, "contact_im_id", fVar.b);
        contentValues.put("contact_badges", java.lang.Integer.valueOf(gj.m.t(contact.getBadges())));
        contentValues.put("contact_source", (java.lang.Integer) 1);
        contentValues.put("contact_search_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        f(contentValues, "search_query", fVar.a);
        if (contact.getCacheTtl() != null) {
            f(contentValues, "cache_control", contact.getCacheTtl().toString());
        }
        f(contentValues, "contact_default_number", e(contact.getPhones()));
        if (contact.getSpamInfo() != null) {
            contentValues.put("contact_spam_score", contact.getSpamInfo().getSpamScore());
            contentValues.put("contact_spam_type", contact.getSpamInfo().getSpamType());
            contentValues.put("spam_categories", bf0.s2.Y(contact.getSpamInfo().getSpamCategories()));
        }
        if (contact.getNs() != null) {
            contentValues.put("remote_name_source", java.lang.Integer.valueOf(contact.getNs().intValue()));
        }
        if (contact.getManualCallerIdPrompt() != null) {
            contentValues.put("manual_caller_id", java.lang.Integer.valueOf(contact.getManualCallerIdPrompt().booleanValue() ? 1 : 0));
        } else {
            contentValues.put("manual_caller_id", (java.lang.Integer) 0);
        }
        contentValues.put("call_category", contact.getCategory().toString());
        if (contact.isSuspectedFraud() != null) {
            contentValues.put("is_suspected_fraud", java.lang.Integer.valueOf(java.lang.Boolean.TRUE.equals(contact.isSuspectedFraud()) ? 1 : 0));
        } else {
            contentValues.put("is_suspected_fraud", (java.lang.Integer) 0);
        }
        if (java.lang.Integer.bitCount(1) == 1) {
            z = true;
        } else {
            z = false;
        }
        com.truecaller.log.AssertionUtil.OnlyInDebug.isTrue(z, new java.lang.String[0]);
        if (contact.getId() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.truecaller.log.AssertionUtil.OnlyInDebug.isTrue(z2, new java.lang.String[0]);
        arrayList.add(newInsert.withValues(contentValues).build());
        int size = arrayList.size() - 1;
        java.lang.String id = contact.getId();
        if ("public".equalsIgnoreCase(contact.getAccess())) {
            c(arrayList, fVar, contact.getPhones(), size, id, new com.truecaller.search.baz(this));
        }
        c(arrayList, fVar, contact.getAddresses(), size, id, new com.truecaller.search.baz(this));
        c(arrayList, fVar, contact.getInternetAddresses(), size, id, new com.truecaller.search.baz(this));
        c(arrayList, fVar, contact.getSources(), size, id, new com.truecaller.search.baz(this));
        c(arrayList, fVar, contact.getTags(), size, id, new com.truecaller.search.baz(this));
        com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile = contact.getBusinessProfile();
        com.truecaller.search.baz bazVar = new com.truecaller.search.baz(this);
        java.util.List list4 = null;
        if (businessProfile != null) {
            list = java.util.Collections.singletonList(businessProfile);
            fVar2 = fVar;
            arrayList2 = arrayList;
        } else {
            list = null;
            arrayList2 = arrayList;
            fVar2 = fVar;
        }
        c(arrayList2, fVar2, list, size, id, bazVar);
        com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo = contact.getSpamInfo();
        com.truecaller.search.baz bazVar2 = new com.truecaller.search.baz(this);
        if (spamInfo != null) {
            list2 = java.util.Collections.singletonList(spamInfo);
            fVar3 = fVar;
            arrayList3 = arrayList;
        } else {
            list2 = null;
            arrayList3 = arrayList;
            fVar3 = fVar;
        }
        c(arrayList3, fVar3, list2, size, id, bazVar2);
        c(arrayList, fVar, contact.getSearchWarnings(), size, id, new com.truecaller.search.baz(this));
        c(arrayList, fVar, contact.getSurveys(), size, id, new com.truecaller.search.baz(this));
        com.truecaller.search.ContactDto.Contact.Feedback feedback = contact.getFeedback();
        com.truecaller.search.baz bazVar3 = new com.truecaller.search.baz(this);
        if (feedback != null) {
            list3 = java.util.Collections.singletonList(feedback);
            fVar4 = fVar;
            arrayList4 = arrayList;
        } else {
            list3 = null;
            arrayList4 = arrayList;
            fVar4 = fVar;
        }
        c(arrayList4, fVar4, list3, size, id, bazVar3);
        com.truecaller.search.ContactDto.Contact.SenderId senderId = contact.getSenderId();
        com.truecaller.search.baz bazVar4 = new com.truecaller.search.baz(this);
        if (senderId != null) {
            list4 = java.util.Collections.singletonList(senderId);
        }
        c(arrayList, fVar, list4, size, id, bazVar4);
        c(arrayList, fVar, contact.getElectedTags(), size, id, new com.truecaller.search.baz(this));
        java.lang.String e = e(contact.getPhones());
        if (!this.b.b.a("featureManualCallerId", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            return;
        }
        arrayList.add(android.content.ContentProviderOperation.newUpdate(h81.c.d()).withSelection("contact_default_number=? AND contact_source=?", new java.lang.String[]{java.lang.String.valueOf(e), java.lang.String.valueOf(16)}).withValue("manual_caller_id", 0).build());
    }
}
