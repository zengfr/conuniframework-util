package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CollectionLongCollection;
import org.apache.commons.collections.primitives.adapters.LongCollectionCollection;
import it.unimi.dsi.fastutil.longs.LongCollections;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongCollectionUtil{ 
public static org.apache.commons.collections.primitives.LongCollection wrap(java.util.Collection p0){
return CollectionLongCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.LongCollection p0){
return LongCollectionCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.longs.LongCollection unmodifiable(it.unimi.dsi.fastutil.longs.LongCollection p0){
return LongCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongCollection synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0,java.lang.Object p1){
return LongCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongCollection synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0){
return LongCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.LongCollection asCollection(it.unimi.dsi.fastutil.longs.LongIterable p0){
return LongCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
return LongIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
return LongIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
return LongIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
return LongIterators.pour(p0,p1,p2);
}
}
