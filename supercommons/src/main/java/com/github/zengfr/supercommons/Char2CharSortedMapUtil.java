package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(char p0,char p1){
return Char2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(java.lang.Character p0,java.lang.Character p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(java.lang.Character p0,java.lang.Character p1){
return Char2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(char p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0){
return Char2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0,java.lang.Object p1){
return Char2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0){
return Char2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0){
return Char2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0){
return Char2CharSortedMaps.fastIterable(p0);
}
}
