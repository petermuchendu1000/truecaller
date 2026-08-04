# Decompiled Truecaller (apktool) — byte-accurate, rebuildable

Full **apktool** decode of `Truecaller.apk` — com.truecaller **26.28.5** (versionCode 2628005, targetSdk 36).
This is the authoritative, rebuildable resource set for opening/inspecting in Android Studio and for
byte-accurate diagnosis of the Calls & Messages UI.

Produced with: `apktool d -s Truecaller.apk` (Java 17 / apktool 2.10.0).
`-s` keeps the original `classes*.dex` verbatim (no smali) so the project stays resource-focused but still
repackable with `apktool b`.

## Accuracy guarantees
- **Binary assets are byte-identical to the APK**: every PNG/WebP under `res/drawable-*`, every font in
  `res/font/` (Poppins, Roboto TTFs), every Lottie/`.json`/audio in `res/raw` and `assets/` is copied unchanged.
- **Compiled resources are fully decoded** from `resources.arsc` into editable XML — including every
  configuration variant:
  - Themes/styles: `res/values/styles.xml`, `res/values-night/styles.xml`
  - Colors incl. dark mode: `res/values/colors.xml`, `res/values-night/colors.xml`, `-night-v29`, `-night-v31`
  - `attrs.xml`, `dimens.xml`, `arrays.xml`, `bools.xml`, `integers.xml`, `public.xml`
  - 150+ locale folders `res/values-<locale>/strings.xml`
  - Density buckets `res/drawable-hdpi … -xxhdpi`, `-anydpi`, `-nodpi`, `-night`, `-sw600dp`, `-watch`, `-v31`
- **Vector drawables** are decoded to their exact `<vector>` XML (path data, fill colors, tints) — not converted.
- `AndroidManifest.xml` decoded with resource references resolved.

## Layout
```
decompiled/
  AndroidManifest.xml      # decoded manifest (permissions, activities, services, receivers)
  apktool.yml              # apktool metadata (versionName/Code, sdkInfo, packaged files)
  res/                     # ALL resources, every config variant (the byte-accurate UI set)
  assets/                  # app assets (incl. audience_network.dex asset, ML models, configs)
  kotlin/ , original/ , unknown/ , META-INF/
  classes*.dex             # original DEX, copied verbatim (code; kept so `apktool b` can rebuild)
```

## Rebuild
```
apktool b decompiled -o truecaller_rebuilt.apk
```
(then zipalign + sign for install/run)

## Where the two focus screens live
- **Messages:** `res/layout/layout_tcx_list_item.xml` (inbox row), `fragment_conversation.xml`,
  `item_message_incoming.xml` / `item_message_outgoing.xml`, `layout_conversation_input_bar_default.xml`,
  `fragment_new_conversation.xml`. Colors/themes in `res/values*/colors.xml` + `styles.xml`.
- **Calls:** `res/layout/view_callerid.xml`, `include_caller_id_card.xml`, `fragment_call_ui_incoming.xml`,
  `view_call_ui_answer_button.xml`, `notification_call_incoming_big*.xml`, `activity_acs.xml`.
