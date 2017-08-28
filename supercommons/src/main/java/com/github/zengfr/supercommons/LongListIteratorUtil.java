package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ListIteratorLongListIterator;
import org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableLongListIterator;
import org.apache.commons.collections.primitives.LongCollections;
import it.unimi.dsi.fastutil.longs.LongBigListIterators;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongListIteratorUtil{ 
public static org.apache.commons.collections.primitives.LongListIterator wrap(java.util.ListIterator p0){
return ListIteratorLongListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.LongListIterator p0){
return LongListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.LongListIterator unmodifiableLongListIterator(org.apache.commons.collections.primitives.LongListIterator p0){
return LongCollections.unmodifiableLongListIterator(p0);
}
public static org.apache.commons.collections.primitives.LongListIterator singletonLongListIterator(long p0){
return LongCollections.singletonLongListIterator(p0);
}
public static org.apache.commons.collections.primitives.LongListIterator getEmptyLongListIterator(){
return LongCollections.getEmptyLongListIterator();
}
public static it.unimi.dsi.fastutil.longs.LongBigListIterator asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator p0){
return LongBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator wrap(long[] p0,int p1,int p2){
return LongIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator wrap(long[] p0){
return LongIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator singleton(long p0){
return LongIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongListIterator p0){
return LongIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator asLongIterator(java.util.ListIterator p0){
return LongIterators.asLongIterator(p0);
}
}
