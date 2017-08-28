package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CollectionIntCollection;
import org.apache.commons.collections.primitives.adapters.IntCollectionCollection;
import it.unimi.dsi.fastutil.ints.IntCollections;
import it.unimi.dsi.fastutil.ints.IntIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntCollectionUtil{ 
public static org.apache.commons.collections.primitives.IntCollection wrap(java.util.Collection p0){
return CollectionIntCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.IntCollection p0){
return IntCollectionCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.ints.IntCollection unmodifiable(it.unimi.dsi.fastutil.ints.IntCollection p0){
return IntCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntCollection synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0,java.lang.Object p1){
return IntCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntCollection synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0){
return IntCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.IntCollection asCollection(it.unimi.dsi.fastutil.ints.IntIterable p0){
return IntCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
return IntIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
return IntIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
return IntIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
return IntIterators.pour(p0,p1,p2);
}
}
