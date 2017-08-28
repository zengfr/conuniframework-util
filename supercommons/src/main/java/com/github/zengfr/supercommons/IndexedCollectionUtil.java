package com.zengfr.supercommons;
import org.apache.commons.collections4.collection.IndexedCollection;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IndexedCollectionUtil{ 
public static <K,C> org.apache.commons.collections4.collection.IndexedCollection<K, C> uniqueIndexedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Transformer<C, K> p1){
return IndexedCollection.uniqueIndexedCollection(p0,p1);
}
public static <K,C> org.apache.commons.collections4.collection.IndexedCollection<K, C> nonUniqueIndexedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Transformer<C, K> p1){
return IndexedCollection.nonUniqueIndexedCollection(p0,p1);
}
}
