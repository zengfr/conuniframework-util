package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(double p0,byte p1){
return Double2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(java.lang.Double p0,java.lang.Byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(java.lang.Double p0,java.lang.Byte p1){
return Double2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(double p0,byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0){
return Double2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0,java.lang.Object p1){
return Double2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0){
return Double2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0){
return Double2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0){
return Double2ByteSortedMaps.fastIterable(p0);
}
}
