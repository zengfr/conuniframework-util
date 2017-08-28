package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CollectionFloatCollection;
import org.apache.commons.collections.primitives.adapters.FloatCollectionCollection;
import it.unimi.dsi.fastutil.floats.FloatCollections;
import it.unimi.dsi.fastutil.floats.FloatIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatCollectionUtil{ 
public static org.apache.commons.collections.primitives.FloatCollection wrap(java.util.Collection p0){
return CollectionFloatCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.FloatCollection p0){
return FloatCollectionCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatCollection unmodifiable(it.unimi.dsi.fastutil.floats.FloatCollection p0){
return FloatCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatCollection synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0,java.lang.Object p1){
return FloatCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatCollection synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0){
return FloatCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatCollection asCollection(it.unimi.dsi.fastutil.floats.FloatIterable p0){
return FloatCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
return FloatIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
return FloatIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
return FloatIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
return FloatIterators.pour(p0,p1);
}
}
