package com.zengfr.supercommons;
import com.google.common.collect.LinkedListMultimap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedListMultimapUtil{ 
public static <K,V> com.google.common.collect.LinkedListMultimap<K, V> create(){
return LinkedListMultimap.create();
}
public static <K,V> com.google.common.collect.LinkedListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return LinkedListMultimap.create(p0);
}
public static <K,V> com.google.common.collect.LinkedListMultimap<K, V> create(int p0){
return LinkedListMultimap.create(p0);
}
}
