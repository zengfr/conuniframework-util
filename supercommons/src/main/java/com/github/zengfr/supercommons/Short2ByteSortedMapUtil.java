package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(short p0,byte p1){
return Short2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(java.lang.Short p0,java.lang.Byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(java.lang.Short p0,java.lang.Byte p1){
return Short2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(short p0,byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0){
return Short2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0,java.lang.Object p1){
return Short2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0){
return Short2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0){
return Short2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0){
return Short2ByteSortedMaps.fastIterable(p0);
}
}
