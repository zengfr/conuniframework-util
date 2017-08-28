package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ByteCollectionCollection;
import org.apache.commons.collections.primitives.adapters.CollectionByteCollection;
import it.unimi.dsi.fastutil.bytes.ByteCollections;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteCollectionUtil{ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ByteCollection p0){
return ByteCollectionCollection.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteCollection wrap(java.util.Collection p0){
return CollectionByteCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteCollection unmodifiable(it.unimi.dsi.fastutil.bytes.ByteCollection p0){
return ByteCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteCollection synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0,java.lang.Object p1){
return ByteCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteCollection synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0){
return ByteCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteCollection asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable p0){
return ByteCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
return ByteIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
return ByteIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
return ByteIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
return ByteIterators.pour(p0,p1,p2);
}
}
