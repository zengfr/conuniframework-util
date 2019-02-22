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
public final class OptionalUtil{ 
/**
*{@link com.google.common.base.Optional#absent()}
*@see com.google.common.base.Optional#absent()
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.absent()
*absent()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Optional<T> absent(){
	return com.google.common.base.Optional.absent();
}
/**
*{@link com.google.common.collect.Streams#findLast(java.util.stream.Stream<T>)}
*@see com.google.common.collect.Streams#findLast(java.util.stream.Stream<T>)
*<code>public static <T> java.util.Optional<T> com.google.common.collect.Streams.findLast(java.util.stream.Stream<T>)
*findLast(java.util.stream.Stream<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Optional<T> findLast(java.util.stream.Stream<T> p0){
	return com.google.common.collect.Streams.findLast(p0);
}
/**
*{@link com.google.common.base.Optional#fromJavaUtil(java.util.Optional<T>)}
*@see com.google.common.base.Optional#fromJavaUtil(java.util.Optional<T>)
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.fromJavaUtil(java.util.Optional<T>)
*fromJavaUtil(java.util.Optional<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Optional<T> fromJavaUtil(java.util.Optional<T> p0){
	return com.google.common.base.Optional.fromJavaUtil(p0);
}
/**
*{@link com.google.common.base.Optional#fromNullable(T)}
*@see com.google.common.base.Optional#fromNullable(T)
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.fromNullable(T)
*fromNullable(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Optional<T> fromNullable(T p0){
	return com.google.common.base.Optional.fromNullable(p0);
}
/**
*{@link com.google.common.base.Enums#getIfPresent(java.lang.Class<T>,java.lang.String)}
*@see com.google.common.base.Enums#getIfPresent(java.lang.Class<T>,java.lang.String)
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.base.Enums.getIfPresent(java.lang.Class<T>,java.lang.String)
*getIfPresent(java.lang.Class<T> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Enum<T> > com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> p0,java.lang.String p1){
	return com.google.common.base.Enums.getIfPresent(p0,p1);
}
/**
*{@link com.google.common.base.Optional#of(T)}
*@see com.google.common.base.Optional#of(T)
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.of(T)
*of(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Optional<T> of(T p0){
	return com.google.common.base.Optional.of(p0);
}
/**
*{@link com.google.common.base.Optional#toJavaUtil(com.google.common.base.Optional<T>)}
*@see com.google.common.base.Optional#toJavaUtil(com.google.common.base.Optional<T>)
*<code>public static <T> java.util.Optional<T> com.google.common.base.Optional.toJavaUtil(com.google.common.base.Optional<T>)
*toJavaUtil(com.google.common.base.Optional<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Optional<T> toJavaUtil(com.google.common.base.Optional<T> p0){
	return com.google.common.base.Optional.toJavaUtil(p0);
}
/**
*{@link com.google.common.collect.Iterables#tryFind(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterables#tryFind(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.collect.Iterables.tryFind(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*tryFind(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Optional<T> tryFind(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.tryFind(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#tryFind(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterators#tryFind(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> com.google.common.base.Optional<T> com.google.common.collect.Iterators.tryFind(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*tryFind(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Optional<T> tryFind(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.tryFind(p0,p1);
}
}
