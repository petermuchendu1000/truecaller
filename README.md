# Truecaller — Incoming-Call UI Diagnosis

Working repo for diagnosing the reported bug:
> When someone calls, the app shows nothing (phone still rings); when the caller screen does show, tapping to receive the call doesn't respond.

Source: `Truecaller.apk` — **com.truecaller 26.28.5** (targetSdk 36), decoded with pure-Python tooling (androguard AXML + ARSC).

## What's here

| Path | Contents |
|---|---|
| `ui_resources/` | **Full decoded UI resource set** — open `ui_resources/INDEX.html` in a browser to explore. Layouts, drawables (as SVG), colors, dimens, strings (all locales), styles, and the decoded manifest. See `ui_resources/README.md`. |
| `diagnostics_harness/` | **Integrated incoming-call flow harness** (`index.html`) — the whole UI runs as one flow (ring → show → tap → connect) with a **Backend Bus**: flip each backend adapter on one at a time to reproduce/fix each symptom and isolate the culprit. |
| `extract_ui.py` | The extraction script that produced `ui_resources/`. |

## Call-flow entry points (the files that matter for this bug)
- Caller-ID overlay: `ui_resources/res_decoded/layout/view_callerid.xml` → `include_caller_id_card.xml`
- Full-screen answer: `ui_resources/res_decoded/layout/fragment_call_ui_incoming.xml`
- Answer button: `ui_resources/res_decoded/layout/view_call_ui_answer_button.xml`
- Incoming notification: `ui_resources/res_decoded/layout/notification_call_incoming_big*.xml`

## Findings so far (static analysis)
- The overlay window is built correctly: `TYPE_APPLICATION_OVERLAY` (2038), flags `NOT_FOCUSABLE | SHOW_WHEN_LOCKED`, **touchable** (no `FLAG_NOT_TOUCHABLE`). So "nothing shows" is not a window-flag defect — it points to the **Display-over-other-apps permission** / service being killed, with the notification as fallback.
- On the answer screen, `button_answer/decline/spam` ship `visibility=gone` (enabled by the presenter), and a transparent `click_catcher` sits above the caller area. "Tap does nothing" points to **touch routing** (hit target still gone / catcher) and/or **not being the default dialer** (`acceptRingingCall()` denied).

## Diagnosis plan
Use `diagnostics_harness/index.html`: load the **"Reproduce reported bug"** preset, simulate a call, then connect backends one at a time (Overlay permission → Touch routing → Telecom/dialer role). Whichever flip turns the log red→green is the culprit.
