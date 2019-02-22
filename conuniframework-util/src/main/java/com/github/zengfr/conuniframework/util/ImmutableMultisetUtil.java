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
public final class ImmutableMultisetUtil{ 
/**
*{@link com.google.common.collect.Multisets#copyHighestCountFirst(com.google.common.collect.Multiset<E>)}
*@see com.google.common.collect.Multisets#copyHighestCountFirst(com.google.common.collect.Multiset<E>)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.Multisets.copyHighestCountFirst(com.google.common.collect.Multiset<E>)
*copyHighestCountFirst(com.google.common.collect.Multiset<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> copyHighestCountFirst(com.google.common.collect.Multiset<E> p0){
	return com.google.common.collect.Multisets.copyHighestCountFirst(p0);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#copyOf(E...)}
*@see com.google.common.collect.ImmutableMultiset#copyOf(E...)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.copyOf(E[])
*copyOf(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableMultiset.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#copyOf(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableMultiset#copyOf(java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.copyOf(java.lang.Iterable<? extends E>)
*copyOf(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableMultiset.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#copyOf(java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableMultiset#copyOf(java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.copyOf(java.util.Iterator<? extends E>)
*copyOf(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.ImmutableMultiset.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of(E,E,E)}
*@see com.google.common.collect.ImmutableMultiset#of(E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of(E,E,E)
*of(E p0,E p1,E p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2){
	return com.google.common.collect.ImmutableMultiset.of(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of()}
*@see com.google.common.collect.ImmutableMultiset#of()
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(){
	return com.google.common.collect.ImmutableMultiset.of();
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of(E)}
*@see com.google.common.collect.ImmutableMultiset#of(E)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of(E)
*of(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0){
	return com.google.common.collect.ImmutableMultiset.of(p0);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of(E,E)}
*@see com.google.common.collect.ImmutableMultiset#of(E,E)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of(E,E)
*of(E p0,E p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1){
	return com.google.common.collect.ImmutableMultiset.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of(E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableMultiset#of(E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of(E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
	return com.google.common.collect.ImmutableMultiset.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of(E,E,E,E,E)}
*@see com.google.common.collect.ImmutableMultiset#of(E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of(E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2,E p3,E p4){
	return com.google.common.collect.ImmutableMultiset.of(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#of(E,E,E,E)}
*@see com.google.common.collect.ImmutableMultiset#of(E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableMultiset<E> com.google.common.collect.ImmutableMultiset.of(E,E,E,E)
*of(E p0,E p1,E p2,E p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2,E p3){
	return com.google.common.collect.ImmutableMultiset.of(p0,p1,p2,p3);
}
}
