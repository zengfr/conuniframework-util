package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(int p0,byte p1){
return Int2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(java.lang.Integer p0,java.lang.Byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(java.lang.Integer p0,java.lang.Byte p1){
return Int2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(int p0,byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0){
return Int2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0,java.lang.Object p1){
return Int2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0){
return Int2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0){
return Int2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0){
return Int2ByteSortedMaps.fastIterable(p0);
}
}
