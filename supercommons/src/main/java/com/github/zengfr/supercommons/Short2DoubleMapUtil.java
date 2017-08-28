package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap singleton(short p0,double p1){
return Short2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap singleton(java.lang.Short p0,java.lang.Double p1){
return Short2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0){
return Short2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0){
return Short2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0,java.lang.Object p1){
return Short2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0){
return Short2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> p1){
 Short2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0){
return Short2DoubleMaps.fastIterable(p0);
}
}
