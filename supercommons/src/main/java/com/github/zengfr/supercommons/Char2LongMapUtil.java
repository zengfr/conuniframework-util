package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2LongMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2LongMap singleton(char p0,long p1){
return Char2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongMap singleton(java.lang.Character p0,java.lang.Long p1){
return Char2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongMap p0){
return Char2LongMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2LongMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap p0){
return Char2LongMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2LongMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap p0,java.lang.Object p1){
return Char2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap p0){
return Char2LongMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> p1){
 Char2LongMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2LongMap p0){
return Char2LongMaps.fastIterable(p0);
}
}
