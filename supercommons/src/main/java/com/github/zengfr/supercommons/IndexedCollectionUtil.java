package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IndexedCollectionUtil{ 
/**
*public static <K,C> org.apache.commons.collections4.collection.IndexedCollection<K, C> org.apache.commons.collections4.collection.IndexedCollection.nonUniqueIndexedCollection(java.util.Collection<C>,org.apache.commons.collections4.Transformer<C, K>)
*/ 
public static <K,C> org.apache.commons.collections4.collection.IndexedCollection<K, C> nonUniqueIndexedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Transformer<C, K> p1){
	return org.apache.commons.collections4.collection.IndexedCollection.nonUniqueIndexedCollection(p0,p1);
}
/**
*public static <K,C> org.apache.commons.collections4.collection.IndexedCollection<K, C> org.apache.commons.collections4.collection.IndexedCollection.uniqueIndexedCollection(java.util.Collection<C>,org.apache.commons.collections4.Transformer<C, K>)
*/ 
public static <K,C> org.apache.commons.collections4.collection.IndexedCollection<K, C> uniqueIndexedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Transformer<C, K> p1){
	return org.apache.commons.collections4.collection.IndexedCollection.uniqueIndexedCollection(p0,p1);
}
}
