package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap singleton(byte p0,double p1){
return Byte2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap singleton(java.lang.Byte p0,java.lang.Double p1){
return Byte2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0){
return Byte2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0){
return Byte2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0,java.lang.Object p1){
return Byte2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0){
return Byte2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> p1){
 Byte2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0){
return Byte2DoubleMaps.fastIterable(p0);
}
}
