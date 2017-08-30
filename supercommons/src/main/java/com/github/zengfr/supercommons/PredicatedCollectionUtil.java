package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedCollectionUtil{ 
/**
*public static <T> org.apache.commons.collections4.collection.PredicatedCollection<T> org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(java.util.Collection<T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.collection.PredicatedCollection<T> predicatedCollection(java.util.Collection<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(p0,p1);
}
}
