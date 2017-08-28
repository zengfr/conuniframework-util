package com.zengfr.supercommons;
import com.google.common.collect.Iterators;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.EnumerationUtils;
import org.apache.commons.collections4.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumerationUtil{ 
public static <T> java.util.Enumeration<T> asEnumeration(java.util.Iterator<T> p0){
return Iterators.asEnumeration(p0);
}
public static void addAll(java.util.Collection p0,java.util.Enumeration p1){
 CollectionUtils.addAll(p0,p1);
}
public static java.util.Enumeration asEnumeration(java.util.Iterator p0){
return IteratorUtils.asEnumeration(p0);
}
public static java.util.Iterator asIterator(java.util.Enumeration p0){
return IteratorUtils.asIterator(p0);
}
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
return IteratorUtils.asIterator(p0,p1);
}
public static java.util.List toList(java.util.Enumeration p0){
return EnumerationUtils.toList(p0);
}
public static <E> java.util.Enumeration<E> asEnumeration(java.util.Iterator<? extends E> p0){
return IteratorUtils.asEnumeration(p0);
}
}
