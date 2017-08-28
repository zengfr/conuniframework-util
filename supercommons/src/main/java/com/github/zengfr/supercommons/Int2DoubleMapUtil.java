package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap singleton(int p0,double p1){
return Int2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap singleton(java.lang.Integer p0,java.lang.Double p1){
return Int2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0){
return Int2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0){
return Int2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0,java.lang.Object p1){
return Int2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0){
return Int2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> p1){
 Int2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0){
return Int2DoubleMaps.fastIterable(p0);
}
}
