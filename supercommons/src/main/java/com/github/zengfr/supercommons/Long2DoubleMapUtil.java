package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap singleton(long p0,double p1){
return Long2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap singleton(java.lang.Long p0,java.lang.Double p1){
return Long2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0){
return Long2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0){
return Long2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0,java.lang.Object p1){
return Long2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0){
return Long2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> p1){
 Long2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0){
return Long2DoubleMaps.fastIterable(p0);
}
}
