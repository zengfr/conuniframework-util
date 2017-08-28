package com.github.zengfr.supercommons;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.functors.ForClosure;
import org.apache.commons.collections.functors.SwitchClosure;
import org.apache.commons.collections.functors.ChainedClosure;
import org.apache.commons.collections.functors.TransformerClosure;
import org.apache.commons.collections.functors.ClosureTransformer;
import org.apache.commons.collections.functors.WhileClosure;
import org.apache.commons.collections.functors.ExceptionClosure;
import org.apache.commons.collections.functors.IfClosure;
import org.apache.commons.collections.functors.NOPClosure;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ClosureUtils;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.WhileClosure;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.NOPClosure;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClosureUtil{ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Closure p0){
return TransformerUtils.asTransformer(p0);
}
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
 CollectionUtils.forAllDo(p0,p1);
}
public static org.apache.commons.collections.Closure forClosure(int p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.forClosure(p0,p1);
}
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return ClosureUtils.invokerClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0){
return ClosureUtils.invokerClosure(p0);
}
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure[] p0){
return ClosureUtils.chainedClosure(p0);
}
public static org.apache.commons.collections.Closure chainedClosure(java.util.Collection p0){
return ClosureUtils.chainedClosure(p0);
}
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.chainedClosure(p0,p1);
}
public static org.apache.commons.collections.Closure switchClosure(java.util.Map p0){
return ClosureUtils.switchClosure(p0);
}
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
return ClosureUtils.switchClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1){
return ClosureUtils.switchClosure(p0,p1);
}
public static org.apache.commons.collections.Closure switchMapClosure(java.util.Map p0){
return ClosureUtils.switchMapClosure(p0);
}
public static org.apache.commons.collections.Closure nopClosure(){
return ClosureUtils.nopClosure();
}
public static org.apache.commons.collections.Closure whileClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.whileClosure(p0,p1);
}
public static org.apache.commons.collections.Closure exceptionClosure(){
return ClosureUtils.exceptionClosure();
}
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
return ClosureUtils.ifClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.ifClosure(p0,p1);
}
public static org.apache.commons.collections.Closure asClosure(org.apache.commons.collections.Transformer p0){
return ClosureUtils.asClosure(p0);
}
public static org.apache.commons.collections.Closure doWhileClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Predicate p1){
return ClosureUtils.doWhileClosure(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(int p0,org.apache.commons.collections.Closure p1){
return ForClosure.getInstance(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
return SwitchClosure.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Closure getInstance(java.util.Map p0){
return SwitchClosure.getInstance(p0);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure[] p0){
return ChainedClosure.getInstance(p0);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Closure p1){
return ChainedClosure.getInstance(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(java.util.Collection p0){
return ChainedClosure.getInstance(p0);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Transformer p0){
return TransformerClosure.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Closure p0){
return ClosureTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
return WhileClosure.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Closure getInstance(){
return ExceptionClosure.getInstance();
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
return IfClosure.getInstance(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
return IfClosure.getInstance(p0,p1,p2);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.lang.Iterable<T> p0,C p1){
return CollectionUtils.forAllDo(p0,p1);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > C forAllDo(java.util.Iterator<T> p0,C p1){
return CollectionUtils.forAllDo(p0,p1);
}
public static <E> org.apache.commons.collections4.Closure<E> forClosure(int p0,org.apache.commons.collections4.Closure<? super E> p1){
return ClosureUtils.forClosure(p0,p1);
}
public static <E> org.apache.commons.collections4.Closure<E> invokerClosure(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return ClosureUtils.invokerClosure(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.Closure<E> chainedClosure(org.apache.commons.collections4.Closure<? super E>... p0){
return ClosureUtils.chainedClosure(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> chainedClosure(java.util.Collection<? extends org.apache.commons.collections4.Closure<? super E>> p0){
return ClosureUtils.chainedClosure(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>[] p1){
return ClosureUtils.switchClosure(p0,p1);
}
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(java.util.Map<org.apache.commons.collections4.Predicate<E>, org.apache.commons.collections4.Closure<E>> p0){
return ClosureUtils.switchClosure(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> switchClosure(org.apache.commons.collections4.Predicate<? super E>[] p0,org.apache.commons.collections4.Closure<? super E>[] p1,org.apache.commons.collections4.Closure<? super E> p2){
return ClosureUtils.switchClosure(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.Closure<E> switchMapClosure(java.util.Map<? extends E, org.apache.commons.collections4.Closure<E>> p0){
return ClosureUtils.switchMapClosure(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1){
return ClosureUtils.whileClosure(p0,p1);
}
public static <E> org.apache.commons.collections4.Closure<E> ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1){
return ClosureUtils.ifClosure(p0,p1);
}
public static <E> org.apache.commons.collections4.Closure<E> ifClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,org.apache.commons.collections4.Closure<? super E> p2){
return ClosureUtils.ifClosure(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.Closure<E> asClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0){
return ClosureUtils.asClosure(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> doWhileClosure(org.apache.commons.collections4.Closure<? super E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return ClosureUtils.doWhileClosure(p0,p1);
}
public static <E> org.apache.commons.collections4.Closure<E> transformerClosure(org.apache.commons.collections4.Transformer<? super E, ?> p0){
return TransformerClosure.transformerClosure(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2){
return WhileClosure.whileClosure(p0,p1,p2);
}
}
