package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2CharMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2CharMap singleton(int p0,char p1){
return Int2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharMap singleton(java.lang.Integer p0,java.lang.Character p1){
return Int2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2CharMap p0){
return Int2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2CharMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap p0){
return Int2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2CharMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap p0,java.lang.Object p1){
return Int2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap p0){
return Int2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> p1){
 Int2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2CharMap p0){
return Int2CharMaps.fastIterable(p0);
}
}
