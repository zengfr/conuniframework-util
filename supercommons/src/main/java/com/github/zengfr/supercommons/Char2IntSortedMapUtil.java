package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(char p0,int p1){
return Char2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1){
return Char2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(char p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0){
return Char2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0,java.lang.Object p1){
return Char2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0){
return Char2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0){
return Char2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0){
return Char2IntSortedMaps.fastIterable(p0);
}
}
