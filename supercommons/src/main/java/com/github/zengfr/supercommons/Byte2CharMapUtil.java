package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2CharMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap singleton(byte p0,char p1){
return Byte2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap singleton(java.lang.Byte p0,java.lang.Character p1){
return Byte2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0){
return Byte2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0){
return Byte2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0,java.lang.Object p1){
return Byte2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0){
return Byte2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> p1){
 Byte2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0){
return Byte2CharMaps.fastIterable(p0);
}
}
