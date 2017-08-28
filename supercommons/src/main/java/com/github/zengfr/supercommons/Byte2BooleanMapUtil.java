package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap singleton(byte p0,boolean p1){
return Byte2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap singleton(java.lang.Byte p0,java.lang.Boolean p1){
return Byte2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0){
return Byte2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0){
return Byte2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0,java.lang.Object p1){
return Byte2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0){
return Byte2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> p1){
 Byte2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0){
return Byte2BooleanMaps.fastIterable(p0);
}
}
