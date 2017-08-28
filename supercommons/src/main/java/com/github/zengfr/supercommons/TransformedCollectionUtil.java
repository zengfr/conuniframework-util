package com.zengfr.supercommons;
import org.apache.commons.collections4.collection.TransformedCollection;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedCollectionUtil{ 
public static <E> org.apache.commons.collections4.collection.TransformedCollection<E> transformingCollection(java.util.Collection<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedCollection.transformingCollection(p0,p1);
}
public static <E> org.apache.commons.collections4.collection.TransformedCollection<E> transformedCollection(java.util.Collection<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedCollection.transformedCollection(p0,p1);
}
}
