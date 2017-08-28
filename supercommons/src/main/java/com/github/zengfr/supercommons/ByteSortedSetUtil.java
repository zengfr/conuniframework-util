package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteSortedSetUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
return ByteSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(byte p0){
return ByteSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(java.lang.Object p0){
return ByteSortedSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(byte p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
return ByteSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet unmodifiable(it.unimi.dsi.fastutil.bytes.ByteSortedSet p0){
return ByteSortedSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet p0){
return ByteSortedSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet p0,java.lang.Object p1){
return ByteSortedSets.synchronize(p0,p1);
}
}
