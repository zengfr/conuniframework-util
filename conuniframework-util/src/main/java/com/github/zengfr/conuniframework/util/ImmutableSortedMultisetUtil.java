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
public final class ImmutableSortedMultisetUtil{ 
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableSortedMultiset#copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.util.Comparator<? super E>,java.util.Iterator<? extends E>)
*copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#copyOf(java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableSortedMultiset#copyOf(java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.util.Iterator<? extends E>)
*copyOf(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#copyOf(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableSortedMultiset#copyOf(java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.lang.Iterable<? extends E>)
*copyOf(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableSortedMultiset#copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#copyOf(E...)}
*@see com.google.common.collect.ImmutableSortedMultiset#copyOf(E...)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOf(E[])
*copyOf(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#copyOfSorted(com.google.common.collect.SortedMultiset<E>)}
*@see com.google.common.collect.ImmutableSortedMultiset#copyOfSorted(com.google.common.collect.SortedMultiset<E>)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.copyOfSorted(com.google.common.collect.SortedMultiset<E>)
*copyOfSorted(com.google.common.collect.SortedMultiset<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSorted(com.google.common.collect.SortedMultiset<E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.copyOfSorted(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of(E,E,E,E,E)}
*@see com.google.common.collect.ImmutableSortedMultiset#of(E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3,E p4){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of(E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableSortedMultiset#of(E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of()}
*@see com.google.common.collect.ImmutableSortedMultiset#of()
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(){
	return com.google.common.collect.ImmutableSortedMultiset.of();
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of(E)}
*@see com.google.common.collect.ImmutableSortedMultiset#of(E)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E)
*of(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of(E,E)}
*@see com.google.common.collect.ImmutableSortedMultiset#of(E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E)
*of(E p0,E p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of(E,E,E,E)}
*@see com.google.common.collect.ImmutableSortedMultiset#of(E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E,E)
*of(E p0,E p1,E p2,E p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2,E p3){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#of(E,E,E)}
*@see com.google.common.collect.ImmutableSortedMultiset#of(E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSortedMultiset<E> com.google.common.collect.ImmutableSortedMultiset.of(E,E,E)
*of(E p0,E p1,E p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableSortedMultiset<E> of(E p0,E p1,E p2){
	return com.google.common.collect.ImmutableSortedMultiset.of(p0,p1,p2);
}
}
