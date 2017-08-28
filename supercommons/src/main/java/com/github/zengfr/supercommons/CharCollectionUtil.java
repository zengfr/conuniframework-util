package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CharCollectionCollection;
import org.apache.commons.collections.primitives.adapters.CollectionCharCollection;
import it.unimi.dsi.fastutil.chars.CharCollections;
import it.unimi.dsi.fastutil.chars.CharIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharCollectionUtil{ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.CharCollection p0){
return CharCollectionCollection.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharCollection wrap(java.util.Collection p0){
return CollectionCharCollection.wrap(p0);
}
public static it.unimi.dsi.fastutil.chars.CharCollection unmodifiable(it.unimi.dsi.fastutil.chars.CharCollection p0){
return CharCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharCollection synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0,java.lang.Object p1){
return CharCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharCollection synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0){
return CharCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.CharCollection asCollection(it.unimi.dsi.fastutil.chars.CharIterable p0){
return CharCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
return CharIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
return CharIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
return CharIterators.pour(p0,p1,p2);
}
}
