package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleSortedSetUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
return DoubleSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(double p0){
return DoubleSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(java.lang.Object p0){
return DoubleSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(double p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
return DoubleSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleSortedSet p0){
return DoubleSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet p0){
return DoubleSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet p0,java.lang.Object p1){
return DoubleSortedSets.synchronize(p0,p1);
}
}
