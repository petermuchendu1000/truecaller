# Truecaller UI Resource Set — com.truecaller 26.28.5

Full decoded UI/UX resource extraction from `Truecaller.apk`, for team diagnosis of the
incoming-call display / tap-to-answer issue.

## How to browse
Open **INDEX.html** in any browser (works offline / from `file://`).
- Filter box + category tabs on the left.
- SVGs and rasters preview inline; XML opens in a frame.
- Quick links jump to the call-flow layouts (caller-ID overlay, answer screen, call notification, after-call).

## Folder layout
| Folder | Contents |
|---|---|
| `manifest/` | Decoded `AndroidManifest.xml` (permissions, activities, services, receivers) |
| `values/`   | `strings.xml` (all locales), `colors.xml`, `dimens.xml`, `bools.xml`, `integers.xml`, `ids.xml`, `public.xml` |
| `res_decoded/` | Every compiled layout / drawable-xml / color / anim / menu / navigation / xml, decoded to readable XML with `@id`/`@drawable`/`@color` references resolved to names |
| `svg/` | 1,585 vector drawables converted to SVG (previewable icons/backgrounds) |
| `raw/` | Raster assets (PNG/WebP), fonts (TTF), Lottie/JSON animations, audio, and any non-XML resources |

## Call-flow entry points (for the reported bug)
- **Caller-ID overlay:** `res_decoded/layout/view_callerid.xml` → `include_caller_id_card.xml`
  (window: TYPE_APPLICATION_OVERLAY 2038, flags NOT_FOCUSABLE|SHOW_WHEN_LOCKED, touchable — see prior analysis)
- **Full-screen answer:** `res_decoded/layout/fragment_call_ui_incoming.xml`
  (`button_answer`/`button_decline`/`button_spam` ship `visibility=gone`; `click_catcher` transparent hit layer)
- **Answer button component:** `res_decoded/layout/view_call_ui_answer_button.xml`
- **Swipe/drag hint:** `res_decoded/layout/view_callerid_swipe_hint.xml` (`@string/CallerIdDragHint` = "Drag to move Caller ID")
- **Incoming notification:** `res_decoded/layout/notification_call_incoming_big*.xml`
- **After-call (ACS):** `res_decoded/layout/activity_acs.xml`, `fragment_acs_popup.xml`, `fragment_neo_acs_*.xml`

## Extraction stats
- Layouts: 2,500 · Drawable XML: 2,736 · Vector→SVG: 1,585 · Colors: 329 · Anim: 106 · Rasters: 459
- Source: pure-Python decode (androguard AXML + ARSC). No Android runtime required.
