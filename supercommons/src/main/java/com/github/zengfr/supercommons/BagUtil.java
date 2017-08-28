package com.zengfr.supercommons;
import org.apache.commons.collections.BagUtils;
import org.apache.commons.collections.bag.SynchronizedBag;
import org.apache.commons.collections.bag.UnmodifiableBag;
import org.apache.commons.collections.bag.TransformedBag;
import org.apache.commons.collections.bag.PredicatedBag;
import org.apache.commons.collections.bag.TypedBag;
import org.apache.commons.collections4.BagUtils;
import org.apache.commons.collections4.bag.UnmodifiableBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.MultiMapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BagUtil{ 
public static org.apache.commons.collections.Bag unmodifiableBag(org.apache.commons.collections.Bag p0){
return BagUtils.unmodifiableBag(p0);
}
public static org.apache.commons.collections.Bag typedBag(org.apache.commons.collections.Bag p0,java.lang.Class p1){
return BagUtils.typedBag(p0,p1);
}
public static org.apache.commons.collections.Bag synchronizedBag(org.apache.commons.collections.Bag p0){
return BagUtils.synchronizedBag(p0);
}
public static org.apache.commons.collections.Bag predicatedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
return BagUtils.predicatedBag(p0,p1);
}
public static org.apache.commons.collections.Bag transformedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
return BagUtils.transformedBag(p0,p1);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0){
return SynchronizedBag.decorate(p0);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
return TransformedBag.decorate(p0,p1);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
return PredicatedBag.decorate(p0,p1);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,java.lang.Class p1){
return TypedBag.decorate(p0,p1);
}
public static <E> org.apache.commons.collections4.Bag<E> unmodifiableBag(org.apache.commons.collections4.Bag<? extends E> p0){
return BagUtils.unmodifiableBag(p0);
}
public static <E> org.apache.commons.collections4.Bag<E> synchronizedBag(org.apache.commons.collections4.Bag<E> p0){
return BagUtils.synchronizedBag(p0);
}
public static <E> org.apache.commons.collections4.Bag<E> predicatedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return BagUtils.predicatedBag(p0,p1);
}
public static <E> org.apache.commons.collections4.Bag<E> emptyBag(){
return BagUtils.emptyBag();
}
public static <E> org.apache.commons.collections4.Bag<E> transformingBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return BagUtils.transformingBag(p0,p1);
}
public static <E> org.apache.commons.collections4.Bag<E> collectionBag(org.apache.commons.collections4.Bag<E> p0){
return BagUtils.collectionBag(p0);
}
public static <E> org.apache.commons.collections4.Bag<E> transformedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedBag.transformedBag(p0,p1);
}
public static <K,V> org.apache.commons.collections4.Bag<V> getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getValuesAsBag(p0,p1);
}
}
