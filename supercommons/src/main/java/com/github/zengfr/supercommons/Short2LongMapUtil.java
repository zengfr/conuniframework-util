package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2LongMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2LongMap singleton(short p0,long p1){
return Short2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongMap singleton(java.lang.Short p0,java.lang.Long p1){
return Short2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2LongMap p0){
return Short2LongMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap p0){
return Short2LongMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap p0,java.lang.Object p1){
return Short2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap p0){
return Short2LongMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> p1){
 Short2LongMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2LongMap p0){
return Short2LongMaps.fastIterable(p0);
}
}
