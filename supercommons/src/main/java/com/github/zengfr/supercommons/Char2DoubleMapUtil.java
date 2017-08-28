package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap singleton(char p0,double p1){
return Char2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap singleton(java.lang.Character p0,java.lang.Double p1){
return Char2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0){
return Char2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0){
return Char2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0,java.lang.Object p1){
return Char2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0){
return Char2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> p1){
 Char2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0){
return Char2DoubleMaps.fastIterable(p0);
}
}
