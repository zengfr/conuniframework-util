package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2IntMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2IntMap singleton(short p0,int p1){
return Short2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntMap singleton(java.lang.Short p0,java.lang.Integer p1){
return Short2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2IntMap p0){
return Short2IntMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap p0){
return Short2IntMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap p0,java.lang.Object p1){
return Short2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap p0){
return Short2IntMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> p1){
 Short2IntMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2IntMap p0){
return Short2IntMaps.fastIterable(p0);
}
}
