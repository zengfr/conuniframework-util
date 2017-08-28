package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1){
return Char2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1){
return Char2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
return Char2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0,java.lang.Object p1){
return Char2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
return Char2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
return Char2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
return Char2LongSortedMaps.fastIterable(p0);
}
}
