package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClosureUtil{ 
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.asClosure(org.apache.commons.collections4.Transformer<? super E, ?>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> asClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0){
	return org.apache.commons.collections4.ClosureUtils.asClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.asClosure(org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Closure asClosure(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.ClosureUtils.asClosure(p0);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Closure p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>> p0){
	return org.apache.commons.collections4.ClosureUtils.chainedClosure(p0);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.chainedClosure(org.apache.commons.collections4.Closure<? super E>...)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> chainedClosure(org.apache.commons.collections4.Closure<? super E>... p0){
	return org.apache.commons.collections4.ClosureUtils.chainedClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(java.util.Collection)
*/ 
public static org.apache.commons.collections.Closure chainedClosure(java.util.Collection p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(org.apache.commons.collections.Closure[])
*/ 
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure... p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.doWhileClosure(org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> doWhileClosure(org.apache.commons.collections4.Closure<? super E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.doWhileClosure(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.doWhileClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Closure doWhileClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.ClosureUtils.doWhileClosure(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.exceptionClosure()
*/ 
public static <E> org.apache.commons.collections4.Closure<E> exceptionClosure(){
	return org.apache.commons.collections4.ClosureUtils.exceptionClosure();
}
/**
*public static <T,C> C org.apache.commons.collections4.CollectionUtils.forAllDo(java.util.Iterator<T>,C)
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.util.Iterator<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllDo(p0,p1);
}
/**
*public static <T,C> C org.apache.commons.collections4.CollectionUtils.forAllDo(java.lang.Iterable<T>,C)
*/ 
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.lang.Iterable<T> p0,C p1){
	return org.apache.commons.collections4.CollectionUtils.forAllDo(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.forAllDo(java.util.Collection,org.apache.commons.collections.Closure)
*/ 
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
	 org.apache.commons.collections.CollectionUtils.forAllDo(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.forClosure(int,org.apache.commons.collections4.Closure<? super E>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> forClosure(int p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.forClosure(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.forClosure(int,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure forClosure(int p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.forClosure(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ForClosure.getInstance(int,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(int p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.ForClosure.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(java.util.Map)
*/ 
public static org.apache.commons.collections.Closure getInstance(java.util.Map p0){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(org.apache.commons.collections.Closure[])
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure... p0){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(java.util.Collection)
*/ 
public static org.apache.commons.collections.Closure getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.TransformerClosure.getInstance(org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.functors.TransformerClosure.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ClosureTransformer.getInstance(org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Closure p0){
	return org.apache.commons.collections.functors.ClosureTransformer.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.WhileClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
	return org.apache.commons.collections.functors.WhileClosure.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ExceptionClosure.getInstance()
*/ 
public static org.apache.commons.collections.Closure getInstance(){
	return org.apache.commons.collections.functors.ExceptionClosure.getInstance();
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.IfClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.IfClosure.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.IfClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.IfClosure.getInstance(p0,p1,p2);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.ifClosure(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,org.apache.commons.collections4.Closure<? super E>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,org.apache.commons.collections4.Closure<? super E> p2){
	return org.apache.commons.collections4.ClosureUtils.ifClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.ClosureUtils.ifClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.ifClosure(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.invokerClosure(java.lang.String,java.lang.Class<?>[],java.lang.Object[])
*/ 
public static <E> org.apache.commons.collections4.Closure<E> invokerClosure(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2){
	return org.apache.commons.collections4.ClosureUtils.invokerClosure(p0,p1,p2);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.invokerClosure(java.lang.String)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> invokerClosure(java.lang.String p0){
	return org.apache.commons.collections4.ClosureUtils.invokerClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.ClosureUtils.invokerClosure(p0,p1,p2);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.nopClosure()
*/ 
public static <E> org.apache.commons.collections4.Closure<E> nopClosure(){
	return org.apache.commons.collections4.ClosureUtils.nopClosure();
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>> p0){
	return org.apache.commons.collections4.ClosureUtils.switchClosure(p0);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>[],org.apache.commons.collections4.Closure<? super E>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>[] p1,org.apache.commons.collections4.Closure<? super E> p2){
	return org.apache.commons.collections4.ClosureUtils.switchClosure(p0,p1,p2);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchClosure(org.apache.commons.collections4.Predicate<? super E>[],org.apache.commons.collections4.Closure<? super E>[])
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>... p1){
	return org.apache.commons.collections4.ClosureUtils.switchClosure(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(java.util.Map)
*/ 
public static org.apache.commons.collections.Closure switchClosure(java.util.Map p0){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[])
*/ 
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure... p1){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>> p0){
	return org.apache.commons.collections4.ClosureUtils.switchMapClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchMapClosure(java.util.Map)
*/ 
public static org.apache.commons.collections.Closure switchMapClosure(java.util.Map p0){
	return org.apache.commons.collections.ClosureUtils.switchMapClosure(p0);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.TransformerClosure.transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0){
	return org.apache.commons.collections4.functors.TransformerClosure.transformerClosure(p0);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1){
	return org.apache.commons.collections4.ClosureUtils.whileClosure(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.WhileClosure.whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)
*/ 
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2){
	return org.apache.commons.collections4.functors.WhileClosure.whileClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.whileClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure whileClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.whileClosure(p0,p1);
}
}
