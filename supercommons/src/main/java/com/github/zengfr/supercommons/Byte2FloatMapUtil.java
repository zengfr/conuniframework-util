package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2FloatMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap singleton(byte p0,float p1){
return Byte2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap singleton(java.lang.Byte p0,java.lang.Float p1){
return Byte2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0){
return Byte2FloatMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0){
return Byte2FloatMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0,java.lang.Object p1){
return Byte2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0){
return Byte2FloatMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> p1){
 Byte2FloatMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0){
return Byte2FloatMaps.fastIterable(p0);
}
}
