package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ByteMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ByteMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2ByteMap singleton(float p0,byte p1){
return Float2ByteMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteMap singleton(java.lang.Float p0,java.lang.Byte p1){
return Float2ByteMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2ByteMap p0){
return Float2ByteMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap p0){
return Float2ByteMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap p0,java.lang.Object p1){
return Float2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap p0){
return Float2ByteMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> p1){
 Float2ByteMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2ByteMap p0){
return Float2ByteMaps.fastIterable(p0);
}
}
