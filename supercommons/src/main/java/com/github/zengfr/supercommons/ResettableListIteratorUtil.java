package com.github.zengfr.supercommons;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.iterators.EmptyListIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ResettableListIteratorUtil{ 
public static org.apache.commons.collections.ResettableListIterator emptyListIterator(){
return IteratorUtils.emptyListIterator();
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object[] p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object[] p0){
return IteratorUtils.arrayListIterator(p0);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0){
return IteratorUtils.arrayListIterator(p0);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object[] p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableListIterator loopingListIterator(java.util.List p0){
return IteratorUtils.loopingListIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E... p0){
return IteratorUtils.arrayListIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> loopingListIterator(java.util.List<E> p0){
return IteratorUtils.loopingListIterator(p0);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> resettableEmptyListIterator(){
return EmptyListIterator.resettableEmptyListIterator();
}
}
