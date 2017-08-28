package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ByteMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ByteMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap singleton(short p0,byte p1){
return Short2ByteMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap singleton(java.lang.Short p0,java.lang.Byte p1){
return Short2ByteMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0){
return Short2ByteMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0){
return Short2ByteMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0,java.lang.Object p1){
return Short2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0){
return Short2ByteMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> p1){
 Short2ByteMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0){
return Short2ByteMaps.fastIterable(p0);
}
}
