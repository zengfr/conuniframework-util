package com.zengfr.supercommons;
import com.google.common.collect.Maps;
import com.google.common.collect.Multisets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EntryUtil{ 
public static <K,V> java.util.Map.java.util.Map.Entry<K, V> immutableEntry(K p0,V p1){
return Maps.immutableEntry(p0,p1);
}
public static <E> com.google.common.collect.Multiset.com.google.common.collect.Multiset.Entry<E> immutableEntry(E p0,int p1){
return Multisets.immutableEntry(p0,p1);
}
}
