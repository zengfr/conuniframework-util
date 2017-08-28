package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatSortedSetUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
return FloatSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(float p0){
return FloatSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(java.lang.Object p0){
return FloatSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(float p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
return FloatSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet unmodifiable(it.unimi.dsi.fastutil.floats.FloatSortedSet p0){
return FloatSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet p0){
return FloatSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet p0,java.lang.Object p1){
return FloatSortedSets.synchronize(p0,p1);
}
}
