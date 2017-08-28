package com.github.zengfr.supercommons;
import org.apache.commons.collections4.set.MapBackedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapBackedSetUtil{ 
public static <E,V> org.apache.commons.collections4.set.MapBackedSet<E, V> mapBackedSet(java.util.Map<E, ? super V> p0,V p1){
return MapBackedSet.mapBackedSet(p0,p1);
}
public static <E,V> org.apache.commons.collections4.set.MapBackedSet<E, V> mapBackedSet(java.util.Map<E, ? super V> p0){
return MapBackedSet.mapBackedSet(p0);
}
}
