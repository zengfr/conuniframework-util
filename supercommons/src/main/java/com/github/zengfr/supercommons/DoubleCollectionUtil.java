package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CollectionDoubleCollection;
import org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection;
import it.unimi.dsi.fastutil.doubles.DoubleCollections;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleCollectionUtil{ 
public static org.apache.commons.collections.primitives.DoubleCollection wrap(java.util.Collection p0){
return CollectionDoubleCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.DoubleCollection p0){
return DoubleCollectionCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleCollection unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleCollection p0){
return DoubleCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleCollection synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0,java.lang.Object p1){
return DoubleCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleCollection synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0){
return DoubleCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleCollection asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable p0){
return DoubleCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
return DoubleIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
return DoubleIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
return DoubleIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
return DoubleIterators.pour(p0,p1,p2);
}
}
