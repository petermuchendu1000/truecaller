package com.truecaller.search;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class bar {
    public static final com.truecaller.data.entity.Contact a(com.truecaller.search.ContactDto.Contact contact, long j) {
        java.lang.Long l;
        java.lang.Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity reviewsEntity;
        int i;
        int i2;
        java.lang.String messagingHandle;
        java.lang.String channelType;
        java.lang.Integer channelTypeValue;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        long j2;
        java.lang.String e164Format;
        int i3;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.Integer intOrNull;
        boolean z5 = false;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "<this>");
        if (contact.getId() != null) {
            com.truecaller.data.entity.Contact contact2 = new com.truecaller.data.entity.Contact();
            contact2.H = contact.getId();
            contact2.I = contact.getName();
            contact2.J = contact.getTransliteratedName();
            contact2.K = contact.getHandle();
            contact2.L = contact.getAltName();
            contact2.M = contact.getGender();
            contact2.N = contact.getAbout();
            contact2.O = contact.getImage();
            contact2.P = contact.getJobTitle();
            contact2.Q = contact.getCompanyName();
            contact2.R = contact.getAccess();
            contact2.S = contact.getImage();
            java.lang.Number cacheTtl = contact.getCacheTtl();
            com.truecaller.contact.entity.model.BusinessProfileEntity.MessageCta messageCta = null;
            if (cacheTtl != null) {
                l = java.lang.Long.valueOf(cacheTtl.longValue());
            } else {
                l = null;
            }
            contact2.T = l;
            java.lang.Number ns = contact.getNs();
            if (ns != null) {
                num = java.lang.Integer.valueOf(ns.intValue());
            } else {
                num = null;
            }
            if (num == null) {
                num = 0;
            }
            contact2.U = num;
            java.lang.Boolean manualCallerIdPrompt = contact.getManualCallerIdPrompt();
            if (manualCallerIdPrompt != null) {
                z = manualCallerIdPrompt.booleanValue();
            } else {
                z = false;
            }
            contact2.e0(java.lang.Boolean.valueOf(z));
            contact2.h0(java.lang.Long.valueOf(j));
            contact2.h0 = contact.getCategory();
            java.lang.Boolean isSuspectedFraud = contact.isSuspectedFraud();
            if (isSuspectedFraud != null) {
                z2 = isSuspectedFraud.booleanValue();
            } else {
                z2 = false;
            }
            contact2.i0 = z2;
            java.util.List<com.truecaller.search.ContactDto.Contact.Address> addresses = contact.getAddresses();
            if (addresses != null) {
                for (com.truecaller.search.ContactDto.Contact.Address address : addresses) {
                    contact2.a(new com.truecaller.contact.entity.model.AddressEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1), address.getStreet(), address.getZipCode(), address.getCity(), address.getArea(), address.getCountryCode(), address.getTimeZone()));
                }
            }
            java.util.List<com.truecaller.search.ContactDto.Contact.PhoneNumber> phones = contact.getPhones();
            if (phones != null) {
                if (kotlin.text.y.p(contact.getAccess(), "PRIVATE", true)) {
                    phones = null;
                }
                if (phones != null) {
                    for (com.truecaller.search.ContactDto.Contact.PhoneNumber phoneNumber : phones) {
                        java.lang.String id = contact.getId();
                        com.truecaller.data.entity.Number number = new com.truecaller.data.entity.Number();
                        number.b = id;
                        number.c = 1;
                        number.g = phoneNumber.getNationalFormat();
                        if (kotlin.jvm.internal.Intrinsics.b(phoneNumber.getType(), "senderId")) {
                            e164Format = phoneNumber.getId();
                        } else {
                            e164Format = phoneNumber.getE164Format();
                        }
                        number.f = e164Format;
                        java.lang.String spamScore = phoneNumber.getSpamScore();
                        if (spamScore != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(spamScore)) != null) {
                            i3 = intOrNull.intValue();
                        } else {
                            i3 = 0;
                        }
                        number.k = java.lang.Integer.valueOf(i3);
                        number.j = phoneNumber.getSpamType();
                        number.h = null;
                        number.d = phoneNumber.getCarrier();
                        java.lang.String telType = phoneNumber.getTelType();
                        if (telType != null && telType.length() != 0) {
                            java.lang.String telType2 = phoneNumber.getTelType();
                            if (telType2 != null) {
                                num2 = kotlin.text.StringsKt.toIntOrNull(telType2);
                            } else {
                                num2 = null;
                            }
                        } else {
                            num2 = -1;
                        }
                        number.m = num2;
                        number.l = null;
                        java.lang.String dialingCode = phoneNumber.getDialingCode();
                        if (dialingCode != null) {
                            num3 = kotlin.text.StringsKt.toIntOrNull(dialingCode);
                        } else {
                            num3 = null;
                        }
                        number.i = num3;
                        number.e = phoneNumber.getCountryCode();
                        number.j(t41.i0.h(phoneNumber.getNumberType(), com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN));
                        contact2.c(number);
                    }
                }
            }
            java.util.List<com.truecaller.search.ContactDto.Contact.InternetAddress> internetAddresses = contact.getInternetAddresses();
            if (internetAddresses != null) {
                for (com.truecaller.search.ContactDto.Contact.InternetAddress internetAddress : internetAddresses) {
                    contact2.b(new com.truecaller.contact.entity.model.LinkEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1), internetAddress.getId(), internetAddress.getService(), internetAddress.getCaption()));
                }
            }
            java.util.List<com.truecaller.search.ContactDto.Contact.Tag> tags = contact.getTags();
            if (tags != null) {
                java.util.Iterator<T> it = tags.iterator();
                while (it.hasNext()) {
                    contact2.d(new com.truecaller.contact.entity.model.TagEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1), ((com.truecaller.search.ContactDto.Contact.Tag) it.next()).getTag()));
                }
            }
            java.util.List<com.truecaller.search.ContactDto.Contact.Source> sources = contact.getSources();
            if (sources != null) {
                for (com.truecaller.search.ContactDto.Contact.Source source : sources) {
                    com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1);
                    java.lang.String id2 = source.getId();
                    java.lang.String url = source.getUrl();
                    java.lang.String logo = source.getLogo();
                    java.lang.String caption = source.getCaption();
                    kotlin.collections.i0 extra = source.getExtra();
                    if (extra == null) {
                        extra = kotlin.collections.r0.f();
                    }
                    contact2.d.add(new com.truecaller.contact.entity.model.SourceEntity(dataEntityPrimaryFields, id2, url, logo, caption, extra));
                }
            }
            com.truecaller.search.ContactDto.Contact.BusinessProfile businessProfile = contact.getBusinessProfile();
            if (businessProfile != null) {
                com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields2 = new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1);
                kotlin.collections.h0 mediaCallerIDs = businessProfile.getMediaCallerIDs();
                if (mediaCallerIDs == null) {
                    mediaCallerIDs = kotlin.collections.h0.a;
                }
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs> list = (java.lang.Iterable) mediaCallerIDs;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                for (com.truecaller.search.ContactDto.Contact.BusinessProfile.MediaCallerIDs mediaCallerIDs2 : list) {
                    java.lang.String id3 = mediaCallerIDs2.getId();
                    if (id3 == null) {
                        str = "";
                    } else {
                        str = id3;
                    }
                    java.lang.String url2 = mediaCallerIDs2.getUrl();
                    if (url2 == null) {
                        str2 = "";
                    } else {
                        str2 = url2;
                    }
                    java.lang.String mediaType = mediaCallerIDs2.getMediaType();
                    if (mediaType == null) {
                        str3 = "";
                    } else {
                        str3 = mediaType;
                    }
                    java.lang.String orientation = mediaCallerIDs2.getOrientation();
                    if (orientation == null) {
                        str4 = "";
                    } else {
                        str4 = orientation;
                    }
                    java.lang.Long ttl = mediaCallerIDs2.getTtl();
                    if (ttl != null) {
                        j2 = ttl.longValue();
                    } else {
                        j2 = 0;
                    }
                    arrayList.add(new com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId(str, str2, str3, str4, j2));
                }
                kotlin.collections.h0 appStores = businessProfile.getAppStores();
                if (appStores == null) {
                    appStores = kotlin.collections.h0.a;
                }
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores> list2 = (java.lang.Iterable) appStores;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list2, 10));
                for (com.truecaller.search.ContactDto.Contact.BusinessProfile.AppStores appStores2 : list2) {
                    java.lang.String url3 = appStores2.getUrl();
                    if (url3 == null) {
                        url3 = "";
                    }
                    java.lang.String linkType = appStores2.getLinkType();
                    if (linkType == null) {
                        linkType = "";
                    }
                    arrayList2.add(new com.truecaller.contact.entity.model.BusinessProfileEntity.AppStore(url3, linkType));
                }
                kotlin.collections.h0 brandedMedia = businessProfile.getBrandedMedia();
                if (brandedMedia == null) {
                    brandedMedia = kotlin.collections.h0.a;
                }
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia> list3 = (java.lang.Iterable) brandedMedia;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(list3, 10));
                for (com.truecaller.search.ContactDto.Contact.BusinessProfile.BrandedMedia brandedMedia2 : list3) {
                    java.lang.String url4 = brandedMedia2.getUrl();
                    if (url4 == null) {
                        url4 = "";
                    }
                    java.lang.String mediaType2 = brandedMedia2.getMediaType();
                    if (mediaType2 == null) {
                        mediaType2 = "";
                    }
                    arrayList3.add(new com.truecaller.contact.entity.model.BusinessProfileEntity.BrandedMedia(url4, mediaType2));
                }
                kotlin.collections.h0 businessMessages = businessProfile.getBusinessMessages();
                if (businessMessages == null) {
                    businessMessages = kotlin.collections.h0.a;
                }
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage> list4 = (java.lang.Iterable) businessMessages;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.z.q(list4, 10));
                java.util.Iterator<T> it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((com.truecaller.search.ContactDto.Contact.BusinessProfile.BusinessMessage) it3.next()).getText());
                }
                java.lang.String b0 = kotlin.collections.CollectionsKt.b0(arrayList4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 63);
                kotlin.collections.h0 alternatePhoneNumbers = businessProfile.getAlternatePhoneNumbers();
                if (alternatePhoneNumbers == null) {
                    alternatePhoneNumbers = kotlin.collections.h0.a;
                }
                java.util.List<com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber> list5 = (java.lang.Iterable) alternatePhoneNumbers;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.z.q(list5, 10));
                java.util.Iterator<T> it4 = list5.iterator();
                while (it4.hasNext()) {
                    java.lang.String number2 = ((com.truecaller.search.ContactDto.Contact.BusinessProfile.AlternatePhoneNumber) it4.next()).getNumber();
                    if (number2 == null) {
                        number2 = "";
                    }
                    arrayList5.add(new com.truecaller.contact.entity.model.BusinessProfileEntity.AlternatePhoneNumber(number2));
                }
                com.truecaller.search.ContactDto.Contact.BusinessProfile.MessageCta messageCta2 = businessProfile.getMessageCta();
                if (messageCta2 != null && (messagingHandle = messageCta2.getMessagingHandle()) != null && (channelType = messageCta2.getChannelType()) != null && (channelTypeValue = messageCta2.getChannelTypeValue()) != null) {
                    messageCta = new com.truecaller.contact.entity.model.BusinessProfileEntity.MessageCta(messagingHandle, channelType, channelTypeValue.intValue());
                }
                contact2.w = new com.truecaller.contact.entity.model.BusinessProfileEntity(dataEntityPrimaryFields2, arrayList, arrayList2, arrayList3, b0, arrayList5, messageCta);
            }
            com.truecaller.search.ContactDto.Contact.SpamInfo spamInfo = contact.getSpamInfo();
            if (spamInfo != null) {
                java.lang.Integer spamScore2 = spamInfo.getSpamScore();
                if (spamScore2 != null) {
                    i = spamScore2.intValue();
                } else {
                    i = 0;
                }
                contact2.j0(java.lang.Integer.valueOf(i));
                contact2.B = spamInfo.getSpamType();
                com.truecaller.search.ContactDto.Contact.SpamInfo.SpamStats spamStats = contact.getSpamInfo().getSpamStats();
                if (spamStats != null) {
                    java.lang.String id4 = contact.getId();
                    java.lang.Integer spamVersion = spamInfo.getSpamVersion();
                    if (spamVersion != null) {
                        i2 = spamVersion.intValue();
                    } else {
                        i2 = 0;
                    }
                    com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields3 = new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, id4, false, (java.lang.Long) null, 0);
                    java.lang.Integer numReports60days = spamStats.getNumReports60days();
                    java.lang.Integer numCalls60days = spamStats.getNumCalls60days();
                    java.lang.Integer numCalls60DaysPointerPosition = spamStats.getNumCalls60DaysPointerPosition();
                    kotlin.collections.h0 numCallsHourly = spamStats.getNumCallsHourly();
                    if (numCallsHourly == null) {
                        numCallsHourly = kotlin.collections.h0.a;
                    }
                    contact2.x = new com.truecaller.contact.entity.model.SpamInfoEntity(dataEntityPrimaryFields3, numReports60days, numCalls60days, numCalls60DaysPointerPosition, numCallsHourly, java.lang.Integer.valueOf(i2));
                }
            }
            java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning> searchWarnings = contact.getSearchWarnings();
            if (searchWarnings != null) {
                for (com.truecaller.search.ContactDto.Contact.SearchWarning searchWarning : searchWarnings) {
                    com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields4 = new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1);
                    java.lang.String id5 = searchWarning.getId();
                    kotlin.collections.h0 features = searchWarning.getFeatures();
                    if (features == null) {
                        features = kotlin.collections.h0.a;
                    }
                    java.util.List<com.truecaller.search.ContactDto.Contact.SearchWarning.Feature> list6 = (java.lang.Iterable) features;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.z.q(list6, 10));
                    for (com.truecaller.search.ContactDto.Contact.SearchWarning.Feature feature : list6) {
                        java.lang.String name = feature.getName();
                        if (name == null) {
                            name = "";
                        }
                        java.lang.String value = feature.getValue();
                        if (value == null) {
                            value = "";
                        }
                        arrayList6.add(new com.truecaller.contact.entity.model.SearchWarningEntity.Feature(name, value));
                    }
                    contact2.f.add(new com.truecaller.contact.entity.model.SearchWarningEntity(dataEntityPrimaryFields4, id5, arrayList6, searchWarning.getRuleName(), searchWarning.getRuleId()));
                }
            }
            java.util.List<com.truecaller.search.ContactDto.Contact.Survey> surveys = contact.getSurveys();
            if (surveys != null) {
                for (com.truecaller.search.ContactDto.Contact.Survey survey : surveys) {
                    contact2.g.add(new com.truecaller.contact.entity.model.ContactSurveyEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1), survey.getId(), survey.getFrequency(), survey.getPassthroughData(), survey.getPerNumberCooldown(), survey.getDynamicAccessKey()));
                }
            }
            com.truecaller.search.ContactDto.Contact.Feedback feedback = contact.getFeedback();
            if (feedback != null) {
                java.lang.String id6 = contact.getId();
                if (feedback instanceof com.truecaller.search.ContactDto.Contact.Feedback.Comments) {
                    reviewsEntity = new com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, id6, false, (java.lang.Long) null, 1), ((com.truecaller.search.ContactDto.Contact.Feedback.Comments) feedback).getCount());
                } else if (feedback.equals(com.truecaller.search.ContactDto.Contact.Feedback.Reviews.INSTANCE)) {
                    reviewsEntity = new com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, id6, false, (java.lang.Long) null, 1));
                } else {
                    throw new java.lang.RuntimeException();
                }
                contact2.y = reviewsEntity;
            }
            com.truecaller.search.ContactDto.Contact.SenderId senderId = contact.getSenderId();
            if (senderId != null) {
                com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields5 = new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, contact.getId(), false, (java.lang.Long) null, 1);
                java.lang.Float spamScore3 = senderId.getSpamScore();
                java.lang.Float fraudScore = senderId.getFraudScore();
                java.lang.Boolean isNewSender = senderId.isNewSender();
                if (isNewSender != null) {
                    z3 = isNewSender.booleanValue();
                } else {
                    z3 = false;
                }
                java.lang.Boolean isFraudExcluded = senderId.isFraudExcluded();
                if (isFraudExcluded != null) {
                    z4 = isFraudExcluded.booleanValue();
                } else {
                    z4 = false;
                }
                java.lang.Boolean isValidSpamScore = senderId.isValidSpamScore();
                if (isValidSpamScore != null) {
                    z5 = isValidSpamScore.booleanValue();
                }
                contact2.z = new com.truecaller.contact.entity.model.SenderIdEntity(dataEntityPrimaryFields5, spamScore3, fraudScore, z3, z4, z5);
            }
            java.util.List<java.lang.String> badges = contact.getBadges();
            if (badges != null) {
                contact2.a0(java.lang.Integer.valueOf(gj.m.t(badges)));
            }
            return contact2;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }
}
