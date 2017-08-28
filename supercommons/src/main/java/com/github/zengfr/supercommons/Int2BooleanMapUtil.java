package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap singleton(int p0,boolean p1){
return Int2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap singleton(java.lang.Integer p0,java.lang.Boolean p1){
return Int2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0){
return Int2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0){
return Int2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0,java.lang.Object p1){
return Int2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0){
return Int2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> p1){
 Int2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0){
return Int2BooleanMaps.fastIterable(p0);
}
}
