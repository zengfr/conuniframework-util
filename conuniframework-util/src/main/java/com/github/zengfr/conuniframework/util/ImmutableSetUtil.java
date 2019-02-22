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
public final class ImmutableSetUtil{ 
/**
*{@link com.google.common.collect.ImmutableSet#copyOf(java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableSet#copyOf(java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.copyOf(java.util.Iterator<? extends E>)
*copyOf(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.ImmutableSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSet#copyOf(java.util.Collection<? extends E>)}
*@see com.google.common.collect.ImmutableSet#copyOf(java.util.Collection<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.copyOf(java.util.Collection<? extends E>)
*copyOf(java.util.Collection<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Collection<? extends E> p0){
	return com.google.common.collect.ImmutableSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSet#copyOf(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableSet#copyOf(java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.copyOf(java.lang.Iterable<? extends E>)
*copyOf(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSet#copyOf(E...)}
*@see com.google.common.collect.ImmutableSet#copyOf(E...)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.copyOf(E[])
*copyOf(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableSet.copyOf(p0);
}
/**
*{@link com.google.common.collect.Sets#immutableEnumSet(java.lang.Iterable<E>)}
*@see com.google.common.collect.Sets#immutableEnumSet(java.lang.Iterable<E>)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.Sets.immutableEnumSet(java.lang.Iterable<E>)
*immutableEnumSet(java.lang.Iterable<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(java.lang.Iterable<E> p0){
	return com.google.common.collect.Sets.immutableEnumSet(p0);
}
/**
*{@link com.google.common.collect.Sets#immutableEnumSet(E,E...)}
*@see com.google.common.collect.Sets#immutableEnumSet(E,E...)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.Sets.immutableEnumSet(E,E...)
*immutableEnumSet(E p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(E p0,E... p1){
	return com.google.common.collect.Sets.immutableEnumSet(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSet#of()}
*@see com.google.common.collect.ImmutableSet#of()
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(){
	return com.google.common.collect.ImmutableSet.of();
}
/**
*{@link com.google.common.collect.ImmutableSet#of(E,E,E,E)}
*@see com.google.common.collect.ImmutableSet#of(E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of(E,E,E,E)
*of(E p0,E p1,E p2,E p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2,E p3){
	return com.google.common.collect.ImmutableSet.of(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.ImmutableSet#of(E,E,E,E,E)}
*@see com.google.common.collect.ImmutableSet#of(E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of(E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2,E p3,E p4){
	return com.google.common.collect.ImmutableSet.of(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.collect.ImmutableSet#of(E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableSet#of(E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of(E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableSet.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link com.google.common.collect.ImmutableSet#of(E,E,E)}
*@see com.google.common.collect.ImmutableSet#of(E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of(E,E,E)
*of(E p0,E p1,E p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2){
	return com.google.common.collect.ImmutableSet.of(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableSet#of(E,E)}
*@see com.google.common.collect.ImmutableSet#of(E,E)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of(E,E)
*of(E p0,E p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1){
	return com.google.common.collect.ImmutableSet.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSet#of(E)}
*@see com.google.common.collect.ImmutableSet#of(E)
*<code>public static <E> com.google.common.collect.ImmutableSet<E> com.google.common.collect.ImmutableSet.of(E)
*of(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0){
	return com.google.common.collect.ImmutableSet.of(p0);
}
}
