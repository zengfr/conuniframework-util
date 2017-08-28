package com.github.zengfr.supercommons;
import com.google.common.collect.Sets;
import org.apache.commons.collections4.SetUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetViewUtil{ 
public static <E> SetView<E> intersection(java.util.Set<E> p0,java.util.Set<?> p1){
return Sets.intersection(p0,p1);
}
public static <E> SetView<E> union(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
return Sets.union(p0,p1);
}
public static <E> SetView<E> difference(java.util.Set<E> p0,java.util.Set<?> p1){
return Sets.difference(p0,p1);
}
public static <E> SetView<E> symmetricDifference(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
return Sets.symmetricDifference(p0,p1);
}
public static <E> SetView<E> intersection(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
return SetUtils.intersection(p0,p1);
}
public static <E> SetView<E> difference(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
return SetUtils.difference(p0,p1);
}
public static <E> SetView<E> disjunction(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
return SetUtils.disjunction(p0,p1);
}
}
