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
public final class ClosureUtil{ 
/**
*{@link org.apache.commons.collections4.ClosureUtils#asClosure(org.apache.commons.collections4.Transformer<? super E, ?>)}
*@see org.apache.commons.collections4.ClosureUtils#asClosure(org.apache.commons.collections4.Transformer<? super E, ?>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.asClosure(org.apache.commons.collections4.Transformer<? super E, ?>)
*asClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> asClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0){
	return org.apache.commons.collections4.ClosureUtils.asClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#asClosure(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.ClosureUtils#asClosure(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.asClosure(org.apache.commons.collections.Transformer)
*asClosure(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure asClosure(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.ClosureUtils.asClosure(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Closure)
*asTransformer(org.apache.commons.collections.Closure p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Closure p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>>)}
*@see org.apache.commons.collections4.ClosureUtils#chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>>)
*chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>> p0){
	return org.apache.commons.collections4.ClosureUtils.chainedClosure(p0);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#chainedClosure(org.apache.commons.collections4.Closure<? super E>...)}
*@see org.apache.commons.collections4.ClosureUtils#chainedClosure(org.apache.commons.collections4.Closure<? super E>...)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.chainedClosure(org.apache.commons.collections4.Closure<? super E>...)
*chainedClosure(org.apache.commons.collections4.Closure<? super E>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> chainedClosure(org.apache.commons.collections4.Closure<? super E>... p0){
	return org.apache.commons.collections4.ClosureUtils.chainedClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#chainedClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.ClosureUtils#chainedClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*chainedClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#chainedClosure(org.apache.commons.collections.Closure...)}
*@see org.apache.commons.collections.ClosureUtils#chainedClosure(org.apache.commons.collections.Closure...)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(org.apache.commons.collections.Closure[])
*chainedClosure(org.apache.commons.collections.Closure... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure... p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#chainedClosure(java.util.Collection)}
*@see org.apache.commons.collections.ClosureUtils#chainedClosure(java.util.Collection)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(java.util.Collection)
*chainedClosure(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure chainedClosure(java.util.Collection p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#doWhileClosure(org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.ClosureUtils#doWhileClosure(org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.doWhileClosure(org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Predicate<? super E>)
*doWhileClosure(org.apache.commons.collections4.Closure<? super E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> doWhileClosure(org.apache.commons.collections4.Closure<? super E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.doWhileClosure(p0,p1);
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
*{@link org.apache.commons.collections4.ClosureUtils#exceptionClosure()}
*@see org.apache.commons.collections4.ClosureUtils#exceptionClosure()
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.exceptionClosure()
*exceptionClosure()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> exceptionClosure(){
	return org.apache.commons.collections4.ClosureUtils.exceptionClosure();
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#forAllDo(java.util.Iterator<T>,C)}
*@see org.apache.commons.collections4.CollectionUtils#forAllDo(java.util.Iterator<T>,C)
*<code>public static <T,C> C org.apache.commons.collections4.CollectionUtils.forAllDo(java.util.Iterator<T>,C)
*forAllDo(java.util.Iterator<T> p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.util.Iterator<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllDo(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#forAllDo(java.lang.Iterable<T>,C)}
*@see org.apache.commons.collections4.CollectionUtils#forAllDo(java.lang.Iterable<T>,C)
*<code>public static <T,C> C org.apache.commons.collections4.CollectionUtils.forAllDo(java.lang.Iterable<T>,C)
*forAllDo(java.lang.Iterable<T> p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.lang.Iterable<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllDo(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#forAllDo(java.util.Collection,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.CollectionUtils#forAllDo(java.util.Collection,org.apache.commons.collections.Closure)
*<code>public static void org.apache.commons.collections.CollectionUtils.forAllDo(java.util.Collection,org.apache.commons.collections.Closure)
*forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
	 org.apache.commons.collections.CollectionUtils.forAllDo(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#forClosure(int,org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.ClosureUtils#forClosure(int,org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.forClosure(int,org.apache.commons.collections4.Closure<? super E>)
*forClosure(int p0,org.apache.commons.collections4.Closure<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> forClosure(int p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.forClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#forClosure(int,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.ClosureUtils#forClosure(int,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.forClosure(int,org.apache.commons.collections.Closure)
*forClosure(int p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure forClosure(int p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.forClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.ForClosure#getInstance(int,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.ForClosure#getInstance(int,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ForClosure.getInstance(int,org.apache.commons.collections.Closure)
*getInstance(int p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(int p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.ForClosure.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.SwitchClosure#getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.SwitchClosure#getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.functors.SwitchClosure#getInstance(java.util.Map)}
*@see org.apache.commons.collections.functors.SwitchClosure#getInstance(java.util.Map)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(java.util.Map)
*getInstance(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(java.util.Map p0){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ChainedClosure#getInstance(org.apache.commons.collections.Closure...)}
*@see org.apache.commons.collections.functors.ChainedClosure#getInstance(org.apache.commons.collections.Closure...)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(org.apache.commons.collections.Closure[])
*getInstance(org.apache.commons.collections.Closure... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure... p0){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ChainedClosure#getInstance(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.ChainedClosure#getInstance(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*getInstance(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.ChainedClosure#getInstance(java.util.Collection)}
*@see org.apache.commons.collections.functors.ChainedClosure#getInstance(java.util.Collection)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(java.util.Collection)
*getInstance(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.TransformerClosure#getInstance(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.functors.TransformerClosure#getInstance(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.TransformerClosure.getInstance(org.apache.commons.collections.Transformer)
*getInstance(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.functors.TransformerClosure.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ClosureTransformer#getInstance(org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.ClosureTransformer#getInstance(org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ClosureTransformer.getInstance(org.apache.commons.collections.Closure)
*getInstance(org.apache.commons.collections.Closure p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Closure p0){
	return org.apache.commons.collections.functors.ClosureTransformer.getInstance(p0);
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
*{@link org.apache.commons.collections.functors.ExceptionClosure#getInstance()}
*@see org.apache.commons.collections.functors.ExceptionClosure#getInstance()
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ExceptionClosure.getInstance()
*getInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(){
	return org.apache.commons.collections.functors.ExceptionClosure.getInstance();
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
*{@link org.apache.commons.collections4.functors.IfClosure#ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.functors.IfClosure#ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.IfClosure.ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)
*ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.functors.IfClosure.ifClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.IfClosure#ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.functors.IfClosure#ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.IfClosure.ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Closure<? super E>)
*ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,org.apache.commons.collections4.Closure<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,org.apache.commons.collections4.Closure<? super E> p2){
	return org.apache.commons.collections4.functors.IfClosure.ifClosure(p0,p1,p2);
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
*{@link org.apache.commons.collections4.ClosureUtils#invokerClosure(java.lang.String,java.lang.Class<?>[],java.lang.Object...)}
*@see org.apache.commons.collections4.ClosureUtils#invokerClosure(java.lang.String,java.lang.Class<?>[],java.lang.Object...)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.invokerClosure(java.lang.String,java.lang.Class<?>[],java.lang.Object[])
*invokerClosure(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> invokerClosure(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2){
	return org.apache.commons.collections4.ClosureUtils.invokerClosure(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#invokerClosure(java.lang.String)}
*@see org.apache.commons.collections4.ClosureUtils#invokerClosure(java.lang.String)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.invokerClosure(java.lang.String)
*invokerClosure(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> invokerClosure(java.lang.String p0){
	return org.apache.commons.collections4.ClosureUtils.invokerClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.ClosureUtils#invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object[])
*invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.ClosureUtils.invokerClosure(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.functors.NOPClosure#nopClosure()}
*@see org.apache.commons.collections4.functors.NOPClosure#nopClosure()
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.NOPClosure.nopClosure()
*nopClosure()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> nopClosure(){
	return org.apache.commons.collections4.functors.NOPClosure.nopClosure();
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>...)}
*@see org.apache.commons.collections4.ClosureUtils#switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>...)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>[])
*switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>... p1){
	return org.apache.commons.collections4.ClosureUtils.switchClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>>)}
*@see org.apache.commons.collections4.ClosureUtils#switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>>)
*switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>> p0){
	return org.apache.commons.collections4.ClosureUtils.switchClosure(p0);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>[],org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.ClosureUtils#switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>[],org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>[],org.apache.commons.collections4.Closure<? super E>)
*switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>[] p1,org.apache.commons.collections4.Closure<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>[] p1,org.apache.commons.collections4.Closure<? super E> p2){
	return org.apache.commons.collections4.ClosureUtils.switchClosure(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.ClosureUtils#switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#switchClosure(java.util.Map)}
*@see org.apache.commons.collections.ClosureUtils#switchClosure(java.util.Map)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(java.util.Map)
*switchClosure(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure switchClosure(java.util.Map p0){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure...)}
*@see org.apache.commons.collections.ClosureUtils#switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure...)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[])
*switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure... p1){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>>)}
*@see org.apache.commons.collections4.ClosureUtils#switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>>)
*switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>> p0){
	return org.apache.commons.collections4.ClosureUtils.switchMapClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#switchMapClosure(java.util.Map)}
*@see org.apache.commons.collections.ClosureUtils#switchMapClosure(java.util.Map)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchMapClosure(java.util.Map)
*switchMapClosure(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure switchMapClosure(java.util.Map p0){
	return org.apache.commons.collections.ClosureUtils.switchMapClosure(p0);
}
/**
*{@link org.apache.commons.collections4.functors.TransformerClosure#transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?>)}
*@see org.apache.commons.collections4.functors.TransformerClosure#transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.TransformerClosure.transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?>)
*transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0){
	return org.apache.commons.collections4.functors.TransformerClosure.transformerClosure(p0);
}
/**
*{@link org.apache.commons.collections4.ClosureUtils#whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)}
*@see org.apache.commons.collections4.ClosureUtils#whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)
*whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.whileClosure(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.WhileClosure#whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)}
*@see org.apache.commons.collections4.functors.WhileClosure#whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.WhileClosure.whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)
*whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2){
	return org.apache.commons.collections4.functors.WhileClosure.whileClosure(p0,p1,p2);
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
