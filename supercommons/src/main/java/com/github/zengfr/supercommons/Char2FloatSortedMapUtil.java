package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(char p0,float p1){
return Char2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1){
return Char2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(char p0,float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0){
return Char2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0,java.lang.Object p1){
return Char2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0){
return Char2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0){
return Char2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0){
return Char2FloatSortedMaps.fastIterable(p0);
}
}
