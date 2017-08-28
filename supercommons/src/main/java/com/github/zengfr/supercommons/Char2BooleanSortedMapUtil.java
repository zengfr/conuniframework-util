package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2BooleanSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1){
return Char2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1){
return Char2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0){
return Char2BooleanSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0,java.lang.Object p1){
return Char2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0){
return Char2BooleanSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0){
return Char2BooleanSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0){
return Char2BooleanSortedMaps.fastIterable(p0);
}
}
