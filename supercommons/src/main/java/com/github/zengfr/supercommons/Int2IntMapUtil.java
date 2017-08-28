package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2IntMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2IntMap singleton(int p0,int p1){
return Int2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntMap singleton(java.lang.Integer p0,java.lang.Integer p1){
return Int2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2IntMap p0){
return Int2IntMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2IntMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap p0){
return Int2IntMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2IntMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap p0,java.lang.Object p1){
return Int2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap p0){
return Int2IntMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> p1){
 Int2IntMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2IntMap p0){
return Int2IntMaps.fastIterable(p0);
}
}
