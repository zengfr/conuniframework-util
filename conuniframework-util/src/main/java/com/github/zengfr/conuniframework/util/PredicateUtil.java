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
public final class PredicateUtil{ 
/**
*{@link org.apache.commons.collections4.functors.AllPredicate#allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)}
*@see org.apache.commons.collections4.functors.AllPredicate#allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AllPredicate.allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.functors.AllPredicate.allPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.functors.AllPredicate#allPredicate(org.apache.commons.collections4.Predicate<? super T>...)}
*@see org.apache.commons.collections4.functors.AllPredicate#allPredicate(org.apache.commons.collections4.Predicate<? super T>...)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AllPredicate.allPredicate(org.apache.commons.collections4.Predicate<? super T>...)
*allPredicate(org.apache.commons.collections4.Predicate<? super T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> allPredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.functors.AllPredicate.allPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#allPredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#allPredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(java.util.Collection)
*allPredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate allPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#allPredicate(org.apache.commons.collections.Predicate...)}
*@see org.apache.commons.collections.PredicateUtils#allPredicate(org.apache.commons.collections.Predicate...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(org.apache.commons.collections.Predicate[])
*allPredicate(org.apache.commons.collections.Predicate... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate allPredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*{@link com.google.common.base.Predicates#alwaysFalse()}
*@see com.google.common.base.Predicates#alwaysFalse()
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.alwaysFalse()
*alwaysFalse()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> alwaysFalse(){
	return com.google.common.base.Predicates.alwaysFalse();
}
/**
*{@link com.google.common.base.Predicates#alwaysTrue()}
*@see com.google.common.base.Predicates#alwaysTrue()
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.alwaysTrue()
*alwaysTrue()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> alwaysTrue(){
	return com.google.common.base.Predicates.alwaysTrue();
}
/**
*{@link com.google.common.base.Predicates#and(com.google.common.base.Predicate<? super T>...)}
*@see com.google.common.base.Predicates#and(com.google.common.base.Predicate<? super T>...)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.and(com.google.common.base.Predicate<? super T>...)
*and(com.google.common.base.Predicate<? super T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>... p0){
	return com.google.common.base.Predicates.and(p0);
}
/**
*{@link com.google.common.base.Predicates#and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)}
*@see com.google.common.base.Predicates#and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)
*and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0){
	return com.google.common.base.Predicates.and(p0);
}
/**
*{@link com.google.common.base.Predicates#and(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.base.Predicates#and(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.and(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)
*and(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.base.Predicates.and(p0,p1);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#andPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#andPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*andPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> andPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.PredicateUtils.andPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#andPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#andPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.andPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*andPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate andPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.andPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)}
*@see org.apache.commons.collections4.PredicateUtils#anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.PredicateUtils.anyPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#anyPredicate(org.apache.commons.collections4.Predicate<? super T>...)}
*@see org.apache.commons.collections4.PredicateUtils#anyPredicate(org.apache.commons.collections4.Predicate<? super T>...)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.anyPredicate(org.apache.commons.collections4.Predicate<? super T>...)
*anyPredicate(org.apache.commons.collections4.Predicate<? super T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> anyPredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.PredicateUtils.anyPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#anyPredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#anyPredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(java.util.Collection)
*anyPredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#anyPredicate(org.apache.commons.collections.Predicate...)}
*@see org.apache.commons.collections.PredicateUtils#anyPredicate(org.apache.commons.collections.Predicate...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(org.apache.commons.collections.Predicate[])
*anyPredicate(org.apache.commons.collections.Predicate... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)}
*@see org.apache.commons.collections4.PredicateUtils#asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)
*asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0){
	return org.apache.commons.collections4.PredicateUtils.asPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#asPredicate(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.PredicateUtils#asPredicate(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.asPredicate(org.apache.commons.collections.Transformer)
*asPredicate(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate asPredicate(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.PredicateUtils.asPredicate(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Predicate)
*asTransformer(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*{@link com.google.common.base.Predicates#assignableFrom(java.lang.Class<?>)}
*@see com.google.common.base.Predicates#assignableFrom(java.lang.Class<?>)
*<code>public static com.google.common.base.Predicate<java.lang.Class<?>> com.google.common.base.Predicates.assignableFrom(java.lang.Class<?>)
*assignableFrom(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.lang.Class<?>> assignableFrom(java.lang.Class<?> p0){
	return com.google.common.base.Predicates.assignableFrom(p0);
}
/**
*{@link org.apache.commons.collections4.functors.ComparatorPredicate#comparatorPredicate(T,java.util.Comparator<T>,org.apache.commons.collections4.functors.ComparatorPredicate$Criterion)}
*@see org.apache.commons.collections4.functors.ComparatorPredicate#comparatorPredicate(T,java.util.Comparator<T>,org.apache.commons.collections4.functors.ComparatorPredicate$Criterion)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T,java.util.Comparator<T>,org.apache.commons.collections4.functors.ComparatorPredicate$Criterion)
*comparatorPredicate(T p0,java.util.Comparator<T> p1,org.apache.commons.collections4.functors.ComparatorPredicate$Criterion p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1,org.apache.commons.collections4.functors.ComparatorPredicate.Criterion p2){
	return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.functors.ComparatorPredicate#comparatorPredicate(T,java.util.Comparator<T>)}
*@see org.apache.commons.collections4.functors.ComparatorPredicate#comparatorPredicate(T,java.util.Comparator<T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T,java.util.Comparator<T>)
*comparatorPredicate(T p0,java.util.Comparator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1){
	return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(p0,p1);
}
/**
*{@link com.google.common.base.Predicates#compose(com.google.common.base.Predicate<B>,com.google.common.base.Function<A, ? extends B>)}
*@see com.google.common.base.Predicates#compose(com.google.common.base.Predicate<B>,com.google.common.base.Function<A, ? extends B>)
*<code>public static <A,B> com.google.common.base.Predicate<A> com.google.common.base.Predicates.compose(com.google.common.base.Predicate<B>,com.google.common.base.Function<A, ? extends B>)
*compose(com.google.common.base.Predicate<B> p0,com.google.common.base.Function<A, ? extends B> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A,B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B> p0,com.google.common.base.Function<A, ? extends B> p1){
	return com.google.common.base.Predicates.compose(p0,p1);
}
/**
*{@link com.google.common.base.Predicates#contains(java.util.regex.Pattern)}
*@see com.google.common.base.Predicates#contains(java.util.regex.Pattern)
*<code>public static com.google.common.base.Predicate<java.lang.CharSequence> com.google.common.base.Predicates.contains(java.util.regex.Pattern)
*contains(java.util.regex.Pattern p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern p0){
	return com.google.common.base.Predicates.contains(p0);
}
/**
*{@link com.google.common.base.Predicates#containsPattern(java.lang.String)}
*@see com.google.common.base.Predicates#containsPattern(java.lang.String)
*<code>public static com.google.common.base.Predicate<java.lang.CharSequence> com.google.common.base.Predicates.containsPattern(java.lang.String)
*containsPattern(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String p0){
	return com.google.common.base.Predicates.containsPattern(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#countMatches(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#countMatches(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static int org.apache.commons.collections.CollectionUtils.countMatches(java.util.Collection,org.apache.commons.collections.Predicate)
*countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.countMatches(p0,p1);
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
*{@link org.apache.commons.collections.collection.PredicatedCollection#decorate(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.collection.PredicatedCollection#decorate(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.collection.PredicatedCollection.decorate(java.util.Collection,org.apache.commons.collections.Predicate)
*decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.collection.PredicatedCollection.decorate(p0,p1);
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
*{@link org.apache.commons.collections.map.PredicatedMap#decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.map.PredicatedMap#decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.Map org.apache.commons.collections.map.PredicatedMap.decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.PredicatedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.map.PredicatedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.PredicatedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedSortedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.list.PredicatedList#decorate(java.util.List,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.list.PredicatedList#decorate(java.util.List,org.apache.commons.collections.Predicate)
*<code>public static java.util.List org.apache.commons.collections.list.PredicatedList.decorate(java.util.List,org.apache.commons.collections.Predicate)
*decorate(java.util.List p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.list.PredicatedList.decorate(p0,p1);
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
*{@link org.apache.commons.collections.set.PredicatedSet#decorate(java.util.Set,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.set.PredicatedSet#decorate(java.util.Set,org.apache.commons.collections.Predicate)
*<code>public static java.util.Set org.apache.commons.collections.set.PredicatedSet.decorate(java.util.Set,org.apache.commons.collections.Predicate)
*decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.PredicatedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.buffer.PredicatedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.PredicatedBuffer.decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.buffer.PredicatedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#doWhileClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.ClosureUtils#doWhileClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.doWhileClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Predicate)
*doWhileClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure doWhileClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.ClosureUtils.doWhileClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#eitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#eitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*eitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> eitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.PredicateUtils.eitherPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#eitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#eitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.eitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*eitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate eitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.eitherPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.EqualPredicate#equalPredicate(T,org.apache.commons.collections4.Equator<T>)}
*@see org.apache.commons.collections4.functors.EqualPredicate#equalPredicate(T,org.apache.commons.collections4.Equator<T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T,org.apache.commons.collections4.Equator<T>)
*equalPredicate(T p0,org.apache.commons.collections4.Equator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0,org.apache.commons.collections4.Equator<T> p1){
	return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.EqualPredicate#equalPredicate(T)}
*@see org.apache.commons.collections4.functors.EqualPredicate#equalPredicate(T)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T)
*equalPredicate(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0){
	return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#equalPredicate(java.lang.Object)}
*@see org.apache.commons.collections.PredicateUtils#equalPredicate(java.lang.Object)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.equalPredicate(java.lang.Object)
*equalPredicate(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate equalPredicate(java.lang.Object p0){
	return org.apache.commons.collections.PredicateUtils.equalPredicate(p0);
}
/**
*{@link com.google.common.base.Predicates#equalTo(T)}
*@see com.google.common.base.Predicates#equalTo(T)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.equalTo(T)
*equalTo(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> equalTo(T p0){
	return com.google.common.base.Predicates.equalTo(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#exceptionPredicate()}
*@see org.apache.commons.collections4.PredicateUtils#exceptionPredicate()
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.exceptionPredicate()
*exceptionPredicate()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> exceptionPredicate(){
	return org.apache.commons.collections4.PredicateUtils.exceptionPredicate();
}
/**
*{@link org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.exists(java.util.Collection,org.apache.commons.collections.Predicate)
*exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.exists(p0,p1);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#falsePredicate()}
*@see org.apache.commons.collections4.PredicateUtils#falsePredicate()
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.falsePredicate()
*falsePredicate()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> falsePredicate(){
	return org.apache.commons.collections4.PredicateUtils.falsePredicate();
}
/**
*{@link org.apache.commons.collections.CollectionUtils#filter(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#filter(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static void org.apache.commons.collections.CollectionUtils.filter(java.util.Collection,org.apache.commons.collections.Predicate)
*filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	 org.apache.commons.collections.CollectionUtils.filter(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.IteratorUtils#filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)
*filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.IteratorUtils#filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)
*filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredListIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.lang.Object org.apache.commons.collections.CollectionUtils.find(java.util.Collection,org.apache.commons.collections.Predicate)
*find(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.find(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.NotNullPredicate#getInstance()}
*@see org.apache.commons.collections.functors.NotNullPredicate#getInstance()
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NotNullPredicate.getInstance()
*getInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(){
	return org.apache.commons.collections.functors.NotNullPredicate.getInstance();
}
/**
*{@link org.apache.commons.collections.functors.NullIsExceptionPredicate#getInstance(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.functors.NullIsExceptionPredicate#getInstance(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NullIsExceptionPredicate.getInstance(org.apache.commons.collections.Predicate)
*getInstance(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.functors.NullIsExceptionPredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.NonePredicate#getInstance(org.apache.commons.collections.Predicate...)}
*@see org.apache.commons.collections.functors.NonePredicate#getInstance(org.apache.commons.collections.Predicate...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(org.apache.commons.collections.Predicate[])
*getInstance(org.apache.commons.collections.Predicate... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.NonePredicate#getInstance(java.util.Collection)}
*@see org.apache.commons.collections.functors.NonePredicate#getInstance(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(java.util.Collection)
*getInstance(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.WhileClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)}
*@see org.apache.commons.collections.functors.WhileClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.WhileClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
	return org.apache.commons.collections.functors.WhileClosure.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.functors.OrPredicate#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.functors.OrPredicate#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.OrPredicate.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.functors.OrPredicate.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.TransformerPredicate#getInstance(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.functors.TransformerPredicate#getInstance(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.TransformerPredicate.getInstance(org.apache.commons.collections.Transformer)
*getInstance(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.functors.TransformerPredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.EqualPredicate#getInstance(java.lang.Object)}
*@see org.apache.commons.collections.functors.EqualPredicate#getInstance(java.lang.Object)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.EqualPredicate.getInstance(java.lang.Object)
*getInstance(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.lang.Object p0){
	return org.apache.commons.collections.functors.EqualPredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.InstanceofPredicate#getInstance(java.lang.Class)}
*@see org.apache.commons.collections.functors.InstanceofPredicate#getInstance(java.lang.Class)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.InstanceofPredicate.getInstance(java.lang.Class)
*getInstance(java.lang.Class p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.lang.Class p0){
	return org.apache.commons.collections.functors.InstanceofPredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.TransformedPredicate#getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.functors.TransformedPredicate#getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.TransformedPredicate.getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.functors.TransformedPredicate.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.IfClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.IfClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.IfClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.IfClosure.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.IfClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.IfClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.IfClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.IfClosure.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#identityPredicate(T)}
*@see org.apache.commons.collections4.PredicateUtils#identityPredicate(T)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.identityPredicate(T)
*identityPredicate(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> identityPredicate(T p0){
	return org.apache.commons.collections4.PredicateUtils.identityPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#identityPredicate(java.lang.Object)}
*@see org.apache.commons.collections.PredicateUtils#identityPredicate(java.lang.Object)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.identityPredicate(java.lang.Object)
*identityPredicate(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate identityPredicate(java.lang.Object p0){
	return org.apache.commons.collections.PredicateUtils.identityPredicate(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.ClosureUtils#ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.ifClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.ClosureUtils#ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.ClosureUtils.ifClosure(p0,p1,p2);
}
/**
*{@link com.google.common.base.Predicates#instanceOf(java.lang.Class<?>)}
*@see com.google.common.base.Predicates#instanceOf(java.lang.Class<?>)
*<code>public static com.google.common.base.Predicate<java.lang.Object> com.google.common.base.Predicates.instanceOf(java.lang.Class<?>)
*instanceOf(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.lang.Object> instanceOf(java.lang.Class<?> p0){
	return com.google.common.base.Predicates.instanceOf(p0);
}
/**
*{@link org.apache.commons.collections4.functors.InstanceofPredicate#instanceOfPredicate(java.lang.Class<?>)}
*@see org.apache.commons.collections4.functors.InstanceofPredicate#instanceOfPredicate(java.lang.Class<?>)
*<code>public static org.apache.commons.collections4.Predicate<java.lang.Object> org.apache.commons.collections4.functors.InstanceofPredicate.instanceOfPredicate(java.lang.Class<?>)
*instanceOfPredicate(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections4.Predicate<java.lang.Object> instanceOfPredicate(java.lang.Class<?> p0){
	return org.apache.commons.collections4.functors.InstanceofPredicate.instanceOfPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#instanceofPredicate(java.lang.Class<?>)}
*@see org.apache.commons.collections4.PredicateUtils#instanceofPredicate(java.lang.Class<?>)
*<code>public static org.apache.commons.collections4.Predicate<java.lang.Object> org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.Class<?>)
*instanceofPredicate(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections4.Predicate<java.lang.Object> instanceofPredicate(java.lang.Class<?> p0){
	return org.apache.commons.collections4.PredicateUtils.instanceofPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#instanceofPredicate(java.lang.Class)}
*@see org.apache.commons.collections.PredicateUtils#instanceofPredicate(java.lang.Class)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.instanceofPredicate(java.lang.Class)
*instanceofPredicate(java.lang.Class p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate instanceofPredicate(java.lang.Class p0){
	return org.apache.commons.collections.PredicateUtils.instanceofPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#invokerPredicate(java.lang.String)}
*@see org.apache.commons.collections4.PredicateUtils#invokerPredicate(java.lang.String)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.invokerPredicate(java.lang.String)
*invokerPredicate(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> invokerPredicate(java.lang.String p0){
	return org.apache.commons.collections4.PredicateUtils.invokerPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#invokerPredicate(java.lang.String,java.lang.Class<?>[],java.lang.Object...)}
*@see org.apache.commons.collections4.PredicateUtils#invokerPredicate(java.lang.String,java.lang.Class<?>[],java.lang.Object...)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.invokerPredicate(java.lang.String,java.lang.Class<?>[],java.lang.Object[])
*invokerPredicate(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> invokerPredicate(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2){
	return org.apache.commons.collections4.PredicateUtils.invokerPredicate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.PredicateUtils#invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object[])
*invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.PredicateUtils.invokerPredicate(p0,p1,p2);
}
/**
*{@link com.google.common.io.Files#isDirectory()}
*@see com.google.common.io.Files#isDirectory()
*<code>public static com.google.common.base.Predicate<java.io.File> com.google.common.io.Files.isDirectory()
*isDirectory()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.io.File> isDirectory(){
	return com.google.common.io.Files.isDirectory();
}
/**
*{@link com.google.common.io.MoreFiles#isDirectory(java.nio.file.LinkOption...)}
*@see com.google.common.io.MoreFiles#isDirectory(java.nio.file.LinkOption...)
*<code>public static com.google.common.base.Predicate<java.nio.file.Path> com.google.common.io.MoreFiles.isDirectory(java.nio.file.LinkOption...)
*isDirectory(java.nio.file.LinkOption... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.nio.file.Path> isDirectory(java.nio.file.LinkOption... p0){
	return com.google.common.io.MoreFiles.isDirectory(p0);
}
/**
*{@link com.google.common.io.Files#isFile()}
*@see com.google.common.io.Files#isFile()
*<code>public static com.google.common.base.Predicate<java.io.File> com.google.common.io.Files.isFile()
*isFile()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.io.File> isFile(){
	return com.google.common.io.Files.isFile();
}
/**
*{@link com.google.common.base.Predicates#isNull()}
*@see com.google.common.base.Predicates#isNull()
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.isNull()
*isNull()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> isNull(){
	return com.google.common.base.Predicates.isNull();
}
/**
*{@link com.google.common.io.MoreFiles#isRegularFile(java.nio.file.LinkOption...)}
*@see com.google.common.io.MoreFiles#isRegularFile(java.nio.file.LinkOption...)
*<code>public static com.google.common.base.Predicate<java.nio.file.Path> com.google.common.io.MoreFiles.isRegularFile(java.nio.file.LinkOption...)
*isRegularFile(java.nio.file.LinkOption... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.nio.file.Path> isRegularFile(java.nio.file.LinkOption... p0){
	return com.google.common.io.MoreFiles.isRegularFile(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#neitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#neitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*neitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> neitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.PredicateUtils.neitherPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#neitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#neitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.neitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*neitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate neitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.neitherPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#nonePredicate(org.apache.commons.collections4.Predicate<? super T>...)}
*@see org.apache.commons.collections4.PredicateUtils#nonePredicate(org.apache.commons.collections4.Predicate<? super T>...)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.nonePredicate(org.apache.commons.collections4.Predicate<? super T>...)
*nonePredicate(org.apache.commons.collections4.Predicate<? super T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nonePredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.PredicateUtils.nonePredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)}
*@see org.apache.commons.collections4.PredicateUtils#nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.PredicateUtils.nonePredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#nonePredicate(org.apache.commons.collections.Predicate...)}
*@see org.apache.commons.collections.PredicateUtils#nonePredicate(org.apache.commons.collections.Predicate...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(org.apache.commons.collections.Predicate[])
*nonePredicate(org.apache.commons.collections.Predicate... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#nonePredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#nonePredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(java.util.Collection)
*nonePredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*{@link com.google.common.base.Predicates#notNull()}
*@see com.google.common.base.Predicates#notNull()
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.notNull()
*notNull()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> notNull(){
	return com.google.common.base.Predicates.notNull();
}
/**
*{@link org.apache.commons.collections4.functors.NotNullPredicate#notNullPredicate()}
*@see org.apache.commons.collections4.functors.NotNullPredicate#notNullPredicate()
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NotNullPredicate.notNullPredicate()
*notNullPredicate()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> notNullPredicate(){
	return org.apache.commons.collections4.functors.NotNullPredicate.notNullPredicate();
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#notPredicate(org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#notPredicate(org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.Predicate<? super T>)
*notPredicate(org.apache.commons.collections4.Predicate<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> notPredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.PredicateUtils.notPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#notPredicate(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#notPredicate(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.notPredicate(org.apache.commons.collections.Predicate)
*notPredicate(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate notPredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.notPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T>)
*nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#nullIsExceptionPredicate(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#nullIsExceptionPredicate(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullIsExceptionPredicate(org.apache.commons.collections.Predicate)
*nullIsExceptionPredicate(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate nullIsExceptionPredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.nullIsExceptionPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T>)
*nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#nullIsFalsePredicate(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#nullIsFalsePredicate(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections.Predicate)
*nullIsFalsePredicate(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate nullIsFalsePredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.nullIsFalsePredicate(p0);
}
/**
*{@link org.apache.commons.collections4.functors.NullIsTruePredicate#nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.functors.NullIsTruePredicate#nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NullIsTruePredicate.nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T>)
*nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.functors.NullIsTruePredicate.nullIsTruePredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#nullIsTruePredicate(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#nullIsTruePredicate(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections.Predicate)
*nullIsTruePredicate(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate nullIsTruePredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.nullIsTruePredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#nullPredicate()}
*@see org.apache.commons.collections4.PredicateUtils#nullPredicate()
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.nullPredicate()
*nullPredicate()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullPredicate(){
	return org.apache.commons.collections4.PredicateUtils.nullPredicate();
}
/**
*{@link org.apache.commons.collections4.functors.OnePredicate#onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)}
*@see org.apache.commons.collections4.functors.OnePredicate#onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.OnePredicate.onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.functors.OnePredicate.onePredicate(p0);
}
/**
*{@link org.apache.commons.collections4.functors.OnePredicate#onePredicate(org.apache.commons.collections4.Predicate<? super T>...)}
*@see org.apache.commons.collections4.functors.OnePredicate#onePredicate(org.apache.commons.collections4.Predicate<? super T>...)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.OnePredicate.onePredicate(org.apache.commons.collections4.Predicate<? super T>...)
*onePredicate(org.apache.commons.collections4.Predicate<? super T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> onePredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.functors.OnePredicate.onePredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#onePredicate(org.apache.commons.collections.Predicate...)}
*@see org.apache.commons.collections.PredicateUtils#onePredicate(org.apache.commons.collections.Predicate...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(org.apache.commons.collections.Predicate[])
*onePredicate(org.apache.commons.collections.Predicate... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate onePredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#onePredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#onePredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(java.util.Collection)
*onePredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate onePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
}
/**
*{@link com.google.common.base.Predicates#or(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.base.Predicates#or(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.or(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)
*or(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.base.Predicates.or(p0,p1);
}
/**
*{@link com.google.common.base.Predicates#or(com.google.common.base.Predicate<? super T>...)}
*@see com.google.common.base.Predicates#or(com.google.common.base.Predicate<? super T>...)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.or(com.google.common.base.Predicate<? super T>...)
*or(com.google.common.base.Predicate<? super T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>... p0){
	return com.google.common.base.Predicates.or(p0);
}
/**
*{@link com.google.common.base.Predicates#or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)}
*@see com.google.common.base.Predicates#or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)
*<code>public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)
*or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0){
	return com.google.common.base.Predicates.or(p0);
}
/**
*{@link org.apache.commons.collections4.functors.OrPredicate#orPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.functors.OrPredicate#orPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.OrPredicate.orPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*orPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> orPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.functors.OrPredicate.orPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#orPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#orPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.orPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*orPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate orPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.orPredicate(p0,p1);
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
*{@link org.apache.commons.collections.BufferUtils#predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.BufferUtils#predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BufferUtils.predicatedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)
*predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.predicatedCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#predicatedList(java.util.List,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.ListUtils#predicatedList(java.util.List,org.apache.commons.collections.Predicate)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.predicatedList(java.util.List,org.apache.commons.collections.Predicate)
*predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.ListUtils.predicatedList(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.MapUtils#predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.SetUtils#predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.SetUtils#predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)
*predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSet(p0,p1);
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
*{@link org.apache.commons.collections.MapUtils#predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.MapUtils#predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedSortedMap(p0,p1,p2);
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
*{@link com.facebook.util.function.ExtPredicate#quiet(com.facebook.util.function.ExtPredicate<T, ?>)}
*@see com.facebook.util.function.ExtPredicate#quiet(com.facebook.util.function.ExtPredicate<T, ?>)
*<code>public static <T> java.util.function.Predicate<T> com.facebook.util.function.ExtPredicate.quiet(com.facebook.util.function.ExtPredicate<T, ?>)
*quiet(com.facebook.util.function.ExtPredicate<T, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.function.Predicate<T> quiet(com.facebook.util.function.ExtPredicate<T, ?> p0){
	return com.facebook.util.function.ExtPredicate.quiet(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.select(java.util.Collection,org.apache.commons.collections.Predicate)
*select(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection select(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.select(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*<code>public static void org.apache.commons.collections.CollectionUtils.select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
	 org.apache.commons.collections.CollectionUtils.select(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*<code>public static void org.apache.commons.collections.CollectionUtils.selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
	 org.apache.commons.collections.CollectionUtils.selectRejected(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)
*selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.selectRejected(p0,p1);
}
/**
*{@link com.google.common.base.Predicates#subtypeOf(java.lang.Class<?>)}
*@see com.google.common.base.Predicates#subtypeOf(java.lang.Class<?>)
*<code>public static com.google.common.base.Predicate<java.lang.Class<?>> com.google.common.base.Predicates.subtypeOf(java.lang.Class<?>)
*subtypeOf(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Predicate<java.lang.Class<?>> subtypeOf(java.lang.Class<?> p0){
	return com.google.common.base.Predicates.subtypeOf(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.PredicateUtils#transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T>,org.apache.commons.collections4.Predicate<? super T>)
*transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.PredicateUtils.transformedPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.transformedPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.TransformerPredicate#transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)}
*@see org.apache.commons.collections4.functors.TransformerPredicate#transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)
*transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0){
	return org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#truePredicate()}
*@see org.apache.commons.collections4.PredicateUtils#truePredicate()
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.truePredicate()
*truePredicate()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> truePredicate(){
	return org.apache.commons.collections4.PredicateUtils.truePredicate();
}
/**
*{@link org.apache.commons.collections4.PredicateUtils#uniquePredicate()}
*@see org.apache.commons.collections4.PredicateUtils#uniquePredicate()
*<code>public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.uniquePredicate()
*uniquePredicate()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> uniquePredicate(){
	return org.apache.commons.collections4.PredicateUtils.uniquePredicate();
}
/**
*{@link org.apache.commons.collections.ClosureUtils#whileClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.ClosureUtils#whileClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.whileClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*whileClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure whileClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.whileClosure(p0,p1);
}
}
