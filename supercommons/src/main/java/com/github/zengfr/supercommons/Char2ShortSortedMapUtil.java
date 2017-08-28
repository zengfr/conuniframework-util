package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(char p0,short p1){
return Char2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1){
return Char2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(char p0,short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0){
return Char2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0,java.lang.Object p1){
return Char2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0){
return Char2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0){
return Char2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0){
return Char2ShortSortedMaps.fastIterable(p0);
}
}
