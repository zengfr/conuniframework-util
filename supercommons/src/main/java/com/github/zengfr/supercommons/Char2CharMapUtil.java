package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2CharMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2CharMap singleton(char p0,char p1){
return Char2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharMap singleton(java.lang.Character p0,java.lang.Character p1){
return Char2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2CharMap p0){
return Char2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2CharMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap p0){
return Char2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2CharMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap p0,java.lang.Object p1){
return Char2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap p0){
return Char2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> p1){
 Char2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2CharMap p0){
return Char2CharMaps.fastIterable(p0);
}
}
