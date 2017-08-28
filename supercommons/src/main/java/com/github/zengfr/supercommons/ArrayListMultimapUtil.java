package com.github.zengfr.supercommons;
import com.google.common.collect.ArrayListMultimap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayListMultimapUtil{ 
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return ArrayListMultimap.create(p0);
}
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(int p0,int p1){
return ArrayListMultimap.create(p0,p1);
}
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(){
return ArrayListMultimap.create();
}
}
