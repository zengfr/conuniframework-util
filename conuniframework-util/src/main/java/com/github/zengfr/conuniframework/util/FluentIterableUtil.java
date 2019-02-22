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
public final class FluentIterableUtil{ 
/**
*{@link com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>...)}
*@see com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>...)
*<code>public static <T> com.google.common.collect.FluentIterable<T> com.google.common.collect.FluentIterable.concat(java.lang.Iterable<? extends T>...)
*concat(java.lang.Iterable<? extends T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T>... p0){
	return com.google.common.collect.FluentIterable.concat(p0);
}
/**
*{@link com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>>)}
*@see com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>>)
*<code>public static <T> com.google.common.collect.FluentIterable<T> com.google.common.collect.FluentIterable.concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>>)
*concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0){
	return com.google.common.collect.FluentIterable.concat(p0);
}
/**
*{@link com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)}
*@see com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*<code>public static <T> com.google.common.collect.FluentIterable<T> com.google.common.collect.FluentIterable.concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1){
	return com.google.common.collect.FluentIterable.concat(p0,p1);
}
/**
*{@link com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)}
*@see com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*<code>public static <T> com.google.common.collect.FluentIterable<T> com.google.common.collect.FluentIterable.concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2){
	return com.google.common.collect.FluentIterable.concat(p0,p1,p2);
}
/**
*{@link com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)}
*@see com.google.common.collect.FluentIterable#concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*<code>public static <T> com.google.common.collect.FluentIterable<T> com.google.common.collect.FluentIterable.concat(java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>,java.lang.Iterable<? extends T>)
*concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2,java.lang.Iterable<? extends T> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> p0,java.lang.Iterable<? extends T> p1,java.lang.Iterable<? extends T> p2,java.lang.Iterable<? extends T> p3){
	return com.google.common.collect.FluentIterable.concat(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections4.FluentIterable#empty()}
*@see org.apache.commons.collections4.FluentIterable#empty()
*<code>public static <T> org.apache.commons.collections4.FluentIterable<T> org.apache.commons.collections4.FluentIterable.empty()
*empty()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.FluentIterable<T> empty(){
	return org.apache.commons.collections4.FluentIterable.empty();
}
/**
*{@link com.google.common.collect.FluentIterable#from(com.google.common.collect.FluentIterable<E>)}
*@see com.google.common.collect.FluentIterable#from(com.google.common.collect.FluentIterable<E>)
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.from(com.google.common.collect.FluentIterable<E>)
*from(com.google.common.collect.FluentIterable<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> from(com.google.common.collect.FluentIterable<E> p0){
	return com.google.common.collect.FluentIterable.from(p0);
}
/**
*{@link com.google.common.collect.FluentIterable#from(E...)}
*@see com.google.common.collect.FluentIterable#from(E...)
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.from(E[])
*from(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> from(E... p0){
	return com.google.common.collect.FluentIterable.from(p0);
}
/**
*{@link com.google.common.collect.FluentIterable#from(java.lang.Iterable<E>)}
*@see com.google.common.collect.FluentIterable#from(java.lang.Iterable<E>)
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.from(java.lang.Iterable<E>)
*from(java.lang.Iterable<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> from(java.lang.Iterable<E> p0){
	return com.google.common.collect.FluentIterable.from(p0);
}
/**
*{@link org.apache.commons.collections4.FluentIterable#of(T)}
*@see org.apache.commons.collections4.FluentIterable#of(T)
*<code>public static <T> org.apache.commons.collections4.FluentIterable<T> org.apache.commons.collections4.FluentIterable.of(T)
*of(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.FluentIterable<T> of(T p0){
	return org.apache.commons.collections4.FluentIterable.of(p0);
}
/**
*{@link org.apache.commons.collections4.FluentIterable#of(java.lang.Iterable<T>)}
*@see org.apache.commons.collections4.FluentIterable#of(java.lang.Iterable<T>)
*<code>public static <T> org.apache.commons.collections4.FluentIterable<T> org.apache.commons.collections4.FluentIterable.of(java.lang.Iterable<T>)
*of(java.lang.Iterable<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.FluentIterable<T> of(java.lang.Iterable<T> p0){
	return org.apache.commons.collections4.FluentIterable.of(p0);
}
/**
*{@link org.apache.commons.collections4.FluentIterable#of(T...)}
*@see org.apache.commons.collections4.FluentIterable#of(T...)
*<code>public static <T> org.apache.commons.collections4.FluentIterable<T> org.apache.commons.collections4.FluentIterable.of(T...)
*of(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.FluentIterable<T> of(T... p0){
	return org.apache.commons.collections4.FluentIterable.of(p0);
}
/**
*{@link com.google.common.collect.FluentIterable#of()}
*@see com.google.common.collect.FluentIterable#of()
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> of(){
	return com.google.common.collect.FluentIterable.of();
}
/**
*{@link com.google.common.collect.FluentIterable#of(E,E...)}
*@see com.google.common.collect.FluentIterable#of(E,E...)
*<code>public static <E> com.google.common.collect.FluentIterable<E> com.google.common.collect.FluentIterable.of(E,E...)
*of(E p0,E... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.FluentIterable<E> of(E p0,E... p1){
	return com.google.common.collect.FluentIterable.of(p0,p1);
}
}
