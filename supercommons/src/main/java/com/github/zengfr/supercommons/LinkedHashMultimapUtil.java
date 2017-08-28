package com.github.zengfr.supercommons;
import com.google.common.collect.LinkedHashMultimap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedHashMultimapUtil{ 
public static <K,V> com.google.common.collect.LinkedHashMultimap<K, V> create(int p0,int p1){
return LinkedHashMultimap.create(p0,p1);
}
public static <K,V> com.google.common.collect.LinkedHashMultimap<K, V> create(){
return LinkedHashMultimap.create();
}
public static <K,V> com.google.common.collect.LinkedHashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return LinkedHashMultimap.create(p0);
}
}
