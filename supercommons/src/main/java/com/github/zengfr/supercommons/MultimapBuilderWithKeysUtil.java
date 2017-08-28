package com.zengfr.supercommons;
import com.google.common.collect.MultimapBuilder;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultimapBuilderWithKeysUtil{ 
public static MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys(int p0){
return MultimapBuilder.linkedHashKeys(p0);
}
public static MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys(){
return MultimapBuilder.linkedHashKeys();
}
public static MultimapBuilderWithKeys<java.lang.Object> hashKeys(int p0){
return MultimapBuilder.hashKeys(p0);
}
public static MultimapBuilderWithKeys<java.lang.Object> hashKeys(){
return MultimapBuilder.hashKeys();
}
public static MultimapBuilderWithKeys<java.lang.Comparable> treeKeys(){
return MultimapBuilder.treeKeys();
}
public static <K0> MultimapBuilderWithKeys<K0> treeKeys(java.util.Comparator<K0> p0){
return MultimapBuilder.treeKeys(p0);
}
public static <K0 extends java.lang.Enum<K0> > MultimapBuilderWithKeys<K0> enumKeys(java.lang.Class<K0> p0){
return MultimapBuilder.enumKeys(p0);
}
}
