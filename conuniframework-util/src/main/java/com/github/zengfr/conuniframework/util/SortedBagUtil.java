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
public final class SortedBagUtil{ 
/**
*{@link org.apache.commons.collections4.bag.CollectionSortedBag#collectionSortedBag(org.apache.commons.collections4.SortedBag<E>)}
*@see org.apache.commons.collections4.bag.CollectionSortedBag#collectionSortedBag(org.apache.commons.collections4.SortedBag<E>)
*<code>public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(org.apache.commons.collections4.SortedBag<E>)
*collectionSortedBag(org.apache.commons.collections4.SortedBag<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> collectionSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
	return org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(p0);
}
/**
*{@link org.apache.commons.collections.bag.TransformedSortedBag#decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.bag.TransformedSortedBag#decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.TransformedSortedBag.decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.bag.TransformedSortedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.bag.SynchronizedSortedBag#decorate(org.apache.commons.collections.SortedBag)}
*@see org.apache.commons.collections.bag.SynchronizedSortedBag#decorate(org.apache.commons.collections.SortedBag)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.SynchronizedSortedBag.decorate(org.apache.commons.collections.SortedBag)
*decorate(org.apache.commons.collections.SortedBag p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0){
	return org.apache.commons.collections.bag.SynchronizedSortedBag.decorate(p0);
}
/**
*{@link org.apache.commons.collections.bag.TypedSortedBag#decorate(org.apache.commons.collections.SortedBag,java.lang.Class)}
*@see org.apache.commons.collections.bag.TypedSortedBag#decorate(org.apache.commons.collections.SortedBag,java.lang.Class)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.TypedSortedBag.decorate(org.apache.commons.collections.SortedBag,java.lang.Class)
*decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
	return org.apache.commons.collections.bag.TypedSortedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.bag.PredicatedSortedBag#decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.bag.PredicatedSortedBag#decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.PredicatedSortedBag.decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.bag.PredicatedSortedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.BagUtils#emptySortedBag()}
*@see org.apache.commons.collections4.BagUtils#emptySortedBag()
*<code>public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.emptySortedBag()
*emptySortedBag()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> emptySortedBag(){
	return org.apache.commons.collections4.BagUtils.emptySortedBag();
}
/**
*{@link org.apache.commons.collections4.BagUtils#predicatedSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.BagUtils#predicatedSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.predicatedSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Predicate<? super E>)
*predicatedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> predicatedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.BagUtils.predicatedSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#predicatedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.BagUtils#predicatedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.predicatedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*predicatedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag predicatedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BagUtils.predicatedSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.BagUtils#synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E>)}
*@see org.apache.commons.collections4.BagUtils#synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E>)
*<code>public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E>)
*synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
	return org.apache.commons.collections4.BagUtils.synchronizedSortedBag(p0);
}
/**
*{@link org.apache.commons.collections.BagUtils#synchronizedSortedBag(org.apache.commons.collections.SortedBag)}
*@see org.apache.commons.collections.BagUtils#synchronizedSortedBag(org.apache.commons.collections.SortedBag)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.synchronizedSortedBag(org.apache.commons.collections.SortedBag)
*synchronizedSortedBag(org.apache.commons.collections.SortedBag p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag synchronizedSortedBag(org.apache.commons.collections.SortedBag p0){
	return org.apache.commons.collections.BagUtils.synchronizedSortedBag(p0);
}
/**
*{@link org.apache.commons.collections.BagUtils#transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.BagUtils#transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BagUtils.transformedSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.BagUtils#transformingSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.BagUtils#transformingSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.transformingSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformingSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> transformingSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.BagUtils.transformingSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)}
*@see org.apache.commons.collections.BagUtils#typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)
*typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
	return org.apache.commons.collections.BagUtils.typedSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections4.bag.UnmodifiableSortedBag#unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E>)}
*@see org.apache.commons.collections4.bag.UnmodifiableSortedBag#unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E>)
*<code>public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E>)
*unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
	return org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(p0);
}
/**
*{@link org.apache.commons.collections.BagUtils#unmodifiableSortedBag(org.apache.commons.collections.SortedBag)}
*@see org.apache.commons.collections.BagUtils#unmodifiableSortedBag(org.apache.commons.collections.SortedBag)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.unmodifiableSortedBag(org.apache.commons.collections.SortedBag)
*unmodifiableSortedBag(org.apache.commons.collections.SortedBag p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag unmodifiableSortedBag(org.apache.commons.collections.SortedBag p0){
	return org.apache.commons.collections.BagUtils.unmodifiableSortedBag(p0);
}
}
