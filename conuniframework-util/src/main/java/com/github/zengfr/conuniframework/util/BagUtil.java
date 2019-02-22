package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class BagUtil{ 
/**
*{@link org.apache.commons.collections4.bag.CollectionBag#collectionBag(org.apache.commons.collections4.Bag<E>)}
*@see org.apache.commons.collections4.bag.CollectionBag#collectionBag(org.apache.commons.collections4.Bag<E>)
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.bag.CollectionBag.collectionBag(org.apache.commons.collections4.Bag<E>)
*collectionBag(org.apache.commons.collections4.Bag<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> collectionBag(org.apache.commons.collections4.Bag<E> p0){
	return org.apache.commons.collections4.bag.CollectionBag.collectionBag(p0);
}
/**
*{@link org.apache.commons.collections.bag.SynchronizedBag#decorate(org.apache.commons.collections.Bag)}
*@see org.apache.commons.collections.bag.SynchronizedBag#decorate(org.apache.commons.collections.Bag)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.SynchronizedBag.decorate(org.apache.commons.collections.Bag)
*decorate(org.apache.commons.collections.Bag p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0){
	return org.apache.commons.collections.bag.SynchronizedBag.decorate(p0);
}
/**
*{@link org.apache.commons.collections.bag.TransformedBag#decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.bag.TransformedBag#decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.TransformedBag.decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.bag.TransformedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.bag.PredicatedBag#decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.bag.PredicatedBag#decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.PredicatedBag.decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)
*decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.bag.PredicatedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.bag.TypedBag#decorate(org.apache.commons.collections.Bag,java.lang.Class)}
*@see org.apache.commons.collections.bag.TypedBag#decorate(org.apache.commons.collections.Bag,java.lang.Class)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.TypedBag.decorate(org.apache.commons.collections.Bag,java.lang.Class)
*decorate(org.apache.commons.collections.Bag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,java.lang.Class p1){
	return org.apache.commons.collections.bag.TypedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.BagUtils#emptyBag()}
*@see org.apache.commons.collections4.BagUtils#emptyBag()
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.BagUtils.emptyBag()
*emptyBag()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> emptyBag(){
	return org.apache.commons.collections4.BagUtils.emptyBag();
}
/**
*{@link org.apache.commons.collections4.MultiMapUtils#getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V>,K)}
*@see org.apache.commons.collections4.MultiMapUtils#getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*<code>public static <K,V> org.apache.commons.collections4.Bag<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> org.apache.commons.collections4.Bag<V> getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.BagUtils#predicatedBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.BagUtils#predicatedBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.BagUtils.predicatedBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Predicate<? super E>)
*predicatedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> predicatedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.BagUtils.predicatedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#predicatedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.BagUtils#predicatedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.predicatedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)
*predicatedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag predicatedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BagUtils.predicatedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.BagUtils#synchronizedBag(org.apache.commons.collections4.Bag<E>)}
*@see org.apache.commons.collections4.BagUtils#synchronizedBag(org.apache.commons.collections4.Bag<E>)
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.BagUtils.synchronizedBag(org.apache.commons.collections4.Bag<E>)
*synchronizedBag(org.apache.commons.collections4.Bag<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> synchronizedBag(org.apache.commons.collections4.Bag<E> p0){
	return org.apache.commons.collections4.BagUtils.synchronizedBag(p0);
}
/**
*{@link org.apache.commons.collections.BagUtils#synchronizedBag(org.apache.commons.collections.Bag)}
*@see org.apache.commons.collections.BagUtils#synchronizedBag(org.apache.commons.collections.Bag)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.synchronizedBag(org.apache.commons.collections.Bag)
*synchronizedBag(org.apache.commons.collections.Bag p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag synchronizedBag(org.apache.commons.collections.Bag p0){
	return org.apache.commons.collections.BagUtils.synchronizedBag(p0);
}
/**
*{@link org.apache.commons.collections4.bag.TransformedBag#transformedBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.bag.TransformedBag#transformedBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.bag.TransformedBag.transformedBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> transformedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.bag.TransformedBag.transformedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#transformedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.BagUtils#transformedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.transformedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*transformedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag transformedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BagUtils.transformedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.bag.TransformedBag#transformingBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.bag.TransformedBag#transformingBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.bag.TransformedBag.transformingBag(org.apache.commons.collections4.Bag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformingBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> transformingBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.bag.TransformedBag.transformingBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#typedBag(org.apache.commons.collections.Bag,java.lang.Class)}
*@see org.apache.commons.collections.BagUtils#typedBag(org.apache.commons.collections.Bag,java.lang.Class)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.typedBag(org.apache.commons.collections.Bag,java.lang.Class)
*typedBag(org.apache.commons.collections.Bag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag typedBag(org.apache.commons.collections.Bag p0,java.lang.Class p1){
	return org.apache.commons.collections.BagUtils.typedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.bag.UnmodifiableBag#unmodifiableBag(org.apache.commons.collections4.Bag<? extends E>)}
*@see org.apache.commons.collections4.bag.UnmodifiableBag#unmodifiableBag(org.apache.commons.collections4.Bag<? extends E>)
*<code>public static <E> org.apache.commons.collections4.Bag<E> org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(org.apache.commons.collections4.Bag<? extends E>)
*unmodifiableBag(org.apache.commons.collections4.Bag<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Bag<E> unmodifiableBag(org.apache.commons.collections4.Bag<? extends E> p0){
	return org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(p0);
}
/**
*{@link org.apache.commons.collections.BagUtils#unmodifiableBag(org.apache.commons.collections.Bag)}
*@see org.apache.commons.collections.BagUtils#unmodifiableBag(org.apache.commons.collections.Bag)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.unmodifiableBag(org.apache.commons.collections.Bag)
*unmodifiableBag(org.apache.commons.collections.Bag p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag unmodifiableBag(org.apache.commons.collections.Bag p0){
	return org.apache.commons.collections.BagUtils.unmodifiableBag(p0);
}
}
