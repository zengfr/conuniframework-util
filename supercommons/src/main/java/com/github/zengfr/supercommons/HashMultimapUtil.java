package com.zengfr.supercommons;
import com.google.common.collect.HashMultimap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashMultimapUtil{ 
public static <K,V> com.google.common.collect.HashMultimap<K, V> create(){
return HashMultimap.create();
}
public static <K,V> com.google.common.collect.HashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return HashMultimap.create(p0);
}
public static <K,V> com.google.common.collect.HashMultimap<K, V> create(int p0,int p1){
return HashMultimap.create(p0,p1);
}
}
