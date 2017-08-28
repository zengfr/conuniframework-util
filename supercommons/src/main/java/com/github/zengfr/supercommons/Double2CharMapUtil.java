package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2CharMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2CharMap singleton(double p0,char p1){
return Double2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharMap singleton(java.lang.Double p0,java.lang.Character p1){
return Double2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2CharMap p0){
return Double2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap p0){
return Double2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap p0,java.lang.Object p1){
return Double2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap p0){
return Double2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> p1){
 Double2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2CharMap p0){
return Double2CharMaps.fastIterable(p0);
}
}
