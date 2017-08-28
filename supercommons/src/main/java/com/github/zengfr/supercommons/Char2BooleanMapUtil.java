package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap singleton(char p0,boolean p1){
return Char2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap singleton(java.lang.Character p0,java.lang.Boolean p1){
return Char2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0){
return Char2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0){
return Char2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0,java.lang.Object p1){
return Char2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0){
return Char2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> p1){
 Char2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0){
return Char2BooleanMaps.fastIterable(p0);
}
}
