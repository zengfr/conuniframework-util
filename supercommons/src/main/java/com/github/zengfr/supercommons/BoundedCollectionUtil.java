package com.zengfr.supercommons;
import org.apache.commons.collections.collection.UnmodifiableBoundedCollection;
import org.apache.commons.collections4.collection.UnmodifiableBoundedCollection;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundedCollectionUtil{ 
public static org.apache.commons.collections.BoundedCollection decorate(org.apache.commons.collections.BoundedCollection p0){
return UnmodifiableBoundedCollection.decorate(p0);
}
public static org.apache.commons.collections.BoundedCollection decorateUsing(java.util.Collection p0){
return UnmodifiableBoundedCollection.decorateUsing(p0);
}
public static <E> org.apache.commons.collections4.BoundedCollection<E> unmodifiableBoundedCollection(java.util.Collection<? extends E> p0){
return UnmodifiableBoundedCollection.unmodifiableBoundedCollection(p0);
}
public static <E> org.apache.commons.collections4.BoundedCollection<E> unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection<? extends E> p0){
return UnmodifiableBoundedCollection.unmodifiableBoundedCollection(p0);
}
}
