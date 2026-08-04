#!/usr/bin/env python3
"""Full UI-resource extraction from Truecaller.apk for team diagnosis."""
import os, re, zipfile, sys, json, time
from loguru import logger; logger.remove()
from androguard.core.apk import APK
from androguard.core.axml import AXMLPrinter

APK_PATH="/home/user/.uploads/Truecaller.apk"
OUT="/home/user/tc_ui_resources"
t0=time.time()
apk=APK(APK_PATH)
arsc=apk.get_android_resources()
pkg=apk.get_package()
z=zipfile.ZipFile(APK_PATH)

for sub in ["manifest","values","res_decoded","svg","raw"]:
    os.makedirs(f"{OUT}/{sub}", exist_ok=True)

# ---- id -> name resolver (memoized) ----
_cache={}
def name_of(hexref):
    if hexref in _cache: return _cache[hexref]
    rid=int(hexref,16)
    try:
        t=arsc.get_id(pkg,rid)
        v=f"@{t[0]}/{t[1]}" if (t and t[0]) else f"@0x{rid:08X}"
    except Exception:
        v=f"@0x{rid:08X}"
    _cache[hexref]=v; return v
def resolve(x):
    return re.sub(r"@([0-9A-Fa-f]{8})", lambda m:name_of(m.group(1).upper()), x)

def android_color_to_css(c):
    c=c.strip()
    if not c.startswith("#"): return c
    h=c[1:]
    if len(h)==8:
        a=int(h[0:2],16)/255; r=h[2:4];g=h[4:6];b=h[6:8]
        return f"#{r}{g}{b}" if a>=0.999 else f"rgba({int(r,16)},{int(g,16)},{int(b,16)},{round(a,3)})"
    return c
def vector_to_svg(xmlt):
    mw=re.search(r'viewportWidth="([\d.]+)"',xmlt); mh=re.search(r'viewportHeight="([\d.]+)"',xmlt)
    if not (mw and mh): return None
    vw=float(mw.group(1)); vh=float(mh.group(1))
    out=[]
    for p in re.findall(r'<path\b([^>]*?)/?>',xmlt):
        d=re.search(r'pathData="([^"]+)"',p)
        if not d: continue
        fc=re.search(r'fillColor="([^"]+)"',p)
        fill=android_color_to_css(fc.group(1)) if fc else "#000000"
        out.append(f'<path d="{d.group(1)}" fill="{fill}"/>')
    if not out: return None
    return f'<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 {vw} {vh}" width="{vw}" height="{vh}">{"".join(out)}</svg>'

# ---- manifest ----
try:
    open(f"{OUT}/manifest/AndroidManifest.xml","w").write(resolve(apk.get_android_manifest_axml().get_xml().decode("utf-8","replace")))
except Exception as e:
    open(f"{OUT}/manifest/AndroidManifest.xml","w").write(f"<!-- decode error {e} -->")

# ---- values dumps ----
def dump(fn, getter):
    try:
        data=getter()
        if isinstance(data,(bytes,bytearray)): data=data.decode("utf-8","replace")
        open(f"{OUT}/values/{fn}","w").write(data)
        return data.count("<")  # rough entry count
    except Exception as e:
        open(f"{OUT}/values/{fn}","w").write(f"<!-- {e} -->"); return 0
dump("strings.xml", lambda: arsc.get_strings_resources())
dump("colors.xml",  lambda: arsc.get_color_resources(pkg))
dump("dimens.xml",  lambda: arsc.get_dimen_resources(pkg))
dump("bools.xml",   lambda: arsc.get_bool_resources(pkg))
dump("integers.xml",lambda: arsc.get_integer_resources(pkg))
dump("public.xml",  lambda: arsc.get_public_resources(pkg))
dump("ids.xml",     lambda: arsc.get_id_resources(pkg))

# ---- iterate res/ ----
files=[f for f in apk.get_files() if f.startswith("res/")]
stats={"xml_decoded":0,"xml_fail":0,"svg":0,"raster":0,"raw":0}
svg_index=[]  # (name, relpath)
layout_index=[]
for f in files:
    rel=f[len("res/"):]
    raw=z.read(f)
    ext=os.path.splitext(f)[1].lower()
    if ext==".xml":
        try:
            txt=AXMLPrinter(raw).get_buff().decode("utf-8","replace")
            txt=resolve(txt)
            dst=f"{OUT}/res_decoded/{rel}"
            os.makedirs(os.path.dirname(dst),exist_ok=True)
            open(dst,"w").write(txt)
            stats["xml_decoded"]+=1
            if rel.startswith("layout"):
                layout_index.append(rel)
            if "<vector" in txt[:200]:
                svg=vector_to_svg(txt)
                if svg:
                    base=os.path.splitext(os.path.basename(rel))[0]
                    sp=f"{OUT}/svg/{base}.svg"
                    open(sp,"w").write(svg); stats["svg"]+=1
                    svg_index.append(base)
        except Exception:
            dst=f"{OUT}/raw/{rel}"; os.makedirs(os.path.dirname(dst),exist_ok=True)
            open(dst,"wb").write(raw); stats["xml_fail"]+=1
    elif ext in (".png",".webp",".jpg",".jpeg",".gif"):
        dst=f"{OUT}/raw/{rel}"; os.makedirs(os.path.dirname(dst),exist_ok=True)
        open(dst,"wb").write(raw); stats["raster"]+=1
    else:
        dst=f"{OUT}/raw/{rel}"; os.makedirs(os.path.dirname(dst),exist_ok=True)
        open(dst,"wb").write(raw); stats["raw"]+=1

json.dump({"stats":stats,"n_layouts":len(layout_index),"n_svg":len(svg_index)},
          open(f"{OUT}/_extract_report.json","w"), indent=2)
open(f"{OUT}/_layouts_list.txt","w").write("\n".join(sorted(layout_index)))
open(f"{OUT}/_svg_list.txt","w").write("\n".join(sorted(set(svg_index))))
print("DONE in %.1fs"%(time.time()-t0))
print(json.dumps(stats,indent=2))
print("unique svgs:",len(set(svg_index)),"| layouts:",len(layout_index))
