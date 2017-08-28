package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2IntMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2IntMap singleton(char p0,int p1){
return Char2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntMap singleton(java.lang.Character p0,java.lang.Integer p1){
return Char2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2IntMap p0){
return Char2IntMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2IntMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap p0){
return Char2IntMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2IntMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap p0,java.lang.Object p1){
return Char2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap p0){
return Char2IntMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> p1){
 Char2IntMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2IntMap p0){
return Char2IntMaps.fastIterable(p0);
}
}
