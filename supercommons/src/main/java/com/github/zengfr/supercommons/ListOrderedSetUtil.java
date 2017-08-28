package com.zengfr.supercommons;
import org.apache.commons.collections.set.ListOrderedSet;
import org.apache.commons.collections4.set.ListOrderedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListOrderedSetUtil{ 
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0,java.util.List p1){
return ListOrderedSet.decorate(p0,p1);
}
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0){
return ListOrderedSet.decorate(p0);
}
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.List p0){
return ListOrderedSet.decorate(p0);
}
public static <E> org.apache.commons.collections4.set.ListOrderedSet<E> listOrderedSet(java.util.Set<E> p0){
return ListOrderedSet.listOrderedSet(p0);
}
public static <E> org.apache.commons.collections4.set.ListOrderedSet<E> listOrderedSet(java.util.Set<E> p0,java.util.List<E> p1){
return ListOrderedSet.listOrderedSet(p0,p1);
}
public static <E> org.apache.commons.collections4.set.ListOrderedSet<E> listOrderedSet(java.util.List<E> p0){
return ListOrderedSet.listOrderedSet(p0);
}
}
