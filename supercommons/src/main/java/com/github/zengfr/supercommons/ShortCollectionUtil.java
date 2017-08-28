package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CollectionShortCollection;
import org.apache.commons.collections.primitives.adapters.ShortCollectionCollection;
import it.unimi.dsi.fastutil.shorts.ShortCollections;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortCollectionUtil{ 
public static org.apache.commons.collections.primitives.ShortCollection wrap(java.util.Collection p0){
return CollectionShortCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ShortCollection p0){
return ShortCollectionCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortCollection unmodifiable(it.unimi.dsi.fastutil.shorts.ShortCollection p0){
return ShortCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortCollection synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection p0,java.lang.Object p1){
return ShortCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortCollection synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection p0){
return ShortCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortCollection asCollection(it.unimi.dsi.fastutil.shorts.ShortIterable p0){
return ShortCollections.asCollection(p0);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
return ShortIterators.unwrap(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
return ShortIterators.unwrap(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
return ShortIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
return ShortIterators.pour(p0,p1);
}
}
