package com.virjar.ratel.builder;

import net.dongliu.apk.parser.bean.ApkMeta;
import net.dongliu.apk.parser.bean.DexClass;

import org.apache.commons.cli.CommandLine;
import org.w3c.dom.Document;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BuildParamMeta {
    public String packageName;
    public String appEntryClass;
    public String appEntryClassDex;
    public String originApplicationClass;
    public String launcherActivityClass;
    public Map<String, DexClass[]> dexClassesMap;
    public String serialNo;
    public String buildTimestamp;
    public Document androidManifestXml;
    public String androidAppComponentFactory;
    //zelda引擎特有的字段
    public String newPkgName;
    public Set<String> declaredComponentClassNames = new HashSet<>();
    public String sufferKey;
    public ApkMeta apkMeta;
    public CommandLine cmd;
    public Properties ratelBuildProperties;
    public Set<String> permissionDeclare = new HashSet<>();
    public Set<String> authorities = new HashSet<>();
    public Set<String> childProcess = new HashSet<>();
    public List<String> axmlEditorCommand;
}
