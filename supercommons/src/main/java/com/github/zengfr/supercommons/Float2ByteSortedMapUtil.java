package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(float p0,byte p1){
return Float2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(java.lang.Float p0,java.lang.Byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(java.lang.Float p0,java.lang.Byte p1){
return Float2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(float p0,byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0){
return Float2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0,java.lang.Object p1){
return Float2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0){
return Float2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0){
return Float2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0){
return Float2ByteSortedMaps.fastIterable(p0);
}
}
