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
public final class ImmutableSortedSetUtil{ 
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(java.util.Iterator<? extends E>)
*copyOf(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Collection<? extends E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Collection<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(java.util.Collection<? extends E>)
*copyOf(java.util.Collection<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Collection<? extends E> p0){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(java.lang.Iterable<? extends E>)
*copyOf(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(E...)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(E...)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(E[])
*copyOf(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)
*copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Comparator<? super E>,java.util.Collection<? extends E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOf(java.util.Comparator<? super E>,java.util.Collection<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOf(java.util.Comparator<? super E>,java.util.Collection<? extends E>)
*copyOf(java.util.Comparator<? super E> p0,java.util.Collection<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> p0,java.util.Collection<? extends E> p1){
	return com.google.common.collect.ImmutableSortedSet.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#copyOfSorted(java.util.SortedSet<E>)}
*@see com.google.common.collect.ImmutableSortedSet#copyOfSorted(java.util.SortedSet<E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.copyOfSorted(java.util.SortedSet<E>)
*copyOfSorted(java.util.SortedSet<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> p0){
	return com.google.common.collect.ImmutableSortedSet.copyOfSorted(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableSortedSet#of(E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E,E,E,E,E)}
*@see com.google.common.collect.ImmutableSortedSet#of(E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3,E p4){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E,E,E,E)}
*@see com.google.common.collect.ImmutableSortedSet#of(E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E,E,E)
*of(E p0,E p1,E p2,E p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2,E p3){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E,E)}
*@see com.google.common.collect.ImmutableSortedSet#of(E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E)
*of(E p0,E p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E)}
*@see com.google.common.collect.ImmutableSortedSet#of(E)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E)
*of(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0){
	return com.google.common.collect.ImmutableSortedSet.of(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of()}
*@see com.google.common.collect.ImmutableSortedSet#of()
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedSet<E> of(){
	return com.google.common.collect.ImmutableSortedSet.of();
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#of(E,E,E)}
*@see com.google.common.collect.ImmutableSortedSet#of(E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedSet<E> com.google.common.collect.ImmutableSortedSet.of(E,E,E)
*of(E p0,E p1,E p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedSet<E> of(E p0,E p1,E p2){
	return com.google.common.collect.ImmutableSortedSet.of(p0,p1,p2);
}
}
