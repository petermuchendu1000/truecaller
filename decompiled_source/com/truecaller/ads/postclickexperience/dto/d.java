package com.truecaller.ads.postclickexperience.dto;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class d {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(com.truecaller.ads.postclickexperience.dto.Component component, java.util.ArrayList arrayList, com.truecaller.ads.postclickexperience.dto.Theme theme, com.truecaller.ads.postclickexperience.dto.UiConfigDto uiConfigDto) {
        java.lang.String url;
        java.lang.String html;
        java.lang.String src;
        java.lang.String text;
        java.lang.String str;
        java.lang.String text2;
        java.lang.String type = component.getType();
        android.net.Uri uri = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        switch (type.hashCode()) {
            case -2059652664:
                if (!type.equals("ArticleBodyImageview")) {
                    return;
                }
                boolean isOffline = uiConfigDto.getIsOffline();
                java.util.List<com.truecaller.ads.postclickexperience.dto.UiConfigAsset> assetsList = uiConfigDto.getAssetsList();
                src = component.getSrc();
                if (src != null && !kotlin.text.StringsKt.X(src)) {
                    if (isOffline) {
                        if (assetsList != null) {
                            for (com.truecaller.ads.postclickexperience.dto.UiConfigAsset uiConfigAsset : assetsList) {
                                if (kotlin.jvm.internal.Intrinsics.b(uiConfigAsset.getKey(), component.getSrc())) {
                                    uri = uiConfigAsset.getFileUri();
                                }
                            }
                            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    } else {
                        uri = android.net.Uri.parse(component.getSrc());
                    }
                    if (uri != null) {
                        arrayList.add(new com.truecaller.ads.postclickexperience.dto.ImageItemUiComponent(uri, component.getType(), component.getAltText()));
                        return;
                    }
                    return;
                }
                return;
            case -1835002398:
                if (!type.equals("Heading")) {
                    return;
                }
                text = component.getText();
                if (text == null && text.length() != 0) {
                    java.lang.String type2 = component.getType();
                    java.lang.String text3 = component.getText();
                    if (theme != null) {
                        str = theme.getFgColor();
                    } else {
                        str = null;
                    }
                    if (theme != null) {
                        str3 = theme.getBgColor();
                    }
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.TextItemUiComponent(type2, text3, str, str3));
                    return;
                }
                return;
            case -884608380:
                if (type.equals("NativeVideo") && (url = component.getUrl()) != null && url.length() != 0 && component.getLandingPageUrl() != null && component.getCta() != null) {
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.NativeVideoUiComponent(component.getType(), component.getLandingPageUrl(), component.getCta(), component.getUrl(), component.getTopBanner(), component.getBottomBanner(), component.getResizeMode(), component.getClickToRedirect(), component.getCloseDelay()));
                    return;
                }
                return;
            case -273069043:
                if (!type.equals("HtmlBody")) {
                    return;
                }
                text = component.getText();
                if (text == null) {
                    return;
                } else {
                    return;
                }
            case -272665350:
                if (type.equals("HtmlPage") && (html = component.getHtml()) != null && html.length() != 0 && component.getOnClick() != null) {
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent(component.getType(), component.getHtml(), new com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick(component.getOnClick().getUrl())));
                    return;
                }
                return;
            case 750214535:
                if (!type.equals("SponsoredImageView")) {
                    return;
                }
                boolean isOffline2 = uiConfigDto.getIsOffline();
                java.util.List<com.truecaller.ads.postclickexperience.dto.UiConfigAsset> assetsList2 = uiConfigDto.getAssetsList();
                src = component.getSrc();
                if (src != null) {
                    return;
                } else {
                    return;
                }
            case 1125864064:
                if (!type.equals("ImageView")) {
                    return;
                }
                boolean isOffline22 = uiConfigDto.getIsOffline();
                java.util.List<com.truecaller.ads.postclickexperience.dto.UiConfigAsset> assetsList22 = uiConfigDto.getAssetsList();
                src = component.getSrc();
                if (src != null) {
                }
                break;
            case 1307159490:
                if (!type.equals("SubHeading")) {
                    return;
                }
                text = component.getText();
                if (text == null) {
                }
                break;
            case 1918820564:
                if (!type.equals("LabelWithLink")) {
                    return;
                }
                text = component.getText();
                if (text == null) {
                }
                break;
            case 2001146706:
                if (type.equals("Button") && (text2 = component.getText()) != null && text2.length() != 0 && component.getOnClick() != null) {
                    java.lang.String type3 = component.getType();
                    java.lang.String text4 = component.getText();
                    com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick onClick = new com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick(component.getOnClick().getAction(), component.getOnClick().getUrl());
                    if (theme != null) {
                        str2 = theme.getBgColor();
                    }
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent(type3, text4, onClick, str2));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void b(com.truecaller.ads.postclickexperience.dto.Component component, java.util.ArrayList arrayList) {
        java.lang.String key;
        java.lang.String label;
        java.lang.String key2;
        java.lang.String label2;
        com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent textInputItemUiComponent;
        java.util.List list;
        java.lang.String key3;
        java.lang.String label3;
        java.util.List<java.lang.String> options;
        java.lang.String key4;
        java.lang.String label4;
        java.util.List<java.lang.String> options2;
        com.truecaller.ads.postclickexperience.dto.InputItemUiComponent selectInputItemUiComponent;
        java.lang.String key5;
        java.lang.String label5;
        java.util.List<java.lang.String> options3;
        java.lang.String type = component.getType();
        switch (type.hashCode()) {
            case 2122702:
                if (type.equals("Date") && (key = component.getKey()) != null && !kotlin.text.StringsKt.X(key) && (label = component.getLabel()) != null && !kotlin.text.StringsKt.X(label)) {
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.DateInputItemUiComponent(component.getType(), component.getLabel(), component.getKey(), component.getValue(), component.getValidationRegex(), component.getMinDate(), component.getMaxDate()));
                    return;
                }
                return;
            case 945911421:
                if (type.equals("TextInput") && (key2 = component.getKey()) != null && !kotlin.text.StringsKt.X(key2) && (label2 = component.getLabel()) != null && !kotlin.text.StringsKt.X(label2)) {
                    if (kotlin.jvm.internal.Intrinsics.b(component.getKey(), "email")) {
                        java.lang.String type2 = component.getType();
                        java.lang.String label6 = component.getLabel();
                        java.lang.String key6 = component.getKey();
                        java.lang.String value = component.getValue();
                        java.util.List<java.lang.String> options4 = component.getOptions();
                        if (options4 == null || (list = kotlin.collections.CollectionsKt.G0(options4)) == null) {
                            list = kotlin.collections.h0.a;
                        }
                        textInputItemUiComponent = new com.truecaller.ads.postclickexperience.dto.AutoCompleteTextInputItemUiComponent(type2, label6, key6, value, component.getValidationRegex(), list);
                    } else {
                        textInputItemUiComponent = new com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent(component.getType(), component.getLabel(), component.getKey(), component.getValue(), component.getValidationRegex());
                    }
                    arrayList.add(textInputItemUiComponent);
                    return;
                }
                return;
            case 1601505219:
                if (type.equals("CheckBox") && (key3 = component.getKey()) != null && !kotlin.text.StringsKt.X(key3) && (label3 = component.getLabel()) != null && !kotlin.text.StringsKt.X(label3) && (options = component.getOptions()) != null && !options.isEmpty()) {
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.CheckBoxInputItemUiComponent(component.getType(), component.getLabel(), component.getKey(), component.getValue(), component.getValidationRegex(), kotlin.collections.CollectionsKt.G0(component.getOptions())));
                    return;
                }
                return;
            case 1862834190:
                if (type.equals("SelectInput") && (key4 = component.getKey()) != null && !kotlin.text.StringsKt.X(key4) && (label4 = component.getLabel()) != null && !kotlin.text.StringsKt.X(label4) && (options2 = component.getOptions()) != null && !options2.isEmpty()) {
                    if (component.getShowAutoComplete() != null && component.getShowAutoComplete().booleanValue()) {
                        selectInputItemUiComponent = new com.truecaller.ads.postclickexperience.dto.AutoCompleteTextInputItemUiComponent(component.getType(), component.getLabel(), component.getKey(), component.getValue(), component.getValidationRegex(), kotlin.collections.CollectionsKt.G0(component.getOptions()));
                    } else {
                        selectInputItemUiComponent = new com.truecaller.ads.postclickexperience.dto.SelectInputItemUiComponent(component.getType(), component.getLabel(), component.getKey(), component.getValue(), component.getValidationRegex(), component.getHint(), kotlin.collections.CollectionsKt.G0(component.getOptions()));
                    }
                    arrayList.add(selectInputItemUiComponent);
                    return;
                }
                return;
            case 1970959535:
                if (type.equals("RadioInput") && (key5 = component.getKey()) != null && !kotlin.text.StringsKt.X(key5) && (label5 = component.getLabel()) != null && !kotlin.text.StringsKt.X(label5) && (options3 = component.getOptions()) != null && !options3.isEmpty()) {
                    arrayList.add(new com.truecaller.ads.postclickexperience.dto.RadioInputItemUiComponent(component.getType(), component.getLabel(), component.getKey(), component.getValue(), component.getValidationRegex(), kotlin.collections.CollectionsKt.G0(component.getOptions())));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void c(java.lang.String str, java.util.ArrayList arrayList, com.truecaller.ads.postclickexperience.dto.Component component, com.truecaller.ads.postclickexperience.dto.Theme theme, com.truecaller.ads.postclickexperience.dto.UiConfigDto uiConfigDto) {
        java.util.List<com.truecaller.ads.postclickexperience.dto.Component> components;
        android.os.Parcelable cTAUiComponent;
        if (kotlin.jvm.internal.Intrinsics.b(component.getType(), str) && (components = component.getComponents()) != null && !components.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = component.getComponents().iterator();
            while (it.hasNext()) {
                a((com.truecaller.ads.postclickexperience.dto.Component) it.next(), arrayList2, theme, uiConfigDto);
            }
            if (str.equals("ArticleBody")) {
                cTAUiComponent = new com.truecaller.ads.postclickexperience.dto.BodyUiComponent("ArticleBody", arrayList2);
            } else if (str.equals("CtaContainer")) {
                cTAUiComponent = new com.truecaller.ads.postclickexperience.dto.CTAUiComponent("CtaContainer", arrayList2);
            } else {
                throw new java.lang.UnsupportedOperationException("Nested components not supported for: ".concat(str));
            }
            arrayList.add(cTAUiComponent);
        }
    }

    public static final com.truecaller.ads.postclickexperience.dto.UiConfigViewDto d(com.truecaller.ads.postclickexperience.dto.UiConfigDto uiConfigDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiConfigDto, "<this>");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.truecaller.ads.postclickexperience.dto.Component component : uiConfigDto.getComponents()) {
                a(component, arrayList, uiConfigDto.getTheme(), uiConfigDto);
                b(component, arrayList);
                c("ArticleBody", arrayList, component, uiConfigDto.getTheme(), uiConfigDto);
                c("CtaContainer", arrayList, component, uiConfigDto.getTheme(), uiConfigDto);
            }
            return new com.truecaller.ads.postclickexperience.dto.UiConfigViewDto(arrayList);
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
            return null;
        }
    }
}
