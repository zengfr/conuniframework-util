package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundedCollectionUtil{ 
/**
*public static org.apache.commons.collections.BoundedCollection org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorateUsing(java.util.Collection)
*/ 
public static org.apache.commons.collections.BoundedCollection decorateUsing(java.util.Collection p0){
	return org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorateUsing(p0);
}
/**
*public static org.apache.commons.collections.BoundedCollection org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorate(org.apache.commons.collections.BoundedCollection)
*/ 
public static org.apache.commons.collections.BoundedCollection decorate(org.apache.commons.collections.BoundedCollection p0){
	return org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorate(p0);
}
/**
*public static <E> org.apache.commons.collections4.BoundedCollection<E> org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection<? extends E>)
*/ 
public static <E> org.apache.commons.collections4.BoundedCollection<E> unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection<? extends E> p0){
	return org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(p0);
}
/**
*public static <E> org.apache.commons.collections4.BoundedCollection<E> org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(java.util.Collection<? extends E>)
*/ 
public static <E> org.apache.commons.collections4.BoundedCollection<E> unmodifiableBoundedCollection(java.util.Collection<? extends E> p0){
	return org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(p0);
}
}
