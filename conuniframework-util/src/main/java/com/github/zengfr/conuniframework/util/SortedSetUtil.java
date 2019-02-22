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
public final class SortedSetUtil{ 
/**
*{@link org.apache.commons.collections.set.UnmodifiableSortedSet#decorate(java.util.SortedSet)}
*@see org.apache.commons.collections.set.UnmodifiableSortedSet#decorate(java.util.SortedSet)
*<code>public static java.util.SortedSet org.apache.commons.collections.set.UnmodifiableSortedSet.decorate(java.util.SortedSet)
*decorate(java.util.SortedSet p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0){
	return org.apache.commons.collections.set.UnmodifiableSortedSet.decorate(p0);
}
/**
*{@link org.apache.commons.collections.set.PredicatedSortedSet#decorate(java.util.SortedSet,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.set.PredicatedSortedSet#decorate(java.util.SortedSet,org.apache.commons.collections.Predicate)
*<code>public static java.util.SortedSet org.apache.commons.collections.set.PredicatedSortedSet.decorate(java.util.SortedSet,org.apache.commons.collections.Predicate)
*decorate(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSortedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TypedSortedSet#decorate(java.util.SortedSet,java.lang.Class)}
*@see org.apache.commons.collections.set.TypedSortedSet#decorate(java.util.SortedSet,java.lang.Class)
*<code>public static java.util.SortedSet org.apache.commons.collections.set.TypedSortedSet.decorate(java.util.SortedSet,java.lang.Class)
*decorate(java.util.SortedSet p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,java.lang.Class p1){
	return org.apache.commons.collections.set.TypedSortedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TransformedSortedSet#decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.set.TransformedSortedSet#decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedSet org.apache.commons.collections.set.TransformedSortedSet.decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)
*decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.set.TransformedSortedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#emptySortedSet()}
*@see org.apache.commons.collections4.SetUtils#emptySortedSet()
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.emptySortedSet()
*emptySortedSet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> emptySortedSet(){
	return org.apache.commons.collections4.SetUtils.emptySortedSet();
}
/**
*{@link com.google.common.collect.Sets#filter(java.util.SortedSet<E>,com.google.common.base.Predicate<? super E>)}
*@see com.google.common.collect.Sets#filter(java.util.SortedSet<E>,com.google.common.base.Predicate<? super E>)
*<code>public static <E> java.util.SortedSet<E> com.google.common.collect.Sets.filter(java.util.SortedSet<E>,com.google.common.base.Predicate<? super E>)
*filter(java.util.SortedSet<E> p0,com.google.common.base.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> filter(java.util.SortedSet<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Sets.filter(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#predicatedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.SetUtils#predicatedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.predicatedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*predicatedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> predicatedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.SetUtils.predicatedNavigableSet(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#predicatedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.SetUtils#predicatedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.predicatedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*predicatedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> predicatedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.SetUtils.predicatedSortedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#predicatedSortedSet(java.util.SortedSet,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.SetUtils#predicatedSortedSet(java.util.SortedSet,org.apache.commons.collections.Predicate)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.predicatedSortedSet(java.util.SortedSet,org.apache.commons.collections.Predicate)
*predicatedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet predicatedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSortedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#synchronizedSortedSet(java.util.SortedSet<E>)}
*@see org.apache.commons.collections4.SetUtils#synchronizedSortedSet(java.util.SortedSet<E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.synchronizedSortedSet(java.util.SortedSet<E>)
*synchronizedSortedSet(java.util.SortedSet<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> synchronizedSortedSet(java.util.SortedSet<E> p0){
	return org.apache.commons.collections4.SetUtils.synchronizedSortedSet(p0);
}
/**
*{@link org.apache.commons.collections.SetUtils#synchronizedSortedSet(java.util.SortedSet)}
*@see org.apache.commons.collections.SetUtils#synchronizedSortedSet(java.util.SortedSet)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.synchronizedSortedSet(java.util.SortedSet)
*synchronizedSortedSet(java.util.SortedSet p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet synchronizedSortedSet(java.util.SortedSet p0){
	return org.apache.commons.collections.SetUtils.synchronizedSortedSet(p0);
}
/**
*{@link org.apache.commons.collections4.SetUtils#transformedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.SetUtils#transformedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.transformedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> transformedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.SetUtils.transformedNavigableSet(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#transformedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.SetUtils#transformedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.transformedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> transformedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.SetUtils.transformedSortedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.SetUtils#transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)
*transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.SetUtils.transformedSortedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#typedSortedSet(java.util.SortedSet,java.lang.Class)}
*@see org.apache.commons.collections.SetUtils#typedSortedSet(java.util.SortedSet,java.lang.Class)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.typedSortedSet(java.util.SortedSet,java.lang.Class)
*typedSortedSet(java.util.SortedSet p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet typedSortedSet(java.util.SortedSet p0,java.lang.Class p1){
	return org.apache.commons.collections.SetUtils.typedSortedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#unmodifiableNavigableSet(java.util.NavigableSet<E>)}
*@see org.apache.commons.collections4.SetUtils#unmodifiableNavigableSet(java.util.NavigableSet<E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.SetUtils.unmodifiableNavigableSet(java.util.NavigableSet<E>)
*unmodifiableNavigableSet(java.util.NavigableSet<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> p0){
	return org.apache.commons.collections4.SetUtils.unmodifiableNavigableSet(p0);
}
/**
*{@link org.apache.commons.collections4.set.UnmodifiableSortedSet#unmodifiableSortedSet(java.util.SortedSet<E>)}
*@see org.apache.commons.collections4.set.UnmodifiableSortedSet#unmodifiableSortedSet(java.util.SortedSet<E>)
*<code>public static <E> java.util.SortedSet<E> org.apache.commons.collections4.set.UnmodifiableSortedSet.unmodifiableSortedSet(java.util.SortedSet<E>)
*unmodifiableSortedSet(java.util.SortedSet<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.SortedSet<E> unmodifiableSortedSet(java.util.SortedSet<E> p0){
	return org.apache.commons.collections4.set.UnmodifiableSortedSet.unmodifiableSortedSet(p0);
}
/**
*{@link org.apache.commons.collections.SetUtils#unmodifiableSortedSet(java.util.SortedSet)}
*@see org.apache.commons.collections.SetUtils#unmodifiableSortedSet(java.util.SortedSet)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.unmodifiableSortedSet(java.util.SortedSet)
*unmodifiableSortedSet(java.util.SortedSet p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet unmodifiableSortedSet(java.util.SortedSet p0){
	return org.apache.commons.collections.SetUtils.unmodifiableSortedSet(p0);
}
}
