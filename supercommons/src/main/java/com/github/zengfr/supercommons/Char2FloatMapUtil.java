package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2FloatMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2FloatMap singleton(char p0,float p1){
return Char2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatMap singleton(java.lang.Character p0,java.lang.Float p1){
return Char2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2FloatMap p0){
return Char2FloatMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap p0){
return Char2FloatMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap p0,java.lang.Object p1){
return Char2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap p0){
return Char2FloatMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> p1){
 Char2FloatMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2FloatMap p0){
return Char2FloatMaps.fastIterable(p0);
}
}
