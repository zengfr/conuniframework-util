package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2CharMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2CharMap singleton(float p0,char p1){
return Float2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharMap singleton(java.lang.Float p0,java.lang.Character p1){
return Float2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2CharMap p0){
return Float2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2CharMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap p0){
return Float2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2CharMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap p0,java.lang.Object p1){
return Float2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap p0){
return Float2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> p1){
 Float2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2CharMap p0){
return Float2CharMaps.fastIterable(p0);
}
}
