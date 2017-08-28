package com.zengfr.supercommons;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.iterators.EmptyIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ResettableIteratorUtil{ 
public static org.apache.commons.collections.ResettableIterator emptyIterator(){
return IteratorUtils.emptyIterator();
}
public static org.apache.commons.collections.ResettableIterator singletonIterator(java.lang.Object p0){
return IteratorUtils.singletonIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator loopingIterator(java.util.Collection p0){
return IteratorUtils.loopingIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0){
return IteratorUtils.arrayIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object[] p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object[] p0){
return IteratorUtils.arrayIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object[] p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> singletonIterator(E p0){
return IteratorUtils.singletonIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> loopingIterator(java.util.Collection<? extends E> p0){
return IteratorUtils.loopingIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E... p0){
return IteratorUtils.arrayIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> resettableEmptyIterator(){
return EmptyIterator.resettableEmptyIterator();
}
}
