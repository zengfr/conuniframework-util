package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(char p0,double p1){
return Char2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1){
return Char2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(char p0,double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0){
return Char2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0,java.lang.Object p1){
return Char2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0){
return Char2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0){
return Char2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0){
return Char2DoubleSortedMaps.fastIterable(p0);
}
}
