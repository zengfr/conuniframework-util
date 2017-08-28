package com.github.zengfr.supercommons;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.EnumUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumSetUtil{ 
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> newEnumSet(java.lang.Iterable<E> p0,java.lang.Class<E> p1){
return Sets.newEnumSet(p0,p1);
}
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> complementOf(java.util.Collection<E> p0,java.lang.Class<E> p1){
return Sets.complementOf(p0,p1);
}
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> complementOf(java.util.Collection<E> p0){
return Sets.complementOf(p0);
}
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> processBitVector(java.lang.Class<E> p0,long p1){
return EnumUtils.processBitVector(p0,p1);
}
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> processBitVectors(java.lang.Class<E> p0,long... p1){
return EnumUtils.processBitVectors(p0,p1);
}
}
