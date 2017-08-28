package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ListLongList;
import org.apache.commons.collections.primitives.adapters.LongListList;
import org.apache.commons.collections.primitives.decorators.UnmodifiableLongList;
import org.apache.commons.collections.primitives.LongCollections;
import it.unimi.dsi.fastutil.longs.LongBigLists;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.longs.LongLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongListUtil{ 
public static org.apache.commons.collections.primitives.LongList wrap(java.util.List p0){
return ListLongList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.LongList p0){
return LongListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.LongList getEmptyLongList(){
return LongCollections.getEmptyLongList();
}
public static org.apache.commons.collections.primitives.LongList unmodifiableLongList(org.apache.commons.collections.primitives.LongList p0) throws java.lang.NullPointerException{
return LongCollections.unmodifiableLongList(p0);
}
public static org.apache.commons.collections.primitives.LongList singletonLongList(long p0){
return LongCollections.singletonLongList(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigList asBigList(it.unimi.dsi.fastutil.longs.LongList p0){
return LongBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0){
return LongIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
return LongIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongList shuffle(it.unimi.dsi.fastutil.longs.LongList p0,java.util.Random p1){
return LongLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongList singleton(long p0){
return LongLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList singleton(java.lang.Object p0){
return LongLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList unmodifiable(it.unimi.dsi.fastutil.longs.LongList p0){
return LongLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList synchronize(it.unimi.dsi.fastutil.longs.LongList p0){
return LongLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList synchronize(it.unimi.dsi.fastutil.longs.LongList p0,java.lang.Object p1){
return LongLists.synchronize(p0,p1);
}
}
