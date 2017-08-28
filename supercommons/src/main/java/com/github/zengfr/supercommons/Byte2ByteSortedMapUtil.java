package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(byte p0,byte p1){
return Byte2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(java.lang.Byte p0,java.lang.Byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(java.lang.Byte p0,java.lang.Byte p1){
return Byte2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(byte p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0){
return Byte2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0,java.lang.Object p1){
return Byte2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0){
return Byte2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0){
return Byte2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0){
return Byte2ByteSortedMaps.fastIterable(p0);
}
}
