package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap singleton(short p0,boolean p1){
return Short2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap singleton(java.lang.Short p0,java.lang.Boolean p1){
return Short2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0){
return Short2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0){
return Short2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0,java.lang.Object p1){
return Short2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0){
return Short2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2BooleanMap.Entry> p1){
 Short2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.shorts.Short2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0){
return Short2BooleanMaps.fastIterable(p0);
}
}
