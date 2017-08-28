package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2LongMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2LongMap singleton(int p0,long p1){
return Int2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongMap singleton(java.lang.Integer p0,java.lang.Long p1){
return Int2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongMap p0){
return Int2LongMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2LongMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap p0){
return Int2LongMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2LongMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap p0,java.lang.Object p1){
return Int2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap p0){
return Int2LongMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> p1){
 Int2LongMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2LongMap p0){
return Int2LongMaps.fastIterable(p0);
}
}
