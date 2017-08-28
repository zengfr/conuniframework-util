package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2DoubleMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> emptyMap(){
return Object2DoubleMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> singleton(K p0,double p1){
return Object2DoubleMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> singleton(K p0,java.lang.Double p1){
return Object2DoubleMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0){
return Object2DoubleMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0,java.lang.Object p1){
return Object2DoubleMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0){
return Object2DoubleMaps.synchronize(p0);
}
}
