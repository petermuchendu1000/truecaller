# Truecaller UI — runnable Android Studio project (screens only)

A **buildable, runnable** Android app that shows the Truecaller **Calls** and **Messages** screens as
pure UI (no backend / no telephony). Built with the **real extracted resources** from com.truecaller 26.28.5:
exact colors (light + `values-night`), dimensions, vector drawables, and the original Poppins/Roboto fonts.

## Why this is a fresh project (not the apktool decode)
The original layouts reference Truecaller's proprietary custom View classes (e.g. `ListItemX`,
`AvatarXView`, `TintedImageView`) that live in the DEX and can't compile in a standalone project.
So the layouts here are authored with **standard AndroidX widgets** that mirror the decoded layout
structure 1:1 and reference the **same real design tokens** — giving an accurate, runnable UI.

## Run it
1. Android Studio ▸ **Open** → select this `android_ui_app/` folder.
2. Let Gradle sync (it downloads Gradle 8.7 + AGP 8.5.2 via the wrapper; if it asks to generate the
   Gradle wrapper, accept).
3. Pick an emulator/device and press **Run ▶**.

Requires: Android Studio (Giraffe+), JDK 17, Android SDK 34.

## Screens
| Screen | File | Mirrors |
|---|---|---|
| Home shell (bottom nav: Calls, Messages) | `MainActivity` + `activity_main.xml` | TruecallerInit tabs |
| **Calls** (call log: incoming/outgoing/missed icons, avatars) | `CallsFragment` + `fragment_calls.xml` | Calls tab |
| **Messages** (Inbox/Offers/Transactions/Spam chips, conversation rows, FAB) | `MessagesFragment` + `fragment_messages.xml` | `layout_tcx_list_item` |
| **Conversation** (toolbar, bubbles, input bar) | `ConversationActivity` + `activity_conversation.xml` | `fragment_conversation` + `item_message_*` |
| **Incoming call** (avatar, name, number, answer/decline) | `IncomingCallActivity` + `activity_incoming_call.xml` | `fragment_call_ui_incoming` |

Tap a **message row** → opens the conversation thread.
Tap a **call row** (or the Calls FAB) → opens the incoming‑call screen.

## Accurate design tokens used
- Brand blue `#0A6CFF` (light) / `#146FF5` (night)
- Backgrounds `#FFFFFF` / `#000000`; surface `#FFFFFF` / `#202124`
- Text `#202124` / `#EFF1F1`, secondary `#5F646D` / `#8D939B`
- Spam red `#E91F0C`; outgoing‑SMS bubble green `#4AAD4E`; incoming `#F1F4F6` / `#2A3541`
- Avatar 52dp, row 72dp, bubble radius 20dp (4dp tail), input bar min 48dp
- Real vector drawables (call‑type icons, send/attach/emoji/search/more, new‑message FAB) and Poppins/Roboto TTFs

Dark mode follows the system setting automatically (`values` vs `values-night`).
